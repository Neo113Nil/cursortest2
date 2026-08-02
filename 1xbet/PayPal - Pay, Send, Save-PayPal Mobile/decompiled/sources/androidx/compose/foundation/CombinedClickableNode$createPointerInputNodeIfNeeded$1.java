package androidx.compose.foundation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CombinedClickableNode$createPointerInputNodeIfNeeded$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.foundation.CombinedClickableNode getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function0 function0;
        kotlin.jvm.functions.Function0 function02;
        if (this.getHighSpeedVideoSizes.getEnabled()) {
            function02 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            if (function02 != null) {
                final androidx.compose.foundation.CombinedClickableNode combinedClickableNode = this.getHighSpeedVideoSizes;
                function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.getHighSpeedVideoFpsRanges(androidx.compose.foundation.CombinedClickableNode.this);
                    }
                };
                if (this.getHighSpeedVideoSizes.getEnabled()) {
                    function0 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                    if (function0 != null) {
                        final androidx.compose.foundation.CombinedClickableNode combinedClickableNode2 = this.getHighSpeedVideoSizes;
                        function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.getHighSpeedVideoSizes(androidx.compose.foundation.CombinedClickableNode.this);
                            }
                        };
                        androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3 anonymousClass3 = new androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3(this.getHighSpeedVideoSizes, null);
                        final androidx.compose.foundation.CombinedClickableNode combinedClickableNode3 = this.getHighSpeedVideoSizes;
                        java.lang.Object detectTapGestures = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures(pointerInputScope, function1, function12, anonymousClass3, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.CombinedClickableNode.this);
                            }
                        }, continuation);
                        return detectTapGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures : kotlin.Unit.INSTANCE;
                    }
                }
                function12 = null;
                androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3 anonymousClass32 = new androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3(this.getHighSpeedVideoSizes, null);
                final androidx.compose.foundation.CombinedClickableNode combinedClickableNode32 = this.getHighSpeedVideoSizes;
                java.lang.Object detectTapGestures2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures(pointerInputScope, function1, function12, anonymousClass32, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.CombinedClickableNode.this);
                    }
                }, continuation);
                if (detectTapGestures2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
            }
        }
        function1 = null;
        if (this.getHighSpeedVideoSizes.getEnabled()) {
        }
        function12 = null;
        androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3 anonymousClass322 = new androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3(this.getHighSpeedVideoSizes, null);
        final androidx.compose.foundation.CombinedClickableNode combinedClickableNode322 = this.getHighSpeedVideoSizes;
        java.lang.Object detectTapGestures22 = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures(pointerInputScope, function1, function12, anonymousClass322, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.CombinedClickableNode.this);
            }
        }, continuation);
        if (detectTapGestures22 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", i = {}, l = {org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_TRANSPARENT_INDEX}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.foundation.CombinedClickableNode getHighSpeedVideoFpsRanges;
        /* synthetic */ long getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.PressGestureScope pressGestureScope = (androidx.compose.foundation.gestures.PressGestureScope) this.getHighResolutionOutputSizeshNQ4ISI;
                long j = this.getHighSpeedVideoSizes;
                if (this.getHighSpeedVideoFpsRanges.getEnabled()) {
                    this.Camera2StreamConfigurationMap = 1;
                    if (this.getHighSpeedVideoFpsRanges.m1256handlePressInteractiond4ec7I(pressGestureScope, j, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            long m5762unboximpl = offset.m5762unboximpl();
            androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3 anonymousClass3 = new androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3(this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass3.getHighResolutionOutputSizeshNQ4ISI = pressGestureScope;
            anonymousClass3.getHighSpeedVideoSizes = m5762unboximpl;
            return anonymousClass3.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(androidx.compose.foundation.CombinedClickableNode combinedClickableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1.AnonymousClass3> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoFpsRanges = combinedClickableNode;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.CombinedClickableNode combinedClickableNode) {
        if (combinedClickableNode.getEnabled()) {
            combinedClickableNode.getOnClick().invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.CombinedClickableNode combinedClickableNode) {
        kotlin.jvm.functions.Function0 function0;
        function0 = combinedClickableNode.Camera2StreamConfigurationMap;
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.CombinedClickableNode combinedClickableNode) {
        kotlin.jvm.functions.Function0 function0;
        function0 = combinedClickableNode.getHighResolutionOutputSizeshNQ4ISI;
        if (function0 != null) {
            function0.invoke();
        }
        if (combinedClickableNode.getGetHighSpeedVideoSizes()) {
            ((androidx.compose.ui.hapticfeedback.HapticFeedback) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(combinedClickableNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback())).mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6717getLongPress5zf0vsI());
        }
        return kotlin.Unit.INSTANCE;
    }

    CombinedClickableNode$createPointerInputNodeIfNeeded$1(androidx.compose.foundation.CombinedClickableNode combinedClickableNode) {
        this.getHighSpeedVideoSizes = combinedClickableNode;
    }
}
