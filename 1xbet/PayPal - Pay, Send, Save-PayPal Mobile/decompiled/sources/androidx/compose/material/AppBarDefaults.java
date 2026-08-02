package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012"}, d2 = {"Landroidx/compose/material/AppBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "TopAppBarElevation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTopAppBarElevation-D9Ej5fM", "()F", "BottomAppBarElevation", "getBottomAppBarElevation-D9Ej5fM", "Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/WindowInsets;", "getTopAppBarWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "topAppBarWindowInsets", "getBottomAppBarWindowInsets", "bottomAppBarWindowInsets"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppBarDefaults {
    public static final int $stable = 0;
    private static final androidx.compose.foundation.layout.PaddingValues ContentPadding;
    public static final androidx.compose.material.AppBarDefaults INSTANCE = new androidx.compose.material.AppBarDefaults();
    private static final float TopAppBarElevation = androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f);
    private static final float BottomAppBarElevation = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);

    private AppBarDefaults() {
    }

    /* renamed from: getTopAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m2476getTopAppBarElevationD9Ej5fM() {
        return TopAppBarElevation;
    }

    /* renamed from: getBottomAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m2475getBottomAppBarElevationD9Ej5fM() {
        return BottomAppBarElevation;
    }

    public final androidx.compose.foundation.layout.PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final androidx.compose.foundation.layout.WindowInsets getTopAppBarWindowInsets(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-427176825, i, -1, "androidx.compose.material.AppBarDefaults.<get-topAppBarWindowInsets> (AppBar.kt:443)");
        }
        androidx.compose.foundation.layout.WindowInsets m1752onlybOOhFvg = androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(androidx.compose.material.SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6), androidx.compose.foundation.layout.WindowInsetsSides.m1764plusgK_yJZ4(androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1773getHorizontalJoeWqyM(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1777getTopJoeWqyM()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1752onlybOOhFvg;
    }

    public final androidx.compose.foundation.layout.WindowInsets getBottomAppBarWindowInsets(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1469837023, i, -1, "androidx.compose.material.AppBarDefaults.<get-bottomAppBarWindowInsets> (AppBar.kt:450)");
        }
        androidx.compose.foundation.layout.WindowInsets m1752onlybOOhFvg = androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(androidx.compose.material.SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6), androidx.compose.foundation.layout.WindowInsetsSides.m1764plusgK_yJZ4(androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1773getHorizontalJoeWqyM(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1771getBottomJoeWqyM()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1752onlybOOhFvg;
    }

    static {
        float f;
        float f2;
        f = androidx.compose.material.AppBarKt.getHighSpeedVideoFpsRangesFor;
        f2 = androidx.compose.material.AppBarKt.getHighSpeedVideoFpsRangesFor;
        ContentPadding = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(f, 0.0f, f2, 0.0f, 10, null);
    }
}
