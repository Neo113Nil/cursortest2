package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.fj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2412fj {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.EnumC2412fj f5204a;
    public static final com.inmobi.media.EnumC2412fj b;
    public static final com.inmobi.media.EnumC2412fj c;
    public static final com.inmobi.media.EnumC2412fj d;
    public static final com.inmobi.media.EnumC2412fj e;
    public static final com.inmobi.media.EnumC2412fj f;
    public static final /* synthetic */ com.inmobi.media.EnumC2412fj[] g;

    static {
        com.inmobi.media.EnumC2412fj enumC2412fj = new com.inmobi.media.EnumC2412fj("IDLE", 0);
        f5204a = enumC2412fj;
        com.inmobi.media.EnumC2412fj enumC2412fj2 = new com.inmobi.media.EnumC2412fj("LOADING", 1);
        b = enumC2412fj2;
        com.inmobi.media.EnumC2412fj enumC2412fj3 = new com.inmobi.media.EnumC2412fj("REDIRECTING", 2);
        c = enumC2412fj3;
        com.inmobi.media.EnumC2412fj enumC2412fj4 = new com.inmobi.media.EnumC2412fj("RESOLVE_IN_WEB_VIEW", 3);
        d = enumC2412fj4;
        com.inmobi.media.EnumC2412fj enumC2412fj5 = new com.inmobi.media.EnumC2412fj("EXTERNAL", 4);
        e = enumC2412fj5;
        com.inmobi.media.EnumC2412fj enumC2412fj6 = new com.inmobi.media.EnumC2412fj("DONE", 5);
        f = enumC2412fj6;
        com.inmobi.media.EnumC2412fj[] enumC2412fjArr = {enumC2412fj, enumC2412fj2, enumC2412fj3, enumC2412fj4, enumC2412fj5, enumC2412fj6};
        g = enumC2412fjArr;
        kotlin.enums.EnumEntriesKt.enumEntries(enumC2412fjArr);
    }

    public EnumC2412fj(java.lang.String str, int i) {
    }

    public static com.inmobi.media.EnumC2412fj valueOf(java.lang.String str) {
        return (com.inmobi.media.EnumC2412fj) java.lang.Enum.valueOf(com.inmobi.media.EnumC2412fj.class, str);
    }

    public static com.inmobi.media.EnumC2412fj[] values() {
        return (com.inmobi.media.EnumC2412fj[]) g.clone();
    }
}
