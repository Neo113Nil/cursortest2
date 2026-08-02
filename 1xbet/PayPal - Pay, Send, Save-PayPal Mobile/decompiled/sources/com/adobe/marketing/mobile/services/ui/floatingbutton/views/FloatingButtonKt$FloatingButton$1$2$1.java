package com.adobe.marketing.mobile.services.ui.floatingbutton.views;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1", f = "FloatingButton.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class FloatingButtonKt$FloatingButton$1$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.geometry.Offset> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;
    int getOutputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> getOutputMinFrameDuration;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1 floatingButtonKt$FloatingButton$1$2$1 = new com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        floatingButtonKt$FloatingButton$1$2$1.getInputFormats = obj;
        return floatingButtonKt$FloatingButton$1$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FloatingButtonKt$FloatingButton$1$2$1(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, androidx.compose.runtime.MutableState<androidx.compose.ui.geometry.Offset> mutableState, androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState2, float f, androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState3, float f2, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = mutableState;
        this.getOutputMinFrameDuration = mutableState2;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = mutableState3;
        this.Camera2StreamConfigurationMap = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = (androidx.compose.ui.input.pointer.PointerInputScope) this.getInputFormats;
            final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.runtime.MutableState<androidx.compose.ui.geometry.Offset> mutableState = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1.1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    function1.invoke(mutableState.getValue());
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }
            };
            final androidx.compose.runtime.MutableState<androidx.compose.ui.geometry.Offset> mutableState2 = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState3 = this.getOutputMinFrameDuration;
            final float f = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState4 = this.getHighSpeedVideoFpsRangesFor;
            final float f2 = this.Camera2StreamConfigurationMap;
            this.getOutputFormats = 1;
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, function0, null, new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1.2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = pointerInputChange;
                    long m5762unboximpl = offset.m5762unboximpl();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInputChange2, "");
                    androidx.compose.ui.input.pointer.PointerEventKt.consumeAllChanges(pointerInputChange2);
                    mutableState2.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.OffsetKt.Offset(kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.geometry.Offset.m5752getXimpl(mutableState2.getValue().m5762unboximpl()) + androidx.compose.ui.geometry.Offset.m5752getXimpl(m5762unboximpl), 0.0f, pointerInputScope.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(mutableState3.getValue().m8615unboximpl() - f))), kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.geometry.Offset.m5753getYimpl(mutableState2.getValue().m5762unboximpl()) + androidx.compose.ui.geometry.Offset.m5753getYimpl(m5762unboximpl), 0.0f, pointerInputScope.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(mutableState4.getValue().m8615unboximpl() - f2))))));
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }, this, 5, null) == coroutine_suspended) {
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
}
