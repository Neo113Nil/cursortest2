package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$TrackStatesAnalytics$1$1", f = "ManageWalletScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ManageWalletScreenKt$TrackStatesAnalytics$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.Pair pair;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState = this.getHighSpeedVideoSizes;
        if (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) {
            if (((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) manageWalletState).getLoadingType() instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Screen) {
                com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.SCREEN_LOADING, this.getHighResolutionOutputSizeshNQ4ISI, null, null, 12, null);
            }
        } else if ((manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess) || (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess)) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.SCREEN_ID, this.getHighResolutionOutputSizeshNQ4ISI, null, null, 12, null);
        } else {
            boolean z = manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError;
            if (z || (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError) || (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) || (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError)) {
                if (z) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError walletInstrumentsError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError) manageWalletState;
                    pair = kotlin.TuplesKt.to(walletInstrumentsError.getErrorTag(), walletInstrumentsError.getErrorType());
                } else if (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError pushProvisioningWidgetError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError) manageWalletState;
                    pair = kotlin.TuplesKt.to(pushProvisioningWidgetError.getErrorTag(), pushProvisioningWidgetError.getErrorType());
                } else if (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError lockUnlockError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) manageWalletState;
                    pair = kotlin.TuplesKt.to(lockUnlockError.getErrorTag(), lockUnlockError.getErrorType());
                } else {
                    if (!(manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError removeWalletError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError) manageWalletState;
                    pair = kotlin.TuplesKt.to(removeWalletError.getErrorTag(), removeWalletError.getErrorType());
                }
                com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardErrorScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.SCREEN_ERROR, this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.String) pair.component1(), ((com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType) pair.component2()).name(), (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module) null, 16, (java.lang.Object) null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$TrackStatesAnalytics$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$TrackStatesAnalytics$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageWalletScreenKt$TrackStatesAnalytics$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$TrackStatesAnalytics$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = manageWalletState;
        this.getHighResolutionOutputSizeshNQ4ISI = userIntentContext;
    }
}
