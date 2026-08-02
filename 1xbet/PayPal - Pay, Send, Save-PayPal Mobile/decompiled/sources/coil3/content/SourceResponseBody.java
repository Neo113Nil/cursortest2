package coil3.content;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0004\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0004\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0018\u0092\u0001\u00020\u0002"}, d2 = {"Lcoil3/network/SourceResponseBody;", "Lcoil3/network/NetworkResponseBody;", "Lokio/BufferedSource;", "p0", "Camera2StreamConfigurationMap", "(Lokio/BufferedSource;)Lokio/BufferedSource;", "Lokio/FileSystem;", "Lokio/Path;", "p1", "", "(Lokio/BufferedSource;Lokio/FileSystem;Lokio/Path;)Ljava/lang/Object;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lokio/BufferedSource;", "getHighSpeedVideoSizes", "source"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes7.dex */
final class SourceResponseBody implements coil3.content.NetworkResponseBody {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okio.BufferedSource getHighSpeedVideoSizes;

    public static okio.BufferedSource Camera2StreamConfigurationMap(okio.BufferedSource bufferedSource) {
        return bufferedSource;
    }

    private /* synthetic */ SourceResponseBody(okio.BufferedSource bufferedSource) {
        this.getHighSpeedVideoSizes = bufferedSource;
    }

    @Override // coil3.content.NetworkResponseBody
    public final java.lang.Object writeTo(okio.BufferedSink bufferedSink, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighSpeedVideoSizes.readAll(bufferedSink);
        return kotlin.Unit.INSTANCE;
    }

    @Override // coil3.content.NetworkResponseBody
    public final java.lang.Object writeTo(okio.FileSystem fileSystem, okio.Path path, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, fileSystem, path);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoSizes.close();
    }

    private static java.lang.Object Camera2StreamConfigurationMap(okio.BufferedSource bufferedSource, okio.FileSystem fileSystem, okio.Path path) {
        okio.BufferedSink buffer = okio.Okio.buffer(fileSystem.sink(path, false));
        try {
            kotlin.coroutines.jvm.internal.Boxing.boxLong(bufferedSource.readAll(buffer));
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (java.lang.Throwable th) {
                    th = th;
                }
            }
            th = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (java.lang.Throwable th3) {
                    kotlin.ExceptionsKt.addSuppressed(th, th3);
                }
            }
        }
        if (th == null) {
            return kotlin.Unit.INSTANCE;
        }
        throw th;
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof coil3.content.SourceResponseBody) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((coil3.content.SourceResponseBody) p0).getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public final java.lang.String toString() {
        okio.BufferedSource bufferedSource = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SourceResponseBody(getHighSpeedVideoSizes=");
        sb.append(bufferedSource);
        sb.append(")");
        return sb.toString();
    }

    public static final /* synthetic */ coil3.content.SourceResponseBody getHighSpeedVideoFpsRangesFor(okio.BufferedSource bufferedSource) {
        return new coil3.content.SourceResponseBody(bufferedSource);
    }
}
