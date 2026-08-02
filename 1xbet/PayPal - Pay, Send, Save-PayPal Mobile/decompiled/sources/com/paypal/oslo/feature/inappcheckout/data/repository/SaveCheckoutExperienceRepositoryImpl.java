package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/SaveCheckoutExperienceRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/SaveCheckoutExperienceRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError;", "", "saveCheckoutAsCancelled", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SaveCheckoutExperienceRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SaveCheckoutExperienceRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighSpeedVideoSizes = analyticsTracer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveCheckoutAsCancelled(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1 saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.SaveCheckoutExperienceUserActionMutation.External external;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.SaveCheckoutExperienceUserActionMutation.SaveCheckoutExperienceUserAction saveCheckoutExperienceUserAction;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1) {
            saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1) continuation;
            if ((saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1 saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$12 = saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1;
                java.lang.Object obj = saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.SaveCheckoutExperienceUserActionMutation saveCheckoutExperienceUserActionMutation = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.SaveCheckoutExperienceUserActionMutation(checkoutToken.getValue(), com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUserActionInExperience.CANCELLED_CHECKOUT, com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutPreferencesMapperKt.toGraphQLTokenType(checkoutToken.getType()));
                    this.getHighSpeedVideoSizes.trackSavedCheckoutExperienceAsCancelled();
                    saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                    saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(saveCheckoutExperienceUserActionMutation);
                    saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, saveCheckoutExperienceUserActionMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                java.lang.Throwable th = null;
                if (ior instanceof arrow.core.Ior.Left) {
                    if (!(ior instanceof arrow.core.Ior.Right)) {
                        if (ior instanceof arrow.core.Ior.Both) {
                            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                            java.lang.Object leftValue = both.getLeftValue();
                            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Unexpected state: both error and data present", kotlin.collections.MapsKt.emptyMap(), null, null, 24, null);
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError("Unexpected state: both error and data present", new java.lang.Exception("Unexpected state: both error and data present")));
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.SaveCheckoutExperienceUserActionMutation.Data data = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.SaveCheckoutExperienceUserActionMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (external = data.getExternal()) != null && (saveCheckoutExperienceUserAction = external.getSaveCheckoutExperienceUserAction()) != null) {
                        if (saveCheckoutExperienceUserAction.getOnExternalSaveCheckoutExperienceUserActionSuccessResponse() != null) {
                            if (saveCheckoutExperienceUserAction.getOnExternalSaveCheckoutExperienceUserActionSuccessResponse().getStatus()) {
                                return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                            }
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError("Save operation returned false status", null, 2, null));
                        }
                        if (saveCheckoutExperienceUserAction.getOnExternalSaveCheckoutExperienceUserActionErrorResponse() != null) {
                            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(saveCheckoutExperienceUserAction.getOnExternalSaveCheckoutExperienceUserActionErrorResponse().getErrors(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl.$r8$lambda$0F5_PmBA7gBxyoloOMMtgHcCWsk((com.paypal.oslo.feature.inappcheckout.graphql.checkout.SaveCheckoutExperienceUserActionMutation.Error) obj2);
                                }
                            }, 31, null);
                            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Save checkout experience error response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, joinToString$default)), null, null, 24, null);
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.ServerError(joinToString$default));
                        }
                        com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Unexpected response structure", kotlin.collections.MapsKt.emptyMap(), null, null, 24, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError("Unexpected response structure", new java.lang.Exception("Unexpected response structure")));
                    }
                    arrow.core.Either left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError("Missing save checkout experience data", new java.lang.Exception("Missing save checkout experience data")));
                    com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Missing save checkout experience data", kotlin.collections.MapsKt.emptyMap(), null, null, 24, null);
                    return left;
                }
                com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                java.lang.String concat = "Error saving checkout experience: ".concat(java.lang.String.valueOf(callError));
                com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Error saving checkout experience", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", callError.toString())), null, null, 24, null);
                this.getHighSpeedVideoSizes.trackUnsavedCheckoutExperienceAsCancelled(concat);
                if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                    com.paypal.oslo.core.network.graphql.error.CallError.Network network = (com.paypal.oslo.core.network.graphql.error.CallError.Network) callError;
                    java.lang.String concat2 = "Network error: ".concat(java.lang.String.valueOf(network.getError()));
                    com.paypal.oslo.core.network.http.error.NetworkError error = network.getError();
                    if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
                        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                            th = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause();
                        } else {
                            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            th = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause();
                        }
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError(concat2, th));
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
                java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), null, null, null, 0, null, null, 63, null);
                com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "GraphQL errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, joinToString$default2)), null, null, 24, null);
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError("GraphQL errors: ".concat(java.lang.String.valueOf(joinToString$default2)), null, 2, null));
            }
        }
        saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1(this, continuation);
        com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1 saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$122 = saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1;
        java.lang.Object obj2 = saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = saveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        java.lang.Throwable th2 = null;
        if (ior instanceof arrow.core.Ior.Left) {
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$0F5_PmBA7gBxyoloOMMtgHcCWsk(com.paypal.oslo.feature.inappcheckout.graphql.checkout.SaveCheckoutExperienceUserActionMutation.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getName().getRawValue();
    }
}
