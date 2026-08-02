package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", i = {}, l = {41}, m = "sendCrash", n = {}, s = {})
/* loaded from: classes16.dex */
public final class U6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5940a;
    public final /* synthetic */ com.plaid.internal.X6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(com.plaid.internal.X6 x6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = x6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5940a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((com.plaid.internal.core.crashreporting.internal.models.Crash) null, this);
    }
}
