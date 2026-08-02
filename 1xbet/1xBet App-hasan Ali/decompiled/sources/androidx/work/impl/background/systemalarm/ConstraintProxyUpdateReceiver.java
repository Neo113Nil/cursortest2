package androidx.work.impl.background.systemalarm;

import L1.a;
import S2.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import f2.m;
import g2.l;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7108a = m.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            l.Q(context).f17131n.t(new q(intent, context, goAsync(), 8));
        } else {
            m.d().a(f7108a, a.m("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
