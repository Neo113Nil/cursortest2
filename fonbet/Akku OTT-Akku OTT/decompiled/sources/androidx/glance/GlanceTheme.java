package androidx.glance;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.color.ColorProviders;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/GlanceTheme;", "", "()V", "colors", "Landroidx/glance/color/ColorProviders;", "getColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/glance/color/ColorProviders;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlanceTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceTheme.kt\nandroidx/glance/GlanceTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,49:1\n76#2:50\n*S KotlinDebug\n*F\n+ 1 GlanceTheme.kt\nandroidx/glance/GlanceTheme\n*L\n31#1:50\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceTheme {
    public static final int $stable = 0;
    public static final GlanceTheme INSTANCE = new GlanceTheme();

    private GlanceTheme() {
    }

    @GlanceComposable
    @JvmName(name = "getColors")
    @Composable
    @ReadOnlyComposable
    public final ColorProviders getColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2066266949, i, -1, "androidx.glance.GlanceTheme.<get-colors> (GlanceTheme.kt:30)");
        }
        ColorProviders colorProviders = (ColorProviders) composer.consume(CompositionLocalsKt.getLocalColors());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorProviders;
    }
}
