package com.payair.csdk;

/* loaded from: classes4.dex */
public final class t2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4317a;
    public java.lang.String b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.payair.db.TokenDetailsDaoInternal d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.payair.db.TokenDetailsDaoInternal tokenDetailsDaoInternal, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = tokenDetailsDaoInternal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.delete((java.lang.String) null, this);
    }
}
