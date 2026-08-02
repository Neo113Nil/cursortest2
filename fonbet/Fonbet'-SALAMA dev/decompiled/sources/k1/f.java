package k1;

import android.content.Intent;
import android.content.IntentFilter;
import d1.n;
import w1.L;

/* loaded from: classes.dex */
public final class f extends AbstractC1331c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f14672i = n.g("StorageNotLowTracker");

    @Override // k1.AbstractC1332d
    public final Object a() {
        Intent registerReceiver = this.f14665b.registerReceiver(null, f());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // k1.AbstractC1331c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // k1.AbstractC1331c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        n.d().b(f14672i, L.i("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
