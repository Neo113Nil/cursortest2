package com.plaid.internal;

/* renamed from: com.plaid.internal.q7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0625q7 implements com.plaid.internal.C0616p7.c<java.lang.String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0608p f6548a;
    public final /* synthetic */ com.plaid.internal.C0616p7 b;

    public C0625q7(com.plaid.internal.C0616p7 c0616p7, com.plaid.internal.C0608p c0608p) {
        this.b = c0616p7;
        this.f6548a = c0608p;
    }

    @Override // com.plaid.internal.C0616p7.c
    public final java.lang.String call() {
        com.plaid.internal.C0599o<R> c0599o = this.b.f6535a;
        com.plaid.internal.C0608p c0608p = this.f6548a;
        com.plaid.internal.InterfaceC0627r1 interfaceC0627r1 = (com.plaid.internal.InterfaceC0627r1) com.plaid.internal.C0599o.a(com.plaid.internal.EnumC0580l7.PRE_CHECK, c0599o.f6511a, new com.plaid.internal.C0554j(c0599o), c0608p);
        c0599o.f.a(interfaceC0627r1);
        com.plaid.internal.C0599o.a aVar = new com.plaid.internal.C0599o.a((com.plaid.internal.D0) com.plaid.internal.C0599o.a(com.plaid.internal.EnumC0580l7.DEVICE_DESCRIPTOR, c0599o.b, new com.plaid.internal.C0563k(interfaceC0627r1), c0608p), interfaceC0627r1);
        com.plaid.internal.D0 d0 = aVar.b;
        com.plaid.internal.InterfaceC0627r1 interfaceC0627r12 = aVar.f6512a;
        com.plaid.internal.D0 a2 = this.b.d.a(d0);
        com.plaid.internal.C0599o<R> c0599o2 = this.b.f6535a;
        com.plaid.internal.C0608p c0608p2 = this.f6548a;
        try {
            com.plaid.internal.C0680x0 c0680x0 = com.plaid.internal.C0599o.g;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("device descriptor=");
            sb.append(a2);
            com.plaid.internal.W3 w3 = com.plaid.internal.W3.INFO;
            c0680x0.a(w3, sb.toString(), new java.lang.Object[0]);
            java.lang.String str = (java.lang.String) com.plaid.internal.C0599o.a(com.plaid.internal.EnumC0580l7.START, c0599o2.c, new com.plaid.internal.C0572l(a2), c0608p2);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("auth url=");
            sb2.append(str);
            c0680x0.a(w3, sb2.toString(), new java.lang.Object[0]);
            if (a2.b != null) {
                throw new com.plaid.internal.r(com.plaid.internal.EnumC0580l7.AUTHENTICATION);
            }
            java.util.HashMap a3 = com.plaid.internal.E6.a(str);
            if (a3 != null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("use remote features: ");
                sb3.append(a3);
                c0680x0.a(w3, sb3.toString(), new java.lang.Object[0]);
                c0608p2.f = c0608p2.f.a(a3);
            }
            java.lang.String str2 = (java.lang.String) com.plaid.internal.C0599o.a(com.plaid.internal.EnumC0580l7.AUTHENTICATION, c0599o2.d, new com.plaid.internal.C0581m(interfaceC0627r12, str), c0608p2);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("vfp=");
            sb4.append(str2);
            c0680x0.a(w3, sb4.toString(), new java.lang.Object[0]);
            return str2;
        } catch (com.plaid.internal.r e) {
            c0599o2.f.a();
            throw e;
        }
    }
}
