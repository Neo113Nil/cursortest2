package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.persistence.DatabaseBackedPaneStore", f = "DatabaseBackedPaneStore.kt", i = {0, 0}, l = {19}, m = "getPane", n = {"this", "pane"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0618q0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0626r0 f6541a;
    public com.plaid.internal.r8 b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.plaid.internal.C0626r0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618q0(com.plaid.internal.C0626r0 c0626r0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0626r0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
