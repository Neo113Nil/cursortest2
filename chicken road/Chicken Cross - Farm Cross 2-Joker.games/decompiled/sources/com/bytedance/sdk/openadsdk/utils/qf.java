package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes4.dex */
public class qf {
    private static long gm = 0;
    static int pcc = -1;
    static float sf;

    private static void pcc(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            pcc = 1;
        } else {
            pcc = 0;
        }
        sf = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static pcc pcc() {
        if (gm == 0 || SystemClock.elapsedRealtime() - gm > 60000) {
            Intent registerReceiver = com.bytedance.sdk.openadsdk.core.lu.pcc().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(registerReceiver)));
            if (registerReceiver != null) {
                pcc(registerReceiver);
                gm = SystemClock.elapsedRealtime();
            }
        }
        pcc pccVar = new pcc(pcc, sf);
        int i = pccVar.pcc;
        float f = pccVar.sf;
        return pccVar;
    }

    public static class pcc {
        public final int pcc;
        public final float sf;

        public pcc(int i, float f) {
            this.pcc = i;
            this.sf = f;
        }
    }
}
