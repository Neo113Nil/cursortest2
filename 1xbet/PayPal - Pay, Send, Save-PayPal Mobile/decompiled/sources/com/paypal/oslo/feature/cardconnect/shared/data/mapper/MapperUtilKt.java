package com.paypal.oslo.feature.cardconnect.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "toSchemaType", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapperUtilKt {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName toSchemaType(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProduct, "");
        int i = com.paypal.oslo.feature.cardconnect.shared.data.mapper.MapperUtilKt.WhenMappings.$EnumSwitchMapping$0[debitCardProduct.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.CONSUMER_DEBIT_CARD;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.BUSINESS_DEBIT_CARD;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.values().length];
            try {
                iArr[com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.CONSUMER_DEBIT_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.BUSINESS_DEBIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
