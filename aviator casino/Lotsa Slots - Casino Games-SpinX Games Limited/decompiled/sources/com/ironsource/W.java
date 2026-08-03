package com.ironsource;

/* loaded from: classes5.dex */
public class W {
    public static final com.ironsource.W.a q = new com.ironsource.W.a(null);
    public static final int r = -1;

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.IronSource.a f6032a;
    private final java.lang.String b;
    private final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> c;
    private final com.ironsource.C3267s2 d;
    private int e;
    private final int f;
    private boolean g;
    private final int h;
    private final int i;
    private final com.ironsource.O0 j;
    private final com.ironsource.J0 k;
    private final long l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private boolean p;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W(com.ironsource.mediationsdk.IronSource.a adUnit, java.lang.String str, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> list, com.ironsource.C3267s2 auctionSettings, int i, int i2, boolean z, int i3, int i4, com.ironsource.O0 loadingData, com.ironsource.J0 interactionData, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.f6032a = adUnit;
        this.b = str;
        this.c = list;
        this.d = auctionSettings;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = i4;
        this.j = loadingData;
        this.k = interactionData;
        this.l = j;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
    }

    public final void a(int i) {
        this.e = i;
    }

    public final com.ironsource.mediationsdk.IronSource.a b() {
        return this.f6032a;
    }

    public final boolean c() {
        return this.g;
    }

    public final com.ironsource.C3267s2 d() {
        return this.d;
    }

    public final long e() {
        return this.l;
    }

    public final int f() {
        return this.h;
    }

    public final com.ironsource.J0 g() {
        return this.k;
    }

    public final com.ironsource.O0 h() {
        return this.j;
    }

    public final int i() {
        return this.e;
    }

    public java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> j() {
        return this.c;
    }

    public final boolean k() {
        return this.m;
    }

    public final boolean l() {
        return this.o;
    }

    public final boolean m() {
        return this.p;
    }

    public final int n() {
        return this.f;
    }

    public java.lang.String o() {
        return this.b;
    }

    public final boolean p() {
        return this.n;
    }

    public final boolean q() {
        return this.d.g() > 0;
    }

    public final java.lang.String r() {
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, java.lang.Integer.valueOf(this.e), com.ironsource.mediationsdk.d.y, java.lang.Boolean.valueOf(this.g), com.ironsource.mediationsdk.d.z, java.lang.Boolean.valueOf(this.p));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void b(boolean z) {
        this.p = z;
    }

    public final int a() {
        return this.i;
    }

    public final com.ironsource.mediationsdk.model.NetworkSettings a(java.lang.String instanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> j = j();
        java.lang.Object obj = null;
        if (j == null) {
            return null;
        }
        java.util.Iterator<T> it = j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.ironsource.mediationsdk.model.NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                obj = next;
                break;
            }
        }
        return (com.ironsource.mediationsdk.model.NetworkSettings) obj;
    }

    public /* synthetic */ W(com.ironsource.mediationsdk.IronSource.a aVar, java.lang.String str, java.util.List list, com.ironsource.C3267s2 c3267s2, int i, int i2, boolean z, int i3, int i4, com.ironsource.O0 o0, com.ironsource.J0 j0, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, list, c3267s2, i, i2, z, i3, i4, o0, j0, j, z2, z3, z4, (i5 & 32768) != 0 ? false : z5);
    }
}
