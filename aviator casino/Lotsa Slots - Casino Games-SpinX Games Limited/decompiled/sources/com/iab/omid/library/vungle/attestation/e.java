package com.iab.omid.library.vungle.attestation;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.iab.omid.library.vungle.attestation.d f4532a = new com.iab.omid.library.vungle.attestation.d();

    public static void a(android.content.Context context, java.lang.String str, com.iab.omid.library.vungle.attestation.a aVar) {
        try {
            if (context == null) {
                com.iab.omid.library.vungle.utils.d.b("Attestation failed: Application Context cannot be null");
                return;
            }
            if (str != null && !str.trim().isEmpty()) {
                if (aVar == null) {
                    com.iab.omid.library.vungle.utils.d.b("Attestation failed: Attestation arguments cannot be null");
                    return;
                }
                if (!com.iab.omid.library.vungle.attestation.c.a(context).a(str)) {
                    com.iab.omid.library.vungle.utils.d.d("Mechanism not supported on this device: " + str);
                    return;
                }
                com.iab.omid.library.vungle.attestation.b a2 = f4532a.a(str, context);
                if (a2 != null) {
                    a2.a(aVar);
                    return;
                }
                com.iab.omid.library.vungle.utils.d.d("Failed to create mechanism: " + str);
                return;
            }
            com.iab.omid.library.vungle.utils.d.b("Attestation failed: Mechanism name cannot be null or empty");
        } catch (java.lang.Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error during attestation with mechanism: " + str, e);
        }
    }
}
