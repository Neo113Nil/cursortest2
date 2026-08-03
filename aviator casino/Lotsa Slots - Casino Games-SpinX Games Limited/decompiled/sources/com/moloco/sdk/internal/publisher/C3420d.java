package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3420d implements com.moloco.sdk.publisher.AdLoad {
    public static final com.moloco.sdk.internal.publisher.C3420d.a p = new com.moloco.sdk.internal.publisher.C3420d.a(null);
    public static final int q = 8;

    @java.lang.Deprecated
    public static final java.lang.String r = "AdLoad";

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.time.Duration> f7092a;
    public final java.lang.String b;
    public final kotlin.jvm.functions.Function1<com.moloco.sdk.internal.ortb.model.C3415e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b> c;
    public final com.moloco.sdk.internal.ortb.b d;
    public final com.moloco.sdk.internal.publisher.q e;
    public final com.moloco.sdk.publisher.AdFormatType f;
    public final com.moloco.sdk.internal.services.L g;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder h;
    public final kotlin.jvm.functions.Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> i;
    public final kotlinx.coroutines.CoroutineScope j;
    public boolean k;
    public java.lang.String l;
    public com.moloco.sdk.internal.ortb.model.g m;
    public final com.moloco.sdk.acm.TimerEvent n;
    public kotlinx.coroutines.Job o;

    /* renamed from: com.moloco.sdk.internal.publisher.d$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$load$2", f = "AdLoad.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.d$b */
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7093a;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ com.moloco.sdk.publisher.AdLoad.Listener d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, com.moloco.sdk.publisher.AdLoad.Listener listener, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3420d.b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = listener;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3420d.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.C3420d.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.internal.ortb.model.C3416f ext;
            com.moloco.sdk.internal.ortb.model.C3416f ext2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7093a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.C3420d c3420d = com.moloco.sdk.internal.publisher.C3420d.this;
                java.lang.String str = this.c;
                this.f7093a = 1;
                obj = c3420d.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.lang.String str2 = (java.lang.String) obj;
            if (str2 == null) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
                com.moloco.sdk.publisher.AdLoad.Listener listener = this.d;
                if (listener != null) {
                    listener.onAdLoadFailed(com.moloco.sdk.publisher.MolocoAdErrorKt.createAdErrorInfo(com.moloco.sdk.internal.publisher.C3420d.this.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
                }
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = com.moloco.sdk.internal.publisher.C3420d.this.h;
                com.moloco.sdk.acm.TimerEvent withTag = com.moloco.sdk.internal.publisher.C3420d.this.n.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
                java.lang.String c = dVar.c();
                com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                com.moloco.sdk.acm.TimerEvent withTag2 = withTag.withTag(c, java.lang.String.valueOf(errorType.getErrorCode()));
                com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                java.lang.String c2 = dVar2.c();
                java.lang.String name = com.moloco.sdk.internal.publisher.C3420d.this.f.name();
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase = name.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                metricsRecorder.recordTimerEvent(withTag2.withTag(c2, lowerCase));
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = com.moloco.sdk.internal.publisher.C3420d.this.h;
                com.moloco.sdk.acm.CountEvent withTag3 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag(dVar.c(), java.lang.String.valueOf(errorType.getErrorCode()));
                java.lang.String c3 = dVar2.c();
                java.lang.String lowerCase2 = com.moloco.sdk.internal.publisher.C3420d.this.f.name().toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                metricsRecorder2.recordCountEvent(withTag3.withTag(c3, lowerCase2));
                return kotlin.Unit.INSTANCE;
            }
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.publisher.C3420d.r, "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
            com.moloco.sdk.internal.publisher.y a2 = com.moloco.sdk.internal.publisher.C3423g.a(this.d, com.moloco.sdk.internal.publisher.C3420d.this.n, com.moloco.sdk.internal.publisher.C3420d.this.f, com.moloco.sdk.internal.publisher.C3420d.this.h, com.moloco.sdk.internal.publisher.C3420d.this.i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.moloco.sdk.internal.publisher.C3420d.this.l, str2)) {
                if (com.moloco.sdk.internal.publisher.C3420d.this.isLoaded()) {
                    com.moloco.sdk.internal.ortb.model.B b = null;
                    com.moloco.sdk.publisher.MolocoAd createAdInfo$default = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(com.moloco.sdk.internal.publisher.C3420d.this.b, null, null, 6, null);
                    long j = this.e;
                    com.moloco.sdk.internal.publisher.C3420d c3420d2 = com.moloco.sdk.internal.publisher.C3420d.this;
                    com.moloco.sdk.internal.ortb.model.C3415e a3 = c3420d2.a(c3420d2.m);
                    a2.a(createAdInfo$default, j, (a3 == null || (ext2 = a3.getExt()) == null) ? null : ext2.getSdkEvents());
                    com.moloco.sdk.internal.publisher.C3420d c3420d3 = com.moloco.sdk.internal.publisher.C3420d.this;
                    com.moloco.sdk.internal.ortb.model.C3415e a4 = c3420d3.a(c3420d3.m);
                    if (a4 != null && (ext = a4.getExt()) != null) {
                        b = ext.getSdkEvents();
                    }
                    a2.a(createAdInfo$default, b);
                    return kotlin.Unit.INSTANCE;
                }
                kotlinx.coroutines.Job job = com.moloco.sdk.internal.publisher.C3420d.this.o;
                if (job != null && job.isActive()) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.publisher.C3420d.r, "Already loading ad " + com.moloco.sdk.internal.publisher.C3420d.this.f + ' ' + com.moloco.sdk.internal.publisher.C3420d.this.b + ". Returning", null, false, 12, null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            com.moloco.sdk.internal.publisher.C3420d.this.a(str2, this.e, a2);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl", f = "AdLoad.kt", i = {0}, l = {168}, m = "processBidResponse", n = {"bidResponseJson"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.d$c */
    public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7094a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3420d.c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.C3420d.this.a((java.lang.String) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1", f = "AdLoad.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.d$d, reason: collision with other inner class name */
    public static final class C0189d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7095a;
        public long b;
        public int c;
        public /* synthetic */ java.lang.Object d;
        public final /* synthetic */ java.lang.String f;
        public final /* synthetic */ long g;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.y h;

        /* renamed from: com.moloco.sdk.internal.publisher.d$d$a */
        public static final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.publisher.C3420d f7096a;
            public final /* synthetic */ com.moloco.sdk.internal.publisher.y b;
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.C3415e c;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoad$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$a, reason: collision with other inner class name */
            public static final class C0190a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7097a;
                public final /* synthetic */ com.moloco.sdk.internal.publisher.C3420d b;
                public final /* synthetic */ com.moloco.sdk.internal.publisher.y c;
                public final /* synthetic */ com.moloco.sdk.internal.ortb.model.C3415e d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0190a(com.moloco.sdk.internal.publisher.C3420d c3420d, com.moloco.sdk.internal.publisher.y yVar, com.moloco.sdk.internal.ortb.model.C3415e c3415e, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3420d.C0189d.a.C0190a> continuation) {
                    super(2, continuation);
                    this.b = c3420d;
                    this.c = yVar;
                    this.d = c3415e;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.moloco.sdk.internal.publisher.C3420d.C0189d.a.C0190a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.internal.publisher.C3420d.C0189d.a.C0190a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.moloco.sdk.internal.ortb.model.C3416f ext;
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7097a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.b.k = true;
                    com.moloco.sdk.internal.publisher.y yVar = this.c;
                    com.moloco.sdk.publisher.MolocoAd createAdInfo = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo(this.b.b, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.d.getPrice()), this.d.getCrid());
                    com.moloco.sdk.internal.publisher.C3420d c3420d = this.b;
                    com.moloco.sdk.internal.ortb.model.C3415e a2 = c3420d.a(c3420d.m);
                    yVar.a(createAdInfo, (a2 == null || (ext = a2.getExt()) == null) ? null : ext.getSdkEvents());
                    return kotlin.Unit.INSTANCE;
                }
            }

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadError$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$b */
            public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7098a;
                public final /* synthetic */ com.moloco.sdk.internal.publisher.C3420d b;
                public final /* synthetic */ com.moloco.sdk.internal.publisher.y c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(com.moloco.sdk.internal.publisher.C3420d c3420d, com.moloco.sdk.internal.publisher.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3420d.C0189d.a.b> continuation) {
                    super(2, continuation);
                    this.b = c3420d;
                    this.c = yVar;
                    this.d = cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.moloco.sdk.internal.publisher.C3420d.C0189d.a.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.internal.publisher.C3420d.C0189d.a.b(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.moloco.sdk.internal.ortb.model.C3416f ext;
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7098a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.b.k = false;
                    com.moloco.sdk.internal.publisher.y yVar = this.c;
                    com.moloco.sdk.internal.s a2 = com.moloco.sdk.internal.t.a(this.b.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_FAILED, this.d, null, 8, null);
                    com.moloco.sdk.internal.publisher.C3420d c3420d = this.b;
                    com.moloco.sdk.internal.ortb.model.C3415e a3 = c3420d.a(c3420d.m);
                    yVar.a(a2, (a3 == null || (ext = a3.getExt()) == null) ? null : ext.getSdkEvents());
                    return kotlin.Unit.INSTANCE;
                }
            }

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadTimeout$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$c */
            public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7099a;
                public final /* synthetic */ com.moloco.sdk.internal.publisher.C3420d b;
                public final /* synthetic */ com.moloco.sdk.internal.publisher.y c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(com.moloco.sdk.internal.publisher.C3420d c3420d, com.moloco.sdk.internal.publisher.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3420d.C0189d.a.c> continuation) {
                    super(2, continuation);
                    this.b = c3420d;
                    this.c = yVar;
                    this.d = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.moloco.sdk.internal.publisher.C3420d.C0189d.a.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.internal.publisher.C3420d.C0189d.a.c(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.moloco.sdk.internal.ortb.model.C3416f ext;
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7099a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.b.k = false;
                    com.moloco.sdk.internal.publisher.y yVar = this.c;
                    com.moloco.sdk.internal.s a2 = com.moloco.sdk.internal.t.a(this.b.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, this.d, null, 8, null);
                    com.moloco.sdk.internal.publisher.C3420d c3420d = this.b;
                    com.moloco.sdk.internal.ortb.model.C3415e a3 = c3420d.a(c3420d.m);
                    yVar.a(a2, (a3 == null || (ext = a3.getExt()) == null) ? null : ext.getSdkEvents());
                    return kotlin.Unit.INSTANCE;
                }
            }

            public a(com.moloco.sdk.internal.publisher.C3420d c3420d, com.moloco.sdk.internal.publisher.y yVar, com.moloco.sdk.internal.ortb.model.C3415e c3415e) {
                this.f7096a = c3420d;
                this.b = yVar;
                this.c = c3415e;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
            public void a() {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f7096a.j, null, null, new com.moloco.sdk.internal.publisher.C3420d.C0189d.a.C0190a(this.f7096a, this.b, this.c, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f7096a.j, null, null, new com.moloco.sdk.internal.publisher.C3420d.C0189d.a.c(this.f7096a, this.b, timeoutError, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalError, "internalError");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f7096a.j, null, null, new com.moloco.sdk.internal.publisher.C3420d.C0189d.a.b(this.f7096a, this.b, internalError, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0189d(java.lang.String str, long j, com.moloco.sdk.internal.publisher.y yVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3420d.C0189d> continuation) {
            super(2, continuation);
            this.f = str;
            this.g = j;
            this.h = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3420d.C0189d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.publisher.C3420d.C0189d c0189d = com.moloco.sdk.internal.publisher.C3420d.this.new C0189d(this.f, this.g, this.h, continuation);
            c0189d.d = obj;
            return c0189d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
        
            if (r7 != null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
        
            if (r2 != null) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0173  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.internal.ortb.model.g gVar;
            com.moloco.sdk.internal.publisher.C3420d c3420d;
            long j;
            java.lang.Object a2;
            com.moloco.sdk.internal.publisher.y yVar;
            com.moloco.sdk.internal.ortb.model.C3415e a3;
            com.moloco.sdk.internal.ortb.model.C3416f ext;
            java.lang.String str;
            java.util.Map emptyMap;
            com.moloco.sdk.internal.ortb.model.C3416f ext2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            com.moloco.sdk.internal.ortb.model.B b = null;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.d;
                com.moloco.sdk.internal.publisher.C3420d.this.k = false;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(com.moloco.sdk.internal.publisher.C3420d.this.l, this.f)) {
                    com.moloco.sdk.internal.publisher.C3420d.this.l = this.f;
                    com.moloco.sdk.internal.publisher.C3420d.this.m = null;
                }
                gVar = com.moloco.sdk.internal.publisher.C3420d.this.m;
                if (gVar == null) {
                    c3420d = com.moloco.sdk.internal.publisher.C3420d.this;
                    java.lang.String str2 = this.f;
                    com.moloco.sdk.internal.publisher.y yVar2 = this.h;
                    j = this.g;
                    kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
                    com.moloco.sdk.internal.ortb.b bVar = c3420d.d;
                    this.d = c3420d;
                    this.f7095a = yVar2;
                    this.b = j;
                    this.c = 1;
                    a2 = bVar.a(str2, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yVar = yVar2;
                }
                a3 = gVar == null ? com.moloco.sdk.internal.publisher.C3420d.this.a(gVar) : null;
                if (a3 == null) {
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b) com.moloco.sdk.internal.publisher.C3420d.this.c.invoke(a3)).a(((kotlin.time.Duration) com.moloco.sdk.internal.publisher.C3420d.this.f7092a.invoke(kotlin.coroutines.jvm.internal.Boxing.boxLong(this.g))).getRawValue(), new com.moloco.sdk.internal.publisher.C3420d.C0189d.a(com.moloco.sdk.internal.publisher.C3420d.this, this.h, a3));
                    return kotlin.Unit.INSTANCE;
                }
                com.moloco.sdk.internal.publisher.y yVar3 = this.h;
                com.moloco.sdk.internal.publisher.C3420d c3420d2 = com.moloco.sdk.internal.publisher.C3420d.this;
                com.moloco.sdk.internal.s a4 = com.moloco.sdk.internal.t.a(c3420d2.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.o.e, null, 8, null);
                com.moloco.sdk.internal.ortb.model.C3415e a5 = c3420d2.a(c3420d2.m);
                if (a5 != null && (ext = a5.getExt()) != null) {
                    b = ext.getSdkEvents();
                }
                yVar3.a(a4, b);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.b;
            yVar = (com.moloco.sdk.internal.publisher.y) this.f7095a;
            c3420d = (com.moloco.sdk.internal.publisher.C3420d) this.d;
            kotlin.ResultKt.throwOnFailure(obj);
            j = j2;
            a2 = obj;
            com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) a2;
            if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.internal.v.a aVar = (com.moloco.sdk.internal.v.a) vVar;
                com.moloco.sdk.internal.o a6 = c3420d.a((com.moloco.sdk.internal.ortb.a) aVar.a());
                java.lang.Object a7 = aVar.a();
                com.moloco.sdk.internal.ortb.a.C0184a c0184a = a7 instanceof com.moloco.sdk.internal.ortb.a.C0184a ? (com.moloco.sdk.internal.ortb.a.C0184a) a7 : null;
                java.lang.Exception b2 = c0184a != null ? c0184a.b() : null;
                java.lang.Object a8 = aVar.a();
                com.moloco.sdk.internal.ortb.a.b bVar2 = a8 instanceof com.moloco.sdk.internal.ortb.a.b ? (com.moloco.sdk.internal.ortb.a.b) a8 : null;
                java.util.List<java.lang.String> b3 = bVar2 != null ? bVar2.b() : null;
                if (b3 != null) {
                    java.util.List<java.lang.String> list = b3.isEmpty() ^ true ? b3 : null;
                    if (list != null) {
                        str = kotlin.collections.CollectionsKt.joinToString$default(list, ",", " missingFields=", null, 0, null, null, 60, null);
                    }
                }
                str = "";
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3420d.r, "startLoadJob failed to parse BID json string. subType=" + a6 + str, b2, false, 8, null);
                if (b3 != null) {
                    java.util.List<java.lang.String> list2 = true ^ b3.isEmpty() ? b3 : null;
                    if (list2 != null) {
                        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null);
                        if (joinToString$default != null) {
                            emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("missing_fields", joinToString$default));
                        }
                    }
                }
                emptyMap = kotlin.collections.MapsKt.emptyMap();
                yVar.a(com.moloco.sdk.internal.t.a(c3420d.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, a6, emptyMap), (com.moloco.sdk.internal.ortb.model.B) null);
                return kotlin.Unit.INSTANCE;
            }
            com.moloco.sdk.internal.ortb.model.g gVar2 = (com.moloco.sdk.internal.ortb.model.g) ((com.moloco.sdk.internal.v.b) vVar).a();
            c3420d.m = gVar2;
            com.moloco.sdk.publisher.MolocoAd createAdInfo$default = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(c3420d.b, null, null, 6, null);
            com.moloco.sdk.internal.ortb.model.C3415e a9 = c3420d.a(c3420d.m);
            yVar.a(createAdInfo$default, j, (a9 == null || (ext2 = a9.getExt()) == null) ? null : ext2.getSdkEvents());
            gVar = gVar2;
            if (gVar == null) {
            }
            if (a3 == null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3420d(kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.time.Duration> timeout, java.lang.String adUnitId, kotlin.jvm.functions.Function1<? super com.moloco.sdk.internal.ortb.model.C3415e, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b> recreateXenossAdLoader, com.moloco.sdk.internal.ortb.b parseBidResponse, com.moloco.sdk.internal.publisher.q adLoadPreprocessor, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.internal.services.L webViewChecker, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "timeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parseBidResponse, "parseBidResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadPreprocessor, "adLoadPreprocessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7092a = timeout;
        this.b = adUnitId;
        this.c = recreateXenossAdLoader;
        this.d = parseBidResponse;
        this.e = adLoadPreprocessor;
        this.f = adFormatType;
        this.g = webViewChecker;
        this.h = metricsRecorder;
        this.i = function0;
        this.j = kotlinx.coroutines.CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.n = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.j.c());
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(java.lang.String bidResponseJson, com.moloco.sdk.publisher.AdLoad.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(this.g.a());
        if (m10801exceptionOrNullimpl != null) {
            com.moloco.sdk.internal.MolocoLogger.INSTANCE.error(r, "WebView Error: " + m10801exceptionOrNullimpl.getMessage(), m10801exceptionOrNullimpl, true);
            if (listener != null) {
                listener.onAdLoadFailed(com.moloco.sdk.publisher.MolocoAdErrorKt.createAdErrorInfo(this.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        long a2 = com.moloco.sdk.service_locator.a.h.f7349a.i().a();
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: " + bidResponseJson, false, 4, null);
        this.n.startTimer();
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.h;
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.k.c());
        java.lang.String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase = this.f.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c2, lowerCase));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new com.moloco.sdk.internal.publisher.C3420d.b(bidResponseJson, listener, a2, null), 3, null);
    }

    public final com.moloco.sdk.internal.ortb.model.C3415e a(com.moloco.sdk.internal.ortb.model.g gVar) {
        java.util.List<com.moloco.sdk.internal.ortb.model.C> b2;
        com.moloco.sdk.internal.ortb.model.C c2;
        java.util.List<com.moloco.sdk.internal.ortb.model.C3415e> b3;
        if (gVar == null || (b2 = gVar.b()) == null || (c2 = b2.get(0)) == null || (b3 = c2.b()) == null) {
            return null;
        }
        return b3.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.moloco.sdk.internal.publisher.C3420d.c cVar;
        int i;
        if (continuation instanceof com.moloco.sdk.internal.publisher.C3420d.c) {
            cVar = (com.moloco.sdk.internal.publisher.C3420d.c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.publisher.q qVar = this.e;
                    cVar.f7094a = str;
                    cVar.d = 1;
                    obj = qVar.a(str, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) cVar.f7094a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str2 = (java.lang.String) obj;
                return str2 == null ? str2 : str;
            }
        }
        cVar = new com.moloco.sdk.internal.publisher.C3420d.c(continuation);
        java.lang.Object obj2 = cVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        if (str22 == null) {
        }
    }

    public final void a(java.lang.String str, long j, com.moloco.sdk.internal.publisher.y yVar) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.o;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new com.moloco.sdk.internal.publisher.C3420d.C0189d(str, j, yVar, null), 3, null);
        this.o = launch$default;
    }

    public final com.moloco.sdk.internal.o a(com.moloco.sdk.internal.ortb.a aVar) {
        if (aVar instanceof com.moloco.sdk.internal.ortb.a.C0184a) {
            return com.moloco.sdk.internal.o.c;
        }
        if (aVar instanceof com.moloco.sdk.internal.ortb.a.b) {
            return com.moloco.sdk.internal.o.d;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ C3420d(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1 function1, java.lang.String str, kotlin.jvm.functions.Function1 function12, com.moloco.sdk.internal.ortb.b bVar, com.moloco.sdk.internal.publisher.q qVar, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.internal.services.L l, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, function1, str, function12, bVar, qVar, adFormatType, l, metricsRecorder, (i & 512) != 0 ? null : function0);
    }
}
