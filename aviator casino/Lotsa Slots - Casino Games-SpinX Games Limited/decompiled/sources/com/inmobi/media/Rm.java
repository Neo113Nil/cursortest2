package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Rm {
    public static final com.inmobi.media.Rm b;
    public static final com.inmobi.media.Rm c;
    public static final com.inmobi.media.Rm d;
    public static final com.inmobi.media.Rm e;
    public static final com.inmobi.media.Rm f;
    public static final /* synthetic */ com.inmobi.media.Rm[] g;

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.EnumC2322c8 f4943a;

    static {
        com.inmobi.media.Rm rm = new com.inmobi.media.Rm("UNKNOWN", 0, com.inmobi.media.EnumC2322c8.b);
        b = rm;
        com.inmobi.media.Rm rm2 = new com.inmobi.media.Rm("MALFORMED_URL", 1, com.inmobi.media.EnumC2322c8.d);
        c = rm2;
        com.inmobi.media.Rm rm3 = new com.inmobi.media.Rm("TIMEOUT", 2, com.inmobi.media.EnumC2322c8.e);
        com.inmobi.media.Rm rm4 = new com.inmobi.media.Rm("NETWORK", 3, com.inmobi.media.EnumC2322c8.f);
        d = rm4;
        com.inmobi.media.Rm rm5 = new com.inmobi.media.Rm("NO_URL_FOUND", 4, com.inmobi.media.EnumC2322c8.g);
        e = rm5;
        com.inmobi.media.Rm rm6 = new com.inmobi.media.Rm("INVALID_STATE", 5, com.inmobi.media.EnumC2322c8.c);
        f = rm6;
        com.inmobi.media.Rm[] rmArr = {rm, rm2, rm3, rm4, rm5, rm6};
        g = rmArr;
        kotlin.enums.EnumEntriesKt.enumEntries(rmArr);
    }

    public Rm(java.lang.String str, int i, com.inmobi.media.EnumC2322c8 enumC2322c8) {
        this.f4943a = enumC2322c8;
    }

    public static com.inmobi.media.Rm valueOf(java.lang.String str) {
        return (com.inmobi.media.Rm) java.lang.Enum.valueOf(com.inmobi.media.Rm.class, str);
    }

    public static com.inmobi.media.Rm[] values() {
        return (com.inmobi.media.Rm[]) g.clone();
    }
}
