package com.fyber.inneractive.sdk.config.cellular;

/* loaded from: classes3.dex */
public abstract class e {
    public static com.fyber.inneractive.sdk.config.cellular.d a(android.content.Context context) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 31) {
            return new com.fyber.inneractive.sdk.config.cellular.c(context);
        }
        if (i >= 24) {
            return new com.fyber.inneractive.sdk.config.cellular.g(context);
        }
        return null;
    }
}
