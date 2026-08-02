package com.paypal.oslo.core.network.graphql.interceptor;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJp\u0010\u001a\u001a\u00020\u0017\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\n2(\u0010\u0019\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJZ\u0010\u001f\u001a\u00020\u0017\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0011\u001a\u00020\n2(\u0010\u0013\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/interceptor/StepupChallengeInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;", "handler", "<init>", "(Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "chain", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;", "p0", "p1", "Lcom/apollographql/apollo/api/Error;", "p2", "p3", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "p4", "getHighSpeedVideoFpsRangesFor", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/api/ApolloResponse;Lcom/apollographql/apollo/api/Error;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Camera2StreamConfigurationMap", "(Lcom/apollographql/apollo/api/ApolloResponse;Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/api/ApolloResponse;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StepupChallengeInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor {
    private static final com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.Companion Companion = new com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String EXTENSION_NAME = "name";

    @java.lang.Deprecated
    public static final java.lang.String FIELD_FLOW_CONTEXT = "flowContext";

    @java.lang.Deprecated
    public static final java.lang.String FIELD_FLOW_CONTEXT_ID = "flowContextId";

    @java.lang.Deprecated
    public static final java.lang.String FIELD_FLOW_NAME = "flowName";

    @java.lang.Deprecated
    public static final java.lang.String FIELD_STEP_UP_CONTEXT_ID = "stepUpContextId";

    @java.lang.Deprecated
    public static final java.lang.String KEY_CHALLENGE_CONTEXT = "challengeContext";

    @java.lang.Deprecated
    public static final java.lang.String KEY_FAILURE_REASON = "failure_reason";

    @java.lang.Deprecated
    public static final java.lang.String KEY_FAILURE_TYPE = "failure_type";

    @java.lang.Deprecated
    public static final java.lang.String STEPUP_CHALLENGE_VALUE = "STEPUP_CHALLENGE";
    private final com.paypal.oslo.core.identity.stepup.StepupChallengeHandler getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public StepupChallengeInterceptor(com.paypal.oslo.core.identity.stepup.StepupChallengeHandler stepupChallengeHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupChallengeHandler, "");
        this.getHighSpeedVideoFpsRangesFor = stepupChallengeHandler;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Intercepting GraphQL request", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, request.getOperation().name())), null, 4, null);
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1(chain, request, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(1:(3:13|14|15)(2:17|18))(1:19))(1:29)|20|21|22|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        r6 = r2;
        r2 = r10;
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x03c4, code lost:
    
        if (r3.invoke(r7, r4) != r5) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0273, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI(r10, r6, r3, r4) == r5) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f7, code lost:
    
        if (r3.invoke(r0, r4) != r5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023a A[Catch: Exception -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bf, blocks: (B:32:0x00ba, B:33:0x0234, B:36:0x023a, B:40:0x027b, B:42:0x02b4, B:43:0x02c0, B:45:0x02d3, B:46:0x02ed, B:49:0x02dc, B:51:0x02e0, B:52:0x0331, B:53:0x0336, B:54:0x0337, B:55:0x033c), top: B:31:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, com.apollographql.apollo.api.Error error, com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, kotlin.jvm.functions.Function2<? super com.apollographql.apollo.api.ApolloResponse<D>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$handleStepupChallenge$1 stepupChallengeInterceptor$handleStepupChallenge$1;
        int i;
        com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput;
        com.apollographql.apollo.api.ApolloRequest<D> apolloRequest2;
        com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain2;
        com.apollographql.apollo.api.Error error2;
        com.paypal.oslo.core.identity.stepup.StepupChallengeHandler stepupChallengeHandler;
        com.apollographql.apollo.api.ApolloResponse<D> apolloResponse2;
        com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput2;
        com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain3;
        com.apollographql.apollo.api.ApolloRequest<D> apolloRequest3;
        com.apollographql.apollo.api.Error error3;
        arrow.core.Either either;
        kotlin.Pair pair;
        com.apollographql.apollo.api.ApolloResponse<D> apolloResponse3 = apolloResponse;
        kotlin.jvm.functions.Function2<? super com.apollographql.apollo.api.ApolloResponse<D>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22 = function2;
        if (continuation instanceof com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$handleStepupChallenge$1) {
            stepupChallengeInterceptor$handleStepupChallenge$1 = (com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$handleStepupChallenge$1) continuation;
            if ((stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = stepupChallengeInterceptor$handleStepupChallenge$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map<java.lang.String, java.lang.Object> extensions = error.getExtensions();
                    java.lang.Object obj2 = extensions != null ? extensions.get(KEY_CHALLENGE_CONTEXT) : null;
                    java.util.Map map = obj2 instanceof java.util.Map ? (java.util.Map) obj2 : null;
                    if (map == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Missing or invalid challengeContext in STEPUP_CHALLENGE error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, apolloRequest.getOperation().name())), null, null, 12, null);
                    } else {
                        java.lang.Object obj3 = map.get(FIELD_STEP_UP_CONTEXT_ID);
                        java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                        java.lang.Object obj4 = map.get(FIELD_FLOW_NAME);
                        java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                        java.lang.Object obj5 = map.get("flowContext");
                        java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                        java.lang.Object obj6 = map.get(FIELD_FLOW_CONTEXT_ID);
                        java.lang.String str4 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                        if (str != null && str2 != null && str3 != null) {
                            stepupChallengeInput = new com.paypal.oslo.core.identity.stepup.StepupChallengeInput(str, str2, str3, str4);
                            if (stepupChallengeInput != null) {
                                com.apollographql.apollo.api.ApolloResponse Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(apolloResponse3, "STEPUP_ERROR", "Invalid or incomplete challenge context");
                                stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloRequest);
                                stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloResponse);
                                stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error);
                                stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloInterceptorChain);
                                stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function2);
                                stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
                                stepupChallengeInterceptor$handleStepupChallenge$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(Camera2StreamConfigurationMap);
                                stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM = 1;
                            } else {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Invoking StepupChallengeHandler, network call will suspend", null, null, 6, null);
                                try {
                                    stepupChallengeHandler = this.getHighSpeedVideoFpsRangesFor;
                                    apolloRequest2 = apolloRequest;
                                } catch (java.lang.Exception e) {
                                    e = e;
                                    apolloRequest2 = apolloRequest;
                                }
                                try {
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI = apolloRequest2;
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor = apolloResponse3;
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error);
                                    apolloInterceptorChain2 = apolloInterceptorChain;
                                } catch (java.lang.Exception e2) {
                                    e = e2;
                                    apolloInterceptorChain2 = apolloInterceptorChain;
                                    error2 = error;
                                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Unexpected exception in StepupChallengeHandler - returning original error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, apolloRequest2.getOperation().name()), kotlin.TuplesKt.to("exceptionType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName())), null, e, 4, null);
                                    com.apollographql.apollo.api.ApolloResponse Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(apolloResponse3, "STEPUP_ERROR", "Unexpected error during step-up verification");
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloRequest2);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloResponse3);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error2);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloInterceptorChain2);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function22);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizesFor = null;
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM = 5;
                                }
                                try {
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI = apolloInterceptorChain2;
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats = function22;
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM = 2;
                                    obj = stepupChallengeHandler.handleStepup(stepupChallengeInput, stepupChallengeInterceptor$handleStepupChallenge$1);
                                    if (obj != coroutine_suspended) {
                                        apolloResponse2 = apolloResponse3;
                                        stepupChallengeInput2 = stepupChallengeInput;
                                        apolloInterceptorChain3 = apolloInterceptorChain2;
                                        apolloRequest3 = apolloRequest2;
                                        error3 = error;
                                        either = (arrow.core.Either) obj;
                                        if (!(either instanceof arrow.core.Either.Right)) {
                                        }
                                    }
                                } catch (java.lang.Exception e3) {
                                    e = e3;
                                    error2 = error;
                                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Unexpected exception in StepupChallengeHandler - returning original error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, apolloRequest2.getOperation().name()), kotlin.TuplesKt.to("exceptionType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName())), null, e, 4, null);
                                    com.apollographql.apollo.api.ApolloResponse Camera2StreamConfigurationMap22 = Camera2StreamConfigurationMap(apolloResponse3, "STEPUP_ERROR", "Unexpected error during step-up verification");
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloRequest2);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloResponse3);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error2);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloInterceptorChain2);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function22);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizesFor = null;
                                    stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM = 5;
                                }
                            }
                            return coroutine_suspended;
                        }
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.network.graphql.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[4];
                        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, apolloRequest.getOperation().name());
                        pairArr[1] = kotlin.TuplesKt.to(FIELD_STEP_UP_CONTEXT_ID, java.lang.Boolean.valueOf(str != null));
                        pairArr[2] = kotlin.TuplesKt.to(FIELD_FLOW_NAME, java.lang.Boolean.valueOf(str2 != null));
                        pairArr[3] = kotlin.TuplesKt.to("flowContext", java.lang.Boolean.valueOf(str3 != null));
                        com.paypal.android.logger.Logger.e$default(logger, "Missing required fields in challengeContext", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                    }
                    stepupChallengeInput = null;
                    if (stepupChallengeInput != null) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    stepupChallengeInput2 = (com.paypal.oslo.core.identity.stepup.StepupChallengeInput) stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration;
                    function22 = (kotlin.jvm.functions.Function2) stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats;
                    apolloInterceptorChain3 = (com.apollographql.apollo.interceptor.ApolloInterceptorChain) stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI;
                    error3 = (com.apollographql.apollo.api.Error) stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges;
                    apolloResponse2 = (com.apollographql.apollo.api.ApolloResponse) stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor;
                    apolloRequest3 = (com.apollographql.apollo.api.ApolloRequest) stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = (arrow.core.Either) obj;
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        error2 = error3;
                        apolloRequest2 = apolloRequest3;
                        apolloInterceptorChain2 = apolloInterceptorChain3;
                        stepupChallengeInput = stepupChallengeInput2;
                        apolloResponse3 = apolloResponse2;
                    }
                    if (!(either instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.core.identity.stepup.StepupSuccess stepupSuccess = (com.paypal.oslo.core.identity.stepup.StepupSuccess) ((arrow.core.Either.Right) either).getValue();
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI = apolloRequest3;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor = apolloResponse2;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error3);
                        stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloInterceptorChain3);
                        stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats = function22;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput2);
                        stepupChallengeInterceptor$handleStepupChallenge$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupSuccess);
                        stepupChallengeInterceptor$handleStepupChallenge$1.Camera2StreamConfigurationMap = 0;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizes = 0;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM = 3;
                    } else {
                        if (!(either instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.core.identity.stepup.StepupError stepupError = (com.paypal.oslo.core.identity.stepup.StepupError) ((arrow.core.Either.Left) either).getValue();
                        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, apolloRequest3.getOperation().name()), kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(stepupError.getClass()).getSimpleName()));
                        if (stepupError instanceof com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed) {
                            mutableMapOf.put("stepupFailureReason", ((com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed) stepupError).getReason());
                        }
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Step-up failed/canceled - returning original STEPUP_CHALLENGE error", mutableMapOf, null, 4, null);
                        if (stepupError instanceof com.paypal.oslo.core.identity.stepup.StepupError.UserCanceled) {
                            pair = kotlin.TuplesKt.to("USER_CANCELED", "User canceled verification");
                        } else {
                            if (!(stepupError instanceof com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            pair = kotlin.TuplesKt.to("STEPUP_FAILED", ((com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed) stepupError).getReason());
                        }
                        com.apollographql.apollo.api.ApolloResponse Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(apolloResponse2, (java.lang.String) pair.component1(), (java.lang.String) pair.component2());
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI = apolloRequest3;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor = apolloResponse2;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error3);
                        stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloInterceptorChain3);
                        stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats = function22;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput2);
                        stepupChallengeInterceptor$handleStepupChallenge$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupError);
                        stepupChallengeInterceptor$handleStepupChallenge$1.Camera2StreamConfigurationMap = 0;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizes = 0;
                        stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM = 4;
                        if (function22.invoke(Camera2StreamConfigurationMap3, stepupChallengeInterceptor$handleStepupChallenge$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i == 3) {
                        int i2 = stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizes;
                        int i3 = stepupChallengeInterceptor$handleStepupChallenge$1.Camera2StreamConfigurationMap;
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        int i4 = stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizes;
                        int i5 = stepupChallengeInterceptor$handleStepupChallenge$1.Camera2StreamConfigurationMap;
                    }
                    com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput3 = (com.paypal.oslo.core.identity.stepup.StepupChallengeInput) stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration;
                    function22 = (kotlin.jvm.functions.Function2) stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats;
                    com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain4 = (com.apollographql.apollo.interceptor.ApolloInterceptorChain) stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI;
                    error2 = (com.apollographql.apollo.api.Error) stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges;
                    com.apollographql.apollo.api.ApolloResponse<D> apolloResponse4 = (com.apollographql.apollo.api.ApolloResponse) stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor;
                    apolloRequest2 = (com.apollographql.apollo.api.ApolloRequest) stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Unexpected exception in StepupChallengeHandler - returning original error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, apolloRequest2.getOperation().name()), kotlin.TuplesKt.to("exceptionType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName())), null, e, 4, null);
                com.apollographql.apollo.api.ApolloResponse Camera2StreamConfigurationMap222 = Camera2StreamConfigurationMap(apolloResponse3, "STEPUP_ERROR", "Unexpected error during step-up verification");
                stepupChallengeInterceptor$handleStepupChallenge$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloRequest2);
                stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloResponse3);
                stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error2);
                stepupChallengeInterceptor$handleStepupChallenge$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloInterceptorChain2);
                stepupChallengeInterceptor$handleStepupChallenge$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function22);
                stepupChallengeInterceptor$handleStepupChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
                stepupChallengeInterceptor$handleStepupChallenge$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
                stepupChallengeInterceptor$handleStepupChallenge$1.getHighSpeedVideoSizesFor = null;
                stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM = 5;
            }
        }
        stepupChallengeInterceptor$handleStepupChallenge$1 = new com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$handleStepupChallenge$1(this, continuation);
        java.lang.Object obj7 = stepupChallengeInterceptor$handleStepupChallenge$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepupChallengeInterceptor$handleStepupChallenge$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
    }

    private static <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> Camera2StreamConfigurationMap(com.apollographql.apollo.api.ApolloResponse<D> p0, java.lang.String p1, java.lang.String p2) {
        return p0.newBuilder().extensions(kotlin.collections.MapsKt.plus(p0.extensions, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("stepup_failure", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(KEY_FAILURE_TYPE, p1), kotlin.TuplesKt.to(KEY_FAILURE_REASON, p2)))))).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, final kotlin.jvm.functions.Function2<? super com.apollographql.apollo.api.ApolloResponse<D>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Retrying original request after step-up completion", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, apolloRequest.getOperation().name())), null, 4, null);
        java.lang.Object collect = apolloInterceptorChain.proceed(apolloRequest).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$retryAfterStepup$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                com.paypal.android.logger.Logger logger = com.paypal.oslo.core.network.graphql.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                java.util.List<com.apollographql.apollo.api.Error> list = apolloResponse.errors;
                pairArr[0] = kotlin.TuplesKt.to("hasErrors", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list != null && (list.isEmpty() ^ true)));
                pairArr[1] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(apolloResponse.data != 0));
                com.paypal.android.logger.Logger.d$default(logger, "Retry emission received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                java.lang.Object invoke = function2.invoke(apolloResponse, continuation2);
                return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/interceptor/StepupChallengeInterceptor$Companion;", "", "<init>", "()V", "", "EXTENSION_NAME", "Ljava/lang/String;", "STEPUP_CHALLENGE_VALUE", "KEY_CHALLENGE_CONTEXT", "FIELD_STEP_UP_CONTEXT_ID", "FIELD_FLOW_NAME", "FIELD_FLOW_CONTEXT", "FIELD_FLOW_CONTEXT_ID", "KEY_FAILURE_TYPE", "KEY_FAILURE_REASON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$logStepupChallengeDetected(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor stepupChallengeInterceptor, com.apollographql.apollo.api.ApolloRequest apolloRequest, com.apollographql.apollo.api.ApolloResponse apolloResponse, com.apollographql.apollo.api.Error error) {
        java.lang.String str;
        java.lang.Object obj = apolloResponse.extensions.get("correlationId");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.network.graphql.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, apolloRequest.getOperation().name());
        java.util.List<java.lang.Object> path = error.getPath();
        if (path == null || (str = kotlin.collections.CollectionsKt.joinToString$default(path, ".", null, null, 0, null, null, 62, null)) == null) {
            str = "unknown";
        }
        pairArr[1] = kotlin.TuplesKt.to("errorPath", str);
        if (str2 == null) {
            str2 = "unknown";
        }
        pairArr[2] = kotlin.TuplesKt.to("correlationId", str2);
        java.util.Map<java.lang.String, java.lang.Object> extensions = error.getExtensions();
        pairArr[3] = kotlin.TuplesKt.to("hasChallengeContext", java.lang.Boolean.valueOf(extensions != null ? extensions.containsKey(KEY_CHALLENGE_CONTEXT) : false));
        com.paypal.android.logger.Logger.i$default(logger, "STEPUP_CHALLENGE detected", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }
}
