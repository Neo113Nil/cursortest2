package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClockDialNode$pointerInputTapNode$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.material3.ClockDialNode Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ long Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.material3.ClockDialNode getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            long j = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges = java.lang.Float.intBitsToFloat((int) (j >> 32));
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            long m5762unboximpl = offset.m5762unboximpl();
            androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = m5762unboximpl;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.material3.ClockDialNode clockDialNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = clockDialNode;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.AnonymousClass1(this.Camera2StreamConfigurationMap, null);
        final androidx.compose.material3.ClockDialNode clockDialNode = this.Camera2StreamConfigurationMap;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.ClockDialNode.this, (androidx.compose.ui.geometry.Offset) obj);
            }
        }, continuation, 3, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.ClockDialNode clockDialNode, androidx.compose.ui.geometry.Offset offset) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(clockDialNode.getCoroutineScope(), null, null, new androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1(clockDialNode, offset, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    ClockDialNode$pointerInputTapNode$1(androidx.compose.material3.ClockDialNode clockDialNode) {
        this.Camera2StreamConfigurationMap = clockDialNode;
    }
}
