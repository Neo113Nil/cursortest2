package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", i = {0}, l = {55}, m = "sendCrashes", n = {"results"}, s = {"L$0"})
/* loaded from: classes16.dex */
public final class V6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f5956a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.X6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(com.plaid.internal.X6 x6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = x6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((java.util.List) null, this);
    }
}
