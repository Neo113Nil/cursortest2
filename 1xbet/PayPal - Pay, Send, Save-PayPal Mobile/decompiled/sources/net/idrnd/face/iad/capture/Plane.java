package net.idrnd.face.iad.capture;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lnet/idrnd/face/iad/capture/Plane;", "", "", "rowStride", "pixelStride", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(IILjava/nio/ByteBuffer;)V", "a", com.visa.cbp.getEncExpo.warmup, "getRowStride", "()I", util.h.xy.cb.b.f1091, "getPixelStride", "c", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class Plane {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int rowStride;

    /* renamed from: b, reason: from kotlin metadata */
    public final int pixelStride;

    /* renamed from: c, reason: from kotlin metadata */
    public final java.nio.ByteBuffer buffer;

    public Plane(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        this.rowStride = i;
        this.pixelStride = i2;
        this.buffer = byteBuffer;
    }

    public final java.nio.ByteBuffer getBuffer() {
        return this.buffer;
    }

    public final int getPixelStride() {
        return this.pixelStride;
    }

    public final int getRowStride() {
        return this.rowStride;
    }
}
