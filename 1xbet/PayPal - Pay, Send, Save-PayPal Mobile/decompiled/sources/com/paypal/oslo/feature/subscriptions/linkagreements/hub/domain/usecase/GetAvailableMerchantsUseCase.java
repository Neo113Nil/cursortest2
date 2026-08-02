package com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/usecase/GetAvailableMerchantsUseCase;", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/repository/LinkAgreementsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/repository/LinkAgreementsRepository;)V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "searchText", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "invoke", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/repository/LinkAgreementsRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetAvailableMerchantsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetAvailableMerchantsUseCase(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository linkAgreementsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementsRepository, "");
        this.getHighSpeedVideoSizes = linkAgreementsRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase getAvailableMerchantsUseCase, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return getAvailableMerchantsUseCase.invoke(agreementType, str, continuation);
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, ? extends java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant>>> continuation) {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType searchType;
        if (str == null) {
            searchType = com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType.ALL;
        } else {
            searchType = str.length() == 0 ? com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType.POPULAR : com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType.SEARCH;
        }
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository linkAgreementsRepository = this.getHighSpeedVideoSizes;
        if (searchType != com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType.SEARCH) {
            str = null;
        }
        return linkAgreementsRepository.getAvailableMerchants(agreementType, searchType, str, continuation);
    }
}
