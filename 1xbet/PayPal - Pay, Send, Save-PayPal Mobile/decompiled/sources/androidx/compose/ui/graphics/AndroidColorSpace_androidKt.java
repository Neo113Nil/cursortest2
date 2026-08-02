package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Landroid/graphics/ColorSpace;", "toAndroidColorSpace", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/ColorSpace;", "toComposeColorSpace", "(Landroid/graphics/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidColorSpace_androidKt {
    public static final android.graphics.ColorSpace toAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        androidx.compose.ui.graphics.ColorSpaceVerificationHelper colorSpaceVerificationHelper = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.INSTANCE;
        return androidx.compose.ui.graphics.ColorSpaceVerificationHelper.getHighResolutionOutputSizeshNQ4ISI(colorSpace);
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace toComposeColorSpace(android.graphics.ColorSpace colorSpace) {
        androidx.compose.ui.graphics.ColorSpaceVerificationHelper colorSpaceVerificationHelper = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.INSTANCE;
        return androidx.compose.ui.graphics.ColorSpaceVerificationHelper.getHighSpeedVideoFpsRanges(colorSpace);
    }
}
