package com.paypal.oslo.feature.contacts.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/contacts/data/repository/CreateRecentSearchRepositoryImpl;", "Lcom/paypal/oslo/feature/contacts/domain/repository/CreateRecentSearchRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;", "mapper", "<init>", "(Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;)V", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearchError;", "", "createContactRecentSearch", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "createStringRecentSearch", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreateRecentSearchRepositoryImpl implements com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CreateRecentSearchRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactDomainModelMapper, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        this.getHighResolutionOutputSizeshNQ4ISI = contactDomainModelMapper;
    }

    @Override // com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository
    public final java.lang.Object createContactRecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl$executeMutation$2(this, new com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str), null, this.getHighResolutionOutputSizeshNQ4ISI.mapNetworkTypeToGraphQL(networkType), 2, null), null), continuation);
    }

    @Override // com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository
    public final java.lang.Object createStringRecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl$executeMutation$2(this, new com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput(null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str), this.getHighResolutionOutputSizeshNQ4ISI.mapNetworkTypeToGraphQL(networkType), 1, null), null), continuation);
    }
}
