package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class StylusGovernor {
    public static final int evictLayout = Runtime.getRuntime().availableProcessors();

    public static final int evictLayout() {
        return evictLayout;
    }

    public static final String growPayload(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
