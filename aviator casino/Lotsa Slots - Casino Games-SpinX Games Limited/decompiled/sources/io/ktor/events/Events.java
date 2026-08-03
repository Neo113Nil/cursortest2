package io.ktor.events;

/* compiled from: Events.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\f\u0010\rJ?\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/ktor/events/Events;", "", "<init>", "()V", "T", "Lio/ktor/events/EventDefinition;", "definition", "Lkotlin/Function1;", "", "Lio/ktor/events/EventHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "subscribe", "(Lio/ktor/events/EventDefinition;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "unsubscribe", "(Lio/ktor/events/EventDefinition;Lkotlin/jvm/functions/Function1;)V", "value", "raise", "(Lio/ktor/events/EventDefinition;Ljava/lang/Object;)V", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "Lio/ktor/util/internal/LockFreeLinkedListHead;", "handlers", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "HandlerRegistration", "ktor-events"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Events {
    private final io.ktor.util.collections.CopyOnWriteHashMap<io.ktor.events.EventDefinition<?>, io.ktor.util.internal.LockFreeLinkedListHead> handlers = new io.ktor.util.collections.CopyOnWriteHashMap<>();

    public final <T> kotlinx.coroutines.DisposableHandle subscribe(io.ktor.events.EventDefinition<T> definition, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definition, "definition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        io.ktor.events.Events.HandlerRegistration handlerRegistration = new io.ktor.events.Events.HandlerRegistration(handler);
        this.handlers.computeIfAbsent(definition, new kotlin.jvm.functions.Function1() { // from class: io.ktor.events.Events$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                io.ktor.util.internal.LockFreeLinkedListHead subscribe$lambda$0;
                subscribe$lambda$0 = io.ktor.events.Events.subscribe$lambda$0((io.ktor.events.EventDefinition) obj);
                return subscribe$lambda$0;
            }
        }).addLast(handlerRegistration);
        return handlerRegistration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.util.internal.LockFreeLinkedListHead subscribe$lambda$0(io.ktor.events.EventDefinition it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new io.ktor.util.internal.LockFreeLinkedListHead();
    }

    public final <T> void unsubscribe(io.ktor.events.EventDefinition<T> definition, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definition, "definition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        io.ktor.util.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        if (lockFreeLinkedListHead != null) {
            java.lang.Object next = lockFreeLinkedListHead.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
                if (lockFreeLinkedListNode instanceof io.ktor.events.Events.HandlerRegistration) {
                    io.ktor.events.Events.HandlerRegistration handlerRegistration = (io.ktor.events.Events.HandlerRegistration) lockFreeLinkedListNode;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(handlerRegistration.getHandler(), handler)) {
                        handlerRegistration.remove();
                    }
                }
            }
        }
    }

    public final <T> void raise(io.ktor.events.EventDefinition<T> definition, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definition, "definition");
        io.ktor.util.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        java.lang.Throwable th = null;
        if (lockFreeLinkedListHead != null) {
            java.lang.Object next = lockFreeLinkedListHead.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
                if (lockFreeLinkedListNode instanceof io.ktor.events.Events.HandlerRegistration) {
                    try {
                        kotlin.jvm.functions.Function1<?, kotlin.Unit> handler = ((io.ktor.events.Events.HandlerRegistration) lockFreeLinkedListNode).getHandler();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise, kotlin.Unit>");
                        ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(handler, 1)).invoke(value);
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

    /* compiled from: Events.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR)\u0010\u0006\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/events/Events$HandlerRegistration;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlin/Function1;", "", "Lio/ktor/events/EventHandler;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "dispose", "()V", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "ktor-events"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class HandlerRegistration extends io.ktor.util.internal.LockFreeLinkedListNode implements kotlinx.coroutines.DisposableHandle {
        private final kotlin.jvm.functions.Function1<?, kotlin.Unit> handler;

        public HandlerRegistration(kotlin.jvm.functions.Function1<?, kotlin.Unit> handler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
            this.handler = handler;
        }

        public final kotlin.jvm.functions.Function1<?, kotlin.Unit> getHandler() {
            return this.handler;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            remove();
        }
    }
}
