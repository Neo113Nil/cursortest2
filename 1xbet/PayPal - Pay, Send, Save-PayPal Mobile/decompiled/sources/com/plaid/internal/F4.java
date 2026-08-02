package com.plaid.internal;

/* loaded from: classes16.dex */
public final class F4 implements java.util.concurrent.Callable<kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5787a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ com.plaid.internal.H4 d;

    public F4(com.plaid.internal.H4 h4, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.d = h4;
        this.f5787a = str;
        this.b = str2;
        this.c = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final kotlin.Unit call() {
        androidx.database.db.SupportSQLiteStatement acquire = this.d.b.acquire();
        acquire.bindString(1, this.f5787a);
        acquire.bindString(2, this.b);
        acquire.bindBlob(3, this.c);
        try {
            this.d.f5799a.beginTransaction();
            try {
                acquire.executeInsert();
                this.d.f5799a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                this.d.f5799a.endTransaction();
            }
        } finally {
            this.d.b.release(acquire);
        }
    }
}
