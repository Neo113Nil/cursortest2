package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class CachedRegionTracker implements com.google.android.exoplayer2.upstream.cache.Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final java.lang.String TAG = "CachedRegionTracker";
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;
    private final java.lang.String cacheKey;
    private final com.google.android.exoplayer2.extractor.ChunkIndex chunkIndex;
    private final java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker.Region> regions = new java.util.TreeSet<>();
    private final com.google.android.exoplayer2.upstream.CachedRegionTracker.Region lookupRegion = new com.google.android.exoplayer2.upstream.CachedRegionTracker.Region(0, 0);

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(com.google.android.exoplayer2.upstream.cache.Cache cache, com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan, com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan2) {
    }

    public CachedRegionTracker(com.google.android.exoplayer2.upstream.cache.Cache cache, java.lang.String str, com.google.android.exoplayer2.extractor.ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            java.util.Iterator<com.google.android.exoplayer2.upstream.cache.CacheSpan> descendingIterator = cache.addListener(str, this).descendingIterator();
            while (descendingIterator.hasNext()) {
                mergeSpan(descendingIterator.next());
            }
        }
    }

    public void release() {
        this.cache.removeListener(this.cacheKey, this);
    }

    public synchronized int getRegionEndTimeMs(long j) {
        this.lookupRegion.startOffset = j;
        com.google.android.exoplayer2.upstream.CachedRegionTracker.Region floor = this.regions.floor(this.lookupRegion);
        if (floor != null && j <= floor.endOffset && floor.endOffsetIndex != -1) {
            int i = floor.endOffsetIndex;
            if (i == this.chunkIndex.length - 1) {
                if (floor.endOffset == this.chunkIndex.offsets[i] + this.chunkIndex.sizes[i]) {
                    return -2;
                }
            }
            return (int) ((this.chunkIndex.timesUs[i] + ((this.chunkIndex.durationsUs[i] * (floor.endOffset - this.chunkIndex.offsets[i])) / this.chunkIndex.sizes[i])) / 1000);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanAdded(com.google.android.exoplayer2.upstream.cache.Cache cache, com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanRemoved(com.google.android.exoplayer2.upstream.cache.Cache cache, com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan) {
        com.google.android.exoplayer2.upstream.CachedRegionTracker.Region region = new com.google.android.exoplayer2.upstream.CachedRegionTracker.Region(cacheSpan.position, cacheSpan.position + cacheSpan.length);
        com.google.android.exoplayer2.upstream.CachedRegionTracker.Region floor = this.regions.floor(region);
        if (floor == null) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(floor);
        if (floor.startOffset < region.startOffset) {
            com.google.android.exoplayer2.upstream.CachedRegionTracker.Region region2 = new com.google.android.exoplayer2.upstream.CachedRegionTracker.Region(floor.startOffset, region.startOffset);
            int binarySearch = java.util.Arrays.binarySearch(this.chunkIndex.offsets, region2.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            region2.endOffsetIndex = binarySearch;
            this.regions.add(region2);
        }
        if (floor.endOffset > region.endOffset) {
            com.google.android.exoplayer2.upstream.CachedRegionTracker.Region region3 = new com.google.android.exoplayer2.upstream.CachedRegionTracker.Region(region.endOffset + 1, floor.endOffset);
            region3.endOffsetIndex = floor.endOffsetIndex;
            this.regions.add(region3);
        }
    }

    private void mergeSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan) {
        com.google.android.exoplayer2.upstream.CachedRegionTracker.Region region = new com.google.android.exoplayer2.upstream.CachedRegionTracker.Region(cacheSpan.position, cacheSpan.position + cacheSpan.length);
        com.google.android.exoplayer2.upstream.CachedRegionTracker.Region floor = this.regions.floor(region);
        com.google.android.exoplayer2.upstream.CachedRegionTracker.Region ceiling = this.regions.ceiling(region);
        boolean regionsConnect = regionsConnect(floor, region);
        if (regionsConnect(region, ceiling)) {
            if (regionsConnect) {
                floor.endOffset = ceiling.endOffset;
                floor.endOffsetIndex = ceiling.endOffsetIndex;
            } else {
                region.endOffset = ceiling.endOffset;
                region.endOffsetIndex = ceiling.endOffsetIndex;
                this.regions.add(region);
            }
            this.regions.remove(ceiling);
            return;
        }
        if (regionsConnect) {
            floor.endOffset = region.endOffset;
            int i = floor.endOffsetIndex;
            while (i < this.chunkIndex.length - 1) {
                int i2 = i + 1;
                if (this.chunkIndex.offsets[i2] > floor.endOffset) {
                    break;
                } else {
                    i = i2;
                }
            }
            floor.endOffsetIndex = i;
            return;
        }
        int binarySearch = java.util.Arrays.binarySearch(this.chunkIndex.offsets, region.endOffset);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        region.endOffsetIndex = binarySearch;
        this.regions.add(region);
    }

    private boolean regionsConnect(com.google.android.exoplayer2.upstream.CachedRegionTracker.Region region, com.google.android.exoplayer2.upstream.CachedRegionTracker.Region region2) {
        return (region == null || region2 == null || region.endOffset != region2.startOffset) ? false : true;
    }

    private static class Region implements java.lang.Comparable<com.google.android.exoplayer2.upstream.CachedRegionTracker.Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j, long j2) {
            this.startOffset = j;
            this.endOffset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.android.exoplayer2.upstream.CachedRegionTracker.Region region) {
            return com.google.android.exoplayer2.util.Util.compareLong(this.startOffset, region.startOffset);
        }
    }
}
