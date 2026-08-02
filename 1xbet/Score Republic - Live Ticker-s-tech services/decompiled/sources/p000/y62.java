package p000;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y62 {

    /* JADX INFO: renamed from: i */
    public static final an0 f9189i = new an0(24);

    /* JADX INFO: renamed from: j */
    public static final f62 f9190j;

    /* JADX INFO: renamed from: a */
    public volatile C0415l f9191a;

    /* JADX INFO: renamed from: b */
    public final x22 f9192b;

    /* JADX INFO: renamed from: c */
    public final String f9193c;

    /* JADX INFO: renamed from: d */
    public final String f9194d;

    /* JADX INFO: renamed from: e */
    public final boolean f9195e;

    /* JADX INFO: renamed from: f */
    public final sc0 f9196f;

    /* JADX INFO: renamed from: g */
    public final c32 f9197g;

    /* JADX INFO: renamed from: h */
    public final oq0 f9198h;

    static {
        yq1 yq1Var = yq1.f9433l;
        int i = sc0.f7095l;
        f9190j = new f62(yq1Var, false, w01.f8328s);
    }

    public y62(x22 x22Var, f62 f62Var) {
        this.f9192b = x22Var;
        Context context = x22Var.f8764b;
        String str = f62Var.f2329d;
        if (str == null) {
            str = (String) f62Var.f2326a.apply(context);
            f62Var.f2329d = str;
        }
        this.f9193c = str;
        this.f9194d = "";
        this.f9195e = f62Var.f2327b;
        this.f9196f = f62Var.f2328c;
        this.f9191a = null;
        this.f9197g = new c32();
        this.f9198h = new oq0(x22Var, str);
    }

    /* JADX INFO: renamed from: a */
    public final C0415l m5742a() {
        C0415l c0415l;
        C0415l c0415l2 = this.f9191a;
        if (c0415l2 != null) {
            return c0415l2;
        }
        synchronized (this) {
            try {
                c0415l = this.f9191a;
                if (c0415l == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        C0415l c0415lM3743p = this.f9198h.m3743p();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i = ((vr0) c0415lM3743p.f4617e).f8255b - 2;
                        if (i == 15 || i == 16) {
                            c0415l = c0415lM3743p;
                        } else {
                            x22 x22Var = this.f9192b;
                            x22Var.f8769g.m603a();
                            if (this.f9195e || this.f9198h.m3747t() || !((String) c0415lM3743p.f4614b).isEmpty()) {
                                final int i2 = 3;
                                x22Var.m5498a().execute(new Runnable(this) { // from class: i62

                                    /* JADX INFO: renamed from: k */
                                    public final /* synthetic */ y62 f3452k;

                                    {
                                        this.f3452k = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i3;
                                        i52 i52Var;
                                        y82 y82Var;
                                        int i4;
                                        o31 o31Var;
                                        ListenableFuture listenableFuture;
                                        C0305i c0305iM590b;
                                        int i5 = i2;
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        y62 y62Var = this.f3452k;
                                        switch (i5) {
                                            case 0:
                                                y62Var.m5743b();
                                                return;
                                            case 1:
                                                x22 x22Var2 = y62Var.f9192b;
                                                String str = y62Var.f9193c;
                                                h92 h92Var = i72.f3457a;
                                                o31 o31Var2 = o31.f5612t;
                                                Context context = x22Var2.f8764b;
                                                Pattern pattern = l82.f4712a;
                                                C0902y5 c0902y5 = new C0902y5(context);
                                                c0902y5.m5737t("phenotype");
                                                c0902y5.m5738u("all_accounts.pb");
                                                Uri uriM5739v = c0902y5.m5739v();
                                                if (uriM5739v == null) {
                                                    C0270h1.m2192h("Null uri");
                                                    return;
                                                }
                                                i52 i52VarM2530u = i52.m2530u();
                                                if (i52VarM2530u == null) {
                                                    C0270h1.m2192h("Null schema");
                                                    return;
                                                }
                                                h92 h92Var2 = i72.f3457a;
                                                h92Var2.getClass();
                                                cx0 cx0Var = new cx0(h92Var2);
                                                nc0 nc0Var = qc0.f6464k;
                                                q01 q01Var = q01.f6303n;
                                                y82 y82Var2 = new y82(uriM5739v, i52VarM2530u, cx0Var, q01Var);
                                                n71 n71Var = i72.f3459c;
                                                if (n71Var == null) {
                                                    synchronized (i72.f3458b) {
                                                        try {
                                                            n71Var = i72.f3459c;
                                                            if (n71Var == null) {
                                                                HashMap map = new HashMap();
                                                                mq0 mq0VarM5498a = x22Var2.m5498a();
                                                                g82 g82Var = (g82) x22Var2.f8768f.get();
                                                                b92 b92Var = b92.f794a;
                                                                i3 = 1;
                                                                a90.m121e("singleproc", "There is already a factory registered for the ID %s", !map.containsKey("singleproc"));
                                                                map.put("singleproc", b92Var);
                                                                n71 n71Var2 = new n71(mq0VarM5498a, g82Var, map);
                                                                i72.f3459c = n71Var2;
                                                                n71Var = n71Var2;
                                                            } else {
                                                                i3 = 1;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    x22Var2 = x22Var2;
                                                    i3 = 1;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) n71Var.f5319b;
                                                Pair pair = (Pair) concurrentHashMap.get(uriM5739v);
                                                if (pair == null) {
                                                    a90.m121e(uriM5739v, "Uri must be hierarchical: %s", uriM5739v.isHierarchical());
                                                    String lastPathSegment = uriM5739v.getLastPathSegment();
                                                    int i6 = gw0.f2952a;
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    a90.m121e(uriM5739v, "Uri extension must be .pb: %s", (iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"));
                                                    b92 b92Var2 = (b92) ((HashMap) n71Var.f5322e).get("singleproc");
                                                    a90.m121e("singleproc", "No XDataStoreVariantFactory registered for ID %s", b92Var2 != null ? i3 : 0);
                                                    String lastPathSegment2 = uriM5739v.getLastPathSegment();
                                                    if (lastPathSegment2 == null) {
                                                        lastPathSegment2 = "";
                                                    }
                                                    int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                    }
                                                    C0934z0 c0934z0M2996g = k70.m2996g(k70.m2993d(uriM5739v), (z32) n71Var.f5321d, EnumC0113ct.f1449j);
                                                    Executor executor = (Executor) n71Var.f5318a;
                                                    g82 g82Var2 = (g82) n71Var.f5320c;
                                                    b92Var2.getClass();
                                                    String str2 = lastPathSegment2;
                                                    i92 i92Var = new i92(i52VarM2530u, so1.m4573a());
                                                    i4 = i3;
                                                    o31Var = o31Var2;
                                                    i52Var = i52VarM2530u;
                                                    a92 a92Var = new a92(new e92(str2, k70.m2993d(uriM5739v), i92Var, executor, g82Var2, cx0Var, new bx1(7)), c0934z0M2996g);
                                                    if (!q01Var.isEmpty()) {
                                                        n72 n72Var = new n72(i4, q01Var, executor);
                                                        synchronized (a92Var.f102g) {
                                                            a92Var.f104i.add(n72Var);
                                                        }
                                                    }
                                                    Pair pairCreate = Pair.create(a92Var, y82Var2);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uriM5739v, pairCreate);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                        y82Var = y82Var2;
                                                    } else {
                                                        y82Var = y82Var2;
                                                        pair = pairCreate;
                                                    }
                                                    break;
                                                } else {
                                                    i52Var = i52VarM2530u;
                                                    y82Var = y82Var2;
                                                    i4 = i3;
                                                    o31Var = o31Var2;
                                                }
                                                a92 a92Var2 = (a92) pair.first;
                                                y82 y82Var3 = (y82) pair.second;
                                                if (y82Var.equals(y82Var3)) {
                                                    C0002a1 c0002a1M148a = a92Var2.m148a(new q62(i4, str), x22Var2.m5498a());
                                                    c0002a1M148a.mo995c(new n62(y62Var, c0002a1M148a, 0), x22Var2.m5498a());
                                                    return;
                                                }
                                                String strM3651s = o80.m3651s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", i52.class.getSimpleName(), uriM5739v);
                                                a90.m121e("uri", strM3651s, uriM5739v.equals(y82Var3.f9217a));
                                                a90.m121e("schema", strM3651s, i52Var.equals(y82Var3.f9218b));
                                                a90.m121e("handler", strM3651s, cx0Var.equals(y82Var3.f9219c));
                                                a90.m121e("migrations", strM3651s, q01Var.equals(y82Var3.f9220d));
                                                Object obj = o31Var;
                                                a90.m121e("variantConfig", strM3651s, obj.equals(obj));
                                                C0270h1.m2190f(o80.m3651s(strM3651s, "unknown"));
                                                return;
                                            case 2:
                                                p72 p72Var = y62Var.f9192b.f8771i;
                                                boolean z4 = y62Var.f9195e;
                                                p62 p62Var = p62.f6001a;
                                                s72 s72Var = (s72) p72Var.f6009c.get();
                                                if (s72Var == null && !z4) {
                                                    jc0 jc0Var = jc0.f3900k;
                                                    return;
                                                }
                                                if ((p72Var.f6011e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = p72Var.f6012f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i7 = p72Var.f6011e;
                                                            if ((i7 & 64) == 0) {
                                                                copyOnWriteArrayList.add(p62Var);
                                                                p72Var.f6011e = i7 | 64;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (p72Var.f6014h == null) {
                                                    synchronized (p72Var.f6013g) {
                                                        try {
                                                            if (p72Var.f6014h == null) {
                                                                if (s72Var == null) {
                                                                    s72Var = o72.f5648a;
                                                                }
                                                                Context context2 = p72Var.f6007a;
                                                                if (j22.m2791J(context2)) {
                                                                    C0305i c0305iM591a = ((b42) p72Var.f6010d.get()).m591a(new a81(p72Var, s72Var));
                                                                    p72Var.f6014h = c0305iM591a;
                                                                    listenableFuture = c0305iM591a;
                                                                } else {
                                                                    RunnableC0393ke runnableC0393ke = RunnableC0393ke.f4355l;
                                                                    nb1 nb1Var = p72Var.f6008b;
                                                                    C0934z0 c0934z0M2996g2 = k70.m2996g(j22.m2790I(context2, Executors.callable(runnableC0393ke, null), (Executor) nb1Var.get()), new n72(z2 ? 1 : 0, p72Var, s72Var), (Executor) nb1Var.get());
                                                                    p72Var.f6014h = c0934z0M2996g2;
                                                                    listenableFuture = c0934z0M2996g2;
                                                                }
                                                                listenableFuture.mo995c(new cm1(12, listenableFuture), (Executor) p72Var.f6008b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                C0415l c0415lM5742a = y62Var.m5742a();
                                                String str3 = (String) c0415lM5742a.f4614b;
                                                x22 x22Var3 = y62Var.f9192b;
                                                nb1 nb1Var2 = x22Var3.f8766d;
                                                t72 t72VarM604b = x22Var3.f8769g.m604b();
                                                boolean z5 = t72VarM604b.f7337i;
                                                if (t72VarM604b.f7338j) {
                                                    if (gw0.m2161a(str3) && !z5) {
                                                        jc0 jc0Var2 = jc0.f3900k;
                                                        return;
                                                    }
                                                    m32 m32VarM4238u = r32.m4238u();
                                                    vr0 vr0Var = (vr0) c0415lM5742a.f4617e;
                                                    int i8 = vr0Var.f8254a;
                                                    o32 o32VarM3844t = p32.m3844t();
                                                    o32VarM3844t.m5681b();
                                                    ((p32) o32VarM3844t.f9011k).m3845u(i8);
                                                    int i9 = vr0Var.f8255b;
                                                    o32VarM3844t.m5681b();
                                                    ((p32) o32VarM3844t.f9011k).m3846v(i9);
                                                    p32 p32Var = (p32) o32VarM3844t.m5683d();
                                                    m32VarM4238u.m5681b();
                                                    ((r32) m32VarM4238u.f9011k).m4241w(p32Var);
                                                    if (!gw0.m2161a(str3)) {
                                                        m32VarM4238u.m5681b();
                                                        ((r32) m32VarM4238u.f9011k).m4240v(str3);
                                                    }
                                                    if (z5) {
                                                        String str4 = y62Var.f9193c;
                                                        m32VarM4238u.m5681b();
                                                        ((r32) m32VarM4238u.f9011k).m4242x(str4);
                                                    }
                                                    b42 b42Var = (b42) nb1Var2.get();
                                                    r32 r32Var = (r32) m32VarM4238u.m5683d();
                                                    e22 e22Var = b42Var.f710a;
                                                    m81 m81VarM3350b = m81.m3350b();
                                                    m81VarM3350b.f5010l = new jg0(26, r32Var);
                                                    m81VarM3350b.f5011m = new C0451lz[]{AbstractC0477mo.f5107d};
                                                    m81VarM3350b.f5009k = false;
                                                    c0305iM590b = b42.m590b(e22Var.m2002b(0, m81VarM3350b.m3354a()).m5129e(EnumC0113ct.f1449j, new a81(e22Var, r32Var, 14, z)));
                                                } else {
                                                    if (gw0.m2161a(str3)) {
                                                        jc0 jc0Var3 = jc0.f3900k;
                                                        return;
                                                    }
                                                    b42 b42Var2 = (b42) nb1Var2.get();
                                                    b42Var2.getClass();
                                                    str3.getClass();
                                                    c0305iM590b = b42.m590b(b42Var2.f710a.m1349c(str3));
                                                }
                                                k70.m2990a(c0305iM590b, y32.class, new l62(z3 ? 1 : 0, y62Var), x22Var3.m5498a());
                                                return;
                                        }
                                    }
                                });
                                x22Var.f8763a.m3745r((ko1) c0415lM3743p.f4615c, this.f9196f, this.f9193c);
                                if (!this.f9194d.equals("")) {
                                    final int i3 = 1;
                                    x22Var.m5498a().execute(new Runnable(this) { // from class: i62

                                        /* JADX INFO: renamed from: k */
                                        public final /* synthetic */ y62 f3452k;

                                        {
                                            this.f3452k = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i4;
                                            i52 i52Var;
                                            y82 y82Var;
                                            int i5;
                                            o31 o31Var;
                                            ListenableFuture listenableFuture;
                                            C0305i c0305iM590b;
                                            int i6 = i3;
                                            boolean z = false;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            y62 y62Var = this.f3452k;
                                            switch (i6) {
                                                case 0:
                                                    y62Var.m5743b();
                                                    return;
                                                case 1:
                                                    x22 x22Var2 = y62Var.f9192b;
                                                    String str = y62Var.f9193c;
                                                    h92 h92Var = i72.f3457a;
                                                    o31 o31Var2 = o31.f5612t;
                                                    Context context = x22Var2.f8764b;
                                                    Pattern pattern = l82.f4712a;
                                                    C0902y5 c0902y5 = new C0902y5(context);
                                                    c0902y5.m5737t("phenotype");
                                                    c0902y5.m5738u("all_accounts.pb");
                                                    Uri uriM5739v = c0902y5.m5739v();
                                                    if (uriM5739v == null) {
                                                        C0270h1.m2192h("Null uri");
                                                        return;
                                                    }
                                                    i52 i52VarM2530u = i52.m2530u();
                                                    if (i52VarM2530u == null) {
                                                        C0270h1.m2192h("Null schema");
                                                        return;
                                                    }
                                                    h92 h92Var2 = i72.f3457a;
                                                    h92Var2.getClass();
                                                    cx0 cx0Var = new cx0(h92Var2);
                                                    nc0 nc0Var = qc0.f6464k;
                                                    q01 q01Var = q01.f6303n;
                                                    y82 y82Var2 = new y82(uriM5739v, i52VarM2530u, cx0Var, q01Var);
                                                    n71 n71Var = i72.f3459c;
                                                    if (n71Var == null) {
                                                        synchronized (i72.f3458b) {
                                                            try {
                                                                n71Var = i72.f3459c;
                                                                if (n71Var == null) {
                                                                    HashMap map = new HashMap();
                                                                    mq0 mq0VarM5498a = x22Var2.m5498a();
                                                                    g82 g82Var = (g82) x22Var2.f8768f.get();
                                                                    b92 b92Var = b92.f794a;
                                                                    i4 = 1;
                                                                    a90.m121e("singleproc", "There is already a factory registered for the ID %s", !map.containsKey("singleproc"));
                                                                    map.put("singleproc", b92Var);
                                                                    n71 n71Var2 = new n71(mq0VarM5498a, g82Var, map);
                                                                    i72.f3459c = n71Var2;
                                                                    n71Var = n71Var2;
                                                                } else {
                                                                    i4 = 1;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        x22Var2 = x22Var2;
                                                        i4 = 1;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) n71Var.f5319b;
                                                    Pair pair = (Pair) concurrentHashMap.get(uriM5739v);
                                                    if (pair == null) {
                                                        a90.m121e(uriM5739v, "Uri must be hierarchical: %s", uriM5739v.isHierarchical());
                                                        String lastPathSegment = uriM5739v.getLastPathSegment();
                                                        int i7 = gw0.f2952a;
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        a90.m121e(uriM5739v, "Uri extension must be .pb: %s", (iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"));
                                                        b92 b92Var2 = (b92) ((HashMap) n71Var.f5322e).get("singleproc");
                                                        a90.m121e("singleproc", "No XDataStoreVariantFactory registered for ID %s", b92Var2 != null ? i4 : 0);
                                                        String lastPathSegment2 = uriM5739v.getLastPathSegment();
                                                        if (lastPathSegment2 == null) {
                                                            lastPathSegment2 = "";
                                                        }
                                                        int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                        }
                                                        C0934z0 c0934z0M2996g = k70.m2996g(k70.m2993d(uriM5739v), (z32) n71Var.f5321d, EnumC0113ct.f1449j);
                                                        Executor executor = (Executor) n71Var.f5318a;
                                                        g82 g82Var2 = (g82) n71Var.f5320c;
                                                        b92Var2.getClass();
                                                        String str2 = lastPathSegment2;
                                                        i92 i92Var = new i92(i52VarM2530u, so1.m4573a());
                                                        i5 = i4;
                                                        o31Var = o31Var2;
                                                        i52Var = i52VarM2530u;
                                                        a92 a92Var = new a92(new e92(str2, k70.m2993d(uriM5739v), i92Var, executor, g82Var2, cx0Var, new bx1(7)), c0934z0M2996g);
                                                        if (!q01Var.isEmpty()) {
                                                            n72 n72Var = new n72(i5, q01Var, executor);
                                                            synchronized (a92Var.f102g) {
                                                                a92Var.f104i.add(n72Var);
                                                            }
                                                        }
                                                        Pair pairCreate = Pair.create(a92Var, y82Var2);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uriM5739v, pairCreate);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                            y82Var = y82Var2;
                                                        } else {
                                                            y82Var = y82Var2;
                                                            pair = pairCreate;
                                                        }
                                                        break;
                                                    } else {
                                                        i52Var = i52VarM2530u;
                                                        y82Var = y82Var2;
                                                        i5 = i4;
                                                        o31Var = o31Var2;
                                                    }
                                                    a92 a92Var2 = (a92) pair.first;
                                                    y82 y82Var3 = (y82) pair.second;
                                                    if (y82Var.equals(y82Var3)) {
                                                        C0002a1 c0002a1M148a = a92Var2.m148a(new q62(i5, str), x22Var2.m5498a());
                                                        c0002a1M148a.mo995c(new n62(y62Var, c0002a1M148a, 0), x22Var2.m5498a());
                                                        return;
                                                    }
                                                    String strM3651s = o80.m3651s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", i52.class.getSimpleName(), uriM5739v);
                                                    a90.m121e("uri", strM3651s, uriM5739v.equals(y82Var3.f9217a));
                                                    a90.m121e("schema", strM3651s, i52Var.equals(y82Var3.f9218b));
                                                    a90.m121e("handler", strM3651s, cx0Var.equals(y82Var3.f9219c));
                                                    a90.m121e("migrations", strM3651s, q01Var.equals(y82Var3.f9220d));
                                                    Object obj = o31Var;
                                                    a90.m121e("variantConfig", strM3651s, obj.equals(obj));
                                                    C0270h1.m2190f(o80.m3651s(strM3651s, "unknown"));
                                                    return;
                                                case 2:
                                                    p72 p72Var = y62Var.f9192b.f8771i;
                                                    boolean z4 = y62Var.f9195e;
                                                    p62 p62Var = p62.f6001a;
                                                    s72 s72Var = (s72) p72Var.f6009c.get();
                                                    if (s72Var == null && !z4) {
                                                        jc0 jc0Var = jc0.f3900k;
                                                        return;
                                                    }
                                                    if ((p72Var.f6011e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = p72Var.f6012f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i8 = p72Var.f6011e;
                                                                if ((i8 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(p62Var);
                                                                    p72Var.f6011e = i8 | 64;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (p72Var.f6014h == null) {
                                                        synchronized (p72Var.f6013g) {
                                                            try {
                                                                if (p72Var.f6014h == null) {
                                                                    if (s72Var == null) {
                                                                        s72Var = o72.f5648a;
                                                                    }
                                                                    Context context2 = p72Var.f6007a;
                                                                    if (j22.m2791J(context2)) {
                                                                        C0305i c0305iM591a = ((b42) p72Var.f6010d.get()).m591a(new a81(p72Var, s72Var));
                                                                        p72Var.f6014h = c0305iM591a;
                                                                        listenableFuture = c0305iM591a;
                                                                    } else {
                                                                        RunnableC0393ke runnableC0393ke = RunnableC0393ke.f4355l;
                                                                        nb1 nb1Var = p72Var.f6008b;
                                                                        C0934z0 c0934z0M2996g2 = k70.m2996g(j22.m2790I(context2, Executors.callable(runnableC0393ke, null), (Executor) nb1Var.get()), new n72(z2 ? 1 : 0, p72Var, s72Var), (Executor) nb1Var.get());
                                                                        p72Var.f6014h = c0934z0M2996g2;
                                                                        listenableFuture = c0934z0M2996g2;
                                                                    }
                                                                    listenableFuture.mo995c(new cm1(12, listenableFuture), (Executor) p72Var.f6008b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    C0415l c0415lM5742a = y62Var.m5742a();
                                                    String str3 = (String) c0415lM5742a.f4614b;
                                                    x22 x22Var3 = y62Var.f9192b;
                                                    nb1 nb1Var2 = x22Var3.f8766d;
                                                    t72 t72VarM604b = x22Var3.f8769g.m604b();
                                                    boolean z5 = t72VarM604b.f7337i;
                                                    if (t72VarM604b.f7338j) {
                                                        if (gw0.m2161a(str3) && !z5) {
                                                            jc0 jc0Var2 = jc0.f3900k;
                                                            return;
                                                        }
                                                        m32 m32VarM4238u = r32.m4238u();
                                                        vr0 vr0Var = (vr0) c0415lM5742a.f4617e;
                                                        int i9 = vr0Var.f8254a;
                                                        o32 o32VarM3844t = p32.m3844t();
                                                        o32VarM3844t.m5681b();
                                                        ((p32) o32VarM3844t.f9011k).m3845u(i9);
                                                        int i10 = vr0Var.f8255b;
                                                        o32VarM3844t.m5681b();
                                                        ((p32) o32VarM3844t.f9011k).m3846v(i10);
                                                        p32 p32Var = (p32) o32VarM3844t.m5683d();
                                                        m32VarM4238u.m5681b();
                                                        ((r32) m32VarM4238u.f9011k).m4241w(p32Var);
                                                        if (!gw0.m2161a(str3)) {
                                                            m32VarM4238u.m5681b();
                                                            ((r32) m32VarM4238u.f9011k).m4240v(str3);
                                                        }
                                                        if (z5) {
                                                            String str4 = y62Var.f9193c;
                                                            m32VarM4238u.m5681b();
                                                            ((r32) m32VarM4238u.f9011k).m4242x(str4);
                                                        }
                                                        b42 b42Var = (b42) nb1Var2.get();
                                                        r32 r32Var = (r32) m32VarM4238u.m5683d();
                                                        e22 e22Var = b42Var.f710a;
                                                        m81 m81VarM3350b = m81.m3350b();
                                                        m81VarM3350b.f5010l = new jg0(26, r32Var);
                                                        m81VarM3350b.f5011m = new C0451lz[]{AbstractC0477mo.f5107d};
                                                        m81VarM3350b.f5009k = false;
                                                        c0305iM590b = b42.m590b(e22Var.m2002b(0, m81VarM3350b.m3354a()).m5129e(EnumC0113ct.f1449j, new a81(e22Var, r32Var, 14, z)));
                                                    } else {
                                                        if (gw0.m2161a(str3)) {
                                                            jc0 jc0Var3 = jc0.f3900k;
                                                            return;
                                                        }
                                                        b42 b42Var2 = (b42) nb1Var2.get();
                                                        b42Var2.getClass();
                                                        str3.getClass();
                                                        c0305iM590b = b42.m590b(b42Var2.f710a.m1349c(str3));
                                                    }
                                                    k70.m2990a(c0305iM590b, y32.class, new l62(z3 ? 1 : 0, y62Var), x22Var3.m5498a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.f9198h.m3747t()) {
                                    final int i4 = 2;
                                    x22Var.m5498a().execute(new Runnable(this) { // from class: i62

                                        /* JADX INFO: renamed from: k */
                                        public final /* synthetic */ y62 f3452k;

                                        {
                                            this.f3452k = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i5;
                                            i52 i52Var;
                                            y82 y82Var;
                                            int i6;
                                            o31 o31Var;
                                            ListenableFuture listenableFuture;
                                            C0305i c0305iM590b;
                                            int i7 = i4;
                                            boolean z = false;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            y62 y62Var = this.f3452k;
                                            switch (i7) {
                                                case 0:
                                                    y62Var.m5743b();
                                                    return;
                                                case 1:
                                                    x22 x22Var2 = y62Var.f9192b;
                                                    String str = y62Var.f9193c;
                                                    h92 h92Var = i72.f3457a;
                                                    o31 o31Var2 = o31.f5612t;
                                                    Context context = x22Var2.f8764b;
                                                    Pattern pattern = l82.f4712a;
                                                    C0902y5 c0902y5 = new C0902y5(context);
                                                    c0902y5.m5737t("phenotype");
                                                    c0902y5.m5738u("all_accounts.pb");
                                                    Uri uriM5739v = c0902y5.m5739v();
                                                    if (uriM5739v == null) {
                                                        C0270h1.m2192h("Null uri");
                                                        return;
                                                    }
                                                    i52 i52VarM2530u = i52.m2530u();
                                                    if (i52VarM2530u == null) {
                                                        C0270h1.m2192h("Null schema");
                                                        return;
                                                    }
                                                    h92 h92Var2 = i72.f3457a;
                                                    h92Var2.getClass();
                                                    cx0 cx0Var = new cx0(h92Var2);
                                                    nc0 nc0Var = qc0.f6464k;
                                                    q01 q01Var = q01.f6303n;
                                                    y82 y82Var2 = new y82(uriM5739v, i52VarM2530u, cx0Var, q01Var);
                                                    n71 n71Var = i72.f3459c;
                                                    if (n71Var == null) {
                                                        synchronized (i72.f3458b) {
                                                            try {
                                                                n71Var = i72.f3459c;
                                                                if (n71Var == null) {
                                                                    HashMap map = new HashMap();
                                                                    mq0 mq0VarM5498a = x22Var2.m5498a();
                                                                    g82 g82Var = (g82) x22Var2.f8768f.get();
                                                                    b92 b92Var = b92.f794a;
                                                                    i5 = 1;
                                                                    a90.m121e("singleproc", "There is already a factory registered for the ID %s", !map.containsKey("singleproc"));
                                                                    map.put("singleproc", b92Var);
                                                                    n71 n71Var2 = new n71(mq0VarM5498a, g82Var, map);
                                                                    i72.f3459c = n71Var2;
                                                                    n71Var = n71Var2;
                                                                } else {
                                                                    i5 = 1;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        x22Var2 = x22Var2;
                                                        i5 = 1;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) n71Var.f5319b;
                                                    Pair pair = (Pair) concurrentHashMap.get(uriM5739v);
                                                    if (pair == null) {
                                                        a90.m121e(uriM5739v, "Uri must be hierarchical: %s", uriM5739v.isHierarchical());
                                                        String lastPathSegment = uriM5739v.getLastPathSegment();
                                                        int i8 = gw0.f2952a;
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        a90.m121e(uriM5739v, "Uri extension must be .pb: %s", (iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"));
                                                        b92 b92Var2 = (b92) ((HashMap) n71Var.f5322e).get("singleproc");
                                                        a90.m121e("singleproc", "No XDataStoreVariantFactory registered for ID %s", b92Var2 != null ? i5 : 0);
                                                        String lastPathSegment2 = uriM5739v.getLastPathSegment();
                                                        if (lastPathSegment2 == null) {
                                                            lastPathSegment2 = "";
                                                        }
                                                        int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                        }
                                                        C0934z0 c0934z0M2996g = k70.m2996g(k70.m2993d(uriM5739v), (z32) n71Var.f5321d, EnumC0113ct.f1449j);
                                                        Executor executor = (Executor) n71Var.f5318a;
                                                        g82 g82Var2 = (g82) n71Var.f5320c;
                                                        b92Var2.getClass();
                                                        String str2 = lastPathSegment2;
                                                        i92 i92Var = new i92(i52VarM2530u, so1.m4573a());
                                                        i6 = i5;
                                                        o31Var = o31Var2;
                                                        i52Var = i52VarM2530u;
                                                        a92 a92Var = new a92(new e92(str2, k70.m2993d(uriM5739v), i92Var, executor, g82Var2, cx0Var, new bx1(7)), c0934z0M2996g);
                                                        if (!q01Var.isEmpty()) {
                                                            n72 n72Var = new n72(i6, q01Var, executor);
                                                            synchronized (a92Var.f102g) {
                                                                a92Var.f104i.add(n72Var);
                                                            }
                                                        }
                                                        Pair pairCreate = Pair.create(a92Var, y82Var2);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uriM5739v, pairCreate);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                            y82Var = y82Var2;
                                                        } else {
                                                            y82Var = y82Var2;
                                                            pair = pairCreate;
                                                        }
                                                        break;
                                                    } else {
                                                        i52Var = i52VarM2530u;
                                                        y82Var = y82Var2;
                                                        i6 = i5;
                                                        o31Var = o31Var2;
                                                    }
                                                    a92 a92Var2 = (a92) pair.first;
                                                    y82 y82Var3 = (y82) pair.second;
                                                    if (y82Var.equals(y82Var3)) {
                                                        C0002a1 c0002a1M148a = a92Var2.m148a(new q62(i6, str), x22Var2.m5498a());
                                                        c0002a1M148a.mo995c(new n62(y62Var, c0002a1M148a, 0), x22Var2.m5498a());
                                                        return;
                                                    }
                                                    String strM3651s = o80.m3651s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", i52.class.getSimpleName(), uriM5739v);
                                                    a90.m121e("uri", strM3651s, uriM5739v.equals(y82Var3.f9217a));
                                                    a90.m121e("schema", strM3651s, i52Var.equals(y82Var3.f9218b));
                                                    a90.m121e("handler", strM3651s, cx0Var.equals(y82Var3.f9219c));
                                                    a90.m121e("migrations", strM3651s, q01Var.equals(y82Var3.f9220d));
                                                    Object obj = o31Var;
                                                    a90.m121e("variantConfig", strM3651s, obj.equals(obj));
                                                    C0270h1.m2190f(o80.m3651s(strM3651s, "unknown"));
                                                    return;
                                                case 2:
                                                    p72 p72Var = y62Var.f9192b.f8771i;
                                                    boolean z4 = y62Var.f9195e;
                                                    p62 p62Var = p62.f6001a;
                                                    s72 s72Var = (s72) p72Var.f6009c.get();
                                                    if (s72Var == null && !z4) {
                                                        jc0 jc0Var = jc0.f3900k;
                                                        return;
                                                    }
                                                    if ((p72Var.f6011e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = p72Var.f6012f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i9 = p72Var.f6011e;
                                                                if ((i9 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(p62Var);
                                                                    p72Var.f6011e = i9 | 64;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (p72Var.f6014h == null) {
                                                        synchronized (p72Var.f6013g) {
                                                            try {
                                                                if (p72Var.f6014h == null) {
                                                                    if (s72Var == null) {
                                                                        s72Var = o72.f5648a;
                                                                    }
                                                                    Context context2 = p72Var.f6007a;
                                                                    if (j22.m2791J(context2)) {
                                                                        C0305i c0305iM591a = ((b42) p72Var.f6010d.get()).m591a(new a81(p72Var, s72Var));
                                                                        p72Var.f6014h = c0305iM591a;
                                                                        listenableFuture = c0305iM591a;
                                                                    } else {
                                                                        RunnableC0393ke runnableC0393ke = RunnableC0393ke.f4355l;
                                                                        nb1 nb1Var = p72Var.f6008b;
                                                                        C0934z0 c0934z0M2996g2 = k70.m2996g(j22.m2790I(context2, Executors.callable(runnableC0393ke, null), (Executor) nb1Var.get()), new n72(z2 ? 1 : 0, p72Var, s72Var), (Executor) nb1Var.get());
                                                                        p72Var.f6014h = c0934z0M2996g2;
                                                                        listenableFuture = c0934z0M2996g2;
                                                                    }
                                                                    listenableFuture.mo995c(new cm1(12, listenableFuture), (Executor) p72Var.f6008b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    C0415l c0415lM5742a = y62Var.m5742a();
                                                    String str3 = (String) c0415lM5742a.f4614b;
                                                    x22 x22Var3 = y62Var.f9192b;
                                                    nb1 nb1Var2 = x22Var3.f8766d;
                                                    t72 t72VarM604b = x22Var3.f8769g.m604b();
                                                    boolean z5 = t72VarM604b.f7337i;
                                                    if (t72VarM604b.f7338j) {
                                                        if (gw0.m2161a(str3) && !z5) {
                                                            jc0 jc0Var2 = jc0.f3900k;
                                                            return;
                                                        }
                                                        m32 m32VarM4238u = r32.m4238u();
                                                        vr0 vr0Var = (vr0) c0415lM5742a.f4617e;
                                                        int i10 = vr0Var.f8254a;
                                                        o32 o32VarM3844t = p32.m3844t();
                                                        o32VarM3844t.m5681b();
                                                        ((p32) o32VarM3844t.f9011k).m3845u(i10);
                                                        int i11 = vr0Var.f8255b;
                                                        o32VarM3844t.m5681b();
                                                        ((p32) o32VarM3844t.f9011k).m3846v(i11);
                                                        p32 p32Var = (p32) o32VarM3844t.m5683d();
                                                        m32VarM4238u.m5681b();
                                                        ((r32) m32VarM4238u.f9011k).m4241w(p32Var);
                                                        if (!gw0.m2161a(str3)) {
                                                            m32VarM4238u.m5681b();
                                                            ((r32) m32VarM4238u.f9011k).m4240v(str3);
                                                        }
                                                        if (z5) {
                                                            String str4 = y62Var.f9193c;
                                                            m32VarM4238u.m5681b();
                                                            ((r32) m32VarM4238u.f9011k).m4242x(str4);
                                                        }
                                                        b42 b42Var = (b42) nb1Var2.get();
                                                        r32 r32Var = (r32) m32VarM4238u.m5683d();
                                                        e22 e22Var = b42Var.f710a;
                                                        m81 m81VarM3350b = m81.m3350b();
                                                        m81VarM3350b.f5010l = new jg0(26, r32Var);
                                                        m81VarM3350b.f5011m = new C0451lz[]{AbstractC0477mo.f5107d};
                                                        m81VarM3350b.f5009k = false;
                                                        c0305iM590b = b42.m590b(e22Var.m2002b(0, m81VarM3350b.m3354a()).m5129e(EnumC0113ct.f1449j, new a81(e22Var, r32Var, 14, z)));
                                                    } else {
                                                        if (gw0.m2161a(str3)) {
                                                            jc0 jc0Var3 = jc0.f3900k;
                                                            return;
                                                        }
                                                        b42 b42Var2 = (b42) nb1Var2.get();
                                                        b42Var2.getClass();
                                                        str3.getClass();
                                                        c0305iM590b = b42.m590b(b42Var2.f710a.m1349c(str3));
                                                    }
                                                    k70.m2990a(c0305iM590b, y32.class, new l62(z3 ? 1 : 0, y62Var), x22Var3.m5498a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                c0415l = c0415lM3743p;
                            } else {
                                final int i5 = 0;
                                x22Var.m5498a().execute(new Runnable(this) { // from class: i62

                                    /* JADX INFO: renamed from: k */
                                    public final /* synthetic */ y62 f3452k;

                                    {
                                        this.f3452k = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i6;
                                        i52 i52Var;
                                        y82 y82Var;
                                        int i7;
                                        o31 o31Var;
                                        ListenableFuture listenableFuture;
                                        C0305i c0305iM590b;
                                        int i8 = i5;
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        y62 y62Var = this.f3452k;
                                        switch (i8) {
                                            case 0:
                                                y62Var.m5743b();
                                                return;
                                            case 1:
                                                x22 x22Var2 = y62Var.f9192b;
                                                String str = y62Var.f9193c;
                                                h92 h92Var = i72.f3457a;
                                                o31 o31Var2 = o31.f5612t;
                                                Context context = x22Var2.f8764b;
                                                Pattern pattern = l82.f4712a;
                                                C0902y5 c0902y5 = new C0902y5(context);
                                                c0902y5.m5737t("phenotype");
                                                c0902y5.m5738u("all_accounts.pb");
                                                Uri uriM5739v = c0902y5.m5739v();
                                                if (uriM5739v == null) {
                                                    C0270h1.m2192h("Null uri");
                                                    return;
                                                }
                                                i52 i52VarM2530u = i52.m2530u();
                                                if (i52VarM2530u == null) {
                                                    C0270h1.m2192h("Null schema");
                                                    return;
                                                }
                                                h92 h92Var2 = i72.f3457a;
                                                h92Var2.getClass();
                                                cx0 cx0Var = new cx0(h92Var2);
                                                nc0 nc0Var = qc0.f6464k;
                                                q01 q01Var = q01.f6303n;
                                                y82 y82Var2 = new y82(uriM5739v, i52VarM2530u, cx0Var, q01Var);
                                                n71 n71Var = i72.f3459c;
                                                if (n71Var == null) {
                                                    synchronized (i72.f3458b) {
                                                        try {
                                                            n71Var = i72.f3459c;
                                                            if (n71Var == null) {
                                                                HashMap map = new HashMap();
                                                                mq0 mq0VarM5498a = x22Var2.m5498a();
                                                                g82 g82Var = (g82) x22Var2.f8768f.get();
                                                                b92 b92Var = b92.f794a;
                                                                i6 = 1;
                                                                a90.m121e("singleproc", "There is already a factory registered for the ID %s", !map.containsKey("singleproc"));
                                                                map.put("singleproc", b92Var);
                                                                n71 n71Var2 = new n71(mq0VarM5498a, g82Var, map);
                                                                i72.f3459c = n71Var2;
                                                                n71Var = n71Var2;
                                                            } else {
                                                                i6 = 1;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    x22Var2 = x22Var2;
                                                    i6 = 1;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) n71Var.f5319b;
                                                Pair pair = (Pair) concurrentHashMap.get(uriM5739v);
                                                if (pair == null) {
                                                    a90.m121e(uriM5739v, "Uri must be hierarchical: %s", uriM5739v.isHierarchical());
                                                    String lastPathSegment = uriM5739v.getLastPathSegment();
                                                    int i9 = gw0.f2952a;
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    a90.m121e(uriM5739v, "Uri extension must be .pb: %s", (iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"));
                                                    b92 b92Var2 = (b92) ((HashMap) n71Var.f5322e).get("singleproc");
                                                    a90.m121e("singleproc", "No XDataStoreVariantFactory registered for ID %s", b92Var2 != null ? i6 : 0);
                                                    String lastPathSegment2 = uriM5739v.getLastPathSegment();
                                                    if (lastPathSegment2 == null) {
                                                        lastPathSegment2 = "";
                                                    }
                                                    int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                    }
                                                    C0934z0 c0934z0M2996g = k70.m2996g(k70.m2993d(uriM5739v), (z32) n71Var.f5321d, EnumC0113ct.f1449j);
                                                    Executor executor = (Executor) n71Var.f5318a;
                                                    g82 g82Var2 = (g82) n71Var.f5320c;
                                                    b92Var2.getClass();
                                                    String str2 = lastPathSegment2;
                                                    i92 i92Var = new i92(i52VarM2530u, so1.m4573a());
                                                    i7 = i6;
                                                    o31Var = o31Var2;
                                                    i52Var = i52VarM2530u;
                                                    a92 a92Var = new a92(new e92(str2, k70.m2993d(uriM5739v), i92Var, executor, g82Var2, cx0Var, new bx1(7)), c0934z0M2996g);
                                                    if (!q01Var.isEmpty()) {
                                                        n72 n72Var = new n72(i7, q01Var, executor);
                                                        synchronized (a92Var.f102g) {
                                                            a92Var.f104i.add(n72Var);
                                                        }
                                                    }
                                                    Pair pairCreate = Pair.create(a92Var, y82Var2);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uriM5739v, pairCreate);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                        y82Var = y82Var2;
                                                    } else {
                                                        y82Var = y82Var2;
                                                        pair = pairCreate;
                                                    }
                                                    break;
                                                } else {
                                                    i52Var = i52VarM2530u;
                                                    y82Var = y82Var2;
                                                    i7 = i6;
                                                    o31Var = o31Var2;
                                                }
                                                a92 a92Var2 = (a92) pair.first;
                                                y82 y82Var3 = (y82) pair.second;
                                                if (y82Var.equals(y82Var3)) {
                                                    C0002a1 c0002a1M148a = a92Var2.m148a(new q62(i7, str), x22Var2.m5498a());
                                                    c0002a1M148a.mo995c(new n62(y62Var, c0002a1M148a, 0), x22Var2.m5498a());
                                                    return;
                                                }
                                                String strM3651s = o80.m3651s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", i52.class.getSimpleName(), uriM5739v);
                                                a90.m121e("uri", strM3651s, uriM5739v.equals(y82Var3.f9217a));
                                                a90.m121e("schema", strM3651s, i52Var.equals(y82Var3.f9218b));
                                                a90.m121e("handler", strM3651s, cx0Var.equals(y82Var3.f9219c));
                                                a90.m121e("migrations", strM3651s, q01Var.equals(y82Var3.f9220d));
                                                Object obj = o31Var;
                                                a90.m121e("variantConfig", strM3651s, obj.equals(obj));
                                                C0270h1.m2190f(o80.m3651s(strM3651s, "unknown"));
                                                return;
                                            case 2:
                                                p72 p72Var = y62Var.f9192b.f8771i;
                                                boolean z4 = y62Var.f9195e;
                                                p62 p62Var = p62.f6001a;
                                                s72 s72Var = (s72) p72Var.f6009c.get();
                                                if (s72Var == null && !z4) {
                                                    jc0 jc0Var = jc0.f3900k;
                                                    return;
                                                }
                                                if ((p72Var.f6011e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = p72Var.f6012f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i10 = p72Var.f6011e;
                                                            if ((i10 & 64) == 0) {
                                                                copyOnWriteArrayList.add(p62Var);
                                                                p72Var.f6011e = i10 | 64;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (p72Var.f6014h == null) {
                                                    synchronized (p72Var.f6013g) {
                                                        try {
                                                            if (p72Var.f6014h == null) {
                                                                if (s72Var == null) {
                                                                    s72Var = o72.f5648a;
                                                                }
                                                                Context context2 = p72Var.f6007a;
                                                                if (j22.m2791J(context2)) {
                                                                    C0305i c0305iM591a = ((b42) p72Var.f6010d.get()).m591a(new a81(p72Var, s72Var));
                                                                    p72Var.f6014h = c0305iM591a;
                                                                    listenableFuture = c0305iM591a;
                                                                } else {
                                                                    RunnableC0393ke runnableC0393ke = RunnableC0393ke.f4355l;
                                                                    nb1 nb1Var = p72Var.f6008b;
                                                                    C0934z0 c0934z0M2996g2 = k70.m2996g(j22.m2790I(context2, Executors.callable(runnableC0393ke, null), (Executor) nb1Var.get()), new n72(z2 ? 1 : 0, p72Var, s72Var), (Executor) nb1Var.get());
                                                                    p72Var.f6014h = c0934z0M2996g2;
                                                                    listenableFuture = c0934z0M2996g2;
                                                                }
                                                                listenableFuture.mo995c(new cm1(12, listenableFuture), (Executor) p72Var.f6008b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                C0415l c0415lM5742a = y62Var.m5742a();
                                                String str3 = (String) c0415lM5742a.f4614b;
                                                x22 x22Var3 = y62Var.f9192b;
                                                nb1 nb1Var2 = x22Var3.f8766d;
                                                t72 t72VarM604b = x22Var3.f8769g.m604b();
                                                boolean z5 = t72VarM604b.f7337i;
                                                if (t72VarM604b.f7338j) {
                                                    if (gw0.m2161a(str3) && !z5) {
                                                        jc0 jc0Var2 = jc0.f3900k;
                                                        return;
                                                    }
                                                    m32 m32VarM4238u = r32.m4238u();
                                                    vr0 vr0Var = (vr0) c0415lM5742a.f4617e;
                                                    int i11 = vr0Var.f8254a;
                                                    o32 o32VarM3844t = p32.m3844t();
                                                    o32VarM3844t.m5681b();
                                                    ((p32) o32VarM3844t.f9011k).m3845u(i11);
                                                    int i12 = vr0Var.f8255b;
                                                    o32VarM3844t.m5681b();
                                                    ((p32) o32VarM3844t.f9011k).m3846v(i12);
                                                    p32 p32Var = (p32) o32VarM3844t.m5683d();
                                                    m32VarM4238u.m5681b();
                                                    ((r32) m32VarM4238u.f9011k).m4241w(p32Var);
                                                    if (!gw0.m2161a(str3)) {
                                                        m32VarM4238u.m5681b();
                                                        ((r32) m32VarM4238u.f9011k).m4240v(str3);
                                                    }
                                                    if (z5) {
                                                        String str4 = y62Var.f9193c;
                                                        m32VarM4238u.m5681b();
                                                        ((r32) m32VarM4238u.f9011k).m4242x(str4);
                                                    }
                                                    b42 b42Var = (b42) nb1Var2.get();
                                                    r32 r32Var = (r32) m32VarM4238u.m5683d();
                                                    e22 e22Var = b42Var.f710a;
                                                    m81 m81VarM3350b = m81.m3350b();
                                                    m81VarM3350b.f5010l = new jg0(26, r32Var);
                                                    m81VarM3350b.f5011m = new C0451lz[]{AbstractC0477mo.f5107d};
                                                    m81VarM3350b.f5009k = false;
                                                    c0305iM590b = b42.m590b(e22Var.m2002b(0, m81VarM3350b.m3354a()).m5129e(EnumC0113ct.f1449j, new a81(e22Var, r32Var, 14, z)));
                                                } else {
                                                    if (gw0.m2161a(str3)) {
                                                        jc0 jc0Var3 = jc0.f3900k;
                                                        return;
                                                    }
                                                    b42 b42Var2 = (b42) nb1Var2.get();
                                                    b42Var2.getClass();
                                                    str3.getClass();
                                                    c0305iM590b = b42.m590b(b42Var2.f710a.m1349c(str3));
                                                }
                                                k70.m2990a(c0305iM590b, y32.class, new l62(z3 ? 1 : 0, y62Var), x22Var3.m5498a());
                                                return;
                                        }
                                    }
                                });
                                c0415l = new C0415l(v72.m5112A(), (vr0) c0415lM3743p.f4617e);
                            }
                        }
                        if (!this.f9195e || ((vr0) c0415l.f4617e).f8255b != 17) {
                            this.f9191a = c0415l;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0415l;
    }

    /* JADX INFO: renamed from: b */
    public final void m5743b() {
        oq0 oq0Var = this.f9198h;
        x22 x22Var = (x22) oq0Var.f5841l;
        b42 b42Var = (b42) x22Var.f8766d.get();
        String str = (String) oq0Var.f5840k;
        b42Var.getClass();
        str.getClass();
        e22 e22Var = b42Var.f710a;
        m81 m81VarM3350b = m81.m3350b();
        m81VarM3350b.f5010l = new C0059be(str, 2);
        C0002a1 c0002a1M2995f = k70.m2995f(b42.m590b(e22Var.m2002b(0, m81VarM3350b.m3354a()).m5128d(EnumC0113ct.f1449j, new dx1(5))), yq1.f9434m, x22Var.m5498a());
        int i = 1;
        l62 l62Var = new l62(i, oq0Var);
        x22 x22Var2 = this.f9192b;
        k70.m2996g(c0002a1M2995f, l62Var, x22Var2.m5498a()).mo995c(new n62(this, c0002a1M2995f, i), x22Var2.m5498a());
    }
}
