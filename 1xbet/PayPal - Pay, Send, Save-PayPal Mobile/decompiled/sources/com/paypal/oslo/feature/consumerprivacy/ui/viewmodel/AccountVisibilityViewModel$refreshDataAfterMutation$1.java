package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel", f = "AccountVisibilityViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "refreshDataAfterMutation", n = {"previousState"}, nl = {356}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class AccountVisibilityViewModel$refreshDataAfterMutation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.access$refreshDataAfterMutation(this.getHighSpeedVideoSizes, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityViewModel$refreshDataAfterMutation$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$refreshDataAfterMutation$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = accountVisibilityViewModel;
    }
}
