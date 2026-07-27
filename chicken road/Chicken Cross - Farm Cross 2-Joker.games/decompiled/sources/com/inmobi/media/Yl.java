package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Yl {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f6978a = new ConcurrentHashMap();
    public static Xl b;
    public static boolean c;

    public static void a(String str) {
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            Y5.f6965a.getClass();
            if (!Y5.r() || !Intrinsics.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                ConcurrentHashMap concurrentHashMap = f6978a;
                if (concurrentHashMap.get(str) == null) {
                    Wl wl = new Wl();
                    concurrentHashMap.put(str, wl);
                    AbstractC3727g4.a(context, wl, new IntentFilter(str));
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                Xl xl = new Xl();
                b = xl;
                connectivityManager.registerDefaultNetworkCallback(xl);
            }
        }
    }

    public static void b() {
        Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        Y5.f6965a.getClass();
        if (Y5.y()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (Y5.r()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            Y5.f6965a.getClass();
            if (Y5.r() && Intrinsics.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str) && b != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    Xl xl = b;
                    Intrinsics.checkNotNull(xl);
                    connectivityManager.unregisterNetworkCallback(xl);
                    b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f6978a;
            if (concurrentHashMap.get(str) != null) {
                context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a() {
        Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        Y5.f6965a.getClass();
        if (Y5.y()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (Y5.r()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        f6978a.clear();
    }

    public static void a(Context context, Intent intent) {
        Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
            String str = "Received broadcast.: " + intent.getAction();
            boolean z = false;
            if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z = true;
                        }
                        c = z;
                        Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
                        ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(10, 4, c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (StringsKt.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null) {
                    Y5.f6965a.getClass();
                    if (Y5.y()) {
                        z = powerManager.isDeviceIdleMode();
                    }
                }
                if (z != c) {
                    Y5.f6965a.getClass();
                    if (Y5.y()) {
                        Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
                        ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(11, 4, String.valueOf(z)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.USER_PRESENT", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
                ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(100, 6, (String) null));
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
                ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(1, 6, (String) null));
                Iterator it = f6978a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                f6978a.clear();
                b = null;
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.REBOOT", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
                ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(2, 6, (String) null));
                Iterator it2 = f6978a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((String) ((Map.Entry) it2.next()).getKey());
                }
                f6978a.clear();
                b = null;
                return;
            }
            Intrinsics.checkNotNullExpressionValue("Yl", "TAG");
            ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(99, 4, intent.getAction()));
        } catch (Exception unused) {
        }
    }
}
