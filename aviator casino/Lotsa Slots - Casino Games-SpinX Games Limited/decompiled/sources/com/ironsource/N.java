package com.ironsource;

/* loaded from: classes5.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.N f5845a = new com.ironsource.N();
    private static final java.util.HashMap<java.lang.String, java.lang.Long> b = new java.util.HashMap<>();

    private N() {
    }

    public final java.util.HashMap<java.lang.String, java.lang.Long> a() {
        return b;
    }

    public final long b(java.lang.String instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        java.lang.Long l = b.get(instance);
        if (l != null) {
            return java.lang.System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    public final long c(java.lang.String instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        java.lang.Long l = b.get(instance);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final boolean a(java.lang.String instance, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        java.util.HashMap<java.lang.String, java.lang.Long> hashMap = b;
        if (hashMap.containsKey(instance)) {
            return false;
        }
        hashMap.put(instance, java.lang.Long.valueOf(j));
        return true;
    }

    public final boolean a(java.lang.String instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        java.util.HashMap<java.lang.String, java.lang.Long> hashMap = b;
        if (hashMap.get(instance) == null) {
            return false;
        }
        hashMap.remove(instance);
        return true;
    }
}
