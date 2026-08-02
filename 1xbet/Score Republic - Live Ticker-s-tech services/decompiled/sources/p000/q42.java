package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q42 implements ServiceConnection, InterfaceC0464mb, InterfaceC0501nb {

    /* JADX INFO: renamed from: j */
    public volatile boolean f6375j;

    /* JADX INFO: renamed from: k */
    public volatile ey1 f6376k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ v42 f6377l;

    public q42(v42 v42Var) {
        this.f6377l = v42Var;
    }

    @Override // p000.InterfaceC0464mb
    /* JADX INFO: renamed from: a */
    public final void mo305a(int i) {
        f02 f02Var = (f02) this.f6377l.f7192j;
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        a02Var.m2F();
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4607v.m5312a("Service connection suspended");
        a02 a02Var2 = f02Var.f2248p;
        f02.m1560m(a02Var2);
        a02Var2.m6J(new cm1(6, this));
    }

    @Override // p000.InterfaceC0501nb
    /* JADX INFO: renamed from: c */
    public final void mo2852c(C0253gl c0253gl) {
        v42 v42Var = this.f6377l;
        a02 a02Var = ((f02) v42Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m2F();
        ky1 ky1Var = ((f02) v42Var.f7192j).f2247o;
        if (ky1Var == null || !ky1Var.f1519k) {
            ky1Var = null;
        }
        if (ky1Var != null) {
            ky1Var.f4608w.m5313b(c0253gl, "Service connection failed");
        }
        synchronized (this) {
            this.f6375j = false;
            this.f6376k = null;
        }
        a02 a02Var2 = ((f02) this.f6377l.f7192j).f2248p;
        f02.m1560m(a02Var2);
        a02Var2.m6J(new f31(25, this, c0253gl));
    }

    @Override // p000.InterfaceC0464mb
    /* JADX INFO: renamed from: d */
    public final void mo308d() {
        a02 a02Var = ((f02) this.f6377l.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m2F();
        synchronized (this) {
            try {
                p80.m3863h(this.f6376k);
                nx1 nx1Var = (nx1) this.f6376k.m3890l();
                a02 a02Var2 = ((f02) this.f6377l.f7192j).f2248p;
                f02.m1560m(a02Var2);
                a02Var2.m6J(new i42(this, nx1Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f6376k = null;
                this.f6375j = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a02 a02Var = ((f02) this.f6377l.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m2F();
        synchronized (this) {
            int i = 0;
            if (iBinder == null) {
                this.f6375j = false;
                ky1 ky1Var = ((f02) this.f6377l.f7192j).f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5312a("Service connected with null binder");
                return;
            }
            nx1 kx1Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    kx1Var = iInterfaceQueryLocalInterface instanceof nx1 ? (nx1) iInterfaceQueryLocalInterface : new kx1(iBinder);
                    ky1 ky1Var2 = ((f02) this.f6377l.f7192j).f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4608w.m5312a("Bound to IMeasurementService interface");
                } else {
                    ky1 ky1Var3 = ((f02) this.f6377l.f7192j).f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4600o.m5313b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                ky1 ky1Var4 = ((f02) this.f6377l.f7192j).f2247o;
                f02.m1560m(ky1Var4);
                ky1Var4.f4600o.m5312a("Service connect failed to get IMeasurementService");
            }
            if (kx1Var == null) {
                this.f6375j = false;
                try {
                    b90 b90VarM606u = b90.m606u();
                    v42 v42Var = this.f6377l;
                    b90VarM606u.m625w(((f02) v42Var.f7192j).f2242j, v42Var.f8064l);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                a02 a02Var2 = ((f02) this.f6377l.f7192j).f2248p;
                f02.m1560m(a02Var2);
                a02Var2.m6J(new i42(this, kx1Var, i));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f02 f02Var = (f02) this.f6377l.f7192j;
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        a02Var.m2F();
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4607v.m5312a("Service disconnected");
        a02 a02Var2 = f02Var.f2248p;
        f02.m1560m(a02Var2);
        a02Var2.m6J(new f31(23, this, componentName));
    }
}
