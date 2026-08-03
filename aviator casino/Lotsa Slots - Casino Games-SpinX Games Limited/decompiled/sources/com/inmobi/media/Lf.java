package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Lf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Lf f4819a;
    public static final com.inmobi.media.Lf b;
    public static final com.inmobi.media.Lf c;
    public static final com.inmobi.media.Lf d;
    public static final /* synthetic */ com.inmobi.media.Lf[] e;

    static {
        com.inmobi.media.Lf lf = new com.inmobi.media.Lf("PORTRAIT", 0);
        f4819a = lf;
        com.inmobi.media.Lf lf2 = new com.inmobi.media.Lf("LANDSCAPE", 1);
        b = lf2;
        com.inmobi.media.Lf lf3 = new com.inmobi.media.Lf("REVERSE_PORTRAIT", 2);
        c = lf3;
        com.inmobi.media.Lf lf4 = new com.inmobi.media.Lf("REVERSE_LANDSCAPE", 3);
        d = lf4;
        com.inmobi.media.Lf[] lfArr = {lf, lf2, lf3, lf4};
        e = lfArr;
        kotlin.enums.EnumEntriesKt.enumEntries(lfArr);
    }

    public Lf(java.lang.String str, int i) {
    }

    public static com.inmobi.media.Lf valueOf(java.lang.String str) {
        return (com.inmobi.media.Lf) java.lang.Enum.valueOf(com.inmobi.media.Lf.class, str);
    }

    public static com.inmobi.media.Lf[] values() {
        return (com.inmobi.media.Lf[]) e.clone();
    }
}
