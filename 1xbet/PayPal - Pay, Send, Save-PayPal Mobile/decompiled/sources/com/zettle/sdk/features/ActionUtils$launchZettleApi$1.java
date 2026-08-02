package com.zettle.sdk.features;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.features.ActionUtils$launchZettleApi$1", f = "Action.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ActionUtils$launchZettleApi$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.zettle.sdk.ui.ZettleApiResult, kotlin.Unit> $callback;
    final /* synthetic */ com.zettle.sdk.features.Headless $this_launchZettleApi;
    java.lang.Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object headlessApi;
        kotlin.jvm.functions.Function1 function1;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<com.zettle.sdk.ui.ZettleApiResult, kotlin.Unit> function12 = this.$callback;
            this.L$0 = function12;
            this.label = 1;
            headlessApi = com.zettle.sdk.features.ActionUtils.headlessApi(this.$this_launchZettleApi, this);
            if (headlessApi == coroutine_suspended) {
                return coroutine_suspended;
            }
            function1 = function12;
            obj = headlessApi;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (kotlin.jvm.functions.Function1) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        function1.invoke(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.features.ActionUtils$launchZettleApi$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.features.ActionUtils$launchZettleApi$1(this.$callback, this.$this_launchZettleApi, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActionUtils$launchZettleApi$1(kotlin.jvm.functions.Function1<? super com.zettle.sdk.ui.ZettleApiResult, kotlin.Unit> function1, com.zettle.sdk.features.Headless headless, kotlin.coroutines.Continuation<? super com.zettle.sdk.features.ActionUtils$launchZettleApi$1> continuation) {
        super(2, continuation);
        this.$callback = function1;
        this.$this_launchZettleApi = headless;
    }
}
