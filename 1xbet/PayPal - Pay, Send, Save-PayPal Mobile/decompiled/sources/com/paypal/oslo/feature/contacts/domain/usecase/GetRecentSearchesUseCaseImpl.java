package com.paypal.oslo.feature.contacts.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/usecase/GetRecentSearchesUseCaseImpl;", "Lcom/paypal/oslo/feature/contacts/api/usecase/GetRecentContactsUseCase;", "Lcom/paypal/oslo/feature/contacts/domain/repository/RecentSearchesRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/contacts/domain/repository/RecentSearchesRepository;)V", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearchError;", "", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "invoke", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/contacts/domain/repository/RecentSearchesRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetRecentSearchesUseCaseImpl implements com.paypal.oslo.feature.contacts.api.usecase.GetRecentContactsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.domain.repository.RecentSearchesRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetRecentSearchesUseCaseImpl(com.paypal.oslo.feature.contacts.domain.repository.RecentSearchesRepository recentSearchesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearchesRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = recentSearchesRepository;
    }

    @Override // com.paypal.oslo.feature.contacts.api.usecase.GetRecentContactsUseCase
    public final java.lang.Object invoke(com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.RecentSearch>>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRecentSearches(networkType, continuation);
    }
}
