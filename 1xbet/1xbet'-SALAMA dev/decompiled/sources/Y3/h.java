package Y3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f7659b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7660a;

    public h(Context context) {
        this.f7660a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (i.f7661k) {
            try {
                Iterator it = ((p122r.k) i.f7662l.values()).iterator();
                while (it.hasNext()) {
                    ((i) it.next()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7660a.unregisterReceiver(this);
    }
}
