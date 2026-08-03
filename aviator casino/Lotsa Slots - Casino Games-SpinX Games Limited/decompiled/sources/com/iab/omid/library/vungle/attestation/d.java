package com.iab.omid.library.vungle.attestation;

/* loaded from: classes5.dex */
public class d {
    public com.iab.omid.library.vungle.attestation.b a(java.lang.String str, android.content.Context context) {
        try {
            if (str == null) {
                com.iab.omid.library.vungle.utils.d.b("Cannot create mechanism: Mechanism name cannot be null");
                return null;
            }
            if (context == null) {
                com.iab.omid.library.vungle.utils.d.b("Cannot create mechanism: Context cannot be null");
                return null;
            }
            if ("FireTVFOSDAT".equals(str)) {
                return new com.iab.omid.library.vungle.attestation.i(context);
            }
            return null;
        } catch (java.lang.Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error creating attestation mechanism: " + str, e);
            return null;
        }
    }
}
