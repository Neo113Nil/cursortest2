package com.paypal.oslo.feature.checkcapture.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0001\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2\u0006\u0010\u000e\u001a\u00020\r2.\u0010\u0015\u001a*\b\u0001\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u001a\u0010\u0019\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000fH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ}\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0017\u001a\u00020\r2\u001a\u0010\u0018\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001a\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/data/repository/GraphQLCheckCaptureRepository;", "Lcom/paypal/oslo/feature/checkcapture/domain/repository/CheckCaptureRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/checkcapture/domain/error/CheckCaptureError;", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;", "authenticateUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "D", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "p0", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "", "p1", "p2", "p3", "p4", "p5", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/graphql/GraphQLData;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Z)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Operations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GraphQLCheckCaptureRepository implements com.paypal.oslo.feature.checkcapture.domain.repository.CheckCaptureRepository {
    public static final java.lang.String AUTHENTICATE_USER = "Authenticate check capture user";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    @javax.inject.Inject
    public GraphQLCheckCaptureRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    @Override // com.paypal.oslo.feature.checkcapture.domain.repository.CheckCaptureRepository
    public final java.lang.Object authenticateUser(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError, com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails>> continuation) {
        return getHighSpeedVideoSizes(AUTHENTICATE_USER, new com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository$authenticateUser$2(this, new com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation(), null), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository.m13484$r8$lambda$J5NySK82nUVHCZ4KMdiVCmt9Xk((java.lang.String) obj);
            }
        }, com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA, com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.PARTIAL_SUCCESS_NULL_DATA, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository.m13485$r8$lambda$_LxcHd_pKShiRXDnGoBdY9zq8M((com.paypal.oslo.core.network.graphql.GraphQLData) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D, R> java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>>, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError> function12, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.GraphQLData<D>, ? extends R> function13, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError, ? extends R>> continuation) {
        com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository$handleGraphQLOperation$1 graphQLCheckCaptureRepository$handleGraphQLOperation$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository$handleGraphQLOperation$1) {
            graphQLCheckCaptureRepository$handleGraphQLOperation$1 = (com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository$handleGraphQLOperation$1) continuation;
            if ((graphQLCheckCaptureRepository$handleGraphQLOperation$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                graphQLCheckCaptureRepository$handleGraphQLOperation$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = graphQLCheckCaptureRepository$handleGraphQLOperation$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLCheckCaptureRepository$handleGraphQLOperation$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighSpeedVideoFpsRangesFor = str;
                    graphQLCheckCaptureRepository$handleGraphQLOperation$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighResolutionOutputSizeshNQ4ISI = function12;
                    graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighSpeedVideoFpsRanges = str2;
                    graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighSpeedVideoSizes = str3;
                    graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighSpeedVideoSizesFor = function13;
                    graphQLCheckCaptureRepository$handleGraphQLOperation$1.getInputSizeshNQ4ISI = 1;
                    obj = function1.invoke(graphQLCheckCaptureRepository$handleGraphQLOperation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function13 = (kotlin.jvm.functions.Function1) graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighSpeedVideoSizesFor;
                    str3 = (java.lang.String) graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighSpeedVideoSizes;
                    str2 = (java.lang.String) graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighSpeedVideoFpsRanges;
                    function12 = (kotlin.jvm.functions.Function1) graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) graphQLCheckCaptureRepository$handleGraphQLOperation$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.checkcapture.LoggerKt.log;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(" failed");
                    com.paypal.android.logger.Logger.w$default(logger, sb.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", callError)), null, 4, null);
                    return arrow.core.EitherKt.left(function12.invoke(com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NETWORK_ERROR));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighSpeedVideoSizes(str, (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue(), function12, str2, function13, false);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.checkcapture.LoggerKt.log;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(" partial success");
                    com.paypal.android.logger.Logger.w$default(logger2, sb2.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", (com.paypal.oslo.core.network.graphql.error.CallError) leftValue)), null, 4, null);
                    return getHighSpeedVideoSizes(str, graphQLData, function12, str3, function13, true);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        graphQLCheckCaptureRepository$handleGraphQLOperation$1 = new com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository$handleGraphQLOperation$1(this, continuation);
        java.lang.Object obj2 = graphQLCheckCaptureRepository$handleGraphQLOperation$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLCheckCaptureRepository$handleGraphQLOperation$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static <D, R> arrow.core.Either<com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError, R> getHighSpeedVideoSizes(java.lang.String p0, com.paypal.oslo.core.network.graphql.GraphQLData<D> p1, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError> p2, java.lang.String p3, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.GraphQLData<D>, ? extends R> p4, boolean p5) {
        java.lang.String obj;
        arrow.core.Either<com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError, R> right;
        try {
            R invoke = p4.invoke(p1);
            return (invoke == null || (right = arrow.core.EitherKt.right(invoke)) == null) ? arrow.core.EitherKt.left(p2.invoke(p3)) : right;
        } catch (java.lang.IllegalStateException e) {
            if (p5) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(p0);
                sb.append(" partial success mapping failed");
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(p0);
                sb2.append(" mapping failed");
                obj = sb2.toString();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.checkcapture.LoggerKt.log, obj, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", e)), null, 4, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.MappingError(com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.MAPPING_ERROR));
        }
    }

    /* renamed from: $r8$lambda$J5NySK82nUVHCZ-4KMdiVCmt9Xk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError m13484$r8$lambda$J5NySK82nUVHCZ4KMdiVCmt9Xk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.AuthenticationError(str);
    }

    /* renamed from: $r8$lambda$_LxcHd_pKShiRX-DnGoBdY9zq8M, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails m13485$r8$lambda$_LxcHd_pKShiRXDnGoBdY9zq8M(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data data = (com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data) graphQLData.getData();
        if (data != null) {
            return com.paypal.oslo.feature.checkcapture.data.mapper.CheckCaptureMapperKt.toSessionDetails(data);
        }
        return null;
    }
}
