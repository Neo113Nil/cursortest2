package net.idrnd.face.iad.capture;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B?\b\u0010\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u0006&"}, d2 = {"Lnet/idrnd/face/iad/capture/Image;", "Ljava/lang/AutoCloseable;", "", "close", "()V", "", "Lnet/idrnd/face/iad/capture/Plane;", "a", "Ljava/util/List;", "getPlanes", "()Ljava/util/List;", "planes", "Lnet/idrnd/face/iad/capture/ImageFormat;", util.h.xy.cb.b.f1091, "Lnet/idrnd/face/iad/capture/ImageFormat;", "getFormat", "()Lnet/idrnd/capture/ImageFormat;", "format", "", "c", com.visa.cbp.getEncExpo.warmup, "getHeight", "()I", "height", "d", "getWidth", "width", "", "e", "J", "getTimestamp$iad_2_4_3_misnap", "()J", "timestamp", "f", "getRotationDegrees$iad_2_4_3_misnap", "rotationDegrees", "<init>", "(Ljava/util/List;Lnet/idrnd/capture/ImageFormat;IIJI)V", "iad-2.4.3_misnap"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class Image implements java.lang.AutoCloseable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final java.util.List planes;

    /* renamed from: b, reason: from kotlin metadata */
    public final net.idrnd.face.iad.capture.ImageFormat format;

    /* renamed from: c, reason: from kotlin metadata */
    public final int height;

    /* renamed from: d, reason: from kotlin metadata */
    public final int width;

    /* renamed from: e, reason: from kotlin metadata */
    public final long timestamp;

    /* renamed from: f, reason: from kotlin metadata */
    public final int rotationDegrees;

    public Image(java.util.List<net.idrnd.face.iad.capture.Plane> list, net.idrnd.face.iad.capture.ImageFormat imageFormat, int i, int i2, long j, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageFormat, "");
        this.planes = list;
        this.format = imageFormat;
        this.height = i;
        this.width = i2;
        this.timestamp = j;
        this.rotationDegrees = i3;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final net.idrnd.face.iad.capture.ImageFormat getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    public final java.util.List<net.idrnd.face.iad.capture.Plane> getPlanes() {
        return this.planes;
    }

    /* renamed from: getRotationDegrees$iad_2_4_3_misnap, reason: from getter */
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    /* renamed from: getTimestamp$iad_2_4_3_misnap, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getWidth() {
        return this.width;
    }
}
