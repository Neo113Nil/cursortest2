package androidx.glance.appwidget;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.GlanceTheme;
import androidx.glance.appwidget.unit.CheckedUncheckedColorProvider;
import androidx.glance.appwidget.unit.ResourceCheckableColorProvider;
import androidx.glance.color.DynamicThemeColorProviders;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/glance/appwidget/SwitchDefaults;", "", "()V", "colors", "Landroidx/glance/appwidget/SwitchColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/glance/appwidget/SwitchColors;", "checkedThumbColor", "Landroidx/glance/unit/ColorProvider;", "uncheckedThumbColor", "checkedTrackColor", "uncheckedTrackColor", "(Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/compose/runtime/Composer;I)Landroidx/glance/appwidget/SwitchColors;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    public final SwitchColors colors(ColorProvider colorProvider, ColorProvider colorProvider2, ColorProvider colorProvider3, ColorProvider colorProvider4, Composer composer, int i) {
        composer.startReplaceableGroup(-1578571870);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1578571870, i, -1, "androidx.glance.appwidget.SwitchDefaults.colors (Switch.kt:156)");
        }
        CheckedUncheckedColorProvider.Companion companion = CheckedUncheckedColorProvider.INSTANCE;
        SwitchColorsImpl switchColorsImpl = new SwitchColorsImpl(companion.createCheckableColorProvider("SwitchColors", colorProvider, colorProvider2), companion.createCheckableColorProvider("SwitchColors", colorProvider3, colorProvider4));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return switchColorsImpl;
    }

    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    public final SwitchColors colors(Composer composer, int i) {
        Composer composer2;
        SwitchColors colors;
        composer.startReplaceableGroup(494460634);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(494460634, i, -1, "androidx.glance.appwidget.SwitchDefaults.colors (Switch.kt:182)");
        }
        GlanceTheme glanceTheme = GlanceTheme.INSTANCE;
        int i2 = GlanceTheme.$stable;
        if (Intrinsics.areEqual(glanceTheme.getColors(composer, i2), DynamicThemeColorProviders.INSTANCE)) {
            colors = new SwitchColorsImpl(new ResourceCheckableColorProvider(R.color.glance_default_switch_thumb), new ResourceCheckableColorProvider(R.color.glance_default_switch_track));
            composer2 = composer;
        } else {
            composer2 = composer;
            colors = colors(glanceTheme.getColors(composer, i2).getOnPrimary(), glanceTheme.getColors(composer, i2).getOutline(), glanceTheme.getColors(composer, i2).getPrimary(), glanceTheme.getColors(composer, i2).getSurfaceVariant(), composer2, ((i << 12) & 57344) | 4680);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return colors;
    }
}
