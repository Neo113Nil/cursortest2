package T2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.AbstractC1260lo;
import com.google.android.gms.internal.ads.Al;
import com.google.android.gms.internal.ads.C0797bF;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.C0901dm;
import com.google.android.gms.internal.ads.Dp;
import com.google.android.gms.internal.ads.M5;
import com.google.android.gms.internal.ads.Mm;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC1143j5;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import m2.AbstractC2086c;
import m2.C2088e;

/* loaded from: classes.dex */
public final class E extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5636b;

    public /* synthetic */ E(int i, Object obj) {
        this.f5635a = i;
        this.f5636b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        switch (this.f5635a) {
            case 0:
                R1.b bVar = (R1.b) this.f5636b;
                synchronized (bVar) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) bVar.f5129n).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                boolean equals = Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT");
                L l5 = (L) this.f5636b;
                if (equals) {
                    l5.f5677e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        l5.f5677e = false;
                        return;
                    }
                    return;
                }
            case 2:
                ((ViewOnAttachStateChangeListenerC1143j5) this.f5636b).c();
                return;
            case 3:
                ((M5) this.f5636b).c(3);
                return;
            case 4:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i5 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i5 = type != 9 ? 8 : 7;
                                        }
                                        i5 = 5;
                                    }
                                }
                                i5 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i5 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i5 = 4;
                                    break;
                                case 13:
                                    i5 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i5 = 6;
                                    break;
                                case 18:
                                    i5 = 2;
                                    break;
                                case 20:
                                    if (AbstractC1260lo.f14419a >= 29) {
                                        i5 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i5 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i6 = AbstractC1260lo.f14419a;
                C0901dm c0901dm = (C0901dm) this.f5636b;
                if (i6 < 31 || i5 != 5) {
                    C0901dm.h(c0901dm, i5);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        throw null;
                    }
                    Al al = new Al(c0901dm);
                    mainExecutor = context.getMainExecutor();
                    telephonyManager.registerTelephonyCallback(mainExecutor, al);
                    telephonyManager.unregisterTelephonyCallback(al);
                    return;
                } catch (RuntimeException unused2) {
                    C0901dm.h(c0901dm, 5);
                    return;
                }
            case 5:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C0802bc c0802bc = (C0802bc) this.f5636b;
                c0802bc.i(C0797bF.c(context, intent, (Mm) c0802bc.f12829s, (Dp) c0802bc.f12828r));
                return;
            case 6:
                if (intent != null) {
                    ((AbstractC2086c) this.f5636b).g(intent);
                    return;
                }
                return;
            default:
                if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    return;
                }
                f2.m.d().a(C2088e.f17989j, "Network broadcast received", new Throwable[0]);
                C2088e c2088e = (C2088e) this.f5636b;
                c2088e.c(c2088e.f());
                return;
        }
    }
}
