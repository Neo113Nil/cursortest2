package com.payair.csdk;

/* loaded from: classes10.dex */
public final class o2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.managers.SetupManagerImpl f4294a;
    public java.lang.String b;
    public androidx.fragment.app.FragmentActivity c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.payair.logic.managers.SetupManagerImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.payair.logic.managers.SetupManagerImpl setupManagerImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.e = setupManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b;
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        b = this.e.b(null, null, null, this);
        return b;
    }
}
