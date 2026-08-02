package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sz1 extends k62 implements at1 {

    /* JADX INFO: renamed from: m */
    public final C0089c8 f7234m;

    /* JADX INFO: renamed from: n */
    public final C0089c8 f7235n;

    /* JADX INFO: renamed from: o */
    public final C0089c8 f7236o;

    /* JADX INFO: renamed from: p */
    public final C0089c8 f7237p;

    /* JADX INFO: renamed from: q */
    public final C0089c8 f7238q;

    /* JADX INFO: renamed from: r */
    public final C0089c8 f7239r;

    /* JADX INFO: renamed from: s */
    public final C0089c8 f7240s;

    /* JADX INFO: renamed from: t */
    public final lz1 f7241t;

    /* JADX INFO: renamed from: u */
    public final an0 f7242u;

    /* JADX INFO: renamed from: v */
    public final C0089c8 f7243v;

    /* JADX INFO: renamed from: w */
    public final C0089c8 f7244w;

    /* JADX INFO: renamed from: x */
    public final C0089c8 f7245x;

    public sz1(x62 x62Var) {
        super(x62Var);
        this.f7234m = new C0089c8(0);
        this.f7235n = new C0089c8(0);
        this.f7236o = new C0089c8(0);
        this.f7237p = new C0089c8(0);
        this.f7238q = new C0089c8(0);
        this.f7239r = new C0089c8(0);
        this.f7243v = new C0089c8(0);
        this.f7244w = new C0089c8(0);
        this.f7245x = new C0089c8(0);
        this.f7240s = new C0089c8(0);
        this.f7241t = new lz1(this);
        this.f7242u = new an0(17, this);
    }

    /* JADX INFO: renamed from: K */
    public static final C0089c8 m4609K(by1 by1Var) {
        C0089c8 c0089c8 = new C0089c8(0);
        for (jy1 jy1Var : by1Var.m818x()) {
            c0089c8.put(jy1Var.m2971t(), jy1Var.m2972u());
        }
        return c0089c8;
    }

    /* JADX INFO: renamed from: L */
    public static final k12 m4610L(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return k12.f4249k;
        }
        if (i2 == 2) {
            return k12.f4250l;
        }
        if (i2 == 3) {
            return k12.f4251m;
        }
        if (i2 != 4) {
            return null;
        }
        return k12.f4252n;
    }

    /* JADX INFO: renamed from: E */
    public final h12 m4611E(String str, k12 k12Var) {
        mo11z();
        m4613G(str);
        sx1 sx1VarM4627W = m4627W(str);
        if (sx1VarM4627W != null) {
            for (gx1 gx1Var : sx1VarM4627W.m4606y()) {
                if (m4610L(gx1Var.m2164t()) == k12Var) {
                    int iM2165u = gx1Var.m2165u() - 1;
                    if (iM2165u == 1) {
                        return h12.f3005n;
                    }
                    if (iM2165u != 2) {
                        break;
                    }
                    return h12.f3004m;
                }
            }
        }
        return h12.f3002k;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4612F(String str) {
        mo11z();
        m4613G(str);
        sx1 sx1VarM4627W = m4627W(str);
        if (sx1VarM4627W == null) {
            return false;
        }
        for (gx1 gx1Var : sx1VarM4627W.m4601t()) {
            if (gx1Var.m2164t() == 3 && gx1Var.m2166v() == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m4613G(String str) {
        m2988B();
        mo11z();
        p80.m3860e(str);
        C0089c8 c0089c8 = this.f7239r;
        if (c0089c8.get(str) == null) {
            qt1 qt1Var = this.f1566k.f8823l;
            x62.m5533U(qt1Var);
            oq0 oq0VarM4157I0 = qt1Var.m4157I0(str);
            C0089c8 c0089c9 = this.f7245x;
            C0089c8 c0089c10 = this.f7244w;
            C0089c8 c0089c11 = this.f7243v;
            C0089c8 c0089c12 = this.f7234m;
            if (oq0VarM4157I0 != null) {
                zx1 zx1Var = (zx1) m4616J(str, (byte[]) oq0VarM4157I0.f5841l).m5969k();
                m4614H(str, zx1Var);
                c0089c12.put(str, m4609K((by1) zx1Var.m5683d()));
                c0089c8.put(str, (by1) zx1Var.m5683d());
                m4615I(str, (by1) zx1Var.m5683d());
                c0089c11.put(str, ((by1) zx1Var.f9011k).m805E());
                c0089c10.put(str, (String) oq0VarM4157I0.f5840k);
                c0089c9.put(str, (String) oq0VarM4157I0.f5842m);
                return;
            }
            c0089c12.put(str, null);
            this.f7236o.put(str, null);
            this.f7235n.put(str, null);
            this.f7237p.put(str, null);
            this.f7238q.put(str, null);
            c0089c8.put(str, null);
            c0089c11.put(str, null);
            c0089c10.put(str, null);
            c0089c9.put(str, null);
            this.f7240s.put(str, null);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m4614H(String str, zx1 zx1Var) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        C0089c8 c0089c8 = new C0089c8(0);
        C0089c8 c0089c9 = new C0089c8(0);
        C0089c8 c0089c10 = new C0089c8(0);
        Iterator it = Collections.unmodifiableList(((by1) zx1Var.f9011k).m804D()).iterator();
        while (it.hasNext()) {
            hashSet.add(((ux1) it.next()).m4957t());
        }
        f02 f02Var = (f02) this.f7192j;
        bt1 bt1Var = f02Var.f2245m;
        ky1 ky1Var = f02Var.f2247o;
        ix1 ix1Var = jx1.f4155V0;
        if (bt1Var.m770L(null, ix1Var)) {
            arrayList2.addAll(Collections.unmodifiableList(((by1) zx1Var.f9011k).m810J()));
        }
        while (i < ((by1) zx1Var.f9011k).m819y()) {
            wx1 wx1Var = (wx1) ((by1) zx1Var.f9011k).m820z(i).m5969k();
            if (wx1Var.m5423g().isEmpty()) {
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5312a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strM5423g = wx1Var.m5423g();
                arrayList = arrayList2;
                String strM5656r = AbstractC0875xf.m5656r(wx1Var.m5423g(), zg1.f9762h, zg1.f9767m);
                if (!TextUtils.isEmpty(strM5656r)) {
                    wx1Var.m5681b();
                    ((xx1) wx1Var.f9011k).m5708A(strM5656r);
                    zx1Var.m5681b();
                    ((by1) zx1Var.f9011k).m811M(i, (xx1) wx1Var.m5683d());
                }
                if (((xx1) wx1Var.f9011k).m5710u() && ((xx1) wx1Var.f9011k).m5711v()) {
                    c0089c8.put(strM5423g, Boolean.TRUE);
                }
                if (((xx1) wx1Var.f9011k).m5712w() && ((xx1) wx1Var.f9011k).m5713x()) {
                    c0089c9.put(wx1Var.m5423g(), Boolean.TRUE);
                }
                if (((xx1) wx1Var.f9011k).m5714y()) {
                    if (((xx1) wx1Var.f9011k).m5715z() < 2 || ((xx1) wx1Var.f9011k).m5715z() > 65535) {
                        f02.m1560m(ky1Var);
                        ky1Var.f4603r.m5314c(wx1Var.m5423g(), Integer.valueOf(((xx1) wx1Var.f9011k).m5715z()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c0089c10.put(wx1Var.m5423g(), Integer.valueOf(((xx1) wx1Var.f9011k).m5715z()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f7235n.put(str, hashSet);
        if (f02Var.f2245m.m770L(null, ix1Var)) {
            this.f7238q.put(str, arrayList3);
        }
        this.f7236o.put(str, c0089c8);
        this.f7237p.put(str, c0089c9);
        this.f7240s.put(str, c0089c10);
    }

    /* JADX INFO: renamed from: I */
    public final void m4615I(String str, by1 by1Var) {
        if (by1Var.m803C() == 0) {
            lz1 lz1Var = this.f7241t;
            lz1Var.getClass();
            str.getClass();
            synchronized (lz1Var.f6868c) {
                jg0 jg0Var = lz1Var.f6867b;
                jg0Var.getClass();
                if (((LinkedHashMap) jg0Var.f3922k).remove(str) != null) {
                    lz1Var.f6869d--;
                }
            }
            return;
        }
        f02 f02Var = (f02) this.f7192j;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5313b(Integer.valueOf(by1Var.m803C()), "EES programs found");
        int i = 0;
        a12 a12Var = (a12) by1Var.m802B().get(0);
        try {
            su1 su1Var = new su1();
            int i2 = 2;
            ((C0884xo) su1Var.f7213a.f2337n).f9009a.put("internal.remoteConfig", new nz1(this, str, i2));
            ((C0884xo) su1Var.f7213a.f2337n).f9009a.put("internal.appMetadata", new nz1(this, str, i));
            ((C0884xo) su1Var.f7213a.f2337n).f9009a.put("internal.logger", new CallableC0445lt(i2, this));
            su1Var.m4596b(a12Var);
            this.f7241t.m4363c(str, su1Var);
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4608w.m5314c(str, Integer.valueOf(a12Var.m16u().m5022u()), "EES program loaded for appId, activities");
            for (w02 w02Var : a12Var.m16u().m5021t()) {
                ky1 ky1Var3 = f02Var.f2247o;
                f02.m1560m(ky1Var3);
                ky1Var3.f4608w.m5313b(w02Var.m5228t(), "EES program activity");
            }
        } catch (pv1 unused) {
            ky1 ky1Var4 = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var4);
            ky1Var4.f4600o.m5313b(str, "Failed to load EES program. appId");
        }
    }

    /* JADX INFO: renamed from: J */
    public final by1 m4616J(String str, byte[] bArr) {
        f02 f02Var = (f02) this.f7192j;
        if (bArr == null) {
            return by1.m800L();
        }
        try {
            by1 by1Var = (by1) ((zx1) a72.m58l0(by1.m799K(), bArr)).m5683d();
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5314c(by1Var.m814t() ? Long.valueOf(by1Var.m815u()) : null, by1Var.m816v() ? by1Var.m817w() : null, "Parsed config. version, gmp_app_id");
            return by1Var;
        } catch (RuntimeException e) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4603r.m5314c(ky1.m3106I(str), e, "Unable to merge remote config. appId");
            return by1.m800L();
        } catch (mp1 e2) {
            ky1 ky1Var3 = f02Var.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4603r.m5314c(ky1.m3106I(str), e2, "Unable to merge remote config. appId");
            return by1.m800L();
        }
    }

    /* JADX INFO: renamed from: M */
    public final by1 m4617M(String str) {
        m2988B();
        mo11z();
        p80.m3860e(str);
        m4613G(str);
        return (by1) this.f7239r.get(str);
    }

    /* JADX INFO: renamed from: N */
    public final String m4618N(String str) {
        mo11z();
        m4613G(str);
        return (String) this.f7243v.get(str);
    }

    /* JADX INFO: renamed from: O */
    public final void m4619O(String str, byte[] bArr, String str2, String str3) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        zx1 zx1Var;
        byte[] bArrM1274a;
        int i;
        int i2;
        boolean z;
        m2988B();
        mo11z();
        p80.m3860e(str);
        zx1 zx1Var2 = (zx1) m4616J(str, bArr).m5969k();
        m4614H(str, zx1Var2);
        m4615I(str, (by1) zx1Var2.m5683d());
        by1 by1Var = (by1) zx1Var2.m5683d();
        C0089c8 c0089c8 = this.f7239r;
        c0089c8.put(str, by1Var);
        this.f7243v.put(str, ((by1) zx1Var2.f9011k).m805E());
        this.f7244w.put(str, str2);
        this.f7245x.put(str, str3);
        this.f7234m.put(str, m4609K((by1) zx1Var2.m5683d()));
        x62 x62Var = this.f1566k;
        qt1 qt1Var = x62Var.f8823l;
        x62.m5533U(qt1Var);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((by1) zx1Var2.f9011k).m801A()));
        f02 f02Var = (f02) qt1Var.f7192j;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            sw1 sw1Var = (sw1) ((tw1) arrayList.get(i3)).m5969k();
            C0089c8 c0089c9 = c0089c8;
            if (((tw1) sw1Var.f9011k).m4864z() != 0) {
                int i4 = 0;
                while (i4 < ((tw1) sw1Var.f9011k).m4864z()) {
                    uw1 uw1Var = (uw1) ((tw1) sw1Var.f9011k).m4855A(i4).m5969k();
                    uw1 uw1Var2 = (uw1) uw1Var.clone();
                    x62 x62Var2 = x62Var;
                    zx1 zx1Var3 = zx1Var2;
                    String strM5656r = AbstractC0875xf.m5656r(((vw1) uw1Var.f9011k).m5212v(), zg1.f9762h, zg1.f9767m);
                    if (strM5656r != null) {
                        uw1Var2.m5681b();
                        ((vw1) uw1Var2.f9011k).m5208G(strM5656r);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = 0;
                    while (i5 < ((vw1) uw1Var.f9011k).m5214x()) {
                        xw1 xw1VarM5215y = ((vw1) uw1Var.f9011k).m5215y(i5);
                        boolean z2 = z;
                        uw1 uw1Var3 = uw1Var;
                        String strM5656r2 = AbstractC0875xf.m5656r(xw1VarM5215y.m5699A(), AbstractC0875xf.f8943e, AbstractC0875xf.f8944f);
                        if (strM5656r2 != null) {
                            ww1 ww1Var = (ww1) xw1VarM5215y.m5969k();
                            ww1Var.m5681b();
                            ((xw1) ww1Var.f9011k).m5700C(strM5656r2);
                            xw1 xw1Var = (xw1) ww1Var.m5683d();
                            uw1Var2.m5681b();
                            ((vw1) uw1Var2.f9011k).m5209H(i5, xw1Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i5++;
                        uw1Var = uw1Var3;
                    }
                    if (z) {
                        sw1Var.m5681b();
                        ((tw1) sw1Var.f9011k).m4857C(i4, (vw1) uw1Var2.m5683d());
                        arrayList.set(i3, (tw1) sw1Var.m5683d());
                    }
                    i4++;
                    x62Var = x62Var2;
                    zx1Var2 = zx1Var3;
                }
            }
            zx1 zx1Var4 = zx1Var2;
            x62 x62Var3 = x62Var;
            if (((tw1) sw1Var.f9011k).m4861w() != 0) {
                for (int i6 = 0; i6 < ((tw1) sw1Var.f9011k).m4861w(); i6++) {
                    ex1 ex1VarM4862x = ((tw1) sw1Var.f9011k).m4862x(i6);
                    String strM5656r3 = AbstractC0875xf.m5656r(ex1VarM4862x.m1513v(), AbstractC0959zp.f9890u, AbstractC0959zp.f9891v);
                    if (strM5656r3 != null) {
                        cx1 cx1Var = (cx1) ex1VarM4862x.m5969k();
                        cx1Var.m5681b();
                        ((ex1) cx1Var.f9011k).m1510C(strM5656r3);
                        sw1Var.m5681b();
                        ((tw1) sw1Var.f9011k).m4856B(i6, (ex1) cx1Var.m5683d());
                        arrayList.set(i3, (tw1) sw1Var.m5683d());
                    }
                }
            }
            i3++;
            c0089c8 = c0089c9;
            x62Var = x62Var3;
            zx1Var2 = zx1Var4;
        }
        zx1 zx1Var5 = zx1Var2;
        C0089c8 c0089c10 = c0089c8;
        x62 x62Var4 = x62Var;
        qt1Var.m2988B();
        qt1Var.mo11z();
        p80.m3860e(str);
        SQLiteDatabase sQLiteDatabaseM4191r0 = qt1Var.m4191r0();
        sQLiteDatabaseM4191r0.beginTransaction();
        try {
            qt1Var.m2988B();
            qt1Var.mo11z();
            p80.m3860e(str);
            SQLiteDatabase sQLiteDatabaseM4191r1 = qt1Var.m4191r0();
            sQLiteDatabaseM4191r1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM4191r1.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                tw1 tw1Var = (tw1) arrayList.get(i7);
                qt1Var.m2988B();
                qt1Var.mo11z();
                p80.m3860e(str);
                p80.m3863h(tw1Var);
                if (tw1Var.m4858t()) {
                    int iM4859u = tw1Var.m4859u();
                    Iterator it = tw1Var.m4863y().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = tw1Var.m4860v().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = tw1Var.m4863y().iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        Iterator it4 = it3;
                                        String str4 = "filter_id";
                                        sQLiteDatabase = sQLiteDatabaseM4191r0;
                                        i = size;
                                        String str5 = "app_id";
                                        if (!zHasNext) {
                                            i2 = i8;
                                            Iterator it5 = tw1Var.m4860v().iterator();
                                            while (it5.hasNext()) {
                                                ex1 ex1Var = (ex1) it5.next();
                                                qt1Var.m2988B();
                                                qt1Var.mo11z();
                                                p80.m3860e(str);
                                                p80.m3863h(ex1Var);
                                                if (ex1Var.m1513v().isEmpty()) {
                                                    ky1 ky1Var = f02Var.f2247o;
                                                    f02.m1560m(ky1Var);
                                                    ky1Var.f4603r.m5315d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", ky1.m3106I(str), Integer.valueOf(iM4859u), String.valueOf(ex1Var.m1511t() ? Integer.valueOf(ex1Var.m1512u()) : null));
                                                } else {
                                                    byte[] bArrM1274a2 = ex1Var.m1274a();
                                                    Iterator it6 = it5;
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put("audience_id", Integer.valueOf(iM4859u));
                                                    contentValues.put(str4, ex1Var.m1511t() ? Integer.valueOf(ex1Var.m1512u()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", ex1Var.m1513v());
                                                    contentValues.put("session_scoped", ex1Var.m1517z() ? Boolean.valueOf(ex1Var.m1509A()) : null);
                                                    contentValues.put("data", bArrM1274a2);
                                                    try {
                                                        if (qt1Var.m4191r0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            ky1 ky1Var2 = f02Var.f2247o;
                                                            f02.m1560m(ky1Var2);
                                                            ky1Var2.f4600o.m5313b(ky1.m3106I(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            it5 = it6;
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        ky1 ky1Var3 = f02Var.f2247o;
                                                        f02.m1560m(ky1Var3);
                                                        ky1Var3.f4600o.m5314c(ky1.m3106I(str), e, "Error storing property filter. appId");
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            vw1 vw1Var = (vw1) it4.next();
                                            qt1Var.m2988B();
                                            qt1Var.mo11z();
                                            p80.m3860e(str);
                                            p80.m3863h(vw1Var);
                                            if (vw1Var.m5212v().isEmpty()) {
                                                ky1 ky1Var4 = f02Var.f2247o;
                                                f02.m1560m(ky1Var4);
                                                ky1Var4.f4603r.m5315d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", ky1.m3106I(str), Integer.valueOf(iM4859u), String.valueOf(vw1Var.m5210t() ? Integer.valueOf(vw1Var.m5211u()) : null));
                                                i2 = i8;
                                            } else {
                                                tw1 tw1Var2 = tw1Var;
                                                byte[] bArrM1274a3 = vw1Var.m1274a();
                                                i2 = i8;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iM4859u));
                                                contentValues2.put("filter_id", vw1Var.m5210t() ? Integer.valueOf(vw1Var.m5211u()) : null);
                                                contentValues2.put("event_name", vw1Var.m5212v());
                                                contentValues2.put("session_scoped", vw1Var.m5206D() ? Boolean.valueOf(vw1Var.m5207E()) : null);
                                                contentValues2.put("data", bArrM1274a3);
                                                try {
                                                    if (qt1Var.m4191r0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        ky1 ky1Var5 = f02Var.f2247o;
                                                        f02.m1560m(ky1Var5);
                                                        ky1Var5.f4600o.m5313b(ky1.m3106I(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    it3 = it4;
                                                    sQLiteDatabaseM4191r0 = sQLiteDatabase;
                                                    size = i;
                                                    tw1Var = tw1Var2;
                                                    i8 = i2;
                                                } catch (SQLiteException e2) {
                                                    ky1 ky1Var6 = f02Var.f2247o;
                                                    f02.m1560m(ky1Var6);
                                                    ky1Var6.f4600o.m5314c(ky1.m3106I(str), e2, "Error storing event filter. appId");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        qt1Var.m2988B();
                                        qt1Var.mo11z();
                                        p80.m3860e(str);
                                        SQLiteDatabase sQLiteDatabaseM4191r2 = qt1Var.m4191r0();
                                        sQLiteDatabaseM4191r2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM4859u)});
                                        sQLiteDatabaseM4191r2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM4859u)});
                                        break;
                                    }
                                    sQLiteDatabaseM4191r0 = sQLiteDatabase;
                                    size = i;
                                    i7 = i2;
                                    break;
                                }
                                if (!((ex1) it2.next()).m1511t()) {
                                    ky1 ky1Var7 = f02Var.f2247o;
                                    f02.m1560m(ky1Var7);
                                    ky1Var7.f4603r.m5314c(ky1.m3106I(str), Integer.valueOf(iM4859u), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                }
                            }
                        } else if (!((vw1) it.next()).m5210t()) {
                            ky1 ky1Var8 = f02Var.f2247o;
                            f02.m1560m(ky1Var8);
                            ky1Var8.f4603r.m5314c(ky1.m3106I(str), Integer.valueOf(iM4859u), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                        }
                    }
                } else {
                    ky1 ky1Var9 = f02Var.f2247o;
                    f02.m1560m(ky1Var9);
                    ky1Var9.f4603r.m5313b(ky1.m3106I(str), "Audience with no ID. appId");
                }
                i7 = i8;
            }
            sQLiteDatabase = sQLiteDatabaseM4191r0;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList.get(i9);
                i9++;
                tw1 tw1Var3 = (tw1) obj;
                arrayList2.add(tw1Var3.m4858t() ? Integer.valueOf(tw1Var3.m4859u()) : null);
            }
            p80.m3860e(str);
            qt1Var.m2988B();
            qt1Var.mo11z();
            SQLiteDatabase sQLiteDatabaseM4191r3 = qt1Var.m4191r0();
            try {
                long jM4172W = qt1Var.m4172W("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, f02Var.f2245m.m768J(str, jx1.f4152U)));
                if (jM4172W > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseM4191r3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i10);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i10++;
                    }
                }
            } catch (SQLiteException e3) {
                ky1 ky1Var10 = f02Var.f2247o;
                f02.m1560m(ky1Var10);
                ky1Var10.f4600o.m5314c(ky1.m3106I(str), e3, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                zx1Var5.m5681b();
                zx1Var = zx1Var5;
                try {
                    ((by1) zx1Var.f9011k).m812N();
                    bArrM1274a = ((by1) zx1Var.m5683d()).m1274a();
                } catch (RuntimeException e4) {
                    e = e4;
                    ky1 ky1Var11 = ((f02) this.f7192j).f2247o;
                    f02.m1560m(ky1Var11);
                    ky1Var11.f4603r.m5314c(ky1.m3106I(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrM1274a = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                zx1Var = zx1Var5;
            }
            qt1 qt1Var2 = x62Var4.f8823l;
            x62.m5533U(qt1Var2);
            f02 f02Var2 = (f02) qt1Var2.f7192j;
            p80.m3860e(str);
            qt1Var2.mo11z();
            qt1Var2.m2988B();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrM1274a);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (qt1Var2.m4191r0().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    ky1 ky1Var12 = f02Var2.f2247o;
                    f02.m1560m(ky1Var12);
                    ky1Var12.f4600o.m5313b(ky1.m3106I(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                ky1 ky1Var13 = f02Var2.f2247o;
                f02.m1560m(ky1Var13);
                ky1Var13.f4600o.m5314c(ky1.m3106I(str), e6, "Error storing remote config. appId");
            }
            zx1Var.m5681b();
            ((by1) zx1Var.f9011k).m813O();
            c0089c10.put(str, (by1) zx1Var.m5683d());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM4191r0;
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m4620P(String str, String str2) {
        Boolean bool;
        mo11z();
        m4613G(str);
        if ("1".equals(mo481d(str, "measurement.upload.blacklist_internal")) && f72.m1692f0(str2)) {
            return true;
        }
        if ("1".equals(mo481d(str, "measurement.upload.blacklist_public")) && f72.m1680B0(str2)) {
            return true;
        }
        Map map = (Map) this.f7236o.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m4621Q(String str, String str2) {
        Boolean bool;
        mo11z();
        m4613G(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f7237p.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: R */
    public final List m4622R(String str) {
        mo11z();
        m4613G(str);
        return (List) this.f7238q.get(str);
    }

    /* JADX INFO: renamed from: S */
    public final int m4623S(String str, String str2) {
        Integer num;
        mo11z();
        m4613G(str);
        Map map = (Map) this.f7240s.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: T */
    public final boolean m4624T(String str) {
        mo11z();
        m4613G(str);
        C0089c8 c0089c8 = this.f7235n;
        if (c0089c8.get(str) != null) {
            return ((Set) c0089c8.get(str)).contains("os_version") || ((Set) c0089c8.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m4625U(String str) {
        mo11z();
        m4613G(str);
        C0089c8 c0089c8 = this.f7235n;
        return c0089c8.get(str) != null && ((Set) c0089c8.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: renamed from: V */
    public final boolean m4626V(String str, k12 k12Var) {
        mo11z();
        m4613G(str);
        sx1 sx1VarM4627W = m4627W(str);
        if (sx1VarM4627W == null) {
            return false;
        }
        for (gx1 gx1Var : sx1VarM4627W.m4601t()) {
            if (k12Var == m4610L(gx1Var.m2164t())) {
                return gx1Var.m2165u() == 2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public final sx1 m4627W(String str) {
        mo11z();
        m4613G(str);
        by1 by1VarM4617M = m4617M(str);
        if (by1VarM4617M == null || !by1VarM4617M.m806F()) {
            return null;
        }
        return by1VarM4617M.m807G();
    }

    @Override // p000.at1
    /* JADX INFO: renamed from: d */
    public final String mo481d(String str, String str2) {
        mo11z();
        m4613G(str);
        Map map = (Map) this.f7234m.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: D */
    public final void mo34D() {
    }
}
