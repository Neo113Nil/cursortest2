package androidx.glance.appwidget;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.GlanceTheme;
import androidx.glance.appwidget.unit.CheckableColorProvider;
import androidx.glance.appwidget.unit.CheckedUncheckedColorProvider;
import androidx.glance.appwidget.unit.ResourceCheckableColorProvider;
import androidx.glance.color.DynamicThemeColorProviders;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.FixedColorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005J#\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/glance/appwidget/RadioButtonDefaults;", "", "()V", "colors", "Landroidx/glance/appwidget/RadioButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/glance/appwidget/RadioButtonColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "colors--OWjLjI", "(JJ)Landroidx/glance/appwidget/RadioButtonColors;", "Landroidx/glance/unit/ColorProvider;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    public final RadioButtonColors colors(ColorProvider checkedColor, ColorProvider uncheckedColor) {
        return new RadioButtonColors(CheckedUncheckedColorProvider.INSTANCE.createCheckableColorProvider("RadioButtonColors", checkedColor, uncheckedColor));
    }

    /* renamed from: colors--OWjLjI, reason: not valid java name */
    public final RadioButtonColors m1311colorsOWjLjI(long checkedColor, long uncheckedColor) {
        return colors(new FixedColorProvider(checkedColor, null), new FixedColorProvider(uncheckedColor, null));
    }

    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    public final RadioButtonColors colors(Composer composer, int i) {
        CheckableColorProvider createCheckableColorProvider;
        composer.startReplaceableGroup(785643973);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(785643973, i, -1, "androidx.glance.appwidget.RadioButtonDefaults.colors (RadioButton.kt:223)");
        }
        GlanceTheme glanceTheme = GlanceTheme.INSTANCE;
        int i2 = GlanceTheme.$stable;
        if (Intrinsics.areEqual(glanceTheme.getColors(composer, i2), DynamicThemeColorProviders.INSTANCE)) {
            createCheckableColorProvider = new ResourceCheckableColorProvider(R.color.glance_default_radio_button);
        } else {
            createCheckableColorProvider = CheckedUncheckedColorProvider.INSTANCE.createCheckableColorProvider("CheckBoxColors", glanceTheme.getColors(composer, i2).getPrimary(), glanceTheme.getColors(composer, i2).getOnSurfaceVariant());
        }
        RadioButtonColors radioButtonColors = new RadioButtonColors(createCheckableColorProvider);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return radioButtonColors;
    }
}
