package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v00 extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f7983b = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final Context f7984a;

    public v00(Context context) {
        this.f7984a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (w00.f8316j) {
            try {
                Iterator it = ((C0053b8) w00.f8317k.values()).iterator();
                while (it.hasNext()) {
                    ((w00) it.next()).m5226d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7984a.unregisterReceiver(this);
    }
}
