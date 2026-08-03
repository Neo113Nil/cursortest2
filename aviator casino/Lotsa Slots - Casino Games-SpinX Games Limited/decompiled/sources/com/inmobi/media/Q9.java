package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Q9 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4913a;
    public int b;

    public Q9(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.f4913a = obj;
        this.b |= Integer.MIN_VALUE;
        a2 = com.inmobi.unifiedId.InMobiUnifiedIdService.a((com.inmobi.unifiedId.InMobiUserDataModel) null, this);
        return a2;
    }
}
