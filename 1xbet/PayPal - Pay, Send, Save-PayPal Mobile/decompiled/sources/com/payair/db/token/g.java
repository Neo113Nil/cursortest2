package com.payair.db.token;

/* loaded from: classes10.dex */
public final class g implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.db.token.TokenDetailsEntry[] f4367a;
    public final /* synthetic */ com.payair.db.token.TokenDetailsDao_Impl b;

    public g(com.payair.db.token.TokenDetailsDao_Impl tokenDetailsDao_Impl, com.payair.db.token.TokenDetailsEntry[] tokenDetailsEntryArr) {
        this.b = tokenDetailsDao_Impl;
        this.f4367a = tokenDetailsEntryArr;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        this.b.f4362a.beginTransaction();
        try {
            this.b.b.insert((java.lang.Object[]) this.f4367a);
            this.b.f4362a.setTransactionSuccessful();
            return kotlin.Unit.INSTANCE;
        } finally {
            this.b.f4362a.endTransaction();
        }
    }
}
