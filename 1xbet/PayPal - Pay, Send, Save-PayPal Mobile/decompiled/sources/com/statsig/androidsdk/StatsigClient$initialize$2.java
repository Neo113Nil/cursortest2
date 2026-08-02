package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$initialize$2", f = "StatsigClient.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StatsigClient$initialize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails>, java.lang.Object> {
    final /* synthetic */ android.app.Application $application;
    final /* synthetic */ com.statsig.androidsdk.StatsigOptions $options;
    final /* synthetic */ java.lang.String $sdkKey;
    final /* synthetic */ com.statsig.androidsdk.StatsigUser $user;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.statsig.androidsdk.StatsigUser upVar;
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            upVar = this.this$0.setup(this.$application, this.$sdkKey, this.$user, this.$options);
            this.label = 1;
            obj = this.this$0.setupAsync$android_sdk_release(upVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.statsig.androidsdk.InitializationDetails initializationDetails = (com.statsig.androidsdk.InitializationDetails) obj;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        j = this.this$0.initTime;
        initializationDetails.setDuration(elapsedRealtime - j);
        initializationDetails.getSuccess();
        com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failureDetails = initializationDetails.getFailureDetails();
        if (failureDetails != null) {
            failureDetails.getReason();
            if (failureDetails.getException() != null) {
                kotlin.coroutines.jvm.internal.Boxing.boxInt(android.util.Log.e("statsig::StatsigClient", "initializeAsync failure exception: ".concat(java.lang.String.valueOf(failureDetails.getException()))));
            }
        }
        return initializationDetails;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails> continuation) {
        return ((com.statsig.androidsdk.StatsigClient$initialize$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigClient$initialize$2(this.this$0, this.$application, this.$sdkKey, this.$user, this.$options, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$initialize$2(com.statsig.androidsdk.StatsigClient statsigClient, android.app.Application application, java.lang.String str, com.statsig.androidsdk.StatsigUser statsigUser, com.statsig.androidsdk.StatsigOptions statsigOptions, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$initialize$2> continuation) {
        super(1, continuation);
        this.this$0 = statsigClient;
        this.$application = application;
        this.$sdkKey = str;
        this.$user = statsigUser;
        this.$options = statsigOptions;
    }
}
