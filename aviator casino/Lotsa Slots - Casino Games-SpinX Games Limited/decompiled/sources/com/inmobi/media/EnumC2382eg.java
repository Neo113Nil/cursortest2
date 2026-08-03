package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.eg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2382eg {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.EnumC2382eg f5180a;
    public static final com.inmobi.media.EnumC2382eg b;
    public static final /* synthetic */ com.inmobi.media.EnumC2382eg[] c;

    static {
        com.inmobi.media.EnumC2382eg enumC2382eg = new com.inmobi.media.EnumC2382eg("STOPPED", 0);
        f5180a = enumC2382eg;
        com.inmobi.media.EnumC2382eg enumC2382eg2 = new com.inmobi.media.EnumC2382eg("STARTED", 1);
        b = enumC2382eg2;
        com.inmobi.media.EnumC2382eg[] enumC2382egArr = {enumC2382eg, enumC2382eg2};
        c = enumC2382egArr;
        kotlin.enums.EnumEntriesKt.enumEntries(enumC2382egArr);
    }

    public EnumC2382eg(java.lang.String str, int i) {
    }

    public static com.inmobi.media.EnumC2382eg valueOf(java.lang.String str) {
        return (com.inmobi.media.EnumC2382eg) java.lang.Enum.valueOf(com.inmobi.media.EnumC2382eg.class, str);
    }

    public static com.inmobi.media.EnumC2382eg[] values() {
        return (com.inmobi.media.EnumC2382eg[]) c.clone();
    }
}
