package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class ye {
    private static String gm = null;
    private static volatile boolean oo = true;
    private static String pcc;
    private static String sf;

    /* JADX INFO: Access modifiers changed from: private */
    public static void vj() {
        String str;
        String str2;
        String str3;
        if (com.bytedance.sdk.openadsdk.core.lu.pcc() == null) {
            return;
        }
        oo = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.lu.pcc().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0) {
                    oo = false;
                } else if (simState == 1) {
                    oo = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("SimUtils", th.getMessage());
            }
            String str4 = null;
            try {
                str = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                str = null;
            }
            try {
                str2 = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                str2 = null;
            }
            if (str2 == null || str2.length() < 5) {
                try {
                    str2 = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(str2) || str2.length() <= 4) {
                str3 = null;
            } else {
                String substring = str2.substring(0, 3);
                str3 = str2.substring(3);
                str4 = substring;
            }
            if (!TextUtils.isEmpty(str)) {
                pcc = str;
            }
            if (!TextUtils.isEmpty(str4)) {
                sf = str4;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            gm = str3;
        } catch (Throwable unused4) {
        }
    }

    public static String pcc() {
        pcc.pcc();
        return pcc;
    }

    public static String sf() {
        try {
            pcc.pcc();
            if (!oo) {
                com.bytedance.sdk.component.utils.lo.gm("MCC", "getMCC" + (oo ? "Have SIM card" : "No SIM card, MCC returns null"));
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.lu.pcc().getResources().getConfiguration();
            String valueOf = configuration.mcc != 0 ? String.valueOf(configuration.mcc) : sf;
            com.bytedance.sdk.component.utils.lo.gm("MCC", "config=" + configuration.mcc + ",sMCC=" + sf);
            return valueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String gm() {
        pcc.pcc();
        return gm;
    }

    public static class pcc extends com.bytedance.sdk.component.kj.sf.gm {
        public static AtomicBoolean pcc = new AtomicBoolean(false);
        private static final AtomicLong sf = new AtomicLong(0);

        public pcc(String str, int i) {
            super(str, i);
        }

        public static void pcc() {
            if (pcc.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = sf;
            if (currentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(currentTimeMillis);
            rnn.gm((Runnable) new pcc("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            pcc.set(true);
            ye.vj();
            pcc.set(false);
        }
    }
}
