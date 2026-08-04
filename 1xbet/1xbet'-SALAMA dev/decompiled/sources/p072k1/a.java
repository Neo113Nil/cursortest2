package p072k1;

import android.content.Intent;
import android.content.IntentFilter;
import p023d1.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14665i = n.g("BatteryChrgTracker");

    @Override // p072k1.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f14671b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            n.d().c(f14665i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // p072k1.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // p072k1.c
    public final void g(Intent intent) {
        byte b7 = 0;
        String action = intent.getAction();
        if (action == null) {
        }
        n.d().b(f14665i, "Received ".concat(action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b7 = -1;
                }
                break;
            case -54942926:
                b7 = !action.equals("android.os.action.DISCHARGING") ? (byte) -1 : (byte) 1;
                break;
            case 948344062:
                b7 = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b7 = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
                c(Boolean.FALSE);
                break;
            case 1:
                c(Boolean.FALSE);
                break;
            case 2:
                c(Boolean.TRUE);
                break;
            case 3:
                c(Boolean.TRUE);
                break;
        }
    }
}
