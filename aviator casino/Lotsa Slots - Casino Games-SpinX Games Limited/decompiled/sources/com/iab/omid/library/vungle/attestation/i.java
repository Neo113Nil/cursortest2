package com.iab.omid.library.vungle.attestation;

/* loaded from: classes5.dex */
public class i implements com.iab.omid.library.vungle.attestation.b {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f4535a;
    private final com.iab.omid.library.vungle.attestation.j b;

    i(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application context cannot be null");
        }
        this.f4535a = context;
        this.b = com.iab.omid.library.vungle.attestation.j.a(context);
    }

    private java.lang.String a(java.lang.String str) {
        return (str == null || str.trim().isEmpty()) ? "1.0" : str;
    }

    private boolean b(java.lang.String str) {
        try {
            new java.net.URL(str);
            if (!str.startsWith("https://")) {
                if (!str.startsWith("http://")) {
                    return false;
                }
            }
            return true;
        } catch (java.net.MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public java.lang.String a() {
        return "FireTVFOSDAT";
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public void a(com.iab.omid.library.vungle.attestation.a aVar) {
        java.lang.String str;
        java.lang.String str2;
        if (!this.b.b()) {
            str = "Attestation failed: Full attestation capability not available";
        } else if (aVar == null) {
            str = "Attestation failed: AttestationArgs is null";
        } else if (aVar.a() == null) {
            str = "Attestation failed: attestationData is null";
        } else {
            java.lang.String str3 = aVar.a().get("verifierurl");
            java.lang.String a2 = a(aVar.a().get("version"));
            if (str3 == null || str3.trim().isEmpty()) {
                str = "Attestation failed: verifier URL is null or empty";
            } else {
                if (b(str3)) {
                    com.iab.omid.library.vungle.utils.d.a("Starting FireTV's FOS device attestation with verifier URL: " + str3);
                    try {
                        if (this.f4535a == null) {
                            com.iab.omid.library.vungle.utils.d.b("Attestation failed: application context is null");
                            return;
                        } else {
                            com.amazon.privacypass.PrivacyPass.getInstance(this.f4535a).attest(new com.amazon.privacypass.VerificationContext(java.util.Collections.singletonList(str3)), (com.amazon.privacypass.callback.AttestAPICallback) null, a2);
                            return;
                        }
                    } catch (java.lang.IllegalArgumentException e) {
                        e = e;
                        str2 = "Attestation failed: Invalid input parameters";
                        com.iab.omid.library.vungle.utils.d.a(str2, e);
                        return;
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        str2 = "Attestation failed: unexpected error";
                        com.iab.omid.library.vungle.utils.d.a(str2, e);
                        return;
                    }
                }
                str = "Attestation failed: invalid verifier URL format: " + str3;
            }
        }
        com.iab.omid.library.vungle.utils.d.b(str);
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public com.iab.omid.library.vungle.attestation.h b() {
        return com.iab.omid.library.vungle.attestation.h.NATIVE;
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public java.util.List<java.lang.String> c() {
        return java.util.Collections.singletonList("1.0");
    }
}
