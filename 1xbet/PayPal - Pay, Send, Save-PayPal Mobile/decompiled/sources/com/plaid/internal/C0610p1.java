package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {0, 0}, l = {91}, m = "openLoginUrl", n = {"this", "loginUri"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.p1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0610p1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0574l1 f6527a;
    public java.lang.String b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.plaid.internal.C0574l1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610p1(com.plaid.internal.C0574l1 c0574l1, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0574l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return com.plaid.internal.C0574l1.a(this.d, (java.lang.String) null, this);
    }
}
