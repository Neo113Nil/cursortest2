package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/AutodetectCardRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AutodetectCardRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "callErrorMapper", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/AutodetectCardsEntityMapper;", "autodetectCardsEntityMapper", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/AutodetectCardsEntityMapper;Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "cardNumber", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AutodetectCardBrandEntity;", "autodetectCard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/AutodetectCardsEntityMapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutodetectCardRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository {
    private final com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.AutodetectCardsEntityMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @javax.inject.Inject
    public AutodetectCardRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.AutodetectCardsEntityMapper autodetectCardsEntityMapper, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autodetectCardsEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.Camera2StreamConfigurationMap = callErrorMapper;
        this.getHighSpeedVideoFpsRangesFor = autodetectCardsEntityMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = localeProvider;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository
    public final java.lang.Object autodetectCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AutodetectCardBrandEntity>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl$autodetectCard$2(this, str, null), continuation);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.AutodetectCardBrandDTO access$mapToAutodetectCardBrandDTO(com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl autodetectCardRepositoryImpl, com.paypal.oslo.feature.inappcheckout.graphql.cards.AutodetectCardQuery.AutodetectCard autodetectCard) {
        return new com.paypal.oslo.feature.inappcheckout.data.dto.AutodetectCardBrandDTO(autodetectCard.getBrand().name());
    }
}
