package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes4.dex */
public class oo {
    private static String gm = null;
    private static volatile int oo = 0;
    private static volatile String pcc = "";
    private static volatile String sf = "";

    public static void pcc() {
        try {
            AppSet.getClient(lu.pcc()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = oo.pcc = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = oo.sf = appSetIdInfo.getId();
                    int unused3 = oo.oo = 1;
                }
            });
        } catch (Throwable unused) {
            oo = 2;
        }
    }

    public static String sf() {
        if (oo != 0) {
            return pcc;
        }
        pcc();
        return pcc;
    }

    public static String gm() {
        if (oo != 0) {
            return sf;
        }
        pcc();
        return sf;
    }

    public static String oo() {
        if (TextUtils.isEmpty(gm)) {
            gm = lu.pcc().getPackageManager().getInstallerPackageName(kun.wh());
        }
        if (gm == null) {
            gm = "";
        }
        return gm;
    }
}
