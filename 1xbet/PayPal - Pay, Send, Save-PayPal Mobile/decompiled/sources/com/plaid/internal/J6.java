package com.plaid.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class J6 {
    public static final com.plaid.internal.J6 DEBUG;
    public static final com.plaid.internal.J6 ERROR;
    public static final com.plaid.internal.J6 INFO;
    public static final com.plaid.internal.J6 WARN;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.plaid.internal.J6[] f5819a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        com.plaid.internal.J6 j6 = new com.plaid.internal.J6("DEBUG", 0);
        DEBUG = j6;
        com.plaid.internal.J6 j62 = new com.plaid.internal.J6("INFO", 1);
        INFO = j62;
        com.plaid.internal.J6 j63 = new com.plaid.internal.J6("WARN", 2);
        WARN = j63;
        com.plaid.internal.J6 j64 = new com.plaid.internal.J6("ERROR", 3);
        ERROR = j64;
        com.plaid.internal.J6[] j6Arr = {j6, j62, j63, j64};
        f5819a = j6Arr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(j6Arr);
    }

    public J6(java.lang.String str, int i) {
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.J6> getEntries() {
        return b;
    }

    public static com.plaid.internal.J6 valueOf(java.lang.String str) {
        return (com.plaid.internal.J6) java.lang.Enum.valueOf(com.plaid.internal.J6.class, str);
    }

    public static com.plaid.internal.J6[] values() {
        return (com.plaid.internal.J6[]) f5819a.clone();
    }
}
