package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContentStateful$4$1", f = "PayModeActivity.kt", i = {}, l = {531}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeActivityKt$PayModeActivityContentStateful$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContentStateful$4$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState> getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel = this.Camera2StreamConfigurationMap;
            final androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState> mutableState = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt.access$handleScreenStateEvent((com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents) obj, payModeViewModel, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContentStateful$4$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContentStateful$4$1.AnonymousClass1.getHighSpeedVideoSizes(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
            mutableState.setValue(screenState);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState> mutableState) {
            this.Camera2StreamConfigurationMap = payModeViewModel;
            this.getHighSpeedVideoSizes = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoSizes.getEvents().collect(new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContentStateful$4$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContentStateful$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContentStateful$4$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeActivityKt$PayModeActivityContentStateful$4$1(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContentStateful$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = payModeViewModel;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
