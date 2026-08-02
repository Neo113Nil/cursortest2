package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o90 {

    /* JADX INFO: renamed from: b */
    public static boolean f5670b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f5671c = false;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f5673e = 0;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f5669a = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f5672d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static boolean m3652a(Context context) {
        try {
            if (!f5671c) {
                PackageInfo packageInfoM1502e = tk1.m4792a(context).m1502e("com.google.android.gms", 134217792);
                p90.m3876b(context);
                if (packageInfoM1502e == null || p90.m3877g(packageInfoM1502e, false) || !p90.m3877g(packageInfoM1502e, true)) {
                    f5670b = false;
                } else {
                    f5670b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f5671c = true;
        }
        return f5670b || !"user".equals(Build.TYPE);
    }
}
