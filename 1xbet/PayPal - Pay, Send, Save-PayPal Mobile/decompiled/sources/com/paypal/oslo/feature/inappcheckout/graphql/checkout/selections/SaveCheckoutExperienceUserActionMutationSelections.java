package com.paypal.oslo.feature.inappcheckout.graphql.checkout.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/selections/SaveCheckoutExperienceUserActionMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaveCheckoutExperienceUserActionMutationSelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.selections.SaveCheckoutExperienceUserActionMutationSelections INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.selections.SaveCheckoutExperienceUserActionMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    private SaveCheckoutExperienceUserActionMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("status", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.GraphQLBoolean.INSTANCE.getType())).build());
        getHighSpeedVideoFpsRanges = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalSaveCheckoutExperienceUserActionErrorReason.INSTANCE.getType())).build());
        getHighResolutionOutputSizeshNQ4ISI = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalSaveCheckoutExperienceUserActionError.INSTANCE.getType())))).selections(listOf2).build());
        getHighSpeedVideoFpsRangesFor = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("externalSaveCheckoutExperienceUserActionSuccessResponse", kotlin.collections.CollectionsKt.listOf("externalSaveCheckoutExperienceUserActionSuccessResponse")).selections(listOf).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("externalSaveCheckoutExperienceUserActionErrorResponse", kotlin.collections.CollectionsKt.listOf("externalSaveCheckoutExperienceUserActionErrorResponse")).selections(listOf3).build()});
        Camera2StreamConfigurationMap = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("saveCheckoutExperienceUserAction", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalSaveCheckoutExperienceUserActionResponse.INSTANCE.getType())).arguments(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledArgument[]{new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.INSTANCE.get__saveCheckoutExperienceUserAction_token()).value(new com.apollographql.apollo.api.CompiledVariable(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY)).build(), new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.INSTANCE.get__saveCheckoutExperienceUserAction_tokenType()).value(new com.apollographql.apollo.api.CompiledVariable("tokenType")).build(), new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.INSTANCE.get__saveCheckoutExperienceUserAction_userActionInExperience()).value(new com.apollographql.apollo.api.CompiledVariable("userActionInExperience")).build()})).selections(listOf4).build());
        getHighSpeedVideoSizes = listOf5;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.INSTANCE.getType()).selections(listOf5).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
