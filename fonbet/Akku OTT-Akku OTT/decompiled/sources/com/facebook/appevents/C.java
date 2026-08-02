package com.facebook.appevents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class C {
    public static final C a;
    public static final C b;
    public static final C c;
    public static final /* synthetic */ C[] d;

    static {
        C c2 = new C("CustomData", 0);
        a = c2;
        C c3 = new C("OperationalData", 1);
        b = c3;
        C c4 = new C("CustomAndOperationalData", 2);
        c = c4;
        d = new C[]{c2, c3, c4};
    }

    public C() {
        throw null;
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) d.clone();
    }
}
