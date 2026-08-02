package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010 \u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/ui/graphics/AndroidImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "", "readPixels", "([IIIIIII)V", "prepareToDraw", "()V", "Landroid/graphics/Bitmap;", "getBitmap$ui_graphics", "()Landroid/graphics/Bitmap;", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "config", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "", "getHasAlpha", "()Z", "hasAlpha"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidImageBitmap implements androidx.compose.ui.graphics.ImageBitmap {
    public static final int $stable = 8;
    private final android.graphics.Bitmap bitmap;

    public AndroidImageBitmap(android.graphics.Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    /* renamed from: getBitmap$ui_graphics, reason: from getter */
    public final android.graphics.Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    /* renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public final int mo5861getConfig_sVssgQ() {
        android.graphics.Bitmap.Config config = this.bitmap.getConfig();
        kotlin.jvm.internal.Intrinsics.checkNotNull(config);
        return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.toImageConfig(config);
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final androidx.compose.ui.graphics.colorspace.ColorSpace getColorSpace() {
        androidx.compose.ui.graphics.Api26Bitmap api26Bitmap = androidx.compose.ui.graphics.Api26Bitmap.INSTANCE;
        return androidx.compose.ui.graphics.Api26Bitmap.composeColorSpace$ui_graphics(this.bitmap);
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final void readPixels(int[] buffer, int startX, int startY, int width, int height, int bufferOffset, int stride) {
        android.graphics.Bitmap asAndroidBitmap = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        boolean z = false;
        if (asAndroidBitmap.getConfig() == android.graphics.Bitmap.Config.HARDWARE) {
            asAndroidBitmap = asAndroidBitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        asAndroidBitmap.getPixels(buffer, bufferOffset, stride, startX, startY, width, height);
        if (z) {
            asAndroidBitmap.recycle();
        }
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final boolean getHasAlpha() {
        return this.bitmap.hasAlpha();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }
}
