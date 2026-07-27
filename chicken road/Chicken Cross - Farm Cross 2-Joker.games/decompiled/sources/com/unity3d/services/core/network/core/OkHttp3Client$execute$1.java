package com.unity3d.services.core.network.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OkHttp3Client.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.network.core.OkHttp3Client", f = "OkHttp3Client.kt", i = {0, 0, 0, 0}, l = {134}, m = "execute", n = {"request", "okHttpRequest", "configuredClient", "withInputStream"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* loaded from: classes7.dex */
final class OkHttp3Client$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkHttp3Client this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttp3Client$execute$1(OkHttp3Client okHttp3Client, Continuation<? super OkHttp3Client$execute$1> continuation) {
        super(continuation);
        this.this$0 = okHttp3Client;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, false, this);
    }
}
