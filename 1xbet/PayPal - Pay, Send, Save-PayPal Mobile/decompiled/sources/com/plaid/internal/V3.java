package com.plaid.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class V3 {
    public static final com.plaid.internal.V3 ASSERT;
    public static final com.plaid.internal.V3.a Companion;
    public static final com.plaid.internal.V3 DEBUG;
    public static final com.plaid.internal.V3 ERROR;
    public static final com.plaid.internal.V3 INFO;
    public static final com.plaid.internal.V3 VERBOSE;
    public static final com.plaid.internal.V3 WARN;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.plaid.internal.V3[] f5951a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    public static final class a {

        /* renamed from: com.plaid.internal.V3$a$a, reason: collision with other inner class name */
        public final /* synthetic */ class C0157a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5952a;

            static {
                int[] iArr = new int[com.plaid.internal.V3.values().length];
                try {
                    iArr[com.plaid.internal.V3.ASSERT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.plaid.internal.V3.DEBUG.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.plaid.internal.V3.ERROR.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.plaid.internal.V3.INFO.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.plaid.internal.V3.VERBOSE.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.plaid.internal.V3.WARN.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                f5952a = iArr;
            }
        }

        public static int a(com.plaid.internal.V3 v3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v3, "");
            switch (com.plaid.internal.V3.a.C0157a.f5952a[v3.ordinal()]) {
                case 1:
                    return 7;
                case 2:
                    return 3;
                case 3:
                    return 6;
                case 4:
                    return 4;
                case 5:
                    return 2;
                case 6:
                    return 5;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
    }

    static {
        com.plaid.internal.V3 v3 = new com.plaid.internal.V3("ASSERT", 0);
        ASSERT = v3;
        com.plaid.internal.V3 v32 = new com.plaid.internal.V3("DEBUG", 1);
        DEBUG = v32;
        com.plaid.internal.V3 v33 = new com.plaid.internal.V3("ERROR", 2);
        ERROR = v33;
        com.plaid.internal.V3 v34 = new com.plaid.internal.V3("INFO", 3);
        INFO = v34;
        com.plaid.internal.V3 v35 = new com.plaid.internal.V3("VERBOSE", 4);
        VERBOSE = v35;
        com.plaid.internal.V3 v36 = new com.plaid.internal.V3("WARN", 5);
        WARN = v36;
        com.plaid.internal.V3[] v3Arr = {v3, v32, v33, v34, v35, v36};
        f5951a = v3Arr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(v3Arr);
        Companion = new com.plaid.internal.V3.a();
    }

    public V3(java.lang.String str, int i) {
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.V3> getEntries() {
        return b;
    }

    public static com.plaid.internal.V3 valueOf(java.lang.String str) {
        return (com.plaid.internal.V3) java.lang.Enum.valueOf(com.plaid.internal.V3.class, str);
    }

    public static com.plaid.internal.V3[] values() {
        return (com.plaid.internal.V3[]) f5951a.clone();
    }
}
