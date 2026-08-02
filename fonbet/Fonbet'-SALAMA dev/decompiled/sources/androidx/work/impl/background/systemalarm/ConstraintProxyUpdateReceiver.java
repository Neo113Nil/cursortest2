package androidx.work.impl.background.systemalarm;

import H2.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d1.n;
import e1.l;
import w1.L;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9878a = n.g("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            l.m0(context).f12547x.G(new q(intent, context, goAsync(), 19));
        } else {
            n.d().b(f9878a, L.i("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
