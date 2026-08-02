package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/material3/NavigationRailDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "ContainerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationRailDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.NavigationRailDefaults INSTANCE = new androidx.compose.material3.NavigationRailDefaults();

    private NavigationRailDefaults() {
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1949394041, i, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:329)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailCollapsedTokens.INSTANCE.getContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1546379058, i, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:335)");
        }
        androidx.compose.foundation.layout.WindowInsets m1752onlybOOhFvg = androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6), androidx.compose.foundation.layout.WindowInsetsSides.m1764plusgK_yJZ4(androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1778getVerticalJoeWqyM(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1776getStartJoeWqyM()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1752onlybOOhFvg;
    }
}
