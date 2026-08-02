package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\r\u001a\u00060\u0001j\u0002`\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0012\u001a\u00060\u0001j\u0002`\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0017\u001a\u00060\u0001j\u0002`\n2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0019\u001a\u00020\u000e2\n\u0010\u0018\u001a\u00060\u0001j\u0002`\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001d*\f\b\u0000\u0010\u001f\"\u00020\u00012\u00020\u0001"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "Landroid/graphics/ColorFilter;", "asAndroidColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Landroid/graphics/ColorFilter;", "asComposeColorFilter", "(Landroid/graphics/ColorFilter;)Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "actualTintColorFilter-xETnrds", "(JI)Landroid/graphics/ColorFilter;", "actualTintColorFilter", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix", "actualColorMatrixColorFilter-jHG-Opc", "([F)Landroid/graphics/ColorFilter;", "actualColorMatrixColorFilter", "multiply", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "actualLightingColorFilter--OWjLjI", "(JJ)Landroid/graphics/ColorFilter;", "actualLightingColorFilter", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "actualColorMatrixFromFilter", "(Landroid/graphics/ColorFilter;)[F", "", "supportsColorMatrixQuery", "()Z", "supportsLightingColorFilterQuery", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidColorFilter_androidKt {
    public static final boolean supportsColorMatrixQuery() {
        return true;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return true;
    }

    public static final android.graphics.ColorFilter asAndroidColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.graphics.ColorFilter asComposeColorFilter(android.graphics.ColorFilter colorFilter) {
        if (29 <= android.os.Build.VERSION.SDK_INT && (colorFilter instanceof android.graphics.BlendModeColorFilter)) {
            androidx.compose.ui.graphics.BlendModeColorFilterHelper blendModeColorFilterHelper = androidx.compose.ui.graphics.BlendModeColorFilterHelper.INSTANCE;
            return androidx.compose.ui.graphics.BlendModeColorFilterHelper.aH_((android.graphics.BlendModeColorFilter) colorFilter);
        }
        if ((colorFilter instanceof android.graphics.LightingColorFilter) && supportsLightingColorFilterQuery()) {
            android.graphics.LightingColorFilter lightingColorFilter = (android.graphics.LightingColorFilter) colorFilter;
            return new androidx.compose.ui.graphics.LightingColorFilter(androidx.compose.ui.graphics.ColorKt.Color(lightingColorFilter.getColorMultiply()), androidx.compose.ui.graphics.ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
        }
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return new androidx.compose.ui.graphics.ColorMatrixColorFilter(null, colorFilter, 0 == true ? 1 : 0);
        }
        return new androidx.compose.ui.graphics.ColorFilter(colorFilter);
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m5859actualTintColorFilterxETnrds(long j, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.graphics.BlendModeColorFilterHelper blendModeColorFilterHelper = androidx.compose.ui.graphics.BlendModeColorFilterHelper.INSTANCE;
            return androidx.compose.ui.graphics.BlendModeColorFilterHelper.aG_(j, i);
        }
        return new android.graphics.PorterDuffColorFilter(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j), androidx.compose.ui.graphics.AndroidBlendMode_androidKt.m5845toPorterDuffModes9anfk8(i));
    }

    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m5857actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m5858actualLightingColorFilterOWjLjI(long j, long j2) {
        return new android.graphics.LightingColorFilter(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j), androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j2));
    }

    public static final float[] actualColorMatrixFromFilter(android.graphics.ColorFilter colorFilter) {
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            androidx.compose.ui.graphics.ColorMatrixFilterHelper colorMatrixFilterHelper = androidx.compose.ui.graphics.ColorMatrixFilterHelper.INSTANCE;
            return androidx.compose.ui.graphics.ColorMatrixFilterHelper.getHighResolutionOutputSizeshNQ4ISI((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        throw new java.lang.IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }
}
