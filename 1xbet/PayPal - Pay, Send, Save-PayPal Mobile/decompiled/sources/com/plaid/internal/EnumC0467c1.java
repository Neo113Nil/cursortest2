package com.plaid.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.c1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class EnumC0467c1 {
    public static final com.plaid.internal.EnumC0467c1 BACKEND_DETERMINES;
    public static final com.plaid.internal.EnumC0467c1 DISABLED;
    public static final com.plaid.internal.EnumC0467c1 ENABLED;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.plaid.internal.EnumC0467c1[] f6003a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    /* renamed from: com.plaid.internal.c1$a */
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6004a;

        static {
            int[] iArr = new int[com.plaid.internal.EnumC0467c1.values().length];
            try {
                iArr[com.plaid.internal.EnumC0467c1.ENABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.EnumC0467c1.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.EnumC0467c1.BACKEND_DETERMINES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6004a = iArr;
        }
    }

    static {
        com.plaid.internal.EnumC0467c1 enumC0467c1 = new com.plaid.internal.EnumC0467c1("ENABLED", 0);
        ENABLED = enumC0467c1;
        com.plaid.internal.EnumC0467c1 enumC0467c12 = new com.plaid.internal.EnumC0467c1("DISABLED", 1);
        DISABLED = enumC0467c12;
        com.plaid.internal.EnumC0467c1 enumC0467c13 = new com.plaid.internal.EnumC0467c1("BACKEND_DETERMINES", 2);
        BACKEND_DETERMINES = enumC0467c13;
        com.plaid.internal.EnumC0467c1[] enumC0467c1Arr = {enumC0467c1, enumC0467c12, enumC0467c13};
        f6003a = enumC0467c1Arr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(enumC0467c1Arr);
    }

    public EnumC0467c1(java.lang.String str, int i) {
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.EnumC0467c1> getEntries() {
        return b;
    }

    public static com.plaid.internal.EnumC0467c1 valueOf(java.lang.String str) {
        return (com.plaid.internal.EnumC0467c1) java.lang.Enum.valueOf(com.plaid.internal.EnumC0467c1.class, str);
    }

    public static com.plaid.internal.EnumC0467c1[] values() {
        return (com.plaid.internal.EnumC0467c1[]) f6003a.clone();
    }

    public final boolean isSet() {
        return this != BACKEND_DETERMINES;
    }

    public final boolean toBoolean() {
        int i = com.plaid.internal.EnumC0467c1.a.f6004a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalStateException("Cannot convert BACKEND_DETERMINES to boolean");
    }
}
