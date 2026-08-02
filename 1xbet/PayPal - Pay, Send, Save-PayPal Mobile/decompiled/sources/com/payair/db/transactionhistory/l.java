package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class l implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntry[] f4385a;
    public final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl b;

    public l(com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl transactionHistoryEntryDao_Impl, com.payair.db.transactionhistory.TransactionHistoryEntry[] transactionHistoryEntryArr) {
        this.b = transactionHistoryEntryDao_Impl;
        this.f4385a = transactionHistoryEntryArr;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        this.b.f4377a.beginTransaction();
        try {
            this.b.b.insert((java.lang.Object[]) this.f4385a);
            this.b.f4377a.setTransactionSuccessful();
            return kotlin.Unit.INSTANCE;
        } finally {
            this.b.f4377a.endTransaction();
        }
    }
}
