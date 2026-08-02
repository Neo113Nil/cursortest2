package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/WalletComponent;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WalletComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.WalletComponent.Companion INSTANCE = new com.paypal.oslo.api.graphql.schema.type.WalletComponent.Companion(null);
    private static final com.apollographql.apollo.api.UnionType type = new com.apollographql.apollo.api.UnionType("WalletComponent", com.paypal.oslo.api.graphql.schema.type.CardComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.BankAccountComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.BalanceComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.SavingsComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.SavingsEmptyStateComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.DebitEmptyStateComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CryptoComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CryptoEmptyStateComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.BNPLComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.BNPLEmptyStateComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.BNPLPayLaterToGoNBAComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.RevolvingCreditCardComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CreditConsumerRewardsComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CreditConsumerRewardsEmptyStateComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CreditCardUSCardComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CreditCardUSCardEmptyStateComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CreditEbayMastercardComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CreditSmartConnectComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CreditPayPalMasterCardComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.CreditPayPalCreditComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.RewardsComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.PaymentPreferencesComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.MoneyPoolComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.MoneyPoolEmptyStateComponent.INSTANCE.getType());

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/WalletComponent$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/UnionType;", "type", "Lcom/apollographql/apollo/api/UnionType;", "getType", "()Lcom/apollographql/apollo/api/UnionType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.UnionType getType() {
            return com.paypal.oslo.api.graphql.schema.type.WalletComponent.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
