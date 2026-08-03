package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.c8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2322c8 {
    public static final com.inmobi.media.EnumC2322c8 b;
    public static final com.inmobi.media.EnumC2322c8 c;
    public static final com.inmobi.media.EnumC2322c8 d;
    public static final com.inmobi.media.EnumC2322c8 e;
    public static final com.inmobi.media.EnumC2322c8 f;
    public static final com.inmobi.media.EnumC2322c8 g;
    public static final /* synthetic */ com.inmobi.media.EnumC2322c8[] h;

    /* renamed from: a, reason: collision with root package name */
    public final short f5136a;

    static {
        com.inmobi.media.EnumC2322c8 enumC2322c8 = new com.inmobi.media.EnumC2322c8("UNDEFINED_ERROR", 0, (short) 10001);
        b = enumC2322c8;
        com.inmobi.media.EnumC2322c8 enumC2322c82 = new com.inmobi.media.EnumC2322c8("INVALID_STATE", 1, (short) 10002);
        c = enumC2322c82;
        com.inmobi.media.EnumC2322c8 enumC2322c83 = new com.inmobi.media.EnumC2322c8("MALFORMED_URL", 2, (short) 10003);
        d = enumC2322c83;
        com.inmobi.media.EnumC2322c8 enumC2322c84 = new com.inmobi.media.EnumC2322c8("TIMEOUT", 3, (short) 10004);
        e = enumC2322c84;
        com.inmobi.media.EnumC2322c8 enumC2322c85 = new com.inmobi.media.EnumC2322c8("NETWORK", 4, (short) 10005);
        f = enumC2322c85;
        com.inmobi.media.EnumC2322c8 enumC2322c86 = new com.inmobi.media.EnumC2322c8("NO_URL_FOUND", 5, (short) 10006);
        g = enumC2322c86;
        com.inmobi.media.EnumC2322c8[] enumC2322c8Arr = {enumC2322c8, enumC2322c82, enumC2322c83, enumC2322c84, enumC2322c85, enumC2322c86};
        h = enumC2322c8Arr;
        kotlin.enums.EnumEntriesKt.enumEntries(enumC2322c8Arr);
    }

    public EnumC2322c8(java.lang.String str, int i, short s) {
        this.f5136a = s;
    }

    public static com.inmobi.media.EnumC2322c8 valueOf(java.lang.String str) {
        return (com.inmobi.media.EnumC2322c8) java.lang.Enum.valueOf(com.inmobi.media.EnumC2322c8.class, str);
    }

    public static com.inmobi.media.EnumC2322c8[] values() {
        return (com.inmobi.media.EnumC2322c8[]) h.clone();
    }
}
