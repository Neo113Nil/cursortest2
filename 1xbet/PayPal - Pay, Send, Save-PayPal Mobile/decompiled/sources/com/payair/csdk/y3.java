package com.payair.csdk;

/* loaded from: classes10.dex */
public final class y3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f4340a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.payair.logic.remote.repositories.TransactionHistoryRepositoryImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.payair.logic.remote.repositories.TransactionHistoryRepositoryImpl transactionHistoryRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = transactionHistoryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.getTransactionHistory(null, null, null, this);
    }
}
