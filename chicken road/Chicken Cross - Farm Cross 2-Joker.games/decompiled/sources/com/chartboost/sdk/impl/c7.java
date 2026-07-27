package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.LGPD;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c7 {

    /* renamed from: a, reason: collision with root package name */
    public static final c7 f4705a = new c7();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a c = new a("BUILTIN_SPEAKER", 0, 0);
        public static final a d = new a("WIRED_HEADPHONES", 1, 1);
        public static final a e = new a("BLUETOOTH_A2DP", 2, 2);
        public static final a f = new a(NativeAdContent.ViewTag.OTHER, 3, 3);
        public static final /* synthetic */ a[] g;
        public static final /* synthetic */ EnumEntries h;
        public final int b;

        static {
            a[] a2 = a();
            g = a2;
            h = EnumEntriesKt.enumEntries(a2);
        }

        public a(String str, int i, int i2) {
            this.b = i2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{c, d, e, f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }

        public final int b() {
            return this.b;
        }
    }

    public final d7 a(i9 i9Var, tg tgVar, String str, ve privacyApi, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object consent;
        Object consent2;
        Object consent3;
        Object consent4;
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        e7 e7Var = e7.f4748a;
        if (!e7Var.p()) {
            mb.b("EnvironmentManager not initialized. Call EnvironmentManager.init() first.", (Throwable) null, 2, (Object) null);
            return new d7(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
        Application d = e7Var.d();
        b c = c(d);
        String a2 = a((Context) d);
        long d2 = d(d);
        long a3 = a();
        int b2 = b(d);
        boolean e = e(d);
        int a4 = a(d);
        if (tgVar == null || (str3 = tgVar.c()) == null) {
            str3 = "session not ready";
        }
        String str8 = str3;
        int f = tgVar != null ? tgVar.f() : -1;
        String str9 = str2 == null ? "App was not init yet" : str2;
        String c2 = e7Var.c();
        DataUseConsent a5 = privacyApi.a("gdpr");
        if (a5 == null || (consent4 = a5.getConsent()) == null || (str4 = consent4.toString()) == null) {
            str4 = "gdpr not available";
        }
        String str10 = str4;
        DataUseConsent a6 = privacyApi.a(CCPA.CCPA_STANDARD);
        if (a6 == null || (consent3 = a6.getConsent()) == null || (str5 = consent3.toString()) == null) {
            str5 = "ccpa not available";
        }
        String str11 = str5;
        DataUseConsent a7 = privacyApi.a(COPPA.COPPA_STANDARD);
        if (a7 == null || (consent2 = a7.getConsent()) == null || (str6 = consent2.toString()) == null) {
            str6 = "coppa not available";
        }
        String str12 = str6;
        DataUseConsent a8 = privacyApi.a(LGPD.LGPD_STANDARD);
        if (a8 == null || (consent = a8.getConsent()) == null || (str7 = consent.toString()) == null) {
            str7 = "lgpd not available";
        }
        return new d7(str8, f, str9, c2, "9.13.0", false, str10, str11, str12, str7, a(i9Var), e7Var.h(), e7Var.i(), e7Var.j(), e7Var.k(), e7Var.e(), e7Var.g(), e7Var.l(), str == null ? "connection type not provided" : str, a2, c.a(), c.b(), b2, e, a4, d2, a3, tgVar != null ? tgVar.d() : 0, tgVar != null ? tgVar.e() : 0, tgVar != null ? tgVar.a() : 0, tgVar != null ? tgVar.b() : -1L, SystemClock.uptimeMillis());
    }

    public final int b(Application application) {
        if (application == null) {
            return -1;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (int) ((streamVolume / streamMaxVolume) * 100);
            }
            return -1;
        } catch (Exception e) {
            mb.a("Cannot create environment audio for tracking", e);
            return -1;
        }
    }

    public final long d(Application application) {
        if (application == null) {
            return -1L;
        }
        try {
            return new StatFs(application.getCacheDir() + "/.chartboost").getAvailableBytes();
        } catch (Exception e) {
            mb.a("Cannot create environment device storage for tracking", e);
            return -1L;
        }
    }

    public final boolean e(Application application) {
        if (application == null) {
            return false;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((AudioManager) systemService).getRingerMode() != 2;
        } catch (Exception e) {
            mb.a("Cannot create environment audio for tracking", e);
            return false;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f4706a;
        public final boolean b;

        public b(int i, boolean z) {
            this.f4706a = i;
            this.b = z;
        }

        public final int a() {
            return this.f4706a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4706a == bVar.f4706a && this.b == bVar.b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f4706a) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "DeviceBattery(batteryLevel=" + this.f4706a + ", isCharging=" + this.b + ")";
        }

        public /* synthetic */ b(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b c(Application application) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 3;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            if (application == null) {
                return new b(i2, objArr3 == true ? 1 : 0, i, defaultConstructorMarker);
            }
            Object systemService = application.getSystemService("batterymanager");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            BatteryManager batteryManager = (BatteryManager) systemService;
            return new b(batteryManager.getIntProperty(4), batteryManager.isCharging());
        } catch (Exception e) {
            mb.a("Cannot create environment device battery for tracking", e);
            return new b(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i, defaultConstructorMarker);
        }
    }

    public final int b(AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        Intrinsics.checkNotNull(devices);
        if (devices.length == 0) {
            return a.f.b();
        }
        AudioDeviceInfo audioDeviceInfo = devices[0];
        Intrinsics.checkNotNullExpressionValue(audioDeviceInfo, "get(...)");
        int type = audioDeviceInfo.getType();
        if (type == 2) {
            return a.c.b();
        }
        if (type == 4) {
            return a.d.b();
        }
        if (type != 8) {
            return a.f.b();
        }
        return a.e.b();
    }

    public final String a(i9 i9Var) {
        String f = e7.f4748a.f();
        if (!Intrinsics.areEqual(f, "unknown")) {
            return f;
        }
        if (i9Var != null) {
            String a2 = i9Var.a();
            if (a2 == null) {
                a2 = i9Var.g();
            }
            if (a2 != null) {
                return a2;
            }
        }
        return "unknown";
    }

    public final String a(Context context) {
        try {
            q6 m = e7.f4748a.m();
            if (m != null) {
                String b2 = je.b(context, m);
                if (b2 != null) {
                    return b2;
                }
            }
            return "Cannot retrieve orientation";
        } catch (Exception e) {
            mb.a("Cannot retrieve orientation", e);
            return "Cannot retrieve orientation";
        }
    }

    public final long a() {
        try {
            Runtime runtime = Runtime.getRuntime();
            return (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e) {
            mb.a("Cannot create environment runtime for tracking", e);
            return -1L;
        }
    }

    public final int a(Application application) {
        try {
            if (application == null) {
                return a.f.b();
            }
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return b((AudioManager) systemService);
        } catch (Exception e) {
            mb.a("Cannot create environment audio output for tracking", e);
            return a.f.b();
        }
    }

    public final int a(AudioManager audioManager) {
        if (audioManager.isSpeakerphoneOn()) {
            return a.c.b();
        }
        return a.f.b();
    }
}
