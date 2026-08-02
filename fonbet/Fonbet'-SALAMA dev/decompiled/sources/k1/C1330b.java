package k1;

import android.content.Intent;
import android.content.IntentFilter;
import d1.n;
import w1.L;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330b extends AbstractC1331c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f14660i = n.g("BatteryNotLowTracker");

    @Override // k1.AbstractC1332d
    public final Object a() {
        Intent registerReceiver = this.f14665b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        n.d().c(f14660i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // k1.AbstractC1331c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // k1.AbstractC1331c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        n.d().b(f14660i, L.i("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
