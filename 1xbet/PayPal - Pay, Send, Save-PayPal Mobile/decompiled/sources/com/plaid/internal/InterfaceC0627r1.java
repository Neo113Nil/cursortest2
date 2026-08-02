package com.plaid.internal;

/* renamed from: com.plaid.internal.r1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC0627r1 {

    /* renamed from: com.plaid.internal.r1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f6552a;
        public final boolean b;
        public final int c;
        public final java.lang.String d;

        public a(java.lang.String str, boolean z, java.lang.String str2, int i) {
            this.f6552a = str;
            this.b = z;
            this.d = str2;
            this.c = i;
        }
    }

    /* renamed from: com.plaid.internal.r1$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f6553a;
        public final int b;
        public final java.lang.String c;
        public final java.util.Map<java.lang.String, java.lang.String> d;

        public b(int i, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            this.f6553a = str2;
            this.b = i;
            this.c = str;
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    hashMap.put(entry.getKey().toLowerCase(), android.text.TextUtils.join(", ", entry.getValue()));
                }
            }
            this.d = java.util.Collections.unmodifiableMap(hashMap);
        }
    }

    com.plaid.internal.InterfaceC0627r1.b a(com.plaid.internal.InterfaceC0627r1.a aVar);

    void a();

    com.plaid.internal.EnumC0697z isConnected();
}
