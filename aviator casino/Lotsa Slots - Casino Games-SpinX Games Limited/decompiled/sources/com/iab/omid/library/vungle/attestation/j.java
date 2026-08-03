package com.iab.omid.library.vungle.attestation;

/* loaded from: classes5.dex */
public class j implements com.iab.omid.library.vungle.attestation.k {
    private static volatile com.iab.omid.library.vungle.attestation.j d;

    /* renamed from: a, reason: collision with root package name */
    private volatile java.lang.Boolean f4536a;
    private volatile java.lang.Boolean b;
    private final android.content.Context c;

    private j(android.content.Context context) {
        this.c = context;
        c();
    }

    public static com.iab.omid.library.vungle.attestation.j a(android.content.Context context) {
        if (d == null) {
            synchronized (com.iab.omid.library.vungle.attestation.j.class) {
                if (d == null) {
                    d = new com.iab.omid.library.vungle.attestation.j(context);
                }
            }
        }
        return d;
    }

    @Override // com.iab.omid.library.vungle.attestation.k
    public boolean a() {
        return c();
    }

    public boolean b() {
        if (this.b != null) {
            return this.b.booleanValue();
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b.booleanValue();
            }
            if (!c()) {
                this.b = java.lang.Boolean.FALSE;
                return false;
            }
            try {
                try {
                    android.content.pm.PackageManager packageManager = this.c.getPackageManager();
                    if (packageManager == null) {
                        com.iab.omid.library.vungle.utils.d.b("PackageManager is null when checking attestation capability");
                        this.b = java.lang.Boolean.FALSE;
                        return false;
                    }
                    boolean hasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(hasSystemFeature);
                    this.b = valueOf;
                    valueOf.getClass();
                    return hasSystemFeature;
                } catch (java.lang.SecurityException e) {
                    com.iab.omid.library.vungle.utils.d.a("Security exception when checking attestation capability", e);
                    this.b = java.lang.Boolean.FALSE;
                    return false;
                }
            } catch (java.lang.Exception e2) {
                com.iab.omid.library.vungle.utils.d.a("Unexpected error when checking attestation capability", e2);
                this.b = java.lang.Boolean.FALSE;
                return false;
            }
        }
    }

    public boolean c() {
        int i;
        if (this.f4536a != null) {
            return this.f4536a.booleanValue();
        }
        synchronized (this) {
            if (this.f4536a != null) {
                return this.f4536a.booleanValue();
            }
            boolean z = this.c != null && android.os.Build.MANUFACTURER.equalsIgnoreCase("Amazon") && android.os.Build.MODEL.toLowerCase().startsWith("aft") && (i = android.os.Build.VERSION.SDK_INT) >= 25 && i <= 30;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            this.f4536a = valueOf;
            valueOf.getClass();
            return z;
        }
    }
}
