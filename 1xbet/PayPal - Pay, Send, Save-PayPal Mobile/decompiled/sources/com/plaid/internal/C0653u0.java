package com.plaid.internal;

/* renamed from: com.plaid.internal.u0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0653u0 implements com.plaid.internal.InterfaceC0571k7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6586a = "https://device.payfone.com:4443/whatismyipaddress";

    @Override // com.plaid.internal.InterfaceC0571k7
    public final com.plaid.internal.C0536h a(java.lang.Object obj, com.plaid.internal.C0608p c0608p) {
        com.plaid.internal.F0 f0 = (com.plaid.internal.F0) obj;
        com.plaid.internal.D0 b = f0.b();
        if (b != null && b.b != null) {
            return com.plaid.internal.C0536h.a(b);
        }
        if (b != null && !"_auto_detect_".equals(b.f5765a)) {
            return com.plaid.internal.C0536h.a(b);
        }
        try {
            return com.plaid.internal.C0536h.a(a(b, f0.a()));
        } catch (com.plaid.internal.C0617q e) {
            return com.plaid.internal.C0536h.a((java.lang.Exception) e);
        }
    }

    public final com.plaid.internal.D0 a(com.plaid.internal.D0 d0, com.plaid.internal.InterfaceC0627r1 interfaceC0627r1) {
        java.lang.String str;
        try {
            com.plaid.internal.InterfaceC0627r1.b a2 = interfaceC0627r1.a(new com.plaid.internal.InterfaceC0627r1.a(this.f6586a, false, null, -1));
            int i = a2.b;
            if (i < 200 || i >= 300) {
                str = null;
            } else {
                str = a2.f6553a;
                if (str != null) {
                    str = str.replaceAll("[^0-9.:a-fA-F]", "");
                }
            }
            if (str == null || str.length() > 64) {
                throw new com.plaid.internal.C0617q(com.plaid.internal.T0.GENERIC_COMMUNICATION_ERROR, "API failed to provide a valid device IP address");
            }
            if (d0 == null) {
                return new com.plaid.internal.D0(str, null, null);
            }
            return new com.plaid.internal.D0(str, d0.b, d0.c);
        } catch (java.io.IOException unused) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.GENERIC_COMMUNICATION_ERROR, "No response received from URL.");
        }
    }
}
