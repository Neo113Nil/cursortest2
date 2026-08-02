package com.apollographql.apollo;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010 \u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b \u0010\u000fJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010#\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b#\u0010\u000fJ\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010$\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b$\u0010\u000fJ\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010%\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b%\u0010\u000fJ\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0(¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0(H\u0007¢\u0006\u0004\b,\u0010+J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0087@¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0086@¢\u0006\u0004\b/\u0010.J*\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0(H\u0082@¢\u0006\u0004\b1\u00102R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8G¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010 \u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010!\u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010@R\u0016\u0010\"\u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0016\u0010#\u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010@R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010%\u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0019\u0010$\u001a\u0004\u0018\u00010\r8G¢\u0006\f\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010@R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8G¢\u0006\f\u0012\u0004\bK\u0010I\u001a\u0004\bJ\u0010@"}, d2 = {"Lcom/apollographql/apollo/ApolloCall;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "requestBuilder", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/ApolloRequest$Builder;)V", "Lcom/apollographql/apollo/api/Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Operation;)V", "", "failFastIfOffline", "(Ljava/lang/Boolean;)Lcom/apollographql/apollo/ApolloCall;", "Lcom/apollographql/apollo/api/ExecutionContext;", "executionContext", "addExecutionContext", "(Lcom/apollographql/apollo/api/ExecutionContext;)Lcom/apollographql/apollo/ApolloCall;", "Lcom/apollographql/apollo/api/http/HttpMethod;", "httpMethod", "(Lcom/apollographql/apollo/api/http/HttpMethod;)Lcom/apollographql/apollo/ApolloCall;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "httpHeaders", "(Ljava/util/List;)Lcom/apollographql/apollo/ApolloCall;", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addHttpHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/ApolloCall;", "sendApqExtensions", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "retryOnError", "ignoreApolloClientHttpHeaders", "copy", "()Lcom/apollographql/apollo/ApolloCall;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "toFlow", "()Lkotlinx/coroutines/flow/Flow;", "toFlowV3", "executeV3", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "p0", "getHighSpeedVideoFpsRanges", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/ApolloClient;", "getApolloClient$apollo_runtime_release", "()Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "getHighResolutionOutputSizeshNQ4ISI", "getOperation", "()Lcom/apollographql/apollo/api/Operation;", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "getSendApqExtensions", "()Ljava/lang/Boolean;", "getSendDocument", "getEnableAutoPersistedQueries", "getCanBeBatched", "getHttpHeaders", "()Ljava/util/List;", "getIgnoreApolloClientHttpHeaders", "getRetryOnError", "getRetryOnError$annotations", "()V", "getFailFastIfOffline", "getFailFastIfOffline$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloCall<D extends com.apollographql.apollo.api.Operation.Data> implements com.apollographql.apollo.api.MutableExecutionOptions<com.apollographql.apollo.ApolloCall<D>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.ApolloRequest.Builder<D> getHighResolutionOutputSizeshNQ4ISI;
    private final com.apollographql.apollo.ApolloClient apolloClient;

    public static /* synthetic */ void getFailFastIfOffline$annotations() {
    }

    public static /* synthetic */ void getRetryOnError$annotations() {
    }

    public ApolloCall(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.ApolloRequest.Builder<D> builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        this.apolloClient = apolloClient;
        this.getHighResolutionOutputSizeshNQ4ISI = builder;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final /* bridge */ /* synthetic */ java.lang.Object httpHeaders(java.util.List list) {
        return httpHeaders((java.util.List<com.apollographql.apollo.api.http.HttpHeader>) list);
    }

    /* renamed from: getApolloClient$apollo_runtime_release, reason: from getter */
    public final com.apollographql.apollo.ApolloClient getApolloClient() {
        return this.apolloClient;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApolloCall(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Operation<D> operation) {
        this(apolloClient, new com.apollographql.apollo.api.ApolloRequest.Builder(operation));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
    }

    public final com.apollographql.apollo.api.Operation<D> getOperation() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOperation();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final com.apollographql.apollo.api.ExecutionContext getExecutionContext() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getExecutionContext();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final com.apollographql.apollo.api.http.HttpMethod getHttpMethod() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHttpMethod();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.lang.Boolean getSendApqExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSendApqExtensions();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.lang.Boolean getSendDocument() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSendDocument();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.lang.Boolean getEnableAutoPersistedQueries() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEnableAutoPersistedQueries();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.lang.Boolean getCanBeBatched() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCanBeBatched();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHttpHeaders() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHttpHeaders();
    }

    public final java.lang.Boolean getIgnoreApolloClientHttpHeaders() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIgnoreApolloClientHttpHeaders();
    }

    public final java.lang.Boolean getRetryOnError() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRetryOnError();
    }

    public final java.lang.Boolean getFailFastIfOffline() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFailFastIfOffline();
    }

    public final com.apollographql.apollo.ApolloCall<D> failFastIfOffline(java.lang.Boolean failFastIfOffline) {
        this.getHighResolutionOutputSizeshNQ4ISI.failFastIfOffline(failFastIfOffline);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final com.apollographql.apollo.ApolloCall<D> addExecutionContext(com.apollographql.apollo.api.ExecutionContext executionContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        this.getHighResolutionOutputSizeshNQ4ISI.addExecutionContext(executionContext);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final com.apollographql.apollo.ApolloCall<D> httpMethod(com.apollographql.apollo.api.http.HttpMethod httpMethod) {
        this.getHighResolutionOutputSizeshNQ4ISI.httpMethod(httpMethod);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final com.apollographql.apollo.ApolloCall<D> httpHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> httpHeaders) {
        this.getHighResolutionOutputSizeshNQ4ISI.httpHeaders(httpHeaders);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final com.apollographql.apollo.ApolloCall<D> addHttpHeader(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighResolutionOutputSizeshNQ4ISI.addHttpHeader(name2, value);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final com.apollographql.apollo.ApolloCall<D> sendApqExtensions(java.lang.Boolean sendApqExtensions) {
        this.getHighResolutionOutputSizeshNQ4ISI.sendApqExtensions(sendApqExtensions);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final com.apollographql.apollo.ApolloCall<D> sendDocument(java.lang.Boolean sendDocument) {
        this.getHighResolutionOutputSizeshNQ4ISI.sendDocument(sendDocument);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final com.apollographql.apollo.ApolloCall<D> enableAutoPersistedQueries(java.lang.Boolean enableAutoPersistedQueries) {
        this.getHighResolutionOutputSizeshNQ4ISI.enableAutoPersistedQueries(enableAutoPersistedQueries);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public final com.apollographql.apollo.ApolloCall<D> canBeBatched(java.lang.Boolean canBeBatched) {
        this.getHighResolutionOutputSizeshNQ4ISI.canBeBatched(canBeBatched);
        return this;
    }

    public final com.apollographql.apollo.ApolloCall<D> retryOnError(java.lang.Boolean retryOnError) {
        this.getHighResolutionOutputSizeshNQ4ISI.retryOnError(retryOnError);
        return this;
    }

    public final com.apollographql.apollo.ApolloCall<D> ignoreApolloClientHttpHeaders(java.lang.Boolean ignoreApolloClientHttpHeaders) {
        this.getHighResolutionOutputSizeshNQ4ISI.ignoreApolloClientHttpHeaders(ignoreApolloClientHttpHeaders);
        return this;
    }

    public final com.apollographql.apollo.ApolloCall<D> copy() {
        return new com.apollographql.apollo.ApolloCall<>(this.apolloClient, this.getHighResolutionOutputSizeshNQ4ISI.build().newBuilder());
    }

    public final kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> toFlow() {
        return this.apolloClient.executeAsFlowInternal$apollo_runtime_release(this.getHighResolutionOutputSizeshNQ4ISI.build(), false);
    }

    @kotlin.Deprecated(message = "Use toFlow() and handle ApolloResponse.exception instead")
    public final kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> toFlowV3() {
        return ((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.ConflatedResponsesKt.conflateFetchPolicyInterceptorResponses(this, true)).apolloClient.executeAsFlowInternal$apollo_runtime_release(this.getHighResolutionOutputSizeshNQ4ISI.build(), true);
    }

    @kotlin.Deprecated(message = "Use execute() and handle ApolloResponse.exception instead")
    public final java.lang.Object executeV3(kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<D>> continuation) {
        return getHighSpeedVideoFpsRanges(toFlowV3(), continuation);
    }

    public final java.lang.Object execute(kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<D>> continuation) {
        return getHighSpeedVideoFpsRanges(toFlow(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> flow, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<D>> continuation) {
        com.apollographql.apollo.ApolloCall$singleSuccessOrException$1 apolloCall$singleSuccessOrException$1;
        int i;
        int size;
        if (continuation instanceof com.apollographql.apollo.ApolloCall$singleSuccessOrException$1) {
            apolloCall$singleSuccessOrException$1 = (com.apollographql.apollo.ApolloCall$singleSuccessOrException$1) continuation;
            if ((apolloCall$singleSuccessOrException$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                apolloCall$singleSuccessOrException$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = apolloCall$singleSuccessOrException$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apolloCall$singleSuccessOrException$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    apolloCall$singleSuccessOrException$1.Camera2StreamConfigurationMap = 1;
                    obj = kotlinx.coroutines.flow.FlowKt__CollectionKt.toList$default(flow, null, apolloCall$singleSuccessOrException$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : (java.util.List) obj) {
                    if (((com.apollographql.apollo.api.ApolloResponse) obj2).exception != null) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
                java.util.List list = (java.util.List) pair.component1();
                java.util.List list2 = (java.util.List) pair.component2();
                size = list2.size();
                if (size == 0) {
                    if (size == 1) {
                        return (com.apollographql.apollo.api.ApolloResponse) kotlin.collections.CollectionsKt.first(list2);
                    }
                    throw new com.apollographql.apollo.exception.DefaultApolloException("The operation returned multiple items, use .toFlow() instead of .execute()", null, 2, null);
                }
                int size2 = list.size();
                if (size2 == 0) {
                    throw new com.apollographql.apollo.exception.DefaultApolloException("The operation did not emit any item, check your interceptor chain", null, 2, null);
                }
                if (size2 == 1) {
                    return (com.apollographql.apollo.api.ApolloResponse) kotlin.collections.CollectionsKt.first(list);
                }
                com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) kotlin.collections.CollectionsKt.first(list);
                com.apollographql.apollo.api.ApolloResponse.Builder<D> newBuilder = apolloResponse.newBuilder();
                java.util.List drop = kotlin.collections.CollectionsKt.drop(list, 1);
                com.apollographql.apollo.exception.ApolloException apolloException = apolloResponse.exception;
                kotlin.jvm.internal.Intrinsics.checkNotNull(apolloException);
                java.util.Iterator it = drop.iterator();
                while (it.hasNext()) {
                    com.apollographql.apollo.exception.ApolloException apolloException2 = ((com.apollographql.apollo.api.ApolloResponse) it.next()).exception;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(apolloException2);
                    kotlin.ExceptionsKt.addSuppressed(apolloException, apolloException2);
                }
                return newBuilder.exception(apolloException).build();
            }
        }
        apolloCall$singleSuccessOrException$1 = new com.apollographql.apollo.ApolloCall$singleSuccessOrException$1(this, continuation);
        java.lang.Object obj3 = apolloCall$singleSuccessOrException$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apolloCall$singleSuccessOrException$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList22 = new java.util.ArrayList();
        while (r7.hasNext()) {
        }
        kotlin.Pair pair2 = new kotlin.Pair(arrayList3, arrayList22);
        java.util.List list3 = (java.util.List) pair2.component1();
        java.util.List list22 = (java.util.List) pair2.component2();
        size = list22.size();
        if (size == 0) {
        }
    }
}
