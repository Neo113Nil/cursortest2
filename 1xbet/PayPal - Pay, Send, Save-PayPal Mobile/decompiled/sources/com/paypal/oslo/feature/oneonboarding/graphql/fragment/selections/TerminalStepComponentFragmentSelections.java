package com.paypal.oslo.feature.oneonboarding.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/selections/TerminalStepComponentFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TerminalStepComponentFragmentSelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.selections.TerminalStepComponentFragmentSelections INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.selections.TerminalStepComponentFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    private TerminalStepComponentFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("OnboardContextualInfo", kotlin.collections.CollectionsKt.listOf("OnboardContextualInfo")).selections(com.paypal.oslo.feature.oneonboarding.graphql.fragment.selections.ContextualInfoFragmentSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoFpsRanges = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("OnboardReviewPendingComponent", kotlin.collections.CollectionsKt.listOf("OnboardReviewPendingComponent")).selections(com.paypal.oslo.feature.oneonboarding.graphql.fragment.selections.ReviewPendingComponentFragmentSelections.INSTANCE.get__root()).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("OnboardAdditionalInfoNeededComponent", kotlin.collections.CollectionsKt.listOf("OnboardAdditionalInfoNeededComponent")).selections(com.paypal.oslo.feature.oneonboarding.graphql.fragment.selections.AdditionalInfoNeededComponentFragmentSelections.INSTANCE.get__root()).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("OnboardRegionNotSupportedComponent", kotlin.collections.CollectionsKt.listOf("OnboardRegionNotSupportedComponent")).selections(com.paypal.oslo.feature.oneonboarding.graphql.fragment.selections.RegionNotSupportedComponentFragmentSelections.INSTANCE.get__root()).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("OnboardProductNotSetupComponent", kotlin.collections.CollectionsKt.listOf("OnboardProductNotSetupComponent")).selections(com.paypal.oslo.feature.oneonboarding.graphql.fragment.selections.ProductNotSetupComponentFragmentSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoSizes = listOf2;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("contextualInfo", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.OnboardContextualInfo.INSTANCE.getType()))).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.OnboardTerminalComponent.INSTANCE.getType())).selections(listOf2).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
