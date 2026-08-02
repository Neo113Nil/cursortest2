package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializeResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$initialize$2", f = "StatsigNetwork.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m = "invokeSuspend", n = {"response"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class StatsigNetworkImpl$initialize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializeResponse>, java.lang.Object> {
    final /* synthetic */ java.lang.String $api;
    final /* synthetic */ com.statsig.androidsdk.ContextType $contextType;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope $coroutineScope;
    final /* synthetic */ com.statsig.androidsdk.Diagnostics $diagnostics;
    final /* synthetic */ java.lang.String $fullChecksum;
    final /* synthetic */ com.statsig.androidsdk.HashAlgorithm $hashUsed;
    final /* synthetic */ com.statsig.androidsdk.StatsigMetadata $metadata;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> $previousDerivedFields;
    final /* synthetic */ int $retry;
    final /* synthetic */ java.lang.Long $sinceTime;
    final /* synthetic */ com.statsig.androidsdk.StatsigUser $user;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.statsig.androidsdk.InitializeResponse$FailedInitializeResponse] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = new com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse(com.statsig.androidsdk.InitializeFailReason.InternalError, null, null);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, this.this$0.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigNetworkImpl$initialize$2.AnonymousClass1(objectRef2, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$retry, this.$hashUsed, this.$previousDerivedFields, this.$fullChecksum, null), 2, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (launch$default.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$initialize$2$1", f = "StatsigNetwork.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initialize$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $api;
        final /* synthetic */ com.statsig.androidsdk.ContextType $contextType;
        final /* synthetic */ com.statsig.androidsdk.Diagnostics $diagnostics;
        final /* synthetic */ java.lang.String $fullChecksum;
        final /* synthetic */ com.statsig.androidsdk.HashAlgorithm $hashUsed;
        final /* synthetic */ com.statsig.androidsdk.StatsigMetadata $metadata;
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> $previousDerivedFields;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.InitializeResponse> $response;
        final /* synthetic */ int $retry;
        final /* synthetic */ java.lang.Long $sinceTime;
        final /* synthetic */ com.statsig.androidsdk.StatsigUser $user;
        java.lang.Object L$0;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.statsig.androidsdk.StatsigOptions statsigOptions;
            com.statsig.androidsdk.StatsigOptions statsigOptions2;
            java.lang.Object initializeImplWithRetry;
            kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.InitializeResponse> objectRef;
            T t;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.InitializeResponse> objectRef2 = this.$response;
                statsigOptions = this.this$0.options;
                int initTimeoutMs = (int) statsigOptions.getInitTimeoutMs();
                statsigOptions2 = this.this$0.options;
                java.util.List<java.lang.String> initializeFallbackUrls = statsigOptions2.getInitializeFallbackUrls();
                this.L$0 = objectRef2;
                this.label = 1;
                initializeImplWithRetry = this.this$0.initializeImplWithRetry(this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, kotlin.coroutines.jvm.internal.Boxing.boxInt(initTimeoutMs), this.$retry, this.$hashUsed, this.$previousDerivedFields, this.$fullChecksum, initializeFallbackUrls, this);
                if (initializeImplWithRetry == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t = initializeImplWithRetry;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                t = obj;
            }
            objectRef.element = t;
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.StatsigNetworkImpl$initialize$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.statsig.androidsdk.StatsigNetworkImpl$initialize$2.AnonymousClass1(this.$response, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$retry, this.$hashUsed, this.$previousDerivedFields, this.$fullChecksum, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.InitializeResponse> objectRef, com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, java.lang.String str, com.statsig.androidsdk.StatsigUser statsigUser, java.lang.Long l, com.statsig.androidsdk.StatsigMetadata statsigMetadata, com.statsig.androidsdk.ContextType contextType, com.statsig.androidsdk.Diagnostics diagnostics, int i, com.statsig.androidsdk.HashAlgorithm hashAlgorithm, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$initialize$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$response = objectRef;
            this.this$0 = statsigNetworkImpl;
            this.$api = str;
            this.$user = statsigUser;
            this.$sinceTime = l;
            this.$metadata = statsigMetadata;
            this.$contextType = contextType;
            this.$diagnostics = diagnostics;
            this.$retry = i;
            this.$hashUsed = hashAlgorithm;
            this.$previousDerivedFields = map;
            this.$fullChecksum = str2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializeResponse> continuation) {
        return ((com.statsig.androidsdk.StatsigNetworkImpl$initialize$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigNetworkImpl$initialize$2(this.$coroutineScope, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$retry, this.$hashUsed, this.$previousDerivedFields, this.$fullChecksum, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigNetworkImpl$initialize$2(kotlinx.coroutines.CoroutineScope coroutineScope, com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, java.lang.String str, com.statsig.androidsdk.StatsigUser statsigUser, java.lang.Long l, com.statsig.androidsdk.StatsigMetadata statsigMetadata, com.statsig.androidsdk.ContextType contextType, com.statsig.androidsdk.Diagnostics diagnostics, int i, com.statsig.androidsdk.HashAlgorithm hashAlgorithm, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$initialize$2> continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.this$0 = statsigNetworkImpl;
        this.$api = str;
        this.$user = statsigUser;
        this.$sinceTime = l;
        this.$metadata = statsigMetadata;
        this.$contextType = contextType;
        this.$diagnostics = diagnostics;
        this.$retry = i;
        this.$hashUsed = hashAlgorithm;
        this.$previousDerivedFields = map;
        this.$fullChecksum = str2;
    }
}
