package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.work.impl.C;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.o;
import androidx.work.q;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f45427a = o.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        o e11 = o.e();
        String str = f45427a;
        e11.a(str, "Requesting diagnostics");
        try {
            C i11 = C.i(context);
            Intrinsics.checkNotNullParameter(DiagnosticsWorker.class, "workerClass");
            q b11 = new q.a(DiagnosticsWorker.class).b();
            i11.getClass();
            i11.e(Collections.singletonList(b11));
        } catch (IllegalStateException e12) {
            o.e().d(str, "WorkManager is not initialized", e12);
        }
    }
}
