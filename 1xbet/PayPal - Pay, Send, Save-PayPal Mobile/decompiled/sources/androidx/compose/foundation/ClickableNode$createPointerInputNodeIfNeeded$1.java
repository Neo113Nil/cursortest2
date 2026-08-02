package androidx.compose.foundation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClickableNode$createPointerInputNodeIfNeeded$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.foundation.ClickableNode getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1", f = "Clickable.kt", i = {}, l = {885}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.ClickableNode Camera2StreamConfigurationMap;
        /* synthetic */ long getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.PressGestureScope pressGestureScope = (androidx.compose.foundation.gestures.PressGestureScope) this.getHighSpeedVideoSizes;
                long j = this.getHighSpeedVideoFpsRanges;
                if (this.Camera2StreamConfigurationMap.getEnabled()) {
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (this.Camera2StreamConfigurationMap.m1256handlePressInteractiond4ec7I(pressGestureScope, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        private java.lang.Object getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoSizes = pressGestureScope;
            anonymousClass1.getHighSpeedVideoFpsRanges = j;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return getHighSpeedVideoFpsRanges(pressGestureScope, offset.m5762unboximpl(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.ClickableNode clickableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.Camera2StreamConfigurationMap = clickableNode;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null);
        final androidx.compose.foundation.ClickableNode clickableNode = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object detectTapAndPress = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1.getHighSpeedVideoSizes(androidx.compose.foundation.ClickableNode.this);
                return highSpeedVideoSizes;
            }
        }, continuation);
        return detectTapAndPress == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapAndPress : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.ClickableNode clickableNode) {
        if (clickableNode.getEnabled()) {
            clickableNode.getOnClick().invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    ClickableNode$createPointerInputNodeIfNeeded$1(androidx.compose.foundation.ClickableNode clickableNode) {
        this.getHighSpeedVideoFpsRangesFor = clickableNode;
    }
}
