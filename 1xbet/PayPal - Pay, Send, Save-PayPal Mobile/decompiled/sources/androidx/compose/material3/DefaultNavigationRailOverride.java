package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/DefaultNavigationRailOverride;", "Landroidx/compose/material3/NavigationRailOverride;", "<init>", "()V", "Landroidx/compose/material3/NavigationRailOverrideScope;", "", "NavigationRail", "(Landroidx/compose/material3/NavigationRailOverrideScope;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultNavigationRailOverride implements androidx.compose.material3.NavigationRailOverride {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DefaultNavigationRailOverride INSTANCE = new androidx.compose.material3.DefaultNavigationRailOverride();

    private DefaultNavigationRailOverride() {
    }

    @Override // androidx.compose.material3.NavigationRailOverride
    public final void NavigationRail(final androidx.compose.material3.NavigationRailOverrideScope navigationRailOverrideScope, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-433653496);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(navigationRailOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-433653496, i2, -1, "androidx.compose.material3.DefaultNavigationRailOverride.NavigationRail (NavigationRail.kt:147)");
            }
            composer2 = startRestartGroup;
            androidx.compose.material3.SurfaceKt.m3828SurfaceT9BRK9s(navigationRailOverrideScope.getModifier(), null, navigationRailOverrideScope.getContainerColor(), navigationRailOverrideScope.getContentColor(), 0.0f, 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1027527987, true, new androidx.compose.material3.DefaultNavigationRailOverride$NavigationRail$1(navigationRailOverrideScope), startRestartGroup, 54), startRestartGroup, 12582912, 114);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DefaultNavigationRailOverride$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DefaultNavigationRailOverride.$r8$lambda$7XDs1tzBP84sNmNp2QiuF6c_v4g(androidx.compose.material3.DefaultNavigationRailOverride.this, navigationRailOverrideScope, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7XDs1tzBP84sNmNp2QiuF6c_v4g(androidx.compose.material3.DefaultNavigationRailOverride defaultNavigationRailOverride, androidx.compose.material3.NavigationRailOverrideScope navigationRailOverrideScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        defaultNavigationRailOverride.NavigationRail(navigationRailOverrideScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
