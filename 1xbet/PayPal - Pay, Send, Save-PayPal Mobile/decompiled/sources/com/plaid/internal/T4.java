package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore", f = "PlaidClientSideOnlyConfigurationStore.kt", i = {0}, l = {22}, m = "read", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
public final class T4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.W4 f5925a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.W4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(com.plaid.internal.W4 w4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = w4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
