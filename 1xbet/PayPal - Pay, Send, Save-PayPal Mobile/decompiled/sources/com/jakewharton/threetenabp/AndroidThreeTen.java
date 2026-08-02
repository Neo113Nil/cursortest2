package com.jakewharton.threetenabp;

/* loaded from: classes9.dex */
public final class AndroidThreeTen {
    private static final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean();

    public static void init(android.app.Application application) {
        init((android.content.Context) application);
    }

    public static void init(android.content.Context context) {
        init(context, "org/threeten/bp/TZDB.dat");
    }

    public static void init(android.content.Context context, java.lang.String str) {
        if (getHighSpeedVideoFpsRanges.getAndSet(true)) {
            return;
        }
        org.threeten.bp.zone.ZoneRulesInitializer.setInitializer(new com.jakewharton.threetenabp.AssetsZoneRulesInitializer(context, str));
    }

    private AndroidThreeTen() {
        throw new java.lang.AssertionError();
    }
}
