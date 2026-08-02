package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.di.PreCompletionResultStore", f = "PreCompletionResultStore.kt", i = {}, l = {24}, m = "readPreCompletionResult", n = {}, s = {})
/* renamed from: com.plaid.internal.b6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0462b6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6002a;
    public final /* synthetic */ com.plaid.internal.C0472c6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462b6(com.plaid.internal.C0472c6 c0472c6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0472c6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6002a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
