package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u000b*\u00020\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "<init>", "()V", "", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "bitmapConfig", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroid/graphics/Bitmap;", "createBitmap-x__-hDU$ui_graphics", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "createBitmap", "composeColorSpace$ui_graphics", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api26Bitmap {
    public static final int $stable = 0;
    public static final androidx.compose.ui.graphics.Api26Bitmap INSTANCE = new androidx.compose.ui.graphics.Api26Bitmap();

    private Api26Bitmap() {
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace$ui_graphics(android.graphics.Bitmap bitmap) {
        androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace;
        android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (composeColorSpace = androidx.compose.ui.graphics.AndroidColorSpace_androidKt.toComposeColorSpace(colorSpace)) == null) ? androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb() : composeColorSpace;
    }
}
