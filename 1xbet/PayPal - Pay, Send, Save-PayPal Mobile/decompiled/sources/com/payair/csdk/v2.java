package com.payair.csdk;

/* loaded from: classes4.dex */
public final class v2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.db.TokenDetailsDaoInternal f4326a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.payair.db.TokenDetailsDaoInternal c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.payair.db.TokenDetailsDaoInternal tokenDetailsDaoInternal, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = tokenDetailsDaoInternal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.getByNetworkTokenReference(null, this);
    }
}
