package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import androidx.core.util.Consumer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.model.j0;
import com.vungle.ads.internal.network.w;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12076a;
    public final j b;
    public final PowerManager c;
    public final AudioManager d;
    public Long e;
    public String f;
    public Integer g;
    public j0 h;
    public String i;

    public c(Context context, j uaExecutor, PowerManager powerManager, AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uaExecutor, "uaExecutor");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.f12076a = context;
        this.b = uaExecutor;
        this.c = powerManager;
        this.d = audioManager;
        p();
    }

    public final void a(final w consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.b.execute(new Runnable() { // from class: com.vungle.ads.internal.platform.c$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                c.a(c.this, consumer);
            }
        });
    }

    public final String b() {
        return this.f;
    }

    public final Integer c() {
        return this.g;
    }

    public final long d() {
        return Build.TIME;
    }

    public final String e() {
        return a.a(this.f12076a);
    }

    public final String f() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (Build.VERSION.SDK_INT >= 33 ? this.f12076a.getPackageManager().getPackageInfo("com.android.vending", PackageManager.PackageInfoFlags.of(0L)) : this.f12076a.getPackageManager().getPackageInfo("com.android.vending", 0)).versionName;
            this.i = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final long g() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final long h() {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(Long.valueOf((Build.VERSION.SDK_INT >= 33 ? this.f12076a.getPackageManager().getPackageInfo("android", PackageManager.PackageInfoFlags.of(0L)) : this.f12076a.getPackageManager().getPackageInfo("android", 0)).firstInstallTime));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            if (m8082exceptionOrNullimpl instanceof PackageManager.NameNotFoundException) {
                boolean z = u.f12190a;
                t.b("AndroidPlatform", l.a("Error getting OS installation time: ").append(((PackageManager.NameNotFoundException) m8082exceptionOrNullimpl).getLocalizedMessage()).toString());
            }
            m8079constructorimpl = -1L;
        }
        return ((Number) m8079constructorimpl).longValue();
    }

    public final long i() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new b(this.f12076a));
        Long l = this.e;
        if (l != null) {
            return l.longValue();
        }
        long a2 = ((FilePreferences) lazy.getValue()).a("sit", 0L);
        if (a2 == 0) {
            a2 = System.currentTimeMillis();
            ((FilePreferences) lazy.getValue()).b("sit", a2).b();
        }
        this.e = Long.valueOf(a2);
        return a2;
    }

    public final String j() {
        return System.getProperty("http.agent");
    }

    public final float k() {
        try {
            float streamVolume = this.d.getStreamVolume(3) / this.d.getStreamMaxVolume(3);
            if (Float.isNaN(streamVolume)) {
                return 0.0f;
            }
            if (Float.isInfinite(streamVolume) || streamVolume < 0.0f) {
                return 0.0f;
            }
            if (streamVolume > 1.0f) {
                return 1.0f;
            }
            return streamVolume;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public final boolean l() {
        return this.c.isPowerSaveMode();
    }

    public final boolean m() {
        try {
            return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e) {
            boolean z = u.f12190a;
            t.a("AndroidPlatform", "Acquiring external storage state failed", e);
            return false;
        }
    }

    public final boolean n() {
        if (this.d.getRingerMode() != 0) {
            return this.d.getRingerMode() == 1;
        }
        return true;
    }

    public final boolean o() {
        return this.d.getStreamVolume(3) > 0;
    }

    public final void p() {
        String str = this.f;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.f12076a);
                Intrinsics.checkNotNullExpressionValue(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.vungle.ads.internal.platform.c$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        c.a(c.this, (AppSetIdInfo) obj);
                    }
                });
            } catch (Exception e) {
                boolean z = u.f12190a;
                t.b("AndroidPlatform", l.a("Error getting AppSetID: ").append(e.getLocalizedMessage()).toString());
            } catch (NoClassDefFoundError e2) {
                boolean z2 = u.f12190a;
                t.b("AndroidPlatform", l.a("Required libs to get AppSetID Not available: ").append(e2.getLocalizedMessage()).toString());
            }
        }
    }

    public static final void a(c this$0, Consumer consumer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        g.a(this$0.f12076a, consumer);
    }

    public final j0 a() {
        j0 j0Var;
        String a2;
        j0 j0Var2 = this.h;
        if (j0Var2 != null && (a2 = j0Var2.a()) != null && a2.length() != 0) {
            return j0Var2;
        }
        boolean z = true;
        if (StringsKt.equals(Build.MANUFACTURER, "Amazon", true)) {
            j0Var = new j0();
            try {
                ContentResolver contentResolver = this.f12076a.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z = false;
                }
                j0Var.b = z;
                j0Var.f11981a = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException e) {
                boolean z2 = u.f12190a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info: Setting not found.", e);
            } catch (Exception e2) {
                boolean z3 = u.f12190a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info", e2);
            }
        } else {
            j0 j0Var3 = new j0();
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f12076a);
                Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(context)");
                j0Var3.a(advertisingIdInfo.getId());
                j0Var3.a(advertisingIdInfo.isLimitAdTrackingEnabled());
            } catch (GooglePlayServicesNotAvailableException e3) {
                boolean z4 = u.f12190a;
                t.b("AndroidPlatform", l.a("Play services Not available: ").append(e3.getLocalizedMessage()).toString());
            } catch (Exception e4) {
                boolean z5 = u.f12190a;
                t.b("AndroidPlatform", l.a("Error getting Google advertising info: ").append(e4.getLocalizedMessage()).toString());
            } catch (NoClassDefFoundError e5) {
                boolean z6 = u.f12190a;
                t.b("AndroidPlatform", l.a("Play services Not available: ").append(e5.getLocalizedMessage()).toString());
                j0Var3.a(Settings.Secure.getString(this.f12076a.getContentResolver(), "advertising_id"));
            }
            j0Var = j0Var3;
        }
        this.h = j0Var;
        return j0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(Context context, j jVar) {
        this(context, jVar, (PowerManager) r0, (AudioManager) r1);
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        Object systemService2 = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
    }

    public static final void a(c this$0, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.f = appSetIdInfo.getId();
            this$0.g = Integer.valueOf(appSetIdInfo.getScope());
        }
    }
}
