package p000;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c91 implements InterfaceC0625qo, InterfaceC0588po {

    /* JADX INFO: renamed from: j */
    public final C0071bq f1169j;

    /* JADX INFO: renamed from: k */
    public final RunnableC0146dq f1170k;

    /* JADX INFO: renamed from: l */
    public volatile int f1171l;

    /* JADX INFO: renamed from: m */
    public volatile C0366jo f1172m;

    /* JADX INFO: renamed from: n */
    public volatile Object f1173n;

    /* JADX INFO: renamed from: o */
    public volatile gq0 f1174o;

    /* JADX INFO: renamed from: p */
    public volatile C0403ko f1175p;

    public c91(C0071bq c0071bq, RunnableC0146dq runnableC0146dq) {
        this.f1169j = c0071bq;
        this.f1170k = runnableC0146dq;
    }

    @Override // p000.InterfaceC0588po
    /* JADX INFO: renamed from: a */
    public final void mo902a(xg0 xg0Var, Exception exc, InterfaceC0551oo interfaceC0551oo, int i) {
        this.f1170k.mo902a(xg0Var, exc, interfaceC0551oo, this.f1174o.f2848c.mo1074g());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // p000.InterfaceC0625qo
    /* JADX INFO: renamed from: b */
    public final boolean mo903b() {
        boolean z;
        if (this.f1173n == null) {
            if (this.f1172m != null) {
            }
            this.f1172m = null;
            this.f1174o = null;
            z = false;
            while (!z) {
                ArrayList arrayListM741b = this.f1169j.m741b();
                int i = this.f1171l;
                this.f1171l = i + 1;
                this.f1174o = (gq0) arrayListM741b.get(i);
                if (this.f1174o == null) {
                }
            }
            return z;
        }
        Object obj = this.f1173n;
        this.f1173n = null;
        try {
            if (m905d(obj)) {
                if (this.f1172m != null || !this.f1172m.mo903b()) {
                    this.f1172m = null;
                    this.f1174o = null;
                    z = false;
                    while (!z && this.f1171l < this.f1169j.m741b().size()) {
                        ArrayList arrayListM741b2 = this.f1169j.m741b();
                        int i2 = this.f1171l;
                        this.f1171l = i2 + 1;
                        this.f1174o = (gq0) arrayListM741b2.get(i2);
                        if (this.f1174o == null && (this.f1169j.f957p.m2963a(this.f1174o.f2848c.mo1074g()) || this.f1169j.m742c(this.f1174o.f2848c.mo1071a()) != null)) {
                            this.f1174o.f2848c.mo1073e(this.f1169j.f956o, new a81(1, this, this.f1174o));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }

    @Override // p000.InterfaceC0588po
    /* JADX INFO: renamed from: c */
    public final void mo904c(xg0 xg0Var, Object obj, InterfaceC0551oo interfaceC0551oo, int i, xg0 xg0Var2) {
        this.f1170k.mo904c(xg0Var, obj, interfaceC0551oo, this.f1174o.f2848c.mo1074g(), xg0Var);
    }

    @Override // p000.InterfaceC0625qo
    public final void cancel() {
        gq0 gq0Var = this.f1174o;
        if (gq0Var != null) {
            gq0Var.f2848c.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m905d(Object obj) throws Throwable {
        Throwable th;
        int i = hk0.f3252b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC0847wo interfaceC0847woM3820g = this.f1169j.f944c.m4041a().m3820g(obj);
            Object objMo617m = interfaceC0847woM3820g.mo617m();
            InterfaceC0670rw interfaceC0670rwM743d = this.f1169j.m743d(objMo617m);
            qd0 qd0Var = new qd0(interfaceC0670rwM743d, objMo617m, this.f1169j.f950i, 11);
            xg0 xg0Var = this.f1174o.f2846a;
            C0071bq c0071bq = this.f1169j;
            C0403ko c0403ko = new C0403ko(xg0Var, c0071bq.f955n);
            InterfaceC0298ht interfaceC0298htM3879a = c0071bq.f949h.m3879a();
            interfaceC0298htM3879a.mo2337c(c0403ko, qd0Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c0403ko + ", data: " + obj + ", encoder: " + interfaceC0670rwM743d + ", duration: " + hk0.m2289a(jElapsedRealtimeNanos));
            }
            if (interfaceC0298htM3879a.mo2338f(c0403ko) != null) {
                this.f1175p = c0403ko;
                this.f1172m = new C0366jo(Collections.singletonList(this.f1174o.f2846a), this.f1169j, this);
                this.f1174o.f2848c.mo1072d();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f1175p + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f1170k.mo904c(this.f1174o.f2846a, interfaceC0847woM3820g.mo617m(), this.f1174o.f2848c, this.f1174o.f2848c.mo1074g(), this.f1174o.f2846a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f1174o.f2848c.mo1072d();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
