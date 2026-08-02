package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 2, 2, 2, 4, 4}, l = {56, 66, 74, 85, 93}, m = com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, n = {"this", "state", "this", "state", "isEagerStart", "this", "state"}, s = {"L$0", "L$1", "L$0", "L$1", "Z$0", "L$0", "L$1"})
/* loaded from: classes16.dex */
public final class X2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.Y2 f5971a;
    public com.plaid.internal.N2 b;
    public boolean c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.plaid.internal.Y2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(com.plaid.internal.Y2 y2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((com.plaid.internal.N2) null, false, (kotlin.coroutines.jvm.internal.ContinuationImpl) this);
    }
}
