package com.payair.csdk;

/* loaded from: classes4.dex */
public final class k extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.storage.DataStoreEnrollmentIdStorage f4271a;
    public java.lang.Object b;
    public java.lang.String c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.payair.logic.storage.DataStoreEnrollmentIdStorage e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.e = dataStoreEnrollmentIdStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.deleteEnrollmentId(null, this);
    }
}
