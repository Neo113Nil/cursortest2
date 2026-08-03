package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Ib {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Ib f4763a;
    public static final com.inmobi.media.Ib b;
    public static final com.inmobi.media.Ib c;
    public static final com.inmobi.media.Ib d;
    public static final /* synthetic */ com.inmobi.media.Ib[] e;

    static {
        com.inmobi.media.Ib ib = new com.inmobi.media.Ib("INFO", 0);
        f4763a = ib;
        com.inmobi.media.Ib ib2 = new com.inmobi.media.Ib("DEBUG", 1);
        b = ib2;
        com.inmobi.media.Ib ib3 = new com.inmobi.media.Ib("ERROR", 2);
        c = ib3;
        com.inmobi.media.Ib ib4 = new com.inmobi.media.Ib(com.google.ads.mediation.inmobi.InMobiNetworkKeys.STATE, 3);
        d = ib4;
        com.inmobi.media.Ib[] ibArr = {ib, ib2, ib3, ib4};
        e = ibArr;
        kotlin.enums.EnumEntriesKt.enumEntries(ibArr);
    }

    public Ib(java.lang.String str, int i) {
    }

    public static com.inmobi.media.Ib valueOf(java.lang.String str) {
        return (com.inmobi.media.Ib) java.lang.Enum.valueOf(com.inmobi.media.Ib.class, str);
    }

    public static com.inmobi.media.Ib[] values() {
        return (com.inmobi.media.Ib[]) e.clone();
    }
}
