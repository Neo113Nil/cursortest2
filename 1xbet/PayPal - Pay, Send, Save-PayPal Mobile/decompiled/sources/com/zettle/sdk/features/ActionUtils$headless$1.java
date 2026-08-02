package com.zettle.sdk.features;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.features.ActionUtils", f = "Action.kt", i = {0, 0}, l = {73, 77}, m = "headless", n = {"$this$headless", "feature"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class ActionUtils$headless$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return com.zettle.sdk.features.ActionUtils.headless(null, this);
    }

    ActionUtils$headless$1(kotlin.coroutines.Continuation<? super com.zettle.sdk.features.ActionUtils$headless$1> continuation) {
        super(continuation);
    }
}
