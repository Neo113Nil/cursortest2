package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hg {

    /* renamed from: a, reason: collision with root package name */
    public static final Hg f6605a;
    public static final Hg b;
    public static final Hg c;
    public static final Hg d;
    public static final /* synthetic */ Hg[] e;

    static {
        Hg hg = new Hg("PORTRAIT", 0);
        f6605a = hg;
        Hg hg2 = new Hg("LANDSCAPE", 1);
        b = hg2;
        Hg hg3 = new Hg("REVERSE_PORTRAIT", 2);
        c = hg3;
        Hg hg4 = new Hg("REVERSE_LANDSCAPE", 3);
        d = hg4;
        Hg[] hgArr = {hg, hg2, hg3, hg4};
        e = hgArr;
        EnumEntriesKt.enumEntries(hgArr);
    }

    public Hg(String str, int i) {
    }

    public static Hg valueOf(String str) {
        return (Hg) Enum.valueOf(Hg.class, str);
    }

    public static Hg[] values() {
        return (Hg[]) e.clone();
    }
}
