package androidx.media3.exoplayer.upstream;

/* loaded from: classes2.dex */
public final class CachedRegionTracker implements androidx.media3.datasource.cache.Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final java.lang.String TAG = "CachedRegionTracker";
    private final androidx.media3.datasource.cache.Cache cache;
    private final java.lang.String cacheKey;
    private final androidx.media3.extractor.ChunkIndex chunkIndex;
    private final java.util.TreeSet<androidx.media3.exoplayer.upstream.CachedRegionTracker.Region> regions = new java.util.TreeSet<>();
    private final androidx.media3.exoplayer.upstream.CachedRegionTracker.Region lookupRegion = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(0, 0);

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2) {
    }

    public CachedRegionTracker(androidx.media3.datasource.cache.Cache cache, java.lang.String str, androidx.media3.extractor.ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            java.util.Iterator<androidx.media3.datasource.cache.CacheSpan> descendingIterator = cache.addListener(str, this).descendingIterator();
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
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region floor = this.regions.floor(this.lookupRegion);
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

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanAdded(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanRemoved(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(cacheSpan.position, cacheSpan.position + cacheSpan.length);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region floor = this.regions.floor(region);
        if (floor == null) {
            androidx.media3.common.util.Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(floor);
        if (floor.startOffset < region.startOffset) {
            androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region2 = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(floor.startOffset, region.startOffset);
            int binarySearch = java.util.Arrays.binarySearch(this.chunkIndex.offsets, region2.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            region2.endOffsetIndex = binarySearch;
            this.regions.add(region2);
        }
        if (floor.endOffset > region.endOffset) {
            androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region3 = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(region.endOffset + 1, floor.endOffset);
            region3.endOffsetIndex = floor.endOffsetIndex;
            this.regions.add(region3);
        }
    }

    private void mergeSpan(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(cacheSpan.position, cacheSpan.position + cacheSpan.length);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region floor = this.regions.floor(region);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region ceiling = this.regions.ceiling(region);
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

    private boolean regionsConnect(androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region, androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region2) {
        return (region == null || region2 == null || region.endOffset != region2.startOffset) ? false : true;
    }

    private static class Region implements java.lang.Comparable<androidx.media3.exoplayer.upstream.CachedRegionTracker.Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j, long j2) {
            this.startOffset = j;
            this.endOffset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region) {
            return androidx.media3.common.util.Util.compareLong(this.startOffset, region.startOffset);
        }
    }
}
