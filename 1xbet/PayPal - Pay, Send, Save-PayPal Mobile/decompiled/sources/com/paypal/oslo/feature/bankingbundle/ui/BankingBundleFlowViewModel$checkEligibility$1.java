package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel$checkEligibility$1", f = "BankingBundleFlowViewModel.kt", i = {}, l = {68, 86}, m = "invokeSuspend", n = {}, nl = {69, 161}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BankingBundleFlowViewModel$checkEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0046, code lost:
    
        if (r14 != r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5 A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:6:0x0012, B:7:0x0097, B:9:0x009f, B:11:0x00ad, B:13:0x00b8, B:17:0x00b3, B:18:0x00c5, B:20:0x00c9, B:24:0x00ea, B:26:0x00f8, B:27:0x00fc, B:34:0x0134, B:35:0x0139, B:36:0x013a, B:37:0x013f, B:40:0x001f, B:41:0x0048, B:43:0x0060, B:45:0x0066, B:47:0x006e, B:48:0x0082, B:62:0x0141, B:66:0x0162, B:55:0x002c, B:56:0x0037), top: B:2:0x000c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009f A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:6:0x0012, B:7:0x0097, B:9:0x009f, B:11:0x00ad, B:13:0x00b8, B:17:0x00b3, B:18:0x00c5, B:20:0x00c9, B:24:0x00ea, B:26:0x00f8, B:27:0x00fc, B:34:0x0134, B:35:0x0139, B:36:0x013a, B:37:0x013f, B:40:0x001f, B:41:0x0048, B:43:0x0060, B:45:0x0066, B:47:0x006e, B:48:0x0082, B:62:0x0141, B:66:0x0162, B:55:0x002c, B:56:0x0037), top: B:2:0x000c, inners: #1, #2 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.lang.String str;
        com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase getBankingBundleEligibilityUseCase;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        arrow.core.Either either;
        java.lang.String str2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            try {
                try {
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutableStateFlow3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                        mutableStateFlow3.setValue(com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Loading.INSTANCE);
                        userStore = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                        this.getHighSpeedVideoFpsRangesFor = 1;
                        obj = com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, this, 1, null);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            either = (arrow.core.Either) obj;
                            com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel = this.getHighSpeedVideoFpsRanges;
                            if (!(either instanceof arrow.core.Either.Right)) {
                                com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility bankingBundleEligibility = (com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility) ((arrow.core.Either.Right) either).getValue();
                                if (bankingBundleEligibility.isIdentityVerificationRequired() || bankingBundleEligibility.isIdentityVerificationFailed()) {
                                    new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.StandaloneLandingScreen.IDENTIFIER), null, null, null, 14, null), com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.INSTANCE.getScreenExitAction(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.IDENTITY_VERIFICATION_REQUIRED, null, com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.SOURCE), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.FLOW_NAME, null), null, 16, null).track(com.paypal.oslo.feature.bankingbundle.AnalyticsTrackerKt.analyticsTracker);
                                }
                                mutableStateFlow5 = bankingBundleFlowViewModel.getHighSpeedVideoSizes;
                                mutableStateFlow5.setValue(new com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success(bankingBundleEligibility));
                            } else if (either instanceof arrow.core.Either.Left) {
                                com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError bankingBundleError = (com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError) ((arrow.core.Either.Left) either).getValue();
                                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bankingbundle.LoggerKt.log;
                                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                                if (bankingBundleError instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network) {
                                    str2 = "network";
                                } else if (bankingBundleError instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.NullResponse) {
                                    str2 = "null_response";
                                } else {
                                    if (!(bankingBundleError instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.UserProfileLoadFailed)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    str2 = "user_profile_load_failed";
                                }
                                pairArr[0] = kotlin.TuplesKt.to("errorType", str2);
                                com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail = bankingBundleError.getErrorDetail();
                                pairArr[1] = kotlin.TuplesKt.to("errorCode", errorDetail != null ? errorDetail.getCode() : null);
                                pairArr[2] = kotlin.TuplesKt.to("isRetryable", java.lang.String.valueOf(bankingBundleError.getIsRetryable()));
                                com.paypal.android.logger.Logger.w$default(logger, "Eligibility check failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                                mutableStateFlow4 = bankingBundleFlowViewModel.getHighSpeedVideoSizes;
                                mutableStateFlow4.setValue(new com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error(bankingBundleError));
                            } else {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = false;
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.paypal.oslo.core.userstore.model.User user = (com.paypal.oslo.core.userstore.model.User) obj;
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.bankingbundle.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    pairArr2[0] = kotlin.TuplesKt.to("user_id", user.getId());
                    com.paypal.oslo.core.userstore.model.ProfileName legalName = user.getLegalName();
                    if (legalName == null || (personName = legalName.getPersonName()) == null || (str = personName.getFullName()) == null) {
                        str = "Unknown";
                    }
                    pairArr2[1] = kotlin.TuplesKt.to("user_name", str);
                    com.paypal.android.logger.Logger.d$default(logger2, "User profile loaded successfully", null, kotlin.collections.MapsKt.mapOf(pairArr2), 2, null);
                    getBankingBundleEligibilityUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                    obj = getBankingBundleEligibilityUseCase.invoke("balance_bundle", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    either = (arrow.core.Either) obj;
                    com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel2 = this.getHighSpeedVideoFpsRanges;
                    if (!(either instanceof arrow.core.Either.Right)) {
                    }
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = false;
                    return kotlin.Unit.INSTANCE;
                } catch (java.io.IOException e) {
                    com.paypal.oslo.feature.bankingbundle.LoggerKt.log.e("Failed to load user profile", e);
                    mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                    mutableStateFlow2.setValue(new com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error(com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.UserProfileLoadFailed.INSTANCE));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = false;
                    return unit;
                }
            } catch (java.lang.IllegalStateException e2) {
                com.paypal.oslo.feature.bankingbundle.LoggerKt.log.e("Failed to load user profile", e2);
                mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                mutableStateFlow.setValue(new com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error(com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.UserProfileLoadFailed.INSTANCE));
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = false;
                return unit2;
            }
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel$checkEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel$checkEligibility$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankingBundleFlowViewModel$checkEligibility$1(com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel$checkEligibility$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = bankingBundleFlowViewModel;
    }
}
