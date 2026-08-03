package androidx.compose.ui.unit;

/* compiled from: AndroidDensity.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "context", "Landroid/content/Context;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    public static final androidx.compose.ui.unit.Density Density(android.content.Context context) {
        androidx.compose.ui.unit.LinearFontScaleConverter forScale;
        float f = context.getResources().getConfiguration().fontScale;
        if (androidx.compose.ui.unit.FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
            forScale = new androidx.compose.ui.unit.LinearFontScaleConverter(f);
        } else {
            forScale = androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.forScale(f);
            if (forScale == null) {
                forScale = new androidx.compose.ui.unit.LinearFontScaleConverter(f);
            }
        }
        return new androidx.compose.ui.unit.DensityWithConverter(context.getResources().getDisplayMetrics().density, f, forScale);
    }
}
