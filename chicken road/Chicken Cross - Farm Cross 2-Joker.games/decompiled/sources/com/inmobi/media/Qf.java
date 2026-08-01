package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Qf {

    /* renamed from: a, reason: collision with root package name */
    public static final Qf f6803a;
    public static final Qf b;
    public static final Qf c;
    public static final Qf d;
    public static final /* synthetic */ Qf[] e;

    static {
        Qf qf = new Qf("UNAVAILABLE", 0);
        f6803a = qf;
        Qf qf2 = new Qf("SLOW", 1);
        b = qf2;
        Qf qf3 = new Qf("MEDIUM", 2);
        c = qf3;
        Qf qf4 = new Qf("FAST", 3);
        d = qf4;
        Qf[] qfArr = {qf, qf2, qf3, qf4};
        e = qfArr;
        EnumEntriesKt.enumEntries(qfArr);
    }

    public Qf(String str, int i) {
    }

    public static Qf valueOf(String str) {
        return (Qf) Enum.valueOf(Qf.class, str);
    }

    public static Qf[] values() {
        return (Qf[]) e.clone();
    }
}
