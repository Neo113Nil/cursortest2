package com.payair.csdk;

/* loaded from: classes4.dex */
public final class b2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4233a;
    public final /* synthetic */ com.payair.logic.managers.PushManagerImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.payair.logic.managers.PushManagerImpl pushManagerImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = pushManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4233a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.generateCSDKPushToken(this);
    }
}
