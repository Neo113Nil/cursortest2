package androidx.glance;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/ButtonDefaults;", "", "()V", "buttonColors", "Landroidx/glance/ButtonColors;", "backgroundColor", "Landroidx/glance/unit/ColorProvider;", "contentColor", "(Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/compose/runtime/Composer;II)Landroidx/glance/ButtonColors;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();

    private ButtonDefaults() {
    }

    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
    @Composable
    public final ButtonColors buttonColors(ColorProvider colorProvider, ColorProvider colorProvider2, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(207135993);
        if ((i2 & 1) != 0) {
            colorProvider = GlanceTheme.INSTANCE.getColors(composer, 6).getPrimary();
        }
        if ((i2 & 2) != 0) {
            colorProvider2 = GlanceTheme.INSTANCE.getColors(composer, 6).getOnPrimary();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(207135993, i, -1, "androidx.glance.ButtonDefaults.buttonColors (Button.kt:198)");
        }
        ButtonColors buttonColors = new ButtonColors(colorProvider, colorProvider2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }
}
