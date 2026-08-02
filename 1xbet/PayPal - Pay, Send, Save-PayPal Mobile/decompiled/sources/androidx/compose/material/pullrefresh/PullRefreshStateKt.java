package androidx.compose.material.pullrefresh;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"rememberPullRefreshState", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "refreshing", "", "onRefresh", "Lkotlin/Function0;", "", "refreshThreshold", "Landroidx/compose/ui/unit/Dp;", "refreshingOffset", "rememberPullRefreshState-UuyPYSY", "(ZLkotlin/jvm/functions/Function0;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;", "DragMultiplier", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PullRefreshStateKt {
    /* renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final androidx.compose.material.pullrefresh.PullRefreshState m2849rememberPullRefreshStateUuyPYSY(final boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, float f, float f2, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            f = androidx.compose.material.pullrefresh.PullRefreshDefaults.INSTANCE.m2841getRefreshThresholdD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f2 = androidx.compose.material.pullrefresh.PullRefreshDefaults.INSTANCE.m2842getRefreshingOffsetD9Ej5fM();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-174977512, i, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) <= 0) {
            throw new java.lang.IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, composer, (i >> 3) & 14);
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        floatRef.element = density.mo1418toPx0680j_4(f);
        floatRef2.element = density.mo1418toPx0680j_4(f2);
        boolean changed = composer.changed(coroutineScope);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.material.pullrefresh.PullRefreshState(coroutineScope, rememberUpdatedState, floatRef2.element, floatRef.element);
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState = (androidx.compose.material.pullrefresh.PullRefreshState) rememberedValue2;
        boolean changedInstance = composer.changedInstance(pullRefreshState);
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4;
        boolean changed2 = composer.changed(floatRef.element);
        boolean changed3 = composer.changed(floatRef2.element);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changedInstance | z2 | changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.pullrefresh.PullRefreshStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material.pullrefresh.PullRefreshStateKt.m2848$r8$lambda$XxuQqXnYRUcRFa1Op09rAGYoBA(androidx.compose.material.pullrefresh.PullRefreshState.this, z, floatRef, floatRef2);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue3, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return pullRefreshState;
    }

    /* renamed from: $r8$lambda$XxuQqXnYRUcRFa-1Op09rAGYoBA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2848$r8$lambda$XxuQqXnYRUcRFa1Op09rAGYoBA(androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, boolean z, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2) {
        pullRefreshState.setRefreshing$material(z);
        pullRefreshState.setThreshold$material(floatRef.element);
        pullRefreshState.setRefreshingOffset$material(floatRef2.element);
        return kotlin.Unit.INSTANCE;
    }
}
