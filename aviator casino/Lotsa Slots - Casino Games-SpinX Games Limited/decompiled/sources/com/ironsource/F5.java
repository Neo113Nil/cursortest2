package com.ironsource;

/* loaded from: classes5.dex */
class F5 {

    /* renamed from: a, reason: collision with root package name */
    static final java.lang.String f5697a = "ironbeast";
    static final java.lang.String b = "outcome";
    static final int c = 4;
    static final int d = 3;
    static final int e = 2;
    static final int f = 0;

    F5() {
    }

    static com.ironsource.AbstractC3014e a(java.lang.String str, int i) {
        if (f5697a.equals(str)) {
            return new com.ironsource.C3061ga(i);
        }
        if (b.equals(str)) {
            return new com.ironsource.Tc(i);
        }
        if (i == 2) {
            return new com.ironsource.C3061ga(i);
        }
        if (i == 3) {
            return new com.ironsource.Tc(i);
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
