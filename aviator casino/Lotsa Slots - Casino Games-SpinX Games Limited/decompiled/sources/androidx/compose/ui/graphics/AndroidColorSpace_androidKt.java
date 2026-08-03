package androidx.compose.ui.graphics;

/* compiled from: AndroidColorSpace.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"toAndroidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "toComposeColorSpace", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidColorSpace_androidKt {
    public static final android.graphics.ColorSpace toAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        androidx.compose.ui.graphics.ColorSpaceVerificationHelper colorSpaceVerificationHelper = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.INSTANCE;
        return androidx.compose.ui.graphics.ColorSpaceVerificationHelper.androidColorSpace(colorSpace);
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace toComposeColorSpace(android.graphics.ColorSpace colorSpace) {
        androidx.compose.ui.graphics.ColorSpaceVerificationHelper colorSpaceVerificationHelper = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.INSTANCE;
        return androidx.compose.ui.graphics.ColorSpaceVerificationHelper.composeColorSpace(colorSpace);
    }
}
