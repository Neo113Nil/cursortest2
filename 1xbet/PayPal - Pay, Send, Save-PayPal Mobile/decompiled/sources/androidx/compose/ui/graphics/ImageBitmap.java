package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJS\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "", "readPixels", "([IIIIIII)V", "prepareToDraw", "()V", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "", "getHasAlpha", "()Z", "hasAlpha", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "config", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ImageBitmap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.ImageBitmap.Companion INSTANCE = androidx.compose.ui.graphics.ImageBitmap.Companion.getHighResolutionOutputSizeshNQ4ISI;

    androidx.compose.ui.graphics.colorspace.ColorSpace getColorSpace();

    /* renamed from: getConfig-_sVssgQ */
    int mo5861getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(int[] buffer, int startX, int startY, int width, int height, int bufferOffset, int stride);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void readPixels$default(androidx.compose.ui.graphics.ImageBitmap imageBitmap, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        int i8 = (i7 & 2) != 0 ? 0 : i;
        int i9 = (i7 & 4) != 0 ? 0 : i2;
        int width = (i7 & 8) != 0 ? imageBitmap.getWidth() : i3;
        imageBitmap.readPixels(iArr, i8, i9, width, (i7 & 16) != 0 ? imageBitmap.getHeight() : i4, (i7 & 32) == 0 ? i5 : 0, (i7 & 64) != 0 ? width : i6);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.graphics.ImageBitmap.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.graphics.ImageBitmap.Companion();

        private Companion() {
        }
    }
}
