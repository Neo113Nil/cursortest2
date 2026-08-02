package com.paypal.oslo.feature.inappcheckout.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/mapper/AutodetectCardsEntityMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/AutodetectCardBrandDTO;", "dto", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AutodetectCardBrandEntity;", "toDomain", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/AutodetectCardBrandDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AutodetectCardBrandEntity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutodetectCardsEntityMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AutodetectCardsEntityMapper() {
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.AutodetectCardBrandEntity toDomain(com.paypal.oslo.feature.inappcheckout.data.dto.AutodetectCardBrandDTO dto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dto, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.AutodetectCardBrandEntity(dto.getBrand());
    }
}
