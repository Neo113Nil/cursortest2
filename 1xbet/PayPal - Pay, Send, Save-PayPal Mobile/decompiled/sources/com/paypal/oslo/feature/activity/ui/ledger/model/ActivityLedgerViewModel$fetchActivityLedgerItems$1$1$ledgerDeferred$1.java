package com.paypal.oslo.feature.activity.ui.ledger.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1$1$ledgerDeferred$1", f = "ActivityLedgerViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerViewModel$fetchActivityLedgerItems$1$1$ledgerDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r6 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase activityLedgerFilterUseCase;
        com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase activityLedgerUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) obj;
            }
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null))) {
            com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper activityLedgerViewModelHelper = com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper.INSTANCE;
            activityLedgerUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = activityLedgerViewModelHelper.fetchLedgerItems$activity_prodRelease(activityLedgerUseCase, this);
        } else {
            com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper activityLedgerViewModelHelper2 = com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper.INSTANCE;
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.getHighResolutionOutputSizeshNQ4ISI;
            activityLedgerFilterUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 2;
            obj = activityLedgerViewModelHelper2.fetchLedgerFilterItems$activity_prodRelease(activityFilterType, activityLedgerFilterUseCase, this);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1$1$ledgerDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1$1$ledgerDeferred$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerViewModel$fetchActivityLedgerItems$1$1$ledgerDeferred$1(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1$1$ledgerDeferred$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityFilterType;
        this.getHighSpeedVideoFpsRangesFor = activityLedgerViewModel;
    }
}
