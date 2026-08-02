package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CreateAccountActivityLogUseCase;", "", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;)V", "", "reason", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;", "userInput", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreateAccountActivityLogUseCase {

    @java.lang.Deprecated
    public static final java.lang.String ACCOUNT_TYPE_BUSINESS = "BUSINESS";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase.Companion Companion = new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CreateAccountActivityLogUseCase(com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountRepository, "");
        this.Camera2StreamConfigurationMap = closeAccountRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r9 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog>> continuation) {
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase$invoke$1 createAccountActivityLogUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile closeAccountUserProfile;
        if (continuation instanceof com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase$invoke$1) {
            createAccountActivityLogUseCase$invoke$1 = (com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase$invoke$1) continuation;
            if ((createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = createAccountActivityLogUseCase$invoke$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile>> userProfileForCloseAccount = this.Camera2StreamConfigurationMap.getUserProfileForCloseAccount();
                    createAccountActivityLogUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoSizes = closeAccountUserInput;
                    createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(userProfileForCloseAccount, createAccountActivityLogUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    closeAccountUserInput = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput) createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoSizes;
                    str = (java.lang.String) createAccountActivityLogUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either != null && (closeAccountUserProfile = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile) either.getOrNull()) != null) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(closeAccountUserProfile.getAccountType(), "BUSINESS")) {
                        closeAccountUserProfile = null;
                    }
                    if (closeAccountUserProfile != null) {
                        com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog buildAccountActivityLog = com.paypal.oslo.feature.settings.closeaccount.domain.builder.AccountClosureDataBuilder.INSTANCE.buildAccountActivityLog(closeAccountUserProfile, str, closeAccountUserInput);
                        com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository = this.Camera2StreamConfigurationMap;
                        createAccountActivityLogUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeAccountUserInput);
                        createAccountActivityLogUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeAccountUserProfile);
                        createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildAccountActivityLog);
                        createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoFpsRanges = 2;
                        java.lang.Object createAccountActivityLog = closeAccountRepository.createAccountActivityLog(buildAccountActivityLog, createAccountActivityLogUseCase$invoke$1);
                        return createAccountActivityLog == coroutine_suspended ? coroutine_suspended : createAccountActivityLog;
                    }
                }
                return null;
            }
        }
        createAccountActivityLogUseCase$invoke$1 = new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = createAccountActivityLogUseCase$invoke$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = createAccountActivityLogUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either != null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(closeAccountUserProfile.getAccountType(), "BUSINESS")) {
            }
            if (closeAccountUserProfile != null) {
            }
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CreateAccountActivityLogUseCase$Companion;", "", "<init>", "()V", "", "ACCOUNT_TYPE_BUSINESS", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
