package com.zettle.sdk.features;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.features.ActionUtils", f = "Action.kt", i = {0, 0}, l = {96}, m = "headlessApi", n = {"$this$headlessApi", "feature"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class ActionUtils$headlessApi$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object headlessApi;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        headlessApi = com.zettle.sdk.features.ActionUtils.headlessApi(null, this);
        return headlessApi;
    }

    ActionUtils$headlessApi$1(kotlin.coroutines.Continuation<? super com.zettle.sdk.features.ActionUtils$headlessApi$1> continuation) {
        super(continuation);
    }
}
