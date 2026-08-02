package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004H\u0096@¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/CardRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardRepository;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "getFIMetadata", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardMetadata;", "getCardBrand"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CardRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository
    public final java.lang.Object getFIMetadata(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity>> continuation) {
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity(kotlin.collections.CollectionsKt.emptyList()));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository
    public final java.lang.Object getCardBrand(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata>> continuation) {
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata("VISA"));
    }
}
