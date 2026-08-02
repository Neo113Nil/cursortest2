package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/CardActivationNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$7$1", f = "AccountSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AccountSummaryScreenKt$AccountSummaryScreen$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CardActivationNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CardActivationNavResult cardActivationNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CardActivationNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$7$1.WhenMappings.$EnumSwitchMapping$0[cardActivationNavResult.getAction().ordinal()] != 1) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_card_activation_success_toast_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        this.getHighResolutionOutputSizeshNQ4ISI.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnReload.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CardActivationNavResult cardActivationNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$7$1) create(cardActivationNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CardActivationAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CardActivationAction.CARD_ACTIVATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$7$1 accountSummaryScreenKt$AccountSummaryScreen$7$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$7$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        accountSummaryScreenKt$AccountSummaryScreen$7$1.getHighSpeedVideoSizes = obj;
        return accountSummaryScreenKt$AccountSummaryScreen$7$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSummaryScreenKt$AccountSummaryScreen$7$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel accountSummaryViewModel, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$7$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = accountSummaryViewModel;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
