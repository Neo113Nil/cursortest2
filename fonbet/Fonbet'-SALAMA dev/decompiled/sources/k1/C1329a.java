package k1;

import android.content.Intent;
import android.content.IntentFilter;
import d1.n;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329a extends AbstractC1331c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f14659i = n.g("BatteryChrgTracker");

    @Override // k1.AbstractC1332d
    public final Object a() {
        Intent registerReceiver = this.f14665b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            n.d().c(f14659i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // k1.AbstractC1331c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L7;
     */
    @Override // k1.AbstractC1331c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Intent intent) {
        char c3 = 0;
        String action = intent.getAction();
        if (action == null) {
        }
        n.d().b(f14659i, "Received ".concat(action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
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
