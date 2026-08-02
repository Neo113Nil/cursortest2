package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u001aW\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0017\u001a\u00020\u0000*\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "", "startX", "startY", "width", "height", "", "buffer", "bufferOffset", "stride", "Landroidx/compose/ui/graphics/PixelMap;", "toPixelMap", "(Landroidx/compose/ui/graphics/ImageBitmap;IIII[III)Landroidx/compose/ui/graphics/PixelMap;", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "ImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "ImageBitmap", "", "decodeToImageBitmap", "([B)Landroidx/compose/ui/graphics/ImageBitmap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageBitmapKt {
    public static /* synthetic */ androidx.compose.ui.graphics.PixelMap toPixelMap$default(androidx.compose.ui.graphics.ImageBitmap imageBitmap, int i, int i2, int i3, int i4, int[] iArr, int i5, int i6, int i7, java.lang.Object obj) {
        if ((i7 & 1) != 0) {
            i = 0;
        }
        if ((i7 & 2) != 0) {
            i2 = 0;
        }
        if ((i7 & 4) != 0) {
            i3 = imageBitmap.getWidth();
        }
        if ((i7 & 8) != 0) {
            i4 = imageBitmap.getHeight();
        }
        if ((i7 & 16) != 0) {
            iArr = new int[i3 * i4];
        }
        if ((i7 & 32) != 0) {
            i5 = 0;
        }
        if ((i7 & 64) != 0) {
            i6 = i3;
        }
        return toPixelMap(imageBitmap, i, i2, i3, i4, iArr, i5, i6);
    }

    public static final androidx.compose.ui.graphics.PixelMap toPixelMap(androidx.compose.ui.graphics.ImageBitmap imageBitmap, int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) {
        imageBitmap.readPixels(iArr, i, i2, i3, i4, i5, i6);
        return new androidx.compose.ui.graphics.PixelMap(iArr, i3, i4, i5, i6);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.graphics.ImageBitmap m6215ImageBitmapx__hDU$default(int i, int i2, int i3, boolean z, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i3 = androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6210getArgb8888_sVssgQ();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            colorSpace = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
        }
        return m6214ImageBitmapx__hDU(i, i2, i3, z, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final androidx.compose.ui.graphics.ImageBitmap m6214ImageBitmapx__hDU(int i, int i2, int i3, boolean z, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.m5862ActualImageBitmapx__hDU(i, i2, i3, z, colorSpace);
    }

    public static final androidx.compose.ui.graphics.ImageBitmap decodeToImageBitmap(byte[] bArr) {
        return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.createImageBitmap(bArr);
    }
}
