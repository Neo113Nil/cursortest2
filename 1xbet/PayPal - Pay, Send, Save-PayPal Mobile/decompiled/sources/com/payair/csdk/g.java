package com.payair.csdk;

/* loaded from: classes10.dex */
public final class g extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.managers.ConfigurationImpl f4251a;
    public java.lang.String b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.payair.logic.managers.ConfigurationImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.payair.logic.managers.ConfigurationImpl configurationImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = configurationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.fetchTAC(null, this);
    }
}
