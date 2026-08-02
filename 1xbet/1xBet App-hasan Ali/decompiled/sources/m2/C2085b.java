package m2;

import android.content.Intent;
import android.content.IntentFilter;
import f2.m;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2085b extends AbstractC2086c {
    public static final String i = m.f("BatteryNotLowTracker");

    @Override // m2.AbstractC2087d
    public final Object a() {
        Intent registerReceiver = this.f17985b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        m.d().b(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // m2.AbstractC2086c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // m2.AbstractC2086c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        m.d().a(i, L1.a.m("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
