package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class v<T extends com.moloco.sdk.publisher.AdShowListener> implements com.moloco.sdk.publisher.FullscreenAd<T>, com.moloco.sdk.internal.publisher.s {
    public static final com.moloco.sdk.internal.publisher.v.a u = new com.moloco.sdk.internal.publisher.v.a(null);
    public static final int v = 8;
    public static final java.lang.String w = "FullscreenAdImpl";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7173a;
    public final com.moloco.sdk.internal.services.InterfaceC3435f b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final java.lang.String d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;
    public final kotlin.jvm.functions.Function1<com.moloco.sdk.internal.ortb.model.z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h> g;
    public final com.moloco.sdk.internal.publisher.u<T> h;
    public final com.moloco.sdk.publisher.AdFormatType i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y j;
    public final com.moloco.sdk.internal.publisher.C3417a k;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder l;
    public final kotlinx.coroutines.CoroutineScope m;
    public final com.moloco.sdk.acm.TimerEvent n;
    public com.moloco.sdk.acm.TimerEvent o;
    public final com.moloco.sdk.publisher.AdLoad p;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h q;
    public com.moloco.sdk.internal.ortb.model.C3413c r;
    public kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> s;
    public kotlin.jvm.functions.Function0<kotlin.Unit> t;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Long, kotlin.time.Duration> {
        public b(java.lang.Object obj) {
            super(1, obj, com.moloco.sdk.internal.publisher.C3417a.class, "calculateTimeout", "calculateTimeout-5sfh64U(J)J", 0);
        }

        public final long a(long j) {
            return ((com.moloco.sdk.internal.publisher.C3417a) this.receiver).a(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.time.Duration invoke(java.lang.Long l) {
            return kotlin.time.Duration.m12144boximpl(a(l.longValue()));
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.moloco.sdk.internal.ortb.model.C3415e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b> {
        public c(java.lang.Object obj) {
            super(1, obj, com.moloco.sdk.internal.publisher.v.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b invoke(com.moloco.sdk.internal.ortb.model.C3415e p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            return ((com.moloco.sdk.internal.publisher.v) this.receiver).a(p0);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1", f = "FullscreenAdImpl.kt", i = {}, l = {277, 279}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7174a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a b;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.z c;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.v<T> d;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1$1", f = "FullscreenAdImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7175a;
            public /* synthetic */ boolean b;

            public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.v.d.a> continuation) {
                super(2, continuation);
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return ((com.moloco.sdk.internal.publisher.v.d.a) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.internal.publisher.v.d.a aVar = new com.moloco.sdk.internal.publisher.v.d.a(continuation);
                aVar.b = ((java.lang.Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7175a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b);
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1$2", f = "FullscreenAdImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7176a;
            public /* synthetic */ boolean b;

            public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.v.d.b> continuation) {
                super(2, continuation);
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return ((com.moloco.sdk.internal.publisher.v.d.b) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.internal.publisher.v.d.b bVar = new com.moloco.sdk.internal.publisher.v.d.b(continuation);
                bVar.b = ((java.lang.Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7176a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a interfaceC3442a, com.moloco.sdk.internal.publisher.z zVar, com.moloco.sdk.internal.publisher.v<? super T> vVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.v.d> continuation) {
            super(2, continuation);
            this.b = interfaceC3442a;
            this.c = zVar;
            this.d = vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.v.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.v.d(this.b, this.c, this.d, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.internal.publisher.z zVar;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7174a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l = this.b.l();
                com.moloco.sdk.internal.publisher.v.d.a aVar = new com.moloco.sdk.internal.publisher.v.d.a(null);
                this.f7174a = 1;
                if (kotlinx.coroutines.flow.FlowKt.first(l, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    zVar = this.c;
                    if (zVar != null) {
                        zVar.onAdHidden(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.d.d, null, null, 6, null));
                    }
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.internal.publisher.z zVar2 = this.c;
            if (zVar2 != null) {
                com.moloco.sdk.internal.publisher.z.a.a(zVar2, com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.d.d, null, null, 6, null), null, 2, null);
            }
            kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l2 = this.b.l();
            com.moloco.sdk.internal.publisher.v.d.b bVar = new com.moloco.sdk.internal.publisher.v.d.b(null);
            this.f7174a = 2;
            if (kotlinx.coroutines.flow.FlowKt.first(l2, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zVar = this.c;
            if (zVar != null) {
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$load$1", f = "FullscreenAdImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7177a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.v<T> b;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ com.moloco.sdk.publisher.AdLoad.Listener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.moloco.sdk.internal.publisher.v<? super T> vVar, java.lang.String str, com.moloco.sdk.publisher.AdLoad.Listener listener, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.v.e> continuation) {
            super(2, continuation);
            this.b = vVar;
            this.c = str;
            this.d = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.v.e) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.v.e(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7177a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.b.p.load(this.c, this.d);
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.publisher.v<T> f7179a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.z b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(com.moloco.sdk.internal.publisher.v<? super T> vVar, com.moloco.sdk.internal.publisher.z zVar) {
            this.f7179a = vVar;
            this.b = zVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            com.moloco.sdk.internal.publisher.v<T> vVar = this.f7179a;
            vVar.a(com.moloco.sdk.internal.t.a(vVar.d, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            com.moloco.sdk.internal.publisher.z zVar = this.b;
            if (zVar != null) {
                zVar.onAdClicked(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.f7179a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.v.w, "Template ad skip button shown, triggering reward callback", null, false, 12, null);
            kotlin.jvm.functions.Function0<kotlin.Unit> c = this.f7179a.c();
            if (c != null) {
                c.invoke();
            }
            com.moloco.sdk.internal.publisher.z zVar = this.b;
            if (zVar != null) {
                zVar.a();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$show$2", f = "FullscreenAdImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7180a;
        public final /* synthetic */ T b;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.v<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(T t, com.moloco.sdk.internal.publisher.v<? super T> vVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.v.h> continuation) {
            super(2, continuation);
            this.b = t;
            this.c = vVar;
        }

        public static final com.moloco.sdk.internal.publisher.C3427k b(com.moloco.sdk.internal.publisher.v vVar) {
            return vVar.a();
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c(com.moloco.sdk.internal.publisher.v vVar) {
            return vVar.b();
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.v.h) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.v.h(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7180a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a interfaceC3442a = null;
            if (this.b != null) {
                com.moloco.sdk.internal.publisher.u uVar = this.c.h;
                T t = this.b;
                com.moloco.sdk.internal.services.InterfaceC3435f interfaceC3435f = this.c.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = this.c.c;
                final com.moloco.sdk.internal.publisher.v<T> vVar = this.c;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.v$h$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.internal.publisher.v.h.a(com.moloco.sdk.internal.publisher.v.this);
                    }
                };
                final com.moloco.sdk.internal.publisher.v<T> vVar2 = this.c;
                kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.v$h$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.internal.publisher.v.h.b(com.moloco.sdk.internal.publisher.v.this);
                    }
                };
                com.moloco.sdk.publisher.AdFormatType adFormatType = this.c.i;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.c.l;
                final com.moloco.sdk.internal.publisher.v<T> vVar3 = this.c;
                uVar.a(new com.moloco.sdk.internal.publisher.D(t, interfaceC3435f, aVar, function0, function02, adFormatType, metricsRecorder, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.v$h$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.internal.publisher.v.h.c(com.moloco.sdk.internal.publisher.v.this);
                    }
                }));
            } else {
                this.c.h.a((com.moloco.sdk.internal.publisher.z) null);
            }
            com.moloco.sdk.internal.publisher.z d = this.c.h.d();
            if (this.c.h.a() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a2 = this.c.h.a();
                if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) {
                    interfaceC3442a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) a2;
                }
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a3 = this.c.h.a();
                if (a3 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) {
                    interfaceC3442a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) a3;
                }
            }
            if (interfaceC3442a == null || !this.c.isLoaded()) {
                if (d != null) {
                    d.a(com.moloco.sdk.internal.t.a(this.c.d, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED, com.moloco.sdk.internal.o.f, null, 8, null));
                }
                return kotlin.Unit.INSTANCE;
            }
            if (interfaceC3442a.l().getValue().booleanValue()) {
                if (d != null) {
                    d.a(com.moloco.sdk.internal.t.a(this.c.d, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_SHOW_ERROR_ALREADY_DISPLAYING, com.moloco.sdk.internal.o.g, null, 8, null));
                }
                return kotlin.Unit.INSTANCE;
            }
            this.c.a(interfaceC3442a, d);
            if (interfaceC3442a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) interfaceC3442a).a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t) this.c.b(d));
            } else if (interfaceC3442a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) interfaceC3442a).a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) this.c.q, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h) this.c.a(d));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static final com.moloco.sdk.internal.ortb.model.B a(com.moloco.sdk.internal.publisher.v vVar) {
            return vVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, kotlin.jvm.functions.Function1<? super com.moloco.sdk.internal.ortb.model.z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h> generateAggregatedOptions, com.moloco.sdk.internal.publisher.u<T> adDataHolder, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateAggregatedOptions, "generateAggregatedOptions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDataHolder, "adDataHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7173a = context;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = adUnitId;
        this.e = persistentHttpRequest;
        this.f = externalLinkHandler;
        this.g = generateAggregatedOptions;
        this.h = adDataHolder;
        this.i = adFormatType;
        this.j = watermark;
        this.k = adCreateLoadTimeoutManager;
        this.l = metricsRecorder;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = CoroutineScope;
        com.moloco.sdk.acm.TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        java.lang.String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase = adFormatType.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.n = startTimerEvent.withTag(c2, lowerCase);
        this.p = com.moloco.sdk.internal.publisher.C3421e.a(CoroutineScope, new com.moloco.sdk.internal.publisher.v.b(adCreateLoadTimeoutManager), adUnitId, new com.moloco.sdk.internal.publisher.v.c(this), adFormatType, com.moloco.sdk.service_locator.a.C0211a.f7342a.b(), metricsRecorder, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.v$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.v.k(com.moloco.sdk.internal.publisher.v.this);
            }
        });
        this.q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h) generateAggregatedOptions.invoke(null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i k(com.moloco.sdk.internal.publisher.v vVar) {
        return vVar.b();
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.m, null, 1, null);
        a(this, null, 1, null);
        this.s = null;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.k.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.p.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(java.lang.String bidResponseJson, com.moloco.sdk.publisher.AdLoad.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.l.recordTimerEvent(this.n);
        this.o = this.l.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.p.c());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new com.moloco.sdk.internal.publisher.v.e(this, bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j) {
        this.k.setCreateAdObjectStartTime(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // com.moloco.sdk.publisher.FullscreenAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void show(T t) {
        java.lang.String lowerCase;
        java.lang.String name;
        com.moloco.sdk.acm.TimerEvent timerEvent = this.o;
        if (timerEvent != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b2 = b();
            if (b2 != null && (name = b2.name()) != null) {
                lowerCase = name.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.toString().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.l;
            java.lang.String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
            java.lang.String lowerCase2 = this.i.name().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            metricsRecorder.recordTimerEvent(timerEvent.withTag(c2, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
        }
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.l;
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.A.c());
        java.lang.String c3 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase3 = this.i.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        metricsRecorder2.recordCountEvent(countEvent.withTag(c3, lowerCase3));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new com.moloco.sdk.internal.publisher.v.h(t, this, null), 3, null);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> c() {
        return this.t;
    }

    public final com.moloco.sdk.internal.ortb.model.B d() {
        return this.h.e();
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> e() {
        return this.s;
    }

    public final java.lang.Boolean f() {
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> k;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a2 = this.h.a();
        if (a2 == null || (k = a2.k()) == null) {
            return null;
        }
        return k.getValue();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a2 = this.h.a();
        if (a2 != null) {
            return a2.getCreativeType();
        }
        return null;
    }

    public final com.moloco.sdk.internal.publisher.v.g b(com.moloco.sdk.internal.publisher.z zVar) {
        return new com.moloco.sdk.internal.publisher.v.g(this, zVar);
    }

    public final com.moloco.sdk.internal.publisher.C3427k a() {
        return this.h.c();
    }

    public static /* synthetic */ void a(com.moloco.sdk.internal.publisher.v vVar, com.moloco.sdk.internal.s sVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sVar = null;
        }
        vVar.a(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.moloco.sdk.internal.s sVar) {
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l;
        com.moloco.sdk.internal.publisher.u<T> uVar = this.h;
        kotlinx.coroutines.Job b2 = uVar.b();
        if (b2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(b2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        uVar.a((kotlinx.coroutines.Job) null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a2 = this.h.a();
        boolean z = (a2 == null || (l = a2.l()) == null || !l.getValue().booleanValue()) ? false : true;
        com.moloco.sdk.internal.publisher.u<T> uVar2 = this.h;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a3 = uVar2.a();
        if (a3 != null) {
            a3.destroy();
        }
        uVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?>) null);
        com.moloco.sdk.internal.publisher.u<T> uVar3 = this.h;
        com.moloco.sdk.internal.publisher.z d2 = uVar3.d();
        uVar3.a((com.moloco.sdk.internal.publisher.z) null);
        if (sVar != null && d2 != null) {
            d2.a(sVar);
        }
        if (z && d2 != null) {
            d2.onAdHidden(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        this.h.a((com.moloco.sdk.internal.ortb.model.B) null);
        this.h.a((com.moloco.sdk.internal.publisher.C3427k) null);
    }

    public static final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.publisher.v<T> f7178a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.z b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(com.moloco.sdk.internal.publisher.v<? super T> vVar, com.moloco.sdk.internal.publisher.z zVar) {
            this.f7178a = vVar;
            this.b = zVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w
        public void a(boolean z) {
            java.lang.String eventLink;
            com.moloco.sdk.internal.ortb.model.C3413c c3413c = this.f7178a.r;
            if (c3413c != null) {
                com.moloco.sdk.internal.publisher.v<T> vVar = this.f7178a;
                if (c3413c.getEnabled() && ((!z || c3413c.getOnSkip()) && (eventLink = c3413c.getEventLink()) != null)) {
                    vVar.e.a(eventLink);
                }
            }
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> e = this.f7178a.e();
            if (e != null) {
                e.invoke(java.lang.Boolean.valueOf(z));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            com.moloco.sdk.internal.publisher.z zVar = this.b;
            if (zVar != null) {
                zVar.onAdClicked(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.f7178a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.v.w, "Ad skip button shown, triggering callback", null, false, 12, null);
            kotlin.jvm.functions.Function0<kotlin.Unit> c = this.f7178a.c();
            if (c != null) {
                c.invoke();
            }
            com.moloco.sdk.internal.publisher.z zVar = this.b;
            if (zVar != null) {
                zVar.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            com.moloco.sdk.internal.publisher.v<T> vVar = this.f7178a;
            vVar.a(com.moloco.sdk.internal.t.a(vVar.d, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b a(com.moloco.sdk.internal.ortb.model.C3415e c3415e) {
        com.moloco.sdk.internal.ortb.model.z player;
        com.moloco.sdk.internal.ortb.model.s experimental;
        java.lang.Boolean serverRenderingIgnoreNetErrFailed;
        a(this, null, 1, null);
        com.moloco.sdk.internal.ortb.model.x xVar = c3415e.getExt().getCom.ironsource.e8.p java.lang.String();
        if (xVar != null && kotlin.jvm.internal.Intrinsics.areEqual(xVar.getServerRenderingEnabled(), java.lang.Boolean.TRUE)) {
            com.moloco.sdk.internal.ortb.model.x xVar2 = c3415e.getExt().getCom.ironsource.e8.p java.lang.String();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.a(this.f7173a, c3415e.getAdm(), new com.moloco.sdk.internal.services.t(this.f, this.c), this.j, this.l, (xVar2 == null || (experimental = xVar2.getExperimental()) == null || (serverRenderingIgnoreNetErrFailed = experimental.getServerRenderingIgnoreNetErrFailed()) == null) ? true : serverRenderingIgnoreNetErrFailed.booleanValue());
            com.moloco.sdk.internal.publisher.u<T> uVar = this.h;
            uVar.a(a2);
            com.moloco.sdk.internal.ortb.model.C3416f ext = c3415e.getExt();
            uVar.a(ext != null ? ext.getSdkEvents() : null);
            uVar.a(c3415e.getCom.ironsource.q2.y java.lang.String() != null ? new com.moloco.sdk.internal.publisher.C3427k(c3415e.getCom.ironsource.q2.y java.lang.String(), java.lang.Float.valueOf(c3415e.getPrice())) : null);
            return a2;
        }
        kotlin.jvm.functions.Function1<com.moloco.sdk.internal.ortb.model.z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h> function1 = this.g;
        com.moloco.sdk.internal.ortb.model.C3416f ext2 = c3415e.getExt();
        this.q = function1.invoke(ext2 != null ? ext2.getPlayer() : null);
        com.moloco.sdk.internal.ortb.model.C3416f ext3 = c3415e.getExt();
        this.r = (ext3 == null || (player = ext3.getPlayer()) == null) ? null : player.getAutoStore();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.a(this.f7173a, this.c, null, c3415e, this.f, this.j, this.l, 4, null);
        com.moloco.sdk.internal.publisher.u<T> uVar2 = this.h;
        uVar2.a(a3);
        com.moloco.sdk.internal.ortb.model.C3416f ext4 = c3415e.getExt();
        uVar2.a(ext4 != null ? ext4.getSdkEvents() : null);
        uVar2.a(c3415e.getCom.ironsource.q2.y java.lang.String() != null ? new com.moloco.sdk.internal.publisher.C3427k(c3415e.getCom.ironsource.q2.y java.lang.String(), java.lang.Float.valueOf(c3415e.getPrice())) : null);
        return a3;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a interfaceC3442a, com.moloco.sdk.internal.publisher.z zVar) {
        kotlinx.coroutines.Job launch$default;
        com.moloco.sdk.internal.publisher.u<T> uVar = this.h;
        kotlinx.coroutines.Job b2 = uVar.b();
        if (b2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(b2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new com.moloco.sdk.internal.publisher.v.d(interfaceC3442a, zVar, this, null), 3, null);
        uVar.a(launch$default);
    }

    public final void a(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        this.s = function1;
    }

    public final void a(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.t = function0;
    }

    public final com.moloco.sdk.internal.publisher.v.f a(com.moloco.sdk.internal.publisher.z zVar) {
        return new com.moloco.sdk.internal.publisher.v.f(this, zVar);
    }

    public /* synthetic */ v(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f interfaceC3435f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, kotlin.jvm.functions.Function1 function1, com.moloco.sdk.internal.publisher.u uVar, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.internal.publisher.C3417a c3417a, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC3435f, aVar, str, iVar, rVar, function1, (i & 128) != 0 ? new com.moloco.sdk.internal.publisher.u(null, null, null, null, null, 31, null) : uVar, adFormatType, yVar, c3417a, metricsRecorder);
    }
}
