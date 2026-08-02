package com.plaid.internal;

/* renamed from: com.plaid.internal.e1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0511e1 {
    public static final com.plaid.internal.C0680x0 b;
    public static final com.plaid.internal.C0511e1 c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f6400a = new java.util.LinkedHashMap();

    public final void a(java.lang.String str, java.lang.Object obj) {
        if ((obj instanceof java.lang.Number) || (obj instanceof java.lang.String) || (obj instanceof java.lang.Boolean)) {
            b.a(com.plaid.internal.W3.INFO, "set feature %s=%s", str, obj);
            this.f6400a.put(str, obj);
        } else {
            b.a(com.plaid.internal.W3.WARN, "ignore feature %s of type %s", str, obj == null ? "null" : obj.getClass().getSimpleName());
        }
    }

    static {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        b = new com.plaid.internal.C0680x0("features");
        c = new com.plaid.internal.C0511e1();
    }

    public final boolean a(java.lang.String str) {
        java.lang.Object a2 = a(str, null, java.lang.Object.class);
        if (a2 instanceof java.lang.Boolean) {
            return java.lang.Boolean.TRUE.equals(a2);
        }
        return a2 instanceof java.lang.Number ? ((java.lang.Number) a2).intValue() != 0 : a2 != null;
    }

    public final java.lang.Object a(java.lang.String str, java.lang.Object obj, java.lang.Class<?> cls) {
        java.lang.Object obj2 = !str.startsWith("android.") ? this.f6400a.get("android.".concat(str)) : null;
        if (obj2 == null) {
            obj2 = this.f6400a.get(str);
        }
        return cls.isInstance(obj2) ? obj2 : obj;
    }

    public final com.plaid.internal.C0511e1 a(java.util.HashMap hashMap) {
        com.plaid.internal.C0511e1 c0511e1 = new com.plaid.internal.C0511e1();
        java.util.LinkedHashMap linkedHashMap = this.f6400a;
        c0511e1.f6400a.clear();
        if (linkedHashMap != null) {
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                c0511e1.a((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            c0511e1.a((java.lang.String) entry2.getKey(), entry2.getValue());
        }
        return c0511e1;
    }
}
