package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n32 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5282j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f5283k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f5284l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ z72 f5285m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f5286n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ v42 f5287o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f5288p;

    public n32(v42 v42Var, String str, String str2, z72 z72Var, boolean z, gv1 gv1Var) {
        this.f5283k = str;
        this.f5284l = str2;
        this.f5285m = z72Var;
        this.f5286n = z;
        this.f5288p = gv1Var;
        this.f5287o = v42Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        f72 f72Var;
        AtomicReference atomicReference;
        switch (this.f5282j) {
            case 0:
                String str = this.f5284l;
                String str2 = this.f5283k;
                gv1 gv1Var = (gv1) this.f5288p;
                v42 v42Var = this.f5287o;
                Bundle bundle = new Bundle();
                try {
                    try {
                        nx1 nx1Var = v42Var.f8065m;
                        f02 f02Var = (f02) v42Var.f7192j;
                        if (nx1Var == null) {
                            ky1 ky1Var = f02Var.f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4600o.m5314c(str2, str, "Failed to get user properties; not connected to service");
                            f72Var = f02Var.f2250r;
                            f02.m1558k(f72Var);
                            f72Var.m1738t0(gv1Var, bundle);
                            return;
                        }
                        List<b72> listMo580w = nx1Var.mo580w(str2, str, this.f5286n, this.f5285m);
                        Bundle bundle2 = new Bundle();
                        if (listMo580w != null) {
                            for (b72 b72Var : listMo580w) {
                                String str3 = b72Var.f752n;
                                String str4 = b72Var.f749k;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = b72Var.f751m;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = b72Var.f754p;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            v42Var.m5066N();
                            f72 f72Var2 = f02Var.f2250r;
                            f02.m1558k(f72Var2);
                            f72Var2.m1738t0(gv1Var, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            ky1 ky1Var2 = ((f02) v42Var.f7192j).f2247o;
                            f02.m1560m(ky1Var2);
                            ky1Var2.f4600o.m5314c(str2, e, "Failed to get user properties; remote exception");
                            f72Var = ((f02) v42Var.f7192j).f2250r;
                            f02.m1558k(f72Var);
                            f72Var.m1738t0(gv1Var, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            f72 f72Var3 = ((f02) v42Var.f7192j).f2250r;
                            f02.m1558k(f72Var3);
                            f72Var3.m1738t0(gv1Var, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f5288p;
                synchronized (atomicReference2) {
                    try {
                        try {
                            v42 v42Var2 = this.f5287o;
                            nx1 nx1Var2 = v42Var2.f8065m;
                            if (nx1Var2 == null) {
                                ky1 ky1Var3 = ((f02) v42Var2.f7192j).f2247o;
                                f02.m1560m(ky1Var3);
                                ky1Var3.f4600o.m5315d("(legacy) Failed to get user properties; not connected to service", null, this.f5283k, this.f5284l);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(nx1Var2.mo580w(this.f5283k, this.f5284l, this.f5286n, this.f5285m));
                            } else {
                                atomicReference2.set(nx1Var2.mo567g(null, this.f5283k, this.f5284l, this.f5286n));
                            }
                            v42Var2.m5066N();
                            atomicReference = (AtomicReference) this.f5288p;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            ky1 ky1Var4 = ((f02) this.f5287o.f7192j).f2247o;
                            f02.m1560m(ky1Var4);
                            ky1Var4.f4600o.m5315d("(legacy) Failed to get user properties; remote exception", null, this.f5283k, e3);
                            ((AtomicReference) this.f5288p).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f5288p;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f5288p).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public n32(v42 v42Var, AtomicReference atomicReference, String str, String str2, z72 z72Var, boolean z) {
        this.f5288p = atomicReference;
        this.f5283k = str;
        this.f5284l = str2;
        this.f5285m = z72Var;
        this.f5286n = z;
        this.f5287o = v42Var;
    }
}
