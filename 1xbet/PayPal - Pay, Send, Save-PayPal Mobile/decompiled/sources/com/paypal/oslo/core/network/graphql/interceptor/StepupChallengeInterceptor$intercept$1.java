package com.paypal.oslo.core.network.graphql.interceptor;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1", f = "StepupChallengeInterceptor.kt", i = {0}, l = {135}, m = "invokeSuspend", n = {"$this$flow"}, nl = {150}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class StepupChallengeInterceptor$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow proceed = this.getHighSpeedVideoFpsRanges.proceed(this.getHighSpeedVideoFpsRangesFor);
            final com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor stepupChallengeInterceptor = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.apollographql.apollo.api.ApolloRequest<D> apolloRequest = this.getHighSpeedVideoFpsRangesFor;
            final com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoSizes = 1;
            if (proceed.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object highSpeedVideoFpsRangesFor;
                    com.apollographql.apollo.api.ApolloResponse<D> apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj2;
                    java.util.List<com.apollographql.apollo.api.Error> list = apolloResponse.errors;
                    com.apollographql.apollo.api.Error error = null;
                    if (list != null) {
                        java.util.Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.apollographql.apollo.api.Error) next).getExtensions();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(extensions != null ? extensions.get("name") : null, com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.STEPUP_CHALLENGE_VALUE)) {
                                error = next;
                                break;
                            }
                        }
                        error = error;
                    }
                    com.apollographql.apollo.api.Error error2 = error;
                    if (error2 != null) {
                        com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.access$logStepupChallengeDetected(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.this, apolloRequest, apolloResponse, error2);
                        highSpeedVideoFpsRangesFor = com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.this.getHighSpeedVideoFpsRangesFor(apolloRequest, apolloResponse, error2, apolloInterceptorChain, new com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1.AnonymousClass1.C01131(flowCollector), continuation);
                        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
                    }
                    java.lang.Object emit = flowCollector.emit(apolloResponse, continuation);
                    return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1$1$1, reason: invalid class name and collision with other inner class name */
                static final /* synthetic */ class C01131 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.apollographql.apollo.api.ApolloResponse<D>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object invoke(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((kotlinx.coroutines.flow.FlowCollector) this.receiver).emit(apolloResponse, continuation);
                    }

                    C01131(java.lang.Object obj) {
                        super(2, obj, kotlinx.coroutines.flow.FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    }
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1 stepupChallengeInterceptor$intercept$1 = new com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        stepupChallengeInterceptor$intercept$1.Camera2StreamConfigurationMap = obj;
        return stepupChallengeInterceptor$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupChallengeInterceptor$intercept$1(com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor stepupChallengeInterceptor, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = apolloInterceptorChain;
        this.getHighSpeedVideoFpsRangesFor = apolloRequest;
        this.getHighResolutionOutputSizeshNQ4ISI = stepupChallengeInterceptor;
    }
}
