package p000;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n72 implements InterfaceC0387k8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5323a;

    /* JADX INFO: renamed from: b */
    public final Object f5324b;

    /* JADX INFO: renamed from: c */
    public final Object f5325c;

    public /* synthetic */ n72(int i, Object obj, Object obj2) {
        this.f5323a = i;
        this.f5324b = obj;
        this.f5325c = obj2;
    }

    @Override // p000.InterfaceC0387k8
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.f5323a) {
            case 0:
                p72 p72Var = (p72) this.f5324b;
                return ((b42) p72Var.f6010d.get()).m591a(new a81(p72Var, (s72) this.f5325c));
            case 1:
                List list = (List) this.f5324b;
                f92 f92Var = (f92) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC0024an.m280c(it);
                }
                z82 z82Var = new z82(this, arrayList, size);
                int i = ja2.f3889a;
                int i2 = 4;
                n72 n72Var = new n72(i2, s92.m4509a(), z82Var);
                EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
                return k70.m2996g(k70.m2995f(k70.m2996g(k70.m2994e(f92Var.f2355a.f100e.m5736s()), new n72(i2, s92.m4509a(), new n72(3, f92Var, n72Var)), enumC0113ct), new h70(), enumC0113ct), new n72(i2, s92.m4509a(), new z82(this, size, arrayList)), enumC0113ct);
            case 2:
                e92 e92Var = (e92) this.f5324b;
                C0934z0 c0934z0 = (C0934z0) this.f5325c;
                e92Var.m1396c((Uri) k70.m2991b(e92Var.f2021b), obj);
                synchronized (e92Var.f2027h) {
                    e92Var.f2029j = c0934z0;
                    break;
                }
                return k70.m2993d(obj);
            case 3:
                return ((f92) this.f5324b).f2355a.f98c.m1394a((n72) this.f5325c, EnumC0113ct.f1449j);
            default:
                ha2 ha2Var = (ha2) this.f5324b;
                ga2 ga2VarM4511c = s92.m4511c();
                ha2 ha2VarM4510b = s92.m4510b(ga2VarM4511c, ha2Var);
                try {
                    ListenableFuture listenableFutureApply = ((InterfaceC0387k8) this.f5325c).apply(obj);
                    if (listenableFutureApply == null) {
                        throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                    }
                    s92.m4510b(ga2VarM4511c, ha2VarM4510b);
                    return listenableFutureApply;
                } catch (Throwable th) {
                    try {
                        r92.m4282a(th);
                        throw th;
                    } catch (Throwable th2) {
                        s92.m4510b(ga2VarM4511c, ha2VarM4510b);
                        throw th2;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f5323a) {
            case 4:
                InterfaceC0387k8 interfaceC0387k8 = (InterfaceC0387k8) this.f5325c;
                StringBuilder sb = new StringBuilder(interfaceC0387k8.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(interfaceC0387k8);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
