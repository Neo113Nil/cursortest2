package com.paypal.oslo.feature.identity.unifiedalert.domain.usecase;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/usecase/UnifiedAlertUseCase;", "", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/UnifiedAlertsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/UnifiedAlertsRepository;)V", "", "documentId", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertAction;", "action", "source", "", "acceptableClaims", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertsError;", "", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertAction;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/UnifiedAlertsRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UnifiedAlertUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public UnifiedAlertUseCase(com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository unifiedAlertsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertsRepository, "");
        this.getHighSpeedVideoFpsRanges = unifiedAlertsRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase unifiedAlertUseCase, java.lang.String str, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction unifiedAlertAction, java.lang.String str2, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return unifiedAlertUseCase.invoke(str, unifiedAlertAction, str2, list, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction unifiedAlertAction, java.lang.String str2, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoFpsRanges.validateAlert(str, unifiedAlertAction, str2, list, continuation);
    }
}
