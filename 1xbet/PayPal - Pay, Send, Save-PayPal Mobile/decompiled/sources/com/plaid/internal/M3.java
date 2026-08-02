package com.plaid.internal;

/* loaded from: classes16.dex */
public final class M3 implements java.util.concurrent.Callable<kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5843a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ com.plaid.internal.P3 d;

    public M3(com.plaid.internal.P3 p3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.d = p3;
        this.f5843a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final kotlin.Unit call() {
        androidx.database.db.SupportSQLiteStatement acquire = this.d.b.acquire();
        acquire.bindString(1, this.f5843a);
        acquire.bindString(2, this.b);
        acquire.bindString(3, this.c);
        try {
            this.d.f5878a.beginTransaction();
            try {
                acquire.executeInsert();
                this.d.f5878a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                this.d.f5878a.endTransaction();
            }
        } finally {
            this.d.b.release(acquire);
        }
    }
}
