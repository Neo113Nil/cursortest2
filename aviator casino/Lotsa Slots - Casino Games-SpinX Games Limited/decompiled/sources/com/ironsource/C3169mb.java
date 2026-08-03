package com.ironsource;

/* renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3169mb {
    public static final java.lang.String d = "do_not_sell";
    private static com.ironsource.C3169mb f;

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3312ub f6388a;
    private final com.ironsource.mediationsdk.c b;
    public static final com.ironsource.C3169mb.a c = new com.ironsource.C3169mb.a(null);
    private static final java.util.List<java.lang.String> e = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"admob_tfcd", "admob_tfua", "BidMachine_COPPA", "chartboost_coppa", "DT_COPPA", com.ironsource.mediationsdk.metadata.a.b, "LevelPlay_ChildDirected", "meta_mixed_audience", "Mintegral_COPPA", "Moloco_COPPA", "Pangle_COPPA", "UnityAds_COPPA", "Vungle_COPPA", "Yandex_COPPA"});

    /* renamed from: com.ironsource.mb$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<java.lang.String> a() {
            return com.ironsource.C3169mb.e;
        }

        public final com.ironsource.C3169mb b() {
            return com.ironsource.C3169mb.f;
        }

        private a() {
        }

        public final void a(com.ironsource.C3169mb testInstance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testInstance, "testInstance");
            com.ironsource.C3169mb.f = testInstance;
        }
    }

    static {
        com.ironsource.C3312ub c3312ub = new com.ironsource.C3312ub();
        com.ironsource.mediationsdk.c b = com.ironsource.mediationsdk.c.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
        f = new com.ironsource.C3169mb(c3312ub, b);
    }

    public C3169mb(com.ironsource.C3312ub tools, com.ironsource.mediationsdk.c adapterRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterRepository, "adapterRepository");
        this.f6388a = tools;
        this.b = adapterRepository;
    }

    public final void b(final boolean z) {
        this.f6388a.d(new java.lang.Runnable() { // from class: com.ironsource.mb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3169mb.b(com.ironsource.C3169mb.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.C3169mb this$0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f6388a.b(z);
        java.util.Iterator<java.lang.String> it = e.iterator();
        while (it.hasNext()) {
            this$0.b.c(it.next(), kotlin.collections.CollectionsKt.listOf(java.lang.String.valueOf(z)));
        }
    }

    public final void a(final java.util.Map<java.lang.String, java.lang.Boolean> networkConsents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        this.f6388a.d(new java.lang.Runnable() { // from class: com.ironsource.mb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3169mb.a(com.ironsource.C3169mb.this, networkConsents);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3169mb this$0, java.util.Map networkConsents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConsents, "$networkConsents");
        this$0.f6388a.a((java.util.Map<java.lang.String, java.lang.Boolean>) networkConsents);
        this$0.b.a((java.util.Map<java.lang.String, java.lang.Boolean>) networkConsents);
    }

    public final void a(final boolean z) {
        this.f6388a.d(new java.lang.Runnable() { // from class: com.ironsource.mb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3169mb.a(com.ironsource.C3169mb.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3169mb this$0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f6388a.a(z);
        this$0.b.c("do_not_sell", kotlin.collections.CollectionsKt.listOf(java.lang.String.valueOf(z)));
    }
}
