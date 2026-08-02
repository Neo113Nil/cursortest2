package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kn0 {

    /* JADX INFO: renamed from: a */
    public final Context f4460a;

    /* JADX INFO: renamed from: b */
    public final ActivityManager f4461b;

    /* JADX INFO: renamed from: c */
    public final an0 f4462c;

    /* JADX INFO: renamed from: d */
    public final float f4463d;

    public kn0(Context context) {
        this.f4463d = 1.0f;
        this.f4460a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f4461b = activityManager;
        this.f4462c = new an0(1, context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f4463d = 0.0f;
        }
    }
}
