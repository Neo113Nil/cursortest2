package com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/usecase/MergeBulkUpdateResultsUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;", "existingResult", "newResult", "invoke", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MergeBulkUpdateResultsUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MergeBulkUpdateResultsUseCase() {
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult invoke(com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult existingResult, com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult newResult) {
        if (existingResult == null && newResult == null) {
            return null;
        }
        if (newResult == null) {
            return existingResult;
        }
        if (existingResult == null) {
            return newResult;
        }
        java.util.List list = kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.toSet(kotlin.collections.CollectionsKt.plus((java.util.Collection) existingResult.getSuccessfulAgreementIds(), (java.lang.Iterable) newResult.getSuccessfulAgreementIds())));
        java.util.Map<java.lang.String, java.lang.String> failedAgreements = existingResult.getFailedAgreements();
        java.util.List<java.lang.String> successfulAgreementIds = newResult.getSuccessfulAgreementIds();
        java.util.Map<java.lang.String, java.lang.String> failedAgreements2 = newResult.getFailedAgreements();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : failedAgreements.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (!successfulAgreementIds.contains(key)) {
                createMapBuilder.put(key, value);
            }
        }
        createMapBuilder.putAll(failedAgreements2);
        return new com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult(list, kotlin.collections.MapsKt.build(createMapBuilder));
    }
}
