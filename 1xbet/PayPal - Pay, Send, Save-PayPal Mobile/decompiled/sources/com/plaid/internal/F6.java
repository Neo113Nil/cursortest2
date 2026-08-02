package com.plaid.internal;

/* loaded from: classes16.dex */
public final class F6 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference<com.plaid.internal.G6> f5789a;

    /* loaded from: classes3.dex */
    public static final class a {
        @kotlin.jvm.JvmStatic
        public static void a(java.lang.String str, java.util.Map map, com.plaid.internal.J6 j6) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j6, "");
            java.lang.ref.WeakReference weakReference = com.plaid.internal.F6.f5789a;
            com.plaid.internal.G6 g6 = weakReference != null ? (com.plaid.internal.G6) weakReference.get() : null;
            if (g6 != null) {
                g6.a(str, map, j6);
            } else {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("RemoteLog: No controller registered, dropping event: ".concat(java.lang.String.valueOf(str)), true);
            }
        }

        @kotlin.jvm.JvmStatic
        public static void b(java.util.Map map, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            a(str, map, com.plaid.internal.J6.INFO);
        }

        public static void a() {
            java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("TwilioSNA - processUrl failure", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyMap, "");
            a("TwilioSNA - processUrl failure", emptyMap, com.plaid.internal.J6.ERROR);
        }

        @kotlin.jvm.JvmStatic
        public static void a(java.util.Map map, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            a(str, map, com.plaid.internal.J6.ERROR);
        }
    }
}
