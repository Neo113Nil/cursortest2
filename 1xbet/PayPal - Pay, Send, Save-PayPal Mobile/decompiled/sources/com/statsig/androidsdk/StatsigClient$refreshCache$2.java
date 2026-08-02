package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$refreshCache$2", f = "StatsigClient.kt", i = {}, l = {782}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StatsigClient$refreshCache$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Integer>, java.lang.Object> {
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.statsig.androidsdk.Diagnostics diagnostics;
        java.lang.Object updateUserImpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            diagnostics = this.this$0.diagnostics;
            if (diagnostics == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                diagnostics = null;
            }
            com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics, com.statsig.androidsdk.KeyType.OVERALL, null, null, com.statsig.androidsdk.ContextType.UPDATE_USER, 6, null);
            this.label = 1;
            updateUserImpl = this.this$0.updateUserImpl(this);
            if (updateUserImpl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(android.util.Log.v("statsig::StatsigClient", "refreshCache completed"));
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return ((com.statsig.androidsdk.StatsigClient$refreshCache$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigClient$refreshCache$2(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$refreshCache$2(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$refreshCache$2> continuation) {
        super(1, continuation);
        this.this$0 = statsigClient;
    }
}
