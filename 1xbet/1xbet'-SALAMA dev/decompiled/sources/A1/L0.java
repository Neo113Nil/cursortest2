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

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f115b;

    public /* synthetic */ L0(Object obj, int i7) {
        this.f114a = i7;
        this.f115b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f114a) {
            case 0:
                M0 m7 = (M0) this.f115b;
                ((Handler) m7.f122e).post(new K0(m7, 0));
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
                boolean zEquals = Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT");
                I2.P p5 = (I2.P) this.f115b;
                if (zEquals) {
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
                    ((p072k1.c) this.f115b).g(intent);
                    return;
                }
                return;
            case 6:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i8 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i8 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
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
                                        if (p151v2.t.f17159a >= 29) {
                                            i8 = 9;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i8 = 2;
                            } else if (type == 4 || type == 5) {
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
                                        if (p151v2.t.f17159a >= 29) {
                                            i8 = 9;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i8 = type != 9 ? 8 : 7;
                            } else {
                                i8 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i9 = p151v2.t.f17159a;
                p151v2.n nVar = (p151v2.n) this.f115b;
                if (i9 < 31 || i8 != 5) {
                    p151v2.n.a(nVar, i8);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    telephonyManager.getClass();
                    p151v2.m mVar = new p151v2.m(nVar);
                    telephonyManager.registerTelephonyCallback(context.getMainExecutor(), mVar);
                    telephonyManager.unregisterTelephonyCallback(mVar);
                    return;
                } catch (RuntimeException unused2) {
                    p151v2.n.a(nVar, 5);
                    return;
                }
            case 7:
                ((p155w1.Q) this.f115b).h(new p155w1.O(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry()));
                return;
            case 8:
                p155w1.Y y4 = (p155w1.Y) this.f115b;
                y4.d(new com.flurry.android.marketing.messaging.notification.b(6, y4, null));
                return;
            default:
                ((p155w1.Q) this.f115b).h(TimeZone.getDefault().getID());
                return;
        }
    }
}
