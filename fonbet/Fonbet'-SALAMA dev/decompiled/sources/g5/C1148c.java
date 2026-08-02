package g5;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: g5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1148c {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13231a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13232b;

    /* renamed from: c, reason: collision with root package name */
    public String f13233c;

    /* renamed from: d, reason: collision with root package name */
    public String f13234d;

    /* renamed from: e, reason: collision with root package name */
    public String f13235e;

    /* renamed from: f, reason: collision with root package name */
    public int f13236f;

    /* renamed from: g, reason: collision with root package name */
    public String f13237g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13238h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13239i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13240k;

    /* renamed from: l, reason: collision with root package name */
    public int f13241l;

    /* renamed from: m, reason: collision with root package name */
    public int f13242m;

    /* renamed from: n, reason: collision with root package name */
    public String f13243n;

    /* renamed from: o, reason: collision with root package name */
    public String f13244o;

    public C1148c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f13231a = sharedPreferences;
        this.f13232b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.f13233c = sharedPreferences.getString("androidNotificationChannelId", null);
        this.f13234d = sharedPreferences.getString("androidNotificationChannelName", null);
        this.f13235e = sharedPreferences.getString("androidNotificationChannelDescription", null);
        this.f13236f = sharedPreferences.getInt("notificationColor", -1);
        this.f13237g = sharedPreferences.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.f13238h = sharedPreferences.getBoolean("androidShowNotificationBadge", false);
        this.f13239i = sharedPreferences.getBoolean("androidNotificationClickStartsActivity", true);
        this.j = sharedPreferences.getBoolean("androidNotificationOngoing", false);
        this.f13240k = sharedPreferences.getBoolean("androidStopForegroundOnPause", true);
        this.f13241l = sharedPreferences.getInt("artDownscaleWidth", -1);
        this.f13242m = sharedPreferences.getInt("artDownscaleHeight", -1);
        this.f13243n = sharedPreferences.getString("activityClassName", null);
        this.f13244o = sharedPreferences.getString("androidBrowsableRootExtras", null);
    }

    public final void a() {
        this.f13231a.edit().putBoolean("androidResumeOnClick", this.f13232b).putString("androidNotificationChannelId", this.f13233c).putString("androidNotificationChannelName", this.f13234d).putString("androidNotificationChannelDescription", this.f13235e).putInt("notificationColor", this.f13236f).putString("androidNotificationIcon", this.f13237g).putBoolean("androidShowNotificationBadge", this.f13238h).putBoolean("androidNotificationClickStartsActivity", this.f13239i).putBoolean("androidNotificationOngoing", this.j).putBoolean("androidStopForegroundOnPause", this.f13240k).putInt("artDownscaleWidth", this.f13241l).putInt("artDownscaleHeight", this.f13242m).putString("activityClassName", this.f13243n).putString("androidBrowsableRootExtras", this.f13244o).apply();
    }
}
