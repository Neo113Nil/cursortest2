package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$confirmEmail$1", f = "ConfirmEmailViewModel.kt", i = {1, 1, 1, 1, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 197, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m = "invokeSuspend", n = {"this_$iv", "it", "$i$f$fold", "$i$a$-fold-ConfirmEmailViewModel$confirmEmail$1$2", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-ConfirmEmailViewModel$confirmEmail$1$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 379, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmEmailViewModel$confirmEmail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel.access$handleError(r1, r3, "confirm", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.CONFIRM_FAILED, r14) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r15 != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.userprofile.domain.usecase.ConfirmEmailUseCase confirmEmailUseCase;
        java.lang.String str;
        boolean z;
        java.lang.String str2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow2 = this.getOutputMinFrameDuration.getOutputSizes;
                mutableStateFlow2.setValue(null);
                mutableStateFlow3 = this.getOutputMinFrameDuration.isOutputSupportedFor;
                mutableStateFlow3.setValue(null);
                confirmEmailUseCase = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
                str = this.getOutputMinFrameDuration.getInputSizeshNQ4ISI;
                java.lang.String authId = this.getHighSpeedVideoFpsRanges.getAuthId();
                java.lang.String challengeId = this.getHighSpeedVideoFpsRanges.getChallengeId();
                java.lang.String str3 = this.Camera2StreamConfigurationMap;
                z = this.getOutputMinFrameDuration.getOutputMinFrameDuration;
                str2 = this.getOutputMinFrameDuration.getInputFormats;
                this.getHighSpeedVideoSizesFor = 1;
                obj = confirmEmailUseCase.invoke(str, authId, challengeId, str3, z, str2, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                    } else {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutableStateFlow4 = this.getOutputMinFrameDuration.getOutputMinFrameDurationlomOqCM;
                    mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel = this.getOutputMinFrameDuration;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = (com.paypal.oslo.core.userstore.model.ProfileEmail) ((arrow.core.Either.Right) either).getValue();
                mutableSharedFlow = confirmEmailViewModel.toString;
                com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess confirmationSuccess = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess(profileEmail);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profileEmail);
                this.getHighSpeedVideoSizes = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoSizesFor = 2;
                if (mutableSharedFlow.emit(confirmationSuccess, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow4 = this.getOutputMinFrameDuration.getOutputMinFrameDurationlomOqCM;
                mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                return kotlin.Unit.INSTANCE;
            }
            if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) ((arrow.core.Either.Left) either).getValue();
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailError);
                this.getHighSpeedVideoSizes = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoSizesFor = 3;
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } catch (java.lang.Throwable th) {
            mutableStateFlow = this.getOutputMinFrameDuration.getOutputMinFrameDurationlomOqCM;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$confirmEmail$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$confirmEmail$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmEmailViewModel$confirmEmail$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel, com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge emailConfirmationChallenge, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$confirmEmail$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = confirmEmailViewModel;
        this.getHighSpeedVideoFpsRanges = emailConfirmationChallenge;
        this.Camera2StreamConfigurationMap = str;
    }
}
