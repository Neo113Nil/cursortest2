package com.plaid.internal;

/* loaded from: classes16.dex */
public final class e8 implements java.util.concurrent.Callable<kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f6404a;
    public final /* synthetic */ com.plaid.internal.g8 b;

    public e8(com.plaid.internal.g8 g8Var, java.util.ArrayList arrayList) {
        this.b = g8Var;
        this.f6404a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final kotlin.Unit call() {
        this.b.f6422a.beginTransaction();
        try {
            this.b.b.handleMultiple(this.f6404a);
            this.b.f6422a.setTransactionSuccessful();
            return kotlin.Unit.INSTANCE;
        } finally {
            this.b.f6422a.endTransaction();
        }
    }
}
