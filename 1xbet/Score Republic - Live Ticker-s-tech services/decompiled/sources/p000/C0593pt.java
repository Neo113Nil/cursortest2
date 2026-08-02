package p000;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: pt */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0593pt implements InterfaceC0298ht {

    /* JADX INFO: renamed from: j */
    public long f6247j;

    /* JADX INFO: renamed from: k */
    public Object f6248k;

    /* JADX INFO: renamed from: l */
    public Serializable f6249l;

    /* JADX INFO: renamed from: m */
    public Object f6250m;

    /* JADX INFO: renamed from: n */
    public Object f6251n;

    public /* synthetic */ C0593pt(x62 x62Var) {
        this.f6251n = x62Var;
    }

    /* JADX INFO: renamed from: a */
    public synchronized C0556ot m3983a() {
        try {
            if (((C0556ot) this.f6251n) == null) {
                this.f6251n = C0556ot.m3757p((File) this.f6249l, this.f6247j);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C0556ot) this.f6251n;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
    /* JADX INFO: renamed from: b */
    public boolean m3984b(long j, rz1 rz1Var) {
        i02 i02Var;
        if (((ArrayList) this.f6250m) == null) {
            this.f6250m = new ArrayList();
        }
        if (((ArrayList) this.f6249l) == null) {
            this.f6249l = new ArrayList();
        }
        if (((ArrayList) this.f6250m).isEmpty() || ((((rz1) ((ArrayList) this.f6250m).get(0)).m4440A() / 1000) / 60) / 60 == ((rz1Var.m4440A() / 1000) / 60) / 60) {
            long jM5971m = this.f6247j + ((long) rz1Var.m5971m());
            x62 x62Var = (x62) this.f6251n;
            if (!x62Var.m5560f0().m770L(null, jx1.f4161Y0)) {
                x62Var.m5560f0();
                if (jM5971m < Math.max(0, ((Integer) jx1.f4191j.m2715a(null)).intValue())) {
                    this.f6247j = jM5971m;
                    ((ArrayList) this.f6250m).add(rz1Var);
                    ((ArrayList) this.f6249l).add(Long.valueOf(j));
                    i02Var = (i02) this.f6248k;
                    if (((ArrayList) this.f6250m).size() < Math.max(1, x62Var.m5560f0().m768J(i02Var != null ? i02Var.m2493t() : null, jx1.f4194k))) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.f6250m).isEmpty()) {
                this.f6247j = jM5971m;
                ((ArrayList) this.f6250m).add(rz1Var);
                ((ArrayList) this.f6249l).add(Long.valueOf(j));
                i02Var = (i02) this.f6248k;
                if (((ArrayList) this.f6250m).size() < Math.max(1, x62Var.m5560f0().m768J(i02Var != null ? i02Var.m2493t() : null, jx1.f4194k))) {
                    return true;
                }
            } else {
                x62Var.m5560f0();
                if (jM5971m < Math.max(0, ((Integer) jx1.f4191j.m2715a(null)).intValue())) {
                    this.f6247j = jM5971m;
                    ((ArrayList) this.f6250m).add(rz1Var);
                    ((ArrayList) this.f6249l).add(Long.valueOf(j));
                    i02Var = (i02) this.f6248k;
                    if (((ArrayList) this.f6250m).size() < Math.max(1, x62Var.m5560f0().m768J(i02Var != null ? i02Var.m2493t() : null, jx1.f4194k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0298ht
    /* JADX INFO: renamed from: c */
    public void mo2337c(xg0 xg0Var, qd0 qd0Var) {
        C0408kt c0408kt;
        String strM1611N = ((f50) this.f6248k).m1611N(xg0Var);
        C0312i6 c0312i6 = (C0312i6) this.f6250m;
        synchronized (c0312i6) {
            c0408kt = (C0408kt) ((HashMap) c0312i6.f3447k).get(strM1611N);
            if (c0408kt == null) {
                C0207fd c0207fd = (C0207fd) c0312i6.f3448l;
                synchronized (c0207fd.f2378a) {
                    c0408kt = (C0408kt) c0207fd.f2378a.poll();
                }
                if (c0408kt == null) {
                    c0408kt = new C0408kt();
                }
                ((HashMap) c0312i6.f3447k).put(strM1611N, c0408kt);
            }
            c0408kt.f4511b++;
        }
        c0408kt.f4510a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM1611N + " for for Key: " + xg0Var);
            }
            try {
                C0556ot c0556otM3983a = m3983a();
                if (c0556otM3983a.m3760m(strM1611N) == null) {
                    C0809vn c0809vnM3759j = c0556otM3983a.m3759j(strM1611N);
                    if (c0809vnM3759j == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM1611N));
                    }
                    try {
                        if (((InterfaceC0670rw) qd0Var.f6471k).mo2024g(qd0Var.f6472l, c0809vnM3759j.m5177h(), (uu0) qd0Var.f6473m)) {
                            C0556ot.m3753a((C0556ot) c0809vnM3759j.f8226n, c0809vnM3759j, true);
                            c0809vnM3759j.f8223k = true;
                        }
                        if (!c0809vnM3759j.f8223k) {
                            try {
                                c0809vnM3759j.m5171b();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!c0809vnM3759j.f8223k) {
                            try {
                                c0809vnM3759j.m5171b();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            ((C0312i6) this.f6250m).m2551w(strM1611N);
        } catch (Throwable th2) {
            ((C0312i6) this.f6250m).m2551w(strM1611N);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3985d() {
        fz1 fz1Var = (fz1) this.f6251n;
        fz1Var.mo11z();
        ((f02) fz1Var.f7192j).f2252t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = fz1Var.m1908E().edit();
        editorEdit.remove((String) this.f6249l);
        editorEdit.remove((String) this.f6250m);
        editorEdit.putLong((String) this.f6248k, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @Override // p000.InterfaceC0298ht
    /* JADX INFO: renamed from: f */
    public File mo2338f(xg0 xg0Var) {
        String strM1611N = ((f50) this.f6248k).m1611N(xg0Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM1611N + " for for Key: " + xg0Var);
        }
        try {
            nu1 nu1VarM3760m = m3983a().m3760m(strM1611N);
            if (nu1VarM3760m != null) {
                return ((File[]) nu1VarM3760m.f5551k)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
