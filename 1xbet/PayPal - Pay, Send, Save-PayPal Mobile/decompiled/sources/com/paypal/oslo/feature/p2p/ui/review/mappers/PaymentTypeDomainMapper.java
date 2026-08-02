package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentTypeDomainMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", "", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;)Ljava/lang/String;", "p2pType", "toMmpId", "mmpId", "toP2pType", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", "MmpPaymentTypeIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTypeDomainMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.PaymentType, java.lang.String> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper();

    private PaymentTypeDomainMapper() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentTypeDomainMapper$MmpPaymentTypeIds;", "", "<init>", "()V", "", com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.FRIENDS_FAMILY, "Ljava/lang/String;", com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.GOODS_SERVICES}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MmpPaymentTypeIds {
        public static final int $stable = 0;
        public static final java.lang.String FRIENDS_FAMILY = "FRIENDS_FAMILY";
        public static final java.lang.String GOODS_SERVICES = "GOODS_SERVICES";
        public static final com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds();

        private MmpPaymentTypeIds() {
        }
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final java.lang.String map(com.paypal.oslo.feature.p2p.domain.model.PaymentType input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.WhenMappings.$EnumSwitchMapping$0[input.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.FRIENDS_FAMILY;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.GOODS_SERVICES;
    }

    public final java.lang.String toMmpId(com.paypal.oslo.feature.p2p.domain.model.PaymentType p2pType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pType, "");
        return map(p2pType);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentType toP2pType(java.lang.String mmpId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mmpId, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(mmpId, com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.FRIENDS_FAMILY)) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentType.PERSONAL;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(mmpId, com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.GOODS_SERVICES)) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentType.PURCHASE;
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentType.PERSONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentType.PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
