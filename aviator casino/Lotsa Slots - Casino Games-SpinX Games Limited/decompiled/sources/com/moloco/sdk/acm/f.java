package com.moloco.sdk.acm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.acm.f f6905a = new com.moloco.sdk.acm.f("INITIALIZED", 0);
    public static final com.moloco.sdk.acm.f b = new com.moloco.sdk.acm.f("INITIALIZING", 1);
    public static final com.moloco.sdk.acm.f c = new com.moloco.sdk.acm.f("UNINITIALIZED", 2);
    public static final /* synthetic */ com.moloco.sdk.acm.f[] d;
    public static final /* synthetic */ kotlin.enums.EnumEntries e;

    static {
        com.moloco.sdk.acm.f[] a2 = a();
        d = a2;
        e = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public f(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.acm.f[] a() {
        return new com.moloco.sdk.acm.f[]{f6905a, b, c};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.acm.f> b() {
        return e;
    }

    public static com.moloco.sdk.acm.f valueOf(java.lang.String str) {
        return (com.moloco.sdk.acm.f) java.lang.Enum.valueOf(com.moloco.sdk.acm.f.class, str);
    }

    public static com.moloco.sdk.acm.f[] values() {
        return (com.moloco.sdk.acm.f[]) d.clone();
    }
}
