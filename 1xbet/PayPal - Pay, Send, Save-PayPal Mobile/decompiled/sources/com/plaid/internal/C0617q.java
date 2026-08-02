package com.plaid.internal;

/* renamed from: com.plaid.internal.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0617q extends java.lang.Exception {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.T0 f6540a;

    public C0617q(com.plaid.internal.T0 t0) {
        this.f6540a = t0;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("errorCode=");
        sb.append(this.f6540a);
        if (super.getMessage() == null) {
            obj = "";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("; ");
            sb2.append(super.getMessage());
            obj = sb2.toString();
        }
        sb.append(obj);
        return sb.toString();
    }

    public C0617q(com.plaid.internal.T0 t0, java.lang.String str) {
        super(str);
        this.f6540a = t0;
    }

    public C0617q(com.plaid.internal.T0 t0, java.lang.Exception exc) {
        super(exc);
        this.f6540a = t0;
    }
}
