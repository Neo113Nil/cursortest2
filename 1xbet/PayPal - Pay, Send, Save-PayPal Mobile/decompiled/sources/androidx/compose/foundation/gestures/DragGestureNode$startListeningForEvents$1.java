package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {499, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING, 503, 510, 512, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DUKPT_KEY_INVALID}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureNode$startListeningForEvents$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        if (r8.getHighResolutionOutputSizeshNQ4ISI.drag(new androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1(r1, r8.getHighResolutionOutputSizeshNQ4ISI, null), r8) != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
    
        if (r9 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        if (r9 == r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:28:0x00e8, B:25:0x00cc], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e5 -> B:7:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ec -> B:7:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00fe -> B:7:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0112 -> B:7:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0115 -> B:7:0x0056). Please report as a decompilation issue!!! */
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
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object highSpeedVideoSizes2;
        java.lang.Object highSpeedVideoSizes3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        T t;
        java.lang.Object highSpeedVideoSizes4;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getHighSpeedVideoFpsRanges) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    channel = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                    if (channel != null) {
                        this.Camera2StreamConfigurationMap = coroutineScope;
                        this.getHighSpeedVideoSizes = objectRef4;
                        this.getHighSpeedVideoFpsRangesFor = objectRef4;
                        this.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object receive = channel.receive(this);
                        if (receive != coroutine_suspended) {
                            coroutineScope2 = coroutineScope;
                            objectRef = objectRef4;
                            obj = receive;
                            objectRef2 = objectRef;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef5 = objectRef;
                            t = (androidx.compose.foundation.gestures.DragEvent) obj;
                            objectRef4 = objectRef5;
                            objectRef4.element = t;
                            if (objectRef2.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStarted) {
                                this.Camera2StreamConfigurationMap = coroutineScope2;
                                this.getHighSpeedVideoSizes = objectRef2;
                                this.getHighSpeedVideoFpsRangesFor = null;
                                this.getHighSpeedVideoFpsRanges = 2;
                                highSpeedVideoSizes4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes((androidx.compose.foundation.gestures.DragEvent.DragStarted) objectRef2.element, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
                                if (highSpeedVideoSizes4 != coroutine_suspended) {
                                    objectRef3 = objectRef2;
                                    coroutineScope3 = coroutineScope2;
                                    this.Camera2StreamConfigurationMap = coroutineScope3;
                                    this.getHighSpeedVideoSizes = objectRef3;
                                    this.getHighSpeedVideoFpsRanges = 3;
                                    break;
                                }
                            } else {
                                coroutineScope = coroutineScope2;
                                if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef4;
                    coroutineScope2 = coroutineScope;
                    t = 0;
                    objectRef4.element = t;
                    if (objectRef2.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStarted) {
                    }
                }
            case 1:
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRangesFor;
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.internal.Ref.ObjectRef objectRef52 = objectRef;
                t = (androidx.compose.foundation.gestures.DragEvent) obj;
                objectRef4 = objectRef52;
                objectRef4.element = t;
                if (objectRef2.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStarted) {
                }
                break;
            case 2:
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = coroutineScope3;
                this.getHighSpeedVideoSizes = objectRef3;
                this.getHighSpeedVideoFpsRanges = 3;
                break;
            case 3:
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.util.concurrent.CancellationException unused) {
                    coroutineScope = coroutineScope3;
                    this.Camera2StreamConfigurationMap = coroutineScope;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = 6;
                    highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
                    break;
                }
                kotlin.jvm.internal.Ref.ObjectRef objectRef6 = objectRef3;
                coroutineScope = coroutineScope3;
                if (objectRef6.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                    androidx.compose.foundation.gestures.DragGestureNode dragGestureNode = this.getHighResolutionOutputSizeshNQ4ISI;
                    T t2 = objectRef6.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t2, "");
                    this.Camera2StreamConfigurationMap = coroutineScope;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = 4;
                    highSpeedVideoSizes3 = dragGestureNode.getHighSpeedVideoSizes((androidx.compose.foundation.gestures.DragEvent.DragStopped) t2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
                    if (highSpeedVideoSizes3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                } else {
                    if (objectRef6.element instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled) {
                        this.Camera2StreamConfigurationMap = coroutineScope;
                        this.getHighSpeedVideoSizes = null;
                        this.getHighSpeedVideoFpsRanges = 5;
                        highSpeedVideoSizes2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
                        break;
                    }
                    if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
                break;
            case 4:
            case 5:
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.util.concurrent.CancellationException unused2) {
                    this.Camera2StreamConfigurationMap = coroutineScope;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = 6;
                    highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
                    break;
                }
                if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 6:
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "processDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, ? extends kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.DragEvent> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:6:0x0066). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0060 -> B:5:0x0063). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.jvm.functions.Function1 function1;
            kotlinx.coroutines.channels.Channel channel;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                function1 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoFpsRangesFor;
                if (this.Camera2StreamConfigurationMap.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.DragEvent> objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRanges;
            function1 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            T t = (androidx.compose.foundation.gestures.DragEvent) obj;
            objectRef.element = t;
            if ((this.Camera2StreamConfigurationMap.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) && !(this.Camera2StreamConfigurationMap.element instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled)) {
                androidx.compose.foundation.gestures.DragEvent dragEvent = this.Camera2StreamConfigurationMap.element;
                t = 0;
                androidx.compose.foundation.gestures.DragEvent.DragDelta dragDelta = dragEvent instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta ? (androidx.compose.foundation.gestures.DragEvent.DragDelta) dragEvent : null;
                if (dragDelta != null) {
                    function1.invoke(dragDelta);
                }
                objectRef = this.Camera2StreamConfigurationMap;
                channel = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                if (channel != null) {
                    this.getHighSpeedVideoFpsRangesFor = function1;
                    this.getHighSpeedVideoFpsRanges = objectRef;
                    this.getHighSpeedVideoSizes = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    T t2 = (androidx.compose.foundation.gestures.DragEvent) obj;
                }
                objectRef.element = t2;
                if (this.Camera2StreamConfigurationMap.element instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1) create(function1, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.DragEvent> objectRef, androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = objectRef;
            this.getHighResolutionOutputSizeshNQ4ISI = dragGestureNode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        dragGestureNode$startListeningForEvents$1.Camera2StreamConfigurationMap = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$startListeningForEvents$1(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = dragGestureNode;
    }
}
