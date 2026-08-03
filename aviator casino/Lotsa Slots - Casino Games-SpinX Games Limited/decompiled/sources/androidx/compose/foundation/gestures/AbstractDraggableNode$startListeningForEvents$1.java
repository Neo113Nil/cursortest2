package androidx.compose.foundation.gestures;

/* compiled from: Draggable.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "$this$launch", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "$this$launch", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class AbstractDraggableNode$startListeningForEvents$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.AbstractDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$startListeningForEvents$1(androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1 abstractDraggableNode$startListeningForEvents$1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1(this.this$0, continuation);
        abstractDraggableNode$startListeningForEvents$1.L$0 = obj;
        return abstractDraggableNode$startListeningForEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:19|20|(1:39)|22|23|24|(2:29|(2:31|(1:33)))(2:26|(1:28))|8|(2:43|44)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd A[Catch: CancellationException -> 0x0102, TryCatch #0 {CancellationException -> 0x0102, blocks: (B:24:0x00c7, B:26:0x00cd, B:29:0x00e9, B:31:0x00ef), top: B:23:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9 A[Catch: CancellationException -> 0x0102, TryCatch #0 {CancellationException -> 0x0102, blocks: (B:24:0x00c7, B:26:0x00cd, B:29:0x00e9, B:31:0x00ef), top: B:23:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e6 -> B:8:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ed -> B:8:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ff -> B:8:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0114 -> B:7:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0117 -> B:8:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlinx.coroutines.CoroutineScope coroutineScope3;
        kotlinx.coroutines.CoroutineScope coroutineScope4;
        java.lang.Object processDragCancel;
        java.lang.Object processDragCancel2;
        java.lang.Object processDragStop;
        T t;
        java.lang.Object processDragStart;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    channel = this.this$0.channel;
                    this.L$0 = coroutineScope;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef;
                    this.label = 1;
                    java.lang.Object receive = channel.receive(this);
                    if (receive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope;
                    t = receive;
                    objectRef2 = objectRef;
                    objectRef.element = t;
                    if (!(objectRef2.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStarted)) {
                        this.L$0 = coroutineScope2;
                        this.L$1 = objectRef2;
                        this.L$2 = null;
                        this.label = 2;
                        processDragStart = this.this$0.processDragStart(coroutineScope2, (androidx.compose.foundation.gestures.DragEvent.DragStarted) objectRef2.element, this);
                        if (processDragStart == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef3 = objectRef2;
                        coroutineScope3 = coroutineScope2;
                        this.L$0 = coroutineScope3;
                        this.L$1 = objectRef3;
                        this.label = 3;
                        if (this.this$0.drag(new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1(objectRef3, this.this$0, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope3;
                        if (objectRef3.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                            androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode = this.this$0;
                            T t2 = objectRef3.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                            this.L$0 = coroutineScope;
                            this.L$1 = null;
                            this.label = 4;
                            processDragStop = abstractDraggableNode.processDragStop(coroutineScope, (androidx.compose.foundation.gestures.DragEvent.DragStopped) t2, this);
                            if (processDragStop == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (objectRef3.element instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled) {
                            this.L$0 = coroutineScope;
                            this.L$1 = null;
                            this.label = 5;
                            processDragCancel2 = this.this$0.processDragCancel(coroutineScope, this);
                            if (processDragCancel2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        coroutineScope = coroutineScope2;
                        if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                    }
                }
            case 1:
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                t = obj;
                objectRef.element = t;
                if (!(objectRef2.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStarted)) {
                }
                break;
            case 2:
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope3;
                this.L$1 = objectRef3;
                this.label = 3;
                if (this.this$0.drag(new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1(objectRef3, this.this$0, null), this) == coroutine_suspended) {
                }
                coroutineScope = coroutineScope3;
                if (objectRef3.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                }
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 3:
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.util.concurrent.CancellationException unused) {
                    coroutineScope4 = coroutineScope3;
                    this.L$0 = coroutineScope4;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = this.this$0.processDragCancel(coroutineScope4, this);
                    if (processDragCancel == coroutine_suspended) {
                    }
                    coroutineScope = coroutineScope4;
                    if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
                coroutineScope = coroutineScope3;
                if (objectRef3.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                }
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 4:
                coroutineScope4 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.util.concurrent.CancellationException unused2) {
                    this.L$0 = coroutineScope4;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = this.this$0.processDragCancel(coroutineScope4, this);
                    if (processDragCancel == coroutine_suspended) {
                    }
                    coroutineScope = coroutineScope4;
                    if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
                coroutineScope = coroutineScope4;
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 5:
                coroutineScope4 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope4;
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 6:
                coroutineScope4 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope4;
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/AbstractDragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0, 1}, l = {437, 438}, m = "invokeSuspend", n = {"$this$drag", "$this$drag"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.AbstractDragScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.DragEvent> $event;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        final /* synthetic */ androidx.compose.foundation.gestures.AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.DragEvent> objectRef, androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = objectRef;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1(this.$event, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.compose.foundation.gestures.AbstractDragScope abstractDragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1) create(abstractDragScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:6:0x0084). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.foundation.gestures.AbstractDragScope abstractDragScope;
            androidx.compose.foundation.gestures.AbstractDragScope abstractDragScope2;
            kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.DragEvent> objectRef;
            kotlinx.coroutines.channels.Channel channel;
            java.lang.Object receive;
            T t;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                abstractDragScope = (androidx.compose.foundation.gestures.AbstractDragScope) this.L$0;
                if (this.$event.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i == 1) {
                abstractDragScope = (androidx.compose.foundation.gestures.AbstractDragScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                abstractDragScope2 = abstractDragScope;
                objectRef = this.$event;
                channel = this.this$0.channel;
                this.L$0 = abstractDragScope2;
                this.L$1 = objectRef;
                this.label = 2;
                receive = channel.receive(this);
                t = receive;
                if (receive == coroutine_suspended) {
                }
                objectRef.element = t;
                abstractDragScope = abstractDragScope2;
                if (this.$event.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
            abstractDragScope2 = (androidx.compose.foundation.gestures.AbstractDragScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            t = obj;
            objectRef.element = t;
            abstractDragScope = abstractDragScope2;
            if ((this.$event.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) && !(this.$event.element instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled)) {
                androidx.compose.foundation.gestures.DragEvent dragEvent = this.$event.element;
                if ((dragEvent instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta ? (androidx.compose.foundation.gestures.DragEvent.DragDelta) dragEvent : null) != null) {
                    androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode = this.this$0;
                    androidx.compose.foundation.gestures.DragEvent dragEvent2 = this.$event.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(dragEvent2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta");
                    this.L$0 = abstractDragScope;
                    this.L$1 = null;
                    this.label = 1;
                    if (abstractDraggableNode.draggingBy(abstractDragScope, (androidx.compose.foundation.gestures.DragEvent.DragDelta) dragEvent2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                abstractDragScope2 = abstractDragScope;
                objectRef = this.$event;
                channel = this.this$0.channel;
                this.L$0 = abstractDragScope2;
                this.L$1 = objectRef;
                this.label = 2;
                receive = channel.receive(this);
                t = receive;
                if (receive == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef.element = t;
                abstractDragScope = abstractDragScope2;
                if (this.$event.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
