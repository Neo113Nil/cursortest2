package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SheetRing {
    public static boolean evictLayout;
    public static final Class growPayload = evictLayout("libcore.io.Memory");
    public static final boolean injectMetric;

    static {
        injectMetric = (evictLayout || evictLayout("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class evictLayout(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class growPayload() {
        return growPayload;
    }

    public static boolean injectMetric() {
        if (evictLayout) {
            return true;
        }
        return (growPayload == null || injectMetric) ? false : true;
    }
}
