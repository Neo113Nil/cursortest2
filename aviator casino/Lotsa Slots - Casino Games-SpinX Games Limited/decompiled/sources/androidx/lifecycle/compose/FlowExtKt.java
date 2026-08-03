package androidx.lifecycle.compose;

/* compiled from: FlowExt.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0010\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"collectAsStateWithLifecycle", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowExtKt {
    public static final <T> androidx.compose.runtime.State<T> collectAsStateWithLifecycle(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(743249048);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(collectAsStateWithLifecycle)P(1,2)57@2516L7,60@2656L162:FlowExt.kt#2vxrgp");
        if ((i2 & 1) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            lifecycleOwner = (androidx.lifecycle.LifecycleOwner) consume;
        }
        if ((i2 & 2) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        androidx.lifecycle.Lifecycle.State state2 = state;
        if ((i2 & 4) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        androidx.compose.runtime.State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycleOwner.getLifecycle(), state2, coroutineContext, composer, ((i << 3) & 7168) | 33288, 0);
        composer.endReplaceableGroup();
        return collectAsStateWithLifecycle;
    }

    public static final <T> androidx.compose.runtime.State<T> collectAsStateWithLifecycle(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1858162195);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(collectAsStateWithLifecycle)P(1,2)94@4179L147:FlowExt.kt#2vxrgp");
        if ((i2 & 2) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        androidx.lifecycle.Lifecycle.State state2 = state;
        if ((i2 & 4) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        androidx.compose.runtime.State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycle, state2, coroutineContext, composer, ((i << 3) & 7168) | 33288, 0);
        composer.endReplaceableGroup();
        return collectAsStateWithLifecycle;
    }

    public static final <T> androidx.compose.runtime.State<T> collectAsStateWithLifecycle(kotlinx.coroutines.flow.Flow<? extends T> flow, T t, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1485997211);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(collectAsStateWithLifecycle)P(1,2,3)129@5706L7,132@5846L164:FlowExt.kt#2vxrgp");
        if ((i2 & 2) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            lifecycleOwner = (androidx.lifecycle.LifecycleOwner) consume;
        }
        if ((i2 & 4) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        androidx.lifecycle.Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        androidx.compose.runtime.State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(flow, t, lifecycleOwner.getLifecycle(), state2, coroutineContext, composer, (((i >> 3) & 8) << 3) | 33288 | (i & 112) | (i & 7168), 0);
        composer.endReplaceableGroup();
        return collectAsStateWithLifecycle;
    }

    public static final <T> androidx.compose.runtime.State<T> collectAsStateWithLifecycle(kotlinx.coroutines.flow.Flow<? extends T> flow, T t, androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1977777920);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(collectAsStateWithLifecycle)P(1,2,3)169@7405L428:FlowExt.kt#2vxrgp");
        if ((i2 & 4) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        androidx.lifecycle.Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.CoroutineContext coroutineContext2 = coroutineContext;
        java.lang.Object[] objArr = {flow, lifecycle, state2, coroutineContext2};
        androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1 flowExtKt$collectAsStateWithLifecycle$1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1(lifecycle, state2, coroutineContext2, flow, null);
        int i3 = i >> 3;
        androidx.compose.runtime.State<T> produceState = androidx.compose.runtime.SnapshotStateKt.produceState((java.lang.Object) t, objArr, (kotlin.jvm.functions.Function2) flowExtKt$collectAsStateWithLifecycle$1, composer, (i3 & 14) | (i3 & 8) | 576);
        composer.endReplaceableGroup();
        return produceState;
    }
}
