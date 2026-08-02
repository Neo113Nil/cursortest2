package com.plaid.internal;

/* loaded from: classes16.dex */
public final class N3 implements java.util.concurrent.Callable<kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5861a;
    public final /* synthetic */ com.plaid.internal.P3 b;

    public N3(com.plaid.internal.P3 p3, java.lang.String str) {
        this.b = p3;
        this.f5861a = str;
    }

    @Override // java.util.concurrent.Callable
    public final kotlin.Unit call() {
        androidx.database.db.SupportSQLiteStatement acquire = this.b.c.acquire();
        acquire.bindString(1, this.f5861a);
        try {
            this.b.f5878a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.b.f5878a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                this.b.f5878a.endTransaction();
            }
        } finally {
            this.b.c.release(acquire);
        }
    }
}
