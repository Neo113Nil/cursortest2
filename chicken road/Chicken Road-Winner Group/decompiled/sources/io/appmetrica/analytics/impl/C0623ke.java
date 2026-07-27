package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623ke {
    public static final H9 a(C0623ke c0623ke, Q9 q9) {
        int i3;
        c0623ke.getClass();
        H9 h9 = new H9();
        switch (q9) {
            case UNKNOWN:
                i3 = 0;
                break;
            case APPSFLYER:
                i3 = 1;
                break;
            case ADJUST:
                i3 = 2;
                break;
            case KOCHAVA:
                i3 = 3;
                break;
            case TENJIN:
                i3 = 4;
                break;
            case AIRBRIDGE:
                i3 = 5;
                break;
            case SINGULAR:
                i3 = 6;
                break;
            default:
                throw new T0.b();
        }
        h9.f6020a = i3;
        return h9;
    }
}
