package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/media/Image;", "Landroid/graphics/Bitmap;", "getHighSpeedVideoFpsRanges", "(Landroid/media/Image;)Landroid/graphics/Bitmap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayerSnapshot_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Bitmap getHighSpeedVideoFpsRanges(android.media.Image image) {
        android.media.Image.Plane[] planes = image.getPlanes();
        kotlin.jvm.internal.Intrinsics.checkNotNull(planes);
        android.media.Image.Plane plane = planes[0];
        int width = image.getWidth() * image.getHeight();
        int[] iArr = new int[width];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < width; i++) {
            int i2 = iArr[i];
            iArr[i] = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(androidx.compose.ui.graphics.ColorKt.Color(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return android.graphics.Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
    }
}
