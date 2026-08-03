package okhttp3;

/* compiled from: Cache.kt */
@kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\u0004H\u0096\u0002J\t\u0010\n\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"okhttp3/Cache$urls$1", "", "", "canRemove", "", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "nextUrl", "hasNext", io.ktor.http.LinkHeader.Rel.Next, "remove", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Cache$urls$1 implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMutableIterator {
    private boolean canRemove;
    private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> delegate;
    private java.lang.String nextUrl;

    Cache$urls$1(okhttp3.Cache cache) {
        this.delegate = cache.getCache().snapshots();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextUrl != null) {
            return true;
        }
        this.canRemove = false;
        while (this.delegate.hasNext()) {
            try {
                okhttp3.internal.cache.DiskLruCache.Snapshot next = this.delegate.next();
                try {
                    continue;
                    this.nextUrl = okio.Okio.buffer(next.getSource(0)).readUtf8LineStrict();
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
    public java.lang.String next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.nextUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        this.nextUrl = null;
        this.canRemove = true;
        return str;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            throw new java.lang.IllegalStateException("remove() before next()".toString());
        }
        this.delegate.remove();
    }
}
