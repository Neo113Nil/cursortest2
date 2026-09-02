package com.goldenboot.saga.zone;

import android.content.Context;
import android.os.Process;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SlotInjector {
    public static int evictLayout(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String injectMetric = DefaultLoader.injectMetric(str);
        if (injectMetric == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i2 || !ModuleAdministrator.evictLayout(context.getPackageName(), str2)) ? DefaultLoader.growPayload(context, injectMetric, str2) : DefaultLoader.evictLayout(context, i2, injectMetric, str2)) == 0 ? 0 : -2;
    }

    public static int growPayload(Context context, String str) {
        return evictLayout(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
