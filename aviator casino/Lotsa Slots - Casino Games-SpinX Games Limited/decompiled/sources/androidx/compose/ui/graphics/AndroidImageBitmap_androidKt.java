package androidx.compose.ui.graphics;

/* compiled from: AndroidImageBitmap.android.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u000e\u001a\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0006*\u00020\u0011H\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", com.helpshift.proactive.InAppViewConstants.CONFIG, "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    public static final androidx.compose.ui.graphics.ImageBitmap asImageBitmap(android.graphics.Bitmap bitmap) {
        return new androidx.compose.ui.graphics.AndroidImageBitmap(bitmap);
    }

    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final androidx.compose.ui.graphics.ImageBitmap m1981ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        android.graphics.Bitmap createBitmap;
        android.graphics.Bitmap.Config m1982toBitmapConfig1JJdX4A = m1982toBitmapConfig1JJdX4A(i3);
        if (android.os.Build.VERSION.SDK_INT < 26) {
            createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i, i2, m1982toBitmapConfig1JJdX4A);
            createBitmap.setHasAlpha(z);
        } else {
            createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i, i2, m1982toBitmapConfig1JJdX4A(i3), z, androidx.compose.ui.graphics.AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        }
        return new androidx.compose.ui.graphics.AndroidImageBitmap(createBitmap);
    }

    public static final android.graphics.Bitmap asAndroidBitmap(androidx.compose.ui.graphics.ImageBitmap imageBitmap) {
        if (imageBitmap instanceof androidx.compose.ui.graphics.AndroidImageBitmap) {
            return ((androidx.compose.ui.graphics.AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final android.graphics.Bitmap.Config m1982toBitmapConfig1JJdX4A(int i) {
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ())) {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2341getAlpha8_sVssgQ())) {
            return android.graphics.Bitmap.Config.ALPHA_8;
        }
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2345getRgb565_sVssgQ())) {
            return android.graphics.Bitmap.Config.RGB_565;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2343getF16_sVssgQ())) {
            return android.graphics.Bitmap.Config.RGBA_F16;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2344getGpu_sVssgQ())) {
            return android.graphics.Bitmap.Config.HARDWARE;
        }
        return android.graphics.Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(android.graphics.Bitmap.Config config) {
        if (config == android.graphics.Bitmap.Config.ALPHA_8) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2341getAlpha8_sVssgQ();
        }
        if (config == android.graphics.Bitmap.Config.RGB_565) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2345getRgb565_sVssgQ();
        }
        if (config == android.graphics.Bitmap.Config.ARGB_4444) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && config == android.graphics.Bitmap.Config.RGBA_F16) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2343getF16_sVssgQ();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && config == android.graphics.Bitmap.Config.HARDWARE) {
            return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2344getGpu_sVssgQ();
        }
        return androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ();
    }
}
