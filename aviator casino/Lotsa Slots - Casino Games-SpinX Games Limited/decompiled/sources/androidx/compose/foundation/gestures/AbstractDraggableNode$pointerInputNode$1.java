package androidx.compose.foundation.gestures;

/* compiled from: Draggable.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", f = "Draggable.kt", i = {}, l = {456}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AbstractDraggableNode$pointerInputNode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.AbstractDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$pointerInputNode$1(androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1(this.this$0, continuation);
        abstractDraggableNode$pointerInputNode$1.L$0 = obj;
        return abstractDraggableNode$pointerInputNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = (androidx.compose.ui.input.pointer.PointerInputScope) this.L$0;
            if (!this.this$0.getEnabled()) {
                return kotlin.Unit.INSTANCE;
            }
            this.label = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1(pointerInputScope, this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: Draggable.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {com.facebook.internal.FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.compose.foundation.gestures.AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1(this.$$this$SuspendingPointerInputModifierNode, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope;
            java.util.concurrent.CancellationException e;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                try {
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (this.$$this$SuspendingPointerInputModifierNode.awaitPointerEventScope(new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.C00101(coroutineScope2, this.this$0, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.util.concurrent.CancellationException e2) {
                    coroutineScope = coroutineScope2;
                    e = e2;
                    if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                        throw e;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.util.concurrent.CancellationException e3) {
                    e = e3;
                    if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* compiled from: Draggable.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", i = {0, 1, 1}, l = {460, 475}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "isDragSuccessful"}, s = {"L$0", "L$0", "I$0"})
        /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00101 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.CoroutineScope $$this$coroutineScope;
            int I$0;
            private /* synthetic */ java.lang.Object L$0;
            java.lang.Object L$1;
            java.lang.Object L$2;
            int label;
            final /* synthetic */ androidx.compose.foundation.gestures.AbstractDraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00101(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.C00101> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = abstractDraggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.C00101 c00101 = new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.C00101(this.$$this$coroutineScope, this.this$0, continuation);
                c00101.L$0 = obj;
                return c00101;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.C00101) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:26|(1:28)|29|30|31|32|33|(1:35)(9:37|9|10|11|(0)(0)|17|18|19|(2:66|67)(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0146, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0159, code lost:
            
                r4 = r16;
                r2 = r19;
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
            
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0150, code lost:
            
                r19 = r5;
                r20 = r6;
                r16 = r7;
                r12 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
            
                r20 = r6;
                r12 = r8;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0108  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0187 A[Catch: all -> 0x0188, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0188, blocks: (B:42:0x015f, B:45:0x0187), top: B:41:0x015f }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x01c5  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01d8  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e6 -> B:9:0x00ed). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0165 -> B:18:0x0182). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01d2 -> B:19:0x0054). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker;
                java.lang.Throwable th;
                androidx.compose.foundation.gestures.DragEvent dragEvent;
                kotlinx.coroutines.channels.Channel channel;
                androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker;
                androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker2;
                java.util.concurrent.CancellationException e;
                kotlinx.coroutines.channels.Channel channel2;
                java.lang.Object obj2;
                kotlin.Pair pair;
                boolean z;
                androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker3;
                kotlinx.coroutines.channels.Channel channel3;
                java.lang.Object m368awaitDragSu4bsnU;
                kotlin.jvm.functions.Function1 function1;
                kotlin.jvm.functions.Function0 function0;
                androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker4;
                androidx.compose.foundation.gestures.DragEvent dragEvent2;
                kotlinx.coroutines.channels.Channel channel4;
                androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker5;
                androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker6;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                int i2 = 0;
                int i3 = 1;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    if (kotlinx.coroutines.CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                    }
                } else if (i == 1) {
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = awaitPointerEventScope;
                    pair = (kotlin.Pair) obj2;
                    if (pair == null) {
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = this.I$0;
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$2;
                    androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode = (androidx.compose.foundation.gestures.AbstractDraggableNode) this.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        m368awaitDragSu4bsnU = obj;
                        defaultConstructorMarker = null;
                    } catch (java.util.concurrent.CancellationException e2) {
                        e = e2;
                        defaultConstructorMarker = null;
                        try {
                            if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            float maximumFlingVelocity = ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                            if (i2 == 0) {
                                velocityTracker = abstractDraggableNode.velocityTracker;
                                long m3376calculateVelocityAH228Gc = velocityTracker.m3376calculateVelocityAH228Gc(androidx.compose.ui.unit.VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                                velocityTracker2 = abstractDraggableNode.velocityTracker;
                                velocityTracker2.resetTracking();
                                dragEvent = new androidx.compose.foundation.gestures.DragEvent.DragStopped(androidx.compose.ui.unit.Velocity.m4723timesadjELrA(m3376calculateVelocityAH228Gc, abstractDraggableNode.getReverseDirection() ? -1.0f : 1.0f), defaultConstructorMarker);
                            } else {
                                dragEvent = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE;
                            }
                            channel = abstractDraggableNode.channel;
                            channel.mo10716trySendJP2dKIU(dragEvent);
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        i2 = i4;
                        defaultConstructorMarker = null;
                        float maximumFlingVelocity2 = ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        if (i2 == 0) {
                        }
                        channel = abstractDraggableNode.channel;
                        channel.mo10716trySendJP2dKIU(dragEvent);
                        throw th;
                    }
                    try {
                    } catch (java.util.concurrent.CancellationException e3) {
                        e = e3;
                        if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                            throw e;
                        }
                        ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        androidx.compose.foundation.gestures.DragEvent.DragCancelled dragCancelled = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE;
                        channel2 = abstractDraggableNode.channel;
                        channel2.mo10716trySendJP2dKIU(dragCancelled);
                        awaitPointerEventScope = awaitPointerEventScope3;
                        defaultConstructorMarker2 = defaultConstructorMarker;
                        i3 = 1;
                        if (kotlinx.coroutines.CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        i2 = i4;
                        float maximumFlingVelocity22 = ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        if (i2 == 0) {
                        }
                        channel = abstractDraggableNode.channel;
                        channel.mo10716trySendJP2dKIU(dragEvent);
                        throw th;
                    }
                    boolean booleanValue = ((java.lang.Boolean) m368awaitDragSu4bsnU).booleanValue();
                    float maximumFlingVelocity3 = ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                    if (booleanValue) {
                        dragEvent2 = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE;
                    } else {
                        velocityTracker5 = abstractDraggableNode.velocityTracker;
                        long m3376calculateVelocityAH228Gc2 = velocityTracker5.m3376calculateVelocityAH228Gc(androidx.compose.ui.unit.VelocityKt.Velocity(maximumFlingVelocity3, maximumFlingVelocity3));
                        velocityTracker6 = abstractDraggableNode.velocityTracker;
                        velocityTracker6.resetTracking();
                        dragEvent2 = new androidx.compose.foundation.gestures.DragEvent.DragStopped(androidx.compose.ui.unit.Velocity.m4723timesadjELrA(m3376calculateVelocityAH228Gc2, abstractDraggableNode.getReverseDirection() ? -1.0f : 1.0f), defaultConstructorMarker);
                    }
                    channel4 = abstractDraggableNode.channel;
                    channel4.mo10716trySendJP2dKIU(dragEvent2);
                    awaitPointerEventScope = awaitPointerEventScope3;
                    defaultConstructorMarker2 = defaultConstructorMarker;
                    i3 = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                        function1 = this.this$0._canDrag;
                        function0 = this.this$0._startDragImmediately;
                        velocityTracker4 = this.this$0.velocityTracker;
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = defaultConstructorMarker2;
                        this.L$2 = defaultConstructorMarker2;
                        this.label = i3;
                        obj2 = androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(awaitPointerEventScope, function1, function0, velocityTracker4, this.this$0.getPointerDirectionConfig(), this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope22 = awaitPointerEventScope;
                        pair = (kotlin.Pair) obj2;
                        if (pair == null) {
                            final androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode2 = this.this$0;
                            kotlinx.coroutines.CoroutineScope coroutineScope2 = this.$$this$coroutineScope;
                            z = abstractDraggableNode2.isListeningForEvents;
                            if (!z) {
                                abstractDraggableNode2.startListeningForEvents();
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) pair.getFirst();
                            long packedValue = ((androidx.compose.ui.geometry.Offset) pair.getSecond()).getPackedValue();
                            velocityTracker3 = abstractDraggableNode2.velocityTracker;
                            channel3 = abstractDraggableNode2.channel;
                            kotlinx.coroutines.channels.Channel channel5 = channel3;
                            boolean reverseDirection = abstractDraggableNode2.getReverseDirection();
                            kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function12 = new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Boolean invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2) {
                                    return java.lang.Boolean.valueOf(!(androidx.compose.foundation.gestures.AbstractDraggableNode.this.getPointerDirectionConfig().mo355calculateDeltaChangek4lQ0M(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2)) == 0.0f));
                                }
                            };
                            this.L$0 = awaitPointerEventScope22;
                            this.L$1 = abstractDraggableNode2;
                            this.L$2 = coroutineScope2;
                            this.I$0 = 0;
                            this.label = 2;
                            kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                            androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode3 = abstractDraggableNode2;
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope22;
                            defaultConstructorMarker = defaultConstructorMarker2;
                            m368awaitDragSu4bsnU = androidx.compose.foundation.gestures.DraggableKt.m368awaitDragSu4bsnU(awaitPointerEventScope22, pointerInputChange, packedValue, velocityTracker3, channel5, reverseDirection, function12, this);
                            if (m368awaitDragSu4bsnU == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            coroutineScope = coroutineScope3;
                            abstractDraggableNode = abstractDraggableNode3;
                            i4 = 0;
                            boolean booleanValue2 = ((java.lang.Boolean) m368awaitDragSu4bsnU).booleanValue();
                            float maximumFlingVelocity32 = ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                            if (booleanValue2) {
                            }
                            channel4 = abstractDraggableNode.channel;
                            channel4.mo10716trySendJP2dKIU(dragEvent2);
                            awaitPointerEventScope = awaitPointerEventScope3;
                            defaultConstructorMarker2 = defaultConstructorMarker;
                            i3 = 1;
                            if (kotlinx.coroutines.CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                return kotlin.Unit.INSTANCE;
                            }
                        } else {
                            awaitPointerEventScope = awaitPointerEventScope22;
                            if (kotlinx.coroutines.CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                            }
                        }
                    }
                }
            }
        }
    }
}
