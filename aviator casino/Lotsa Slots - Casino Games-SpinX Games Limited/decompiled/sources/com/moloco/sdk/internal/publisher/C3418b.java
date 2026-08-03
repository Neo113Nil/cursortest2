package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3418b {
    public static final com.moloco.sdk.internal.publisher.C3418b.a f = new com.moloco.sdk.internal.publisher.C3418b.a(null);
    public static final int g = 8;
    public static final java.lang.String h = "UNABLE_TO_CREATE_AD";
    public static final java.lang.String i = "AdCreator";

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.publisher.Initialization> f7080a;
    public final com.moloco.sdk.internal.services.J b;
    public final com.moloco.sdk.internal.publisher.C3419c c;
    public final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a>, java.lang.Object> d;
    public final kotlin.coroutines.CoroutineContext e;

    /* renamed from: com.moloco.sdk.internal.publisher.b$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.moloco.sdk.internal.publisher.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0188b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7081a;

        static {
            int[] iArr = new int[com.moloco.sdk.publisher.Initialization.values().length];
            try {
                iArr[com.moloco.sdk.publisher.Initialization.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.publisher.Initialization.FAILURE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f7081a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator", f = "AdCreator.kt", i = {0, 0, 0}, l = {416}, m = "awaitAdFactoryWithTimeoutOrNull", n = {"createAdType", "metricsRecorder", "awaitTimer"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$c */
    public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7082a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3418b.c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.C3418b.this.a(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$awaitAdFactoryWithTimeoutOrNull$2", f = "AdCreator.kt", i = {}, l = {416}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.b$d */
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7083a;
        public final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a>, java.lang.Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3418b.d> continuation) {
            super(2, continuation);
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3418b.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.C3418b.d(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7083a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a>, java.lang.Object> function1 = this.b;
                this.f7083a = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createBanner$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {68}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$e */
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7084a;
        public java.lang.Object b;
        public java.lang.Object c;
        public long d;
        public int e;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder g;
        public final /* synthetic */ java.lang.String h;
        public final /* synthetic */ java.lang.String i;
        public final /* synthetic */ java.lang.String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3418b.e> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3418b.e) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.C3418b.this.new e(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            com.moloco.sdk.internal.publisher.t tVar;
            com.moloco.sdk.acm.TimerEvent timerEvent;
            java.lang.String str;
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.t tVar2 = com.moloco.sdk.internal.publisher.t.f7171a;
                long invoke = com.moloco.sdk.internal.publisher.C3418b.this.b.invoke();
                java.lang.String a3 = com.moloco.sdk.internal.publisher.C3418b.this.a();
                com.moloco.sdk.acm.TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                com.moloco.sdk.internal.publisher.C3418b c3418b = com.moloco.sdk.internal.publisher.C3418b.this;
                kotlin.jvm.functions.Function1 function1 = c3418b.d;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.g;
                this.f7084a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c3418b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                com.moloco.sdk.acm.TimerEvent timerEvent2 = (com.moloco.sdk.acm.TimerEvent) this.c;
                java.lang.String str2 = (java.lang.String) this.b;
                com.moloco.sdk.internal.publisher.t tVar3 = (com.moloco.sdk.internal.publisher.t) this.f7084a;
                kotlin.ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a = (com.moloco.sdk.internal.InterfaceC3408a) a2;
            if (interfaceC3408a != null) {
                android.content.Context a4 = com.moloco.sdk.service_locator.a.f7341a.a();
                com.moloco.sdk.internal.services.InterfaceC3435f e = com.moloco.sdk.service_locator.a.b.f7343a.e();
                java.lang.String str3 = this.h;
                com.moloco.sdk.service_locator.a.h hVar = com.moloco.sdk.service_locator.a.h.f7349a;
                long j2 = j;
                android.view.ViewParent b = interfaceC3408a.b(a4, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new com.moloco.sdk.internal.publisher.C3417a(com.moloco.sdk.publisher.AdFormatType.BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), com.moloco.sdk.internal.i.c.d, this.g);
                if (b != null) {
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.g;
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (b instanceof com.moloco.sdk.internal.publisher.s) {
                        ((com.moloco.sdk.internal.publisher.s) b).setCreateAdObjectStartTime(j2);
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new com.moloco.sdk.internal.v.b(b);
                }
            }
            com.moloco.sdk.publisher.MolocoAdError.AdCreateError a5 = com.moloco.sdk.internal.publisher.C3418b.this.a(this.h, str, timerEvent, tVar, this.g);
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Failed to create " + tVar + " with reason: " + a5, null, false, 12, null);
            return new com.moloco.sdk.internal.v.a(a5);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createBannerTablet$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {120}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$f */
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7085a;
        public java.lang.Object b;
        public java.lang.Object c;
        public long d;
        public int e;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder g;
        public final /* synthetic */ java.lang.String h;
        public final /* synthetic */ java.lang.String i;
        public final /* synthetic */ java.lang.String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3418b.f> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3418b.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.C3418b.this.new f(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            com.moloco.sdk.internal.publisher.t tVar;
            com.moloco.sdk.acm.TimerEvent timerEvent;
            java.lang.String str;
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.t tVar2 = com.moloco.sdk.internal.publisher.t.b;
                long invoke = com.moloco.sdk.internal.publisher.C3418b.this.b.invoke();
                java.lang.String a3 = com.moloco.sdk.internal.publisher.C3418b.this.a();
                com.moloco.sdk.acm.TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                com.moloco.sdk.internal.publisher.C3418b c3418b = com.moloco.sdk.internal.publisher.C3418b.this;
                kotlin.jvm.functions.Function1 function1 = c3418b.d;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.g;
                this.f7085a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c3418b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                com.moloco.sdk.acm.TimerEvent timerEvent2 = (com.moloco.sdk.acm.TimerEvent) this.c;
                java.lang.String str2 = (java.lang.String) this.b;
                com.moloco.sdk.internal.publisher.t tVar3 = (com.moloco.sdk.internal.publisher.t) this.f7085a;
                kotlin.ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a = (com.moloco.sdk.internal.InterfaceC3408a) a2;
            if (interfaceC3408a != null) {
                android.content.Context a4 = com.moloco.sdk.service_locator.a.f7341a.a();
                com.moloco.sdk.internal.services.InterfaceC3435f e = com.moloco.sdk.service_locator.a.b.f7343a.e();
                java.lang.String str3 = this.h;
                com.moloco.sdk.service_locator.a.h hVar = com.moloco.sdk.service_locator.a.h.f7349a;
                long j2 = j;
                android.view.ViewParent c = interfaceC3408a.c(a4, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new com.moloco.sdk.internal.publisher.C3417a(com.moloco.sdk.publisher.AdFormatType.BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), com.moloco.sdk.internal.i.d.d, this.g);
                if (c != null) {
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.g;
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (c instanceof com.moloco.sdk.internal.publisher.s) {
                        ((com.moloco.sdk.internal.publisher.s) c).setCreateAdObjectStartTime(j2);
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new com.moloco.sdk.internal.v.b(c);
                }
            }
            com.moloco.sdk.publisher.MolocoAdError.AdCreateError a5 = com.moloco.sdk.internal.publisher.C3418b.this.a(this.h, str, timerEvent, tVar, this.g);
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Failed to create " + tVar + " with reason: " + a5, null, false, 12, null);
            return new com.moloco.sdk.internal.v.a(a5);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createInterstitial$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {262}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$g */
    public static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.InterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7086a;
        public java.lang.Object b;
        public java.lang.Object c;
        public long d;
        public int e;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder g;
        public final /* synthetic */ java.lang.String h;
        public final /* synthetic */ java.lang.String i;
        public final /* synthetic */ java.lang.String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3418b.g> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.InterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3418b.g) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.C3418b.this.new g(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            com.moloco.sdk.internal.publisher.t tVar;
            com.moloco.sdk.acm.TimerEvent timerEvent;
            java.lang.String str;
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.t tVar2 = com.moloco.sdk.internal.publisher.t.f;
                long invoke = com.moloco.sdk.internal.publisher.C3418b.this.b.invoke();
                java.lang.String a3 = com.moloco.sdk.internal.publisher.C3418b.this.a();
                com.moloco.sdk.acm.TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                com.moloco.sdk.internal.publisher.C3418b c3418b = com.moloco.sdk.internal.publisher.C3418b.this;
                kotlin.jvm.functions.Function1 function1 = c3418b.d;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.g;
                this.f7086a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c3418b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                com.moloco.sdk.acm.TimerEvent timerEvent2 = (com.moloco.sdk.acm.TimerEvent) this.c;
                java.lang.String str2 = (java.lang.String) this.b;
                com.moloco.sdk.internal.publisher.t tVar3 = (com.moloco.sdk.internal.publisher.t) this.f7086a;
                kotlin.ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a = (com.moloco.sdk.internal.InterfaceC3408a) a2;
            if (interfaceC3408a != null) {
                android.content.Context a4 = com.moloco.sdk.service_locator.a.f7341a.a();
                com.moloco.sdk.internal.services.InterfaceC3435f e = com.moloco.sdk.service_locator.a.b.f7343a.e();
                java.lang.String str3 = this.h;
                com.moloco.sdk.service_locator.a.h hVar = com.moloco.sdk.service_locator.a.h.f7349a;
                long j2 = j;
                com.moloco.sdk.publisher.InterstitialAd a5 = interfaceC3408a.a(a4, e, str3, hVar.k(), hVar.f(), com.moloco.sdk.service_locator.a.i.f7350a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new com.moloco.sdk.internal.publisher.C3417a(com.moloco.sdk.publisher.AdFormatType.INTERSTITIAL, com.moloco.sdk.internal.mediators.b.b(this.j), null), this.g);
                if (a5 != null) {
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.g;
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a5 instanceof com.moloco.sdk.internal.publisher.s) {
                        ((com.moloco.sdk.internal.publisher.s) a5).setCreateAdObjectStartTime(j2);
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new com.moloco.sdk.internal.v.b(a5);
                }
            }
            com.moloco.sdk.publisher.MolocoAdError.AdCreateError a6 = com.moloco.sdk.internal.publisher.C3418b.this.a(this.h, str, timerEvent, tVar, this.g);
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Failed to create " + tVar + " with reason: " + a6, null, false, 12, null);
            return new com.moloco.sdk.internal.v.a(a6);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createMREC$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {168}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$h */
    public static final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7087a;
        public java.lang.Object b;
        public java.lang.Object c;
        public long d;
        public int e;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder g;
        public final /* synthetic */ java.lang.String h;
        public final /* synthetic */ java.lang.String i;
        public final /* synthetic */ java.lang.String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3418b.h> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3418b.h) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.C3418b.this.new h(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            com.moloco.sdk.internal.publisher.t tVar;
            com.moloco.sdk.acm.TimerEvent timerEvent;
            java.lang.String str;
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.t tVar2 = com.moloco.sdk.internal.publisher.t.c;
                long a3 = com.moloco.sdk.internal.publisher.C3418b.this.b.a();
                java.lang.String a4 = com.moloco.sdk.internal.publisher.C3418b.this.a();
                com.moloco.sdk.acm.TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a4);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                com.moloco.sdk.internal.publisher.C3418b c3418b = com.moloco.sdk.internal.publisher.C3418b.this;
                kotlin.jvm.functions.Function1 function1 = c3418b.d;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.g;
                this.f7087a = tVar2;
                this.b = a4;
                this.c = withTag;
                this.d = a3;
                this.e = 1;
                a2 = c3418b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a4;
                j = a3;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                com.moloco.sdk.acm.TimerEvent timerEvent2 = (com.moloco.sdk.acm.TimerEvent) this.c;
                java.lang.String str2 = (java.lang.String) this.b;
                com.moloco.sdk.internal.publisher.t tVar3 = (com.moloco.sdk.internal.publisher.t) this.f7087a;
                kotlin.ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a = (com.moloco.sdk.internal.InterfaceC3408a) a2;
            if (interfaceC3408a != null) {
                android.content.Context a5 = com.moloco.sdk.service_locator.a.f7341a.a();
                com.moloco.sdk.internal.services.InterfaceC3435f e = com.moloco.sdk.service_locator.a.b.f7343a.e();
                java.lang.String str3 = this.h;
                com.moloco.sdk.service_locator.a.h hVar = com.moloco.sdk.service_locator.a.h.f7349a;
                long j2 = j;
                android.view.ViewParent a6 = interfaceC3408a.a(a5, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new com.moloco.sdk.internal.publisher.C3417a(com.moloco.sdk.publisher.AdFormatType.MREC, com.moloco.sdk.internal.mediators.b.c(this.j), null), hVar.j(), com.moloco.sdk.internal.i.b.d, this.g);
                if (a6 != null) {
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.g;
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a6 instanceof com.moloco.sdk.internal.publisher.s) {
                        ((com.moloco.sdk.internal.publisher.s) a6).setCreateAdObjectStartTime(j2);
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new com.moloco.sdk.internal.v.b(a6);
                }
            }
            com.moloco.sdk.publisher.MolocoAdError.AdCreateError a7 = com.moloco.sdk.internal.publisher.C3418b.this.a(this.h, str, timerEvent, tVar, this.g);
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Failed to create " + tVar + " with reason: " + a7, null, false, 12, null);
            return new com.moloco.sdk.internal.v.a(a7);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createNativeAd$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$i */
    public static final class i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.NativeAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7088a;
        public java.lang.Object b;
        public java.lang.Object c;
        public long d;
        public int e;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder g;
        public final /* synthetic */ java.lang.String h;
        public final /* synthetic */ java.lang.String i;
        public final /* synthetic */ java.lang.String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3418b.i> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.NativeAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3418b.i) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.C3418b.this.new i(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            com.moloco.sdk.internal.publisher.t tVar;
            com.moloco.sdk.acm.TimerEvent timerEvent;
            java.lang.String str;
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.t tVar2 = com.moloco.sdk.internal.publisher.t.d;
                long a3 = com.moloco.sdk.internal.publisher.C3418b.this.b.a();
                java.lang.String a4 = com.moloco.sdk.internal.publisher.C3418b.this.a();
                com.moloco.sdk.acm.TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a4);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                com.moloco.sdk.internal.publisher.C3418b c3418b = com.moloco.sdk.internal.publisher.C3418b.this;
                kotlin.jvm.functions.Function1 function1 = c3418b.d;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.g;
                this.f7088a = tVar2;
                this.b = a4;
                this.c = withTag;
                this.d = a3;
                this.e = 1;
                a2 = c3418b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a4;
                j = a3;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                com.moloco.sdk.acm.TimerEvent timerEvent2 = (com.moloco.sdk.acm.TimerEvent) this.c;
                java.lang.String str2 = (java.lang.String) this.b;
                com.moloco.sdk.internal.publisher.t tVar3 = (com.moloco.sdk.internal.publisher.t) this.f7088a;
                kotlin.ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a = (com.moloco.sdk.internal.InterfaceC3408a) a2;
            if (interfaceC3408a != null) {
                android.content.Context a5 = com.moloco.sdk.service_locator.a.f7341a.a();
                com.moloco.sdk.internal.services.InterfaceC3435f e = com.moloco.sdk.service_locator.a.b.f7343a.e();
                com.moloco.sdk.internal.services.n i2 = com.moloco.sdk.service_locator.a.e.f7346a.i();
                java.lang.String str3 = this.h;
                com.moloco.sdk.service_locator.a.h hVar = com.moloco.sdk.service_locator.a.h.f7349a;
                long j2 = j;
                com.moloco.sdk.publisher.NativeAd a6 = interfaceC3408a.a(a5, e, i2, str3, hVar.k(), hVar.f(), com.moloco.sdk.service_locator.a.i.f7350a.c(), hVar.j(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new com.moloco.sdk.internal.publisher.C3417a(com.moloco.sdk.publisher.AdFormatType.NATIVE, com.moloco.sdk.internal.mediators.b.d(this.j), null), hVar.i(), this.g);
                if (a6 != null) {
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.g;
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a6 instanceof com.moloco.sdk.internal.publisher.s) {
                        ((com.moloco.sdk.internal.publisher.s) a6).setCreateAdObjectStartTime(j2);
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new com.moloco.sdk.internal.v.b(a6);
                }
            }
            com.moloco.sdk.publisher.MolocoAdError.AdCreateError a7 = com.moloco.sdk.internal.publisher.C3418b.this.a(this.h, str, timerEvent, tVar, this.g);
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Failed to create " + tVar + " with reason: " + a7, null, false, 12, null);
            return new com.moloco.sdk.internal.v.a(a7);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createRewardedInterstitial$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$j */
    public static final class j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.RewardedInterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7089a;
        public java.lang.Object b;
        public java.lang.Object c;
        public long d;
        public int e;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder g;
        public final /* synthetic */ java.lang.String h;
        public final /* synthetic */ java.lang.String i;
        public final /* synthetic */ java.lang.String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.C3418b.j> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.RewardedInterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
            return ((com.moloco.sdk.internal.publisher.C3418b.j) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.C3418b.this.new j(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            com.moloco.sdk.internal.publisher.t tVar;
            com.moloco.sdk.acm.TimerEvent timerEvent;
            java.lang.String str;
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.t tVar2 = com.moloco.sdk.internal.publisher.t.g;
                long invoke = com.moloco.sdk.internal.publisher.C3418b.this.b.invoke();
                java.lang.String a3 = com.moloco.sdk.internal.publisher.C3418b.this.a();
                com.moloco.sdk.acm.TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                com.moloco.sdk.internal.publisher.C3418b c3418b = com.moloco.sdk.internal.publisher.C3418b.this;
                kotlin.jvm.functions.Function1 function1 = c3418b.d;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.g;
                this.f7089a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c3418b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                com.moloco.sdk.acm.TimerEvent timerEvent2 = (com.moloco.sdk.acm.TimerEvent) this.c;
                java.lang.String str2 = (java.lang.String) this.b;
                com.moloco.sdk.internal.publisher.t tVar3 = (com.moloco.sdk.internal.publisher.t) this.f7089a;
                kotlin.ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a = (com.moloco.sdk.internal.InterfaceC3408a) a2;
            if (interfaceC3408a != null) {
                android.content.Context a4 = com.moloco.sdk.service_locator.a.f7341a.a();
                com.moloco.sdk.internal.services.InterfaceC3435f e = com.moloco.sdk.service_locator.a.b.f7343a.e();
                java.lang.String str3 = this.h;
                com.moloco.sdk.service_locator.a.h hVar = com.moloco.sdk.service_locator.a.h.f7349a;
                long j2 = j;
                com.moloco.sdk.publisher.RewardedInterstitialAd a5 = interfaceC3408a.a(a4, e, str3, hVar.k(), hVar.f(), com.moloco.sdk.service_locator.a.i.f7350a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new com.moloco.sdk.internal.publisher.C3417a(com.moloco.sdk.publisher.AdFormatType.REWARDED, com.moloco.sdk.internal.mediators.b.b(this.j), null), this.g, com.moloco.sdk.service_locator.a.c.f7344a.b());
                if (a5 != null) {
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.g;
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a5 instanceof com.moloco.sdk.internal.publisher.s) {
                        ((com.moloco.sdk.internal.publisher.s) a5).setCreateAdObjectStartTime(j2);
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new com.moloco.sdk.internal.v.b(a5);
                }
            }
            com.moloco.sdk.publisher.MolocoAdError.AdCreateError a6 = com.moloco.sdk.internal.publisher.C3418b.this.a(this.h, str, timerEvent, tVar, this.g);
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.C3418b.i, "Failed to create " + tVar + " with reason: " + a6, null, false, 12, null);
            return new com.moloco.sdk.internal.v.a(a6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3418b(kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.publisher.Initialization> initializationState, com.moloco.sdk.internal.services.J timeProviderService, com.moloco.sdk.internal.publisher.C3419c adCreatorConfiguration, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a>, ? extends java.lang.Object> awaitAdFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationState, "initializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreatorConfiguration, "adCreatorConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitAdFactory, "awaitAdFactory");
        this.f7080a = initializationState;
        this.b = timeProviderService;
        this.c = adCreatorConfiguration;
        this.d = awaitAdFactory;
        this.e = com.moloco.sdk.internal.scheduling.b.a().getDefault();
    }

    public final java.lang.Object d(java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.e, new com.moloco.sdk.internal.publisher.C3418b.h(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final java.lang.Object e(java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.NativeAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.e, new com.moloco.sdk.internal.publisher.C3418b.i(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final java.lang.Object f(java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.RewardedInterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.e, new com.moloco.sdk.internal.publisher.C3418b.j(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ java.lang.Object d(com.moloco.sdk.internal.publisher.C3418b c3418b, java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c3418b.d(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ java.lang.Object e(com.moloco.sdk.internal.publisher.C3418b c3418b, java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c3418b.e(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ java.lang.Object f(com.moloco.sdk.internal.publisher.C3418b c3418b, java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c3418b.f(str, str2, metricsRecorder, str3, continuation);
    }

    public final java.lang.Object b(java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.e, new com.moloco.sdk.internal.publisher.C3418b.f(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final java.lang.Object c(java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.InterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.e, new com.moloco.sdk.internal.publisher.C3418b.g(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ java.lang.Object b(com.moloco.sdk.internal.publisher.C3418b c3418b, java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c3418b.b(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ java.lang.Object c(com.moloco.sdk.internal.publisher.C3418b c3418b, java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c3418b.c(str, str2, metricsRecorder, str3, continuation);
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.e, new com.moloco.sdk.internal.publisher.C3418b.e(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ java.lang.Object a(com.moloco.sdk.internal.publisher.C3418b c3418b, java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c3418b.a(str, str2, metricsRecorder, str3, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError>>) continuation);
    }

    public final com.moloco.sdk.publisher.MolocoAdError.AdCreateError a(java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.internal.publisher.t tVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
        com.moloco.sdk.acm.CountEvent withTag = countEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("initial_sdk_init_state", str2).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name());
        com.moloco.sdk.publisher.Initialization value = this.f7080a.getValue();
        int i2 = value == null ? -1 : com.moloco.sdk.internal.publisher.C3418b.C0188b.f7081a[value.ordinal()];
        if (i2 == -1) {
            com.moloco.sdk.internal.error.b f2 = com.moloco.sdk.service_locator.a.b.f7343a.f();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CREATE_");
            java.lang.String upperCase = tVar.name().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
            sb.append("_AD_FAILED_SDK_INIT_NOT_COMPLETED");
            com.moloco.sdk.internal.error.b.a.a(f2, sb.toString(), null, 2, null);
            com.moloco.sdk.acm.TimerEvent withTag2 = timerEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag2.withTag(dVar2.c(), "sdk_init_not_completed"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), "sdk_init_not_completed"));
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return com.moloco.sdk.publisher.MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i2 == 1) {
            com.moloco.sdk.internal.error.b.a.a(com.moloco.sdk.service_locator.a.b.f7343a.f(), h, null, 2, null);
            com.moloco.sdk.acm.TimerEvent withTag3 = timerEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag3.withTag(dVar3.c(), "unable_to_create_ad"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar3.c(), "unable_to_create_ad"));
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "Could not find the adUnitId that was requested for load: " + str, null, false, 12, null);
            return com.moloco.sdk.publisher.MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i2 == 2) {
            com.moloco.sdk.internal.error.b f3 = com.moloco.sdk.service_locator.a.b.f7343a.f();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CREATE_");
            java.lang.String upperCase2 = tVar.name().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            sb2.append(upperCase2);
            sb2.append("_AD_FAILED_SDK_INIT_FAILED");
            com.moloco.sdk.internal.error.b.a.a(f3, sb2.toString(), null, 2, null);
            com.moloco.sdk.acm.TimerEvent withTag4 = timerEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag4.withTag(dVar4.c(), "sdk_init_failed"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar4.c(), "sdk_init_failed"));
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
            return com.moloco.sdk.publisher.MolocoAdError.AdCreateError.SDK_INIT_FAILED;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a>, ? extends java.lang.Object> function1, com.moloco.sdk.internal.publisher.t tVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a> continuation) {
        com.moloco.sdk.internal.publisher.C3418b.c cVar;
        int i2;
        com.moloco.sdk.acm.TimerEvent startTimerEvent;
        java.lang.Object m12302withTimeoutOrNullKLykuaI;
        com.moloco.sdk.internal.publisher.t tVar2 = tVar;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = metricsRecorder;
        if (continuation instanceof com.moloco.sdk.internal.publisher.C3418b.c) {
            cVar = (com.moloco.sdk.internal.publisher.C3418b.c) continuation;
            int i3 = cVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.f = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    startTimerEvent = metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.i.c());
                    kotlin.time.Duration duration = this.c.c().get(tVar2);
                    long rawValue = duration != null ? duration.getRawValue() : this.c.d();
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "Waiting for AdFactory with timeout: " + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(rawValue)), null, false, 12, null);
                    com.moloco.sdk.internal.publisher.C3418b.d dVar = new com.moloco.sdk.internal.publisher.C3418b.d(function1, null);
                    cVar.f7082a = tVar2;
                    cVar.b = metricsRecorder2;
                    cVar.c = startTimerEvent;
                    cVar.f = 1;
                    m12302withTimeoutOrNullKLykuaI = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(rawValue, dVar, cVar);
                    if (m12302withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.moloco.sdk.acm.TimerEvent timerEvent = (com.moloco.sdk.acm.TimerEvent) cVar.c;
                    metricsRecorder2 = (com.moloco.sdk.acm.recorder.MetricsRecorder) cVar.b;
                    com.moloco.sdk.internal.publisher.t tVar3 = (com.moloco.sdk.internal.publisher.t) cVar.f7082a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    startTimerEvent = timerEvent;
                    tVar2 = tVar3;
                    m12302withTimeoutOrNullKLykuaI = obj;
                }
                com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a = (com.moloco.sdk.internal.InterfaceC3408a) m12302withTimeoutOrNullKLykuaI;
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AdFactory received: ");
                sb.append(interfaceC3408a != null);
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, i, sb.toString(), null, false, 12, null);
                metricsRecorder2.recordTimerEvent(startTimerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), interfaceC3408a == null ? "success" : com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE));
                return m12302withTimeoutOrNullKLykuaI;
            }
        }
        cVar = new com.moloco.sdk.internal.publisher.C3418b.c(continuation);
        java.lang.Object obj2 = cVar.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar.f;
        if (i2 != 0) {
        }
        com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a2 = (com.moloco.sdk.internal.InterfaceC3408a) m12302withTimeoutOrNullKLykuaI;
        com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("AdFactory received: ");
        sb2.append(interfaceC3408a2 != null);
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, i, sb2.toString(), null, false, 12, null);
        metricsRecorder2.recordTimerEvent(startTimerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), interfaceC3408a2 == null ? "success" : com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE));
        return m12302withTimeoutOrNullKLykuaI;
    }

    public final java.lang.String a() {
        java.lang.String name;
        com.moloco.sdk.publisher.Initialization value = this.f7080a.getValue();
        if (value != null && (name = value.name()) != null) {
            java.lang.String lowerCase = name.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        return "not_invoked_or_in_progress";
    }
}
