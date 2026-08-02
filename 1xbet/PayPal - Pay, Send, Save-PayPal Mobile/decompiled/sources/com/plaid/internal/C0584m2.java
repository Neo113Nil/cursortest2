package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {}, l = {98}, m = "handleSessionHandoff", n = {}, s = {})
/* renamed from: com.plaid.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0584m2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6491a;
    public final /* synthetic */ com.plaid.internal.C0646t2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0584m2(com.plaid.internal.C0646t2 c0646t2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0646t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6491a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((java.util.LinkedHashMap) null, this);
    }
}
