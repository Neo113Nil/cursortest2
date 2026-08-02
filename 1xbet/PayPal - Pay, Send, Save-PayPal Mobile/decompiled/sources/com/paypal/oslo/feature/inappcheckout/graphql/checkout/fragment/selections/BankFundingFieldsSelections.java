package com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/selections/BankFundingFieldsSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__root", "Ljava/util/List;", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BankFundingFieldsSelections {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.selections.BankFundingFieldsSelections INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.selections.BankFundingFieldsSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("subtype", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastDigits", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("backupInstrumentId", com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.GraphQLID.INSTANCE.getType()).build()});
    public static final int $stable = 8;

    private BankFundingFieldsSelections() {
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
