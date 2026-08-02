package com.paypal.oslo.feature.identity.moreoptions.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsBottomSheetKt$MoreOptionsBottomSheetContent$2$1", f = "MoreOptionsBottomSheet.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class MoreOptionsBottomSheetKt$MoreOptionsBottomSheetContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect> flow = this.getHighSpeedVideoSizes;
            final com.paypal.pds.components.BottomSheetController bottomSheetController = this.Camera2StreamConfigurationMap;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsBottomSheetKt$MoreOptionsBottomSheetContent$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect moreOptionsUiEffect = (com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect) obj2;
                    if (moreOptionsUiEffect instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect.NavigateToAuthentication) {
                        com.paypal.pds.components.BottomSheetController.this.hideSheet();
                        function1.invoke(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect.NavigateToAuthentication) moreOptionsUiEffect).getAuthenticationType());
                    } else {
                        if (!(moreOptionsUiEffect instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect.CloseBottomSheet)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.pds.components.BottomSheetController.this.hideSheet();
                        function0.invoke();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsBottomSheetKt$MoreOptionsBottomSheetContent$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsBottomSheetKt$MoreOptionsBottomSheetContent$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MoreOptionsBottomSheetKt$MoreOptionsBottomSheetContent$2$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect> flow, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsBottomSheetKt$MoreOptionsBottomSheetContent$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = flow;
        this.Camera2StreamConfigurationMap = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = function0;
    }
}
