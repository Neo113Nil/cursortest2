package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u0004\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n"}, d2 = {"Landroidx/compose/ui/unit/Density;", "p0", "", "p1", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/unit/Density;F)F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "", "Camera2StreamConfigurationMap", "D", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EdgeEffectCompat_androidKt {
    private static final double Camera2StreamConfigurationMap;
    private static final double getHighSpeedVideoFpsRanges;
    private static final float getHighSpeedVideoSizes = android.view.ViewConfiguration.getScrollFriction();

    static {
        double log = java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d);
        Camera2StreamConfigurationMap = log;
        getHighSpeedVideoFpsRanges = log - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoSizes(androidx.compose.ui.unit.Density density, float f) {
        double density2 = density.getDensity() * 386.0878f * 160.0f * 0.84f;
        double d = getHighSpeedVideoSizes * density2;
        return (float) (d * java.lang.Math.exp((Camera2StreamConfigurationMap / getHighSpeedVideoFpsRanges) * java.lang.Math.log((java.lang.Math.abs(f) * 0.35f) / d)));
    }
}
