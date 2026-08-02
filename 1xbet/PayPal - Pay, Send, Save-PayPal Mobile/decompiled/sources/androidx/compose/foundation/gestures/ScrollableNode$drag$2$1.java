package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", i = {}, l = {371}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ScrollableNode$drag$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.NestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope = (androidx.compose.foundation.gestures.NestedScrollScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
            final androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.ScrollableNode$drag$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.ScrollableNode$drag$2$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.NestedScrollScope.this, scrollingLogic, (androidx.compose.foundation.gestures.DragEvent.DragDelta) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            };
            this.getHighSpeedVideoSizes = 1;
            if (function2.invoke(function1, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, androidx.compose.foundation.gestures.DragEvent.DragDelta dragDelta) {
        nestedScrollScope.mo1491scrollByWithOverscrollOzD1aCk(androidx.compose.ui.geometry.Offset.m5759timestuRUvjQ(scrollingLogic.m1536singleAxisOffsetMKHz9U(dragDelta.getDelta()), dragDelta.getIsIndirectPointerEvent() ? -1.0f : 1.0f), androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollableNode$drag$2$1) create(nestedScrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new androidx.compose.foundation.gestures.ScrollableNode$drag$2$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        scrollableNode$drag$2$1.getHighSpeedVideoFpsRangesFor = obj;
        return scrollableNode$drag$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ScrollableNode$drag$2$1(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollableNode$drag$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = scrollingLogic;
    }
}
