package com.moloco.sdk.internal.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.z f7323a = new com.moloco.sdk.internal.services.z("SILENT", 0);
    public static final com.moloco.sdk.internal.services.z b = new com.moloco.sdk.internal.services.z("VIBRATE", 1);
    public static final com.moloco.sdk.internal.services.z c = new com.moloco.sdk.internal.services.z("NORMAL", 2);
    public static final /* synthetic */ com.moloco.sdk.internal.services.z[] d;
    public static final /* synthetic */ kotlin.enums.EnumEntries e;

    static {
        com.moloco.sdk.internal.services.z[] a2 = a();
        d = a2;
        e = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public z(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.services.z[] a() {
        return new com.moloco.sdk.internal.services.z[]{f7323a, b, c};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.services.z> b() {
        return e;
    }

    public static com.moloco.sdk.internal.services.z valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.services.z) java.lang.Enum.valueOf(com.moloco.sdk.internal.services.z.class, str);
    }

    public static com.moloco.sdk.internal.services.z[] values() {
        return (com.moloco.sdk.internal.services.z[]) d.clone();
    }
}
