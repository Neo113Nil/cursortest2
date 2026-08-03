package com.ironsource;

/* renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3352wf implements com.ironsource.InterfaceC3219p7, com.ironsource.InterfaceC3219p7.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3216p4 f6808a;
    private final com.ironsource.P8 b;
    private final java.util.Map<java.lang.String, com.ironsource.C3298tf> c;

    /* renamed from: com.ironsource.wf$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f6809a;
        private long b;
        private java.lang.Long c;

        public a(int i, long j, java.lang.Long l) {
            this.f6809a = i;
            this.b = j;
            this.c = l;
        }

        public final int a() {
            return this.f6809a;
        }

        public final long b() {
            return this.b;
        }

        public final java.lang.Long c() {
            return this.c;
        }

        public final int d() {
            return this.f6809a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.C3352wf.a)) {
                return false;
            }
            com.ironsource.C3352wf.a aVar = (com.ironsource.C3352wf.a) obj;
            return this.f6809a == aVar.f6809a && this.b == aVar.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c);
        }

        public final java.lang.Long f() {
            return this.c;
        }

        public int hashCode() {
            int m = ((this.f6809a * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31;
            java.lang.Long l = this.c;
            return m + (l == null ? 0 : l.hashCode());
        }

        public java.lang.String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f6809a + ", currentTime=" + this.b + ", currentTimeThreshold=" + this.c + ")";
        }

        public final com.ironsource.C3352wf.a a(int i, long j, java.lang.Long l) {
            return new com.ironsource.C3352wf.a(i, j, l);
        }

        public static /* synthetic */ com.ironsource.C3352wf.a a(com.ironsource.C3352wf.a aVar, int i, long j, java.lang.Long l, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f6809a;
            }
            if ((i2 & 2) != 0) {
                j = aVar.b;
            }
            if ((i2 & 4) != 0) {
                l = aVar.c;
            }
            return aVar.a(i, j, l);
        }

        public final void a(int i) {
            this.f6809a = i;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void a(java.lang.Long l) {
            this.c = l;
        }
    }

    public C3352wf(com.ironsource.InterfaceC3216p4 currentTimeProvider, com.ironsource.P8 serviceDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.f6808a = currentTimeProvider;
        this.b = serviceDataRepository;
        this.c = new java.util.LinkedHashMap();
    }

    private final com.ironsource.C3352wf.a c(java.lang.String str) {
        return new com.ironsource.C3352wf.a(this.b.a(str), this.f6808a.a(), this.b.b(str));
    }

    public final java.util.Map<java.lang.String, com.ironsource.C3298tf> a() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r4 >= (r2 != null ? r2.longValue() : 0)) goto L13;
     */
    @Override // com.ironsource.InterfaceC3219p7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.ironsource.C3298tf c3298tf = this.c.get(identifier);
        if (c3298tf == null) {
            return;
        }
        com.ironsource.C3352wf.a c = c(identifier);
        if (c.d() != 0) {
            long e = c.e();
            java.lang.Long f = c.f();
        }
        this.b.a(c.e() + com.ironsource.H3.a(c3298tf.b(), null, 1, null), identifier);
        c.a(0);
        c.a(c.d() + 1);
        this.b.a(c.d(), identifier);
    }

    @Override // com.ironsource.InterfaceC3219p7
    public com.ironsource.G3 a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.ironsource.C3298tf c3298tf = this.c.get(identifier);
        return c3298tf == null ? new com.ironsource.G3(false, null, 2, null) : a(c3298tf, identifier) ? new com.ironsource.G3(true, com.ironsource.I3.ShowCount) : new com.ironsource.G3(false, null, 2, null);
    }

    private final boolean a(com.ironsource.C3298tf c3298tf, java.lang.String str) {
        com.ironsource.C3352wf.a c = c(str);
        java.lang.Long f = c.f();
        if (f != null) {
            return c.d() >= c3298tf.a() && this.f6808a.a() < f.longValue();
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3219p7.a
    public java.lang.Object a(java.lang.String identifier, com.ironsource.I3 cappingType, com.ironsource.InterfaceC3183n7 cappingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        java.lang.Object c = cappingConfig.c();
        if (kotlin.Result.m10805isSuccessimpl(c)) {
            com.ironsource.C3298tf c3298tf = (com.ironsource.C3298tf) c;
            if (c3298tf != null) {
                this.c.put(identifier, c3298tf);
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(c);
        if (m10801exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
    }
}
