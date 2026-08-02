package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: renamed from: qe */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0615qe implements InterfaceC0003a2, InterfaceC0436lk, iu0, FirebaseInAppMessagingDisplay, r60, InterfaceC0554or, InterfaceC0845wm, e41, ic1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6476j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6477k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f6478l;

    public /* synthetic */ C0615qe(int i, Object obj, Object obj2) {
        this.f6476j = i;
        this.f6477k = obj;
        this.f6478l = obj2;
    }

    @Override // p000.InterfaceC0554or
    /* JADX INFO: renamed from: a */
    public void mo1169a(my0 my0Var) {
        switch (this.f6476j) {
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                InterfaceC0554or interfaceC0554or = (InterfaceC0554or) this.f6477k;
                InterfaceC0554or interfaceC0554or2 = (InterfaceC0554or) this.f6478l;
                interfaceC0554or.mo1169a(my0Var);
                interfaceC0554or2.mo1169a(my0Var);
                return;
            default:
                p90 p90Var = (p90) this.f6477k;
                b90 b90Var = (b90) this.f6478l;
                if (((InterfaceC0752u3) p90Var.f6028k) == p90.f6026m) {
                    return;
                }
                InterfaceC0752u3 interfaceC0752u3Mo4426g = ((InterfaceC0826w3) my0Var.get()).mo4426g(b90Var);
                p90Var.f6028k = interfaceC0752u3Mo4426g;
                synchronized (p90Var) {
                    try {
                        if (!((HashSet) p90Var.f6027j).isEmpty()) {
                            interfaceC0752u3Mo4426g.mo620p((HashSet) p90Var.f6027j);
                            p90Var.f6027j = new HashSet();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2 A[Catch: all -> 0x0138, TryCatch #5 {all -> 0x0138, blocks: (B:25:0x00ac, B:27:0x00b2, B:29:0x00c2, B:30:0x00ce), top: B:138:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[Catch: all -> 0x0138, TryCatch #5 {all -> 0x0138, blocks: (B:25:0x00ac, B:27:0x00b2, B:29:0x00c2, B:30:0x00ce), top: B:138:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x0119 A[LOOP:4: B:39:0x0113->B:41:0x0119, LOOP_END] */
    @Override // p000.r60
    public Object apply(Object obj) throws Throwable {
        String str;
        HashMap map;
        StringBuilder sb;
        int i;
        Cursor cursorQuery;
        ListIterator listIterator;
        C0316ia c0316ia;
        long j;
        C0902y5 c0902y5M5612c;
        long j2;
        Set hashSet;
        int i2 = 5;
        int i3 = 2;
        final int i4 = 0;
        final int i5 = 1;
        switch (this.f6476j) {
            case 6:
                final yc0 yc0Var = (yc0) this.f6477k;
                C0726te c0726te = (C0726te) this.f6478l;
                yc0Var.getClass();
                C0763ue c0763ueM5152r = C0800ve.m5152r((C0800ve) obj);
                c0763ueM5152r.m3637c();
                C0800ve.m5149n((C0800ve) c0763ueM5152r.f5645k, c0726te);
                final C0800ve c0800ve = (C0800ve) c0763ueM5152r.m3635a();
                by0 by0Var = yc0Var.f9272a;
                by0Var.getClass();
                return new C0398kj(i5, new CallableC0340iz(i3, by0Var, c0800ve)).m1872a(new InterfaceC0003a2() { // from class: xc0
                    @Override // p000.InterfaceC0003a2
                    public final void run() {
                        int i6 = i4;
                        C0800ve c0800ve2 = c0800ve;
                        yc0 yc0Var2 = yc0Var;
                        switch (i6) {
                            case 0:
                                yc0Var2.getClass();
                                yc0Var2.f9273b = hm0.m2292a(c0800ve2);
                                break;
                            default:
                                yc0Var2.getClass();
                                yc0Var2.f9273b = hm0.m2292a(c0800ve2);
                                break;
                        }
                    }
                });
            case 7:
                final yc0 yc0Var2 = (yc0) this.f6477k;
                HashSet hashSet2 = (HashSet) this.f6478l;
                C0800ve c0800ve2 = (C0800ve) obj;
                yc0Var2.getClass();
                n80.m3496e("Existing impressions: ".concat(c0800ve2.toString()));
                C0763ue c0763ueM5151q = C0800ve.m5151q();
                for (C0726te c0726te2 : c0800ve2.m5154o()) {
                    if (!hashSet2.contains(c0726te2.m4788p())) {
                        c0763ueM5151q.m3637c();
                        C0800ve.m5149n((C0800ve) c0763ueM5151q.f5645k, c0726te2);
                    }
                }
                final C0800ve c0800ve3 = (C0800ve) c0763ueM5151q.m3635a();
                n80.m3496e("New cleared impression list: ".concat(c0800ve3.toString()));
                by0 by0Var2 = yc0Var2.f9272a;
                by0Var2.getClass();
                return new C0398kj(i5, new CallableC0340iz(i3, by0Var2, c0800ve3)).m1872a(new InterfaceC0003a2() { // from class: xc0
                    @Override // p000.InterfaceC0003a2
                    public final void run() {
                        int i6 = i5;
                        C0800ve c0800ve4 = c0800ve3;
                        yc0 yc0Var3 = yc0Var2;
                        switch (i6) {
                            case 0:
                                yc0Var3.getClass();
                                yc0Var3.f9273b = hm0.m2292a(c0800ve4);
                                break;
                            default:
                                yc0Var3.getClass();
                                yc0Var3.f9273b = hm0.m2292a(c0800ve4);
                                break;
                        }
                    }
                });
            case 8:
                hd0 hd0Var = (hd0) this.f6477k;
                hm0 hm0Var = (hm0) this.f6478l;
                C0800ve c0800ve4 = (C0800ve) obj;
                if (!hd0Var.f3178n.m2543n()) {
                    n80.m3497f("Automatic data collection is disabled, not attempting campaign fetch from service.");
                    C0562oz c0562ozM4010r = C0599pz.m4010r();
                    c0562ozM4010r.m3637c();
                    C0599pz.m4008n((C0599pz) c0562ozM4010r.f5645k, 1L);
                    return hm0.m2292a((C0599pz) c0562ozM4010r.m3635a());
                }
                C0042ay c0042ay = new C0042ay(24);
                hm0Var.getClass();
                qm0 qm0Var = new qm0(new nm0(hm0Var, c0042ay, i4), new C0615qe(10, hd0Var, c0800ve4), i5);
                C0562oz c0562ozM4010r2 = C0599pz.m4010r();
                c0562ozM4010r2.m3637c();
                C0599pz.m4008n((C0599pz) c0562ozM4010r2.f5645k, 1L);
                hm0 hm0VarM2295d = qm0Var.m2295d(hm0.m2292a((C0599pz) c0562ozM4010r2.m3635a()));
                C0042ay c0042ay2 = new C0042ay(25);
                nc1 nc1Var = t22.f7260e;
                ym0 ym0Var = new ym0(new ym0(hm0VarM2295d, c0042ay2, nc1Var), new cd0(hd0Var, i4), nc1Var);
                C0900y3 c0900y3 = hd0Var.f3174j;
                Objects.requireNonNull(c0900y3);
                ym0 ym0Var2 = new ym0(ym0Var, new C0468mf(4, c0900y3), nc1Var);
                wc1 wc1Var = hd0Var.f3175k;
                Objects.requireNonNull(wc1Var);
                return new qm0(new ym0(new ym0(ym0Var2, new C0468mf(i2, wc1Var), nc1Var), nc1Var, new C0042ay(26)), new CallableC0445lt(i5, lm0.f4838j), i3);
            case 9:
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
            default:
                g41 g41Var = (g41) this.f6477k;
                C0648ra c0648ra = (C0648ra) this.f6478l;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C0906y9 c0906y9 = g41Var.f2613m;
                ArrayList arrayListM1982j = g41Var.m1982j(sQLiteDatabase, c0648ra, c0906y9.f9223b);
                for (dx0 dx0Var : dx0.values()) {
                    if (dx0Var != c0648ra.f6762c) {
                        int size = c0906y9.f9223b - arrayListM1982j.size();
                        if (size <= 0) {
                            map = new HashMap();
                            sb = new StringBuilder("event_id IN (");
                            for (i = 0; i < arrayListM1982j.size(); i++) {
                                sb.append(((C0316ia) arrayListM1982j.get(i)).f3500a);
                                if (i < arrayListM1982j.size() - 1) {
                                    sb.append(',');
                                }
                            }
                            sb.append(')');
                            cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                try {
                                    j2 = cursorQuery.getLong(0);
                                    hashSet = (Set) map.get(Long.valueOf(j2));
                                    if (hashSet == null) {
                                        hashSet = new HashSet();
                                        map.put(Long.valueOf(j2), hashSet);
                                    }
                                    hashSet.add(new f41(cursorQuery.getString(1), cursorQuery.getString(2)));
                                } catch (Throwable th) {
                                    cursorQuery.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            listIterator = arrayListM1982j.listIterator();
                            while (listIterator.hasNext()) {
                                c0316ia = (C0316ia) listIterator.next();
                                j = c0316ia.f3500a;
                                if (!map.containsKey(Long.valueOf(j))) {
                                    c0902y5M5612c = c0316ia.f3502c.m5612c();
                                    for (f41 f41Var : (Set) map.get(Long.valueOf(j))) {
                                        c0902y5M5612c.m5730i(f41Var.f2309a, f41Var.f2310b);
                                    }
                                    listIterator.set(new C0316ia(j, c0316ia.f3501b, c0902y5M5612c.m5731k()));
                                }
                            }
                            return arrayListM1982j;
                        }
                        qd0 qd0VarM4283a = C0648ra.m4283a();
                        qd0VarM4283a.m4087y(c0648ra.f6760a);
                        if (dx0Var == null) {
                            C0270h1.m2192h("Null priority");
                            return null;
                        }
                        qd0VarM4283a.f6473m = dx0Var;
                        qd0VarM4283a.f6472l = c0648ra.f6761b;
                        arrayListM1982j.addAll(g41Var.m1982j(sQLiteDatabase, qd0VarM4283a.m4073e(), size));
                    }
                }
                map = new HashMap();
                sb = new StringBuilder("event_id IN (");
                while (i < arrayListM1982j.size()) {
                    sb.append(((C0316ia) arrayListM1982j.get(i)).f3500a);
                    if (i < arrayListM1982j.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    j2 = cursorQuery.getLong(0);
                    hashSet = (Set) map.get(Long.valueOf(j2));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j2), hashSet);
                    }
                    hashSet.add(new f41(cursorQuery.getString(1), cursorQuery.getString(2)));
                }
                cursorQuery.close();
                listIterator = arrayListM1982j.listIterator();
                while (listIterator.hasNext()) {
                    c0316ia = (C0316ia) listIterator.next();
                    j = c0316ia.f3500a;
                    if (!map.containsKey(Long.valueOf(j))) {
                        c0902y5M5612c = c0316ia.f3502c.m5612c();
                        while (r7.hasNext()) {
                            c0902y5M5612c.m5730i(f41Var.f2309a, f41Var.f2310b);
                        }
                        listIterator.set(new C0316ia(j, c0316ia.f3501b, c0902y5M5612c.m5731k()));
                    }
                }
                return arrayListM1982j;
            case 10:
                hd0 hd0Var2 = (hd0) this.f6477k;
                C0800ve c0800ve5 = (C0800ve) this.f6478l;
                C0011aa c0011aa = (C0011aa) obj;
                C0457m4 c0457m4 = hd0Var2.f3169e;
                c0457m4.getClass();
                n80.m3497f("Fetching campaigns from service.");
                py0 py0Var = c0457m4.f4971d;
                py0Var.getClass();
                try {
                    qy0.m4206a(py0Var.f6288a);
                } catch (m90 | n90 e) {
                    e.printStackTrace();
                }
                w90 w90Var = (w90) c0457m4.f4968a.get();
                C0488mz c0488mzM3606s = C0525nz.m3606s();
                w00 w00Var = c0457m4.f4969b;
                w00Var.m5224a();
                String str2 = w00Var.f8320c.f6654e;
                c0488mzM3606s.m3637c();
                C0525nz.m3601n((C0525nz) c0488mzM3606s.f5645k, str2);
                de0 de0VarM5154o = c0800ve5.m5154o();
                c0488mzM3606s.m3637c();
                C0525nz.m3602o((C0525nz) c0488mzM3606s.f5645k, de0VarM5154o);
                C0433lh c0433lhM3384r = C0470mh.m3384r();
                String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                c0433lhM3384r.m3637c();
                C0470mh.m3382p((C0470mh) c0433lhM3384r.f5645k, strValueOf);
                String string = Locale.getDefault().toString();
                c0433lhM3384r.m3637c();
                C0470mh.m3383q((C0470mh) c0433lhM3384r.f5645k, string);
                String id = TimeZone.getDefault().getID();
                c0433lhM3384r.m3637c();
                C0470mh.m3381o((C0470mh) c0433lhM3384r.f5645k, id);
                Application application = c0457m4.f4970c;
                try {
                    str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("FIAM.Headless", "Error finding versionName : " + e2.getMessage());
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    c0433lhM3384r.m3637c();
                    C0470mh.m3380n((C0470mh) c0433lhM3384r.f5645k, str);
                }
                C0470mh c0470mh = (C0470mh) c0433lhM3384r.m3635a();
                c0488mzM3606s.m3637c();
                C0525nz.m3603p((C0525nz) c0488mzM3606s.f5645k, c0470mh);
                C0728tg c0728tgM5158q = C0802vg.m5158q();
                w00 w00Var2 = c0457m4.f4969b;
                w00Var2.m5224a();
                String str3 = w00Var2.f8320c.f6651b;
                c0728tgM5158q.m3637c();
                C0802vg.m5155n((C0802vg) c0728tgM5158q.f5645k, str3);
                String str4 = c0011aa.f105a;
                c0728tgM5158q.m3637c();
                C0802vg.m5156o((C0802vg) c0728tgM5158q.f5645k, str4);
                String str5 = c0011aa.f106b.f1178a;
                c0728tgM5158q.m3637c();
                C0802vg.m5157p((C0802vg) c0728tgM5158q.f5645k, str5);
                C0802vg c0802vg = (C0802vg) c0728tgM5158q.m3635a();
                c0488mzM3606s.m3637c();
                C0525nz.m3604q((C0525nz) c0488mzM3606s.f5645k, c0802vg);
                C0525nz c0525nz = (C0525nz) c0488mzM3606s.m3635a();
                jd0 jd0Var = w90Var.f8463a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                AbstractC0727tf abstractC0727tf = jd0Var.f3908a;
                C0095ce c0095ce = jd0Var.f3909b;
                c0095ce.getClass();
                if (timeUnit == null) {
                    C0270h1.m2192h("units");
                    return null;
                }
                C0885xp c0885xp = new C0885xp(30000000000L);
                C0547ok c0547okM919b = C0095ce.m919b(c0095ce);
                c0547okM919b.f5762a = c0885xp;
                C0095ce c0095ce2 = new C0095ce(c0547okM919b);
                a90.m127k(abstractC0727tf, "channel");
                wp0 wp0Var = kd0.f4349a;
                if (wp0Var == null) {
                    synchronized (kd0.class) {
                        try {
                            wp0Var = kd0.f4349a;
                            if (wp0Var == null) {
                                String strM5409a = wp0.m5409a("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns");
                                C0525nz c0525nzM3605r = C0525nz.m3605r();
                                C0709sy c0709sy = zx0.f9981a;
                                wp0 wp0Var2 = new wp0(strM5409a, new yx0(c0525nzM3605r), new yx0(C0599pz.m4009o()));
                                kd0.f4349a = wp0Var2;
                                wp0Var = wp0Var2;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                Logger logger = AbstractC0249gh.f2733a;
                ExecutorC0174eh executorC0174eh = new ExecutorC0174eh();
                C0547ok c0547okM919b2 = C0095ce.m919b(c0095ce2.m921c(AbstractC0249gh.f2735c, EnumC0138dh.f1645j));
                c0547okM919b2.f5763b = executorC0174eh;
                xe1 xe1VarMo1439f = abstractC0727tf.mo1439f(wp0Var, new C0095ce(c0547okM919b2));
                try {
                    try {
                        C0098ch c0098chM2052b = AbstractC0249gh.m2052b(xe1VarMo1439f, c0525nz);
                        while (!c0098chM2052b.isDone()) {
                            try {
                                executorC0174eh.m1425b();
                            } catch (InterruptedException e3) {
                                try {
                                    xe1VarMo1439f.mo272b("Thread interrupted", e3);
                                    i4 = 1;
                                } catch (Error | RuntimeException e4) {
                                    e = e4;
                                    AbstractC0249gh.m2051a(xe1VarMo1439f, e);
                                    throw null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i4 = 1;
                                    if (i4 != 0) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            }
                        }
                        executorC0174eh.shutdown();
                        Object objM2053c = AbstractC0249gh.m2053c(c0098chM2052b);
                        if (i4 != 0) {
                            Thread.currentThread().interrupt();
                        }
                        C0599pz c0599pz = (C0599pz) objM2053c;
                        if (c0599pz.m4012p() < System.currentTimeMillis() + 60000 || c0599pz.m4012p() > System.currentTimeMillis() + 259200000) {
                            o70 o70Var = (o70) c0599pz.mo182e(5);
                            if (!o70Var.f5644j.equals(c0599pz)) {
                                o70Var.m3637c();
                                o70.m3634d(o70Var.f5645k, c0599pz);
                            }
                            C0562oz c0562oz = (C0562oz) o70Var;
                            long jCurrentTimeMillis = System.currentTimeMillis() + 86400000;
                            c0562oz.m3637c();
                            C0599pz.m4008n((C0599pz) c0562oz.f5645k, jCurrentTimeMillis);
                            c0599pz = (C0599pz) c0562oz.m3635a();
                        }
                        return c0599pz;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Error | RuntimeException e5) {
                    e = e5;
                }
                break;
                break;
            case 14:
                uz0 uz0Var = (uz0) this.f6477k;
                C0463ma c0463ma = (C0463ma) this.f6478l;
                rz0 rz0Var = (rz0) obj;
                qz0 qz0VarM4436u = rz0.m4436u(rz0Var);
                qz0VarM4436u.m3637c();
                rz0.m4432o((rz0) qz0VarM4436u.f5645k);
                long jM4438s = rz0Var.m4438s() + 1;
                qz0VarM4436u.m3637c();
                rz0.m4431n((rz0) qz0VarM4436u.f5645k, jM4438s);
                rz0 rz0Var2 = (rz0) qz0VarM4436u.m3635a();
                sz0 sz0VarM5006q = uz0.m5006q(uz0Var);
                c0463ma.getClass();
                sz0VarM5006q.m3637c();
                uz0.m5004n((uz0) sz0VarM5006q.f5645k).put("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY", rz0Var2);
                return (uz0) sz0VarM5006q.m3635a();
        }
    }

    @Override // p000.ic1
    /* JADX INFO: renamed from: c */
    public Object mo1085c() {
        int i = this.f6476j;
        Object obj = this.f6478l;
        ng1 ng1Var = (ng1) this.f6477k;
        switch (i) {
            case 18:
                Iterable iterable = (Iterable) obj;
                g41 g41Var = ng1Var.f5432c;
                g41Var.getClass();
                if (iterable.iterator().hasNext()) {
                    g41Var.m1980a().compileStatement("DELETE FROM events WHERE _id in ".concat(g41.m1978o(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ng1Var.f5438i.m1983l(((Integer) entry.getValue()).intValue(), ck0.f1277p, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(zc0 zc0Var, g10 g10Var) {
        d10 d10Var = (d10) this.f6477k;
        Activity activity = (Activity) this.f6478l;
        if (d10Var.f1516s != null) {
            m80.m3343j("Active FIAM exists. Skipping trigger");
            return;
        }
        d10Var.f1507j.getClass();
        d10Var.f1516s = zc0Var;
        d10Var.f1517t = g10Var;
        d10Var.m1080d(activity);
    }

    @Override // p000.iu0
    /* JADX INFO: renamed from: j */
    public void mo86j(v92 v92Var) {
        ((FirebaseMessagingService) this.f6477k).m1015a((Intent) this.f6478l);
    }

    @Override // p000.InterfaceC0845wm
    /* JADX INFO: renamed from: p */
    public Object mo92p(v92 v92Var) {
        f50 f50Var = (f50) this.f6477k;
        String str = (String) this.f6478l;
        synchronized (f50Var) {
            ((C0089c8) f50Var.f2314l).remove(str);
        }
        return v92Var;
    }

    @Override // p000.InterfaceC0003a2
    public void run() {
        int i = this.f6476j;
        Object obj = this.f6478l;
        Object obj2 = this.f6477k;
        switch (i) {
            case 0:
                ((C0652re) obj2).f6829d = (C0599pz) obj;
                return;
            case 1:
            default:
                xz0 xz0Var = (xz0) obj2;
                xz0Var.getClass();
                xz0Var.f9114c = hm0.m2292a((uz0) obj);
                return;
            case 2:
                C0963zt c0963zt = (C0963zt) obj2;
                f10 f10Var = (f10) obj;
                aq0 aq0Var = c0963zt.f9947f;
                zc0 zc0Var = c0963zt.f9949h;
                aq0Var.getClass();
                if (!zc0Var.f9733b.f5009k) {
                    ((l10) aq0Var.f600c).m3141c().m5127c(aq0Var.f604g, new C0923yq(aq0Var, zc0Var, f10Var, 2));
                }
                Iterator it = aq0Var.f603f.f6948c.values().iterator();
                if (it.hasNext()) {
                    throw AbstractC0024an.m280c(it);
                }
                return;
            case 3:
                C0963zt c0963zt2 = (C0963zt) obj2;
                e10 e10Var = (e10) obj;
                aq0 aq0Var2 = c0963zt2.f9947f;
                zc0 zc0Var2 = c0963zt2.f9949h;
                aq0Var2.getClass();
                if (!zc0Var2.f9733b.f5009k) {
                    ((l10) aq0Var2.f600c).m3141c().m5127c(aq0Var2.f604g, new C0923yq(aq0Var2, zc0Var2, e10Var, 3));
                    aq0Var2.m463c(zc0Var2, "fiam_dismiss", false);
                }
                Iterator it2 = aq0Var2.f603f.f6947b.values().iterator();
                if (it2.hasNext()) {
                    throw AbstractC0024an.m280c(it2);
                }
                return;
        }
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        int i = this.f6476j;
        Object obj = this.f6478l;
        String str = (String) this.f6477k;
        switch (i) {
            case 1:
                C0805vj c0805vj = (C0805vj) obj;
                try {
                    Trace.beginSection(str);
                    return c0805vj.f8203f.mo532x(c0902y5);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) c0902y5.mo2281a(Context.class);
                int i2 = ((C0042ay) obj).f654j;
                String strValueOf = "";
                switch (i2) {
                    case 4:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 5:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 6:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.m996a(installerPackageName);
                        }
                        break;
                }
                return new C0131da(str, strValueOf);
        }
    }
}
