package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* loaded from: classes4.dex */
public class nac {
    public static long pcc() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
