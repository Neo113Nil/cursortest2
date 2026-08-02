package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt$AccountsScreen$2$1", f = "AccountsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class AccountsScreenKt$AccountsScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult paymentPreferenceNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.paymentPreferenceUpdated(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type.IN_STORE, paymentPreferenceNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult paymentPreferenceNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt$AccountsScreen$2$1) create(paymentPreferenceNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt$AccountsScreen$2$1 accountsScreenKt$AccountsScreen$2$1 = new com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt$AccountsScreen$2$1(this.getHighSpeedVideoFpsRanges, continuation);
        accountsScreenKt$AccountsScreen$2$1.getHighSpeedVideoFpsRangesFor = obj;
        return accountsScreenKt$AccountsScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountsScreenKt$AccountsScreen$2$1(com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel accountsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt$AccountsScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = accountsViewModel;
    }
}
