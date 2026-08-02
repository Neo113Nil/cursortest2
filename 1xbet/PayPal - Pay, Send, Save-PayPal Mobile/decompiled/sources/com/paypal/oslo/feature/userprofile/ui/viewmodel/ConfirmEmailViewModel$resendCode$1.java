package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$resendCode$1", f = "ConfirmEmailViewModel.kt", i = {0, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 256, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "this_$iv", "error", "$i$f$fold", "$i$a$-fold-ConfirmEmailViewModel$resendCode$1$1", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "this_$iv", "error", "$i$f$fold", "$i$a$-fold-ConfirmEmailViewModel$resendCode$1$3"}, nl = {378, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmEmailViewModel$resendCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel getHighSpeedVideoSizesFor;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0152, code lost:
    
        if (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel.access$handleError(r6, r5, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.RESEND, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.RESEND_CODE_FAILED, r13) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
    
        if (r14 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
    
        if (r14 != r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge emailConfirmationChallenge;
        com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiateEmailConfirmationUseCase reinitiateEmailConfirmationUseCase;
        java.lang.String str;
        com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase initiateEmailConfirmationUseCase;
        java.lang.String str2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        android.content.Context context;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        android.content.Context context2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow2 = this.getHighSpeedVideoSizesFor.getOutputSizes;
                mutableStateFlow2.setValue(null);
                emailConfirmationChallenge = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizesFor;
                if (emailConfirmationChallenge == null) {
                    initiateEmailConfirmationUseCase = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
                    str2 = this.getHighSpeedVideoSizesFor.getInputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailConfirmationChallenge);
                    this.getOutputFormats = 1;
                    obj = initiateEmailConfirmationUseCase.invoke(str2, this);
                } else {
                    reinitiateEmailConfirmationUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
                    str = this.getHighSpeedVideoSizesFor.getInputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailConfirmationChallenge);
                    this.getOutputFormats = 3;
                    obj = reinitiateEmailConfirmationUseCase.invoke(str, emailConfirmationChallenge.getAuthId(), emailConfirmationChallenge.getChallengeId(), this);
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        emailConfirmationChallenge = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge) this.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either = (arrow.core.Either) obj;
                        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel = this.getHighSpeedVideoSizesFor;
                        if (either instanceof arrow.core.Either.Right) {
                            confirmEmailViewModel.getHighSpeedVideoSizesFor = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge) ((arrow.core.Either.Right) either).getValue();
                            mutableStateFlow5 = confirmEmailViewModel.getOutputSizeshNQ4ISI;
                            mutableStateFlow5.setValue("");
                            mutableStateFlow6 = confirmEmailViewModel.getOutputSizes;
                            mutableStateFlow6.setValue(null);
                            mutableStateFlow7 = confirmEmailViewModel.isOutputSupportedForhNQ4ISI;
                            context2 = confirmEmailViewModel.getHighSpeedVideoFpsRanges;
                            mutableStateFlow7.setValue(context2.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_check_your_email_for_a_new_code));
                        } else if (either instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) ((arrow.core.Either.Left) either).getValue();
                            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailConfirmationChallenge);
                            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailError);
                            this.Camera2StreamConfigurationMap = 0;
                            this.getHighSpeedVideoFpsRangesFor = 0;
                            this.getOutputFormats = 4;
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        mutableStateFlow4 = this.getHighSpeedVideoSizesFor.getOutputStallDuration;
                        mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow4 = this.getHighSpeedVideoSizesFor.getOutputStallDuration;
                mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                return kotlin.Unit.INSTANCE;
            }
            emailConfirmationChallenge = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Either either2 = (arrow.core.Either) obj;
            com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel2 = this.getHighSpeedVideoSizesFor;
            if (either2 instanceof arrow.core.Either.Right) {
                confirmEmailViewModel2.getHighSpeedVideoSizesFor = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge) ((arrow.core.Either.Right) either2).getValue();
                mutableStateFlow3 = confirmEmailViewModel2.isOutputSupportedForhNQ4ISI;
                context = confirmEmailViewModel2.getHighSpeedVideoFpsRanges;
                mutableStateFlow3.setValue(context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_check_your_email_for_a_new_code));
            } else if (either2 instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError2 = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) ((arrow.core.Either.Left) either2).getValue();
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailConfirmationChallenge);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailError2);
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getOutputFormats = 2;
                if (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel.access$handleError(confirmEmailViewModel2, emailError2, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.RESEND, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.RESEND_CODE_FAILED, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutableStateFlow4 = this.getHighSpeedVideoSizesFor.getOutputStallDuration;
            mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutableStateFlow = this.getHighSpeedVideoSizesFor.getOutputStallDuration;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$resendCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$resendCode$1(this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmEmailViewModel$resendCode$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$resendCode$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = confirmEmailViewModel;
    }
}
