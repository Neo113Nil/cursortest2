package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u008e\u0001\u0010\u0015\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012\",\b\u0000\u0010\u0006*&\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004j\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u0005\"\u0004\b\u0001\u0010\u0007\"\b\b\u0002\u0010\t*\u00020\b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u008e\u0001\u0010\u0015\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012\",\b\u0000\u0010\u0006*&\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004j\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u0005\"\u0004\b\u0001\u0010\u0007\"\b\b\u0002\u0010\t*\u00020\u0017*\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00182\u0006\u0010\r\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u001aJ¸\u0001\u0010&\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012\",\b\u0000\u0010\u0006*&\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004j\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u0005\"\u0004\b\u0001\u0010\u0007\"\b\b\u0002\u0010\t*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c24\u0010#\u001a0\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\"0\u00120 \u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0004¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010.J)\u0010&\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b&\u0010/J)\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b-\u0010/J1\u00101\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010$\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u00102"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/BaseRepository;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplservicing/data/mapper/Mapper;", "M", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/apollographql/apollo/api/Query;", "query", "mapper", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "callConfig", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "fetchData", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Query;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/Mutation;", "mutation", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Mutation;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "", "p0", "p1", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "p2", "p3", "p4", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "authState", "createCallConfig", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;)Lcom/paypal/oslo/core/network/graphql/CallConfig;", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/graphql/error/CallError;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public class BaseRepository {
    public static final int $stable = 0;
    public static final java.lang.String SOURCE = "bnpl_servicing";
    public static final java.lang.String UNKNOWN_SCREEN = "unknown";

    public static /* synthetic */ java.lang.Object fetchData$default(com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository baseRepository, com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query query, kotlin.jvm.functions.Function1 function1, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchData");
        }
        if ((i & 4) != 0) {
            fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly;
        }
        return baseRepository.fetchData(apolloClient, query, (com.apollographql.apollo.api.Query) function1, fetchPolicy, callConfig, continuation);
    }

    public final <M extends kotlin.jvm.functions.Function1<? super D, ? extends R>, R, D extends com.apollographql.apollo.api.Query.Data> java.lang.Object fetchData(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query<D> query, M m, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends R>> continuation) {
        return getHighSpeedVideoFpsRangesFor(query.name(), "query", new com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$fetchData$2(apolloClient, query, fetchPolicy, null), callConfig, m, continuation);
    }

    public static /* synthetic */ java.lang.Object fetchData$default(com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository baseRepository, com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation mutation, kotlin.jvm.functions.Function1 function1, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchData");
        }
        if ((i & 4) != 0) {
            fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly;
        }
        return baseRepository.fetchData(apolloClient, mutation, (com.apollographql.apollo.api.Mutation) function1, fetchPolicy, callConfig, continuation);
    }

    public final <M extends kotlin.jvm.functions.Function1<? super D, ? extends R>, R, D extends com.apollographql.apollo.api.Mutation.Data> java.lang.Object fetchData(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation<D> mutation, M m, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends R>> continuation) {
        return getHighSpeedVideoFpsRangesFor(mutation.name(), "mutation", new com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$fetchData$4(apolloClient, mutation, fetchPolicy, null), callConfig, m, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <M extends kotlin.jvm.functions.Function1<? super D, ? extends R>, R, D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.network.graphql.CallConfig, ? super kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>>, ? extends java.lang.Object> function2, com.paypal.oslo.core.network.graphql.CallConfig callConfig, M m, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends R>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$executeOperation$1 baseRepository$executeOperation$1;
        int i;
        arrow.core.Ior.Both both;
        com.paypal.oslo.core.network.graphql.error.CallError callError;
        java.lang.Object invoke;
        java.lang.Object invoke2;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$executeOperation$1) {
            baseRepository$executeOperation$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$executeOperation$1) continuation;
            if ((baseRepository$executeOperation$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                baseRepository$executeOperation$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = baseRepository$executeOperation$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseRepository$executeOperation$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    baseRepository$executeOperation$1.getHighSpeedVideoSizes = str;
                    baseRepository$executeOperation$1.getHighSpeedVideoFpsRanges = str2;
                    baseRepository$executeOperation$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function2);
                    baseRepository$executeOperation$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    baseRepository$executeOperation$1.getHighSpeedVideoFpsRangesFor = m;
                    baseRepository$executeOperation$1.getOutputMinFrameDuration = 1;
                    obj = function2.invoke(callConfig, baseRepository$executeOperation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m = (M) baseRepository$executeOperation$1.getHighSpeedVideoFpsRangesFor;
                    str2 = (java.lang.String) baseRepository$executeOperation$1.getHighSpeedVideoFpsRanges;
                    str = (java.lang.String) baseRepository$executeOperation$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Object obj2 = null;
                    if (both instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue();
                        java.lang.Object obj3 = graphQLData.getExtensions().get("correlationId");
                        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                        getHighSpeedVideoFpsRangesFor(str, str2, str3);
                        com.apollographql.apollo.api.Operation.Data data = (com.apollographql.apollo.api.Operation.Data) graphQLData.getData();
                        if (data == null || (invoke2 = m.invoke(data)) == null) {
                            getHighSpeedVideoFpsRanges(str, str2, str3);
                        } else {
                            obj2 = invoke2;
                        }
                        both = new arrow.core.Ior.Right(obj2);
                    } else if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        java.lang.Object leftValue = both2.getLeftValue();
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both2.getRightValue();
                        java.lang.Object obj4 = graphQLData2.getExtensions().get("correlationId");
                        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                        getHighSpeedVideoFpsRangesFor(str, str2, str4);
                        com.apollographql.apollo.api.Operation.Data data2 = (com.apollographql.apollo.api.Operation.Data) graphQLData2.getData();
                        if (data2 == null || (invoke = m.invoke(data2)) == null) {
                            getHighSpeedVideoFpsRanges(str, str2, str4);
                        } else {
                            obj2 = invoke;
                        }
                        both = new arrow.core.Ior.Both(leftValue, obj2);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.leftOrNull();
                if (callError != null) {
                    getHighSpeedVideoFpsRanges(str, callError, str2);
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.bnplservicing.data.mapper.error.BNPLErrorMapperKt.toBNPLErrors((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return both;
                }
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                return new arrow.core.Ior.Both(com.paypal.oslo.feature.bnplservicing.data.mapper.error.BNPLErrorMapperKt.toBNPLErrors((com.paypal.oslo.core.network.graphql.error.CallError) both3.getLeftValue()), both3.getRightValue());
            }
        }
        baseRepository$executeOperation$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$executeOperation$1(this, continuation);
        java.lang.Object obj5 = baseRepository$executeOperation$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseRepository$executeOperation$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj5;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.leftOrNull();
        if (callError != null) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final com.paypal.oslo.core.network.graphql.CallConfig createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState authState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
        return new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(authState, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(SOURCE, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
    }

    private static com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
        java.lang.String concat = p2 != null ? com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER.concat(java.lang.String.valueOf(p2)) : null;
        if (concat == null) {
            concat = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0);
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(p1);
        sb.append(concat);
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(SOURCE, sb.toString(), p3);
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.String p0, com.paypal.oslo.core.network.graphql.error.CallError p1, java.lang.String p2) {
        java.lang.Object m23436constructorimpl;
        java.lang.String str;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository baseRepository = this;
            java.lang.String errorCode = com.paypal.oslo.feature.bnplservicing.data.extensions.CallErrorExtensionsKt.errorCode(p1);
            java.lang.String errorDescription = com.paypal.oslo.feature.bnplservicing.data.extensions.CallErrorExtensionsKt.errorDescription(p1);
            java.lang.String correlationId = com.paypal.oslo.feature.bnplservicing.data.extensions.CallErrorExtensionsKt.correlationId(p1);
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("unknown"), null, null, null, 14, null);
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0, p2, correlationId, "api_call_failed");
            if (p1 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                str = "network";
            } else {
                if (!(p1 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = "graphql";
            }
            com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt.available(new com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent(uIContext, highResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(errorCode, errorDescription, str, "apollo_client")));
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        kotlin.Result.m23441isFailureimpl(m23436constructorimpl);
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository baseRepository = this;
            com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt.available(new com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationSuccessEvent(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("unknown"), null, null, null, 14, null), getHighResolutionOutputSizeshNQ4ISI(p0, p1, p2, "api_call_success")));
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        kotlin.Result.m23441isFailureimpl(m23436constructorimpl);
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository baseRepository = this;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("unknown"), null, null, null, 14, null);
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0, p1, p2, "null_data_returned");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Server returned null data for ");
            sb.append(p0);
            com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt.available(new com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationNullDataEvent(uIContext, highResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext("NULL_DATA", sb.toString(), "data_validation", "apollo_client")));
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        kotlin.Result.m23441isFailureimpl(m23436constructorimpl);
    }
}
