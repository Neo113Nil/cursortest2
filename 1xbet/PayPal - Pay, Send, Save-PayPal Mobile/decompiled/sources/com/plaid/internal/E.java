package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.ChannelPolling", f = "ChannelPolling.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 52}, m = "pollOnChannel", n = {"this", "channelInfo", "pollingCallback", "fetchId", "shouldExitAfterThisPoll", "this", "channelInfo", "pollingCallback", "fetchId", "shouldExitAfterThisPoll"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"})
/* loaded from: classes16.dex */
public final class E extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.F f5774a;
    public com.plaid.internal.A b;
    public com.plaid.internal.G c;
    public java.lang.String d;
    public boolean e;
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ com.plaid.internal.F g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(com.plaid.internal.F f, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return com.plaid.internal.F.a(this.g, null, null, this);
    }
}
