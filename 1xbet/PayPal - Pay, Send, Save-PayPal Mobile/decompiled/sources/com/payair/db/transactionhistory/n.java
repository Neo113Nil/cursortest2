package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class n implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4387a;
    public final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl b;

    public n(com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl transactionHistoryEntryDao_Impl, java.lang.String str) {
        this.b = transactionHistoryEntryDao_Impl;
        this.f4387a = str;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        androidx.database.db.SupportSQLiteStatement acquire = this.b.e.acquire();
        java.lang.String str = this.f4387a;
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        try {
            this.b.f4377a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.b.f4377a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                this.b.f4377a.endTransaction();
            }
        } finally {
            this.b.e.release(acquire);
        }
    }
}
