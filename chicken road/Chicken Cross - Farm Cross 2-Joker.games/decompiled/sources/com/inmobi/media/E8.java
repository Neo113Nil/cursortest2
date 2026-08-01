package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class E8 {
    public static final E8 b;
    public static final E8 c;
    public static final E8 d;
    public static final E8 e;
    public static final E8 f;
    public static final E8 g;
    public static final /* synthetic */ E8[] h;

    /* renamed from: a, reason: collision with root package name */
    public final short f6531a;

    static {
        E8 e8 = new E8(0, "UNDEFINED_ERROR", (short) 10001);
        b = e8;
        E8 e82 = new E8(1, "INVALID_STATE", (short) 10002);
        c = e82;
        E8 e83 = new E8(2, "MALFORMED_URL", (short) 10003);
        d = e83;
        E8 e84 = new E8(3, "TIMEOUT", (short) 10004);
        e = e84;
        E8 e85 = new E8(4, "NETWORK", (short) 10005);
        f = e85;
        E8 e86 = new E8(5, "NO_URL_FOUND", (short) 10006);
        g = e86;
        E8[] e8Arr = {e8, e82, e83, e84, e85, e86};
        h = e8Arr;
        EnumEntriesKt.enumEntries(e8Arr);
    }

    public E8(int i, String str, short s) {
        this.f6531a = s;
    }

    public static E8 valueOf(String str) {
        return (E8) Enum.valueOf(E8.class, str);
    }

    public static E8[] values() {
        return (E8[]) h.clone();
    }
}
