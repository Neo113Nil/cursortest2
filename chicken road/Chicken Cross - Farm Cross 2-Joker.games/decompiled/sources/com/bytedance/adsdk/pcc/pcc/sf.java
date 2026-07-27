package com.bytedance.adsdk.pcc.pcc;

/* loaded from: classes5.dex */
public class sf extends RuntimeException {
    public sf(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
