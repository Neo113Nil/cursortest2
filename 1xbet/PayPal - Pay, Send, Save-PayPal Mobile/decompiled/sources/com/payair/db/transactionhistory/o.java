package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class o implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl f4388a;

    public o(com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl transactionHistoryEntryDao_Impl) {
        this.f4388a = transactionHistoryEntryDao_Impl;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        androidx.database.db.SupportSQLiteStatement acquire = this.f4388a.g.acquire();
        try {
            this.f4388a.f4377a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.f4388a.f4377a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                this.f4388a.f4377a.endTransaction();
            }
        } finally {
            this.f4388a.g.release(acquire);
        }
    }
}
