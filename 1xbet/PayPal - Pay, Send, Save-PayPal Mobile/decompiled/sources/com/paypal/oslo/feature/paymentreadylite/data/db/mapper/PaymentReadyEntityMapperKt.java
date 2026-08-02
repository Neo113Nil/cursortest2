package com.paypal.oslo.feature.paymentreadylite.data.db.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\tH\u0000¢\u0006\u0004\b\u0007\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyRecommendationEntity;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;", "toDomain", "(Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyRecommendationEntity;)Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;", "", "createdAt", "updatedAt", "toEntity", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;JJ)Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyRecommendationEntity;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;)Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyRecommendationEntity;", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyApiStatusEntity;", "toApiStatusEntity", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;)Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyApiStatusEntity;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentReadyEntityMapperKt {
    public static final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation toDomain(com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity paymentReadyRecommendationEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReadyRecommendationEntity, "");
        return new com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation(paymentReadyRecommendationEntity.getSessionId(), paymentReadyRecommendationEntity.getInPayPalNetwork(), com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentOptionMapperKt.toDomain(paymentReadyRecommendationEntity.getRecommendations()));
    }

    public static final com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity toEntity(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation paymentRecommendation, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendation, "");
        return new com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity(0L, paymentRecommendation.getSessionId(), paymentRecommendation.getInPayPalNetwork(), com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentOptionMapperKt.toDto(paymentRecommendation.getRecommendations()), j, j2, 1, null);
    }

    public static final com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity toEntity(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot paymentRecommendationSnapshot) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationSnapshot, "");
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation recommendation = paymentRecommendationSnapshot.getRecommendation();
        if (recommendation != null) {
            return toEntity(recommendation, paymentRecommendationSnapshot.getTimestamp(), paymentRecommendationSnapshot.getTimestamp());
        }
        return null;
    }

    public static final com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity toApiStatusEntity(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot paymentRecommendationSnapshot) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationSnapshot, "");
        return new com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity(0L, paymentRecommendationSnapshot.getApiName(), com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentRecommendationApiStatusMapperKt.toDto(paymentRecommendationSnapshot.getFetchStatus()), paymentRecommendationSnapshot.getTimestamp(), paymentRecommendationSnapshot.getTimestamp(), 1, null);
    }
}
