package com.moloco.sdk.internal.publisher.nativead;

/* loaded from: classes5.dex */
public final class d {
    public static final int l = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7133a;
    public final com.moloco.sdk.internal.ortb.model.C3415e b;
    public final com.moloco.sdk.internal.publisher.nativead.model.b c;
    public final com.moloco.sdk.internal.services.InterfaceC3435f d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a e;
    public final com.moloco.sdk.publisher.AdFormatType f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r h;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder i;
    public final com.moloco.sdk.internal.publisher.z j;
    public final com.moloco.sdk.internal.publisher.nativead.d.a k;

    public d(java.lang.String adUnitId, com.moloco.sdk.internal.ortb.model.C3415e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7133a = adUnitId;
        this.b = bid;
        this.c = ortbResponse;
        this.d = appLifecycleTrackerService;
        this.e = customUserEventBuilderService;
        this.f = adFormatType;
        this.g = persistentHttpRequest;
        this.h = externalLinkHandler;
        this.i = metricsRecorder;
        this.j = a();
        this.k = b();
    }

    public final com.moloco.sdk.internal.publisher.z a() {
        com.moloco.sdk.internal.publisher.z a2;
        final com.moloco.sdk.internal.ortb.model.C3415e c3415e = this.b;
        a2 = com.moloco.sdk.internal.publisher.B.a(null, this.d, this.e, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.nativead.d.a(com.moloco.sdk.internal.ortb.model.C3415e.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.nativead.d.a(com.moloco.sdk.internal.publisher.nativead.d.this);
            }
        }, (r24 & 32) != 0 ? com.moloco.sdk.internal.y.b() : null, (r24 & 64) != 0 ? com.moloco.sdk.internal.h.a() : null, this.f, r9, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(this.i) : null, (r24 & 1024) != 0 ? null : null);
        return a2;
    }

    public final com.moloco.sdk.internal.publisher.nativead.d.a b() {
        com.moloco.sdk.internal.publisher.nativead.model.b bVar = this.c;
        return new com.moloco.sdk.internal.publisher.nativead.d.a(bVar.c(), bVar.b(), this.g);
    }

    public final void c() {
        com.moloco.sdk.internal.publisher.nativead.model.b.c d = this.c.d();
        if (d != null) {
            this.k.a(d.a());
            this.h.a(d.c());
        }
        this.j.onAdClicked(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.f7133a, null, null, 6, null));
    }

    public final void d() {
        this.k.a();
        com.moloco.sdk.internal.publisher.z.a.a(this.j, com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.f7133a, null, null, 6, null), null, 2, null);
    }

    public static final com.moloco.sdk.internal.ortb.model.B a(com.moloco.sdk.internal.ortb.model.C3415e c3415e) {
        return c3415e.getExt().getSdkEvents();
    }

    public static final com.moloco.sdk.internal.publisher.C3427k a(com.moloco.sdk.internal.publisher.nativead.d dVar) {
        java.lang.String str = dVar.b.getCom.ironsource.q2.y java.lang.String();
        if (str != null) {
            return new com.moloco.sdk.internal.publisher.C3427k(str, java.lang.Float.valueOf(dVar.b.getPrice()));
        }
        return null;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public java.util.List<java.lang.String> f7134a;
        public java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.C0197b> b;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c;
        public final java.util.Set<java.lang.String> d;

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.d$a$a, reason: collision with other inner class name */
        public static final class C0194a {

            /* renamed from: a, reason: collision with root package name */
            public static final com.moloco.sdk.internal.publisher.nativead.d.a.C0194a f7135a = new com.moloco.sdk.internal.publisher.nativead.d.a.C0194a();
            public static final int b = 1;
            public static final int c = 0;
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final com.moloco.sdk.internal.publisher.nativead.d.a.b f7136a = new com.moloco.sdk.internal.publisher.nativead.d.a.b();
            public static final int b = 1;
            public static final int c = 0;
        }

        public a(java.util.List<java.lang.String> list, java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.C0197b> list2, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
            this.f7134a = list;
            this.b = list2;
            this.c = persistentHttpRequest;
            this.d = new java.util.LinkedHashSet();
        }

        public final void a() {
            java.util.List<java.lang.String> list = this.f7134a;
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.c.a((java.lang.String) it.next());
                }
            }
            this.f7134a = null;
            java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.C0197b> list2 = this.b;
            if (list2 != null) {
                for (com.moloco.sdk.internal.publisher.nativead.model.b.C0197b c0197b : list2) {
                    if (c0197b.c() != null && c0197b.a() == 1 && c0197b.b() == 1) {
                        this.c.a(c0197b.c());
                    }
                }
            }
            this.b = null;
        }

        public final void a(java.util.List<java.lang.String> urls) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urls, "urls");
            for (java.lang.String str : urls) {
                if (!this.d.contains(str)) {
                    this.c.a(str);
                    this.d.add(str);
                }
            }
        }
    }
}
