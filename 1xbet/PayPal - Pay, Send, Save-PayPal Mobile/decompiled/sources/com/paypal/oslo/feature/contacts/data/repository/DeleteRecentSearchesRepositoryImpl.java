package com.paypal.oslo.feature.contacts.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/contacts/data/repository/DeleteRecentSearchesRepositoryImpl;", "Lcom/paypal/oslo/feature/contacts/domain/repository/DeleteRecentSearchesRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;", "mapper", "<init>", "(Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;)V", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearchError;", "", "deleteRecentSearches", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeleteRecentSearchesRepositoryImpl implements com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchesRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DeleteRecentSearchesRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactDomainModelMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        this.getHighSpeedVideoFpsRangesFor = contactDomainModelMapper;
    }

    @Override // com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchesRepository
    public final java.lang.Object deleteRecentSearches(com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl$deleteRecentSearches$2(this, networkType, null), continuation);
    }
}
