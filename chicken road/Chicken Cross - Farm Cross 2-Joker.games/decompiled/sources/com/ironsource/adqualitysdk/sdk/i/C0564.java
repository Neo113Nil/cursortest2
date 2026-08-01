package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.օ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0564 extends AbstractC0554 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public Context f1279;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0554
    /* renamed from: ﻛ */
    public final boolean mo5522() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f1279.getSystemService(StringFog.decrypt("pfkQqKj6QMg=\n", "xJpkwd6TNLE=\n"))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = this.f1279.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0554
    /* renamed from: ﾒ */
    public final Activity mo5524() {
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0554
    /* renamed from: ﾒ */
    public final synchronized void mo5525(Application application, Activity activity) {
        try {
            if (application != null) {
                this.f1279 = application.getApplicationContext();
            } else if (activity != null) {
                this.f1279 = activity.getApplicationContext();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
