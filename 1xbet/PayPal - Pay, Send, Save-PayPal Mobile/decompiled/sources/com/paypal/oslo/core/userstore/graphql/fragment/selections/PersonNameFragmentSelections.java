package com.paypal.oslo.core.userstore.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/selections/PersonNameFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersonNameFragmentSelections {
    public static final com.paypal.oslo.core.userstore.graphql.fragment.selections.PersonNameFragmentSelections INSTANCE = new com.paypal.oslo.core.userstore.graphql.fragment.selections.PersonNameFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    private PersonNameFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("prefix", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("secondSurname", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("surname", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("suffix", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("fullName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("orthography", com.paypal.oslo.api.graphql.schema.type.Orthography.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PersonName.INSTANCE.getType())).selections(listOf).build()});
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
