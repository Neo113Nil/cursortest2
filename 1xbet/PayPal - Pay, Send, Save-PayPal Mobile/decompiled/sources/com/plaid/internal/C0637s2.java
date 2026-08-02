package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, l = {108, 112, 115, 116, 119, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125}, m = "storeStateAndNavigate", n = {"this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.plaid.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0637s2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f6564a;
    public com.plaid.internal.N2 b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.plaid.internal.C0646t2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0637s2(com.plaid.internal.C0646t2 c0646t2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0646t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((com.plaid.internal.N2) null, this);
    }
}
