package com.plaid.internal;

/* renamed from: com.plaid.internal.x0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0680x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6619a;

    public C0680x0(java.lang.String str) {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        com.plaid.internal.W3 w32 = com.plaid.internal.Z3.f5986a;
        this.f6619a = str.concat(": ");
    }

    public final java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        if (objArr.length == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.f6619a);
            sb.append(str);
            return sb.toString();
        }
        try {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.f6619a);
            sb2.append(java.lang.String.format(str, objArr));
            return sb2.toString();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(this.f6619a);
            sb3.append(str);
            sb3.append("... {format error ");
            sb3.append(e.getMessage());
            sb3.append("}");
            return sb3.toString();
        }
    }

    public final void a(com.plaid.internal.W3 w3, java.lang.String str, java.lang.Object... objArr) {
        com.plaid.internal.W3 w32 = com.plaid.internal.Z3.f5986a;
        if (w3.f5962a <= com.plaid.internal.Z3.f5986a.f5962a) {
            com.plaid.internal.Z3.c.a(w3, a(str, objArr));
        }
    }

    public final void a(java.lang.Exception exc, java.lang.String str) {
        com.plaid.internal.W3 w3 = com.plaid.internal.W3.ERROR;
        com.plaid.internal.W3 w32 = com.plaid.internal.Z3.f5986a;
        if (w3.f5962a <= com.plaid.internal.Z3.f5986a.f5962a) {
            com.plaid.internal.Z3.c.a(w3, a(str, new java.lang.Object[0]), exc);
        }
    }
}
