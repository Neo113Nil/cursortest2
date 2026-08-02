package com.facetec.sdk;

/* loaded from: classes8.dex */
final class k {
    private static final java.util.List<java.lang.String> j = java.util.Arrays.asList("ro_kernel", "ro_product", "ro_boot", "ro_hardware", "ro_build", "ro_lineage_releasetype");

    /* renamed from: a, reason: collision with root package name */
    static int f3633a = 1;
    private static java.lang.String g = "";
    private static java.lang.String m = "";
    private static java.lang.String k = "";

    /* renamed from: o, reason: collision with root package name */
    private static java.lang.String f3634o = "";
    static java.lang.String c = "";
    private static java.lang.StringBuilder l = new java.lang.StringBuilder();
    static org.json.JSONObject b = new org.json.JSONObject();
    static org.json.JSONObject d = new org.json.JSONObject();
    static int e = 0;
    static int i = 0;
    static boolean h = false;
    static java.lang.String f = "";

    k() {
    }

    static void d() {
        com.facetec.sdk.cq.H(com.facetec.sdk.as.Y, e);
        com.facetec.sdk.cq.H(com.facetec.sdk.as.ad, i);
    }

    static void c() {
        com.facetec.sdk.cq.d(com.facetec.sdk.as.U, d.toString());
        com.facetec.sdk.cq.d(com.facetec.sdk.as.X, b.toString());
        com.facetec.sdk.cq.H(com.facetec.sdk.as.W, h ? 1 : 0);
    }

    static void e() {
        com.facetec.sdk.cq.J(com.facetec.sdk.as.W, h ? 1 : 0);
    }

