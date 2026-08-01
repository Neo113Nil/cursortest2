package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.lo;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class qf {
    private static final AtomicInteger pcc = new AtomicInteger(1);

    public static boolean pcc() {
        return pcc.get() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static void pcc(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            try {
                AtomicInteger atomicInteger = pcc;
                if (atomicInteger.get() != i) {
                    try {
                        atomicInteger.set(i);
                    } catch (Throwable th) {
                        th = th;
                        lo.gm("SdkSwitch", th.getMessage());
                        if (z) {
                        }
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (z) {
                return;
            }
            Log.e("SdkSwitch", "switch status changed: " + pcc());
            if (pcc()) {
                com.bytedance.sdk.openadsdk.oo.pcc.sf.sf();
            } else {
                com.bytedance.sdk.openadsdk.oo.pcc.sf.gm();
            }
        }
    }
}
