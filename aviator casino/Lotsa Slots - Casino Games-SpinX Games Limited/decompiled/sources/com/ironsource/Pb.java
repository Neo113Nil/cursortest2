package com.ironsource;

/* loaded from: classes5.dex */
public final class Pb {
    public static final com.ironsource.Pb.a m = new com.ironsource.Pb.a(null);
    private static final int n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5924a;
    private com.ironsource.J1 b;
    private int c;
    private long d;
    private boolean e;
    private final java.util.ArrayList<com.ironsource.C2955ac> f;
    private com.ironsource.C2955ac g;
    private int h;
    private com.ironsource.C3267s2 i;
    private long j;
    private boolean k;
    private boolean l;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Pb(int i, long j, boolean z, com.ironsource.J1 events, com.ironsource.C3267s2 auctionSettings, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "events");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.f5924a = z4;
        this.f = new java.util.ArrayList<>();
        this.c = i;
        this.d = j;
        this.e = z;
        this.b = events;
        this.h = i2;
        this.i = auctionSettings;
        this.j = j2;
        this.k = z2;
        this.l = z3;
    }

    public final void a(com.ironsource.J1 j1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j1, "<set-?>");
        this.b = j1;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final com.ironsource.C3267s2 d() {
        return this.i;
    }

    public final com.ironsource.C2955ac e() {
        java.util.Iterator<com.ironsource.C2955ac> it = this.f.iterator();
        while (it.hasNext()) {
            com.ironsource.C2955ac next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.g;
    }

    public final int f() {
        return this.h;
    }

    public final com.ironsource.J1 g() {
        return this.b;
    }

    public final long h() {
        return this.j;
    }

    public final boolean i() {
        return this.k;
    }

    public final boolean j() {
        return this.f5924a;
    }

    public final boolean k() {
        return this.l;
    }

    public java.lang.String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.e + "}";
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final boolean a() {
        return this.e;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(com.ironsource.C3267s2 c3267s2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3267s2, "<set-?>");
        this.i = c3267s2;
    }

    public final void a(com.ironsource.C2955ac c2955ac) {
        if (c2955ac != null) {
            this.f.add(c2955ac);
            if (this.g == null) {
                this.g = c2955ac;
            } else if (c2955ac.b() == 0) {
                this.g = c2955ac;
            }
        }
    }

    public final com.ironsource.C2955ac a(java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        java.util.Iterator<com.ironsource.C2955ac> it = this.f.iterator();
        while (it.hasNext()) {
            com.ironsource.C2955ac next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(next.c(), placementName)) {
                return next;
            }
        }
        return null;
    }
}
