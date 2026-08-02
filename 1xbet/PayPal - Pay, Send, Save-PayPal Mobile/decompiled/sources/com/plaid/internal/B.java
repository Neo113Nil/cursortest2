package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.di.ChannelInfoStore", f = "ChannelInfoStore.kt", i = {0}, l = {25}, m = "readChannelInfo", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
public final class B extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C f5754a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.C c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(com.plaid.internal.C c, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
