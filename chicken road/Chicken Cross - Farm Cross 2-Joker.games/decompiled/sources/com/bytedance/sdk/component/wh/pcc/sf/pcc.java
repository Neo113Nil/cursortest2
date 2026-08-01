package com.bytedance.sdk.component.wh.pcc.sf;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.sdk.component.wh.pcc.pcc.vj;
import com.bytedance.sdk.component.wh.pcc.qf;

/* loaded from: classes4.dex */
public class pcc {
    public static long pcc(int i, Context context) {
        return sf(i, context);
    }

    private static long sf(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long maxMemory = (runtime.maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - (runtime.totalMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        if (maxMemory <= 0) {
            if (freeMemory <= 2) {
                return 1L;
            }
            if (freeMemory <= 10) {
                return Math.min(i, 10);
            }
            return Math.min((freeMemory / 2) * 10, i);
        }
        long j = ((freeMemory + maxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        if (j <= 10) {
            return Math.min(i, 10);
        }
        return Math.min(j * 10, i);
    }

    public static boolean pcc() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.pcc())) ? false : true;
    }

    public static boolean sf() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.sf())) ? false : true;
    }

    public static boolean gm() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.oo())) ? false : true;
    }

    public static boolean oo() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.vj())) ? false : true;
    }

    public static boolean vj() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.gm())) ? false : true;
    }

    public static boolean wh() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.wh())) ? false : true;
    }
}
