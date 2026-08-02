package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.di.OAuthRedirectUriStore", f = "OAuthRedirectUriStore.kt", i = {0, 1}, l = {20, 24}, m = "readOAuthRedirectUri", n = {"this", "uri"}, s = {"L$0", "L$0"})
/* renamed from: com.plaid.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0622q4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f6545a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.C0630r4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0622q4(com.plaid.internal.C0630r4 c0630r4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0630r4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
