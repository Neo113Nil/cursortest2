package com.payair.csdk;

/* loaded from: classes10.dex */
public final class f2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.managers.SafetyManagerImpl f4249a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.payair.logic.managers.SafetyManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.payair.logic.managers.SafetyManagerImpl safetyManagerImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = safetyManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.checkSdkState(this);
    }
}
