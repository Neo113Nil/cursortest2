package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u21 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7651j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f7652k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f7653l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f7654m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f7655n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f7656o;

    public /* synthetic */ u21(b12 b12Var, z72 z72Var, Bundle bundle, qx1 qx1Var, String str) {
        this.f7651j = 1;
        this.f7652k = b12Var;
        this.f7653l = z72Var;
        this.f7654m = bundle;
        this.f7655n = qx1Var;
        this.f7656o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        f72 f72Var;
        ja1 ja1Var = null;
        switch (this.f7651j) {
            case 0:
                for (i31 i31Var : (Collection) this.f7652k) {
                    if (i31Var != ((i31) this.f7653l)) {
                        i31Var.f3418a.mo1604G(zk0.f9817P);
                    }
                }
                Future future = (Future) this.f7654m;
                if (future != null) {
                    future.cancel(false);
                }
                Future future2 = (Future) this.f7655n;
                if (future2 != null) {
                    future2.cancel(false);
                }
                zk0 zk0Var = (zk0) this.f7656o;
                f71 f71Var = ((jl0) zk0Var.f9831M.f6027j).f3977F;
                synchronized (f71Var.f2334k) {
                    try {
                        ((HashSet) f71Var.f2335l).remove(zk0Var);
                        if (((HashSet) f71Var.f2335l).isEmpty()) {
                            ja1Var = (ja1) f71Var.f2336m;
                            f71Var.f2335l = new HashSet();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (ja1Var != null) {
                    ((jl0) f71Var.f2337n).f3976E.mo3771a(ja1Var);
                    return;
                }
                return;
            case 1:
                b12 b12Var = (b12) this.f7652k;
                z72 z72Var = (z72) this.f7653l;
                Bundle bundle = (Bundle) this.f7654m;
                qx1 qx1Var = (qx1) this.f7655n;
                String str = (String) this.f7656o;
                x62 x62Var = b12Var.f681b;
                x62Var.m5550W();
                try {
                    qx1Var.mo3806y(x62Var.m5559e0(bundle, z72Var));
                    return;
                } catch (RemoteException e) {
                    x62Var.mo1563b().f4600o.m5314c(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f7652k;
                synchronized (atomicReference2) {
                    try {
                        try {
                            v42 v42Var = (v42) this.f7656o;
                            nx1 nx1Var = v42Var.f8065m;
                            if (nx1Var == null) {
                                ky1 ky1Var = ((f02) v42Var.f7192j).f2247o;
                                f02.m1560m(ky1Var);
                                ky1Var.f4600o.m5315d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f7653l, (String) this.f7654m);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(nx1Var.mo576r((String) this.f7653l, (String) this.f7654m, (z72) this.f7655n));
                            } else {
                                atomicReference2.set(nx1Var.mo579v(null, (String) this.f7653l, (String) this.f7654m));
                            }
                            v42Var.m5066N();
                            atomicReference = (AtomicReference) this.f7652k;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e2) {
                            ky1 ky1Var2 = ((f02) ((v42) this.f7656o).f7192j).f2247o;
                            f02.m1560m(ky1Var2);
                            ky1Var2.f4600o.m5315d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f7653l, e2);
                            ((AtomicReference) this.f7652k).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f7652k;
                        }
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f7652k).notify();
                        throw th2;
                    }
                }
                break;
            default:
                gv1 gv1Var = (gv1) this.f7655n;
                String str2 = (String) this.f7653l;
                String str3 = (String) this.f7652k;
                v42 v42Var2 = (v42) this.f7656o;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        nx1 nx1Var2 = v42Var2.f8065m;
                        if (nx1Var2 == null) {
                            f02 f02Var = (f02) v42Var2.f7192j;
                            ky1 ky1Var3 = f02Var.f2247o;
                            f02.m1560m(ky1Var3);
                            ky1Var3.f4600o.m5314c(str3, str2, "Failed to get conditional properties; not connected to service");
                            f72Var = f02Var.f2250r;
                        } else {
                            arrayList = f72.m1694v0(nx1Var2.mo576r(str3, str2, (z72) this.f7654m));
                            v42Var2.m5066N();
                            f72Var = ((f02) v42Var2.f7192j).f2250r;
                        }
                    } catch (RemoteException e3) {
                        ky1 ky1Var4 = ((f02) v42Var2.f7192j).f2247o;
                        f02.m1560m(ky1Var4);
                        ky1Var4.f4600o.m5315d("Failed to get conditional properties; remote exception", str3, str2, e3);
                    }
                    f02.m1558k(f72Var);
                    f72Var.m1739u0(gv1Var, arrayList);
                    return;
                } catch (Throwable th3) {
                    f72 f72Var2 = ((f02) v42Var2.f7192j).f2250r;
                    f02.m1558k(f72Var2);
                    f72Var2.m1739u0(gv1Var, arrayList);
                    throw th3;
                }
        }
    }

    public /* synthetic */ u21(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f7651j = i;
        this.f7656o = obj;
        this.f7652k = obj2;
        this.f7653l = obj3;
        this.f7654m = obj4;
        this.f7655n = obj5;
    }
}
