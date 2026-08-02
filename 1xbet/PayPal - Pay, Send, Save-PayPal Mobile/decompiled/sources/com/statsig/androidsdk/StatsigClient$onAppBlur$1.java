package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$onAppBlur$1", f = "StatsigClient.kt", i = {}, l = {1609}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StatsigClient$onAppBlur$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.statsig.androidsdk.StatsigLogger statsigLogger;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            statsigLogger = this.this$0.logger;
            if (statsigLogger == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                statsigLogger = null;
            }
            this.label = 1;
            if (statsigLogger.flush(this) == coroutine_suspended) {
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
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.StatsigClient$onAppBlur$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigClient$onAppBlur$1(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$onAppBlur$1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$onAppBlur$1> continuation) {
        super(2, continuation);
        this.this$0 = statsigClient;
    }
}
