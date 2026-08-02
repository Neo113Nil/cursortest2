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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/glance/appwidget/CheckboxDefaults;", "", "()V", "colors", "Landroidx/glance/appwidget/CheckBoxColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/glance/appwidget/CheckBoxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "colors-RFnl5yQ", "(JJLandroidx/compose/runtime/Composer;I)Landroidx/glance/appwidget/CheckBoxColors;", "Landroidx/glance/unit/ColorProvider;", "(Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/compose/runtime/Composer;I)Landroidx/glance/appwidget/CheckBoxColors;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    public final CheckBoxColors colors(ColorProvider colorProvider, ColorProvider colorProvider2, Composer composer, int i) {
        composer.startReplaceableGroup(-879562141);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-879562141, i, -1, "androidx.glance.appwidget.CheckboxDefaults.colors (CheckBox.kt:180)");
        }
        CheckBoxColorsImpl checkBoxColorsImpl = new CheckBoxColorsImpl(CheckedUncheckedColorProvider.INSTANCE.createCheckableColorProvider("CheckBoxColors", colorProvider, colorProvider2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return checkBoxColorsImpl;
    }

    @Composable
    /* renamed from: colors-RFnl5yQ, reason: not valid java name */
    public final CheckBoxColors m1296colorsRFnl5yQ(long j, long j2, Composer composer, int i) {
        composer.startReplaceableGroup(837737093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(837737093, i, -1, "androidx.glance.appwidget.CheckboxDefaults.colors (CheckBox.kt:199)");
        }
        CheckboxDefaults checkboxDefaults = INSTANCE;
        FixedColorProvider fixedColorProvider = new FixedColorProvider(j, null);
        FixedColorProvider fixedColorProvider2 = new FixedColorProvider(j2, null);
        int i2 = FixedColorProvider.$stable;
        CheckBoxColors colors = checkboxDefaults.colors(fixedColorProvider, fixedColorProvider2, composer, (i2 << 3) | i2 | 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return colors;
    }

    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    public final CheckBoxColors colors(Composer composer, int i) {
        CheckableColorProvider createCheckableColorProvider;
        composer.startReplaceableGroup(-2123347125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123347125, i, -1, "androidx.glance.appwidget.CheckboxDefaults.colors (CheckBox.kt:212)");
        }
        GlanceTheme glanceTheme = GlanceTheme.INSTANCE;
        int i2 = GlanceTheme.$stable;
        if (Intrinsics.areEqual(glanceTheme.getColors(composer, i2), DynamicThemeColorProviders.INSTANCE)) {
            createCheckableColorProvider = new ResourceCheckableColorProvider(R.color.glance_default_check_box);
        } else {
            createCheckableColorProvider = CheckedUncheckedColorProvider.INSTANCE.createCheckableColorProvider("CheckBoxColors", glanceTheme.getColors(composer, i2).getPrimary(), glanceTheme.getColors(composer, i2).getOnSurface());
        }
        CheckBoxColorsImpl checkBoxColorsImpl = new CheckBoxColorsImpl(createCheckableColorProvider);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return checkBoxColorsImpl;
    }
}
