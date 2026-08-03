package com.moloco.sdk.internal.ilrd.provider;

/* loaded from: classes5.dex */
public final class a implements com.moloco.sdk.internal.ilrd.d {
    public static final com.moloco.sdk.internal.ilrd.provider.a.C0181a h = new com.moloco.sdk.internal.ilrd.provider.a.C0181a(null);
    public static final int i = 8;
    public static volatile com.applovin.communicator.AppLovinCommunicatorSubscriber j = null;
    public static final java.lang.String k = "max_revenue_events";
    public static final java.lang.String l = "ApplovinIlrd";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6995a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final com.moloco.sdk.internal.ilrd.model.a c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.internal.ilrd.h> f;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.internal.ilrd.d.a.b> g;

    /* renamed from: com.moloco.sdk.internal.ilrd.provider.a$a, reason: collision with other inner class name */
    public static final class C0181a {
        public /* synthetic */ C0181a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0181a() {
        }
    }

    public static final class b implements com.applovin.communicator.AppLovinCommunicatorSubscriber {

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.provider.ApplovinIlrd$createCallback$1$onMessageReceived$1", f = "ApplovinIlrd.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.internal.ilrd.provider.a$b$a, reason: collision with other inner class name */
        public static final class C0182a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f6997a;
            public final /* synthetic */ com.moloco.sdk.internal.ilrd.provider.a b;
            public final /* synthetic */ com.moloco.sdk.internal.ilrd.d.a.b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0182a(com.moloco.sdk.internal.ilrd.provider.a aVar, com.moloco.sdk.internal.ilrd.d.a.b bVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.provider.a.b.C0182a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.internal.ilrd.provider.a.b.C0182a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.internal.ilrd.provider.a.b.C0182a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f6997a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.b.g;
                    com.moloco.sdk.internal.ilrd.d.a.b bVar = this.c;
                    this.f6997a = 1;
                    if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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

        public b() {
        }

        public java.lang.String getCommunicatorId() {
            return "Moloco";
        }

        public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(com.moloco.sdk.internal.ilrd.provider.a.this.b) && kotlin.jvm.internal.Intrinsics.areEqual(com.moloco.sdk.internal.ilrd.provider.a.k, message.getTopic())) {
                android.os.Bundle messageData = message.getMessageData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageData, "getMessageData(...)");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.ilrd.provider.a.this.b, null, null, new com.moloco.sdk.internal.ilrd.provider.a.b.C0182a(com.moloco.sdk.internal.ilrd.provider.a.this, com.moloco.sdk.internal.ilrd.provider.a.this.a(messageData), null), 3, null);
            }
        }
    }

    public a(android.content.Context context, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f6995a = context;
        this.b = scope;
        this.c = com.moloco.sdk.internal.ilrd.model.a.f6994a;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.ilrd.provider.a.d(com.moloco.sdk.internal.ilrd.provider.a.this);
            }
        });
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.ilrd.provider.a.c(com.moloco.sdk.internal.ilrd.provider.a.this);
            }
        });
        this.f = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.moloco.sdk.internal.ilrd.h.c.b);
        this.g = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final kotlinx.coroutines.flow.SharedFlow c(com.moloco.sdk.internal.ilrd.provider.a aVar) {
        return kotlinx.coroutines.flow.FlowKt.asSharedFlow(aVar.g);
    }

    public static final kotlinx.coroutines.flow.StateFlow d(com.moloco.sdk.internal.ilrd.provider.a aVar) {
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(aVar.f);
    }

    public final java.lang.Object e() {
        java.lang.Object m10798constructorimpl;
        com.applovin.communicator.AppLovinCommunicator appLovinCommunicator;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Class.forName("com.applovin.communicator.AppLovinCommunicator");
            java.lang.Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage");
            try {
                appLovinCommunicator = com.applovin.communicator.AppLovinCommunicator.getInstance();
            } catch (java.lang.Throwable unused) {
                appLovinCommunicator = com.applovin.communicator.AppLovinCommunicator.getInstance(this.f6995a);
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(appLovinCommunicator);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
        }
        com.moloco.sdk.internal.ilrd.provider.a.b d = d();
        j = d;
        ((com.applovin.communicator.AppLovinCommunicator) m10798constructorimpl).subscribe(d, k);
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
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
    public kotlinx.coroutines.flow.SharedFlow<com.moloco.sdk.internal.ilrd.d.a.b> c() {
        return (kotlinx.coroutines.flow.SharedFlow) this.e.getValue();
    }

    public final com.moloco.sdk.internal.ilrd.provider.a.b d() {
        return new com.moloco.sdk.internal.ilrd.provider.a.b();
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.c;
    }

    public final com.moloco.sdk.internal.ilrd.d.a.b a(android.os.Bundle bundle) {
        double d = bundle.getDouble("revenue");
        java.lang.String string = bundle.getString("country_code");
        java.lang.String string2 = bundle.getString("network_name");
        java.lang.String string3 = bundle.getString("max_ad_unit_id");
        java.lang.String string4 = bundle.getString("third_party_ad_placement_id");
        java.lang.String string5 = bundle.getString(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT);
        java.lang.String string6 = bundle.getString("user_segment");
        java.lang.String string7 = bundle.getString("id");
        com.moloco.sdk.IlrdRequest.MaxImpression.Builder newBuilder = com.moloco.sdk.IlrdRequest.MaxImpression.newBuilder();
        newBuilder.setRevenue(d);
        if (string != null) {
            newBuilder.setCountryCode(string);
        }
        if (string2 != null) {
            newBuilder.setNetworkName(string2);
        }
        if (string3 != null) {
            newBuilder.setMaxAdUnitId(string3);
        }
        if (string4 != null) {
            newBuilder.setThirdPartyAdPlacementId(string4);
        }
        if (string5 != null) {
            newBuilder.setAdFormat(string5);
        }
        if (string6 != null) {
            newBuilder.setUserSegment(string6);
        }
        if (string7 != null) {
            newBuilder.setId(string7);
        }
        com.moloco.sdk.IlrdRequest.MaxImpression build = newBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new com.moloco.sdk.internal.ilrd.d.a.b(build);
    }
}
