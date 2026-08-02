package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PrePaymentDisclosure;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PrePaymentDisclosure {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PrePaymentDisclosure.Companion INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PrePaymentDisclosure.Companion(null);
    private static final com.apollographql.apollo.api.UnionType type = new com.apollographql.apollo.api.UnionType("PrePaymentDisclosure", com.paypal.oslo.api.graphql.schema.type.PaymentCannotBeReversedDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.ConfirmPurchaseTransactionDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.PrePaymentRemittanceDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.ForeignTaxDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.PaymentHoldDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.StateMandatedFraudulentActivityDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.DelayedDebitDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CurrencyExchangeDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.PaymentLinkAchDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.PaymentLinkGenericDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.PaymentLinkAchWithTermDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.PaymentLinkGenericWithTermDisclosure.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.UnilateralRecipientDisclosure.INSTANCE.getType());

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PrePaymentDisclosure$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/UnionType;", "type", "Lcom/apollographql/apollo/api/UnionType;", "getType", "()Lcom/apollographql/apollo/api/UnionType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.UnionType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PrePaymentDisclosure.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
