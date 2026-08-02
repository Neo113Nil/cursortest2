package com.paypal.oslo.feature.wallet.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/fragment/selections/WalletCardBasicInfoFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__root", "Ljava/util/List;", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WalletCardBasicInfoFragmentSelections {
    public static final com.paypal.oslo.feature.wallet.graphql.fragment.selections.WalletCardBasicInfoFragmentSelections INSTANCE = new com.paypal.oslo.feature.wallet.graphql.fragment.selections.WalletCardBasicInfoFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("brand", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CardBrand.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("expirationDate", com.paypal.oslo.api.graphql.schema.type.DateYearMonth.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("nickName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("productClass", com.paypal.oslo.api.graphql.schema.type.CardProductClass.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType()).build()});
    public static final int $stable = 8;

    private WalletCardBasicInfoFragmentSelections() {
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
