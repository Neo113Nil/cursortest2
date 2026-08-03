package com.ironsource;

/* loaded from: classes5.dex */
public final class Yc implements com.ironsource.I7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.B3 f6101a;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> b;

    public Yc(com.ironsource.B3 storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        this.f6101a = storage;
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // com.ironsource.I7
    public java.lang.Long a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        java.lang.Long l = this.b.get(identifier);
        if (l != null) {
            return l;
        }
        java.lang.Long b = this.f6101a.b(identifier);
        if (b == null) {
            return null;
        }
        long longValue = b.longValue();
        this.b.put(identifier, java.lang.Long.valueOf(longValue));
        return java.lang.Long.valueOf(longValue);
    }

    @Override // com.ironsource.I7
    public void a(long j, java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.b.put(identifier, java.lang.Long.valueOf(j));
        this.f6101a.a(identifier, j);
    }
}
