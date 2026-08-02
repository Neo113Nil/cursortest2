package com.zettle.sdk.commons.state;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\bJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/commons/state/MutableState;", "T", "Lcom/zettle/sdk/commons/state/State;", "Lkotlin/Function1;", "action", "", "update", "(Lkotlin/jvm/functions/Function1;)Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface MutableState<T> extends com.zettle.sdk.commons.state.State<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.state.MutableState.Companion INSTANCE = com.zettle.sdk.commons.state.MutableState.Companion.getHighSpeedVideoFpsRangesFor;

    boolean update(kotlin.jvm.functions.Function1<? super T, ? extends T> action);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/commons/state/MutableState$Companion;", "", "<init>", "()V", "T", "initial", "Lkotlin/Function2;", "", "mutate", "Lcom/zettle/sdk/commons/state/MutableState;", "create", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "defaultEventsLoop", "create$core_publicRelease", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lcom/zettle/sdk/commons/thread/EventsLoop;)Lcom/zettle/sdk/commons/state/MutableState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.commons.state.MutableState.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.commons.state.MutableState.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.zettle.sdk.commons.state.MutableState create$default(com.zettle.sdk.commons.state.MutableState.Companion companion, java.lang.Object obj, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj2) {
            if ((i & 2) != 0) {
                function2 = null;
            }
            return companion.create(obj, function2);
        }

        public final <T> com.zettle.sdk.commons.state.MutableState<T> create(T initial, kotlin.jvm.functions.Function2<? super T, ? super T, kotlin.Unit> mutate) {
            return new com.zettle.sdk.commons.state.StateImpl(initial, mutate, new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.thread.EventsLoop>() { // from class: com.zettle.sdk.commons.state.MutableState$Companion$create$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final com.zettle.sdk.commons.thread.EventsLoop invoke() {
                    return com.zettle.sdk.commons.thread.EventsLoop.INSTANCE.getMain();
                }
            });
        }

        public final <T> com.zettle.sdk.commons.state.MutableState<T> create$core_publicRelease(T initial, kotlin.jvm.functions.Function2<? super T, ? super T, kotlin.Unit> mutate, final com.zettle.sdk.commons.thread.EventsLoop defaultEventsLoop) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultEventsLoop, "");
            return new com.zettle.sdk.commons.state.StateImpl(initial, mutate, new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.thread.EventsLoop>() { // from class: com.zettle.sdk.commons.state.MutableState$Companion$create$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final com.zettle.sdk.commons.thread.EventsLoop invoke() {
                    return com.zettle.sdk.commons.thread.EventsLoop.this;
                }

                {
                    super(0);
                }
            });
        }
    }
}