    static void b() {
        com.facetec.sdk.cq.F(com.facetec.sdk.as.E, java.lang.String.valueOf(com.facetec.sdk.bc.b("BT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.J, java.lang.String.valueOf(com.facetec.sdk.bc.b("RWT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.L, java.lang.String.valueOf(com.facetec.sdk.bc.b("CTOT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.M, java.lang.String.valueOf(com.facetec.sdk.bc.b("CLOT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.R, java.lang.String.valueOf(com.facetec.sdk.bc.b("CTCPT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.Q, java.lang.String.valueOf(com.facetec.sdk.bc.b("CLCPT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.S, java.lang.String.valueOf(com.facetec.sdk.bc.b("CTCCST")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.P, java.lang.String.valueOf(com.facetec.sdk.bc.b("CTPRT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.O, java.lang.String.valueOf(com.facetec.sdk.bc.b("CTFFT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.V, java.lang.String.valueOf(com.facetec.sdk.bc.b("CLFFT")));
    }

    static void a() {
        com.facetec.sdk.cq.H(com.facetec.sdk.as.x, f3633a);
        com.facetec.sdk.cq.F(com.facetec.sdk.as.C, g);
        com.facetec.sdk.cq.F(com.facetec.sdk.as.B, m);
        com.facetec.sdk.cq.F(com.facetec.sdk.as.D, k);
        com.facetec.sdk.cq.F(com.facetec.sdk.as.A, f3634o);
    }

    static void e(android.content.Context context) {
        com.facetec.sdk.cq.F("duas", com.facetec.sdk.aw.e(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r1.length() == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        com.facetec.sdk.k.c = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        com.facetec.sdk.cq.N(com.facetec.sdk.as.Z, com.facetec.sdk.k.l.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        r2.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r2 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(android.content.Context context) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Process process = null;
        try {
            try {
                process = java.lang.Runtime.getRuntime().exec("getprop");
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
                for (java.lang.String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (readLine.isEmpty()) {
                        break;
                    }
                    java.lang.String[] split = readLine.split("]: \\[");
                    if (split.length != 2) {
                        split = readLine.split(io.ktor.sse.ServerSentEventKt.COLON);
                    }
                    if (split.length >= 2) {
                        java.lang.String replace = split[0].replace(".", "_").replace("[", "");
                        java.lang.String replace2 = split[1].replace("]", "");
                        java.util.Iterator<java.lang.String> it = j.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (replace.contains(it.next()) && !replace2.isEmpty()) {
                                java.lang.StringBuilder sb2 = l;
                                sb2.append(replace);
                                sb2.append(": ");
                                sb2.append(replace2);
                                sb2.append(", ");
                                break;
                            }
                        }
                    }
                    sb.append(readLine);
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                }
            } catch (java.io.IOException e2) {
                com.facetec.sdk.t.c(context, com.facetec.sdk.c.DEVICE_SYSTEM_PROPERTY_ANNOTATION_ERROR, "Error getting device system property: ".concat(java.lang.String.valueOf(e2)), e2);
            }
        } catch (java.lang.Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    /* renamed from: com.facetec.sdk.k$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.facetec.sdk.FaceTecSDK.b.values().length];
            c = iArr;
            try {
                iArr[com.facetec.sdk.FaceTecSDK.b.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                c[com.facetec.sdk.FaceTecSDK.b.BRIGHT_LIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                c[com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_PHX_FACE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                c[com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_PHX_ENV.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                c[com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_SENSOR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    static void j() {
        int i2 = com.facetec.sdk.k.AnonymousClass1.c[com.facetec.sdk.FaceTecSDK.e.ordinal()];
        if (i2 == 3 || i2 == 4 || i2 == 5) {
            boolean z = new com.facetec.sdk.df().e;
            com.facetec.sdk.cq.H(com.facetec.sdk.as.af, z ? 1 : 0);
            com.facetec.sdk.cq.J(com.facetec.sdk.as.af, z ? 1 : 0);
        }
    }

    static void a(java.util.List<android.hardware.Camera.Size> list) {
        if (g.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (android.hardware.Camera.Size size : list) {
                sb.append(size.width);
                sb.append("x");
                sb.append(size.height);
                sb.append(",");
            }
            g = sb.toString();
        }
    }

    static void e(android.util.Size[] sizeArr) {
        if (k.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (android.util.Size size : sizeArr) {
                sb.append(size.getWidth());
                sb.append("x");
                sb.append(size.getHeight());
                sb.append(",");
            }
            k = sb.toString();
        }
    }

    static void i() {
        int i2 = com.facetec.sdk.k.AnonymousClass1.c[com.facetec.sdk.FaceTecSDK.e.ordinal()];
        if (i2 == 1) {
            e(0);
            return;
        }
        if (i2 == 2) {
            e(4);
            return;
        }
        if (i2 == 3) {
            e(1);
        } else if (i2 == 4) {
            e(2);
        } else {
            if (i2 != 5) {
                return;
            }
            e(3);
        }
    }

    private static void e(int i2) {
        com.facetec.sdk.cq.H("dlm", i2);
        com.facetec.sdk.cq.J("dlm", i2);
    }

    static void g() {
        com.facetec.sdk.cq.F(com.facetec.sdk.as.u, f);
        com.facetec.sdk.cq.N(com.facetec.sdk.as.u, f);
    }

    static void f() {
        com.facetec.sdk.cq.N(com.facetec.sdk.as.at, android.os.Build.FINGERPRINT);
        com.facetec.sdk.cq.N(com.facetec.sdk.as.aA, android.os.Build.MANUFACTURER);
        com.facetec.sdk.cq.N(com.facetec.sdk.as.az, android.os.Build.BRAND);
        com.facetec.sdk.cq.N(com.facetec.sdk.as.aB, android.os.Build.BOOTLOADER);
        com.facetec.sdk.cq.J(com.facetec.sdk.as.ax, android.os.Build.VERSION.SDK_INT);
        com.facetec.sdk.cq.N(com.facetec.sdk.as.ay, java.util.Arrays.toString(android.os.Build.SUPPORTED_ABIS));
        com.facetec.sdk.cq.N(com.facetec.sdk.as.C, g);
        com.facetec.sdk.cq.N(com.facetec.sdk.as.B, m);
        com.facetec.sdk.cq.N(com.facetec.sdk.as.D, k);
        com.facetec.sdk.cq.N(com.facetec.sdk.as.A, f3634o);
    }
}
