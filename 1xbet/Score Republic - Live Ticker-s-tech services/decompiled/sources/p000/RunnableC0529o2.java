package p000;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: o2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0529o2 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5576j;

    /* JADX INFO: renamed from: k */
    public Object f5577k;

    /* JADX INFO: renamed from: l */
    public final Object f5578l;

    public RunnableC0529o2(C0409ku c0409ku, wo1 wo1Var) {
        this.f5576j = 15;
        this.f5578l = c0409ku;
        a90.m127k(wo1Var, "savedListener");
        this.f5577k = wo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:4:0x000b, B:25:0x009e, B:7:0x001c, B:9:0x003c, B:11:0x0048, B:16:0x0056, B:20:0x006d, B:24:0x0091, B:23:0x007c), top: B:35:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:4:0x000b, B:25:0x009e, B:7:0x001c, B:9:0x003c, B:11:0x0048, B:16:0x0056, B:20:0x006d, B:24:0x0091, B:23:0x007c), top: B:35:0x000b }] */
    /* JADX INFO: renamed from: a */
    private final void m3624a() {
        boolean z;
        boolean z2;
        m81 m81Var;
        e31 e31Var;
        synchronized (((zk0) ((RunnableC0529o2) this.f5578l).f5578l).f9840r) {
            try {
                RunnableC0529o2 runnableC0529o2 = (RunnableC0529o2) this.f5578l;
                z = true;
                z2 = false;
                m81Var = null;
                if (!((m81) runnableC0529o2.f5577k).f5009k) {
                    zk0 zk0Var = (zk0) runnableC0529o2.f5578l;
                    zk0Var.f9846x = zk0Var.f9846x.m1355a((i31) this.f5577k);
                    zk0 zk0Var2 = (zk0) ((RunnableC0529o2) this.f5578l).f5578l;
                    if (zk0Var2.m5931j(zk0Var2.f9846x)) {
                        j31 j31Var = ((zk0) ((RunnableC0529o2) this.f5578l).f5578l).f9844v;
                        if (j31Var != null) {
                            if (j31Var.f3810d.get() <= j31Var.f3808b) {
                                z = false;
                            }
                            if (!z) {
                                zk0 zk0Var3 = (zk0) ((RunnableC0529o2) this.f5578l).f5578l;
                                e31Var = zk0Var3.f9846x;
                                if (e31Var.f1938h) {
                                    e31Var = new e31(e31Var.f1932b, e31Var.f1933c, e31Var.f1934d, e31Var.f1936f, e31Var.f1937g, e31Var.f1931a, true, e31Var.f1935e);
                                }
                                zk0Var3.f9846x = e31Var;
                                ((zk0) ((RunnableC0529o2) this.f5578l).f5578l).f9824F = null;
                            }
                        }
                        zk0 zk0Var4 = (zk0) ((RunnableC0529o2) this.f5578l).f5578l;
                        m81Var = new m81(zk0Var4.f9840r);
                        zk0Var4.f9824F = m81Var;
                    } else {
                        zk0 zk0Var5 = (zk0) ((RunnableC0529o2) this.f5578l).f5578l;
                        e31Var = zk0Var5.f9846x;
                        if (e31Var.f1938h) {
                            e31Var = new e31(e31Var.f1932b, e31Var.f1933c, e31Var.f1934d, e31Var.f1936f, e31Var.f1937g, e31Var.f1931a, true, e31Var.f1935e);
                        }
                        zk0Var5.f9846x = e31Var;
                        ((zk0) ((RunnableC0529o2) this.f5578l).f5578l).f9824F = null;
                    }
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            i31 i31Var = (i31) this.f5577k;
            i31Var.f3418a.mo1326n(new f50((zk0) ((RunnableC0529o2) this.f5578l).f5578l, i31Var, 27, z2));
            ((i31) this.f5577k).f3418a.mo1604G(ja1.f3876f.m2840h("Unneeded hedging"));
        } else {
            if (m81Var != null) {
                zk0 zk0Var6 = (zk0) ((RunnableC0529o2) this.f5578l).f5578l;
                m81Var.m3360i(zk0Var6.f9835m.schedule(new RunnableC0529o2(29, zk0Var6, m81Var), zk0Var6.f9838p.f2052b, TimeUnit.NANOSECONDS));
            }
            ((zk0) ((RunnableC0529o2) this.f5578l).f5578l).m5929g((i31) this.f5577k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        mn0 mn0Var;
        RunnableC0372ju runnableC0372ju;
        dr0 dr0Var;
        List listSingletonList;
        Throwable thM2180o;
        te0 te0Var;
        ja1 ja1VarMo1387a;
        Object obj;
        int i = 11;
        int i2 = 2;
        qd0 qd0Var = null;
        qd0Var = null;
        qd0 qd0Var2 = null;
        int i3 = 0;
        switch (this.f5576j) {
            case 0:
                C0455m2 c0455m2 = (C0455m2) this.f5577k;
                C0603q2 c0603q2 = (C0603q2) this.f5578l;
                on0 on0Var = c0603q2.f6326l;
                if (on0Var != null && (mn0Var = on0Var.f5803n) != null) {
                    mn0Var.mo313i(on0Var);
                }
                View view = (View) c0603q2.f6331q;
                if (view != null && view.getWindowToken() != null) {
                    if (c0455m2.m5814b()) {
                        c0603q2.f6319B = c0455m2;
                    } else if (c0455m2.f9400e != null) {
                        c0455m2.m5815d(0, 0, false, false);
                        c0603q2.f6319B = c0455m2;
                    }
                }
                c0603q2.f6321D = null;
                return;
            case 1:
                ((C0940z6) ((an0) this.f5577k).f254k).m5864b((Typeface) this.f5578l);
                return;
            case 2:
                ((fl0) this.f5578l).m1877r(ja1.f3878h.m2840h(((StringBuilder) this.f5577k).toString()), true);
                return;
            case 3:
                xe1 xe1Var = ((fl0) this.f5578l).f2437j;
                ja1 ja1Var = (ja1) this.f5577k;
                xe1Var.mo272b(ja1Var.f3887b, ja1Var.f3888c);
                return;
            case 4:
                ((fl0) this.f5578l).f2437j.mo662n((C0525nz) this.f5577k);
                return;
            case 5:
                ((C0850wr) this.f5578l).f8645e.mo1122k((np0) this.f5577k);
                return;
            case 6:
                ((C0850wr) this.f5578l).f8645e.mo1124m(this.f5577k);
                return;
            case 7:
                a90.m132p("Channel must have been shut down", ((jl0) ((C0961zr) this.f5578l).f9919h.f5551k).f3978G.get());
                return;
            case 8:
                ((C0924yr) this.f5578l).f9439l.mo1624c((InterfaceC0951zh) this.f5577k);
                return;
            case 9:
                ((C0924yr) this.f5578l).f9439l.mo1626h((C0258gq) this.f5577k);
                return;
            case 10:
                ((C0924yr) this.f5578l).f9439l.mo1636u((C0885xp) this.f5577k);
                return;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                ((C0924yr) this.f5578l).f9439l.mo1638w((xx0) this.f5577k);
                return;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                ((C0924yr) this.f5578l).f9439l.mo1604G((ja1) this.f5577k);
                return;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                ((C0112cs) this.f5578l).f1443j.mo1036i((an0) this.f5577k);
                return;
            case 14:
                ((C0112cs) this.f5578l).f1443j.mo1034f((np0) this.f5577k);
                return;
            case 15:
                wo1 wo1Var = (wo1) this.f5577k;
                C0409ku c0409ku = (C0409ku) this.f5578l;
                String str = c0409ku.f4567l;
                gc1 gc1Var = c0409ku.f4571p;
                Logger logger = C0409ku.f4562z;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.finer("Attempting DNS resolution of " + str);
                }
                try {
                    try {
                        rb0 rb0VarM4608a = c0409ku.f4563h.m4608a(InetSocketAddress.createUnresolved(str, c0409ku.f4568m));
                        C0190ex c0190ex = rb0VarM4608a != null ? new C0190ex(rb0VarM4608a) : null;
                        List list = Collections.EMPTY_LIST;
                        C0831w8 c0831w8 = C0831w8.f8454b;
                        if (c0190ex == null) {
                            qd0 qd0VarM3094q = c0409ku.m3094q();
                            try {
                                ja1 ja1Var2 = (ja1) qd0VarM3094q.f6471k;
                                if (ja1Var2 != null) {
                                    wo1Var.mo1230q(ja1Var2);
                                    runnableC0372ju = new RunnableC0372ju(i3, this, ((ja1) qd0VarM3094q.f6471k) == null);
                                } else {
                                    List list2 = (List) qd0VarM3094q.f6472l;
                                    if (list2 != null) {
                                        list = list2;
                                    }
                                    dr0 dr0Var2 = (dr0) qd0VarM3094q.f6473m;
                                    dr0Var = dr0Var2 != null ? dr0Var2 : null;
                                    qd0Var = qd0VarM3094q;
                                    listSingletonList = list;
                                }
                            } catch (IOException e) {
                                e = e;
                                qd0Var = qd0VarM3094q;
                                wo1Var.mo1230q(ja1.f3883m.m2840h("Unable to resolve host " + str).m2839g(e));
                                runnableC0372ju = new RunnableC0372ju(i3, this, qd0Var != null && ((ja1) qd0Var.f6471k) == null);
                            } catch (Throwable th) {
                                th = th;
                                qd0Var2 = qd0VarM3094q;
                                gc1Var.execute(new RunnableC0372ju(i3, this, qd0Var2 != null && ((ja1) qd0Var2.f6471k) == null));
                                throw th;
                            }
                            gc1Var.execute(runnableC0372ju);
                            return;
                        }
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + c0190ex);
                        }
                        listSingletonList = Collections.singletonList(c0190ex);
                        dr0Var = null;
                        wo1Var.mo1231r(new er0(listSingletonList, c0831w8, dr0Var));
                        runnableC0372ju = new RunnableC0372ju(i3, this, qd0Var != null && ((ja1) qd0Var.f6471k) == null);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                gc1Var.execute(runnableC0372ju);
                return;
            case 16:
                a81 a81Var = (a81) this.f5578l;
                ListenableFuture listenableFuture = (ListenableFuture) this.f5577k;
                if ((listenableFuture instanceof AbstractC0269h0) && (thM2180o = ((AbstractC0269h0) listenableFuture).m2180o()) != null) {
                    a81Var.m87k(thM2180o);
                    return;
                }
                try {
                    k70.m2991b(listenableFuture);
                    v22 v22Var = (v22) a81Var.f64l;
                    v22Var.mo11z();
                    f02 f02Var = (f02) v22Var.f7192j;
                    fz1 fz1Var = f02Var.f2246n;
                    f02.m1558k(fz1Var);
                    SparseArray sparseArrayM1910G = fz1Var.m1910G();
                    y52 y52Var = (y52) a81Var.f63k;
                    sparseArrayM1910G.put(y52Var.f9178l, Long.valueOf(y52Var.f9177k));
                    fz1 fz1Var2 = f02Var.f2246n;
                    f02.m1558k(fz1Var2);
                    int[] iArr = new int[sparseArrayM1910G.size()];
                    long[] jArr = new long[sparseArrayM1910G.size()];
                    for (int i4 = 0; i4 < sparseArrayM1910G.size(); i4++) {
                        iArr[i4] = sparseArrayM1910G.keyAt(i4);
                        jArr[i4] = ((Long) sparseArrayM1910G.valueAt(i4)).longValue();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putIntArray("uriSources", iArr);
                    bundle.putLongArray("uriTimestamps", jArr);
                    fz1Var2.f2560w.m1649B(bundle);
                    v22Var.f8016r = false;
                    v22Var.f8017s = 1;
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4607v.m5313b(y52Var.f9176j, "Successfully registered trigger URI");
                    v22Var.m5044Z();
                    return;
                } catch (Error | RuntimeException e3) {
                    a81Var.m87k(e3);
                    return;
                } catch (ExecutionException e4) {
                    a81Var.m87k(e4.getCause());
                    return;
                }
            case 17:
                v80 v80Var = (v80) this.f5578l;
                if (v80Var.f8131m) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f5577k).run();
                    return;
                } catch (Throwable th3) {
                    v80Var.f8130l.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th3);
                        return;
                    }
                    return;
                }
            case 18:
                ue0 ue0Var = ((xe0) this.f5578l).f8922l;
                SocketAddress socketAddress = (SocketAddress) ((C0190ex) ue0Var.f7802a.get(ue0Var.f7803b)).f2195a.get(ue0Var.f7804c);
                ue0 ue0Var2 = ((xe0) this.f5578l).f8922l;
                ue0Var2.f7802a = (List) this.f5577k;
                ue0Var2.m4912d();
                ((xe0) this.f5578l).f8923m = (List) this.f5577k;
                EnumC0474ml enumC0474ml = ((xe0) this.f5578l).f8933w.f5453a;
                EnumC0474ml enumC0474ml2 = EnumC0474ml.f5072k;
                if (enumC0474ml == enumC0474ml2 || ((xe0) this.f5578l).f8933w.f5453a == EnumC0474ml.f5071j) {
                    ue0 ue0Var3 = ((xe0) this.f5578l).f8922l;
                    while (true) {
                        if (i3 < ue0Var3.f7802a.size()) {
                            int iIndexOf = ((C0190ex) ue0Var3.f7802a.get(i3)).f2195a.indexOf(socketAddress);
                            if (iIndexOf == -1) {
                                i3++;
                            } else {
                                ue0Var3.f7803b = i3;
                                ue0Var3.f7804c = iIndexOf;
                            }
                        } else {
                            EnumC0474ml enumC0474ml3 = ((xe0) this.f5578l).f8933w.f5453a;
                            xe0 xe0Var = (xe0) this.f5578l;
                            if (enumC0474ml3 == enumC0474ml2) {
                                te0Var = xe0Var.f8932v;
                                ((xe0) this.f5578l).f8932v = null;
                                ((xe0) this.f5578l).f8922l.m4912d();
                                xe0.m5630e((xe0) this.f5578l, EnumC0474ml.f5074m);
                            } else {
                                xe0Var.f8931u.mo3771a(ja1.f3883m.m2840h("InternalSubchannel closed pending transport due to address change"));
                                xe0 xe0Var2 = (xe0) this.f5578l;
                                xe0Var2.f8931u = null;
                                xe0Var2.f8922l.m4912d();
                                xe0.m5631f((xe0) this.f5578l);
                            }
                        }
                        te0Var = null;
                    }
                } else {
                    te0Var = null;
                }
                if (te0Var != null) {
                    xe0 xe0Var3 = (xe0) this.f5578l;
                    if (xe0Var3.f8927q != null) {
                        xe0Var3.f8928r.mo3771a(ja1.f3883m.m2840h("InternalSubchannel closed transport early due to address change"));
                        ((xe0) this.f5578l).f8927q.m80d();
                        xe0 xe0Var4 = (xe0) this.f5578l;
                        xe0Var4.f8927q = null;
                        xe0Var4.f8928r = null;
                    }
                    xe0 xe0Var5 = (xe0) this.f5578l;
                    xe0Var5.f8928r = te0Var;
                    xe0Var5.f8927q = xe0Var5.f8921k.m2027c(new RunnableC0897y0(i, this), 5L, TimeUnit.SECONDS, xe0Var5.f8916f);
                    return;
                }
                return;
            case 19:
                EnumC0474ml enumC0474ml4 = ((xe0) this.f5578l).f8933w.f5453a;
                EnumC0474ml enumC0474ml5 = EnumC0474ml.f5075n;
                if (enumC0474ml4 == enumC0474ml5) {
                    return;
                }
                xe0 xe0Var6 = (xe0) this.f5578l;
                xe0Var6.f8934x = (ja1) this.f5577k;
                te0 te0Var2 = xe0Var6.f8932v;
                xe0 xe0Var7 = (xe0) this.f5578l;
                te0 te0Var3 = xe0Var7.f8931u;
                xe0Var7.f8932v = null;
                xe0 xe0Var8 = (xe0) this.f5578l;
                xe0Var8.f8931u = null;
                xe0.m5630e(xe0Var8, enumC0474ml5);
                ((xe0) this.f5578l).f8922l.m4912d();
                if (((xe0) this.f5578l).f8929s.isEmpty()) {
                    xe0 xe0Var9 = (xe0) this.f5578l;
                    xe0Var9.f8921k.execute(new re0(xe0Var9, i2));
                }
                xe0 xe0Var10 = (xe0) this.f5578l;
                xe0Var10.f8921k.m2028d();
                a81 a81Var2 = xe0Var10.f8926p;
                if (a81Var2 != null) {
                    a81Var2.m80d();
                    xe0Var10.f8926p = null;
                    xe0Var10.f8924n = null;
                }
                a81 a81Var3 = ((xe0) this.f5578l).f8927q;
                if (a81Var3 != null) {
                    a81Var3.m80d();
                    ((xe0) this.f5578l).f8928r.mo3771a((ja1) this.f5577k);
                    xe0 xe0Var11 = (xe0) this.f5578l;
                    xe0Var11.f8927q = null;
                    xe0Var11.f8928r = null;
                }
                if (te0Var2 != null) {
                    te0Var2.mo3771a((ja1) this.f5577k);
                }
                if (te0Var3 != null) {
                    te0Var3.mo3771a((ja1) this.f5577k);
                    return;
                }
                return;
            case 20:
                if (((xe0) ((m81) this.f5578l).f5011m).f8933w.f5453a == EnumC0474ml.f5075n) {
                    return;
                }
                te0 te0Var4 = ((xe0) ((m81) this.f5578l).f5011m).f8932v;
                m81 m81Var = (m81) this.f5578l;
                te0 te0Var5 = (te0) m81Var.f5010l;
                xe0 xe0Var12 = (xe0) m81Var.f5011m;
                if (te0Var4 == te0Var5) {
                    xe0Var12.f8932v = null;
                    ((xe0) ((m81) this.f5578l).f5011m).f8922l.m4912d();
                    xe0.m5630e((xe0) ((m81) this.f5578l).f5011m, EnumC0474ml.f5074m);
                    return;
                }
                if (xe0Var12.f8931u == te0Var5) {
                    a90.m131o(((xe0) ((m81) this.f5578l).f5011m).f8933w.f5453a, "Expected state is CONNECTING, actual state is %s", xe0Var12.f8933w.f5453a == EnumC0474ml.f5071j);
                    ue0 ue0Var4 = ((xe0) ((m81) this.f5578l).f5011m).f8922l;
                    C0190ex c0190ex2 = (C0190ex) ue0Var4.f7802a.get(ue0Var4.f7803b);
                    int i5 = ue0Var4.f7804c + 1;
                    ue0Var4.f7804c = i5;
                    if (i5 >= c0190ex2.f2195a.size()) {
                        ue0Var4.f7803b++;
                        ue0Var4.f7804c = 0;
                    }
                    ue0 ue0Var5 = ((xe0) ((m81) this.f5578l).f5011m).f8922l;
                    int i6 = ue0Var5.f7803b;
                    int size = ue0Var5.f7802a.size();
                    xe0 xe0Var13 = (xe0) ((m81) this.f5578l).f5011m;
                    if (i6 < size) {
                        xe0.m5631f(xe0Var13);
                        return;
                    }
                    xe0Var13.f8931u = null;
                    xe0Var13.f8922l.m4912d();
                    xe0 xe0Var14 = (xe0) ((m81) this.f5578l).f5011m;
                    ja1 ja1Var3 = (ja1) this.f5577k;
                    xe0Var14.f8921k.m2028d();
                    a90.m122f("The error status must not be OK", !ja1Var3.m2838f());
                    xe0Var14.m5633g(new C0511nl(EnumC0474ml.f5073l, ja1Var3));
                    if (xe0Var14.f8924n == null) {
                        xe0Var14.f8913c.getClass();
                        xe0Var14.f8924n = o31.m3627m();
                    }
                    long jM4006a = xe0Var14.f8924n.m4006a() - xe0Var14.f8925o.m3509a();
                    xe0Var14.f8919i.mo5320h(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", xe0.m5632h(ja1Var3), Long.valueOf(jM4006a));
                    a90.m132p("previous reconnectTask is not done", xe0Var14.f8926p == null);
                    xe0Var14.f8926p = xe0Var14.f8921k.m2027c(new re0(xe0Var14, i3), jM4006a, TimeUnit.NANOSECONDS, xe0Var14.f8916f);
                    return;
                }
                return;
            case 21:
                di0 di0Var = (di0) this.f5578l;
                AbstractC0292hn abstractC0292hn = di0Var.f1662l;
                while (true) {
                    try {
                        ((Runnable) this.f5577k).run();
                    } catch (Throwable th4) {
                        AbstractC0959zp.m5980i(C0301hw.f3348j, th4);
                    }
                    Runnable runnableM1226r = di0Var.m1226r();
                    if (runnableM1226r == null) {
                        return;
                    }
                    this.f5577k = runnableM1226r;
                    i3++;
                    if (i3 >= 16 && abstractC0292hn.mo2243p(di0Var)) {
                        abstractC0292hn.mo1225o(di0Var, this);
                        return;
                    }
                    break;
                }
                break;
            case 22:
                dl0 dl0Var = (dl0) this.f5578l;
                ja1 ja1Var4 = (ja1) this.f5577k;
                Logger logger2 = jl0.f3965c0;
                Level level2 = Level.WARNING;
                jl0 jl0Var = dl0Var.f1679f;
                logger2.log(level2, "[{0}] Failed to resolve name. status={1}", new Object[]{jl0Var.f3998a, ja1Var4});
                gl0 gl0Var = jl0Var.f3987P;
                if (gl0Var.f2800a.get() == jl0.f3970h0) {
                    gl0Var.m2122h(null);
                }
                if (jl0Var.f4001b0 != 3) {
                    jl0Var.f3985N.mo5320h(3, "Failed to resolve name: {0}", ja1Var4);
                    jl0Var.f4001b0 = 3;
                }
                cl0 cl0Var = dl0Var.f1677d;
                if (cl0Var != jl0Var.f4023x) {
                    return;
                }
                ((mj0) cl0Var.f1285h.f2335l).mo1388c(ja1Var4);
                return;
            case 23:
                C0794v8 c0794v8 = ke0.f4358a;
                dl0 dl0Var2 = (dl0) this.f5578l;
                jl0 jl0Var2 = dl0Var2.f1679f;
                if (jl0Var2.f4021v != dl0Var2.f1678e) {
                    return;
                }
                er0 er0Var = (er0) this.f5577k;
                List list3 = er0Var.f2169a;
                jl0Var2.f3985N.mo5320h(1, "Resolved address: {0}, config={1}", list3, er0Var.f2170b);
                jl0 jl0Var3 = ((dl0) this.f5578l).f1679f;
                if (jl0Var3.f4001b0 != 2) {
                    jl0Var3.f3985N.mo5320h(2, "Address resolved: {0}", list3);
                    ((dl0) this.f5578l).f1679f.f4001b0 = 2;
                }
                er0 er0Var2 = (er0) this.f5577k;
                dr0 dr0Var3 = er0Var2.f2171c;
                l31 l31Var = (l31) er0Var2.f2170b.f8455a.get(n31.f5278k);
                ke0 ke0Var = (ke0) ((er0) this.f5577k).f2170b.f8455a.get(c0794v8);
                sl0 sl0Var = (dr0Var3 == null || (obj = dr0Var3.f1803b) == null) ? null : (sl0) obj;
                ja1 ja1Var5 = dr0Var3 != null ? dr0Var3.f1802a : null;
                jl0 jl0Var4 = ((dl0) this.f5578l).f1679f;
                int i7 = 24;
                if (jl0Var4.f3990S) {
                    if (sl0Var != null) {
                        gl0 gl0Var2 = jl0Var4.f3987P;
                        if (ke0Var != null) {
                            gl0Var2.m2122h(ke0Var);
                            if (sl0Var.m4535b() != null) {
                                ((dl0) this.f5578l).f1679f.f3985N.mo5321i("Method configs in service config will be discarded due to presence ofconfig-selector", 1);
                            }
                        } else {
                            gl0Var2.m2122h(sl0Var.m4535b());
                        }
                    } else if (ja1Var5 == null) {
                        sl0Var = jl0.f3969g0;
                        jl0Var4.f3987P.m2122h(null);
                    } else {
                        if (!jl0Var4.f3989R) {
                            jl0Var4.f3985N.mo5321i("Fallback to error due to invalid first service config without default config", 2);
                            ((dl0) this.f5578l).mo1230q(dr0Var3.f1802a);
                            if (l31Var != null) {
                                boolean zM2838f = dr0Var3.f1802a.m2838f();
                                n31 n31Var = l31Var.f4657a;
                                C0012ab c0012ab = n31Var.f5280i;
                                if (!zM2838f) {
                                    c0012ab.m169a(new RunnableC0897y0(i7, n31Var));
                                    return;
                                }
                                gc1 gc1Var2 = c0012ab.f123b;
                                gc1Var2.m2028d();
                                gc1Var2.execute(new RunnableC0944za(i3, c0012ab));
                                return;
                            }
                            return;
                        }
                        sl0Var = jl0Var4.f3988Q;
                    }
                    if (!sl0Var.equals(((dl0) this.f5578l).f1679f.f3988Q)) {
                        ((dl0) this.f5578l).f1679f.f3985N.mo5320h(2, "Service config changed{0}", sl0Var == jl0.f3969g0 ? " to empty" : "");
                        jl0 jl0Var5 = ((dl0) this.f5578l).f1679f;
                        jl0Var5.f3988Q = sl0Var;
                        jl0Var5.f3997Z.f6028k = sl0Var.f7143d;
                    }
                    try {
                        ((dl0) this.f5578l).f1679f.f3989R = true;
                    } catch (RuntimeException e5) {
                        jl0.f3965c0.log(Level.WARNING, "[" + ((dl0) this.f5578l).f1679f.f3998a + "] Unexpected exception from parsing service config", (Throwable) e5);
                    }
                    break;
                } else {
                    if (sl0Var != null) {
                        jl0Var4.f3985N.mo5321i("Service config from name resolver discarded by channel settings", 2);
                    }
                    jl0 jl0Var6 = ((dl0) this.f5578l).f1679f;
                    sl0Var = jl0.f3969g0;
                    if (ke0Var != null) {
                        jl0Var6.f3985N.mo5321i("Config selector from name resolver discarded by channel settings", 2);
                    }
                    ((dl0) this.f5578l).f1679f.f3987P.m2122h(sl0Var.m4535b());
                }
                C0831w8 c0831w9 = ((er0) this.f5577k).f2170b;
                dl0 dl0Var3 = (dl0) this.f5578l;
                if (dl0Var3.f1677d == dl0Var3.f1679f.f4023x) {
                    c0831w9.getClass();
                    C0312i6 c0312i6 = new C0312i6(i, c0831w9);
                    if (((C0831w8) c0312i6.f3447k).f8455a.containsKey(c0794v8)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(((C0831w8) c0312i6.f3447k).f8455a);
                        identityHashMap.remove(c0794v8);
                        c0312i6.f3447k = new C0831w8(identityHashMap);
                    }
                    IdentityHashMap identityHashMap2 = (IdentityHashMap) c0312i6.f3448l;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(c0794v8);
                    }
                    Map map = sl0Var.f7145f;
                    if (map != null) {
                        c0312i6.m2553y(mj0.f5054b, map);
                        c0312i6.m2540i();
                    }
                    C0831w8 c0831w8M2540i = c0312i6.m2540i();
                    f71 f71Var = ((dl0) this.f5578l).f1677d.f1285h;
                    C0831w8 c0831w10 = C0831w8.f8454b;
                    jj0 jj0Var = new jj0(list3, c0831w8M2540i, sl0Var.f7144e);
                    cl0 cl0Var2 = (cl0) f71Var.f2334k;
                    c71 c71Var = (c71) jj0Var.f3948c;
                    if (c71Var == null) {
                        try {
                            C0312i6 c0312i7 = (C0312i6) f71Var.f2337n;
                            String str2 = (String) c0312i7.f3448l;
                            nj0 nj0VarM3694b = ((oj0) c0312i7.f3447k).m3694b(str2);
                            if (nj0VarM3694b == null) {
                                throw new C0203f9("Trying to load '" + str2 + "' because using default policy, but it's unavailable");
                            }
                            c71Var = new c71(nj0VarM3694b, null);
                        } catch (C0203f9 e6) {
                            cl0Var2.mo965o(EnumC0474ml.f5073l, new xk0(ja1.f3882l.m2840h(e6.getMessage())));
                            ((mj0) f71Var.f2335l).mo1390f();
                            f71Var.f2336m = null;
                            f71Var.f2335l = new C0166e9();
                            ja1VarMo1387a = ja1.f3875e;
                        }
                    }
                    Object obj2 = c71Var.f1157b;
                    nj0 nj0Var = c71Var.f1156a;
                    if (((nj0) f71Var.f2336m) == null || !nj0Var.mo1102a().equals(((nj0) f71Var.f2336m).mo1102a())) {
                        cl0Var2.mo965o(EnumC0474ml.f5071j, new C0130d9(i3));
                        ((mj0) f71Var.f2335l).mo1390f();
                        f71Var.f2336m = nj0Var;
                        mj0 mj0Var = (mj0) f71Var.f2335l;
                        f71Var.f2335l = nj0Var.mo1103b(cl0Var2);
                        cl0Var2.f1286i.f3985N.mo5320h(2, "Load balancer changed from {0} to {1}", mj0Var.getClass().getSimpleName(), ((mj0) f71Var.f2335l).getClass().getSimpleName());
                    }
                    if (obj2 != null) {
                        cl0Var2.f1286i.f3985N.mo5320h(1, "Load-balancing config: {0}", obj2);
                    }
                    ja1VarMo1387a = ((mj0) f71Var.f2335l).mo1387a(new jj0(jj0Var.f3946a, jj0Var.f3947b, obj2));
                    if (l31Var != null) {
                        boolean zM2838f2 = ja1VarMo1387a.m2838f();
                        n31 n31Var2 = l31Var.f4657a;
                        C0012ab c0012ab2 = n31Var2.f5280i;
                        if (!zM2838f2) {
                            c0012ab2.m169a(new RunnableC0897y0(i7, n31Var2));
                            return;
                        }
                        gc1 gc1Var3 = c0012ab2.f123b;
                        gc1Var3.m2028d();
                        gc1Var3.execute(new RunnableC0944za(i3, c0012ab2));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                fl0 fl0Var = (fl0) this.f5577k;
                gl0 gl0Var3 = (gl0) this.f5578l;
                jl0 jl0Var7 = gl0Var3.f2803d;
                if (gl0Var3.f2800a.get() != jl0.f3970h0) {
                    fl0Var.m1880u();
                    return;
                }
                if (jl0Var7.f3973B == null) {
                    jl0Var7.f3973B = new LinkedHashSet();
                    jl0Var7.f3996Y.m4577m(jl0Var7.f3974C, true);
                }
                jl0Var7.f3973B.add(fl0Var);
                return;
            case 25:
                ((C0950zg) this.f5577k).run();
                fl0 fl0Var2 = (fl0) this.f5578l;
                fl0Var2.f2445r.f2803d.f4012m.execute(new RunnableC0739tr(fl0Var2, i2));
                return;
            case 26:
                ((hm0) this.f5578l).m2293b((C0251gj) this.f5577k);
                return;
            case 27:
                ((j40) this.f5577k).accept(this.f5578l);
                return;
            case 28:
                m3624a();
                return;
            default:
                zk0 zk0Var = (zk0) this.f5578l;
                i31 i31VarM5927d = zk0Var.m5927d(zk0Var.f9846x.f1935e, false);
                if (i31VarM5927d == null) {
                    return;
                }
                ((zk0) this.f5578l).f9833k.execute(new RunnableC0529o2(28, this, i31VarM5927d));
                return;
        }
    }

    public String toString() {
        switch (this.f5576j) {
            case 16:
                C0809vn c0809vnM5362k = wm1.m5362k(this);
                a81 a81Var = (a81) this.f5578l;
                oq0 oq0Var = new oq0(0);
                ((oq0) c0809vnM5362k.f8226n).f5842m = oq0Var;
                c0809vnM5362k.f8226n = oq0Var;
                oq0Var.f5841l = a81Var;
                return c0809vnM5362k.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC0529o2(Object obj, Object obj2, int i, boolean z) {
        this.f5576j = i;
        this.f5577k = obj;
        this.f5578l = obj2;
    }

    public /* synthetic */ RunnableC0529o2(int i, Object obj, Object obj2) {
        this.f5576j = i;
        this.f5578l = obj;
        this.f5577k = obj2;
    }
}
