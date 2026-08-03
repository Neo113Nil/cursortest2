package com.ironsource;

/* renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2988c9 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3216p4 f6186a;
    private final com.ironsource.Lb.a b;
    private java.lang.Long c;
    private java.lang.Long d;
    private com.ironsource.Lb e;
    private com.ironsource.C2970b9 f;

    /* JADX WARN: Multi-variable type inference failed */
    public C2988c9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final com.ironsource.C2970b9 a() {
        return this.f;
    }

    public final com.ironsource.C2970b9 b() {
        java.lang.Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            java.lang.Long l2 = this.c;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (this.e == null) {
                    return null;
                }
                long a2 = this.f6186a.a();
                com.ironsource.Lb lb = this.b.get();
                com.ironsource.C2970b9 c2970b9 = new com.ironsource.C2970b9(a2 - longValue, new com.ironsource.C2970b9.a(java.lang.Math.max(0L, lb.d() - r1.d()), java.lang.Math.max(0L, lb.e() - r1.e()), java.lang.Math.max(0L, lb.f() - r1.f())), longValue2 / 1024);
                this.f = c2970b9;
                return c2970b9;
            }
        }
        return null;
    }

    public C2988c9(com.ironsource.InterfaceC3216p4 currentTimeProvider, com.ironsource.Lb.a memoryInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memoryInfoProvider, "memoryInfoProvider");
        this.f6186a = currentTimeProvider;
        this.b = memoryInfoProvider;
    }

    public final void a(java.lang.String serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.c = java.lang.Long.valueOf(serverResponse.length());
        this.e = this.b.get();
        this.d = java.lang.Long.valueOf(this.f6186a.a());
    }

    public /* synthetic */ C2988c9(com.ironsource.InterfaceC3216p4 interfaceC3216p4, com.ironsource.Lb.a aVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.ironsource.InterfaceC3216p4.a() : interfaceC3216p4, (i & 2) != 0 ? new com.ironsource.Lb.a.C0120a() : aVar);
    }
}
