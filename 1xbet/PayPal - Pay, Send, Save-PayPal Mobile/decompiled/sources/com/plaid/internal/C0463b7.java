package com.plaid.internal;

/* renamed from: com.plaid.internal.b7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0463b7 {
    public static final java.lang.String a(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("plaid_environment", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = sharedPreferences.getString("plaid_environment", str);
        return string == null ? str : string;
    }
}
