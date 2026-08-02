package okhttp3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bR\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lokhttp3/Cache$urls$1;", "", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/String;", "", "remove", "()V", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "getHighSpeedVideoSizes", "Ljava/util/Iterator;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cache$urls$1 implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMutableIterator {
    private java.lang.String Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> getHighSpeedVideoSizes;

    Cache$urls$1(okhttp3.Cache cache) {
        this.getHighSpeedVideoSizes = cache.getCache().snapshots();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.Camera2StreamConfigurationMap != null) {
            return true;
        }
        this.getHighSpeedVideoFpsRanges = false;
        while (this.getHighSpeedVideoSizes.hasNext()) {
            try {
                okhttp3.internal.cache.DiskLruCache.Snapshot next = this.getHighSpeedVideoSizes.next();
                try {
                    continue;
                    this.Camera2StreamConfigurationMap = okio.Okio.buffer(next.getSource(0)).readUtf8LineStrict();
                    kotlin.io.CloseableKt.closeFinally(next, null);
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (java.lang.Throwable th) {
                    }
                }
            } catch (java.io.IOException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.String next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = true;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("remove() before next()".toString());
        }
        this.getHighSpeedVideoSizes.remove();
    }
}
