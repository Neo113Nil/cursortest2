package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vx1 extends mx1 {

    /* JADX INFO: renamed from: A */
    public String f8283A;

    /* JADX INFO: renamed from: l */
    public String f8284l;

    /* JADX INFO: renamed from: m */
    public String f8285m;

    /* JADX INFO: renamed from: n */
    public int f8286n;

    /* JADX INFO: renamed from: o */
    public String f8287o;

    /* JADX INFO: renamed from: p */
    public String f8288p;

    /* JADX INFO: renamed from: q */
    public long f8289q;

    /* JADX INFO: renamed from: r */
    public final long f8290r;

    /* JADX INFO: renamed from: s */
    public final long f8291s;

    /* JADX INFO: renamed from: t */
    public List f8292t;

    /* JADX INFO: renamed from: u */
    public String f8293u;

    /* JADX INFO: renamed from: v */
    public final String f8294v;

    /* JADX INFO: renamed from: w */
    public int f8295w;

    /* JADX INFO: renamed from: x */
    public String f8296x;

    /* JADX INFO: renamed from: y */
    public String f8297y;

    /* JADX INFO: renamed from: z */
    public long f8298z;

    public vx1(f02 f02Var, long j, long j2, String str) {
        super(f02Var);
        this.f8298z = 0L;
        this.f8283A = null;
        this.f8290r = j;
        this.f8291s = j2;
        this.f8294v = str;
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: D */
    public final boolean mo533D() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026e A[Catch: NameNotFoundException -> 0x0276, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x0276, blocks: (B:98:0x0268, B:100:0x026e), top: B:131:0x0268 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0271 A[PHI: r5 r37
      0x0271: PHI (r5v16 int) = (r5v15 int), (r5v17 int) binds: [B:104:0x0276, B:99:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x0276, B:99:0x026c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x0301  */
    /* JADX WARN: Code duplicated, block: B:122:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0205  */
    /* JADX WARN: Code duplicated, block: B:78:0x0208  */
    /* JADX WARN: Code duplicated, block: B:87:0x022f  */
    /* JADX WARN: Code duplicated, block: B:91:0x023c  */
    /* JADX WARN: Code duplicated, block: B:92:0x023e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0259  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: E */
    public final z72 m5217E(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean zM1565d;
        boolean z2;
        boolean z3;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jM821a;
        long jMin;
        Boolean boolM772N;
        boolean z4;
        boolean z5;
        boolean z6;
        String str4;
        Boolean boolM772N2;
        boolean zBooleanValue;
        f02 f02Var;
        String strM5219G;
        boolean z7;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfoM1501d;
        ix1 ix1Var;
        int iM1688X;
        long jM1722Y;
        mo11z();
        String strM5219G2 = m5219G();
        String strM5220H = m5220H();
        m3446B();
        String str5 = this.f8285m;
        m3446B();
        long j4 = this.f8286n;
        m3446B();
        p80.m3863h(this.f8287o);
        String str6 = this.f8287o;
        f02 f02Var2 = (f02) this.f7192j;
        bt1 bt1Var = f02Var2.f2245m;
        ky1 ky1Var = f02Var2.f2247o;
        bt1 bt1Var2 = f02Var2.f2245m;
        Context context = f02Var2.f2242j;
        f72 f72Var = f02Var2.f2250r;
        fz1 fz1Var = f02Var2.f2246n;
        bt1Var.m765G();
        m3446B();
        mo11z();
        long j5 = this.f8289q;
        if (j5 == 0) {
            f02.m1558k(f72Var);
            f02 f02Var3 = (f02) f72Var.f7192j;
            String packageName = context.getPackageName();
            f72Var.mo11z();
            p80.m3860e(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestM1685T = f72.m1685T();
            long jM1686U = -1;
            if (messageDigestM1685T == null) {
                ky1 ky1Var2 = f02Var3.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5312a("Could not get MD5 instance");
                str2 = str5;
                j = j4;
            } else {
                if (packageManager != null) {
                    try {
                        if (f72Var.m1729j0(context, packageName)) {
                            str2 = str5;
                            j = j4;
                            jM1686U = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j4;
                                try {
                                    Signature[] signatureArr = tk1.m4792a(context).m1502e(f02Var3.f2242j.getPackageName(), 64).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        ky1 ky1Var3 = f02Var3.f2247o;
                                        f02.m1560m(ky1Var3);
                                        ky1Var3.f4603r.m5312a("Could not get signatures");
                                    } else {
                                        jM1686U = f72.m1686U(messageDigestM1685T.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    ky1 ky1Var4 = f02Var3.f2247o;
                                    f02.m1560m(ky1Var4);
                                    ky1Var4.f4600o.m5313b(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j4;
                                ky1 ky1Var5 = f02Var3.f2247o;
                                f02.m1560m(ky1Var5);
                                ky1Var5.f4600o.m5313b(e, "Package name not found");
                                j2 = 0;
                                this.f8289q = j2;
                                zM1565d = f02Var2.m1565d();
                                f02.m1558k(fz1Var);
                                z2 = !fz1Var.f2541A;
                                mo11z();
                                if (f02Var2.m1565d()) {
                                    if (bt1Var2.m770L(null, jx1.f4127H0)) {
                                        f02.m1560m(ky1Var);
                                        ky1Var.f4608w.m5312a("Disabled IID for tests.");
                                        z3 = zM1565d;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z3 = zM1565d;
                                            } else {
                                                z3 = zM1565d;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            f02.m1560m(ky1Var);
                                                            ky1Var.f4605t.m5312a("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    f02.m1560m(ky1Var);
                                                    ky1Var.f4604s.m5312a("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z3 = zM1565d;
                                    str3 = null;
                                }
                                f02.m1558k(fz1Var);
                                jM821a = fz1Var.f2552o.m821a();
                                long j6 = j2;
                                jMin = f02Var2.f2240M;
                                if (jM821a != 0) {
                                    jMin = Math.min(jMin, jM821a);
                                }
                                m3446B();
                                int i3 = this.f8295w;
                                boolM772N = bt1Var2.m772N("google_analytics_adid_collection_enabled");
                                if (boolM772N != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                f02.m1558k(fz1Var);
                                fz1Var.mo11z();
                                long j7 = jMin;
                                boolean z8 = fz1Var.m1908E().getBoolean("deferred_analytics_collection", z);
                                if (bt1Var2.m775Q("google_analytics_default_allow_ad_personalization_signals", true) != h12.f3005n) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                List list = this.f8292t;
                                String strM3156g = fz1Var.m1911H().m3156g();
                                if (this.f8293u == null) {
                                    f02.m1558k(f72Var);
                                    this.f8293u = f72Var.m1740y0();
                                }
                                String str7 = this.f8293u;
                                if (fz1Var.m1911H().m3157i(k12.f4250l)) {
                                    mo11z();
                                    if (this.f8298z == 0) {
                                        z6 = z2;
                                    } else {
                                        f02Var2.f2252t.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.f8298z;
                                        z6 = z2;
                                        if (this.f8297y != null) {
                                            m5218F();
                                        }
                                    }
                                    if (this.f8297y == null) {
                                        m5218F();
                                    }
                                    str4 = this.f8297y;
                                } else {
                                    z6 = z2;
                                    str4 = null;
                                }
                                boolM772N2 = bt1Var2.m772N("google_analytics_sgtm_upload_enabled");
                                if (boolM772N2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolM772N2.booleanValue();
                                }
                                f02.m1558k(f72Var);
                                f02Var = (f02) f72Var.f7192j;
                                String str8 = str4;
                                strM5219G = m5219G();
                                boolean z9 = zBooleanValue;
                                if (f02Var.f2242j.getPackageManager() == null) {
                                    z7 = z4;
                                    j3 = 0;
                                } else {
                                    try {
                                        z7 = z4;
                                        i = 0;
                                        try {
                                            applicationInfoM1501d = tk1.m4792a(f02Var.f2242j).m1501d(strM5219G, 0);
                                            if (applicationInfoM1501d != null) {
                                                i2 = applicationInfoM1501d.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            ky1 ky1Var6 = f02Var.f2247o;
                                            f02.m1560m(ky1Var6);
                                            ky1Var6.f4606u.m5313b(strM5219G, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z7 = z4;
                                        i = 0;
                                    }
                                    j3 = i2;
                                }
                                f02.m1558k(fz1Var);
                                int i4 = fz1Var.m1911H().f4645b;
                                f02.m1558k(fz1Var);
                                fz1Var.mo11z();
                                String str9 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9955b;
                                fs1.m1890a();
                                ix1Var = jx1.f4143P0;
                                if (bt1Var2.m770L(null, ix1Var)) {
                                    f02.m1558k(f72Var);
                                    iM1688X = f72.m1688X();
                                } else {
                                    iM1688X = 0;
                                }
                                fs1.m1890a();
                                if (bt1Var2.m770L(null, ix1Var)) {
                                    f02.m1558k(f72Var);
                                    jM1722Y = f72Var.m1722Y();
                                } else {
                                    jM1722Y = 0;
                                }
                                String str10 = bt1Var2.f983l;
                                String strValueOf = String.valueOf(l12.m3153h(bt1Var2.m775Q("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j8 = j3;
                                long j9 = f02Var2.f2240M;
                                f02.m1557j(f02Var2.f2231D);
                                return new z72(strM5219G2, strM5220H, str2, j, str6, 161000L, j6, str, z3, z6, str3, j7, i3, z7, z8, boolValueOf, this.f8290r, list, strM3156g, str7, str8, z9, j8, i4, str9, iM1688X, jM1722Y, str10, strValueOf, j9, j11.m2770e(f02Var2.f2231D.m588F()), bt1Var2.m770L(null, jx1.f4178e1) ? f02Var2.f2241N : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j4;
                }
                j2 = 0;
                this.f8289q = j2;
            }
            j2 = jM1686U;
            this.f8289q = j2;
        } else {
            str2 = str5;
            j = j4;
            z = false;
            j2 = j5;
        }
        zM1565d = f02Var2.m1565d();
        f02.m1558k(fz1Var);
        z2 = !fz1Var.f2541A;
        mo11z();
        if (f02Var2.m1565d()) {
            z3 = zM1565d;
            str3 = null;
        } else {
            if (bt1Var2.m770L(null, jx1.f4127H0)) {
                f02.m1560m(ky1Var);
                ky1Var.f4608w.m5312a("Disabled IID for tests.");
                z3 = zM1565d;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z3 = zM1565d;
                } else {
                    z3 = zM1565d;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        f02.m1558k(fz1Var);
        jM821a = fz1Var.f2552o.m821a();
        long j10 = j2;
        jMin = f02Var2.f2240M;
        if (jM821a != 0) {
            jMin = Math.min(jMin, jM821a);
        }
        m3446B();
        int i5 = this.f8295w;
        boolM772N = bt1Var2.m772N("google_analytics_adid_collection_enabled");
        if (boolM772N != null || boolM772N.booleanValue()) {
            z4 = true;
        } else {
            z4 = z;
        }
        f02.m1558k(fz1Var);
        fz1Var.mo11z();
        long j11 = jMin;
        boolean z10 = fz1Var.m1908E().getBoolean("deferred_analytics_collection", z);
        if (bt1Var2.m775Q("google_analytics_default_allow_ad_personalization_signals", true) != h12.f3005n) {
            z5 = true;
        } else {
            z5 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z5);
        List list2 = this.f8292t;
        String strM3156g2 = fz1Var.m1911H().m3156g();
        if (this.f8293u == null) {
            f02.m1558k(f72Var);
            this.f8293u = f72Var.m1740y0();
        }
        String str11 = this.f8293u;
        if (fz1Var.m1911H().m3157i(k12.f4250l)) {
            z6 = z2;
            str4 = null;
        } else {
            mo11z();
            if (this.f8298z == 0) {
                z6 = z2;
            } else {
                f02Var2.f2252t.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f8298z;
                z6 = z2;
                if (this.f8297y != null && jCurrentTimeMillis2 > 86400000 && this.f8283A == null) {
                    m5218F();
                }
            }
            if (this.f8297y == null) {
                m5218F();
            }
            str4 = this.f8297y;
        }
        boolM772N2 = bt1Var2.m772N("google_analytics_sgtm_upload_enabled");
        if (boolM772N2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolM772N2.booleanValue();
        }
        f02.m1558k(f72Var);
        f02Var = (f02) f72Var.f7192j;
        String str12 = str4;
        strM5219G = m5219G();
        boolean z11 = zBooleanValue;
        if (f02Var.f2242j.getPackageManager() == null) {
            z7 = z4;
            j3 = 0;
        } else {
            z7 = z4;
            i = 0;
            applicationInfoM1501d = tk1.m4792a(f02Var.f2242j).m1501d(strM5219G, 0);
            if (applicationInfoM1501d != null) {
                i2 = applicationInfoM1501d.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        f02.m1558k(fz1Var);
        int i6 = fz1Var.m1911H().f4645b;
        f02.m1558k(fz1Var);
        fz1Var.mo11z();
        String str13 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9955b;
        fs1.m1890a();
        ix1Var = jx1.f4143P0;
        if (bt1Var2.m770L(null, ix1Var)) {
            f02.m1558k(f72Var);
            iM1688X = f72.m1688X();
        } else {
            iM1688X = 0;
        }
        fs1.m1890a();
        if (bt1Var2.m770L(null, ix1Var)) {
            f02.m1558k(f72Var);
            jM1722Y = f72Var.m1722Y();
        } else {
            jM1722Y = 0;
        }
        String str14 = bt1Var2.f983l;
        String strValueOf2 = String.valueOf(l12.m3153h(bt1Var2.m775Q("google_analytics_default_allow_ad_personalization_signals", true)));
        long j12 = j3;
        long j13 = f02Var2.f2240M;
        f02.m1557j(f02Var2.f2231D);
        return new z72(strM5219G2, strM5220H, str2, j, str6, 161000L, j10, str, z3, z6, str3, j11, i5, z7, z10, boolValueOf2, this.f8290r, list2, strM3156g2, str11, str12, z11, j12, i6, str13, iM1688X, jM1722Y, str14, strValueOf2, j13, j11.m2770e(f02Var2.f2231D.m588F()), bt1Var2.m770L(null, jx1.f4178e1) ? f02Var2.f2241N : 0L);
    }

    /* JADX INFO: renamed from: F */
    public final void m5218F() {
        String str;
        mo11z();
        f02 f02Var = (f02) this.f7192j;
        fz1 fz1Var = f02Var.f2246n;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1558k(fz1Var);
        if (fz1Var.m1911H().m3157i(k12.f4250l)) {
            byte[] bArr = new byte[16];
            f72 f72Var = f02Var.f2250r;
            f02.m1558k(f72Var);
            f72Var.m1697A0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            f02.m1560m(ky1Var);
            ky1Var.f4607v.m5312a("Analytics Storage consent is not granted");
            str = null;
        }
        f02.m1560m(ky1Var);
        ky1Var.f4607v.m5312a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f8297y = str;
        f02Var.f2252t.getClass();
        this.f8298z = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: G */
    public final String m5219G() {
        m3446B();
        p80.m3863h(this.f8284l);
        return this.f8284l;
    }

    /* JADX INFO: renamed from: H */
    public final String m5220H() {
        mo11z();
        m3446B();
        p80.m3863h(this.f8296x);
        return this.f8296x;
    }
}
