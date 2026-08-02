package com.paypal.oslo.feature.identity.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/selections/PasskeyCreateChallengeContextMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyCreateChallengeContextMutationSelections {
    public static final int $stable;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.graphql.selections.PasskeyCreateChallengeContextMutationSelections INSTANCE = new com.paypal.oslo.feature.identity.graphql.selections.PasskeyCreateChallengeContextMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    private PasskeyCreateChallengeContextMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("name", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("type", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("algorithm", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType())).build()});
        Camera2StreamConfigurationMap = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("displayName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        getHighSpeedVideoFpsRangesFor = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("type", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType.INSTANCE.getType())).build()});
        getHighSpeedVideoFpsRanges = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("relyingParty", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PasskeyRelyingParty.INSTANCE.getType())).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("publicKeyCredentialParams", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PasskeyPublicKeyCredentialParameter.INSTANCE.getType())))).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledField.Builder("user", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PasskeyUser.INSTANCE.getType())).selections(listOf3).build(), new com.apollographql.apollo.api.CompiledField.Builder("excludeCredentials", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.AuthenticationPasskeyAllowCredential.INSTANCE.getType())))).selections(listOf4).build(), new com.apollographql.apollo.api.CompiledField.Builder("userVerification", com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification.INSTANCE.getType()).build()});
        getHighSpeedVideoSizes = listOf5;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("createPasskeyRegistrationOption", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionResult.INSTANCE.getType())).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.get__createPasskeyRegistrationOption_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf5).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
