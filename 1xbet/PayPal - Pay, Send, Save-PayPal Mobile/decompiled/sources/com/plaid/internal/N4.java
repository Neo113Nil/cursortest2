package com.plaid.internal;

/* loaded from: classes16.dex */
public final class N4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.plaid.internal.N4.a f5862a = new com.plaid.internal.N4.a();

    public static final class a {
        public final java.lang.String a(android.app.Application application) {
            java.lang.String string;
            synchronized (this) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
                android.content.SharedPreferences sharedPreferences = application.getSharedPreferences("link_persistent_uuid", 0);
                string = sharedPreferences.getString("link_persistent_uuid", "");
                if (string != null && string.length() != 0) {
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Reusing existing persistent link id: ");
                    sb.append(string);
                    com.plaid.internal.C0452a6.a.a(sb.toString(), true);
                }
                string = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                sharedPreferences.edit().putString("link_persistent_uuid", string).apply();
                com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Creating new persistent link id: ");
                sb2.append(string);
                com.plaid.internal.C0452a6.a.a(sb2.toString(), true);
            }
            return string;
        }
    }
}
