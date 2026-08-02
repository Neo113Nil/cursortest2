package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import f2.m;
import g2.l;
import v3.e;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7116a = m.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f7116a;
        m.d().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            l.Q(context).r(new e(DiagnosticsWorker.class).p());
        } catch (IllegalStateException e3) {
            m.d().b(str, "WorkManager is not initialized", e3);
        }
    }
}
