package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Vp {

    /* renamed from: a, reason: collision with root package name */
    public static final Vp f6918a;
    public static final Vp b;
    public static final Vp c;
    public static final /* synthetic */ Vp[] d;

    static {
        Vp vp = new Vp("UNKNOWN", 0);
        f6918a = vp;
        Vp vp2 = new Vp("HIDDEN", 1);
        b = vp2;
        Vp vp3 = new Vp("VISIBLE", 2);
        c = vp3;
        Vp[] vpArr = {vp, vp2, vp3};
        d = vpArr;
        EnumEntriesKt.enumEntries(vpArr);
    }

    public Vp(String str, int i) {
    }

    public static Vp valueOf(String str) {
        return (Vp) Enum.valueOf(Vp.class, str);
    }

    public static Vp[] values() {
        return (Vp[]) d.clone();
    }
}
