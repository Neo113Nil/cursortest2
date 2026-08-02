package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PointerMoveDetectorKt$detectMoves$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.coroutines.CoroutineContext context = getContext();
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.getHighSpeedVideoFpsRangesFor.awaitPointerEventScope(new androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1(context, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"}, v = 1)
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARN: Type inference failed for: r8v15, types: [T, androidx.compose.ui.geometry.Offset] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0043 -> B:5:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
            androidx.compose.ui.geometry.Offset m5741boximpl;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                awaitPointerEventScope = awaitPointerEventScope2;
                if (kotlinx.coroutines.JobKt.isActive(this.getHighSpeedVideoFpsRangesFor)) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                int type = pointerEvent.getType();
                if (!androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk()) || androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7184getEnter7fucELk()) || androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk())) {
                    m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(((androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent.getChanges())).getPosition());
                    if (androidx.compose.ui.geometry.Offset.m5748equalsimpl(m5741boximpl.m5762unboximpl(), objectRef.element)) {
                        m5741boximpl = null;
                    }
                    if (m5741boximpl != null) {
                        kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                        long m5762unboximpl = m5741boximpl.m5762unboximpl();
                        objectRef.element = androidx.compose.ui.geometry.Offset.m5741boximpl(m5762unboximpl);
                        function1.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(m5762unboximpl));
                    }
                }
                if (kotlinx.coroutines.JobKt.isActive(this.getHighSpeedVideoFpsRangesFor)) {
                    this.getHighSpeedVideoSizesFor = awaitPointerEventScope;
                    this.getHighSpeedVideoSizes = objectRef;
                    this.Camera2StreamConfigurationMap = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(this.getHighSpeedVideoFpsRanges, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    int type2 = pointerEvent2.getType();
                    if (!androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(type2, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk())) {
                    }
                    m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(((androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent2.getChanges())).getPosition());
                    if (androidx.compose.ui.geometry.Offset.m5748equalsimpl(m5741boximpl.m5762unboximpl(), objectRef.element)) {
                    }
                    if (m5741boximpl != null) {
                    }
                    if (kotlinx.coroutines.JobKt.isActive(this.getHighSpeedVideoFpsRangesFor)) {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoSizesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = coroutineContext;
            this.getHighSpeedVideoFpsRanges = pointerEventPass;
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PointerMoveDetectorKt$detectMoves$2(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pointerInputScope;
        this.getHighResolutionOutputSizeshNQ4ISI = pointerEventPass;
        this.getHighSpeedVideoSizes = function1;
    }
}
