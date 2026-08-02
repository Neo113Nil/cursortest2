package com.plaid.internal;

/* loaded from: classes3.dex */
public final class Y6 {

    /* renamed from: a, reason: collision with root package name */
    public static com.plaid.internal.J5 f5982a;

    /* loaded from: classes16.dex */
    public static final class a {
        @kotlin.jvm.JvmStatic
        public static void a(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, str);
            com.plaid.internal.J5 j5 = com.plaid.internal.Y6.f5982a;
            if (j5 != null) {
                j5.a(str);
            }
        }

        @kotlin.jvm.JvmStatic
        public static void a(java.lang.Exception exc, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, exc, str);
            com.plaid.internal.J5 j5 = com.plaid.internal.Y6.f5982a;
            if (j5 != null) {
                java.lang.String message = exc.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" - ");
                sb.append(message);
                j5.a(sb.toString());
            }
        }
    }
}
