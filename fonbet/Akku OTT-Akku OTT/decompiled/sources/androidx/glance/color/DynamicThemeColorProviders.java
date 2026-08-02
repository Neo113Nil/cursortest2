package androidx.glance.color;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.R;
import androidx.glance.unit.ColorProviderKt;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/color/DynamicThemeColorProviders;", "Landroidx/glance/color/ColorProviders;", "()V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class DynamicThemeColorProviders extends ColorProviders {
    public static final int $stable = 0;
    public static final DynamicThemeColorProviders INSTANCE = new DynamicThemeColorProviders();

    private DynamicThemeColorProviders() {
        super(ColorProviderKt.ColorProvider(R.color.glance_colorPrimary), ColorProviderKt.ColorProvider(R.color.glance_colorOnPrimary), ColorProviderKt.ColorProvider(R.color.glance_colorPrimaryContainer), ColorProviderKt.ColorProvider(R.color.glance_colorOnPrimaryContainer), ColorProviderKt.ColorProvider(R.color.glance_colorSecondary), ColorProviderKt.ColorProvider(R.color.glance_colorOnSecondary), ColorProviderKt.ColorProvider(R.color.glance_colorSecondaryContainer), ColorProviderKt.ColorProvider(R.color.glance_colorOnSecondaryContainer), ColorProviderKt.ColorProvider(R.color.glance_colorTertiary), ColorProviderKt.ColorProvider(R.color.glance_colorOnTertiary), ColorProviderKt.ColorProvider(R.color.glance_colorTertiaryContainer), ColorProviderKt.ColorProvider(R.color.glance_colorOnTertiaryContainer), ColorProviderKt.ColorProvider(R.color.glance_colorError), ColorProviderKt.ColorProvider(R.color.glance_colorErrorContainer), ColorProviderKt.ColorProvider(R.color.glance_colorOnError), ColorProviderKt.ColorProvider(R.color.glance_colorOnErrorContainer), ColorProviderKt.ColorProvider(R.color.glance_colorBackground), ColorProviderKt.ColorProvider(R.color.glance_colorOnBackground), ColorProviderKt.ColorProvider(R.color.glance_colorSurface), ColorProviderKt.ColorProvider(R.color.glance_colorOnSurface), ColorProviderKt.ColorProvider(R.color.glance_colorSurfaceVariant), ColorProviderKt.ColorProvider(R.color.glance_colorOnSurfaceVariant), ColorProviderKt.ColorProvider(R.color.glance_colorOutline), ColorProviderKt.ColorProvider(R.color.glance_colorOnSurfaceInverse), ColorProviderKt.ColorProvider(R.color.glance_colorSurfaceInverse), ColorProviderKt.ColorProvider(R.color.glance_colorPrimaryInverse), null);
    }
}
