package com.plaid.internal;

/* renamed from: com.plaid.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0460b4 {
    public static final java.lang.String a(java.lang.String str, java.lang.String str2, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = (java.lang.String) map.get(str);
        if (str3 != null) {
            return str3;
        }
        com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "Missing field: ".concat(java.lang.String.valueOf(str)));
        return str2;
    }
}
