package p049g5;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13245i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f13250o;

    public c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f13237a = sharedPreferences;
        this.f13238b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.f13239c = sharedPreferences.getString("androidNotificationChannelId", null);
        this.f13240d = sharedPreferences.getString("androidNotificationChannelName", null);
        this.f13241e = sharedPreferences.getString("androidNotificationChannelDescription", null);
        this.f13242f = sharedPreferences.getInt("notificationColor", -1);
        this.f13243g = sharedPreferences.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.f13244h = sharedPreferences.getBoolean("androidShowNotificationBadge", false);
        this.f13245i = sharedPreferences.getBoolean("androidNotificationClickStartsActivity", true);
        this.j = sharedPreferences.getBoolean("androidNotificationOngoing", false);
        this.f13246k = sharedPreferences.getBoolean("androidStopForegroundOnPause", true);
        this.f13247l = sharedPreferences.getInt("artDownscaleWidth", -1);
        this.f13248m = sharedPreferences.getInt("artDownscaleHeight", -1);
        this.f13249n = sharedPreferences.getString("activityClassName", null);
        this.f13250o = sharedPreferences.getString("androidBrowsableRootExtras", null);
    }

    public final void a() {
        this.f13237a.edit().putBoolean("androidResumeOnClick", this.f13238b).putString("androidNotificationChannelId", this.f13239c).putString("androidNotificationChannelName", this.f13240d).putString("androidNotificationChannelDescription", this.f13241e).putInt("notificationColor", this.f13242f).putString("androidNotificationIcon", this.f13243g).putBoolean("androidShowNotificationBadge", this.f13244h).putBoolean("androidNotificationClickStartsActivity", this.f13245i).putBoolean("androidNotificationOngoing", this.j).putBoolean("androidStopForegroundOnPause", this.f13246k).putInt("artDownscaleWidth", this.f13247l).putInt("artDownscaleHeight", this.f13248m).putString("activityClassName", this.f13249n).putString("androidBrowsableRootExtras", this.f13250o).apply();
    }
}
