package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Oo {
    public static final Oo b;
    public static final Oo c;
    public static final Oo d;
    public static final Oo e;
    public static final Oo f;
    public static final /* synthetic */ Oo[] g;

    /* renamed from: a, reason: collision with root package name */
    public final E8 f6768a;

    static {
        Oo oo = new Oo("UNKNOWN", 0, E8.b);
        b = oo;
        Oo oo2 = new Oo("MALFORMED_URL", 1, E8.d);
        c = oo2;
        Oo oo3 = new Oo("TIMEOUT", 2, E8.e);
        Oo oo4 = new Oo("NETWORK", 3, E8.f);
        d = oo4;
        Oo oo5 = new Oo("NO_URL_FOUND", 4, E8.g);
        e = oo5;
        Oo oo6 = new Oo("INVALID_STATE", 5, E8.c);
        f = oo6;
        Oo[] ooArr = {oo, oo2, oo3, oo4, oo5, oo6};
        g = ooArr;
        EnumEntriesKt.enumEntries(ooArr);
    }

    public Oo(String str, int i, E8 e8) {
        this.f6768a = e8;
    }

    public static Oo valueOf(String str) {
        return (Oo) Enum.valueOf(Oo.class, str);
    }

    public static Oo[] values() {
        return (Oo[]) g.clone();
    }
}
