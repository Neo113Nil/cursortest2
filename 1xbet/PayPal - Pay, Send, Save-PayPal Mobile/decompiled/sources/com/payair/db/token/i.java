package com.payair.db.token;

/* loaded from: classes10.dex */
public final class i implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4369a;
    public final /* synthetic */ com.payair.db.token.TokenDetailsDao_Impl b;

    public i(com.payair.db.token.TokenDetailsDao_Impl tokenDetailsDao_Impl, java.lang.String str) {
        this.b = tokenDetailsDao_Impl;
        this.f4369a = str;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        androidx.database.db.SupportSQLiteStatement acquire = this.b.e.acquire();
        java.lang.String str = this.f4369a;
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        try {
            this.b.f4362a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.b.f4362a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                this.b.f4362a.endTransaction();
            }
        } finally {
            this.b.e.release(acquire);
        }
    }
}
