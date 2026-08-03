package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0302da {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f5724a;

    EnumC0302da(int i2) {
        this.f5724a = i2;
    }

    public static io.appmetrica.analytics.impl.EnumC0302da a(java.lang.Integer num) {
        if (num != null) {
            for (io.appmetrica.analytics.impl.EnumC0302da enumC0302da : values()) {
                if (enumC0302da.f5724a == num.intValue()) {
                    return enumC0302da;
                }
            }
        }
        return UNKNOWN;
    }
}
