package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragmentImpl;", "Lcom/apollographql/apollo/api/Fragment;", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantOffersInput;", "merchantOffersInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MerchantOffersInput;)V", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MerchantOffersInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MerchantOffersInput;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragmentImpl;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantOffersInput;", "getMerchantOffersInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShoppingCollectionComponentFragmentImpl implements com.apollographql.apollo.api.Fragment<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment> {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput merchantOffersInput;

    public ShoppingCollectionComponentFragmentImpl(com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput merchantOffersInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOffersInput, "");
        this.merchantOffersInput = merchantOffersInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput getMerchantOffersInput() {
        return this.merchantOffersInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.home.graphql.fragment.adapter.ShoppingCollectionComponentFragmentImpl_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragmentImpl_ResponseAdapter.ShoppingCollectionComponentFragment.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionComponent.INSTANCE.getType()).selections(com.paypal.oslo.feature.home.graphql.fragment.selections.ShoppingCollectionComponentFragmentSelections.INSTANCE.get__root()).build();
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput merchantOffersInput = this.merchantOffersInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShoppingCollectionComponentFragmentImpl(merchantOffersInput=");
        sb.append(merchantOffersInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.merchantOffersInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragmentImpl) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantOffersInput, ((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragmentImpl) other).merchantOffersInput);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragmentImpl copy(com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput merchantOffersInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOffersInput, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragmentImpl(merchantOffersInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput getMerchantOffersInput() {
        return this.merchantOffersInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragmentImpl copy$default(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragmentImpl shoppingCollectionComponentFragmentImpl, com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput merchantOffersInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            merchantOffersInput = shoppingCollectionComponentFragmentImpl.merchantOffersInput;
        }
        return shoppingCollectionComponentFragmentImpl.copy(merchantOffersInput);
    }
}
