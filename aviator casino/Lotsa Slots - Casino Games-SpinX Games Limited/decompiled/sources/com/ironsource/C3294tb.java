package com.ironsource;

/* renamed from: com.ironsource.tb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3294tb {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3294tb f6736a = new com.ironsource.C3294tb();
    private static final com.ironsource.C3312ub b = new com.ironsource.C3312ub();

    /* renamed from: com.ironsource.tb$a */
    public static final class a implements com.ironsource.InterfaceC3297te {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.unity3d.mediation.LevelPlayInitRequest f6737a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ com.ironsource.C3056g5 c;
        final /* synthetic */ com.unity3d.mediation.LevelPlayInitListener d;

        a(com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, android.content.Context context, com.ironsource.C3056g5 c3056g5, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
            this.f6737a = levelPlayInitRequest;
            this.b = context;
            this.c = c3056g5;
            this.d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC3297te
        public void a(final com.ironsource.C3190ne sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.ironsource.C3312ub c3312ub = com.ironsource.C3294tb.b;
            final com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest = this.f6737a;
            final android.content.Context context = this.b;
            final com.ironsource.C3056g5 c3056g5 = this.c;
            final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener = this.d;
            c3312ub.a(new java.lang.Runnable() { // from class: com.ironsource.tb$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3294tb.a.a(com.ironsource.C3190ne.this, levelPlayInitRequest, context, c3056g5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.C3190ne sdkConfig, com.unity3d.mediation.LevelPlayInitRequest initRequest, android.content.Context context, com.ironsource.C3056g5 initDuration, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
            com.ironsource.C2970b9 a2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            com.ironsource.C2988c9 f = sdkConfig.f();
            if (f != null && (a2 = f.a()) != null) {
                new com.ironsource.C3078h9().a(a2.f(), a2.e().d(), a2.e().e(), a2.e().f(), a2.d());
            }
            com.ironsource.C3294tb.f6736a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC3297te
        public void a(final com.ironsource.C3226pe error, com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.C3312ub c3312ub = com.ironsource.C3294tb.b;
            final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener = this.d;
            final com.ironsource.C3056g5 c3056g5 = this.c;
            c3312ub.a(new java.lang.Runnable() { // from class: com.ironsource.tb$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3294tb.a.a(com.unity3d.mediation.LevelPlayInitListener.this, c3056g5, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, com.ironsource.C3056g5 initDuration, com.ironsource.C3226pe error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
            com.ironsource.C3294tb.f6736a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* renamed from: com.ironsource.tb$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.Ua f6738a;
        final /* synthetic */ com.ironsource.C3056g5 b;
        final /* synthetic */ long c;
        final /* synthetic */ com.unity3d.mediation.LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.ironsource.Ua ua, com.ironsource.C3056g5 c3056g5, long j, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f6738a = ua;
            this.b = c3056g5;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            com.ironsource.C3294tb.f6736a.a(this.f6738a, this.b, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    /* renamed from: com.ironsource.tb$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6739a;
        final /* synthetic */ java.util.List<java.lang.String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.lang.String str, java.util.List<java.lang.String> list) {
            super(0);
            this.f6739a = str;
            this.b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.p.h().a(this.f6739a, this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    private C3294tb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(android.content.Context context, com.unity3d.mediation.LevelPlayInitRequest initRequest, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        f6736a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(android.content.Context context, com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        com.ironsource.C3056g5 c3056g5 = new com.ironsource.C3056g5();
        com.ironsource.C3312ub c3312ub = b;
        com.unity3d.mediation.LevelPlay.AdFormat[] adFormatArr = (com.unity3d.mediation.LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new com.unity3d.mediation.LevelPlay.AdFormat[0]);
        com.ironsource.Ce.f5659a.a(context, new com.ironsource.C3333ve(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), kotlin.collections.ArraysKt.toMutableList(c3312ub.a((com.unity3d.mediation.LevelPlay.AdFormat[]) java.util.Arrays.copyOf(adFormatArr, adFormatArr.length)))), new com.ironsource.C3294tb.a(levelPlayInitRequest, context, c3056g5, levelPlayInitListener));
    }

    public final void b(com.unity3d.mediation.segment.LevelPlaySegment segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.p.h().a(a(segment));
    }

    public final void b(com.unity3d.mediation.impression.LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.h().a(new com.ironsource.Za(listener));
    }

    public static /* synthetic */ void a(com.ironsource.C3294tb c3294tb, android.content.Context context, com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c3294tb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(final android.content.Context context, final com.unity3d.mediation.LevelPlayInitRequest initRequest, final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        b.d(new java.lang.Runnable() { // from class: com.ironsource.tb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3294tb.b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    public final void a(com.unity3d.mediation.impression.LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.h().b(new com.ironsource.Za(listener));
    }

    private final com.ironsource.C2953aa a(com.unity3d.mediation.segment.LevelPlaySegment levelPlaySegment) {
        com.ironsource.C2953aa c2953aa = new com.ironsource.C2953aa();
        c2953aa.a(levelPlaySegment.getLevel());
        c2953aa.a(levelPlaySegment.getIapTotal());
        c2953aa.a(levelPlaySegment.isPaying());
        c2953aa.a(levelPlaySegment.getUserCreationDate());
        c2953aa.a(levelPlaySegment.getSegmentName());
        java.util.Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            c2953aa.a((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond());
        }
        return c2953aa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, com.ironsource.C3190ne c3190ne, android.content.Context context, com.ironsource.C3056g5 c3056g5, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
        com.ironsource.Jb.b bVar = com.ironsource.Jb.u;
        com.ironsource.H8.a E = bVar.a().E();
        com.ironsource.Ua ua = new com.ironsource.Ua(c3190ne);
        if (ua.n()) {
            b.a(context);
        }
        com.ironsource.J7.a b2 = bVar.a().b();
        com.ironsource.C3312ub c3312ub = b;
        ua.b(c3312ub).a(b2);
        ua.a(c3312ub).a(bVar.a().l());
        ua.c(c3312ub).a(bVar.a().v());
        com.ironsource.C3294tb c3294tb = f6736a;
        c3294tb.a(levelPlayInitRequest, ua);
        bVar.d().B().a(ua);
        bVar.d().F().a(ua);
        long n = bVar.d().h().n();
        com.ironsource.environment.ContextProvider.getInstance().updateStrategyIfNeeded();
        com.ironsource.mediationsdk.c.b().g();
        c3294tb.a(n, new com.ironsource.C3294tb.b(ua, c3056g5, n, levelPlayInitListener));
        E.a(ua);
        if (c3190ne.a().e()) {
            new com.ironsource.Od(null, null, null, com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (!com.ironsource.Jb.u.d().f().c() && j > 0) {
            b.a(function0, j);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final com.ironsource.Ua ua, com.ironsource.C3056g5 c3056g5, long j, final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
        com.ironsource.Jb.u.a().E().d();
        long a2 = com.ironsource.C3056g5.a(c3056g5);
        com.ironsource.C3312ub c3312ub = b;
        com.ironsource.C3312ub.a(c3312ub, a2, ua.g(), j, null, 8, null);
        c3312ub.e(new java.lang.Runnable() { // from class: com.ironsource.tb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3294tb.a(com.unity3d.mediation.LevelPlayInitListener.this, ua);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, com.ironsource.Ua levelPlayConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new com.unity3d.mediation.LevelPlayConfiguration(levelPlayConfig.m(), levelPlayConfig.j()));
        }
    }

    private final void a(com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, com.ironsource.Ua ua) {
        com.unity3d.mediation.LevelPlay.AdFormat adFormat = com.unity3d.mediation.LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && ua.d().c().f() != null) {
            com.ironsource.C2993ce.a aVar = com.ironsource.C2993ce.z;
            com.ironsource.mediationsdk.IronSource.a aVar2 = com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO;
            com.ironsource.C2993ce a2 = aVar.a(new com.ironsource.C3069h0(aVar2, com.ironsource.C3326v7.f6774a.a(), "", null, null, null, 56, null), ua, true);
            java.util.List<com.ironsource.C3367xc> d = ua.d(adFormat);
            com.ironsource.F0.b bVar = com.ironsource.F0.b.MEDIATION;
            new com.ironsource.Dd(new com.ironsource.V0(new com.ironsource.C3212p0(aVar2, bVar), a2, bVar), adFormat, d, a2).a();
        }
        com.unity3d.mediation.LevelPlay.AdFormat adFormat2 = com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && ua.d().c().d() != null) {
            com.ironsource.B9.a aVar3 = com.ironsource.B9.z;
            com.ironsource.mediationsdk.IronSource.a aVar4 = com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL;
            com.ironsource.B9 a3 = aVar3.a(new com.ironsource.C3069h0(aVar4, com.ironsource.C3326v7.f6774a.a(), "", null, null, null, 56, null), ua, true);
            java.util.List<com.ironsource.C3367xc> d2 = ua.d(adFormat2);
            com.ironsource.F0.b bVar2 = com.ironsource.F0.b.MEDIATION;
            new com.ironsource.Dd(new com.ironsource.V0(new com.ironsource.C3212p0(aVar4, bVar2), a3, bVar2), adFormat2, d2, a3).a();
        }
        com.unity3d.mediation.LevelPlay.AdFormat adFormat3 = com.unity3d.mediation.LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || ua.d().c().c() == null) {
            return;
        }
        com.ironsource.M2 a4 = com.ironsource.M2.z.a(new com.ironsource.J2(), ua, true);
        java.util.List<com.ironsource.C3367xc> d3 = ua.d(adFormat3);
        com.ironsource.mediationsdk.IronSource.a aVar5 = com.ironsource.mediationsdk.IronSource.a.BANNER;
        com.ironsource.F0.b bVar3 = com.ironsource.F0.b.MEDIATION;
        new com.ironsource.Dd(new com.ironsource.V0(new com.ironsource.C3212p0(aVar5, bVar3), a4, bVar3), adFormat3, d3, a4).a();
    }

    private final boolean a(com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, com.ironsource.C3056g5 c3056g5, final com.ironsource.C3226pe c3226pe) {
        long a2 = com.ironsource.C3056g5.a(c3056g5);
        com.ironsource.C3312ub c3312ub = b;
        final com.ironsource.C3226pe b2 = c3312ub.b(c3226pe);
        com.ironsource.C3312ub.a(c3312ub, b2, a2, null, 4, null);
        c3312ub.e(new java.lang.Runnable() { // from class: com.ironsource.tb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3294tb.a(com.ironsource.C3226pe.this, levelPlayInitListener, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3226pe error, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, com.ironsource.C3226pe eventError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventError, "$eventError");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new com.unity3d.mediation.LevelPlayInitError(b.a(eventError)));
        }
    }

    public final void a(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(value);
        a(key, arrayList);
    }

    public final void a(java.lang.String key, java.util.List<java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        a(new com.ironsource.C3294tb.c(key, values));
    }

    public final void a(kotlin.jvm.functions.Function0<kotlin.Unit> task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        if (com.ironsource.Jb.u.c().h().B()) {
            com.ironsource.environment.thread.IronSourceThreadManager.postMediationBackgroundTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, com.ironsource.AbstractRunnableC3136ke.f6349a.a(task), 0L, 2, null);
        } else {
            task.invoke();
        }
    }
}
