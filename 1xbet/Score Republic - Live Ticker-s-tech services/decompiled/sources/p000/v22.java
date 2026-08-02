package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v22 extends mx1 {

    /* JADX INFO: renamed from: A */
    public boolean f8005A;

    /* JADX INFO: renamed from: B */
    public t12 f8006B;

    /* JADX INFO: renamed from: C */
    public r22 f8007C;

    /* JADX INFO: renamed from: D */
    public t12 f8008D;

    /* JADX INFO: renamed from: E */
    public final jg0 f8009E;

    /* JADX INFO: renamed from: l */
    public C0414kz f8010l;

    /* JADX INFO: renamed from: m */
    public a81 f8011m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArraySet f8012n;

    /* JADX INFO: renamed from: o */
    public boolean f8013o;

    /* JADX INFO: renamed from: p */
    public final AtomicReference f8014p;

    /* JADX INFO: renamed from: q */
    public final Object f8015q;

    /* JADX INFO: renamed from: r */
    public boolean f8016r;

    /* JADX INFO: renamed from: s */
    public int f8017s;

    /* JADX INFO: renamed from: t */
    public t12 f8018t;

    /* JADX INFO: renamed from: u */
    public t12 f8019u;

    /* JADX INFO: renamed from: v */
    public PriorityQueue f8020v;

    /* JADX INFO: renamed from: w */
    public l12 f8021w;

    /* JADX INFO: renamed from: x */
    public final AtomicLong f8022x;

    /* JADX INFO: renamed from: y */
    public long f8023y;

    /* JADX INFO: renamed from: z */
    public final iz1 f8024z;

    public v22(f02 f02Var) {
        super(f02Var);
        this.f8012n = new CopyOnWriteArraySet();
        this.f8015q = new Object();
        this.f8016r = false;
        this.f8017s = 1;
        this.f8005A = true;
        this.f8009E = new jg0(27, this);
        this.f8014p = new AtomicReference();
        this.f8021w = l12.f4643c;
        this.f8023y = -1L;
        this.f8022x = new AtomicLong(0L);
        this.f8024z = new iz1(f02Var);
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: D */
    public final boolean mo533D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m5023E(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        f02 f02Var = (f02) this.f7192j;
        f02Var.f2252t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f02Var.f2245m.m770L(null, jx1.f4178e1)) {
            f02Var.f2252t.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        m5024F(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r5 > 500) goto L36;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5024F(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.f8011m == null || f72.m1692f0(str2);
            String str3 = str == null ? "app" : str;
            long j3 = true != ((f02) this.f7192j).f2245m.m770L(null, jx1.f4178e1) ? 0L : j2;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            a02 a02Var = ((f02) this.f7192j).f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new b22(this, str3, str2, j, j3, bundle3, z2, z3, z));
            return;
        }
        f02 f02Var = (f02) this.f7192j;
        l32 l32Var = f02Var.f2253u;
        f02.m1559l(l32Var);
        long j4 = true != f02Var.f2245m.m770L(null, jx1.f4178e1) ? 0L : j2;
        synchronized (l32Var.f4667u) {
            try {
                if (!l32Var.f4666t) {
                    ky1 ky1Var = ((f02) l32Var.f7192j).f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4605t.m5312a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((f02) l32Var.f7192j).f2245m.getClass();
                    }
                    ky1 ky1Var2 = ((f02) l32Var.f7192j).f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4605t.m5313b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((f02) l32Var.f7192j).f2245m.getClass();
                    }
                    ky1 ky1Var3 = ((f02) l32Var.f7192j).f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4605t.m5313b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    xv1 xv1Var = l32Var.f4662p;
                    string2 = xv1Var != null ? l32Var.m3161F(xv1Var.f9091k) : "Activity";
                }
                String str5 = string2;
                f32 f32Var = l32Var.f4658l;
                if (l32Var.f4663q && f32Var != null) {
                    l32Var.f4663q = false;
                    boolean zEquals = Objects.equals(f32Var.f2296b, str5);
                    boolean zEquals2 = Objects.equals(f32Var.f2295a, string);
                    if (zEquals && zEquals2) {
                        ky1 ky1Var4 = ((f02) l32Var.f7192j).f2247o;
                        f02.m1560m(ky1Var4);
                        ky1Var4.f4605t.m5312a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                f02 f02Var2 = (f02) l32Var.f7192j;
                ky1 ky1Var5 = f02Var2.f2247o;
                f02.m1560m(ky1Var5);
                ky1Var5.f4608w.m5314c(string == null ? "null" : string, str5, "Logging screen view with name, class");
                f32 f32Var2 = l32Var.f4658l == null ? l32Var.f4659m : l32Var.f4658l;
                f72 f72Var = f02Var2.f2250r;
                f02.m1558k(f72Var);
                f32 f32Var3 = new f32(string, str5, f72Var.m1741z0(), true, j, j4);
                l32Var.f4658l = f32Var3;
                l32Var.f4659m = f32Var2;
                l32Var.f4664r = f32Var3;
                f02Var2.f2252t.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a02 a02Var2 = f02Var2.f2248p;
                f02.m1560m(a02Var2);
                a02Var2.m6J(new ee1(l32Var, bundle2, f32Var3, f32Var2, jElapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v11 ??, still in use, count: 1, list:
          (r14v11 ?? I:??[OBJECT, ARRAY]) from 0x0509: INVOKE (r2v9 ?? I:int) = (r14v11 ?? I:??[OBJECT, ARRAY]) VIRTUAL call: t52.c():int A[MD:():int (m)] (LINE:1290)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: G */
    public final void m5025G() {
        /*
            Method dump skipped, instruction units count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v22.m5025G():void");
    }

    /* JADX INFO: renamed from: H */
    public final void m5026H(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        mo11z();
        f02 f02Var = (f02) this.f7192j;
        f02Var.f2252t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f02Var.f2245m.m770L(null, jx1.f4178e1)) {
            f02Var.f2252t.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        m5027I(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    /* JADX INFO: renamed from: I */
    public final void m5027I(long j, long j2, Bundle bundle, String str, String str2) {
        mo11z();
        boolean z = true;
        if (this.f8011m != null && !f72.m1692f0(str2)) {
            z = false;
        }
        m5028J(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX INFO: renamed from: J */
    public final void m5028J(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        String str3;
        fz1 fz1Var;
        jg0 jg0Var;
        boolean z4;
        l32 l32Var;
        long j3;
        boolean zM5852a;
        int i;
        s52 s52Var;
        long j4;
        int i2;
        long j5;
        s52 s52Var2;
        boolean zM537H;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i3;
        int length;
        String str4 = str;
        p80.m3860e(str4);
        p80.m3863h(bundle);
        mo11z();
        m3446B();
        f02 f02Var = (f02) this.f7192j;
        boolean zM1565d = f02Var.m1565d();
        s52 s52Var3 = f02Var.f2249q;
        bt1 bt1Var = f02Var.f2245m;
        Context context = f02Var.f2242j;
        f72 f72Var = f02Var.f2250r;
        ky1 ky1Var = f02Var.f2247o;
        if (!zM1565d) {
            f02.m1560m(ky1Var);
            ky1Var.f4607v.m5312a("Event not sent since app measurement is disabled");
            return;
        }
        List list = f02Var.m1575r().f8292t;
        if (list != null && !list.contains(str2)) {
            f02.m1560m(ky1Var);
            ky1Var.f4607v.m5314c(str2, str4, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f8013o) {
            this.f8013o = true;
            try {
                try {
                    (!f02Var.f2243k ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4603r.m5313b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                f02.m1560m(ky1Var);
                ky1Var.f4606u.m5312a("Tag Manager is not found and thus will not be used");
            }
        }
        cy1 cy1Var = f02Var.f2251s;
        fz1 fz1Var2 = f02Var.f2246n;
        wa0 wa0Var = f02Var.f2252t;
        if (!bt1Var.m770L(null, jx1.f4163Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            wa0Var.getClass();
            str3 = null;
            m5030L(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            str3 = null;
        }
        if (!z || f72.f2339s[0].equals(str2)) {
            fz1Var = fz1Var2;
        } else {
            f02.m1558k(f72Var);
            f02.m1558k(fz1Var2);
            fz1Var = fz1Var2;
            f72Var.m1716N(bundle, fz1Var.f2548H.m1677x());
        }
        jg0 jg0Var2 = this.f8009E;
        if (z3 || "_iap".equals(str2)) {
            jg0Var = jg0Var2;
        } else {
            f02.m1558k(f72Var);
            int i4 = 2;
            if (f72Var.m1700E0("event", str2)) {
                jg0Var = jg0Var2;
                if (f72Var.m1704G0("event", zg1.f9762h, ((f02) f72Var.f7192j).f2245m.m770L(str3, jx1.f4181f1) ? zg1.f9764j : zg1.f9763i, str2)) {
                    i3 = 40;
                    if (f72Var.m1705H0(40, "event", str2)) {
                        i4 = 0;
                    }
                } else {
                    i4 = 13;
                }
                if (i4 != 0) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4602q.m5313b(cy1Var.m1043a(str2), "Invalid public event name. Event will not be logged (FE)");
                    f02.m1558k(f72Var);
                    String strM1682H = f72.m1682H(i3, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    f72.m1684S(jg0Var, null, i4, "_ev", strM1682H, length);
                    return;
                }
            } else {
                jg0Var = jg0Var2;
            }
            i3 = 40;
            if (i4 != 0) {
                f02.m1560m(ky1Var);
                ky1Var.f4602q.m5313b(cy1Var.m1043a(str2), "Invalid public event name. Event will not be logged (FE)");
                f02.m1558k(f72Var);
                String strM1682H2 = f72.m1682H(i3, str2, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                f72.m1684S(jg0Var, null, i4, "_ev", strM1682H2, length);
                return;
            }
        }
        l32 l32Var2 = f02Var.f2253u;
        f02.m1559l(l32Var2);
        f32 f32VarM3160E = l32Var2.m3160E(false);
        if (f32VarM3160E != null && !bundle.containsKey("_sc")) {
            f32VarM3160E.f2298d = true;
        }
        f72.m1696x0(f32VarM3160E, bundle, z && !z3);
        boolean zEquals = "am".equals(str4);
        boolean zM1692f0 = f72.m1692f0(str2);
        if (!z || this.f8011m == null || zM1692f0) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                f02.m1560m(ky1Var);
                ky1Var.f4607v.m5314c(cy1Var.m1043a(str2), cy1Var.m1047e(bundle), "Passing event to registered event handler (FE)");
                p80.m3863h(this.f8011m);
                a81 a81Var = this.f8011m;
                a81Var.getClass();
                try {
                    ((kv1) a81Var.f63k).mo2968h(str4, str2, bundle, j);
                    return;
                } catch (RemoteException e2) {
                    f02 f02Var2 = ((AppMeasurementDynamiteService) a81Var.f64l).f1351b;
                    if (f02Var2 != null) {
                        ky1 ky1Var2 = f02Var2.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4603r.m5313b(e2, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z4 = true;
        }
        if (f02Var.m1569h()) {
            f02.m1558k(f72Var);
            f02 f02Var3 = (f02) f72Var.f7192j;
            int iM1707I0 = f72Var.m1707I0(str2);
            if (iM1707I0 != 0) {
                f02.m1560m(ky1Var);
                ky1Var.f4602q.m5313b(cy1Var.m1043a(str2), "Invalid event name. Event will not be logged (FE)");
                String strM1682H3 = f72.m1682H(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                f02.m1558k(f72Var);
                f72.m1684S(jg0Var, null, iM1707I0, "_ev", strM1682H3, length2);
                return;
            }
            Bundle bundleM1710K = f72Var.m1710K(str2, bundle, wo1.m5390o("_o", "_sn", "_sc", "_si"), z3);
            p80.m3863h(bundleM1710K);
            f02.m1559l(l32Var2);
            String str5 = "_o";
            if (l32Var2.m3160E(false) == null || !"_ae".equals(str2)) {
                l32Var = l32Var2;
                j3 = 0;
            } else {
                f02.m1559l(s52Var3);
                q52 q52Var = s52Var3.f7035o;
                ((f02) q52Var.f6390d.f7192j).f2252t.getClass();
                j3 = 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                l32Var = l32Var2;
                long j6 = jElapsedRealtime - q52Var.f6388b;
                q52Var.f6388b = jElapsedRealtime;
                if (j6 > 0) {
                    f72Var.m1732n0(bundleM1710K, j6);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                String string2 = bundleM1710K.getString("_ffr");
                int i5 = ya1.f9257a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                fz1 fz1Var3 = f02Var3.f2246n;
                f02.m1558k(fz1Var3);
                if (Objects.equals(string2, fz1Var3.f2545E.m5181l())) {
                    ky1 ky1Var3 = f02Var3.f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4607v.m5312a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    fz1 fz1Var4 = f02Var3.f2246n;
                    f02.m1558k(fz1Var4);
                    fz1Var4.f2545E.m5182m(string2);
                }
            } else if ("_ae".equals(str2)) {
                fz1 fz1Var5 = f02Var3.f2246n;
                f02.m1558k(fz1Var5);
                String strM5181l = fz1Var5.f2545E.m5181l();
                if (!TextUtils.isEmpty(strM5181l)) {
                    bundleM1710K.putString("_ffr", strM5181l);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleM1710K);
            if (bt1Var.m770L(null, jx1.f4149S0)) {
                f02.m1559l(s52Var3);
                s52Var3.mo11z();
                zM5852a = s52Var3.f7033m;
            } else {
                f02.m1558k(fz1Var);
                zM5852a = fz1Var.f2542B.m5852a();
            }
            f02.m1558k(fz1Var);
            if (fz1Var.f2562y.m821a() > j3) {
                s52Var = s52Var3;
                j5 = j;
                if (fz1Var.m1913J(j5) && zM5852a) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5312a("Current session is expired, remove the session number, ID, and engagement time");
                    wa0Var.getClass();
                    i = 1;
                    i2 = 0;
                    m5030L(System.currentTimeMillis(), null, "auto", "_sid");
                    m5030L(System.currentTimeMillis(), null, "auto", "_sno");
                    m5030L(System.currentTimeMillis(), null, "auto", "_se");
                    j4 = j3;
                    fz1Var.f2563z.m822b(j4);
                } else {
                    i = 1;
                    j4 = j3;
                    i2 = 0;
                }
            } else {
                i = 1;
                s52Var = s52Var3;
                j4 = j3;
                i2 = 0;
                j5 = j;
            }
            if (bundleM1710K.getLong("extend_session", j4) == 1) {
                f02.m1560m(ky1Var);
                ky1Var.f4608w.m5312a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                f02.m1559l(s52Var);
                s52Var2 = s52Var;
                s52Var2.f7034n.m302A(j5, j2);
            } else {
                s52Var2 = s52Var;
            }
            ArrayList arrayList3 = new ArrayList(bundleM1710K.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i6 = i2;
            while (i6 < size) {
                String str6 = (String) arrayList3.get(i6);
                if (str6 != null) {
                    f02.m1558k(f72Var);
                    Object obj = bundleM1710K.get(str6);
                    arrayList = arrayList3;
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[i];
                        bundleArr[i2] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleM1710K.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i6++;
                arrayList3 = arrayList;
                i = 1;
            }
            int i7 = i2;
            while (i7 < arrayList2.size()) {
                Bundle bundleM1727h0 = (Bundle) arrayList2.get(i7);
                String str7 = i7 != 0 ? "_ep" : str2;
                String str8 = str5;
                bundleM1727h0.putString(str8, str4);
                if (z2) {
                    bundleM1727h0 = f72Var.m1727h0(bundleM1727h0);
                }
                Bundle bundle2 = bundleM1727h0;
                fu1 fu1Var = new fu1(str7, new eu1(bundleM1727h0), str4, j5, j2);
                v42 v42VarM1573p = f02Var.m1573p();
                v42VarM1573p.getClass();
                v42VarM1573p.mo11z();
                v42VarM1573p.m3446B();
                v42VarM1573p.m5065M();
                ay1 ay1VarM1572o = ((f02) v42VarM1573p.f7192j).m1572o();
                ay1VarM1572o.getClass();
                Parcel parcelObtain = Parcel.obtain();
                jm1.m2936b(fu1Var, parcelObtain, i2);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    ky1 ky1Var4 = ((f02) ay1VarM1572o.f7192j).f2247o;
                    f02.m1560m(ky1Var4);
                    ky1Var4.f4601p.m5312a("Event is too long for local database. Sending event directly to service");
                    zM537H = false;
                } else {
                    zM537H = ay1VarM1572o.m537H(0, bArrMarshall);
                }
                v42VarM1573p.m5067O(new nt0(v42VarM1573p, v42VarM1573p.m5069Q(true), zM537H, fu1Var, 3));
                if (!z4) {
                    Iterator it = this.f8012n.iterator();
                    while (it.hasNext()) {
                        ((o12) it.next()).mo3188a(str, str2, new Bundle(bundle2), j);
                    }
                }
                i7++;
                str4 = str;
                j5 = j;
                str5 = str8;
                i2 = 0;
            }
            f02.m1559l(l32Var);
            if (l32Var.m3160E(false) == null || !"_ae".equals(str2)) {
                return;
            }
            f02.m1559l(s52Var2);
            wa0Var.getClass();
            s52Var2.f7035o.m4038a(true, true, SystemClock.elapsedRealtime());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: K */
    public final void m5029K(String str, String str2, Object obj, boolean z, long j) {
        int iM1711K0;
        int length;
        f02 f02Var = (f02) this.f7192j;
        if (z) {
            f72 f72Var = f02Var.f2250r;
            f02.m1558k(f72Var);
            iM1711K0 = f72Var.m1711K0(str2);
        } else {
            f72 f72Var2 = f02Var.f2250r;
            f02.m1558k(f72Var2);
            if (!f72Var2.m1700E0("user property", str2)) {
                iM1711K0 = 6;
            } else if (f72Var2.m1704G0("user property", AbstractC0959zp.f9890u, null, str2)) {
                ((f02) f72Var2.f7192j).getClass();
                if (f72Var2.m1705H0(24, "user property", str2)) {
                    iM1711K0 = 0;
                } else {
                    iM1711K0 = 6;
                }
            } else {
                iM1711K0 = 15;
            }
        }
        jg0 jg0Var = this.f8009E;
        if (iM1711K0 != 0) {
            f02.m1558k(f02Var.f2250r);
            String strM1682H = f72.m1682H(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            f02.m1558k(f02Var.f2250r);
            f72.m1684S(jg0Var, null, iM1711K0, "_ev", strM1682H, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            a02 a02Var = f02Var.f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new ee1(this, str3, str2, null, j, 2));
            return;
        }
        f72 f72Var3 = f02Var.f2250r;
        f72 f72Var4 = f02Var.f2250r;
        f02.m1558k(f72Var3);
        int iM1718P = f72Var3.m1718P(obj, str2);
        if (iM1718P != 0) {
            f02.m1558k(f72Var4);
            String strM1682H2 = f72.m1682H(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            f02.m1558k(f72Var4);
            f72.m1684S(jg0Var, null, iM1718P, "_ev", strM1682H2, length);
            return;
        }
        f02.m1558k(f72Var4);
        Object objM1719Q = f72Var4.m1719Q(obj, str2);
        if (objM1719Q != null) {
            a02 a02Var2 = f02Var.f2248p;
            f02.m1560m(a02Var2);
            a02Var2.m6J(new ee1(this, str3, str2, objM1719Q, j, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX INFO: renamed from: L */
    public final void m5030L(long j, Object obj, String str, String str2) {
        String str3;
        boolean zM537H;
        Object objValueOf = obj;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        p80.m3860e(str2);
        mo11z();
        m3446B();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    fz1 fz1Var = f02Var.f2246n;
                    f02.m1558k(fz1Var);
                    fz1Var.f2559v.m5182m(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    fz1 fz1Var2 = f02Var.f2246n;
                    f02.m1558k(fz1Var2);
                    fz1Var2.f2559v.m5182m("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                fz1 fz1Var3 = f02Var.f2246n;
                f02.m1558k(fz1Var3);
                fz1Var3.f2559v.m5182m("unset");
            } else {
                str4 = str2;
            }
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5314c("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!f02Var.m1565d()) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4608w.m5312a("User property not set since app measurement is disabled");
            return;
        }
        if (f02Var.m1569h()) {
            b72 b72Var = new b72(j, obj2, str3, str);
            v42 v42VarM1573p = f02Var.m1573p();
            v42VarM1573p.mo11z();
            v42VarM1573p.m3446B();
            v42VarM1573p.m5065M();
            ay1 ay1VarM1572o = ((f02) v42VarM1573p.f7192j).m1572o();
            ay1VarM1572o.getClass();
            Parcel parcelObtain = Parcel.obtain();
            jm1.m2937c(b72Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                ky1 ky1Var3 = ((f02) ay1VarM1572o.f7192j).f2247o;
                f02.m1560m(ky1Var3);
                ky1Var3.f4601p.m5312a("User property too long for local database. Sending directly to service");
                zM537H = false;
            } else {
                zM537H = ay1VarM1572o.m537H(1, bArrMarshall);
            }
            v42VarM1573p.m5067O(new nt0(v42VarM1573p, v42VarM1573p.m5069Q(true), zM537H, b72Var, 2));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m5031M() {
        mo11z();
        m3446B();
        f02 f02Var = (f02) this.f7192j;
        if (f02Var.m1569h()) {
            bt1 bt1Var = f02Var.f2245m;
            ((f02) bt1Var.f7192j).getClass();
            Boolean boolM772N = bt1Var.m772N("google_analytics_deferred_deep_link_enabled");
            if (boolM772N != null && boolM772N.booleanValue()) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4607v.m5312a("Deferred Deep Link feature enabled.");
                a02 a02Var = f02Var.f2248p;
                f02.m1560m(a02Var);
                a02Var.m6J(new s12(this, 2));
            }
            v42 v42VarM1573p = f02Var.m1573p();
            v42VarM1573p.mo11z();
            v42VarM1573p.m3446B();
            z72 z72VarM5069Q = v42VarM1573p.m5069Q(true);
            v42VarM1573p.m5065M();
            f02 f02Var2 = (f02) v42VarM1573p.f7192j;
            f02Var2.f2245m.m770L(null, jx1.f4157W0);
            f02Var2.m1572o().m537H(3, new byte[0]);
            v42VarM1573p.m5067O(new v32(v42VarM1573p, z72VarM5069Q, 1));
            this.f8005A = false;
            fz1 fz1Var = f02Var.f2246n;
            f02.m1558k(fz1Var);
            fz1Var.mo11z();
            String string = fz1Var.m1908E().getString("previous_os_version", null);
            ((f02) fz1Var.f7192j).m1574q().m1081C();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = fz1Var.m1908E().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f02Var.m1574q().m1081C();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m5026H("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m5032N(Bundle bundle, long j) {
        f02 f02Var = (f02) this.f7192j;
        p80.m3863h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5312a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        oa2.m3663j(bundle2, "app_id", String.class, null);
        oa2.m3663j(bundle2, "origin", String.class, null);
        oa2.m3663j(bundle2, "name", String.class, null);
        oa2.m3663j(bundle2, "value", Object.class, null);
        oa2.m3663j(bundle2, "trigger_event_name", String.class, null);
        oa2.m3663j(bundle2, "trigger_timeout", Long.class, 0L);
        oa2.m3663j(bundle2, "timed_out_event_name", String.class, null);
        oa2.m3663j(bundle2, "timed_out_event_params", Bundle.class, null);
        oa2.m3663j(bundle2, "triggered_event_name", String.class, null);
        oa2.m3663j(bundle2, "triggered_event_params", Bundle.class, null);
        oa2.m3663j(bundle2, "time_to_live", Long.class, 0L);
        oa2.m3663j(bundle2, "expired_event_name", String.class, null);
        oa2.m3663j(bundle2, "expired_event_params", Bundle.class, null);
        p80.m3860e(bundle2.getString("name"));
        p80.m3860e(bundle2.getString("origin"));
        p80.m3863h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        f72 f72Var = f02Var.f2250r;
        cy1 cy1Var = f02Var.f2251s;
        ky1 ky1Var2 = f02Var.f2247o;
        f02.m1558k(f72Var);
        if (f72Var.m1711K0(string) != 0) {
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5313b(cy1Var.m1045c(string), "Invalid conditional user property name");
            return;
        }
        f02.m1558k(f72Var);
        if (f72Var.m1718P(obj, string) != 0) {
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(cy1Var.m1045c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objM1719Q = f72Var.m1719Q(obj, string);
        if (objM1719Q == null) {
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(cy1Var.m1045c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        oa2.m3662i(bundle2, objM1719Q);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(cy1Var.m1045c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(cy1Var.m1045c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            a02 a02Var = f02Var.f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new d22(this, bundle2, 0));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m5033O(String str, String str2, Bundle bundle) {
        f02 f02Var = (f02) this.f7192j;
        f02Var.f2252t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        p80.m3860e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new d22(this, bundle2, 1));
    }

    /* JADX INFO: renamed from: P */
    public final String m5034P() {
        f02 f02Var = (f02) this.f7192j;
        try {
            return AbstractC0875xf.m5655q(f02Var.f2242j, f02Var.f2257y);
        } catch (IllegalStateException e) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m5035Q(l12 l12Var, long j, boolean z) {
        int i = l12Var.f4645b;
        mo11z();
        m3446B();
        f02 f02Var = (f02) this.f7192j;
        fz1 fz1Var = f02Var.f2246n;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1558k(fz1Var);
        l12 l12VarM1911H = fz1Var.m1911H();
        if (j <= this.f8023y && l12.m3154l(l12VarM1911H.f4645b, i)) {
            f02.m1560m(ky1Var);
            ky1Var.f4606u.m5313b(l12Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        fz1 fz1Var2 = f02Var.f2246n;
        f02.m1558k(fz1Var2);
        fz1Var2.mo11z();
        if (!l12.m3154l(i, fz1Var2.m1908E().getInt("consent_source", 100))) {
            f02.m1560m(ky1Var);
            ky1Var.f4606u.m5313b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = fz1Var2.m1908E().edit();
        editorEdit.putString("consent_settings", l12Var.m3156g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5313b(l12Var, "Setting storage consent(FE)");
        this.f8023y = j;
        if (f02Var.m1573p().m5063K()) {
            v42 v42VarM1573p = f02Var.m1573p();
            v42VarM1573p.mo11z();
            v42VarM1573p.m3446B();
            v42VarM1573p.m5067O(new o42(v42VarM1573p, 2));
        } else {
            v42 v42VarM1573p2 = f02Var.m1573p();
            v42VarM1573p2.mo11z();
            v42VarM1573p2.m3446B();
            if (v42VarM1573p2.m5062J()) {
                v42VarM1573p2.m5067O(new v32(v42VarM1573p2, v42VarM1573p2.m5069Q(false)));
            }
        }
        if (z) {
            f02Var.m1573p().m5057E(new AtomicReference());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m5036R(Boolean bool, boolean z) {
        mo11z();
        m3446B();
        f02 f02Var = (f02) this.f7192j;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4607v.m5313b(bool, "Setting app measurement enabled (FE)");
        fz1 fz1Var = f02Var.f2246n;
        f02.m1558k(fz1Var);
        fz1Var.mo11z();
        SharedPreferences.Editor editorEdit = fz1Var.m1908E().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            fz1Var.mo11z();
            SharedPreferences.Editor editorEdit2 = fz1Var.m1908E().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        a02Var.mo11z();
        if (f02Var.f2236I || !(bool == null || bool.booleanValue())) {
            m5037S();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m5037S() {
        mo11z();
        f02 f02Var = (f02) this.f7192j;
        fz1 fz1Var = f02Var.f2246n;
        ky1 ky1Var = f02Var.f2247o;
        wa0 wa0Var = f02Var.f2252t;
        f02.m1558k(fz1Var);
        String strM5181l = fz1Var.f2559v.m5181l();
        int i = 1;
        if (strM5181l != null) {
            if ("unset".equals(strM5181l)) {
                wa0Var.getClass();
                m5030L(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strM5181l) ? 0L : 1L);
                wa0Var.getClass();
                m5030L(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!f02Var.m1565d() || !this.f8005A) {
            f02.m1560m(ky1Var);
            ky1Var.f4607v.m5312a("Updating Scion state (FE)");
            v42 v42VarM1573p = f02Var.m1573p();
            v42VarM1573p.mo11z();
            v42VarM1573p.m3446B();
            v42VarM1573p.m5067O(new v32(v42VarM1573p, v42VarM1573p.m5069Q(true), 3));
            return;
        }
        f02.m1560m(ky1Var);
        ky1Var.f4607v.m5312a("Recording app launch after enabling measurement for the first time (FE)");
        m5031M();
        s52 s52Var = f02Var.f2249q;
        f02.m1559l(s52Var);
        s52Var.f7034n.m325y();
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new s12(this, i));
    }

    /* JADX INFO: renamed from: T */
    public final void m5038T() {
        f02 f02Var = (f02) this.f7192j;
        if (!(f02Var.f2242j.getApplicationContext() instanceof Application) || this.f8010l == null) {
            return;
        }
        ((Application) f02Var.f2242j.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f8010l);
    }

    /* JADX INFO: renamed from: U */
    public final void m5039U(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        h12 h12Var;
        Boolean bool2;
        f02 f02Var = (f02) this.f7192j;
        m3446B();
        l12 l12Var = l12.f4643c;
        k12[] k12VarArr = i12.STORAGE.f3395j;
        int length = k12VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = k12VarArr[i2].f4254j;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4605t.m5313b(string, "Ignoring invalid consent setting");
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4605t.m5312a("Valid consent values are 'granted', 'denied'");
        }
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        boolean zM3G = a02Var.m3G();
        l12 l12VarM3149b = l12.m3149b(i, bundle);
        Iterator it = l12VarM3149b.f4644a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            h12Var = h12.f3002k;
            if (!zHasNext) {
                break;
            } else if (((h12) it.next()) != h12Var) {
                m5041W(l12VarM3149b, zM3G);
                break;
            }
        }
        zt1 zt1VarM6038c = zt1.m6038c(i, bundle);
        Iterator it2 = zt1VarM6038c.f9958e.values().iterator();
        while (it2.hasNext()) {
            if (((h12) it2.next()) != h12Var) {
                m5040V(zt1VarM6038c, zM3G);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = l12.m3151d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zM3G) {
                m5030L(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                m5029K(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m5040V(zt1 zt1Var, boolean z) {
        f31 f31Var = new f31(18, this, zt1Var);
        if (z) {
            mo11z();
            f31Var.run();
        } else {
            a02 a02Var = ((f02) this.f7192j).f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(f31Var);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m5041W(l12 l12Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        l12 l12Var2;
        m3446B();
        int i = l12Var.f4645b;
        if (i != -10) {
            h12 h12Var = (h12) l12Var.f4644a.get(k12.f4249k);
            if (h12Var == null) {
                h12Var = h12.f3002k;
            }
            h12 h12Var2 = h12.f3002k;
            if (h12Var == h12Var2) {
                h12 h12Var3 = (h12) l12Var.f4644a.get(k12.f4250l);
                if (h12Var3 == null) {
                    h12Var3 = h12Var2;
                }
                if (h12Var3 == h12Var2) {
                    ky1 ky1Var = ((f02) this.f7192j).f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4605t.m5312a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f8015q) {
            try {
                z2 = false;
                if (l12.m3154l(i, this.f8021w.f4645b)) {
                    l12 l12Var3 = this.f8021w;
                    EnumMap enumMap = l12Var.f4644a;
                    k12[] k12VarArr = (k12[]) enumMap.keySet().toArray(new k12[0]);
                    int length = k12VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        k12 k12Var = k12VarArr[i2];
                        h12 h12Var4 = (h12) enumMap.get(k12Var);
                        h12 h12Var5 = (h12) l12Var3.f4644a.get(k12Var);
                        h12 h12Var6 = h12.f3004m;
                        if (h12Var4 == h12Var6 && h12Var5 != h12Var6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    k12 k12Var2 = k12.f4250l;
                    if (l12Var.m3157i(k12Var2) && !this.f8021w.m3157i(k12Var2)) {
                        z2 = true;
                    }
                    l12Var = l12Var.m3159k(this.f8021w);
                    this.f8021w = l12Var;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                l12Var2 = l12Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            ky1 ky1Var2 = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4606u.m5313b(l12Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f8022x.getAndIncrement();
        if (z3) {
            this.f8014p.set(null);
            g22 g22Var = new g22(this, l12Var2, andIncrement, z4, 0);
            if (z) {
                mo11z();
                g22Var.run();
                return;
            } else {
                a02 a02Var = ((f02) this.f7192j).f2248p;
                f02.m1560m(a02Var);
                a02Var.m8L(g22Var);
                return;
            }
        }
        g22 g22Var2 = new g22(this, l12Var2, andIncrement, z4, 1);
        if (z) {
            mo11z();
            g22Var2.run();
        } else if (i == 30 || i == -10) {
            a02 a02Var2 = ((f02) this.f7192j).f2248p;
            f02.m1560m(a02Var2);
            a02Var2.m8L(g22Var2);
        } else {
            a02 a02Var3 = ((f02) this.f7192j).f2248p;
            f02.m1560m(a02Var3);
            a02Var3.m6J(g22Var2);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m5042X() {
        fs1.m1890a();
        f02 f02Var = (f02) this.f7192j;
        bt1 bt1Var = f02Var.f2245m;
        a02 a02Var = f02Var.f2248p;
        ky1 ky1Var = f02Var.f2247o;
        if (bt1Var.m770L(null, jx1.f4143P0)) {
            f02.m1560m(a02Var);
            if (a02Var.m3G()) {
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5312a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (u90.m4898g()) {
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5312a("Cannot get trigger URIs from main thread");
                return;
            }
            m3446B();
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5312a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            f02.m1560m(a02Var);
            a02Var.m7K(atomicReference, 10000L, "get trigger URIs", new c22(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                f02.m1560m(ky1Var);
                ky1Var.f4602q.m5312a("Timed out waiting for get trigger URIs");
            } else {
                f02.m1560m(a02Var);
                a02Var.m6J(new Runnable() { // from class: n22
                    @Override // java.lang.Runnable
                    public final void run() {
                        v22 v22Var = this.f5262j;
                        v22Var.mo11z();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        fz1 fz1Var = ((f02) v22Var.f7192j).f2246n;
                        f02.m1558k(fz1Var);
                        SparseArray sparseArrayM1910G = fz1Var.m1910G();
                        for (y52 y52Var : list) {
                            int i = y52Var.f9178l;
                            if (!sparseArrayM1910G.contains(i) || ((Long) sparseArrayM1910G.get(i)).longValue() < y52Var.f9177k) {
                                v22Var.m5043Y().add(y52Var);
                            }
                        }
                        v22Var.m5044Z();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final PriorityQueue m5043Y() {
        if (this.f8020v == null) {
            this.f8020v = new PriorityQueue(Comparator.comparing(o22.f5585a, ol0.f5782k));
        }
        return this.f8020v;
    }

    /* JADX INFO: renamed from: Z */
    public final void m5044Z() {
        y52 y52Var;
        mo11z();
        if (m5043Y().isEmpty() || this.f8016r || (y52Var = (y52) m5043Y().poll()) == null) {
            return;
        }
        f02 f02Var = (f02) this.f7192j;
        f72 f72Var = f02Var.f2250r;
        f02.m1558k(f72Var);
        en0 en0VarM1721W = f72Var.m1721W();
        if (en0VarM1721W != null) {
            this.f8016r = true;
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            wc1 wc1Var = ky1Var.f4608w;
            String str = y52Var.f9176j;
            wc1Var.m5313b(str, "Registering trigger URI");
            ListenableFuture listenableFutureM1473e = en0VarM1721W.m1473e(Uri.parse(str));
            boolean z = false;
            if (listenableFutureM1473e != null) {
                listenableFutureM1473e.mo995c(new RunnableC0529o2(listenableFutureM1473e, new a81(13, this, y52Var), 16, z), new ja0(3, this));
            } else {
                this.f8016r = false;
                m5043Y().add(y52Var);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5045a0(l12 l12Var) {
        mo11z();
        boolean z = (l12Var.m3157i(k12.f4250l) && l12Var.m3157i(k12.f4249k)) || ((f02) this.f7192j).m1573p().m5062J();
        f02 f02Var = (f02) this.f7192j;
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        a02Var.mo11z();
        if (z != f02Var.f2236I) {
            a02 a02Var2 = f02Var.f2248p;
            f02.m1560m(a02Var2);
            a02Var2.mo11z();
            f02Var.f2236I = z;
            fz1 fz1Var = ((f02) this.f7192j).f2246n;
            f02.m1558k(fz1Var);
            fz1Var.mo11z();
            Boolean boolValueOf = fz1Var.m1908E().contains("measurement_enabled_from_api") ? Boolean.valueOf(fz1Var.m1908E().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                m5036R(Boolean.valueOf(z), false);
            }
        }
    }
}
