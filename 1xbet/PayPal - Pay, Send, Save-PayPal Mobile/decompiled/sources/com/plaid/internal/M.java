package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.twilio.verify_sna.domain.twilioverifysna.ConcreteTwilioVerifySna", f = "ConcreteTwilioVerifySna.kt", i = {0}, l = {43}, m = "processUrl", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
public final class M extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.N f5838a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.N c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(com.plaid.internal.N n, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
