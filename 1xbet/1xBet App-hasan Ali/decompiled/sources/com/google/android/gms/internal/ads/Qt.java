package com.google.android.gms.internal.ads;

import A0.AbstractC0015c;
import Q2.InterfaceC0391w0;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.RemoteException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import m3.InterfaceC2092b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Qt implements InterfaceC1231l3, InterfaceC1445pt, InterfaceC2092b, InterfaceC0648Nd, W2.c, Jw, Ar, Ei, InterfaceC1161jf, InterfaceC1887zm, InterfaceC0735Zg, InterfaceC1165jj, Jo, InterfaceC1576sq, InterfaceC1621tq {

    /* renamed from: m, reason: collision with root package name */
    public static Qt f11280m;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11281k;

    /* renamed from: l, reason: collision with root package name */
    public Object f11282l;

    public /* synthetic */ Qt(int i) {
        this.f11281k = i;
    }

    public static final Qt d(Context context) {
        Qt qt;
        synchronized (Qt.class) {
            try {
                if (f11280m == null) {
                    f11280m = new Qt(context);
                }
                qt = f11280m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qt;
    }

    @Override // m3.InterfaceC2092b
    public void L(int i) {
        synchronized (((C1324n6) this.f11282l).f14580m) {
            C1324n6 c1324n6 = (C1324n6) this.f11282l;
            c1324n6.f14583p = null;
            c1324n6.f14580m.notifyAll();
        }
    }

    @Override // m3.InterfaceC2092b
    public void N() {
        synchronized (((C1324n6) this.f11282l).f14580m) {
            try {
                C1324n6 c1324n6 = (C1324n6) this.f11282l;
                C1414p6 c1414p6 = (C1414p6) c1324n6.f14581n;
                if (c1414p6 != null) {
                    c1324n6.f14583p = (C1503r6) c1414p6.t();
                }
            } catch (DeadObjectException e3) {
                U2.j.g("Unable to obtain a cache service instance.", e3);
                C1324n6.s((C1324n6) this.f11282l);
            }
            ((C1324n6) this.f11282l).f14580m.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0735Zg
    /* renamed from: a, reason: collision with other method in class */
    public InterfaceC0391w0 mo15a() {
        return ((InterfaceC0677Re) this.f11282l).s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1445pt
    public void b(int i, long j5) {
        ((P.W) this.f11282l).h(i, System.currentTimeMillis() - j5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1231l3
    public void c(MessageDigest[] messageDigestArr, long j5, int i) {
        ByteBuffer slice;
        synchronized (((ByteBuffer) this.f11282l)) {
            int i5 = (int) j5;
            ((ByteBuffer) this.f11282l).position(i5);
            ((ByteBuffer) this.f11282l).limit(i5 + i);
            slice = ((ByteBuffer) this.f11282l).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public /* bridge */ /* synthetic */ E3.a e(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq) {
        return m(c1390oj, interfaceC1576sq, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1445pt
    public void f(int i, long j5, String str) {
        ((P.W) this.f11282l).j(i, System.currentTimeMillis() - j5, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1576sq
    public C0570Cf g(InterfaceC1531rq interfaceC1531rq) {
        return ((C0949eq) this.f11282l).b(interfaceC1531rq);
    }

    @Override // com.google.android.gms.internal.ads.Jo
    public void h(AbstractC0762ah abstractC0762ah) {
        AbstractC0579Dg abstractC0579Dg = (AbstractC0579Dg) abstractC0762ah;
        synchronized (((Do) this.f11282l)) {
            AbstractC0579Dg abstractC0579Dg2 = ((Do) this.f11282l).f8375s;
            if (abstractC0579Dg2 != null) {
                Xh xh = abstractC0579Dg2.f12694c;
                xh.getClass();
                xh.n1(new E7(null, 1));
            }
            ((Do) this.f11282l).f8375s = abstractC0579Dg;
            abstractC0579Dg.a();
        }
    }

    public RF[] i(Handler handler, SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE, SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE2) {
        int i = 3;
        C0614Ie c0614Ie = (C0614Ie) this.f11282l;
        Context context = c0614Ie.f9551k;
        C1894zt c1894zt = new C1894zt(context);
        AbstractC1668us.a0(!c1894zt.f16782k);
        c1894zt.f16782k = true;
        if (((Fx) c1894zt.f16785n) == null) {
            C1647uF c1647uF = new C1647uF();
            c1647uF.f15826m = 0;
            c1647uF.f15828o = 0;
            c1647uF.f15829p = 0;
            byte[] bArr = AbstractC1260lo.f;
            c1647uF.f15827n = bArr;
            c1647uF.f15830q = bArr;
            C0685Sf c0685Sf = new C0685Sf();
            c0685Sf.f11560c = 1.0f;
            c0685Sf.f11561d = 1.0f;
            C0684Se c0684Se = C0684Se.f11554e;
            c0685Sf.f11562e = c0684Se;
            c0685Sf.f = c0684Se;
            c0685Sf.f11563g = c0684Se;
            c0685Sf.f11564h = c0684Se;
            ByteBuffer byteBuffer = InterfaceC1431pf.f15014a;
            c0685Sf.f11566k = byteBuffer;
            c0685Sf.f11567l = byteBuffer.asShortBuffer();
            c0685Sf.f11568m = byteBuffer;
            c0685Sf.f11559b = -1;
            Fx fx = new Fx();
            InterfaceC1431pf[] interfaceC1431pfArr = {c1647uF, c0685Sf};
            fx.f9145m = interfaceC1431pfArr;
            System.arraycopy(new InterfaceC1431pf[0], 0, interfaceC1431pfArr, 0, 0);
            fx.f9143k = c1647uF;
            fx.f9144l = c0685Sf;
            c1894zt.f16785n = fx;
        }
        if (((C1667ur) c1894zt.f16786o) == null) {
            c1894zt.f16786o = new C1667ur(context, 11);
        }
        C1602tF c1602tF = new C1602tF(context, new C1685v8(context, i), handler, surfaceHolderCallbackC0974fE2, new C1557sF(c1894zt));
        Context context2 = c0614Ie.f9551k;
        return new RF[]{c1602tF, new AH(context2, new C1685v8(context2, i), handler, surfaceHolderCallbackC0974fE)};
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public Object j() {
        InterfaceC0588Eh interfaceC0588Eh;
        synchronized (this) {
            interfaceC0588Eh = (InterfaceC0588Eh) this.f11282l;
        }
        return interfaceC0588Eh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0648Nd, com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        switch (this.f11281k) {
            case 6:
                T2.G.m("Releasing engine reference.");
                ((C1471qa) this.f11282l).f15123d.t();
                break;
            case 14:
                ((InterfaceC0897di) obj).T0((AbstractC0762ah) this.f11282l);
                break;
            case 16:
                ((InterfaceC0764aj) obj).b((a3.u) this.f11282l);
                break;
            default:
                Cr cr = (Cr) this.f11282l;
                ((Hr) obj).k((Dr) cr.f8091k, cr.f8092l);
                break;
        }
    }

    public synchronized E3.a m(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq, InterfaceC0588Eh interfaceC0588Eh) {
        C1253lh d5;
        try {
            if (interfaceC0588Eh != null) {
                this.f11282l = interfaceC0588Eh;
            } else {
                this.f11282l = (InterfaceC0588Eh) interfaceC1576sq.g((InterfaceC1531rq) c1390oj.f14828m).c();
            }
            d5 = ((InterfaceC0588Eh) this.f11282l).d();
        } catch (Throwable th) {
            throw th;
        }
        return d5.a(d5.b());
    }

    public void n() {
        synchronized (Qt.class) {
            ((C1667ur) this.f11282l).h("vendor_scoped_gpid_v2_id");
            ((C1667ur) this.f11282l).h("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        switch (this.f11281k) {
            case 9:
                C0724Yc.f12336l.remove((E3.a) this.f11282l);
                return;
            case 10:
                ((AtomicInteger) ((AbstractC0015c) this.f11282l).f475b).set(1);
                return;
            case 17:
                try {
                    InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) ((List) obj).get(0);
                    if (interfaceC0677Re != null) {
                        C0854ck c0854ck = (C0854ck) this.f11282l;
                        c0854ck.getClass();
                        c0854ck.f13032m.execute(new RunnableC0658Og(interfaceC0677Re, 3));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e3) {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.a5)).booleanValue()) {
                        P2.o.f4767B.f4774g.i("omid native display exp", e3);
                        return;
                    }
                    return;
                }
            case 20:
                Sq sq = (Sq) obj;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.P5)).booleanValue()) {
                    ((C1213km) this.f11282l).f14282e.f(((Nq) sq.f11596b.f13762m).f);
                    Qm qm = ((C1213km) this.f11282l).f14282e;
                    long j5 = ((Nq) sq.f11596b.f13762m).f10827g;
                    synchronized (qm.f11255h) {
                        qm.f11251c = j5;
                    }
                    return;
                }
                return;
            default:
                ((Jr) this.f11282l).e();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1887zm
    public E3.a p(C1428pc c1428pc) {
        return ((Gm) ((AD) ((C0905dr) this.f11282l).f13188n).d()).x3(c1428pc.f15002r);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        switch (this.f11281k) {
            case 9:
                C0724Yc.f12336l.remove((E3.a) this.f11282l);
                break;
            case 10:
                ((AtomicInteger) ((AbstractC0015c) this.f11282l).f475b).set(-1);
                break;
            case 17:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.a5)).booleanValue()) {
                    P2.o.f4767B.f4774g.i("omid native display exp", th);
                    break;
                }
                break;
            case 20:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.P5)).booleanValue()) {
                    Matcher matcher = C1213km.f14277h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        ((C1213km) this.f11282l).f14282e.f(Integer.parseInt(matcher.group(1)));
                        break;
                    }
                }
                break;
        }
    }

    @Override // W2.c
    public void w(J2.b bVar) {
        switch (this.f11281k) {
            case 7:
                try {
                    ((InterfaceC1024gb) this.f11282l).q(bVar.m());
                    break;
                } catch (RemoteException e3) {
                    U2.j.g("", e3);
                    return;
                }
            default:
                try {
                    ((InterfaceC0934eb) this.f11282l).q(bVar.m());
                    break;
                } catch (RemoteException e5) {
                    U2.j.g("", e5);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
        Yq yq;
        Object obj = ((C1394on) this.f11282l).f14849b;
        try {
            ((C0950er) obj).b(z3);
            try {
                ((C0950er) obj).f13363a.V();
            } finally {
            }
        } catch (Yq e3) {
            U2.j.j("Cannot show rewarded video.", e3);
            throw new C1121ij(e3.getCause());
        }
    }

    public /* synthetic */ Qt(int i, Object obj) {
        this.f11281k = i;
        this.f11282l = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1231l3
    public long a() {
        return ((ByteBuffer) this.f11282l).capacity();
    }

    public Qt(Context context) {
        this.f11281k = 0;
        if (C1667ur.f15912n == null) {
            C1667ur.f15912n = new C1667ur(context, 4);
        }
        this.f11282l = C1667ur.f15912n;
        Mt.b(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1161jf, com.google.android.gms.internal.ads.Jo, com.google.android.gms.internal.ads.InterfaceC1452q
    /* renamed from: a */
    public void mo10a() {
        switch (this.f11281k) {
            case 18:
                ((C1548s6) this.f11282l).d();
                return;
            default:
                synchronized (((Do) this.f11282l)) {
                    ((Do) this.f11282l).f8375s = null;
                }
                return;
        }
    }

    public Qt(ByteBuffer byteBuffer) {
        this.f11281k = 3;
        this.f11282l = byteBuffer.slice();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.dd] */
    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        Sq sq = (Sq) obj;
        C0709Wb c0709Wb = ((C1253lh) this.f11282l).f14395d;
        ArrayList arrayList = (ArrayList) sq.f11596b.f13763n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Qq qq = (Qq) obj2;
            String str = qq.f11276a;
            Map map = (Map) c0709Wb.f12040l;
            boolean containsKey = map.containsKey(str);
            String str2 = qq.f11276a;
            JSONObject jSONObject = qq.f11277b;
            if (containsKey && jSONObject != null) {
                C0761ag c0761ag = (C0761ag) map.get(str2);
                switch (c0761ag.f12690a) {
                    case 0:
                        if (jSONObject != null) {
                            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.P8)).booleanValue()) {
                                Ul ul = (Ul) c0761ag.f12691b;
                                synchronized (ul) {
                                    ul.f11800p = jSONObject;
                                }
                                break;
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    default:
                        ((C0892dd) ((C0709Wb) c0761ag.f12691b).f12041m).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                        break;
                }
            } else {
                Map map2 = (Map) c0709Wb.f12041m;
                if (map2.containsKey(str2) && jSONObject != null) {
                    InterfaceC0699Uf interfaceC0699Uf = (InterfaceC0699Uf) map2.get(str2);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (optString != null) {
                            hashMap.put(next, optString);
                        }
                    }
                    interfaceC0699Uf.a(hashMap);
                }
            }
        }
        return sq;
    }

    private final void l(Throwable th) {
    }
}
