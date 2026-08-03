package com.moloco.sdk.acm.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.acm.db.c f6877a = new com.moloco.sdk.acm.db.c("TIMER", 0);
    public static final com.moloco.sdk.acm.db.c b = new com.moloco.sdk.acm.db.c("COUNT", 1);
    public static final /* synthetic */ com.moloco.sdk.acm.db.c[] c;
    public static final /* synthetic */ kotlin.enums.EnumEntries d;

    static {
        com.moloco.sdk.acm.db.c[] a2 = a();
        c = a2;
        d = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public c(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.acm.db.c[] a() {
        return new com.moloco.sdk.acm.db.c[]{f6877a, b};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.acm.db.c> b() {
        return d;
    }

    public static com.moloco.sdk.acm.db.c valueOf(java.lang.String str) {
        return (com.moloco.sdk.acm.db.c) java.lang.Enum.valueOf(com.moloco.sdk.acm.db.c.class, str);
    }

    public static com.moloco.sdk.acm.db.c[] values() {
        return (com.moloco.sdk.acm.db.c[]) c.clone();
    }
}
