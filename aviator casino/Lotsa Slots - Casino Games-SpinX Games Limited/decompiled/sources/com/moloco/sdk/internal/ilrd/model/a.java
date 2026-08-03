package com.moloco.sdk.internal.ilrd.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.ilrd.model.a f6994a = new com.moloco.sdk.internal.ilrd.model.a("MAX", 0);
    public static final com.moloco.sdk.internal.ilrd.model.a b = new com.moloco.sdk.internal.ilrd.model.a("LEVELPLAY", 1);
    public static final /* synthetic */ com.moloco.sdk.internal.ilrd.model.a[] c;
    public static final /* synthetic */ kotlin.enums.EnumEntries d;

    static {
        com.moloco.sdk.internal.ilrd.model.a[] a2 = a();
        c = a2;
        d = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public a(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.ilrd.model.a[] a() {
        return new com.moloco.sdk.internal.ilrd.model.a[]{f6994a, b};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.ilrd.model.a> b() {
        return d;
    }

    public static com.moloco.sdk.internal.ilrd.model.a valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.ilrd.model.a) java.lang.Enum.valueOf(com.moloco.sdk.internal.ilrd.model.a.class, str);
    }

    public static com.moloco.sdk.internal.ilrd.model.a[] values() {
        return (com.moloco.sdk.internal.ilrd.model.a[]) c.clone();
    }
}
