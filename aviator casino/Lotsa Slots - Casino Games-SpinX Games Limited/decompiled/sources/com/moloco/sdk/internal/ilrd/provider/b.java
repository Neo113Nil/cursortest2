package com.moloco.sdk.internal.ilrd.provider;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.ilrd.d {
    public static final com.moloco.sdk.internal.ilrd.provider.b.a h = new com.moloco.sdk.internal.ilrd.provider.b.a(null);
    public static final int i = 8;
    public static final java.lang.String j = "IronsourceIlrd";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6998a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final com.moloco.sdk.internal.ilrd.model.a c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.internal.ilrd.h> f;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.internal.ilrd.d.a.C0180a> g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.moloco.sdk.internal.ilrd.provider.b$b, reason: collision with other inner class name */
    public static final class C0183b implements com.unity3d.mediation.impression.LevelPlayImpressionDataListener {

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.provider.IronsourceIlrd$createCallback$1$onImpressionSuccess$1", f = "IronsourceIlrd.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.internal.ilrd.provider.b$b$a */
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7000a;
            public final /* synthetic */ com.moloco.sdk.internal.ilrd.provider.b b;
            public final /* synthetic */ com.moloco.sdk.internal.ilrd.d.a.C0180a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.internal.ilrd.provider.b bVar, com.moloco.sdk.internal.ilrd.d.a.C0180a c0180a, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.provider.b.C0183b.a> continuation) {
                super(2, continuation);
                this.b = bVar;
                this.c = c0180a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.internal.ilrd.provider.b.C0183b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.internal.ilrd.provider.b.C0183b.a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7000a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.b.g;
                    com.moloco.sdk.internal.ilrd.d.a.C0180a c0180a = this.c;
                    this.f7000a = 1;
                    if (mutableSharedFlow.emit(c0180a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        public C0183b() {
        }

        @Override // com.unity3d.mediation.impression.LevelPlayImpressionDataListener
        public void onImpressionSuccess(com.unity3d.mediation.impression.LevelPlayImpressionData impressionData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionData, "impressionData");
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(com.moloco.sdk.internal.ilrd.provider.b.this.b)) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.ilrd.provider.b.this.b, null, null, new com.moloco.sdk.internal.ilrd.provider.b.C0183b.a(com.moloco.sdk.internal.ilrd.provider.b.this, com.moloco.sdk.internal.ilrd.provider.b.this.a(impressionData), null), 3, null);
            }
        }
    }

    public b(android.content.Context context, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f6998a = context;
        this.b = scope;
        this.c = com.moloco.sdk.internal.ilrd.model.a.b;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.ilrd.provider.b.d(com.moloco.sdk.internal.ilrd.provider.b.this);
            }
        });
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.ilrd.provider.b.c(com.moloco.sdk.internal.ilrd.provider.b.this);
            }
        });
        this.f = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.moloco.sdk.internal.ilrd.h.c.b);
        this.g = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final kotlinx.coroutines.flow.SharedFlow c(com.moloco.sdk.internal.ilrd.provider.b bVar) {
        return kotlinx.coroutines.flow.FlowKt.asSharedFlow(bVar.g);
    }

    public static final kotlinx.coroutines.flow.StateFlow d(com.moloco.sdk.internal.ilrd.provider.b bVar) {
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(bVar.f);
    }

    private final java.lang.Object e() {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Class.forName("com.unity3d.mediation.LevelPlay");
            java.lang.Class.forName("com.unity3d.mediation.impression.LevelPlayImpressionData");
            com.unity3d.mediation.LevelPlay.addImpressionDataListener(d());
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        }
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.internal.ilrd.h> getState() {
        return (kotlinx.coroutines.flow.StateFlow) this.d.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public synchronized java.lang.Object b() {
        java.lang.Object e;
        e = e();
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(e);
        if (m10801exceptionOrNullimpl != null) {
            this.f.setValue(new com.moloco.sdk.internal.ilrd.h.a(m10801exceptionOrNullimpl.toString()));
        }
        if (kotlin.Result.m10805isSuccessimpl(e)) {
            this.f.setValue(com.moloco.sdk.internal.ilrd.h.b.b);
        }
        return e;
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public kotlinx.coroutines.flow.SharedFlow<com.moloco.sdk.internal.ilrd.d.a.C0180a> c() {
        return (kotlinx.coroutines.flow.SharedFlow) this.e.getValue();
    }

    public final com.moloco.sdk.internal.ilrd.provider.b.C0183b d() {
        return new com.moloco.sdk.internal.ilrd.provider.b.C0183b();
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.c;
    }

    public final com.moloco.sdk.internal.ilrd.d.a.C0180a a(com.unity3d.mediation.impression.LevelPlayImpressionData levelPlayImpressionData) {
        com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder newBuilder = com.moloco.sdk.IlrdRequest.LevelPlayImpression.newBuilder();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String auctionId = levelPlayImpressionData.getAuctionId();
            kotlin.Result.m10798constructorimpl(auctionId != null ? newBuilder.setAuctionId(auctionId) : null);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            java.lang.String adFormat = levelPlayImpressionData.getAdFormat();
            kotlin.Result.m10798constructorimpl(adFormat != null ? newBuilder.setAdFormat(adFormat) : null);
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        try {
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            java.lang.String adNetwork = levelPlayImpressionData.getAdNetwork();
            kotlin.Result.m10798constructorimpl(adNetwork != null ? newBuilder.setNetworkName(adNetwork) : null);
        } catch (java.lang.Throwable th3) {
            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th3));
        }
        try {
            kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
            java.lang.String instanceName = levelPlayImpressionData.getInstanceName();
            kotlin.Result.m10798constructorimpl(instanceName != null ? newBuilder.setInstanceName(instanceName) : null);
        } catch (java.lang.Throwable th4) {
            kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th4));
        }
        try {
            kotlin.Result.Companion companion9 = kotlin.Result.INSTANCE;
            java.lang.String instanceId = levelPlayImpressionData.getInstanceId();
            kotlin.Result.m10798constructorimpl(instanceId != null ? newBuilder.setInstanceId(instanceId) : null);
        } catch (java.lang.Throwable th5) {
            kotlin.Result.Companion companion10 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th5));
        }
        try {
            kotlin.Result.Companion companion11 = kotlin.Result.INSTANCE;
            java.lang.String country = levelPlayImpressionData.getCountry();
            kotlin.Result.m10798constructorimpl(country != null ? newBuilder.setCountryCode(country) : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion12 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        try {
            kotlin.Result.Companion companion13 = kotlin.Result.INSTANCE;
            java.lang.String placement = levelPlayImpressionData.getPlacement();
            kotlin.Result.m10798constructorimpl(placement != null ? newBuilder.setPlacement(placement) : null);
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion14 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        try {
            kotlin.Result.Companion companion15 = kotlin.Result.INSTANCE;
            java.lang.Double revenue = levelPlayImpressionData.getRevenue();
            kotlin.Result.m10798constructorimpl(revenue != null ? newBuilder.setRevenue(revenue.doubleValue()) : null);
        } catch (java.lang.Throwable th8) {
            kotlin.Result.Companion companion16 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th8));
        }
        try {
            kotlin.Result.Companion companion17 = kotlin.Result.INSTANCE;
            java.lang.String precision = levelPlayImpressionData.getPrecision();
            kotlin.Result.m10798constructorimpl(precision != null ? newBuilder.setPrecision(precision) : null);
        } catch (java.lang.Throwable th9) {
            kotlin.Result.Companion companion18 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th9));
        }
        try {
            kotlin.Result.Companion companion19 = kotlin.Result.INSTANCE;
            java.lang.String ab = levelPlayImpressionData.getAb();
            kotlin.Result.m10798constructorimpl(ab != null ? newBuilder.setAb(ab) : null);
        } catch (java.lang.Throwable th10) {
            kotlin.Result.Companion companion20 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th10));
        }
        try {
            kotlin.Result.Companion companion21 = kotlin.Result.INSTANCE;
            java.lang.String segmentName = levelPlayImpressionData.getSegmentName();
            kotlin.Result.m10798constructorimpl(segmentName != null ? newBuilder.setSegmentName(segmentName) : null);
        } catch (java.lang.Throwable th11) {
            kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th11));
        }
        try {
            kotlin.Result.Companion companion23 = kotlin.Result.INSTANCE;
            java.lang.String encryptedCPM = levelPlayImpressionData.getEncryptedCPM();
            kotlin.Result.m10798constructorimpl(encryptedCPM != null ? newBuilder.setEncryptedCpm(encryptedCPM) : null);
        } catch (java.lang.Throwable th12) {
            kotlin.Result.Companion companion24 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th12));
        }
        try {
            kotlin.Result.Companion companion25 = kotlin.Result.INSTANCE;
            java.lang.String creativeId = levelPlayImpressionData.getCreativeId();
            kotlin.Result.m10798constructorimpl(creativeId != null ? newBuilder.setCreativeId(creativeId) : null);
        } catch (java.lang.Throwable th13) {
            kotlin.Result.Companion companion26 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th13));
        }
        com.moloco.sdk.IlrdRequest.LevelPlayImpression build = newBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new com.moloco.sdk.internal.ilrd.d.a.C0180a(build);
    }
}
