package com.plaid.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class L6 {
    public static final com.plaid.internal.L6 ALL;
    public static final com.plaid.internal.L6 ERRORS_ONLY;
    public static final com.plaid.internal.L6 NONE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.plaid.internal.L6[] f5833a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        com.plaid.internal.L6 l6 = new com.plaid.internal.L6("NONE", 0);
        NONE = l6;
        com.plaid.internal.L6 l62 = new com.plaid.internal.L6("ERRORS_ONLY", 1);
        ERRORS_ONLY = l62;
        com.plaid.internal.L6 l63 = new com.plaid.internal.L6("ALL", 2);
        ALL = l63;
        com.plaid.internal.L6[] l6Arr = {l6, l62, l63};
        f5833a = l6Arr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(l6Arr);
    }

    public L6(java.lang.String str, int i) {
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.L6> getEntries() {
        return b;
    }

    public static com.plaid.internal.L6 valueOf(java.lang.String str) {
        return (com.plaid.internal.L6) java.lang.Enum.valueOf(com.plaid.internal.L6.class, str);
    }

    public static com.plaid.internal.L6[] values() {
        return (com.plaid.internal.L6[]) f5833a.clone();
    }
}
