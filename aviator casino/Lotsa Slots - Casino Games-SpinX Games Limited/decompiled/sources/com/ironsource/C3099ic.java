package com.ironsource;

/* renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3099ic {
    public static final com.ironsource.C3099ic.a e = new com.ironsource.C3099ic.a(null);
    private static volatile com.ironsource.C3099ic f;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.Ld f6311a;
    private final java.util.concurrent.atomic.AtomicBoolean b;
    private java.lang.String c;
    private com.ironsource.N3 d;

    /* renamed from: com.ironsource.ic$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.C3099ic a() {
            com.ironsource.C3099ic c3099ic = com.ironsource.C3099ic.f;
            if (c3099ic == null) {
                synchronized (this) {
                    c3099ic = com.ironsource.C3099ic.f;
                    if (c3099ic == null) {
                        c3099ic = new com.ironsource.C3099ic(null);
                        com.ironsource.C3099ic.a aVar = com.ironsource.C3099ic.e;
                        com.ironsource.C3099ic.f = c3099ic;
                    }
                }
            }
            return c3099ic;
        }

        private a() {
        }

        public final com.ironsource.InterfaceC3052g1 a(com.ironsource.mediationsdk.IronSource.a adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            com.ironsource.C3099ic c3099ic = com.ironsource.C3099ic.f;
            com.ironsource.N3 b = c3099ic != null ? c3099ic.b() : null;
            com.ironsource.C3099ic c3099ic2 = com.ironsource.C3099ic.f;
            com.ironsource.Ld e = c3099ic2 != null ? c3099ic2.e() : null;
            if (b != null && e != null) {
                return new com.ironsource.C3125k3(b, e, adFormat);
            }
            return new com.ironsource.C3092i5();
        }
    }

    public /* synthetic */ C3099ic(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.C3099ic d() {
        return e.a();
    }

    public final com.ironsource.N3 b() {
        return this.d;
    }

    public final java.util.concurrent.atomic.AtomicBoolean c() {
        return this.b;
    }

    public final com.ironsource.Ld e() {
        return this.f6311a;
    }

    public final java.lang.String f() {
        return this.c;
    }

    public final void g() {
        this.b.set(true);
    }

    private C3099ic() {
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.c = "";
    }

    public final void a(com.ironsource.Ld ld) {
        this.f6311a = ld;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(com.ironsource.N3 n3) {
        this.d = n3;
    }
}
