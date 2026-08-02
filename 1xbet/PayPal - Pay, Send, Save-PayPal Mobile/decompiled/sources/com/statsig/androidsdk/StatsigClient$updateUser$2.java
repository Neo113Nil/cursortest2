package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$updateUser$2", f = "StatsigClient.kt", i = {}, l = {734}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StatsigClient$updateUser$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Integer>, java.lang.Object> {
    final /* synthetic */ com.statsig.androidsdk.StatsigUser $user;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> $values;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.statsig.androidsdk.Diagnostics diagnostics;
        com.statsig.androidsdk.Diagnostics diagnostics2;
        com.statsig.androidsdk.StatsigUser normalizeUser;
        com.statsig.androidsdk.Store store;
        java.lang.Object updateUserImpl;
        com.statsig.androidsdk.Store store2;
        com.statsig.androidsdk.StatsigUser statsigUser;
        int v;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            diagnostics = this.this$0.diagnostics;
            com.statsig.androidsdk.Store store3 = null;
            if (diagnostics == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                diagnostics2 = null;
            } else {
                diagnostics2 = diagnostics;
            }
            com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics2, com.statsig.androidsdk.KeyType.OVERALL, null, null, com.statsig.androidsdk.ContextType.UPDATE_USER, 6, null);
            com.statsig.androidsdk.StatsigClient statsigClient = this.this$0;
            normalizeUser = statsigClient.normalizeUser(this.$user);
            statsigClient.user = normalizeUser;
            this.this$0.resetUser();
            if (this.$values != null) {
                store2 = this.this$0.store;
                if (store2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store2 = null;
                }
                java.util.Map<java.lang.String, ? extends java.lang.Object> map = this.$values;
                statsigUser = this.this$0.user;
                if (statsigUser == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser = null;
                }
                store2.bootstrap(map, statsigUser);
                this.this$0.logEndDiagnostics(true, com.statsig.androidsdk.ContextType.UPDATE_USER, null);
                v = android.util.Log.v("statsig::StatsigClient", "updateUser completed with provided values");
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(v);
            }
            store = this.this$0.store;
            if (store == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                store3 = store;
            }
            store3.loadCacheForCurrentUser();
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
        v = android.util.Log.v("statsig::StatsigClient", "updateUser completed");
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return ((com.statsig.androidsdk.StatsigClient$updateUser$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigClient$updateUser$2(this.this$0, this.$user, this.$values, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$updateUser$2(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.StatsigUser statsigUser, java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$updateUser$2> continuation) {
        super(1, continuation);
        this.this$0 = statsigClient;
        this.$user = statsigUser;
        this.$values = map;
    }
}
