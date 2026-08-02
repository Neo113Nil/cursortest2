package com.plaid.internal;

/* renamed from: com.plaid.internal.w0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0671w0 implements com.plaid.internal.InterfaceC0571k7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0662v0 f6604a;

    public C0671w0(com.plaid.internal.C0662v0 c0662v0) {
        this.f6604a = c0662v0;
    }

    @Override // com.plaid.internal.InterfaceC0571k7
    public final com.plaid.internal.C0536h a(java.lang.Object obj, com.plaid.internal.C0608p c0608p) {
        try {
            com.plaid.internal.InterfaceC0627r1 a2 = ((com.plaid.internal.B1) obj).a();
            return a2 != null ? com.plaid.internal.C0536h.a(a2) : com.plaid.internal.C0536h.a(this.f6604a.a());
        } catch (com.plaid.internal.C0617q e) {
            return com.plaid.internal.C0536h.a((java.lang.Exception) e);
        }
    }
}
