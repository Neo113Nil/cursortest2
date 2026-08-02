package com.paypal.oslo.feature.smartroute.data.util;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aª\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0013\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b2\u0006\u0010\t\u001a\u00020\u00022.\u0010\u000e\u001a*\b\u0001\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\u001a\u0010\u0012\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00018\u00010\nH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0083\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0013\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b2\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u001a\u0010\u001a\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "", "", "extractDebugInfo", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/util/Map;", "D", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "E", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "execute", "errorFactory", "nullDataErrorMessage", "partialSuccessNullDataErrorMessage", "mapSuccess", "Larrow/core/Either;", "handleGraphQLOperation", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "p2", "p3", "p4", "", "p5", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/graphql/GraphQLData;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Z)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GraphQLOperationUtilsKt {
    public static final java.util.Map<java.lang.String, java.lang.Object> extractDebugInfo(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        try {
            if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
                com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY());
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                createMapBuilder.put("correlationId", graphQLError.getCorrelationId());
                createMapBuilder.put("errorCode", graphQLError.getErrorCode());
                createMapBuilder.put("errorMessage", graphQLError.getMessage());
                createMapBuilder.put(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.Integer.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())));
                java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
                if (extensions != null) {
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : extensions.entrySet()) {
                        java.lang.String key = entry.getKey();
                        java.lang.Object value = entry.getValue();
                        if (!kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"correlationId", "errorCode"}).contains(key)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("ext_");
                            sb.append(key);
                            createMapBuilder.put(sb.toString(), value);
                        }
                    }
                }
                java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry2 : build.entrySet()) {
                    if (entry2.getValue() != null) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return linkedHashMap;
            }
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkErrorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError().getClass()).getSimpleName()));
        } catch (java.lang.Exception e) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", callError), kotlin.TuplesKt.to("extractionException", e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <D, R, E> java.lang.Object handleGraphQLOperation(java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>>, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends E> function12, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.GraphQLData<D>, ? extends R> function13, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends E, ? extends R>> continuation) {
        com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt$handleGraphQLOperation$1 graphQLOperationUtilsKt$handleGraphQLOperation$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt$handleGraphQLOperation$1) {
            graphQLOperationUtilsKt$handleGraphQLOperation$1 = (com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt$handleGraphQLOperation$1) continuation;
            if ((graphQLOperationUtilsKt$handleGraphQLOperation$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                graphQLOperationUtilsKt$handleGraphQLOperation$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = graphQLOperationUtilsKt$handleGraphQLOperation$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLOperationUtilsKt$handleGraphQLOperation$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    graphQLOperationUtilsKt$handleGraphQLOperation$1.getHighSpeedVideoSizes = str;
                    graphQLOperationUtilsKt$handleGraphQLOperation$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    graphQLOperationUtilsKt$handleGraphQLOperation$1.getHighResolutionOutputSizeshNQ4ISI = function12;
                    graphQLOperationUtilsKt$handleGraphQLOperation$1.getHighSpeedVideoFpsRangesFor = str2;
                    graphQLOperationUtilsKt$handleGraphQLOperation$1.Camera2StreamConfigurationMap = str3;
                    graphQLOperationUtilsKt$handleGraphQLOperation$1.getOutputMinFrameDuration = function13;
                    graphQLOperationUtilsKt$handleGraphQLOperation$1.getOutputFormats = 1;
                    obj = function1.invoke(graphQLOperationUtilsKt$handleGraphQLOperation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function13 = (kotlin.jvm.functions.Function1) graphQLOperationUtilsKt$handleGraphQLOperation$1.getOutputMinFrameDuration;
                    str3 = (java.lang.String) graphQLOperationUtilsKt$handleGraphQLOperation$1.Camera2StreamConfigurationMap;
                    str2 = (java.lang.String) graphQLOperationUtilsKt$handleGraphQLOperation$1.getHighSpeedVideoFpsRangesFor;
                    function12 = (kotlin.jvm.functions.Function1) graphQLOperationUtilsKt$handleGraphQLOperation$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) graphQLOperationUtilsKt$handleGraphQLOperation$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.smartroute.LoggerKt.log;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(" failed");
                    com.paypal.android.logger.Logger.w$default(logger, sb.toString(), extractDebugInfo(callError), null, 4, null);
                    return arrow.core.EitherKt.left(function12.invoke(com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NETWORK_ERROR));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighSpeedVideoFpsRangesFor(str, (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue(), function12, str2, function13, false);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.smartroute.LoggerKt.log;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(" partial success");
                    com.paypal.android.logger.Logger.w$default(logger2, sb2.toString(), extractDebugInfo((com.paypal.oslo.core.network.graphql.error.CallError) leftValue), null, 4, null);
                    return getHighSpeedVideoFpsRangesFor(str, graphQLData, function12, str3, function13, true);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        graphQLOperationUtilsKt$handleGraphQLOperation$1 = new com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt$handleGraphQLOperation$1(continuation);
        java.lang.Object obj2 = graphQLOperationUtilsKt$handleGraphQLOperation$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLOperationUtilsKt$handleGraphQLOperation$1.getOutputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object handleGraphQLOperation$default(java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1 function13, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            str3 = com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.PARTIAL_SUCCESS_NULL_DATA;
        }
        return handleGraphQLOperation(str, function1, function12, str4, str3, function13, continuation);
    }

    private static final <D, R, E> arrow.core.Either<E, R> getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.core.network.graphql.GraphQLData<D> graphQLData, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends E> function1, java.lang.String str2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.GraphQLData<D>, ? extends R> function12, boolean z) {
        java.lang.String obj;
        try {
            R invoke = function12.invoke(graphQLData);
            if (invoke != null) {
                return arrow.core.EitherKt.right(invoke);
            }
            return arrow.core.EitherKt.left(function1.invoke(str2));
        } catch (java.lang.IllegalStateException e) {
            if (z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" partial success mapping failed");
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" mapping failed");
                obj = sb2.toString();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, obj, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", e)), null, 4, null);
            return arrow.core.EitherKt.left(function1.invoke(com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.MAPPING_ERROR));
        }
    }
}
