package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.IronSource.a f6438a;
    private final java.util.ArrayList<com.ironsource.C3106j2> b;
    private boolean c;
    private java.lang.String d;
    private boolean e;
    private java.util.Map<java.lang.String, java.lang.Object> f;
    private java.util.List<java.lang.String> g;
    private int h;
    private com.ironsource.C2963b2 i;
    private com.ironsource.C2953aa j;
    private java.lang.String k;
    private com.ironsource.mediationsdk.ISBannerSize l;
    private boolean m;
    private boolean n;
    private boolean o;
    private java.lang.String p;
    private java.lang.String q;
    private java.lang.Boolean r;
    private java.lang.Double s;
    private java.lang.String t;

    public h(com.ironsource.mediationsdk.IronSource.a adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f6438a = adUnit;
        this.b = new java.util.ArrayList<>();
        this.d = "";
        this.f = new java.util.HashMap();
        this.g = new java.util.ArrayList();
        this.h = -1;
        this.k = "";
    }

    @kotlin.Deprecated(message = "Use instancesInfo instead")
    public static /* synthetic */ void i() {
    }

    @kotlin.Deprecated(message = "Use instancesInfo instead")
    public static /* synthetic */ void m() {
    }

    public final com.ironsource.mediationsdk.IronSource.a a() {
        return this.f6438a;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final com.ironsource.mediationsdk.IronSource.a c() {
        return this.f6438a;
    }

    public final void d(boolean z) {
        this.n = z;
    }

    public final com.ironsource.C2963b2 e() {
        return this.i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.mediationsdk.h) && this.f6438a == ((com.ironsource.mediationsdk.h) obj).f6438a;
    }

    public final com.ironsource.mediationsdk.ISBannerSize f() {
        return this.l;
    }

    public final java.lang.Double g() {
        return this.s;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> h() {
        return this.f;
    }

    public int hashCode() {
        return this.f6438a.hashCode();
    }

    public final java.lang.String j() {
        return this.d;
    }

    public final java.util.ArrayList<com.ironsource.C3106j2> k() {
        return this.b;
    }

    public final java.util.List<java.lang.String> l() {
        return this.g;
    }

    public final java.lang.String n() {
        return this.t;
    }

    public final com.ironsource.C2953aa o() {
        return this.j;
    }

    public final int p() {
        return this.h;
    }

    public final boolean q() {
        return this.n;
    }

    public final boolean r() {
        return this.o;
    }

    public final java.lang.String s() {
        return this.k;
    }

    public final boolean t() {
        return this.m;
    }

    public java.lang.String toString() {
        return "AuctionRequestParams(adUnit=" + this.f6438a + ")";
    }

    public final boolean u() {
        return this.e;
    }

    public final java.lang.Boolean v() {
        return this.r;
    }

    public final boolean w() {
        return this.c;
    }

    public final com.ironsource.mediationsdk.h a(com.ironsource.mediationsdk.IronSource.a adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new com.ironsource.mediationsdk.h(adUnit);
    }

    public final void b(java.lang.String str) {
        this.p = str;
    }

    public final void c(boolean z) {
        this.c = z;
    }

    public final java.lang.String d() {
        return this.p;
    }

    public final void e(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.k = str;
    }

    public static /* synthetic */ com.ironsource.mediationsdk.h a(com.ironsource.mediationsdk.h hVar, com.ironsource.mediationsdk.IronSource.a aVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aVar = hVar.f6438a;
        }
        return hVar.a(aVar);
    }

    public final java.lang.String b() {
        return this.q;
    }

    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void d(java.lang.String str) {
        this.t = str;
    }

    public final void e(boolean z) {
        this.o = z;
    }

    public final void a(com.ironsource.C3106j2 instanceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.b.add(instanceInfo);
    }

    public final void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f = map;
    }

    public final void a(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.g = list;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void a(com.ironsource.C2963b2 c2963b2) {
        this.i = c2963b2;
    }

    public final void a(com.ironsource.C2953aa c2953aa) {
        this.j = c2953aa;
    }

    public final void a(com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        this.l = iSBannerSize;
    }

    public final void a(boolean z) {
        this.m = z;
    }

    public final void a(java.lang.String str) {
        this.q = str;
    }

    public final void a(java.lang.Boolean bool) {
        this.r = bool;
    }

    public final void a(java.lang.Double d) {
        this.s = d;
    }
}
