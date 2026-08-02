package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel$loadOptions$1", f = "AddUserAccountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AddUserAccountViewModel$loadOptions$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<java.lang.String> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase getAddUserAccountOptionsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Loading.INSTANCE);
            java.util.List<java.lang.String> list = this.getHighSpeedVideoSizes;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : list) {
                try {
                    linkProfileOptionType = com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType.valueOf(str);
                } catch (java.lang.IllegalArgumentException e) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, str);
                    java.lang.String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    pairArr[1] = kotlin.TuplesKt.to("error", message);
                    com.paypal.android.logger.Logger.w$default(logger, "Invalid link profile option", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    linkProfileOptionType = null;
                }
                if (linkProfileOptionType != null) {
                    arrayList.add(linkProfileOptionType);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow2.setValue(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2));
            getAddUserAccountOptionsUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> invoke = getAddUserAccountOptionsUseCase.invoke(arrayList2);
            mutableStateFlow3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success(invoke));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel$loadOptions$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel$loadOptions$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddUserAccountViewModel$loadOptions$1(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel$loadOptions$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = addUserAccountViewModel;
        this.getHighSpeedVideoSizes = list;
    }
}
