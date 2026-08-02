package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/material3/ShortNavigationBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "getContentColor", "contentColor", "Landroidx/compose/material3/ShortNavigationBarArrangement;", "getArrangement-LnnQw40", "()I", "arrangement", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShortNavigationBarDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.ShortNavigationBarDefaults INSTANCE = new androidx.compose.material3.ShortNavigationBarDefaults();

    private ShortNavigationBarDefaults() {
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-159508825, i, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-containerColor> (ShortNavigationBar.kt:262)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContentColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(133067559, i, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-contentColor> (ShortNavigationBar.kt:266)");
        }
        long m3089contentColorForek8zF_U = androidx.compose.material3.ColorSchemeKt.m3089contentColorForek8zF_U(getContainerColor(composer, i & 14), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3089contentColorForek8zF_U;
    }

    /* renamed from: getArrangement-LnnQw40, reason: not valid java name */
    public final int m3746getArrangementLnnQw40() {
        return androidx.compose.material3.ShortNavigationBarArrangement.INSTANCE.m3745getEqualWeightLnnQw40();
    }

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-424843026, i, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-windowInsets> (ShortNavigationBar.kt:276)");
        }
        androidx.compose.foundation.layout.WindowInsets m1752onlybOOhFvg = androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6), androidx.compose.foundation.layout.WindowInsetsSides.m1764plusgK_yJZ4(androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1773getHorizontalJoeWqyM(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1771getBottomJoeWqyM()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1752onlybOOhFvg;
    }
}
