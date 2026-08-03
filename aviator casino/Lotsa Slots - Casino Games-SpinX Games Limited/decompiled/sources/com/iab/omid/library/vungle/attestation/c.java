package com.iab.omid.library.vungle.attestation;

/* loaded from: classes5.dex */
public final class c {
    private static final java.util.Map<java.lang.String, com.iab.omid.library.vungle.attestation.k> d = new java.util.HashMap();
    private static volatile com.iab.omid.library.vungle.attestation.c e;

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.attestation.d f4531a = new com.iab.omid.library.vungle.attestation.d();
    private final android.content.Context b;
    private volatile java.util.List<com.iab.omid.library.vungle.attestation.b> c;

    private c(android.content.Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
        c();
    }

    public static com.iab.omid.library.vungle.attestation.c a(android.content.Context context) {
        if (e == null) {
            synchronized (com.iab.omid.library.vungle.attestation.c.class) {
                if (e == null) {
                    e = new com.iab.omid.library.vungle.attestation.c(context);
                }
            }
        }
        return e;
    }

    private void c() {
        d.put("FireTVFOSDAT", com.iab.omid.library.vungle.attestation.j.a(this.b));
    }

    public java.util.List<com.iab.omid.library.vungle.attestation.b> a() {
        com.iab.omid.library.vungle.attestation.b a2;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry<java.lang.String, com.iab.omid.library.vungle.attestation.k> entry : d.entrySet()) {
                    if (entry.getValue().a() && (a2 = this.f4531a.a(entry.getKey(), this.b)) != null) {
                        arrayList.add(a2);
                    }
                }
                this.c = arrayList;
                return this.c;
            } catch (java.lang.Exception e2) {
                com.iab.omid.library.vungle.utils.d.a("Error getting supported attestation mechanisms", e2);
                this.c = new java.util.ArrayList();
                return this.c;
            }
        }
    }

    public boolean a(java.lang.String str) {
        com.iab.omid.library.vungle.attestation.k kVar = d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }

    public boolean b() {
        return a().size() > 0;
    }
}
