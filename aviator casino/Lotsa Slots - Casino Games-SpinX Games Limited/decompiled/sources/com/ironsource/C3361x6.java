package com.ironsource;

/* renamed from: com.ironsource.x6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3361x6 implements com.ironsource.A6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3325v6 f6830a;
    private final com.ironsource.C3218p6 b;
    private com.ironsource.C3218p6 c;
    private boolean d;

    public C3361x6(com.ironsource.C3325v6 strategy, com.ironsource.C3218p6 currentAdUnit, com.ironsource.C3218p6 c3218p6, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f6830a = strategy;
        this.b = currentAdUnit;
        this.c = c3218p6;
        this.d = z;
    }

    @Override // com.ironsource.A6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6830a.a(new com.ironsource.C3397z6(this.f6830a, this.b, this.c));
        this.b.a(activity, this.f6830a);
    }

    @Override // com.ironsource.A6
    public void b(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.b, adUnit)) {
            this.f6830a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.A6
    public void c(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (kotlin.jvm.internal.Intrinsics.areEqual(adUnit, this.b)) {
            this.f6830a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.A6
    public void loadAd() {
        kotlin.Unit unit;
        if (this.d) {
            this.f6830a.a("load called while current ad is loaded");
            return;
        }
        this.d = true;
        com.unity3d.mediation.LevelPlayAdInfo e = this.b.e();
        if (e != null) {
            this.f6830a.d().b(e);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f6830a.a("current ad is loaded without ad info");
        } else if (this.c == null) {
            com.ironsource.C3218p6 a2 = this.f6830a.b().a(false, this.f6830a.c());
            this.c = a2;
            a2.a(this.f6830a);
        }
    }

    @Override // com.ironsource.A6
    public void b(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (kotlin.jvm.internal.Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else {
            this.f6830a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (kotlin.jvm.internal.Intrinsics.areEqual(adUnit, this.b)) {
            this.f6830a.a("show success when loaded");
        } else {
            this.f6830a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C3361x6(com.ironsource.C3325v6 c3325v6, com.ironsource.C3218p6 c3218p6, com.ironsource.C3218p6 c3218p62, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c3325v6, c3218p6, c3218p62, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (kotlin.jvm.internal.Intrinsics.areEqual(adUnit, this.b)) {
            this.f6830a.a("show failed when loaded");
        } else {
            this.f6830a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (kotlin.jvm.internal.Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(adUnit, this.b)) {
            a();
        }
    }

    private final void a() {
        com.ironsource.A6 c3379y6;
        com.ironsource.C3218p6 c3218p6 = this.c;
        if (c3218p6 == null) {
            com.ironsource.C3325v6 c3325v6 = this.f6830a;
            c3325v6.a(new com.ironsource.C3343w6(c3325v6));
        } else {
            if ((c3218p6 != null ? c3218p6.e() : null) != null) {
                com.ironsource.C3325v6 c3325v62 = this.f6830a;
                com.ironsource.C3218p6 c3218p62 = this.c;
                kotlin.jvm.internal.Intrinsics.checkNotNull(c3218p62);
                c3379y6 = new com.ironsource.C3361x6(c3325v62, c3218p62, null, false, 8, null);
            } else {
                com.ironsource.C3325v6 c3325v63 = this.f6830a;
                com.ironsource.C3218p6 c3218p63 = this.c;
                kotlin.jvm.internal.Intrinsics.checkNotNull(c3218p63);
                c3379y6 = new com.ironsource.C3379y6(c3325v63, c3218p63, false);
            }
            this.f6830a.a(c3379y6);
        }
        this.f6830a.d().a();
    }
}
