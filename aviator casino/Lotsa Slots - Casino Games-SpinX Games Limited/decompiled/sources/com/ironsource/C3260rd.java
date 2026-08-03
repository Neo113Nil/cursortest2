package com.ironsource;

/* renamed from: com.ironsource.rd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3260rd implements com.ironsource.InterfaceC3278sd, com.ironsource.G {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6582a;
    private final java.util.List<java.lang.String> b;
    private final int c;
    private final com.ironsource.InterfaceC3386yd d;
    private final com.ironsource.V0 e;
    private boolean f;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> g;
    private java.util.List<com.ironsource.C3075h6> h;
    private int i;
    private int j;
    private java.lang.Integer k;
    private boolean l;

    public C3260rd(java.lang.String adUnitId, java.util.List<java.lang.String> instanceNames, int i, com.ironsource.InterfaceC3386yd fetcher, com.ironsource.V0 adUnitTools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceNames, "instanceNames");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        this.f6582a = adUnitId;
        this.b = instanceNames;
        this.c = i;
        this.d = fetcher;
        this.e = adUnitTools;
        this.f = true;
        this.h = kotlin.collections.CollectionsKt.emptyList();
    }

    private final void d() {
        this.j++;
        com.ironsource.C3075h6 c3075h6 = this.h.get(this.i);
        this.i++;
        c3075h6.a(this);
    }

    @Override // com.ironsource.InterfaceC3278sd
    public boolean a() {
        return this.f;
    }

    @Override // com.ironsource.InterfaceC3278sd
    public java.lang.String b() {
        return this.f6582a;
    }

    @Override // com.ironsource.InterfaceC3278sd
    public com.ironsource.C3075h6 c() {
        java.lang.Integer num = this.k;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (this.l) {
            return null;
        }
        this.l = true;
        return this.h.get(intValue);
    }

    private final void b(boolean z) {
        if (this.j > 0) {
            return;
        }
        if (!z) {
            this.e.e().e().a();
        }
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = this.g;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        this.g = null;
    }

    @Override // com.ironsource.InterfaceC3278sd
    public void a(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.e.e().e().b();
        this.f = false;
        this.g = callback;
        java.util.List<com.ironsource.C3075h6> a2 = this.d.a(this.b);
        if (a2.isEmpty()) {
            b(false);
            return;
        }
        this.h = a2;
        int min = java.lang.Math.min(this.c, a2.size());
        for (int i = 0; i < min; i++) {
            d();
        }
    }

    @Override // com.ironsource.G
    public void b(com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        int a2 = a(instance);
        if (a2 == -1) {
            instance.c();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("stale load success callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.l) {
            instance.c();
        } else {
            a(a2);
            b(true);
        }
    }

    @Override // com.ironsource.InterfaceC3278sd
    public void a(boolean z) {
        if (!this.l) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("reset before getting instance for adUnitId: " + b());
            return;
        }
        this.l = false;
        this.i = 0;
        this.j = 0;
        this.g = null;
        this.f = z;
        if (z) {
            this.h = kotlin.collections.CollectionsKt.emptyList();
            this.k = null;
        }
    }

    private final void a(int i) {
        java.lang.Integer num = this.k;
        if (num == null) {
            this.e.e().e().c();
            this.k = java.lang.Integer.valueOf(i);
        } else {
            int min = java.lang.Math.min(i, num.intValue());
            this.h.get(java.lang.Math.max(i, num.intValue())).c();
            this.k = java.lang.Integer.valueOf(min);
        }
    }

    @Override // com.ironsource.G
    public void a(com.ironsource.mediationsdk.logger.IronSourceError error, com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        if (a(instance) == -1) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("stale load failure callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.k != null) {
            b(true);
        } else if (this.i < this.h.size()) {
            d();
        } else {
            b(false);
        }
    }

    private final int a(com.ironsource.B b) {
        java.util.Iterator<com.ironsource.C3075h6> it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() == b) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
