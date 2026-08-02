package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "maxLifecycle", "Landroidx/lifecycle/Lifecycle$State;", "parent", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/LifecycleOwner;", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberLifecycleOwnerKt {
    public static final androidx.view.LifecycleOwner rememberLifecycleOwner(androidx.lifecycle.Lifecycle.State state, final androidx.view.LifecycleOwner lifecycleOwner, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            state = androidx.lifecycle.Lifecycle.State.RESUMED;
        }
        if ((i2 & 2) != 0) {
            lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1501509168, i, -1, "androidx.lifecycle.compose.rememberLifecycleOwner (RememberLifecycleOwner.kt:78)");
        }
        boolean changed = composer.changed(lifecycleOwner);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.view.compose.ComposeLifecycleOwner();
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.view.compose.ComposeLifecycleOwner composeLifecycleOwner = (androidx.view.compose.ComposeLifecycleOwner) rememberedValue;
        boolean changedInstance = composer.changedInstance(composeLifecycleOwner);
        boolean changedInstance2 = composer.changedInstance(lifecycleOwner);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.compose.RememberLifecycleOwnerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.compose.RememberLifecycleOwnerKt.m9169$r8$lambda$vBHoW7NavqSLRgsSYOrN8QcXx4(androidx.view.LifecycleOwner.this, composeLifecycleOwner, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(composeLifecycleOwner, lifecycleOwner, (kotlin.jvm.functions.Function1) rememberedValue2, composer, i & 112);
        boolean changedInstance3 = composer.changedInstance(composeLifecycleOwner);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(state.ordinal())) || (i & 6) == 4;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changedInstance3 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new androidx.view.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(composeLifecycleOwner, state, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(composeLifecycleOwner, state, (kotlin.jvm.functions.Function2) rememberedValue3, composer, (i << 3) & 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return composeLifecycleOwner;
    }

    /* renamed from: $r8$lambda$0hrbeT26lEfIKGSpz-zHtCY4jIs, reason: not valid java name */
    public static /* synthetic */ void m9168$r8$lambda$0hrbeT26lEfIKGSpzzHtCY4jIs(androidx.view.compose.ComposeLifecycleOwner composeLifecycleOwner, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        composeLifecycleOwner.getHighSpeedVideoFpsRanges = event.getTargetState();
        composeLifecycleOwner.getHighSpeedVideoFpsRanges();
    }

    /* renamed from: $r8$lambda$vBHoW7NavqSLRgsSYO-rN8QcXx4, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m9169$r8$lambda$vBHoW7NavqSLRgsSYOrN8QcXx4(final androidx.view.LifecycleOwner lifecycleOwner, final androidx.view.compose.ComposeLifecycleOwner composeLifecycleOwner, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        androidx.view.Lifecycle lifecycle;
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: androidx.lifecycle.compose.RememberLifecycleOwnerKt$$ExternalSyntheticLambda0
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                androidx.view.compose.RememberLifecycleOwnerKt.m9168$r8$lambda$0hrbeT26lEfIKGSpzzHtCY4jIs(androidx.view.compose.ComposeLifecycleOwner.this, lifecycleOwner2, event);
            }
        };
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(lifecycleEventObserver);
        }
        if (lifecycleOwner == null) {
            composeLifecycleOwner.getHighSpeedVideoFpsRanges = androidx.lifecycle.Lifecycle.Event.ON_RESUME.getTargetState();
            composeLifecycleOwner.getHighSpeedVideoFpsRanges();
        }
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.lifecycle.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.Lifecycle lifecycle2;
                androidx.view.LifecycleOwner lifecycleOwner2 = androidx.view.LifecycleOwner.this;
                if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                    lifecycle2.removeObserver(lifecycleEventObserver);
                }
                androidx.view.compose.ComposeLifecycleOwner composeLifecycleOwner2 = composeLifecycleOwner;
                composeLifecycleOwner2.getHighSpeedVideoFpsRanges = androidx.lifecycle.Lifecycle.Event.ON_DESTROY.getTargetState();
                composeLifecycleOwner2.getHighSpeedVideoFpsRanges();
            }
        };
    }
}
