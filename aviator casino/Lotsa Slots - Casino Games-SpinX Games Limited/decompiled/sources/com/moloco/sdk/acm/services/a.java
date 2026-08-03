package com.moloco.sdk.acm.services;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.acm.services.a f6916a = new com.moloco.sdk.acm.services.a();

    public final boolean a(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return java.lang.Boolean.parseBoolean(b(key));
    }

    public final java.lang.String b(java.lang.String str) {
        try {
            java.lang.Object invoke = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class).invoke(null, str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) invoke;
            try {
                if (android.text.TextUtils.isEmpty(str2)) {
                    return null;
                }
            } catch (java.lang.Exception unused) {
            }
            return str2;
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }
}
