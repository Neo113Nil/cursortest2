package com.plaid.internal;

/* renamed from: com.plaid.internal.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0554j implements com.plaid.internal.B1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0599o f6445a;

    public C0554j(com.plaid.internal.C0599o c0599o) {
        this.f6445a = c0599o;
    }

    @Override // com.plaid.internal.B1
    public final com.plaid.internal.InterfaceC0627r1 a() {
        com.plaid.internal.A7 a7 = this.f6445a.f;
        com.plaid.internal.A7.a aVar = a7.f5751a;
        if (aVar == null) {
            com.plaid.internal.A7.d.a(com.plaid.internal.W3.DEBUG, "no cached http client available", new java.lang.Object[0]);
            return null;
        }
        if (aVar.f5752a.isConnected() == com.plaid.internal.EnumC0697z.YES) {
            com.plaid.internal.A7.d.a(com.plaid.internal.W3.DEBUG, "use cached http client (still connected)", new java.lang.Object[0]);
            return a7.f5751a.f5752a;
        }
        com.plaid.internal.A7.d.a(com.plaid.internal.W3.DEBUG, "discard cached http client (disconnected)", new java.lang.Object[0]);
        return null;
    }
}
