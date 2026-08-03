package com.moloco.sdk.internal.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.H f7205a = new com.moloco.sdk.internal.services.H("UNKNOWN", 0);
    public static final com.moloco.sdk.internal.services.H b = new com.moloco.sdk.internal.services.H("PORTRAIT", 1);
    public static final com.moloco.sdk.internal.services.H c = new com.moloco.sdk.internal.services.H("LANDSCAPE", 2);
    public static final /* synthetic */ com.moloco.sdk.internal.services.H[] d;
    public static final /* synthetic */ kotlin.enums.EnumEntries e;

    static {
        com.moloco.sdk.internal.services.H[] a2 = a();
        d = a2;
        e = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public H(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.services.H[] a() {
        return new com.moloco.sdk.internal.services.H[]{f7205a, b, c};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.services.H> b() {
        return e;
    }

    public static com.moloco.sdk.internal.services.H valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.services.H) java.lang.Enum.valueOf(com.moloco.sdk.internal.services.H.class, str);
    }

    public static com.moloco.sdk.internal.services.H[] values() {
        return (com.moloco.sdk.internal.services.H[]) d.clone();
    }
}
