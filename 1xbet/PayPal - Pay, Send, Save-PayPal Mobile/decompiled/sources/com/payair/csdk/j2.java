package com.payair.csdk;

/* loaded from: classes10.dex */
public final class j2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4269a;
    public final /* synthetic */ com.payair.logic.managers.SetupManagerImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.payair.logic.managers.SetupManagerImpl setupManagerImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = setupManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4269a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.initializeVisa(null, this);
    }
}
