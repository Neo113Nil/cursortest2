package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.ByteArrayOutputStream f6988a = new java.io.ByteArrayOutputStream();
    public final java.lang.Object b = new java.lang.Object();
    public final java.lang.Object c = new java.lang.Object();
    public final net.idrnd.face.iad.capture.internal.a d = new net.idrnd.face.iad.capture.internal.a();

    public final net.idrnd.face.iad.capture.internal.p a(net.idrnd.face.iad.capture.internal.u2 u2Var, net.idrnd.face.iad.capture.internal.f fVar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "");
        if (i > 100 || i < 0) {
            throw new java.lang.IllegalArgumentException("JPEG quality can't be above 100 and below 0");
        }
        return new net.idrnd.face.iad.capture.internal.p(net.idrnd.face.iad.capture.ImageFormat.JPEG, a(u2Var, i, (android.graphics.Rect) null), new android.util.Size(u2Var.b, u2Var.c), fVar, java.lang.System.currentTimeMillis());
    }

    public final byte[] a(net.idrnd.face.iad.capture.internal.u2 u2Var, int i, android.graphics.Rect rect) {
        byte[] byteArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var, "");
        android.graphics.YuvImage d = u2Var.d();
        kotlin.jvm.internal.Intrinsics.checkNotNull(d);
        if (rect == null) {
            rect = new android.graphics.Rect(0, 0, d.getWidth(), d.getHeight());
        }
        synchronized (this.b) {
            this.f6988a.reset();
            if (d.compressToJpeg(rect, i, this.f6988a)) {
                byteArray = this.f6988a.toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
            } else {
                throw new net.idrnd.face.iad.capture.internal.q2("Failed to compress YuvImage to JPEG.");
            }
        }
        return byteArray;
    }

    public final net.idrnd.face.iad.capture.internal.p a(net.idrnd.face.iad.capture.internal.u2 u2Var) {
        byte[] byteArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var, "");
        int i = u2Var.b;
        int i2 = u2Var.c;
        int[] iArr = new int[i * i2];
        net.idrnd.face.iad.capture.NativeImageProcessor.f6950a.convertNv21ToArgb(u2Var.f7009a.f7004a, i, i2, iArr);
        synchronized (this.c) {
            android.graphics.Bitmap a2 = this.d.a(u2Var.b, u2Var.c, android.graphics.Bitmap.Config.ARGB_8888);
            int i3 = u2Var.b;
            a2.setPixels(iArr, 0, i3, 0, 0, i3, u2Var.c);
            synchronized (this.b) {
                this.f6988a.reset();
                a2.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, this.f6988a);
                net.idrnd.face.iad.capture.internal.a aVar = this.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
                aVar.f6953a.add(a2);
                byteArray = this.f6988a.toByteArray();
            }
        }
        net.idrnd.face.iad.capture.ImageFormat imageFormat = net.idrnd.face.iad.capture.ImageFormat.PNG;
        kotlin.jvm.internal.Intrinsics.checkNotNull(byteArray);
        return new net.idrnd.face.iad.capture.internal.p(imageFormat, byteArray, new android.util.Size(u2Var.b, u2Var.c), u2Var.d, java.lang.System.currentTimeMillis());
    }
}
