package com.payair.csdk;

/* loaded from: classes4.dex */
public final class n extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4286a;
    public final /* synthetic */ com.payair.logic.storage.DataStoreEnrollmentIdStorage b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = dataStoreEnrollmentIdStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.f4286a = obj;
        this.c |= Integer.MIN_VALUE;
        a2 = this.b.a(this);
        return a2;
    }
}
