package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class gpj {
    public static void pcc() {
        Context pcc = com.bytedance.sdk.openadsdk.core.lu.pcc();
        if (pcc != null && com.bytedance.sdk.component.utils.jr.gm()) {
            String packageName = pcc.getPackageName();
            int i = pcc.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = pcc.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr != null && strArr.length > 0) {
                    List<String> sf = sf();
                    for (String str : strArr) {
                        if (str != null) {
                            sf.remove(str);
                        }
                    }
                    if (!sf.isEmpty()) {
                        Iterator<String> it = sf.iterator();
                        while (it.hasNext()) {
                            new StringBuilder("    May be missing permissions：").append(it.next());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            if (i < 23) {
                try {
                    new StringBuilder("No adaptation required for dynamic permissions：target=").append(i).append("&phone=").append(Build.VERSION.SDK_INT);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private static List<String> sf() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
