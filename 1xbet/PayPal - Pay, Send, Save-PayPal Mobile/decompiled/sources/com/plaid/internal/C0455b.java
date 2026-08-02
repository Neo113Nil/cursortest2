package com.plaid.internal;

/* renamed from: com.plaid.internal.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0455b implements com.plaid.internal.InterfaceC0627r1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0500d f5997a;
    public final com.plaid.internal.C0553i7 b;

    public C0455b(com.plaid.internal.C0532g4 c0532g4) {
        this.f5997a = new com.plaid.internal.C0500d(c0532g4);
        this.b = new com.plaid.internal.C0553i7(c0532g4);
    }

    @Override // com.plaid.internal.InterfaceC0627r1
    public final void a() {
        this.f5997a.a();
        this.b.a();
    }

    @Override // com.plaid.internal.InterfaceC0627r1
    public final com.plaid.internal.EnumC0697z isConnected() {
        return this.f5997a.isConnected();
    }

    @Override // com.plaid.internal.InterfaceC0627r1
    public final com.plaid.internal.InterfaceC0627r1.b a(com.plaid.internal.InterfaceC0627r1.a aVar) {
        try {
            if (new java.net.URL(aVar.f6552a).getProtocol().equals("https")) {
                return this.f5997a.a(aVar);
            }
        } catch (java.net.MalformedURLException unused) {
        }
        return this.b.a(aVar);
    }
}
