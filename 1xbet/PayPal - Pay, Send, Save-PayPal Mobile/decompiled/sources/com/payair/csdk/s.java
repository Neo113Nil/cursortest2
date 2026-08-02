package com.payair.csdk;

/* loaded from: classes4.dex */
public final class s extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.storage.DataStoreEnrollmentIdStorage f4309a;
    public java.lang.String b;
    public java.lang.Object c;
    public boolean d;
    public /* synthetic */ java.lang.Object e;
    public final /* synthetic */ com.payair.logic.storage.DataStoreEnrollmentIdStorage f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f = dataStoreEnrollmentIdStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.markEnrollmentDone(null, false, this);
    }
}
