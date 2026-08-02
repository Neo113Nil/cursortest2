package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import d1.n;
import e1.l;
import w1.C1759x1;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9886a = n.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f9886a;
        n.d().b(str, "Requesting diagnostics", new Throwable[0]);
        try {
            l.m0(context).D(new C1759x1(DiagnosticsWorker.class).E());
        } catch (IllegalStateException e7) {
            n.d().c(str, "WorkManager is not initialized", e7);
        }
    }
}
