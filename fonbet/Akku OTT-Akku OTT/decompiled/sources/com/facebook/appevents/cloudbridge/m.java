package com.facebook.appevents.cloudbridge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {
    public static final m a;
    public static final m b;
    public static final m c;
    public static final /* synthetic */ m[] d;

    static {
        m mVar = new m("USER_DATA", 0);
        a = mVar;
        m mVar2 = new m("APP_DATA", 1);
        b = mVar2;
        m mVar3 = new m("CUSTOM_DATA", 2);
        c = mVar3;
        d = new m[]{mVar, mVar2, mVar3, new m("CUSTOM_EVENTS", 3)};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) d.clone();
    }
}
