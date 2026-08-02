package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {}, l = {67}, m = "doOnStart", n = {}, s = {})
/* renamed from: com.plaid.internal.m1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0583m1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6490a;
    public final /* synthetic */ com.plaid.internal.C0574l1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583m1(com.plaid.internal.C0574l1 c0574l1, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0574l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6490a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
