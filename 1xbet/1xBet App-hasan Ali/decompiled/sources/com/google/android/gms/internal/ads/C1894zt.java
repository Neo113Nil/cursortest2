package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.zt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1894zt implements Ar, InterfaceC1883zi {

    /* renamed from: p, reason: collision with root package name */
    public static final Object f16781p = new Object();

    /* renamed from: k, reason: collision with root package name */
    public boolean f16782k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f16783l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f16784m;

    /* renamed from: n, reason: collision with root package name */
    public Object f16785n;

    /* renamed from: o, reason: collision with root package name */
    public Object f16786o;

    public /* synthetic */ C1894zt(Sm sm, boolean z3, ArrayList arrayList, C6 c6, H6 h6) {
        this.f16783l = sm;
        this.f16782k = z3;
        this.f16784m = arrayList;
        this.f16785n = c6;
        this.f16786o = h6;
    }

    public static C1894zt a(As as, Cs cs, Ds ds, Ds ds2, boolean z3) {
        if (ds == Ds.f8406n) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        As as2 = As.f7731l;
        Ds ds3 = Ds.f8404l;
        if (as == as2 && ds == ds3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (cs == Cs.f8094l && ds == ds3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new C1894zt(as, cs, ds, ds2, z3);
    }

    public static String e(C1862z5 c1862z5) {
        A5 z3 = B5.z();
        String E5 = c1862z5.x().E();
        z3.e();
        B5.J((B5) z3.f10141l, E5);
        String D5 = c1862z5.x().D();
        z3.e();
        B5.F((B5) z3.f10141l, D5);
        long w5 = c1862z5.x().w();
        z3.e();
        B5.G((B5) z3.f10141l, w5);
        long y5 = c1862z5.x().y();
        z3.e();
        B5.I((B5) z3.f10141l, y5);
        long x5 = c1862z5.x().x();
        z3.e();
        B5.H((B5) z3.f10141l, x5);
        return AbstractC2309b.b(((B5) z3.b()).d());
    }

    public boolean b(C1862z5 c1862z5) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f16781p) {
            try {
                if (!AbstractC0952et.Z(new File(d(c1862z5.x().E()), "pcbc"), c1862z5.y().c())) {
                    f(4020, currentTimeMillis);
                    return false;
                }
                String e3 = e(c1862z5);
                SharedPreferences.Editor edit = ((SharedPreferences) this.f16784m).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f16785n)), e3);
                boolean commit = edit.commit();
                if (commit) {
                    f(5015, currentTimeMillis);
                } else {
                    f(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(C1862z5 c1862z5, C1543s1 c1543s1) {
        boolean z3;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f16781p) {
            try {
                B5 g5 = g(1);
                String E5 = c1862z5.x().E();
                if (g5 != null && g5.E().equals(E5)) {
                    f(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File d5 = d(E5);
                if (d5.exists()) {
                    ((InterfaceC1445pt) this.f16786o).f(4023, currentTimeMillis2, "d:" + (true != d5.isDirectory() ? "0" : "1") + ",f:" + (true != d5.isFile() ? "0" : "1"));
                    f(4015, currentTimeMillis2);
                } else if (!d5.mkdirs()) {
                    ((InterfaceC1445pt) this.f16786o).f(4024, currentTimeMillis2, "cw:".concat(true != d5.canWrite() ? "0" : "1"));
                    f(4015, currentTimeMillis2);
                    return false;
                }
                File d6 = d(E5);
                File file = new File(d6, "pcam.jar");
                File file2 = new File(d6, "pcbc");
                if (!AbstractC0952et.Z(file, c1862z5.z().c())) {
                    f(4016, currentTimeMillis);
                    return false;
                }
                if (!AbstractC0952et.Z(file2, c1862z5.y().c())) {
                    f(4017, currentTimeMillis);
                    return false;
                }
                if (c1543s1 != null) {
                    try {
                        z3 = C1543s1.t(file);
                    } catch (GeneralSecurityException unused) {
                        z3 = false;
                    }
                    if (!z3) {
                        f(4018, currentTimeMillis);
                        AbstractC0952et.T(d6);
                        return false;
                    }
                }
                String e3 = e(c1862z5);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = ((SharedPreferences) this.f16784m).getString("LATMTD".concat(String.valueOf((String) this.f16785n)), null);
                SharedPreferences.Editor edit = ((SharedPreferences) this.f16784m).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f16785n)), e3);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf((String) this.f16785n)), string);
                }
                if (!edit.commit()) {
                    f(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                B5 g6 = g(1);
                if (g6 != null) {
                    hashSet.add(g6.E());
                }
                B5 g7 = g(2);
                if (g7 != null) {
                    hashSet.add(g7.E());
                }
                for (File file3 : new File(((Context) this.f16783l).getDir("pccache", 0), (String) this.f16785n).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        AbstractC0952et.T(file3);
                    }
                }
                f(5014, currentTimeMillis);
                return true;
            } finally {
            }
        }
    }

    public File d(String str) {
        return new File(new File(((Context) this.f16783l).getDir("pccache", 0), (String) this.f16785n), str);
    }

    public void f(int i, long j5) {
        ((InterfaceC1445pt) this.f16786o).b(i, j5);
    }

    public B5 g(int i) {
        GB b3;
        String str = (String) this.f16785n;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f16784m;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                byte[] i5 = AbstractC2309b.i(string);
                C1733wB r5 = AbstractC1823yB.r(i5, 0, i5.length);
                if (this.f16782k) {
                    GB gb = GB.f9177a;
                    C1285mC c1285mC = C1285mC.f14484c;
                    b3 = GB.f9178b;
                } else {
                    b3 = GB.b();
                }
                return B5.C(r5, b3);
            } catch (XB unused) {
            } catch (NullPointerException unused2) {
                f(2029, currentTimeMillis);
            } catch (RuntimeException unused3) {
                f(2032, currentTimeMillis);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        long j5;
        Sm sm = (Sm) this.f16783l;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((T2.I) ((Tm) sm.f11584l).f474a).n()) {
            return null;
        }
        H6 h6 = (H6) this.f16786o;
        C6 c6 = (C6) this.f16785n;
        ArrayList arrayList = (ArrayList) this.f16784m;
        boolean z3 = this.f16782k;
        Tm tm = (Tm) sm.f11584l;
        SparseArray sparseArray = Tm.f11674h;
        E6 L5 = F6.L();
        L5.e();
        F6.w((F6) L5.f10141l, arrayList);
        int i = Settings.Global.getInt(tm.f11675c.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        L5.e();
        F6.x((F6) L5.f10141l, i);
        P2.o oVar = P2.o.f4767B;
        int m5 = oVar.f4773e.m(tm.f11675c, tm.f11677e);
        L5.e();
        F6.y((F6) L5.f10141l, m5);
        Qm qm = tm.f;
        synchronized (qm.f11255h) {
            j5 = qm.f11251c;
        }
        L5.e();
        F6.E((F6) L5.f10141l, j5);
        long b3 = tm.f.b();
        L5.e();
        F6.D((F6) L5.f10141l, b3);
        int a5 = tm.f.a();
        L5.e();
        F6.z((F6) L5.f10141l, a5);
        L5.e();
        F6.A((F6) L5.f10141l, h6);
        L5.e();
        F6.B((F6) L5.f10141l, c6);
        int i5 = tm.f11678g;
        L5.e();
        F6.C((F6) L5.f10141l, i5);
        int i6 = z3 ? 2 : 1;
        L5.e();
        F6.F((F6) L5.f10141l, i6);
        long d5 = tm.f.d();
        L5.e();
        F6.H((F6) L5.f10141l, d5);
        oVar.f4776j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        L5.e();
        F6.G((F6) L5.f10141l, currentTimeMillis);
        int i7 = Settings.Global.getInt(tm.f11675c.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        L5.e();
        F6.I((F6) L5.f10141l, i7);
        byte[] d6 = ((F6) L5.b()).d();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z3) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        AbstractC1668us.N(sQLiteDatabase, ((Tm) sm.f11584l).f.d(), d6);
        return null;
    }

    public /* synthetic */ C1894zt(C1872zF c1872zF, C1199kG c1199kG, C1469qG c1469qG, IOException iOException, boolean z3) {
        this.f16783l = c1872zF;
        this.f16784m = c1199kG;
        this.f16785n = c1469qG;
        this.f16786o = iOException;
        this.f16782k = z3;
    }

    public C1894zt(Context context, int i, InterfaceC1445pt interfaceC1445pt, boolean z3) {
        this.f16782k = false;
        this.f16783l = context;
        this.f16785n = Integer.toString(i - 1);
        this.f16784m = context.getSharedPreferences("pcvmspf", 0);
        this.f16786o = interfaceC1445pt;
        this.f16782k = z3;
    }

    public C1894zt(As as, Cs cs, Ds ds, Ds ds2, boolean z3) {
        this.f16785n = as;
        this.f16786o = cs;
        this.f16783l = ds;
        this.f16784m = ds2;
        this.f16782k = z3;
    }

    public C1894zt(Context context) {
        this.f16783l = context;
        this.f16784m = C0797bF.f12791c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1883zi, com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public void mo11k(Object obj) {
        ((InterfaceC1783xG) obj).e(0, ((C1872zF) this.f16783l).f16578a, (C1199kG) this.f16784m, (C1469qG) this.f16785n, (IOException) this.f16786o, this.f16782k);
    }
}
