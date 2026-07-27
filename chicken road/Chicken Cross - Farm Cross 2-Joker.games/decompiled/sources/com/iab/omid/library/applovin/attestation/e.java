package com.iab.omid.library.applovin.attestation;

import android.content.Context;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final d f6042a = new d();

    public static void a(Context context, String str, a aVar) {
        try {
            if (context == null) {
                com.iab.omid.library.applovin.utils.d.b("Attestation failed: Application Context cannot be null");
                return;
            }
            if (str != null && !str.trim().isEmpty()) {
                if (aVar == null) {
                    com.iab.omid.library.applovin.utils.d.b("Attestation failed: Attestation arguments cannot be null");
                    return;
                }
                if (!c.a(context).a(str)) {
                    com.iab.omid.library.applovin.utils.d.d("Mechanism not supported on this device: " + str);
                    return;
                }
                b a2 = f6042a.a(str, context);
                if (a2 != null) {
                    a2.a(aVar);
                    return;
                } else {
                    com.iab.omid.library.applovin.utils.d.d("Failed to create mechanism: " + str);
                    return;
                }
            }
            com.iab.omid.library.applovin.utils.d.b("Attestation failed: Mechanism name cannot be null or empty");
        } catch (Exception e) {
            com.iab.omid.library.applovin.utils.d.a("Error during attestation with mechanism: " + str, e);
        }
    }
}
