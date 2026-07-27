package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* loaded from: classes4.dex */
public class hc {
    public static void pcc(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
