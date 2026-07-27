package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class Y5 {
    public static String d;
    public static final C3584b2 f;
    public static final C3584b2 g;
    public static final String i;
    public static final Pair j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static volatile boolean n;
    public static volatile long o;
    public static final Lazy p;
    public static final Lazy q;
    public static final Lazy r;
    public static final JSONArray s;
    public static final /* synthetic */ KProperty[] b = {Reflection.property1(new PropertyReference1Impl(Y5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), Reflection.property1(new PropertyReference1Impl(Y5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0)), Reflection.property1(new PropertyReference1Impl(Y5.class, "asyncNetworkInfo", "getAsyncNetworkInfo()Ljava/lang/String;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final Y5 f6965a = new Y5();
    public static long c = -1;
    public static final String e = "Y5";
    public static final C3584b2 h = new C3584b2("", new Function0() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Y5.a();
        }
    }, true, true);

    static {
        int i2 = 15;
        f = new C3584b2(i2, new Function0() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Y5.C());
            }
        }, 12);
        g = new C3584b2(i2, new Function0() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Y5.c());
            }
        }, 8);
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        i = RELEASE;
        j = new Pair("d-api-lev", new StringBuilder().append(Build.VERSION.SDK_INT).toString());
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        k = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        l = MODEL;
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        m = HARDWARE;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.D();
            }
        });
        q = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(Y5.d());
            }
        });
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.b();
            }
        });
        r = lazy;
        s = (JSONArray) lazy.getValue();
    }

    public static boolean A() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean B() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static final int C() {
        Context context = AbstractC3914mk.f7252a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|9|10|11|(6:13|14|15|(1:17)|18|19)|22|14|15|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final W5 D() {
        boolean z;
        String str;
        f6965a.getClass();
        try {
            Context context = AbstractC3914mk.f7252a;
            if (context == null) {
                return new W5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getApplicationEnabledSetting("com.android.vending") >= 2) {
                z = true;
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
                return new W5(str, z);
            }
            z = false;
            str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
            if (str == null) {
            }
            return new W5(str, z);
        } catch (Exception e2) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e2));
            return new W5(null, false);
        }
    }

    public static void E() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Y5.F();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void F() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            c = availableBytes / 1048576;
        } catch (Exception e2) {
            U9.a(e2);
        }
    }

    public static void G() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                Y5.H();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void H() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(U3.a.k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            try {
                UUID fromString = UUID.fromString(String.valueOf(storageVolume.getUuid()));
                Intrinsics.checkNotNull(fromString);
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        j2 += storageStatsManager.getFreeBytes(fromString);
                    } catch (Exception e2) {
                        C3810j3 c3810j3 = new C3810j3(e2);
                        Lazy lazy = Ba.f6473a;
                        Ba.a(c3810j3);
                    }
                }
            } catch (Exception unused) {
            }
        }
        c = j2 / 1048576;
    }

    public static void I() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Y5.J();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void J() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(U3.a.k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getFreeBytes(storageUuid);
                } catch (Exception e2) {
                    C3810j3 c3810j3 = new C3810j3(e2);
                    Lazy lazy = Ba.f6473a;
                    Ba.a(c3810j3);
                }
            }
        }
        c = j2 / 1048576;
    }

    public static void K() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Y5.L();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void L() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            d = new StringBuilder().append(blockCountLong / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED).toString();
        } catch (Exception e2) {
            U9.a(e2);
        }
    }

    public static void M() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Y5.N();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void N() {
        UUID uuid;
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(U3.a.k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid2 = storageVolume.getUuid();
            if (uuid2 == null) {
                uuid = StorageManager.UUID_DEFAULT;
                Intrinsics.checkNotNull(uuid);
            } else {
                try {
                    uuid = UUID.fromString(uuid2);
                    Intrinsics.checkNotNull(uuid);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getTotalBytes(uuid);
                } catch (Exception e2) {
                    C3810j3 c3810j3 = new C3810j3(e2);
                    Lazy lazy = Ba.f6473a;
                    Ba.a(c3810j3);
                }
            }
        }
        d = new StringBuilder().append(j2 / 1048576).toString();
    }

    public static void O() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Y5.P();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void P() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(U3.a.k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getTotalBytes(storageUuid);
                } catch (Exception e2) {
                    C3810j3 c3810j3 = new C3810j3(e2);
                    Lazy lazy = Ba.f6473a;
                    Ba.a(c3810j3);
                }
            }
        }
        d = new StringBuilder().append(j2 / 1048576).toString();
    }

    public static final int c() {
        Context context = AbstractC3914mk.f7252a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean d() {
        f6965a.getClass();
        try {
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = FINGERPRINT.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase2 = MODEL.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase3 = MANUFACTURER.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase4 = BRAND.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase5 = DEVICE.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
            String HARDWARE = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase6 = HARDWARE.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
            String PRODUCT = Build.PRODUCT;
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase7 = PRODUCT.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
            if (StringsKt.startsWith$default(lowerCase, "generic", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "unknown", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "emu", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "Android SDK built for x86", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "Genymotion", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase7, (CharSequence) "sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase7, (CharSequence) "vbox86p", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase7, (CharSequence) "emu", false, 2, (Object) null) || Intrinsics.areEqual(lowerCase6, "goldfish") || Intrinsics.areEqual(lowerCase6, "ranchu") || Intrinsics.areEqual(lowerCase6, "vbox86p") || StringsKt.contains$default((CharSequence) lowerCase6, (CharSequence) "nox", false, 2, (Object) null)) {
                return true;
            }
            if (StringsKt.startsWith$default(lowerCase4, "generic", false, 2, (Object) null)) {
                if (StringsKt.startsWith$default(lowerCase5, "generic", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String e() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null || !Og.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("Y5", "getSimpleName(...)");
            String str = "Error getting network info " + e2;
        }
        return networkInfo == null ? "" : Build.VERSION.SDK_INT < 28 ? a(networkInfo) : a(connectivityManager, networkInfo);
    }

    public static Pair f() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair("d-airplane-m", "1") : new Pair("d-airplane-m", "0");
    }

    public static final String g() {
        Y5 y5 = f6965a;
        y5.getClass();
        String str = (String) h.getValue(y5, b[2]);
        return StringsKt.startsWith$default(str, "0", false, 2, (Object) null) ? com.ironsource.L6.R0 : StringsKt.startsWith$default(str, "1", false, 2, (Object) null) ? com.ironsource.Q3.b : "NIL";
    }

    public static Pair h() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            I();
        } else if (i2 >= 26) {
            G();
        } else {
            E();
        }
        if (c != -1) {
            return new Pair("d-av-disk", String.valueOf(c));
        }
        return null;
    }

    public static Pair i() {
        Context context = AbstractC3914mk.f7252a;
        Integer num = null;
        if (context == null) {
            return null;
        }
        if (AbstractC3727g4.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            num = Integer.valueOf((int) ((r0.getIntExtra("level", -1) * 100) / r0.getIntExtra("scale", -1)));
        }
        return new Pair("d-bat-lev", new StringBuilder().append(num).toString());
    }

    public static Pair j() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair("d-bat-sav", "1") : new Pair("d-bat-sav", "0");
    }

    public static Pair k() {
        String str;
        int i2 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i2 == 16) {
            str = "0";
        } else {
            if (i2 != 32) {
                return null;
            }
            str = "1";
        }
        return new Pair("d-drk-m", str);
    }

    public static Pair l() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair m() {
        try {
            ArrayList arrayList = new ArrayList();
            Context context = AbstractC3914mk.f7252a;
            if (context == null) {
                return null;
            }
            Object systemService = context.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
            Intrinsics.checkNotNullExpressionValue(enabledInputMethodList, "getEnabledInputMethodList(...)");
            Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
            while (it.hasNext()) {
                List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
                Intrinsics.checkNotNullExpressionValue(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if (Intrinsics.areEqual(inputMethodSubtype.getMode(), "keyboard")) {
                        String languageTag = inputMethodSubtype.getLanguageTag();
                        Intrinsics.checkNotNullExpressionValue(languageTag, "getLanguageTag(...)");
                        String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                        Intrinsics.checkNotNull(language);
                        if (language.length() > 0) {
                            arrayList.add(language);
                        }
                    }
                }
            }
            return new Pair("d-key-lang", new JSONArray((Collection) arrayList).toString());
        } catch (Exception unused) {
            return new Pair("d-key-lang", new JSONArray((Collection) CollectionsKt.emptyList()).toString());
        }
    }

    public static int n() {
        String e2 = e();
        if (StringsKt.startsWith$default(e2, "0", false, 2, (Object) null)) {
            return 0;
        }
        return StringsKt.startsWith$default(e2, "1", false, 2, (Object) null) ? 1 : 2;
    }

    public static final String o() {
        f6965a.getClass();
        int n2 = n();
        return n2 != 0 ? n2 != 1 ? "NIL" : com.ironsource.Q3.b : com.ironsource.L6.R0;
    }

    public static HashMap p() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap hashMap = new HashMap();
        if (enabled) {
            hashMap.put("d-t1", s.toString());
            return hashMap;
        }
        String TAG = e;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return hashMap;
    }

    public static Pair q() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            O();
        } else if (i2 >= 26) {
            M();
        } else {
            K();
        }
        String str = d;
        if (str != null) {
            return new Pair("d-tot-disk", str);
        }
        return null;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean u() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return true;
    }

    public static boolean z() {
        return true;
    }

    public final int a(Context context, boolean z) {
        if (context == null || z) {
            return 0;
        }
        C3584b2 c3584b2 = g;
        KProperty[] kPropertyArr = b;
        int intValue = ((Number) c3584b2.getValue(this, kPropertyArr[1])).intValue();
        int intValue2 = ((Number) f.getValue(this, kPropertyArr[0])).intValue();
        if (intValue2 > 0) {
            return (intValue * 100) / intValue2;
        }
        Intrinsics.checkNotNullExpressionValue("Y5", "getSimpleName(...)");
        return 0;
    }

    public final HashMap b(boolean z) {
        int i2;
        HashMap hashMap = new HashMap();
        hashMap.put("os-v", i);
        hashMap.put("d-brand-name", Build.BRAND);
        hashMap.put("d-manufacturer-name", k);
        hashMap.put("d-model-name", l);
        hashMap.put("d-nettype-raw", e());
        String locale = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(locale, "toString(...)");
        hashMap.put("d-localization", locale);
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        hashMap.put("d-language", language);
        hashMap.put("d-devicemachinehw", m);
        if (System.currentTimeMillis() >= o) {
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            SignalsConfig signalsConfig = (SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class);
            o = (signalsConfig.getLowMemoryFreq() * 1000) + System.currentTimeMillis();
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new X5(null), 3, null);
        }
        hashMap.put("d-lowmem", String.valueOf(n));
        try {
            i2 = Runtime.getRuntime().availableProcessors();
        } catch (Exception e2) {
            Lazy lazy = Ba.f6473a;
            U9.a(e2);
            i2 = 0;
        }
        hashMap.put("d-pcount", String.valueOf(i2));
        hashMap.put("d-emu", String.valueOf(((Boolean) q.getValue()).booleanValue()));
        Lazy lazy2 = p;
        hashMap.put("d-ps-disabled", String.valueOf(((W5) lazy2.getValue()).f6924a));
        String str = ((W5) lazy2.getValue()).b;
        if (str == null) {
            str = "N/A";
        }
        hashMap.put("d-ps-v", str);
        hashMap.put("d-media-volume", String.valueOf(a(AbstractC3914mk.f7252a, z)));
        return hashMap;
    }

    public static final String a() {
        f6965a.getClass();
        return e();
    }

    public static String a(NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type == 0) {
            return type + "|" + subtype;
        }
        if (type != 1) {
            return String.valueOf(type);
        }
        return "1";
    }

    public static String a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "0|" + networkInfo.getSubtype();
        }
        if (networkCapabilities.hasTransport(1)) {
            return "1";
        }
        if (networkCapabilities.hasTransport(2)) {
            return com.ironsource.Fc.e;
        }
        if (networkCapabilities.hasTransport(3)) {
            return "9";
        }
        if (networkCapabilities.hasTransport(4)) {
            return "17";
        }
        if (networkCapabilities.hasTransport(5)) {
            return "10";
        }
        return networkCapabilities.hasTransport(6) ? "11" : "8";
    }

    public final HashMap a(boolean z) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(b(z));
            hashMap.putAll(p());
            return hashMap;
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("Y5", "getSimpleName(...)");
            String str = "SDK encountered unexpected error in getting device info; " + e2.getMessage();
            return hashMap;
        }
    }

    public static final JSONArray b() {
        f6965a.getClass();
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            try {
                J4 j4 = AbstractC4260z4.f7518a;
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                SignalsConfig signalsConfig = (SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "boot_time");
                Intrinsics.checkNotNullParameter("bt", "key");
                JSONArray jSONArray = new JSONArray(a2.f6510a.getString("bt", "[]"));
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long valueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (valueOf != null) {
                    if (Math.abs(valueOf.longValue() - currentTimeMillis) <= signalsConfig.getBts().getThreshold() * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(currentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                a2.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e2) {
                Lazy lazy = Ba.f6473a;
                U9.a(e2);
            }
        }
        return new JSONArray();
    }
}
