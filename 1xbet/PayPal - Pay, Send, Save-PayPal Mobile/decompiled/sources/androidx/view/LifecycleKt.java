package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)Lkotlinx/coroutines/flow/Flow;", "eventFlow"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleKt {
    public static final androidx.view.LifecycleCoroutineScope getCoroutineScope(androidx.view.Lifecycle lifecycle) {
        androidx.view.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        do {
            androidx.view.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (androidx.view.LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new androidx.view.LifecycleCoroutineScopeImpl(lifecycle, kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate()));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final kotlinx.coroutines.flow.Flow<androidx.lifecycle.Lifecycle.Event> getEventFlow(androidx.view.Lifecycle lifecycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.view.LifecycleKt$eventFlow$1(lifecycle, null)), kotlinx.coroutines.Dispatchers.getMain().getImmediate());
    }
}
