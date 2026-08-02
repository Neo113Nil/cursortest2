package com.paypal.oslo.feature.identity.unifiedalert.domain.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJD\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/UnifiedAlertsRepository;", "", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/FetchUnifiedAlertsInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertsError;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "fetchAlerts", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/FetchUnifiedAlertsInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "documentId", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertAction;", "action", "source", "", "acceptableClaims", "", "validateAlert", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertAction;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UnifiedAlertsRepository {
    java.lang.Object fetchAlerts(com.paypal.oslo.feature.identity.unifiedalert.domain.model.FetchUnifiedAlertsInput fetchUnifiedAlertsInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert>> continuation);

    java.lang.Object validateAlert(java.lang.String str, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction unifiedAlertAction, java.lang.String str2, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError, kotlin.Unit>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object validateAlert$default(com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository unifiedAlertsRepository, java.lang.String str, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction unifiedAlertAction, java.lang.String str2, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateAlert");
        }
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return unifiedAlertsRepository.validateAlert(str, unifiedAlertAction, str2, list, continuation);
    }
}
