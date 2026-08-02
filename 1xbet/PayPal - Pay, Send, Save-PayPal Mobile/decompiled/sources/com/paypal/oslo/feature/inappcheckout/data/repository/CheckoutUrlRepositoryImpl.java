package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/CheckoutUrlRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/repository/CheckoutUrlRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;", "dynamicConfigurationManager", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "getCheckoutPreferences", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckoutUrlRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.features.webview.domain.repository.CheckoutUrlRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CheckoutUrlRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager dynamicConfigurationManager, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoFpsRanges = dynamicConfigurationManager;
        this.getHighSpeedVideoSizes = checkoutLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = analyticsTracer;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.webview.domain.repository.CheckoutUrlRepository
    public final java.lang.Object getCheckoutPreferences(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences>> continuation) {
        return com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt.retryEither(this.getHighSpeedVideoFpsRanges.getCheckoutDataMaxRetries() + 1, this.getHighSpeedVideoFpsRanges.getCheckoutDataRetryIntervalDelay(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl.m15417$r8$lambda$Xm7LvGD4KUUpVde575MSjSGg5A((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError) obj));
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl.$r8$lambda$ds7tkRKVzKNVq3yjAloAfOShCOI(com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl.this, (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError) obj);
            }
        }, new com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl$getCheckoutPreferences$4(checkoutToken, this, null), continuation);
    }

    /* renamed from: $r8$lambda$Xm7LvG-D4KUUpVde575MSjSGg5A, reason: not valid java name */
    public static /* synthetic */ boolean m15417$r8$lambda$Xm7LvGD4KUUpVde575MSjSGg5A(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError checkoutPreferencesError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutPreferencesError, "");
        return checkoutPreferencesError instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.NetworkError;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ds7tkRKVzKNVq3yjAloAfOShCOI(com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl checkoutUrlRepositoryImpl, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError checkoutPreferencesError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutPreferencesError, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutUrlRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.CHECKOUT_URLS_FETCH_ERROR_MSG, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", checkoutPreferencesError)), null, null, 24, null);
        checkoutUrlRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI.trackCheckoutPreferencesException(checkoutPreferencesError.toString());
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ arrow.core.Either access$handleCallError(com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl checkoutUrlRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutUrlRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Error fetching checkout preferences", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", callError.toString())), null, null, 24, null);
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.NetworkError(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError().toString()));
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        java.util.List m9570constructorimpl = arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutUrlRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "GraphQL errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(m9570constructorimpl), null, null, null, 0, null, null, 63, null))), null, null, 24, null);
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.GraphQLError(arrow.core.NonEmptyList.m9567boximpl(m9570constructorimpl)));
    }

    public static final /* synthetic */ arrow.core.Either access$handleResult(com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl checkoutUrlRepositoryImpl, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAppSwitchAPIIntegrationChannel appSwitchApiIntegrationChannel;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.External external;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.Data data = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.Data) graphQLData.getData();
        com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration = null;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.CheckoutPreferences checkoutPreferences = (data == null || (external = data.getExternal()) == null) ? null : external.getCheckoutPreferences();
        if (checkoutPreferences == null) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutUrlRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Missing checkout preferences data", kotlin.collections.MapsKt.emptyMap(), null, null, 24, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError("Missing checkout preferences data"));
        }
        if (checkoutPreferences.getOnExternalCheckoutPreferencesSuccessResponse() != null) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutUrlRepositoryImpl.getHighSpeedVideoSizes, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.CHECKOUT_URLS_FETCH_SUCCESS_MSG, com.paypal.android.logger.categories.Network.Success.INSTANCE, null, null, 12, null);
            checkoutUrlRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI.trackSuccessGetTokenDetailsCompleted();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.OnExternalCheckoutPreferencesSuccessResponse onExternalCheckoutPreferencesSuccessResponse = checkoutPreferences.getOnExternalCheckoutPreferencesSuccessResponse();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.AppSwitchPreferences appSwitchPreferences = onExternalCheckoutPreferencesSuccessResponse.getAppSwitchPreferences();
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs = com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutPreferencesMapperKt.toCheckoutURLs(onExternalCheckoutPreferencesSuccessResponse);
            if (appSwitchPreferences != null && (appSwitchApiIntegrationChannel = appSwitchPreferences.getAppSwitchApiIntegrationChannel()) != null) {
                apiIntegration = com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutPreferencesMapperKt.toApiIntegration(appSwitchApiIntegrationChannel);
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences(checkoutURLs, apiIntegration, com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutPreferencesMapperKt.toMerchantDetails(onExternalCheckoutPreferencesSuccessResponse)));
        }
        if (checkoutPreferences.getOnExternalCheckoutPreferencesErrorResponse() != null) {
            java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.Error> errors = checkoutPreferences.getOnExternalCheckoutPreferencesErrorResponse().getErrors();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
            java.util.Iterator<T> it = errors.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.Error) it.next()).getName().getRawValue());
            }
            java.util.ArrayList arrayList2 = arrayList;
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutUrlRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Checkout preferences error response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, kotlin.collections.CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null))), null, null, 24, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.GraphQLError(arrayList2));
        }
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutUrlRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Unexpected response structure", kotlin.collections.MapsKt.emptyMap(), null, null, 24, null);
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError("Unexpected response structure"));
    }
}
