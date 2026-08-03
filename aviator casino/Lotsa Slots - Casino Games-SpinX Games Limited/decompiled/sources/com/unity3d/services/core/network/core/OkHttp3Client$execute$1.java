package com.unity3d.services.core.network.core;

/* compiled from: OkHttp3Client.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.network.core.OkHttp3Client", f = "OkHttp3Client.kt", i = {0, 0, 0, 0}, l = {134}, m = "execute", n = {"request", "okHttpRequest", "configuredClient", "withInputStream"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* loaded from: classes6.dex */
final class OkHttp3Client$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.network.core.OkHttp3Client this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttp3Client$execute$1(com.unity3d.services.core.network.core.OkHttp3Client okHttp3Client, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.OkHttp3Client$execute$1> continuation) {
        super(continuation);
        this.this$0 = okHttp3Client;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, false, this);
    }
}
