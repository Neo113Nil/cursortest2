package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: renamed from: iq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0331iq implements InterfaceC0437ll {

    /* JADX INFO: renamed from: j */
    public final Context f3635j;

    /* JADX INFO: renamed from: k */
    public final m11 f3636k;

    public C0331iq(Context context, m11 m11Var) {
        this.f3635j = context.getApplicationContext();
        this.f3636k = m11Var;
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: a */
    public final void mo245a() {
        m81 m81VarM3351d = m81.m3351d(this.f3635j);
        m11 m11Var = this.f3636k;
        synchronized (m81VarM3351d) {
            ((HashSet) m81VarM3351d.f5011m).remove(m11Var);
            if (m81VarM3351d.f5009k && ((HashSet) m81VarM3351d.f5011m).isEmpty()) {
                C0809vn c0809vn = (C0809vn) m81VarM3351d.f5010l;
                ((ConnectivityManager) ((p90) c0809vn.f8225m).get()).unregisterNetworkCallback((l81) c0809vn.f8226n);
                m81VarM3351d.f5009k = false;
            }
        }
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: b */
    public final void mo246b() {
        m81 m81VarM3351d = m81.m3351d(this.f3635j);
        m11 m11Var = this.f3636k;
        synchronized (m81VarM3351d) {
            ((HashSet) m81VarM3351d.f5011m).add(m11Var);
            m81VarM3351d.m3356e();
        }
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: c */
    public final void mo247c() {
    }
}
