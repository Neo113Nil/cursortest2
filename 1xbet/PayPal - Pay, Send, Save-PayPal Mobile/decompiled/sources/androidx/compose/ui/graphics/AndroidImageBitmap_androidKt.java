package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u0013\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0014\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u000b*\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroid/graphics/Bitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "asImageBitmap", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/ImageBitmap;", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "createImageBitmap", "([B)Landroidx/compose/ui/graphics/ImageBitmap;", "", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "ActualImageBitmap", "asAndroidBitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toBitmapConfig", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidImageBitmap_androidKt {
    public static final androidx.compose.ui.graphics.ImageBitmap asImageBitmap(android.graphics.Bitmap bitmap) {
        return new androidx.compose.ui.graphics.AndroidImageBitmap(bitmap);
    }

    public static final androidx.compose.ui.graphics.ImageBitmap createImageBitmap(byte[] bArr) {
        return asImageBitmap(android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final androidx.compose.ui.graphics.ImageBitmap m5862ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        android.graphics.Bitmap createBitmap;
        m5863toBitmapConfig1JJdX4A(i3);
        createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i, i2, m5863toBitmapConfig1JJdX4A(i3), z, androidx.compose.ui.graphics.AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        return new androidx.compose.ui.graphics.AndroidImageBitmap(createBitmap);
    }

    public static final android.graphics.Bitmap asAndroidBitmap(androidx.compose.ui.graphics.ImageBitmap imageBitmap) {
        if (imageBitmap instanceof androidx.compose.ui.graphics.AndroidImageBitmap) {
            return ((androidx.compose.ui.graphics.AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final android.graphics.Bitmap.Config m5863toBitmapConfig1JJdX4A(int i) {
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m6205equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6210getArgb8888_sVssgQ())) {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m6205equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6209getAlpha8_sVssgQ())) {
            return android.graphics.Bitmap.Config.ALPHA_8;
        }
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m6205equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6213getRgb565_sVssgQ())) {
            return android.graphics.Bitmap.Config.RGB_565;
        }
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m6205equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6211getF16_sVssgQ())) {
            return android.graphics.Bitmap.Config.RGBA_F16;
        }
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m6205equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6212getGpu_sVssgQ())) {
            return android.graphics.Bitmap.Config.HARDWARE;
        }
        return android.graphics.Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(android.graphics.Bitmap.Config config) {
        if (config == android.graphics.Bitmap.Config.ALPHA_8) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6209getAlpha8_sVssgQ();
        }
        if (config == android.graphics.Bitmap.Config.RGB_565) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6213getRgb565_sVssgQ();
        }
        if (config == android.graphics.Bitmap.Config.ARGB_4444) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6210getArgb8888_sVssgQ();
        }
        if (config == android.graphics.Bitmap.Config.RGBA_F16) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6211getF16_sVssgQ();
        }
        if (config == android.graphics.Bitmap.Config.HARDWARE) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6212getGpu_sVssgQ();
        }
        return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6210getArgb8888_sVssgQ();
    }
}
