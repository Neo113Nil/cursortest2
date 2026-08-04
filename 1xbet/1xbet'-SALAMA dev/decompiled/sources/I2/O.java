package I2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class O extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (J2.g.f3814b) {
            J2.g.f3815c = false;
            J2.g.f3816d = false;
            J2.j.g("Ad debug logging enablement is out of date.");
        }
        p113p3.f.l0(context);
    }
}
