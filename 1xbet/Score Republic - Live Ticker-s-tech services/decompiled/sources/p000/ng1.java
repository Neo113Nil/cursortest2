package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ng1 {

    /* JADX INFO: renamed from: a */
    public final Context f5430a;

    /* JADX INFO: renamed from: b */
    public final op0 f5431b;

    /* JADX INFO: renamed from: c */
    public final g41 f5432c;

    /* JADX INFO: renamed from: d */
    public final qd0 f5433d;

    /* JADX INFO: renamed from: e */
    public final Executor f5434e;

    /* JADX INFO: renamed from: f */
    public final g41 f5435f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0766uh f5436g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0766uh f5437h;

    /* JADX INFO: renamed from: i */
    public final g41 f5438i;

    public ng1(Context context, op0 op0Var, g41 g41Var, qd0 qd0Var, Executor executor, g41 g41Var2, InterfaceC0766uh interfaceC0766uh, InterfaceC0766uh interfaceC0766uh2, g41 g41Var3) {
        this.f5430a = context;
        this.f5431b = op0Var;
        this.f5432c = g41Var;
        this.f5433d = qd0Var;
        this.f5434e = executor;
        this.f5435f = g41Var2;
        this.f5436g = interfaceC0766uh;
        this.f5437h = interfaceC0766uh2;
        this.f5438i = g41Var3;
    }

    /* JADX INFO: renamed from: a */
    public final void m3538a(C0648ra c0648ra, int i) {
        byte[] bArr;
        long j;
        C0684s9 c0684s9;
        String str;
        C0684s9 c0684s10;
        int i2;
        C0505nf c0505nfM3378b;
        String str2;
        Integer numValueOf;
        C0547ok c0547ok;
        final ng1 ng1Var = this;
        final C0648ra c0648ra2 = c0648ra;
        byte[] bArr2 = c0648ra2.f6761b;
        me1 me1VarM3727a = ng1Var.f5431b.m3727a(c0648ra2.f6760a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            ic1 ic1Var = new ic1(ng1Var) { // from class: mg1

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ ng1 f5044k;

                {
                    this.f5044k = ng1Var;
                }

                @Override // p000.ic1
                /* JADX INFO: renamed from: c */
                public final Object mo1085c() {
                    Boolean bool;
                    int i4 = i3;
                    C0648ra c0648ra3 = c0648ra2;
                    ng1 ng1Var2 = this.f5044k;
                    switch (i4) {
                        case 0:
                            g41 g41Var = ng1Var2.f5432c;
                            SQLiteDatabase sQLiteDatabaseM1980a = g41Var.m1980a();
                            sQLiteDatabaseM1980a.beginTransaction();
                            try {
                                Long lM1977e = g41.m1977e(sQLiteDatabaseM1980a, c0648ra3);
                                if (lM1977e == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = g41Var.m1980a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM1977e.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM1980a.setTransactionSuccessful();
                                sQLiteDatabaseM1980a.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM1980a.endTransaction();
                                throw th2;
                            }
                        default:
                            g41 g41Var2 = ng1Var2.f5432c;
                            g41Var2.getClass();
                            return (Iterable) g41Var2.m1981i(new C0615qe(17, g41Var2, c0648ra3));
                    }
                }
            };
            g41 g41Var = ng1Var.f5435f;
            if (!((Boolean) g41Var.m1984m(ic1Var)).booleanValue()) {
                g41Var.m1984m(new d41(jMax, ng1Var, c0648ra2));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) g41Var.m1984m(new ic1(ng1Var) { // from class: mg1

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ ng1 f5044k;

                {
                    this.f5044k = ng1Var;
                }

                @Override // p000.ic1
                /* JADX INFO: renamed from: c */
                public final Object mo1085c() {
                    Boolean bool;
                    int i5 = i4;
                    C0648ra c0648ra3 = c0648ra2;
                    ng1 ng1Var2 = this.f5044k;
                    switch (i5) {
                        case 0:
                            g41 g41Var2 = ng1Var2.f5432c;
                            SQLiteDatabase sQLiteDatabaseM1980a = g41Var2.m1980a();
                            sQLiteDatabaseM1980a.beginTransaction();
                            try {
                                Long lM1977e = g41.m1977e(sQLiteDatabaseM1980a, c0648ra3);
                                if (lM1977e == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = g41Var2.m1980a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM1977e.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM1980a.setTransactionSuccessful();
                                sQLiteDatabaseM1980a.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM1980a.endTransaction();
                                throw th2;
                            }
                        default:
                            g41 g41Var3 = ng1Var2.f5432c;
                            g41Var3.getClass();
                            return (Iterable) g41Var3.m1981i(new C0615qe(17, g41Var3, c0648ra3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (me1VarM3727a == null) {
                o80.m3648j("Uploader", "Unknown backend for %s, deleting event batch for it...", c0648ra2);
                c0684s10 = new C0684s9(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0316ia) it.next()).f3502c);
                }
                if (bArr2 != null) {
                    g41 g41Var2 = ng1Var.f5438i;
                    Objects.requireNonNull(g41Var2);
                    C0396kh c0396kh = (C0396kh) g41Var.m1984m(new kg1(g41Var2, i3));
                    C0902y5 c0902y5 = new C0902y5();
                    c0902y5.f9159f = new HashMap();
                    c0902y5.f9157d = Long.valueOf(ng1Var.f5436g.mo159g());
                    c0902y5.f9158e = Long.valueOf(ng1Var.f5437h.mo159g());
                    c0902y5.f9154a = "GDT_CLIENT_METRICS";
                    C0818vw c0818vw = new C0818vw("proto");
                    c0396kh.getClass();
                    oq0 oq0Var = vx0.f8282a;
                    oq0Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        oq0Var.m3732b(c0396kh, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c0902y5.f9156c = new C0596pw(c0818vw, byteArrayOutputStream.toByteArray());
                    arrayList.add(((C0542of) me1VarM3727a).m3686a(c0902y5.m5731k()));
                }
                C0542of c0542of = (C0542of) me1VarM3727a;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    C0869x9 c0869x9 = (C0869x9) obj;
                    String str3 = c0869x9.f8866a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(c0869x9);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c0869x9);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    C0869x9 c0869x10 = (C0869x9) ((List) entry.getValue()).get(0);
                    az0 az0Var = az0.f658j;
                    long jMo159g = c0542of.f5714f.mo159g();
                    long jMo159g2 = c0542of.f5713e.mo159g();
                    C0758u9 c0758u9 = new C0758u9(new C0647r9(Integer.valueOf(c0869x10.m5611b("sdk-version")), c0869x10.m5610a("model"), c0869x10.m5610a("hardware"), c0869x10.m5610a("device"), c0869x10.m5610a("product"), c0869x10.m5610a("os-uild"), c0869x10.m5610a("manufacturer"), c0869x10.m5610a("fingerprint"), c0869x10.m5610a("locale"), c0869x10.m5610a("country"), c0869x10.m5610a("mcc_mnc"), c0869x10.m5610a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C0869x9 c0869x11 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        C0596pw c0596pw = c0869x11.f8868c;
                        C0818vw c0818vw2 = c0596pw.f6274a;
                        byte[] bArr4 = c0596pw.f6275b;
                        long j2 = jMax;
                        if (c0818vw2.equals(new C0818vw("proto"))) {
                            c0547ok = new C0547ok();
                            c0547ok.f5765d = bArr4;
                        } else {
                            if (c0818vw2.equals(new C0818vw("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                C0547ok c0547ok2 = new C0547ok();
                                c0547ok2.f5766e = str4;
                                c0547ok = c0547ok2;
                            } else {
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + c0818vw2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        c0547ok.f5762a = Long.valueOf(c0869x11.f8869d);
                        c0547ok.f5764c = Long.valueOf(c0869x11.f8870e);
                        String str5 = (String) c0869x11.f8871f.get("tz-offset");
                        c0547ok.f5767f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        c0547ok.f5768g = new C0279ha((xr0) xr0.f9043j.get(c0869x11.m5611b("net-type")), (wr0) wr0.f8648j.get(c0869x11.m5611b("mobile-subtype")));
                        Integer num = c0869x11.f8867b;
                        if (num != null) {
                            c0547ok.f5763b = num;
                        }
                        String strConcat2 = ((Long) c0547ok.f5762a) == null ? " eventTimeMs" : "";
                        if (((Long) c0547ok.f5764c) == null) {
                            strConcat2 = strConcat2.concat(" eventUptimeMs");
                        }
                        if (((Long) c0547ok.f5767f) == null) {
                            strConcat2 = strConcat2.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat2.isEmpty()) {
                            C0270h1.m2191g("Missing required properties:".concat(strConcat2));
                            return;
                        } else {
                            arrayList4.add(new C0167ea(((Long) c0547ok.f5762a).longValue(), (Integer) c0547ok.f5763b, ((Long) c0547ok.f5764c).longValue(), (byte[]) c0547ok.f5765d, (String) c0547ok.f5766e, ((Long) c0547ok.f5767f).longValue(), (C0279ha) c0547ok.f5768g));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new C0204fa(jMo159g, jMo159g2, c0758u9, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j = jMax;
                C0721t9 c0721t9 = new C0721t9(arrayList3);
                URL urlM3685b = c0542of.f5712d;
                if (bArr != null) {
                    try {
                        C0873xd c0873xdM5618a = C0873xd.m5618a(bArr);
                        str = c0873xdM5618a.f8893b;
                        if (str == null) {
                            str = null;
                        }
                        urlM3685b = C0542of.m3685b(c0873xdM5618a.f8892a);
                    } catch (IllegalArgumentException unused3) {
                        c0684s9 = new C0684s9(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i6 = 7;
                    qd0 qd0Var = new qd0(urlM3685b, c0721t9, str, i6);
                    C0468mf c0468mf = new C0468mf(0, c0542of);
                    int i7 = 5;
                    do {
                        c0505nfM3378b = c0468mf.m3378b(qd0Var);
                        URL url = (URL) c0505nfM3378b.f5393c;
                        if (url != null) {
                            o80.m3648j("CctTransportBackend", "Following redirect to: %s", url);
                            qd0Var = new qd0(url, (C0721t9) qd0Var.f6472l, (String) qd0Var.f6473m, i6);
                        } else {
                            qd0Var = null;
                        }
                        if (qd0Var == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = c0505nfM3378b.f5392b;
                    if (i8 == 200) {
                        c0684s10 = new C0684s9(1, c0505nfM3378b.f5391a);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            c0684s9 = new C0684s9(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                c0684s9 = new C0684s9(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                o80.m3649k("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                c0684s10 = new C0684s9(2, -1L);
                            }
                        } else {
                            c0684s9 = new C0684s9(3, -1L);
                        }
                        c0684s10 = c0684s9;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i9 = c0684s10.f7058a;
            if (i9 == i2) {
                g41Var.m1984m(new C0148ds(this, iterable, c0648ra, j));
                this.f5433d.m4086x(c0648ra, i + 1, true);
                return;
            }
            ng1Var = this;
            c0648ra2 = c0648ra;
            jMax = j;
            g41Var.m1984m(new C0615qe(18, ng1Var, iterable));
            if (i9 == 1) {
                jMax = Math.max(jMax, c0684s10.f7059b);
                if (bArr != null) {
                    g41Var.m1984m(new C0468mf(11, ng1Var));
                }
            } else if (i9 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str6 = ((C0316ia) it2.next()).f3502c.f8866a;
                    if (map2.containsKey(str6)) {
                        map2.put(str6, Integer.valueOf(((Integer) map2.get(str6)).intValue() + 1));
                    } else {
                        map2.put(str6, 1);
                    }
                }
                g41Var.m1984m(new C0615qe(19, ng1Var, map2));
            }
            bArr2 = bArr;
        }
    }
}
