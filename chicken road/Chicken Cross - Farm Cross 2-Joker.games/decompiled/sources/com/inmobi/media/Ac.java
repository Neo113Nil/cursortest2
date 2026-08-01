package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Ac {

    /* renamed from: a, reason: collision with root package name */
    public static final Ac f6454a;
    public static final Ac b;
    public static final Ac c;
    public static final Ac d;
    public static final /* synthetic */ Ac[] e;

    static {
        Ac ac = new Ac("INFO", 0);
        f6454a = ac;
        Ac ac2 = new Ac("DEBUG", 1);
        b = ac2;
        Ac ac3 = new Ac("ERROR", 2);
        c = ac3;
        Ac ac4 = new Ac("STATE", 3);
        d = ac4;
        Ac[] acArr = {ac, ac2, ac3, ac4};
        e = acArr;
        EnumEntriesKt.enumEntries(acArr);
    }

    public Ac(String str, int i) {
    }

    public static Ac valueOf(String str) {
        return (Ac) Enum.valueOf(Ac.class, str);
    }

    public static Ac[] values() {
        return (Ac[]) e.clone();
    }
}
