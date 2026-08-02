package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry", f = "ExponentialBackoffRetry.kt", i = {0, 0, 1}, l = {22, 24}, m = "doNetworkCallWithRetries$link_sdk_release", n = {"apiCall", "networkResponse", "networkResponse"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes16.dex */
public final class X0<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f5969a;
    public kotlin.jvm.internal.Ref.ObjectRef b;
    public kotlin.jvm.internal.Ref.ObjectRef c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.plaid.internal.Z0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(com.plaid.internal.Z0 z0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = z0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
