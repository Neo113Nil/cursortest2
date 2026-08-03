package com.moloco.sdk.internal.services.bidtoken;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.bidtoken.B f7215a = new com.moloco.sdk.internal.services.bidtoken.B("NEEDS_REFRESH", 0);
    public static final com.moloco.sdk.internal.services.bidtoken.B b = new com.moloco.sdk.internal.services.bidtoken.B("EXPIRING", 1);
    public static final com.moloco.sdk.internal.services.bidtoken.B c = new com.moloco.sdk.internal.services.bidtoken.B("NO_REFRESH_NEEDED", 2);
    public static final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.B[] d;
    public static final /* synthetic */ kotlin.enums.EnumEntries e;

    static {
        com.moloco.sdk.internal.services.bidtoken.B[] a2 = a();
        d = a2;
        e = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public B(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.B[] a() {
        return new com.moloco.sdk.internal.services.bidtoken.B[]{f7215a, b, c};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.services.bidtoken.B> c() {
        return e;
    }

    public static com.moloco.sdk.internal.services.bidtoken.B valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.services.bidtoken.B) java.lang.Enum.valueOf(com.moloco.sdk.internal.services.bidtoken.B.class, str);
    }

    public static com.moloco.sdk.internal.services.bidtoken.B[] values() {
        return (com.moloco.sdk.internal.services.bidtoken.B[]) d.clone();
    }

    public final boolean b() {
        return this == b || this == c;
    }
}
