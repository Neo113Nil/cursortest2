package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Jg {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Jg f4782a;
    public static final com.inmobi.media.Jg b;
    public static final /* synthetic */ com.inmobi.media.Jg[] c;

    static {
        com.inmobi.media.Jg jg = new com.inmobi.media.Jg("HIGHEST", 0);
        f4782a = jg;
        com.inmobi.media.Jg jg2 = new com.inmobi.media.Jg("REGULAR", 1);
        b = jg2;
        com.inmobi.media.Jg[] jgArr = {jg, jg2};
        c = jgArr;
        kotlin.enums.EnumEntriesKt.enumEntries(jgArr);
    }

    public Jg(java.lang.String str, int i) {
    }

    public static com.inmobi.media.Jg valueOf(java.lang.String str) {
        return (com.inmobi.media.Jg) java.lang.Enum.valueOf(com.inmobi.media.Jg.class, str);
    }

    public static com.inmobi.media.Jg[] values() {
        return (com.inmobi.media.Jg[]) c.clone();
    }
}
