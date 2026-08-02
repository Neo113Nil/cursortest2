package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xy1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final x62 f9106a;

    /* JADX INFO: renamed from: b */
    public boolean f9107b;

    /* JADX INFO: renamed from: c */
    public boolean f9108c;

    public xy1(x62 x62Var) {
        p80.m3863h(x62Var);
        this.f9106a = x62Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5716a() {
        x62 x62Var = this.f9106a;
        x62Var.m5574m0();
        x62Var.mo1564c().mo11z();
        x62Var.mo1564c().mo11z();
        if (this.f9107b) {
            x62Var.mo1563b().f4608w.m5312a("Unregistering connectivity change receiver");
            this.f9107b = false;
            this.f9108c = false;
            try {
                x62Var.f8832u.f2242j.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                x62Var.mo1563b().f4600o.m5313b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        x62 x62Var = this.f9106a;
        x62Var.m5574m0();
        String action = intent.getAction();
        x62Var.mo1563b().f4608w.m5313b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            x62Var.mo1563b().f4603r.m5313b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        ry1 ry1Var = x62Var.f8822k;
        x62.m5533U(ry1Var);
        boolean zM4429E = ry1Var.m4429E();
        if (this.f9108c != zM4429E) {
            this.f9108c = zM4429E;
            x62Var.mo1564c().m6J(new cm1(this, zM4429E));
        }
    }
}
