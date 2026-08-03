package androidx.compose.foundation.text;

/* compiled from: PointerMoveDetector.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class PointerMoveDetectorKt$detectMoves$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> $onMove;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass $pointerEventPass;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope $this_detectMoves;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PointerMoveDetectorKt$detectMoves$2(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2> continuation) {
        super(2, continuation);
        this.$this_detectMoves = pointerInputScope;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.coroutines.CoroutineContext context = getContext();
            this.label = 1;
            if (this.$this_detectMoves.awaitPointerEventScope(new androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null), this) == coroutine_suspended) {
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

    /* compiled from: PointerMoveDetector.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.coroutines.CoroutineContext $currentContext;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> $onMove;
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass $pointerEventPass;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentContext = coroutineContext;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
        /* JADX WARN: Type inference failed for: r8v15, types: [T, androidx.compose.ui.geometry.Offset] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0043 -> B:5:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
            androidx.compose.ui.geometry.Offset m1860boximpl;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                awaitPointerEventScope = awaitPointerEventScope2;
                if (kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                int type = pointerEvent.getType();
                if (!androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk()) || androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3228getEnter7fucELk()) || androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3229getExit7fucELk())) {
                    m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(((androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent.getChanges())).getPosition());
                    if (androidx.compose.ui.geometry.Offset.m1867equalsimpl(m1860boximpl.getPackedValue(), objectRef.element)) {
                        m1860boximpl = null;
                    }
                    if (m1860boximpl != null) {
                        kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function1 = this.$onMove;
                        long packedValue = m1860boximpl.getPackedValue();
                        objectRef.element = androidx.compose.ui.geometry.Offset.m1860boximpl(packedValue);
                        function1.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(packedValue));
                    }
                }
                if (kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = objectRef;
                    this.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(this.$pointerEventPass, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    int type2 = pointerEvent2.getType();
                    if (!androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(type2, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk())) {
                    }
                    m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(((androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent2.getChanges())).getPosition());
                    if (androidx.compose.ui.geometry.Offset.m1867equalsimpl(m1860boximpl.getPackedValue(), objectRef.element)) {
                    }
                    if (m1860boximpl != null) {
                    }
                    if (kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
    }
}
