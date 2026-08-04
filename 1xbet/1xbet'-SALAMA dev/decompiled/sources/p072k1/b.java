package p072k1;

import android.content.Intent;
import android.content.IntentFilter;
import p023d1.n;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14666i = n.g("BatteryNotLowTracker");

    @Override // p072k1.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f14671b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        n.d().c(f14666i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // p072k1.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p072k1.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        n.d().b(f14666i, L.i("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
