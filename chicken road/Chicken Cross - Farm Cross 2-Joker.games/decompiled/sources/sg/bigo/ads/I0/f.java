package sg.bigo.ads.I0;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.Y1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.n1.r;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static int f12337a;
    public static final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public static boolean c = false;
    public static String d = Y1.f;
    public static String e = Y1.f;
    public static int f = 0;
    public static final AtomicBoolean g = new AtomicBoolean(false);
    public static long h = 0;
    public static final sg.bigo.ads.U.b i = new sg.bigo.ads.U.b();
    public static boolean j = false;
    public static e k = new e();

    public static synchronized void a(Context context, r rVar) {
        Context applicationContext;
        synchronized (f.class) {
            if (context != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = b;
                if (!copyOnWriteArrayList.contains(rVar)) {
                    copyOnWriteArrayList.add(rVar);
                }
                if (!c) {
                    c = true;
                    int i2 = sg.bigo.ads.Y.d.c;
                    sg.bigo.ads.Y.d dVar = sg.bigo.ads.Y.c.f12622a;
                    c cVar = new c();
                    if (!dVar.f12623a && (applicationContext = context.getApplicationContext()) != null) {
                        dVar.f12623a = true;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        applicationContext.registerReceiver(dVar, intentFilter);
                    }
                    AbstractC5446j.a(2, null, new sg.bigo.ads.Y.a(dVar, cVar), 1L);
                }
            }
        }
    }

    public static int b(Context context) {
        int i2 = 4;
        if (context == null) {
            return 4;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.isActiveNetworkMetered()) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            i2 = 3;
            if (restrictBackgroundStatus != 1) {
                if (restrictBackgroundStatus != 2) {
                    return restrictBackgroundStatus != 3 ? 0 : 1;
                }
                return 2;
            }
        }
        return i2;
    }

    public static int c(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            int i2 = context.getResources().getDisplayMetrics().densityDpi;
            int i3 = DisplayMetrics.DENSITY_DEVICE_STABLE;
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 0 : 2;
        } catch (Exception e2) {
            AbstractC5496a.a("DeviceUtil", "getDisplayScale exception: " + e2.getMessage());
            return -1;
        }
    }

    public static int d(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            AbstractC5496a.a("DeviceUtil", "getMinSdkVersion exception: " + th.getMessage());
            return 0;
        }
    }

    public static boolean e(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable unused) {
            AbstractC5496a.b("DeviceUtil", "Unexpected exception from Play services lib.");
            return false;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            AbstractC5496a.a("DeviceUtil", "getTargetSdkVersion exception: " + th.getMessage());
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int i2 = context.getResources().getConfiguration().uiMode & 48;
            if (i2 != 16) {
                return i2 != 32 ? 0 : 2;
            }
            return 1;
        } catch (Exception e2) {
            AbstractC5496a.a("DeviceUtil", "getThemeMode exception: " + e2.getMessage());
            return 0;
        }
    }

    public static String h(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            return !TextUtils.isEmpty(defaultUserAgent) ? defaultUserAgent.substring(defaultUserAgent.indexOf("Chrome/") + 7, defaultUserAgent.indexOf("Mobile")).trim() : defaultUserAgent;
        } catch (Exception unused2) {
            return str;
        }
    }

    public static boolean i(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null) {
                return accessibilityManager.isEnabled();
            }
            return false;
        } catch (Exception e2) {
            AbstractC5496a.a("DeviceUtil", "isAccessibilityServiceEnabled exception: " + e2.getMessage());
            return false;
        }
    }

    public static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        if (f12337a == 0) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            f12337a = (powerManager == null || powerManager.isScreenOn()) ? 1 : 2;
        }
        return f12337a == 1;
    }

    public static void k(Context context) {
        if (g.getAndSet(true) || context == null) {
            return;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(new d(displayManager), null);
    }

    public static boolean a(Context context) {
        PowerManager powerManager;
        return (context == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isPowerSaveMode()) ? false : true;
    }

    public static int a(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = activity.getResources().getConfiguration().orientation;
        if (1 == i2) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        AbstractC5496a.a("DeviceUtil", "Unknown orientation. return portrait by default");
        return 9;
    }
}
