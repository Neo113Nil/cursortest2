package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final class v extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5644a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f5645b;

    public /* synthetic */ v() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((w) this.f5645b).f5648c.f5323b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f5644a) {
            case 0:
                w wVar = (w) this.f5645b;
                if (wVar != null && wVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    w wVar2 = (w) this.f5645b;
                    wVar2.f5648c.getClass();
                    FirebaseMessaging.b(wVar2, 0L);
                    ((w) this.f5645b).f5648c.f5323b.unregisterReceiver(this);
                    this.f5645b = null;
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.i.e(context, "context");
                kotlin.jvm.internal.i.e(intent, "intent");
                z0.a aVar = (z0.a) this.f5645b;
                switch (aVar.f12448g) {
                    case 0:
                        kotlin.jvm.internal.i.e(intent, "intent");
                        String action = intent.getAction();
                        if (action != null) {
                            s0.s.d().a(z0.b.f12449a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        aVar.c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        aVar.c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.i.e(intent, "intent");
                        if (intent.getAction() != null) {
                            s0.s.d().a(z0.c.f12450a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int hashCode = action2.hashCode();
                                if (hashCode == -1980154005) {
                                    if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                        aVar.c(Boolean.TRUE);
                                        break;
                                    }
                                } else if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    aVar.c(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        kotlin.jvm.internal.i.e(intent, "intent");
                        if (intent.getAction() != null) {
                            s0.s.d().a(z0.j.f12462a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 == -1181163412) {
                                    if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                        aVar.c(Boolean.FALSE);
                                        break;
                                    }
                                } else if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    aVar.c(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                }
        }
    }

    public v(z0.a aVar) {
        this.f5645b = aVar;
    }
}
