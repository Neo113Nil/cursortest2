package com.ironsource;

/* renamed from: com.ironsource.vd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3332vd implements com.ironsource.InterfaceC3350wd {

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.mediation.LevelPlay.AdFormat f6782a;
    private final com.ironsource.InterfaceC3314ud b;
    private final com.ironsource.InterfaceC3398z7 c;
    private com.ironsource.C3332vd.a d;
    private java.util.List<com.ironsource.InterfaceC3278sd> e;
    private final int f;

    /* renamed from: com.ironsource.vd$a */
    private enum a {
        None,
        Idle,
        Loading
    }

    /* renamed from: com.ironsource.vd$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6784a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f6784a = iArr;
        }
    }

    /* renamed from: com.ironsource.vd$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3278sd f6785a;
        final /* synthetic */ com.ironsource.C3332vd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.ironsource.InterfaceC3278sd interfaceC3278sd, com.ironsource.C3332vd c3332vd) {
            super(1);
            this.f6785a = interfaceC3278sd;
            this.b = c3332vd;
        }

        public final void a(boolean z) {
            if (!z) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("adunit \"" + this.f6785a.b() + "\" failed to load, removing");
                this.b.e.remove(this.f6785a);
            }
            this.b.d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
            a(bool.booleanValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public C3332vd(com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.InterfaceC3314ud adUnitsFactory, com.ironsource.InterfaceC3398z7 epService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitsFactory, "adUnitsFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(epService, "epService");
        this.f6782a = adFormat;
        this.b = adUnitsFactory;
        this.c = epService;
        this.d = com.ironsource.C3332vd.a.None;
        this.e = new java.util.ArrayList();
        this.f = b();
    }

    private final int c() {
        int i = com.ironsource.C3332vd.b.f6784a[this.f6782a.ordinal()];
        if (i == 1) {
            return this.c.I();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        com.ironsource.InterfaceC3278sd e = e();
        if (e == null) {
            this.d = com.ironsource.C3332vd.a.Idle;
        } else {
            this.d = com.ironsource.C3332vd.a.Loading;
            e.a(new com.ironsource.C3332vd.c(e, this));
        }
    }

    private final com.ironsource.InterfaceC3278sd e() {
        java.lang.Object obj;
        if (!a()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(this.f6782a + " - reached capacity");
            return null;
        }
        java.util.Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.ironsource.InterfaceC3278sd) obj).a()) {
                break;
            }
        }
        com.ironsource.InterfaceC3278sd interfaceC3278sd = (com.ironsource.InterfaceC3278sd) obj;
        if (interfaceC3278sd != null) {
            return interfaceC3278sd;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(this.f6782a + " - preload done");
        return null;
    }

    private final int b() {
        int i = com.ironsource.C3332vd.b.f6784a[this.f6782a.ordinal()];
        if (i == 1) {
            return this.c.i();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.x();
    }

    @Override // com.ironsource.InterfaceC3350wd
    public void a(com.ironsource.Ua config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        if (!this.c.w()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(this.f6782a + " - preload is disabled");
            return;
        }
        if (this.d != com.ironsource.C3332vd.a.None) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(this.f6782a + " - initializing service again");
            return;
        }
        int c2 = c();
        if (c2 >= 1) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(java.lang.String.valueOf(this.f6782a));
            this.d = com.ironsource.C3332vd.a.Idle;
            this.e = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.b.a(config.c(this.f6782a), c2, config));
            d();
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(this.f6782a + " - invalid maxParallelLoad: " + c2);
    }

    private final com.ironsource.InterfaceC3278sd b(java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.ironsource.InterfaceC3278sd) obj).b(), str)) {
                break;
            }
        }
        return (com.ironsource.InterfaceC3278sd) obj;
    }

    public /* synthetic */ C3332vd(com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.InterfaceC3314ud interfaceC3314ud, com.ironsource.InterfaceC3398z7 interfaceC3398z7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i & 2) != 0 ? new com.ironsource.C3296td(adFormat) : interfaceC3314ud, (i & 4) != 0 ? com.ironsource.Jb.u.d().h() : interfaceC3398z7);
    }

    private final boolean a() {
        int i;
        java.util.List<com.ironsource.InterfaceC3278sd> list = this.e;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((com.ironsource.InterfaceC3278sd) it.next()).a() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < this.f;
    }

    @Override // com.ironsource.InterfaceC3350wd
    public com.ironsource.C3075h6 a(java.lang.String adUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(this.f6782a + " - adunit: \"" + adUnitId + "\"");
        com.ironsource.InterfaceC3278sd b2 = b(adUnitId);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3350wd
    public void a(java.lang.String adUnitId, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(this.f6782a + " - adunit: \"" + adUnitId + "\", didUseInstance: " + z);
        com.ironsource.InterfaceC3278sd b2 = b(adUnitId);
        if (b2 == null) {
            ironLog.warning("adunit is null at \"" + adUnitId + "\"");
            return;
        }
        b2.a(z);
        if (z && this.d == com.ironsource.C3332vd.a.Idle) {
            d();
        }
    }
}
