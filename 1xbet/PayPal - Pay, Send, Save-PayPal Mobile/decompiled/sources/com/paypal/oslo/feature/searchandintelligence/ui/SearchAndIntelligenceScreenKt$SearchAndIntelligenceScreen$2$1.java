package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1", f = "SearchAndIntelligenceScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType user;
        java.lang.Class<?> cls;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String message = this.getHighSpeedVideoFpsRangesFor.getMessage();
        java.lang.String str = null;
        if (kotlin.text.StringsKt.isBlank(message)) {
            message = null;
        }
        if (message == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Initial prompt message is blank", null, null, 6, null);
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
        com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage = this.getHighSpeedVideoFpsRangesFor;
        if (initialMessage instanceof com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local) {
            user = com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.INSTANCE.user(false, false);
        } else {
            if (!(initialMessage instanceof com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            user = com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.INSTANCE.user(((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt) this.getHighSpeedVideoFpsRangesFor).getSilent(), true);
        }
        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel = this.getHighSpeedVideoSizes;
        androidx.navigation3.runtime.NavKey previousDestination = this.Camera2StreamConfigurationMap.getPreviousDestination();
        if (previousDestination != null && (cls = previousDestination.getClass()) != null) {
            str = cls.getSimpleName();
        }
        chatViewModel.processEvent(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt(message, user, str));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1 searchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1 = new com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        searchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1.getInputSizeshNQ4ISI = obj;
        return searchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage, com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = initialMessage;
        this.getHighSpeedVideoSizes = chatViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
