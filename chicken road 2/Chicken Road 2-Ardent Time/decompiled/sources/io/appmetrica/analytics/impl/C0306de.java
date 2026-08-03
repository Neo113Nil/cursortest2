package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.de, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306de {
    public static final io.appmetrica.analytics.impl.A9 a(io.appmetrica.analytics.impl.C0306de c0306de, io.appmetrica.analytics.impl.J9 j9) {
        int i2;
        c0306de.getClass();
        io.appmetrica.analytics.impl.A9 a9 = new io.appmetrica.analytics.impl.A9();
        switch (j9) {
            case UNKNOWN:
                i2 = 0;
                break;
            case APPSFLYER:
                i2 = 1;
                break;
            case ADJUST:
                i2 = 2;
                break;
            case KOCHAVA:
                i2 = 3;
                break;
            case TENJIN:
                i2 = 4;
                break;
            case AIRBRIDGE:
                i2 = 5;
                break;
            case SINGULAR:
                i2 = 6;
                break;
            default:
                throw new E1.A();
        }
        a9.f4043a = i2;
        return a9;
    }
}
