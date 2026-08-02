package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductTier;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditProductTier;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductTier;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductTier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductTier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductTierMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier revolvingCreditProductTier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductTier, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.ProductTierMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditProductTier.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier.MASTERCARD_WORLD;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier.MASTERCARD_STANDARD;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier.MASTERCARD_WORLD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier.MASTERCARD_STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
