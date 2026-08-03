package com.ironsource;

/* renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3316uf implements com.ironsource.P8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.B3 f6766a;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> b;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> c;

    public C3316uf(com.ironsource.B3 storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        this.f6766a = storage;
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
        this.c = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // com.ironsource.P8
    public void a(int i, java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.b.put(identifier, java.lang.Integer.valueOf(i));
        this.f6766a.a(identifier, i);
    }

    @Override // com.ironsource.P8
    public java.lang.Long b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        java.lang.Long l = this.c.get(identifier);
        if (l != null) {
            return l;
        }
        java.lang.Long a2 = this.f6766a.a(identifier);
        if (a2 == null) {
            return null;
        }
        long longValue = a2.longValue();
        this.c.put(identifier, java.lang.Long.valueOf(longValue));
        return java.lang.Long.valueOf(longValue);
    }

    @Override // com.ironsource.P8
    public int a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        java.lang.Integer num = this.b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        java.lang.Integer c = this.f6766a.c(identifier);
        if (c != null) {
            int intValue = c.intValue();
            this.b.put(identifier, java.lang.Integer.valueOf(intValue));
            return intValue;
        }
        this.b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.P8
    public void a(long j, java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.put(identifier, java.lang.Long.valueOf(j));
        this.f6766a.b(identifier, j);
    }
}
