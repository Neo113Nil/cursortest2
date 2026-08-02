package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/DefaultWideNavigationRailOverride;", "Landroidx/compose/material3/WideNavigationRailOverride;", "<init>", "()V", "Landroidx/compose/material3/WideNavigationRailOverrideScope;", "", "WideNavigationRail", "(Landroidx/compose/material3/WideNavigationRailOverrideScope;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultWideNavigationRailOverride implements androidx.compose.material3.WideNavigationRailOverride {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DefaultWideNavigationRailOverride INSTANCE = new androidx.compose.material3.DefaultWideNavigationRailOverride();

    private DefaultWideNavigationRailOverride() {
    }

    @Override // androidx.compose.material3.WideNavigationRailOverride
    public final void WideNavigationRail(final androidx.compose.material3.WideNavigationRailOverrideScope wideNavigationRailOverrideScope, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1829525426);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(wideNavigationRailOverrideScope) : startRestartGroup.changedInstance(wideNavigationRailOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1829525426, i2, -1, "androidx.compose.material3.DefaultWideNavigationRailOverride.WideNavigationRail (WideNavigationRail.kt:192)");
            }
            androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor(wideNavigationRailOverrideScope.getModifier(), false, androidx.compose.material3.WideNavigationRailStateKt.isExpanded(wideNavigationRailOverrideScope.getState().getTargetValue()), wideNavigationRailOverrideScope.getColors(), wideNavigationRailOverrideScope.getShape(), wideNavigationRailOverrideScope.getHeader(), wideNavigationRailOverrideScope.getWindowInsets(), wideNavigationRailOverrideScope.getArrangement(), wideNavigationRailOverrideScope.getContent(), startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DefaultWideNavigationRailOverride$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DefaultWideNavigationRailOverride.m3230$r8$lambda$T3PJxzKplGGwHEMmIbRXb2wOY(androidx.compose.material3.DefaultWideNavigationRailOverride.this, wideNavigationRailOverrideScope, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$T3PJxzKplGGwHEMmIbRXb2wO--Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3230$r8$lambda$T3PJxzKplGGwHEMmIbRXb2wOY(androidx.compose.material3.DefaultWideNavigationRailOverride defaultWideNavigationRailOverride, androidx.compose.material3.WideNavigationRailOverrideScope wideNavigationRailOverrideScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        defaultWideNavigationRailOverride.WideNavigationRail(wideNavigationRailOverrideScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
