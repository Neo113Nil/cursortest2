package io.ktor.events;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\f\u0010\rJ?\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/events/Events;", "", "<init>", "()V", "T", "Lio/ktor/events/EventDefinition;", "definition", "Lkotlin/Function1;", "", "Lio/ktor/events/EventHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "subscribe", "(Lio/ktor/events/EventDefinition;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "unsubscribe", "(Lio/ktor/events/EventDefinition;Lkotlin/jvm/functions/Function1;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "raise", "(Lio/ktor/events/EventDefinition;Ljava/lang/Object;)V", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "Lio/ktor/util/internal/LockFreeLinkedListHead;", "Camera2StreamConfigurationMap", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "getHighResolutionOutputSizeshNQ4ISI", "HandlerRegistration"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Events {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.util.collections.CopyOnWriteHashMap<io.ktor.events.EventDefinition<?>, io.ktor.util.internal.LockFreeLinkedListHead> getHighResolutionOutputSizeshNQ4ISI = new io.ktor.util.collections.CopyOnWriteHashMap<>();

    public final <T> kotlinx.coroutines.DisposableHandle subscribe(io.ktor.events.EventDefinition<T> definition, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        io.ktor.events.Events.HandlerRegistration handlerRegistration = new io.ktor.events.Events.HandlerRegistration(handler);
        this.getHighResolutionOutputSizeshNQ4ISI.computeIfAbsent(definition, new kotlin.jvm.functions.Function1() { // from class: io.ktor.events.Events$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.events.Events.$r8$lambda$S81xUZk6Qp0jG5mv589Ojs4Sr64((io.ktor.events.EventDefinition) obj);
            }
        }).addLast(handlerRegistration);
        return handlerRegistration;
    }

    public final <T> void unsubscribe(io.ktor.events.EventDefinition<T> definition, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        io.ktor.util.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.getHighResolutionOutputSizeshNQ4ISI.get(definition);
        if (lockFreeLinkedListHead != null) {
            java.lang.Object next = lockFreeLinkedListHead.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
            for (io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
                if (lockFreeLinkedListNode instanceof io.ktor.events.Events.HandlerRegistration) {
                    io.ktor.events.Events.HandlerRegistration handlerRegistration = (io.ktor.events.Events.HandlerRegistration) lockFreeLinkedListNode;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(handlerRegistration.getHighResolutionOutputSizeshNQ4ISI, handler)) {
                        handlerRegistration.remove();
                    }
                }
            }
        }
    }

    public final <T> void raise(io.ktor.events.EventDefinition<T> definition, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definition, "");
        io.ktor.util.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.getHighResolutionOutputSizeshNQ4ISI.get(definition);
        java.lang.Throwable th = null;
        if (lockFreeLinkedListHead != null) {
            java.lang.Object next = lockFreeLinkedListHead.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
            for (io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
                if (lockFreeLinkedListNode instanceof io.ktor.events.Events.HandlerRegistration) {
                    try {
                        kotlin.jvm.functions.Function1<?, kotlin.Unit> function1 = ((io.ktor.events.Events.HandlerRegistration) lockFreeLinkedListNode).getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(function1, "");
                        ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(value);
                    } catch (java.lang.Throwable th2) {
                        if (th != null) {
                            kotlin.ExceptionsKt.addSuppressed(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR#\u0010\r\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u00058\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/events/Events$HandlerRegistration;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlin/Function1;", "", "Lio/ktor/events/EventHandler;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "dispose", "()V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class HandlerRegistration extends io.ktor.util.internal.LockFreeLinkedListNode implements kotlinx.coroutines.DisposableHandle {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final kotlin.jvm.functions.Function1<?, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

        public HandlerRegistration(kotlin.jvm.functions.Function1<?, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            remove();
        }
    }

    public static /* synthetic */ io.ktor.util.internal.LockFreeLinkedListHead $r8$lambda$S81xUZk6Qp0jG5mv589Ojs4Sr64(io.ktor.events.EventDefinition eventDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDefinition, "");
        return new io.ktor.util.internal.LockFreeLinkedListHead();
    }
}
