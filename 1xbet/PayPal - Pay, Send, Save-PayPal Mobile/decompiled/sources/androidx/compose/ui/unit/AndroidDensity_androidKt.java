package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/Density;", "Density", "(Landroid/content/Context;)Landroidx/compose/ui/unit/Density;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    public static final androidx.compose.ui.unit.Density Density(android.content.Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        androidx.compose.ui.unit.LinearFontScaleConverter forScale = androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.forScale(f);
        if (forScale == null) {
            forScale = new androidx.compose.ui.unit.LinearFontScaleConverter(f);
        }
        return new androidx.compose.ui.unit.DensityWithConverter(f2, f, forScale);
    }
}
