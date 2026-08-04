package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p023d1.n;
import p031e1.l;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9886a = n.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f9886a;
        n.d().b(str, "Requesting diagnostics", new Throwable[0]);
        try {
            l.m0(context).D(new C1050x1(DiagnosticsWorker.class).E());
        } catch (IllegalStateException e7) {
            n.d().c(str, "WorkManager is not initialized", e7);
        }
    }
}
