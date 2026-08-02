package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabDetailsFetcher;", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchInterstitialDetailsUseCase;", "fetchInterstitialDetails", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchBenefitDetailsUseCase;", "fetchBenefitDetails", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchInterstitialDetailsUseCase;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchBenefitDetailsUseCase;)V", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchInterstitialDetailsUseCase;", "getFetchInterstitialDetails", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchInterstitialDetailsUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchBenefitDetailsUseCase;", "getFetchBenefitDetails", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchBenefitDetailsUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IabDetailsFetcher {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase fetchBenefitDetails;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase fetchInterstitialDetails;

    @javax.inject.Inject
    public IabDetailsFetcher(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase fetchInterstitialDetailsUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase fetchBenefitDetailsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchInterstitialDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchBenefitDetailsUseCase, "");
        this.fetchInterstitialDetails = fetchInterstitialDetailsUseCase;
        this.fetchBenefitDetails = fetchBenefitDetailsUseCase;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase getFetchInterstitialDetails() {
        return this.fetchInterstitialDetails;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase getFetchBenefitDetails() {
        return this.fetchBenefitDetails;
    }
}
