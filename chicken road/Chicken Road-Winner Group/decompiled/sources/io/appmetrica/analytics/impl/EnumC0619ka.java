package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0619ka {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f7699a;

    EnumC0619ka(int i3) {
        this.f7699a = i3;
    }

    public static EnumC0619ka a(Integer num) {
        if (num != null) {
            for (EnumC0619ka enumC0619ka : values()) {
                if (enumC0619ka.f7699a == num.intValue()) {
                    return enumC0619ka;
                }
            }
        }
        return UNKNOWN;
    }
}
