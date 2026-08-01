package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Sh {

    /* renamed from: a, reason: collision with root package name */
    public static final Sh f6852a;
    public static final Sh b;
    public static final /* synthetic */ Sh[] c;

    static {
        Sh sh = new Sh("HIGHEST", 0);
        f6852a = sh;
        Sh sh2 = new Sh("REGULAR", 1);
        b = sh2;
        Sh[] shArr = {sh, sh2};
        c = shArr;
        EnumEntriesKt.enumEntries(shArr);
    }

    public Sh(String str, int i) {
    }

    public static Sh valueOf(String str) {
        return (Sh) Enum.valueOf(Sh.class, str);
    }

    public static Sh[] values() {
        return (Sh[]) c.clone();
    }
}
