package com.plaid.internal;

/* loaded from: classes16.dex */
public final class r extends java.lang.Exception {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.EnumC0580l7 f6550a;

    public r(com.plaid.internal.EnumC0580l7 enumC0580l7) {
        super("device descriptor contains an error");
        this.f6550a = enumC0580l7;
    }

    public final com.plaid.internal.T0 a() {
        return getCause() instanceof com.plaid.internal.C0617q ? ((com.plaid.internal.C0617q) getCause()).f6540a : com.plaid.internal.T0.GENERIC_UNKNOWN_REASON;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("step=");
        sb.append(this.f6550a);
        sb.append("; ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public r(com.plaid.internal.EnumC0580l7 enumC0580l7, java.lang.Throwable th) {
        super(th.getMessage(), th);
        this.f6550a = enumC0580l7;
    }
}
