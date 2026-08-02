package com.paypal.oslo.feature.businesshome.data.repository.mock;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/repository/mock/DemoAccountSetupRepository;", "Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupError;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "getAccountSetupStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;", "type", "", "completeStep", "(Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPayGetPaidVerificationComplete", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "setPayGetPaidVerificationComplete", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAccountSetupComplete", "setAccountSetupComplete", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DemoAccountSetupRepository implements com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository {
    public static final int $stable = 8;
    private final java.util.Set<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashSet();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DemoAccountSetupRepository() {
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object getAccountSetupStatus(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError, com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus>> continuation) {
        if (com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.INSTANCE.getSimulateAccountSetupError()) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError.NetworkError.INSTANCE);
        }
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus = new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep[]{new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.CONFIRM_EMAIL, this.getHighResolutionOutputSizeshNQ4ISI.contains(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.CONFIRM_EMAIL)), new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.ADD_BANK_ACCOUNT, this.getHighResolutionOutputSizeshNQ4ISI.contains(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.ADD_BANK_ACCOUNT)), new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.VERIFY_ACCOUNT, this.getHighResolutionOutputSizeshNQ4ISI.contains(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.VERIFY_ACCOUNT))}), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.REQUEST_DEBIT_CARD, this.getHighResolutionOutputSizeshNQ4ISI.contains(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.REQUEST_DEBIT_CARD))));
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.businesshome.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> setupSteps = accountSetupStatus.getSetupSteps();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setupSteps, 10));
        for (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep accountSetupStep : setupSteps) {
            com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType type = accountSetupStep.getType();
            boolean isCompleted = accountSetupStep.isCompleted();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(type);
            sb.append("=");
            sb.append(isCompleted);
            arrayList.add(sb.toString());
        }
        pairArr[0] = kotlin.TuplesKt.to("setupSteps", arrayList.toString());
        java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> recommendedSteps = accountSetupStatus.getRecommendedSteps();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(recommendedSteps, 10));
        for (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep accountSetupStep2 : recommendedSteps) {
            com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType type2 = accountSetupStep2.getType();
            boolean isCompleted2 = accountSetupStep2.isCompleted();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(type2);
            sb2.append("=");
            sb2.append(isCompleted2);
            arrayList2.add(sb2.toString());
        }
        pairArr[1] = kotlin.TuplesKt.to("recommendedSteps", arrayList2.toString());
        com.paypal.android.logger.Logger.d$default(logger, "Retrieved account setup status", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        return arrow.core.EitherKt.right(accountSetupStatus);
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object completeStep(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(accountSetupStepType);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object isPayGetPaidVerificationComplete(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoSizes);
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object setPayGetPaidVerificationComplete(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighSpeedVideoSizes = z;
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object isAccountSetupComplete(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object setAccountSetupComplete(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighSpeedVideoFpsRangesFor = z;
        return kotlin.Unit.INSTANCE;
    }
}
