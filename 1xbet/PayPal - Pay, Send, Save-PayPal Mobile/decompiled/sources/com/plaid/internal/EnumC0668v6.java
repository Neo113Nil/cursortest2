package com.plaid.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.v6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class EnumC0668v6 {
    public static final com.plaid.internal.EnumC0668v6 ENQUEUE;
    public static final com.plaid.internal.EnumC0668v6 ENQUEUE_AND_FLUSH;
    public static final com.plaid.internal.EnumC0668v6 NO_ENQUEUE;
    public static final com.plaid.internal.EnumC0668v6 UNKNOWN;
    public static final /* synthetic */ com.plaid.internal.EnumC0668v6[] b;
    public static final /* synthetic */ kotlin.enums.EnumEntries c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6601a;

    static {
        com.plaid.internal.EnumC0668v6 enumC0668v6 = new com.plaid.internal.EnumC0668v6("ENQUEUE", 0, "QUEUE_BEHAVIOR_ENQUEUE");
        ENQUEUE = enumC0668v6;
        com.plaid.internal.EnumC0668v6 enumC0668v62 = new com.plaid.internal.EnumC0668v6("ENQUEUE_AND_FLUSH", 1, "QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH");
        ENQUEUE_AND_FLUSH = enumC0668v62;
        com.plaid.internal.EnumC0668v6 enumC0668v63 = new com.plaid.internal.EnumC0668v6("NO_ENQUEUE", 2, "QUEUE_BEHAVIOR_NO_ENQUEUE");
        NO_ENQUEUE = enumC0668v63;
        com.plaid.internal.EnumC0668v6 enumC0668v64 = new com.plaid.internal.EnumC0668v6("UNKNOWN", 3, "QUEUE_BEHAVIOR_UNKNOWN");
        UNKNOWN = enumC0668v64;
        com.plaid.internal.EnumC0668v6[] enumC0668v6Arr = {enumC0668v6, enumC0668v62, enumC0668v63, enumC0668v64};
        b = enumC0668v6Arr;
        c = kotlin.enums.EnumEntriesKt.enumEntries(enumC0668v6Arr);
    }

    public EnumC0668v6(java.lang.String str, int i, java.lang.String str2) {
        this.f6601a = str2;
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.EnumC0668v6> getEntries() {
        return c;
    }

    public static com.plaid.internal.EnumC0668v6 valueOf(java.lang.String str) {
        return (com.plaid.internal.EnumC0668v6) java.lang.Enum.valueOf(com.plaid.internal.EnumC0668v6.class, str);
    }

    public static com.plaid.internal.EnumC0668v6[] values() {
        return (com.plaid.internal.EnumC0668v6[]) b.clone();
    }

    public final java.lang.String getProtoString() {
        return this.f6601a;
    }
}
