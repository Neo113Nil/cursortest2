package com.facebook.appevents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class B {
    public static final B a;
    public static final /* synthetic */ B[] b;

    static {
        B b2 = new B();
        a = b2;
        b = new B[]{b2};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) b.clone();
    }
}
