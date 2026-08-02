package com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/subscriptions/CryptoSubscriptionCapabilitiesRepository;", "subscriptionsRepository", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/subscriptions/CryptoSubscriptionCapabilitiesRepository;)V", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/FlowCapability;", "flowCapabilities", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult;", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/subscriptions/CryptoSubscriptionCapabilitiesRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckCryptoProvisioningUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CheckCryptoProvisioningUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository cryptoSubscriptionCapabilitiesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSubscriptionCapabilitiesRepository, "");
        this.getHighSpeedVideoFpsRanges = cryptoSubscriptionCapabilitiesRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> list, kotlin.coroutines.Continuation<? super java.util.Map<com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase$invoke$1 checkCryptoProvisioningUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        java.util.List list2;
        java.lang.Object obj;
        com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult provisioningCheckResult;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase$invoke$1) {
            checkCryptoProvisioningUseCase$invoke$1 = (com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase$invoke$1) continuation;
            if ((checkCryptoProvisioningUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                checkCryptoProvisioningUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj2 = checkCryptoProvisioningUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkCryptoProvisioningUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository cryptoSubscriptionCapabilitiesRepository = this.getHighSpeedVideoFpsRanges;
                    checkCryptoProvisioningUseCase$invoke$1.Camera2StreamConfigurationMap = list;
                    checkCryptoProvisioningUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj2 = cryptoSubscriptionCapabilitiesRepository.getCryptoSubscriptionCapabilities(checkCryptoProvisioningUseCase$invoke$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) checkCryptoProvisioningUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                either = (arrow.core.Either) obj2;
                if (!(either instanceof arrow.core.Either.Right)) {
                    list2 = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    list2 = null;
                }
                if (list2 != null) {
                    java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> list3 = list;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                    for (java.lang.Object obj3 : list3) {
                        linkedHashMap.put(obj3, new com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE));
                    }
                    return linkedHashMap;
                }
                java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> list4 = list;
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
                for (java.lang.Object obj4 : list4) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability = (com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability) obj4;
                    java.util.Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability) obj).getName(), flowCapability.getCapabilityName(), true)) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability subscriptionCapability = (com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability) obj;
                    if (subscriptionCapability == null) {
                        provisioningCheckResult = new com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    } else if (subscriptionCapability.isProvisioningRequired()) {
                        provisioningCheckResult = new com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning(subscriptionCapability);
                    } else {
                        provisioningCheckResult = com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation.INSTANCE;
                    }
                    linkedHashMap2.put(obj4, provisioningCheckResult);
                }
                return linkedHashMap2;
            }
        }
        checkCryptoProvisioningUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase$invoke$1(this, continuation);
        java.lang.Object obj22 = checkCryptoProvisioningUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkCryptoProvisioningUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj22;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        if (list2 != null) {
        }
    }
}
