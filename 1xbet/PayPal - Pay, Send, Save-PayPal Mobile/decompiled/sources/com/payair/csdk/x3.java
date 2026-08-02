package com.payair.csdk;

/* loaded from: classes10.dex */
public final class x3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.managers.TransactionHistoryManagerSuspendImpl f4335a;
    public java.lang.String b;
    public java.lang.Object c;
    public java.lang.String d;
    public java.lang.String e;
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ com.payair.logic.managers.TransactionHistoryManagerSuspendImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.payair.logic.managers.TransactionHistoryManagerSuspendImpl transactionHistoryManagerSuspendImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.g = transactionHistoryManagerSuspendImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.updateTransactionHistory(null, this);
    }
}
