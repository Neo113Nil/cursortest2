package A1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyManager;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import k1.AbstractC1331c;

/* loaded from: classes.dex */
public final class L0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f115b;

    public /* synthetic */ L0(Object obj, int i7) {
        this.f114a = i7;
        this.f115b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        switch (this.f114a) {
            case 0:
                M0 m02 = (M0) this.f115b;
                ((Handler) m02.f122e).post(new K0(m02, 0));
                return;
            case 1:
                D0.c cVar = (D0.c) this.f115b;
                synchronized (cVar) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) cVar.f1629d).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((BroadcastReceiver) arrayList.get(i7)).onReceive(context, intent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                boolean equals = Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT");
                I2.P p5 = (I2.P) this.f115b;
                if (equals) {
                    p5.f3584e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        p5.f3584e = false;
                        return;
                    }
                    return;
                }
            case 3:
                if ("close action".equals(intent.getAction())) {
                    ((WebViewActivity) this.f115b).finish();
                    return;
                }
                return;
            case 4:
                ((F.x) this.f115b).o();
                return;
            case 5:
                if (intent != null) {
                    ((AbstractC1331c) this.f115b).g(intent);
                    return;
                }
                return;
            case 6:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i8 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i8 = type != 9 ? 8 : 7;
                                        }
                                        i8 = 5;
                                    }
                                }
                                i8 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i8 = 3;
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
                                    i8 = 4;
                                    break;
                                case 13:
                                    i8 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i8 = 6;
                                    break;
                                case 18:
                                    i8 = 2;
                                    break;
                                case 20:
                                    if (v2.t.f17153a >= 29) {
                                        i8 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i8 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i9 = v2.t.f17153a;
                v2.n nVar = (v2.n) this.f115b;
                if (i9 < 31 || i8 != 5) {
                    v2.n.a(nVar, i8);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    telephonyManager.getClass();
                    v2.m mVar = new v2.m(nVar);
                    mainExecutor = context.getMainExecutor();
                    telephonyManager.registerTelephonyCallback(mainExecutor, mVar);
                    telephonyManager.unregisterTelephonyCallback(mVar);
                    return;
                } catch (RuntimeException unused2) {
                    v2.n.a(nVar, 5);
                    return;
                }
            case 7:
                ((w1.Q) this.f115b).h(new w1.O(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry()));
                return;
            case 8:
                r9.d(new com.flurry.android.marketing.messaging.notification.b(6, (w1.Y) this.f115b, null));
                return;
            default:
                ((w1.Q) this.f115b).h(TimeZone.getDefault().getID());
                return;
        }
    }
}
