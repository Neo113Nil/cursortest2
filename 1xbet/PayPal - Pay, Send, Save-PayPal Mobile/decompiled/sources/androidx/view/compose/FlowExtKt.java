package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\r\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0010\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"collectAsStateWithLifecycle", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/StateFlow;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Landroidx/lifecycle/Lifecycle;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlowExtKt {
    public static final <T> androidx.compose.runtime.State<T> collectAsStateWithLifecycle(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i2 & 2) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        androidx.lifecycle.Lifecycle.State state2 = state;
        if ((i2 & 4) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.CoroutineContext coroutineContext2 = coroutineContext;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(743249048, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i3 = i << 3;
        androidx.compose.runtime.State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycleOwner.getLifecycle(), state2, coroutineContext2, composer, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return collectAsStateWithLifecycle;
    }

    public static final <T> androidx.compose.runtime.State<T> collectAsStateWithLifecycle(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        androidx.lifecycle.Lifecycle.State state2 = state;
        if ((i2 & 4) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.CoroutineContext coroutineContext2 = coroutineContext;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1858162195, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:99)");
        }
        kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow2 = stateFlow;
        T value = stateFlow.getValue();
        int i3 = i << 3;
        androidx.compose.runtime.State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow2, value, lifecycle, state2, coroutineContext2, composer, (i & 14) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return collectAsStateWithLifecycle;
    }

    public static final <T> androidx.compose.runtime.State<T> collectAsStateWithLifecycle(kotlinx.coroutines.flow.Flow<? extends T> flow, T t, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i2 & 4) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        androidx.lifecycle.Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.CoroutineContext coroutineContext2 = coroutineContext;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1485997211, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        androidx.compose.runtime.State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(flow, t, lifecycleOwner.getLifecycle(), state2, coroutineContext2, composer, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (57344 & i), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return collectAsStateWithLifecycle;
    }

    public static final <T> androidx.compose.runtime.State<T> collectAsStateWithLifecycle(kotlinx.coroutines.flow.Flow<? extends T> flow, T t, androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        androidx.lifecycle.Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.CoroutineContext coroutineContext2 = coroutineContext;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1977777920, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        java.lang.Object[] objArr = {flow, lifecycle, state2, coroutineContext2};
        boolean changedInstance = composer.changedInstance(lifecycle);
        boolean z = (((i & 7168) ^ 3072) > 2048 && composer.changed(state2.ordinal())) || (i & 3072) == 2048;
        boolean changedInstance2 = composer.changedInstance(coroutineContext2);
        boolean changedInstance3 = composer.changedInstance(flow);
        androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1 rememberedValue = composer.rememberedValue();
        if ((changedInstance | z | changedInstance2 | changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, coroutineContext2, flow, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.State<T> produceState = androidx.compose.runtime.SnapshotStateKt.produceState((java.lang.Object) t, objArr, (kotlin.jvm.functions.Function2) rememberedValue, composer, (i >> 3) & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return produceState;
    }
}
