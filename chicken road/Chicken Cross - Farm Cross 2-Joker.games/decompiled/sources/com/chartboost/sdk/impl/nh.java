package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* loaded from: classes4.dex */
public final class nh {
    public final File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str + ".tmp");
    }

    public final boolean b(File file, String str) {
        if (file != null && str != null) {
            try {
                File a2 = a(file, str);
                if (a2 != null) {
                    return a2.exists();
                }
                return false;
            } catch (Exception e) {
                mb.a(e.toString(), (Throwable) null, 2, (Object) null);
            }
        }
        return false;
    }

    public final RandomAccessFile a(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }
}
