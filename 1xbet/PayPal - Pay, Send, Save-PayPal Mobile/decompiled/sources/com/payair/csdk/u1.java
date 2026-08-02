package com.payair.csdk;

/* loaded from: classes10.dex */
public final class u1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4321a;
    public final /* synthetic */ com.payair.logic.implementation.HceSDKInterfaceImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.payair.logic.implementation.HceSDKInterfaceImpl hceSDKInterfaceImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = hceSDKInterfaceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4321a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.initialize(null, null, null, null, null, null, null, this);
    }
}
