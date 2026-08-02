package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.sna.TwilioAuthController", f = "TwilioAuthController.kt", i = {0, 0}, l = {25, 42}, m = "asyncAuthentication", n = {"this", "twilioSnaRequest"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.r7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0633r7 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0651t7 f6559a;
    public com.plaid.internal.C0660u7 b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.plaid.internal.C0651t7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0633r7(com.plaid.internal.C0651t7 c0651t7, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0651t7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
