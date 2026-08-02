package p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class el1 implements j90, k90 {

    /* JADX INFO: renamed from: c */
    public final e90 f2110c;

    /* JADX INFO: renamed from: d */
    public final C0679s4 f2111d;

    /* JADX INFO: renamed from: e */
    public final a81 f2112e;

    /* JADX INFO: renamed from: h */
    public final int f2115h;

    /* JADX INFO: renamed from: i */
    public final ml1 f2116i;

    /* JADX INFO: renamed from: j */
    public boolean f2117j;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ l90 f2120m;

    /* JADX INFO: renamed from: b */
    public final LinkedList f2109b = new LinkedList();

    /* JADX INFO: renamed from: f */
    public final HashSet f2113f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final HashMap f2114g = new HashMap();

    /* JADX INFO: renamed from: k */
    public final ArrayList f2118k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public C0253gl f2119l = null;

    public el1(l90 l90Var, g90 g90Var) {
        this.f2120m = l90Var;
        Looper looper = l90Var.f4734m.getLooper();
        qd0 qd0VarM2001a = g90Var.m2001a();
        C0902y5 c0902y5 = new C0902y5((C0165e8) qd0VarM2001a.f6471k, (String) qd0VarM2001a.f6472l, (String) qd0VarM2001a.f6473m);
        wo1 wo1Var = (wo1) g90Var.f2660d.f3447k;
        p80.m3863h(wo1Var);
        e90 e90VarMo5349b = wo1Var.mo5349b(g90Var.f2657a, looper, c0902y5, g90Var.f2661e, this, this);
        nu1 nu1Var = g90Var.f2659c;
        if (nu1Var == null || !(e90VarMo5349b instanceof AbstractC0575pb)) {
            String str = g90Var.f2658b;
            if (str != null && (e90VarMo5349b instanceof AbstractC0575pb)) {
                e90VarMo5349b.f6064s = str;
            }
        } else {
            e90VarMo5349b.f6065t = nu1Var;
        }
        this.f2110c = e90VarMo5349b;
        this.f2111d = g90Var.f2662f;
        this.f2112e = new a81(6);
        this.f2115h = g90Var.f2664h;
        if (!e90VarMo5349b.mo3893r()) {
            this.f2116i = null;
            return;
        }
        Context context = l90Var.f4726e;
        bm1 bm1Var = l90Var.f4734m;
        qd0 qd0VarM2001a2 = g90Var.m2001a();
        this.f2116i = new ml1(context, bm1Var, new C0902y5((C0165e8) qd0VarM2001a2.f6471k, (String) qd0VarM2001a2.f6472l, (String) qd0VarM2001a2.f6473m));
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: a */
    public final void mo1440a(int i) {
        l90 l90Var = this.f2120m;
        if (Looper.myLooper() == l90Var.f4734m.getLooper()) {
            m1444e(i);
        } else {
            l90Var.f4734m.post(new RunnableC0521nv(this, i));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1441b() {
        e90 e90Var = this.f2110c;
        l90 l90Var = this.f2120m;
        p80.m3859d(l90Var.f4734m);
        this.f2119l = null;
        m1451l(C0253gl.f2794o);
        if (this.f2117j) {
            bm1 bm1Var = l90Var.f4734m;
            C0679s4 c0679s4 = this.f2111d;
            bm1Var.removeMessages(11, c0679s4);
            l90Var.f4734m.removeMessages(9, c0679s4);
            this.f2117j = false;
        }
        Iterator it = this.f2114g.values().iterator();
        while (it.hasNext()) {
            C0809vn c0809vn = ((ll1) it.next()).f4836a;
            if (m1452m((C0451lz[]) c0809vn.f8225m) != null) {
                it.remove();
            } else {
                try {
                    new v92();
                    oq0 oq0Var = (oq0) ((C0415l) c0809vn.f8226n).f4614b;
                    oq0Var.getClass();
                    f22 f22Var = (f22) ((h22) e90Var).m3890l();
                    w12 w12Var = new w12((e22) oq0Var.f5841l, (p90) oq0Var.f5842m);
                    String str = (String) oq0Var.f5840k;
                    Parcel parcelM5810d = f22Var.m5810d();
                    parcelM5810d.writeString(str);
                    iu1.m2703c(parcelM5810d, w12Var);
                    f22Var.m5806F(parcelM5810d, 28);
                } catch (DeadObjectException unused) {
                    mo1440a(3);
                    e90Var.m3888d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        m1446g();
        m1450k();
    }

    @Override // p000.k90
    /* JADX INFO: renamed from: c */
    public final void mo1442c(C0253gl c0253gl) {
        m1454o(c0253gl, null);
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: d */
    public final void mo1443d() {
        l90 l90Var = this.f2120m;
        if (Looper.myLooper() == l90Var.f4734m.getLooper()) {
            m1441b();
        } else {
            l90Var.f4734m.post(new RunnableC0897y0(27, this));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1444e(int i) {
        p80.m3859d(this.f2120m.f4734m);
        this.f2119l = null;
        this.f2117j = true;
        String str = this.f2110c.f6046a;
        a81 a81Var = this.f2112e;
        a81Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        a81Var.m91o(true, new Status(20, sb.toString(), null, null));
        C0679s4 c0679s4 = this.f2111d;
        l90 l90Var = this.f2120m;
        bm1 bm1Var = l90Var.f4734m;
        bm1Var.sendMessageDelayed(Message.obtain(bm1Var, 9, c0679s4), 5000L);
        bm1 bm1Var2 = l90Var.f4734m;
        bm1Var2.sendMessageDelayed(Message.obtain(bm1Var2, 11, c0679s4), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) l90Var.f4728g.f63k;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f2114g.values().iterator();
        while (it.hasNext()) {
            ((ll1) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1445f(C0253gl c0253gl) {
        synchronized (l90.f4720q) {
            this.f2120m.getClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m1446g() {
        LinkedList linkedList = this.f2109b;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jl1 jl1Var = (jl1) arrayList.get(i);
            if (!this.f2110c.m3891p()) {
                return;
            }
            if (m1447h(jl1Var)) {
                linkedList.remove(jl1Var);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1447h(jl1 jl1Var) {
        if (jl1Var == null) {
            a81 a81Var = this.f2112e;
            e90 e90Var = this.f2110c;
            jl1Var.mo2931f(a81Var, e90Var.mo3893r());
            try {
                jl1Var.mo2932g(this);
                return true;
            } catch (DeadObjectException unused) {
                mo1440a(1);
                e90Var.m3888d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        C0451lz c0451lzM1452m = m1452m(jl1Var.mo2926a(this));
        if (c0451lzM1452m == null) {
            a81 a81Var2 = this.f2112e;
            e90 e90Var2 = this.f2110c;
            jl1Var.mo2931f(a81Var2, e90Var2.mo3893r());
            try {
                jl1Var.mo2932g(this);
                return true;
            } catch (DeadObjectException unused2) {
                mo1440a(1);
                e90Var2.m3888d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f2110c.getClass().getName();
        String str = c0451lzM1452m.f4928j;
        long jM3294b = c0451lzM1452m.m3294b();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jM3294b).length() + 2);
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(jM3294b);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        l90 l90Var = this.f2120m;
        if (!l90Var.f4735n || !jl1Var.mo2927b(this)) {
            jl1Var.mo2930e(new hg1(c0451lzM1452m));
            return true;
        }
        int iMo2928c = jl1Var.mo2928c(this);
        fl1 fl1Var = new fl1(this.f2111d, c0451lzM1452m);
        ArrayList arrayList = this.f2118k;
        int iIndexOf = arrayList.indexOf(fl1Var);
        if (iIndexOf >= 0) {
            fl1 fl1Var2 = (fl1) arrayList.get(iIndexOf);
            l90Var.f4734m.removeMessages(15, fl1Var2);
            l90Var.f4734m.sendMessageDelayed(Message.obtain(l90Var.f4734m, 15, fl1Var2), 5000L);
            return false;
        }
        arrayList.add(fl1Var);
        l90Var.f4734m.sendMessageDelayed(Message.obtain(l90Var.f4734m, 15, fl1Var), 5000L);
        l90Var.f4734m.sendMessageDelayed(Message.obtain(l90Var.f4734m, 16, fl1Var), 120000L);
        C0253gl c0253gl = new C0253gl(1, 2, null, null, Integer.valueOf(iMo2928c));
        if (m1445f(c0253gl)) {
            String str2 = c0451lzM1452m.f4928j;
            long jM3294b2 = c0451lzM1452m.m3294b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jM3294b2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(jM3294b2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!l90Var.m3194e(c0253gl, this.f2115h)) {
            return false;
        }
        String str3 = c0451lzM1452m.f4928j;
        long jM3294b3 = c0451lzM1452m.m3294b();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jM3294b3).length());
        sb3.append("Notification displayed for missing feature: ");
        sb3.append(str3);
        sb3.append(", version: ");
        sb3.append(jM3294b3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m1448i(Status status, Exception exc, boolean z) {
        p80.m3859d(this.f2120m.f4734m);
        if ((status == null) == (exc == null)) {
            C0270h1.m2190f("Status XOR exception should be null");
            return;
        }
        Iterator it = this.f2109b.iterator();
        while (it.hasNext()) {
            jl1 jl1Var = (jl1) it.next();
            if (!z || jl1Var.f4026a == 2) {
                if (status != null) {
                    jl1Var.mo2929d(status);
                } else {
                    jl1Var.mo2930e(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1449j(Status status) {
        p80.m3859d(this.f2120m.f4734m);
        m1448i(status, null, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m1450k() {
        l90 l90Var = this.f2120m;
        bm1 bm1Var = l90Var.f4734m;
        C0679s4 c0679s4 = this.f2111d;
        bm1Var.removeMessages(12, c0679s4);
        bm1 bm1Var2 = l90Var.f4734m;
        bm1Var2.sendMessageDelayed(bm1Var2.obtainMessage(12, c0679s4), l90Var.f4722a);
    }

    /* JADX INFO: renamed from: l */
    public final void m1451l(C0253gl c0253gl) {
        HashSet hashSet = this.f2113f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            dd0.m1158c();
            return;
        }
        if (AbstractC0477mo.m3406e(c0253gl, C0253gl.f2794o)) {
            e90 e90Var = this.f2110c;
            if (!e90Var.m3891p() || e90Var.f6047b == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final C0451lz m1452m(C0451lz[] c0451lzArr) {
        if (c0451lzArr != null && c0451lzArr.length != 0) {
            y02 y02Var = this.f2110c.f6068w;
            C0451lz[] c0451lzArr2 = y02Var == null ? null : y02Var.f9125k;
            if (c0451lzArr2 == null) {
                c0451lzArr2 = new C0451lz[0];
            }
            C0089c8 c0089c8 = new C0089c8(c0451lzArr2.length);
            for (C0451lz c0451lz : c0451lzArr2) {
                c0089c8.put(c0451lz.f4928j, Long.valueOf(c0451lz.m3294b()));
            }
            for (C0451lz c0451lz2 : c0451lzArr) {
                Long l = (Long) c0089c8.get(c0451lz2.f4928j);
                if (l == null || l.longValue() < c0451lz2.m3294b()) {
                    return c0451lz2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m1453n(C0253gl c0253gl) {
        p80.m3859d(this.f2120m.f4734m);
        e90 e90Var = this.f2110c;
        String name = e90Var.getClass().getName();
        String strValueOf = String.valueOf(c0253gl);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        e90Var.m3888d(sb.toString());
        m1454o(c0253gl, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m1454o(C0253gl c0253gl, RuntimeException runtimeException) {
        u71 u71Var;
        l90 l90Var = this.f2120m;
        p80.m3859d(l90Var.f4734m);
        ml1 ml1Var = this.f2116i;
        if (ml1Var != null && (u71Var = ml1Var.f5087h) != null) {
            u71Var.m3887c();
        }
        p80.m3859d(this.f2120m.f4734m);
        this.f2119l = null;
        SparseIntArray sparseIntArray = (SparseIntArray) l90Var.f4728g.f63k;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        m1451l(c0253gl);
        if ((this.f2110c instanceof em1) && c0253gl.f2796k != 24) {
            l90Var.f4723b = true;
            bm1 bm1Var = l90Var.f4734m;
            bm1Var.sendMessageDelayed(bm1Var.obtainMessage(19), 300000L);
        }
        int i = c0253gl.f2796k;
        if (i == 4) {
            m1449j(l90.f4719p);
            return;
        }
        if (i == 25) {
            m1449j(l90.m3190b(this.f2111d, c0253gl));
            return;
        }
        LinkedList linkedList = this.f2109b;
        if (linkedList.isEmpty()) {
            this.f2119l = c0253gl;
            return;
        }
        if (runtimeException != null) {
            p80.m3859d(l90Var.f4734m);
            m1448i(null, runtimeException, false);
            return;
        }
        boolean z = l90Var.f4735n;
        C0679s4 c0679s4 = this.f2111d;
        if (!z) {
            m1449j(l90.m3190b(c0679s4, c0253gl));
            return;
        }
        m1448i(l90.m3190b(c0679s4, c0253gl), null, true);
        if (linkedList.isEmpty() || m1445f(c0253gl) || l90Var.m3194e(c0253gl, this.f2115h)) {
            return;
        }
        if (c0253gl.f2796k == 18) {
            this.f2117j = true;
        }
        if (!this.f2117j) {
            m1449j(l90.m3190b(c0679s4, c0253gl));
        } else {
            bm1 bm1Var2 = l90Var.f4734m;
            bm1Var2.sendMessageDelayed(Message.obtain(bm1Var2, 9, c0679s4), 5000L);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1455p(jl1 jl1Var) {
        p80.m3859d(this.f2120m.f4734m);
        boolean zM3891p = this.f2110c.m3891p();
        LinkedList linkedList = this.f2109b;
        if (zM3891p) {
            if (m1447h(jl1Var)) {
                m1450k();
                return;
            } else {
                linkedList.add(jl1Var);
                return;
            }
        }
        linkedList.add(jl1Var);
        C0253gl c0253gl = this.f2119l;
        if (c0253gl == null || c0253gl.f2796k == 0 || c0253gl.f2797l == null) {
            m1457r();
        } else {
            m1454o(c0253gl, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1456q() {
        l90 l90Var = this.f2120m;
        p80.m3859d(l90Var.f4734m);
        Status status = l90.f4718o;
        m1449j(status);
        this.f2112e.m91o(false, status);
        for (bj0 bj0Var : (bj0[]) this.f2114g.keySet().toArray(new bj0[0])) {
            m1455p(new rl1(bj0Var, new qc1()));
        }
        m1451l(new C0253gl(4, null, null));
        if (this.f2110c.m3891p()) {
            l90Var.f4734m.post(new RunnableC0897y0(28, new an0(11, this)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1457r() {
        l90 l90Var = this.f2120m;
        p80.m3859d(l90Var.f4734m);
        e90 e90Var = this.f2110c;
        if (e90Var.m3891p()) {
            return;
        }
        e90 e90Var2 = e90Var;
        if (e90Var2.m3892q()) {
            return;
        }
        try {
            int iM89m = l90Var.f4728g.m89m(l90Var.f4726e, e90Var);
            if (iM89m != 0) {
                C0253gl c0253gl = new C0253gl(iM89m, null, null);
                String name = e90Var.getClass().getName();
                String string = c0253gl.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                m1454o(c0253gl, null);
                return;
            }
            wp0 wp0Var = new wp0(l90Var, e90Var, this.f2111d);
            if (e90Var.mo3893r()) {
                ml1 ml1Var = this.f2116i;
                p80.m3863h(ml1Var);
                u71 u71Var = ml1Var.f5087h;
                if (u71Var != null) {
                    u71Var.m3887c();
                }
                C0902y5 c0902y5 = ml1Var.f5086g;
                c0902y5.f9159f = Integer.valueOf(System.identityHashCode(ml1Var));
                wk1 wk1Var = ml1Var.f5084e;
                Context context = ml1Var.f5082c;
                Handler handler = ml1Var.f5083d;
                ml1Var.f5087h = (u71) wk1Var.mo5349b(context, handler.getLooper(), c0902y5, (v71) c0902y5.f9158e, ml1Var, ml1Var);
                ml1Var.f5088i = wp0Var;
                Set set = ml1Var.f5085f;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableC0897y0(ml1Var));
                } else {
                    u71 u71Var2 = ml1Var.f5087h;
                    u71Var2.getClass();
                    u71Var2.f6055j = new b90(u71Var2);
                    u71Var2.m3895t(2, null);
                }
            }
            try {
                e90Var2.f6055j = wp0Var;
                e90Var2.m3895t(2, null);
            } catch (SecurityException e) {
                m1454o(new C0253gl(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            m1454o(new C0253gl(10, null, null), e2);
        }
    }
}
