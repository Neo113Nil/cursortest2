package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "flowWithLifecycle", "(Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlowExtKt {
    public static /* synthetic */ kotlinx.coroutines.flow.Flow flowWithLifecycle$default(kotlinx.coroutines.flow.Flow flow, androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(flow, lifecycle, state);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flowWithLifecycle(kotlinx.coroutines.flow.Flow<? extends T> flow, androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.view.FlowExtKt$flowWithLifecycle$1(lifecycle, state, flow, null));
    }
}
