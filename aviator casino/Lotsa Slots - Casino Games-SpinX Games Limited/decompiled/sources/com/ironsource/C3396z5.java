package com.ironsource;

/* renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3396z5 implements com.ironsource.E0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.IronSource.a f6857a;
    private final com.ironsource.F0 b;
    private final java.util.List<com.ironsource.E0> c;
    private final com.ironsource.W8 d;
    private final com.ironsource.C3384yb e;
    private final com.ironsource.C3067gg f;
    private final com.ironsource.T1 g;
    private final com.ironsource.O h;
    private final com.ironsource.C3138kg i;
    private final com.ironsource.Sc j;

    public C3396z5(com.ironsource.mediationsdk.IronSource.a adFormat, com.ironsource.F0.b level, java.util.List<? extends com.ironsource.E0> eventsInterfaces, com.ironsource.AbstractC3143l3 abstractC3143l3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.f6857a = adFormat;
        com.ironsource.F0 f0 = new com.ironsource.F0(adFormat, level, this, abstractC3143l3);
        this.b = f0;
        this.c = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) eventsInterfaces);
        com.ironsource.W8 w8 = f0.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(w8, "wrapper.init");
        this.d = w8;
        com.ironsource.C3384yb c3384yb = f0.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c3384yb, "wrapper.load");
        this.e = c3384yb;
        com.ironsource.C3067gg c3067gg = f0.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c3067gg, "wrapper.token");
        this.f = c3067gg;
        com.ironsource.T1 t1 = f0.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t1, "wrapper.auction");
        this.g = t1;
        com.ironsource.O o = f0.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o, "wrapper.adInteraction");
        this.h = o;
        com.ironsource.C3138kg c3138kg = f0.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c3138kg, "wrapper.troubleshoot");
        this.i = c3138kg;
        com.ironsource.Sc sc = f0.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sc, "wrapper.operational");
        this.j = sc;
    }

    public final com.ironsource.O a() {
        return this.h;
    }

    public final com.ironsource.T1 b() {
        return this.g;
    }

    public final java.util.List<com.ironsource.E0> c() {
        return this.c;
    }

    public final com.ironsource.W8 d() {
        return this.d;
    }

    public final com.ironsource.C3384yb e() {
        return this.e;
    }

    public final com.ironsource.Sc f() {
        return this.j;
    }

    public final com.ironsource.C3067gg g() {
        return this.f;
    }

    public final com.ironsource.C3138kg h() {
        return this.i;
    }

    @Override // com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<com.ironsource.E0> it = this.c.iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, java.lang.Object> a2 = it.next().a(event);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "it.getEventsAdditionalDataMap(event)");
            hashMap.putAll(a2);
        }
        return hashMap;
    }

    public /* synthetic */ C3396z5(com.ironsource.mediationsdk.IronSource.a aVar, com.ironsource.F0.b bVar, java.util.List list, com.ironsource.AbstractC3143l3 abstractC3143l3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bVar, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : abstractC3143l3);
    }

    public final void a(com.ironsource.E0 eventInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.c.add(eventInterface);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true);
        } else {
            if (z) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (this.f6857a == com.ironsource.mediationsdk.IronSource.a.BANNER) {
                this.e.d();
            } else {
                this.e.a(false);
            }
        }
    }
}
