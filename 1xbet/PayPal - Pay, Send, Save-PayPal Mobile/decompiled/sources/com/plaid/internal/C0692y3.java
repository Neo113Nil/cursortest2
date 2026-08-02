package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.persistence.LinkWorkflowAnalyticsDatabaseBackedStore", f = "LinkWorkflowAnalyticsDatabaseBackedStore.kt", i = {}, l = {25}, m = "retrieveAllEvents", n = {}, s = {})
/* renamed from: com.plaid.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0692y3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6628a;
    public final /* synthetic */ com.plaid.internal.C0701z3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0692y3(com.plaid.internal.C0701z3 c0701z3, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0701z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6628a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
