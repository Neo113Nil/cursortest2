package com.plaid.internal;

/* loaded from: classes16.dex */
public final class f8 implements java.util.concurrent.Callable<kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6413a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ com.plaid.internal.g8 d;

    public f8(com.plaid.internal.g8 g8Var, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.d = g8Var;
        this.f6413a = str;
        this.b = str2;
        this.c = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final kotlin.Unit call() {
        androidx.database.db.SupportSQLiteStatement acquire = this.d.c.acquire();
        acquire.bindString(1, this.f6413a);
        acquire.bindString(2, this.b);
        acquire.bindBlob(3, this.c);
        try {
            this.d.f6422a.beginTransaction();
            try {
                acquire.executeInsert();
                this.d.f6422a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                this.d.f6422a.endTransaction();
            }
        } finally {
            this.d.c.release(acquire);
        }
    }
}
