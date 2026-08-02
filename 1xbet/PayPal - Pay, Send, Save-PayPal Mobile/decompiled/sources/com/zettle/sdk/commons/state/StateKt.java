package com.zettle.sdk.commons.state;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Lkotlin/Function1;", "", "block", "Lcom/zettle/sdk/commons/state/StateObserver;", "stateObserver", "(Lkotlin/jvm/functions/Function1;)Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "Lkotlinx/coroutines/flow/Flow;", "asFlow", "(Lcom/zettle/sdk/commons/state/State;Lcom/zettle/sdk/commons/thread/EventsLoop;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StateKt {
    public static final <T> com.zettle.sdk.commons.state.StateObserver<T> stateObserver(final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new com.zettle.sdk.commons.state.StateObserver<T>() { // from class: com.zettle.sdk.commons.state.StateKt$stateObserver$1
            @Override // com.zettle.sdk.commons.state.StateObserver
            public final void onNext(T state) {
                function1.invoke(state);
            }
        };
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(com.zettle.sdk.commons.state.State<T> state, com.zettle.sdk.commons.thread.EventsLoop eventsLoop) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.zettle.sdk.commons.state.StateKt$asFlow$1(state, eventsLoop, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow asFlow$default(com.zettle.sdk.commons.state.State state, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            eventsLoop = com.zettle.sdk.commons.thread.EventsLoop.INSTANCE.getBackground();
        }
        return asFlow(state, eventsLoop);
    }
}
