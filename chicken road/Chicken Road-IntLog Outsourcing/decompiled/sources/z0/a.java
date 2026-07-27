package z0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f2.v;
import s0.s;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: f, reason: collision with root package name */
    public final v f12447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, B4.i iVar, int i2) {
        super(context, iVar);
        this.f12448g = i2;
        this.f12447f = new v(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // z0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        switch (this.f12448g) {
            case 0:
                Intent registerReceiver = this.f12453b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    s.d().b(b.f12449a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent registerReceiver2 = this.f12453b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    s.d().b(c.f12450a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                boolean z = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent registerReceiver3 = this.f12453b.registerReceiver(null, f());
                boolean z5 = true;
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (hashCode == -730838620) {
                            break;
                        }
                    }
                    z5 = false;
                }
                return Boolean.valueOf(z5);
        }
    }

    @Override // z0.e
    public final void d() {
        s.d().a(d.f12451a, getClass().getSimpleName().concat(": registering receiver"));
        this.f12453b.registerReceiver(this.f12447f, f());
    }

    @Override // z0.e
    public final void e() {
        s.d().a(d.f12451a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f12453b.unregisterReceiver(this.f12447f);
    }

    public final IntentFilter f() {
        switch (this.f12448g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
