package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class a implements java.lang.AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f6953a = new java.util.ArrayList();

    public final android.graphics.Bitmap a(int i, int i2, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap bitmap;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        java.util.Iterator it = this.f6953a.iterator();
        while (true) {
            bitmap = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj;
            if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2 && bitmap2.getConfig() == config) {
                break;
            }
        }
        android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) obj;
        if (bitmap3 != null) {
            this.f6953a.remove(bitmap3);
            bitmap = bitmap3;
        }
        if (bitmap != null) {
            return bitmap;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, config);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
        return createBitmap;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        java.util.Iterator it = this.f6953a.iterator();
        while (it.hasNext()) {
            ((android.graphics.Bitmap) it.next()).recycle();
        }
        this.f6953a.clear();
    }
}
