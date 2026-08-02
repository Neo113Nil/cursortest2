package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$initUserProfileInfo$1", f = "ActivityLedgerBaseViewModel.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, nl = {149}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerBaseViewModel$initUserProfileInfo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.core.userstore.UserStore userStore;
        arrow.core.Either either;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile activityUserProfile;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider activityUserInfoProvider = com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider.INSTANCE;
                userStore = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = activityUserInfoProvider.fetchUserProfile$activity_prodRelease(userStore, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            either = ((arrow.core.Ior) obj).toEither();
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logUserStateException$activity_prodRelease("initUserProfileInfo", e);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(null);
        }
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult data = ((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) ((arrow.core.Either.Right) either).getValue()).getData();
            if (data instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile) {
                activityUserProfile = (com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile) data;
                mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                mutableStateFlow2.setValue(activityUserProfile);
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logUserStateError$activity_prodRelease("initUserProfileInfo");
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logUserStateError$activity_prodRelease("initUserProfileInfo");
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        activityUserProfile = null;
        mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        mutableStateFlow2.setValue(activityUserProfile);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$initUserProfileInfo$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$initUserProfileInfo$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerBaseViewModel$initUserProfileInfo$1(com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel activityLedgerBaseViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$initUserProfileInfo$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activityLedgerBaseViewModel;
    }
}
