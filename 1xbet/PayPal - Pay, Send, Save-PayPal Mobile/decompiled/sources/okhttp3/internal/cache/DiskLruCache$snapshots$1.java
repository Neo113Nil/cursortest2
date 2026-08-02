package okhttp3.internal.cache;

@kotlin.Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\r\u0010\f\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R.\u0010\u0004\u001a\"\u0012\u001e\u0012\u001c \u0007*\r\u0018\u00010\u0005R\u00020\u0003¢\u0006\u0002\b\u00060\u0005R\u00020\u0003¢\u0006\u0002\b\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "nextSnapshot", "removeSnapshot", "hasNext", "", io.ktor.http.LinkHeader.Rel.Next, "remove", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiskLruCache$snapshots$1 implements java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot>, kotlin.jvm.internal.markers.KMutableIterator {
    private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> Camera2StreamConfigurationMap;
    private okhttp3.internal.cache.DiskLruCache.Snapshot getHighResolutionOutputSizeshNQ4ISI;
    private okhttp3.internal.cache.DiskLruCache.Snapshot getHighSpeedVideoFpsRanges;
    final /* synthetic */ okhttp3.internal.cache.DiskLruCache getHighSpeedVideoFpsRangesFor;

    DiskLruCache$snapshots$1(okhttp3.internal.cache.DiskLruCache diskLruCache) {
        this.getHighSpeedVideoFpsRangesFor = diskLruCache;
        java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> it = new java.util.ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        this.Camera2StreamConfigurationMap = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        okhttp3.internal.cache.DiskLruCache.Snapshot snapshot$okhttp;
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            return true;
        }
        okhttp3.internal.cache.DiskLruCache diskLruCache = this.getHighSpeedVideoFpsRangesFor;
        synchronized (diskLruCache) {
            if (diskLruCache.getClosed()) {
                return false;
            }
            while (this.Camera2StreamConfigurationMap.hasNext()) {
                okhttp3.internal.cache.DiskLruCache.Entry next = this.Camera2StreamConfigurationMap.next();
                if (next != null && (snapshot$okhttp = next.snapshot$okhttp()) != null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = snapshot$okhttp;
                    return true;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final okhttp3.internal.cache.DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        okhttp3.internal.cache.DiskLruCache.Snapshot snapshot = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = snapshot;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(snapshot);
        return snapshot;
    }

    @Override // java.util.Iterator
    public final void remove() {
        okhttp3.internal.cache.DiskLruCache.Snapshot snapshot = this.getHighSpeedVideoFpsRanges;
        if (snapshot == null) {
            throw new java.lang.IllegalStateException("remove() before next()".toString());
        }
        try {
            this.getHighSpeedVideoFpsRangesFor.remove(snapshot.getCamera2StreamConfigurationMap());
        } catch (java.io.IOException unused) {
        } finally {
            this.getHighSpeedVideoFpsRanges = null;
        }
    }
}
