package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"dropUnlessStateIsAtLeast", "Lkotlin/Function0;", "", "state", "Landroidx/lifecycle/Lifecycle$State;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "block", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "dropUnlessStarted", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "dropUnlessResumed", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DropUnlessLifecycleKt {
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> dropUnlessStarted(androidx.view.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1207869935, i, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:77)");
        }
        int i3 = i << 3;
        kotlin.jvm.functions.Function0<kotlin.Unit> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(androidx.lifecycle.Lifecycle.State.STARTED, lifecycleOwner, function0, composer, (i3 & 896) | (i3 & 112) | 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highSpeedVideoFpsRanges;
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> dropUnlessResumed(androidx.view.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1331131589, i, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:99)");
        }
        int i3 = i << 3;
        kotlin.jvm.functions.Function0<kotlin.Unit> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(androidx.lifecycle.Lifecycle.State.RESUMED, lifecycleOwner, function0, composer, (i3 & 896) | (i3 & 112) | 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highSpeedVideoFpsRanges;
    }

    private static final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges(final androidx.lifecycle.Lifecycle.State state, final androidx.view.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2057956404, i, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:47)");
        }
        if (state == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            throw new java.lang.IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.".toString());
        }
        boolean changedInstance = composer.changedInstance(lifecycleOwner);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(state.ordinal())) || (i & 6) == 4;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(function0)) && (i & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.lifecycle.compose.DropUnlessLifecycleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.compose.DropUnlessLifecycleKt.$r8$lambda$VavZTAL9PuPuA0x2EIZOoiTbrZk(androidx.view.LifecycleOwner.this, state, function0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = (kotlin.jvm.functions.Function0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function02;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VavZTAL9PuPuA0x2EIZOoiTbrZk(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function0 function0) {
        if (lifecycleOwner.getLifecycle().getCamera2StreamConfigurationMap().isAtLeast(state)) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
