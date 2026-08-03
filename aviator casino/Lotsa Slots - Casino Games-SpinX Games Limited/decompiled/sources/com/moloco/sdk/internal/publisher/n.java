package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class n<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> extends com.moloco.sdk.publisher.Banner implements com.moloco.sdk.internal.publisher.s {
    public static final int B = 12;
    public static final java.lang.String C = "BannerViewImpl";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7107a;
    public final com.moloco.sdk.internal.services.InterfaceC3435f b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final java.lang.String d;
    public final boolean e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;
    public final kotlin.jvm.functions.Function8<android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, com.moloco.sdk.internal.ortb.model.C3415e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, com.moloco.sdk.internal.A, com.moloco.sdk.internal.services.s, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L>> g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y h;
    public final com.moloco.sdk.internal.publisher.C3417a i;
    public final com.moloco.sdk.internal.A j;
    public final com.moloco.sdk.internal.i k;
    public final com.moloco.sdk.internal.services.s l;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q n;
    public final com.moloco.sdk.publisher.AdFormatType o;
    public boolean p;
    public final com.moloco.sdk.acm.TimerEvent q;
    public com.moloco.sdk.acm.TimerEvent r;
    public final kotlinx.coroutines.CoroutineScope s;
    public final com.moloco.sdk.internal.publisher.l<L> t;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h u;
    public com.moloco.sdk.internal.publisher.C v;
    public com.moloco.sdk.publisher.BannerAdShowListener w;
    public final com.moloco.sdk.publisher.AdLoad x;
    public final L y;
    public static final com.moloco.sdk.internal.publisher.n.a z = new com.moloco.sdk.internal.publisher.n.a(null);
    public static final int A = 8;

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
            super(1, obj, com.moloco.sdk.internal.publisher.n.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b invoke(com.moloco.sdk.internal.ortb.model.C3415e p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            return ((com.moloco.sdk.internal.publisher.n) this.receiver).a(p0);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$1", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7108a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public d(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.n.d> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object a(boolean z, boolean z2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            com.moloco.sdk.internal.publisher.n.d dVar = new com.moloco.sdk.internal.publisher.n.d(continuation);
            dVar.b = z;
            dVar.c = z2;
            return dVar.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7108a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b && this.c);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$2", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7109a;
        public /* synthetic */ boolean b;

        public e(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.n.e> continuation) {
            super(2, continuation);
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.moloco.sdk.internal.publisher.n.e) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.publisher.n.e eVar = new com.moloco.sdk.internal.publisher.n.e(continuation);
            eVar.b = ((java.lang.Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7109a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!this.b);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$3", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7110a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.n<L> c;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.l<L> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.internal.publisher.n<L> nVar, com.moloco.sdk.internal.publisher.l<L> lVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.n.f> continuation) {
            super(2, continuation);
            this.c = nVar;
            this.d = lVar;
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.n.f) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.publisher.n.f fVar = new com.moloco.sdk.internal.publisher.n.f(this.c, this.d, continuation);
            fVar.b = ((java.lang.Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r3 == null) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String lowerCase;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            java.lang.String name;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7110a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            this.c.t.b(z);
            if (z) {
                com.moloco.sdk.acm.TimerEvent timerEvent = this.c.r;
                if (timerEvent != null) {
                    com.moloco.sdk.internal.publisher.n<L> nVar = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f = nVar.t.f();
                    if (f != null && (creativeType = f.getCreativeType()) != null && (name = creativeType.name()) != null) {
                        lowerCase = name.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.toString().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = nVar.m;
                    java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    java.lang.String lowerCase2 = nVar.o.name().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(c, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
                }
                java.lang.String c2 = this.c.c();
                com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.n.C, "Banner parent view type: " + c2, false, 4, null);
                com.moloco.sdk.internal.publisher.C c3 = this.c.v;
                if (c3 != null) {
                    c3.a(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null), c2);
                }
            } else {
                com.moloco.sdk.internal.publisher.C c4 = this.c.v;
                if (c4 != null) {
                    c4.onAdHidden(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null));
                }
                kotlinx.coroutines.Job a2 = this.d.a();
                if (a2 != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(a2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$4", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7111a;
        public /* synthetic */ boolean b;

        public g(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.n.g> continuation) {
            super(2, continuation);
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.moloco.sdk.internal.publisher.n.g) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.publisher.n.g gVar = new com.moloco.sdk.internal.publisher.n.g(continuation);
            gVar.b = ((java.lang.Boolean) obj).booleanValue();
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7111a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!this.b);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$5", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7112a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.n<L> c;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.l<L> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.moloco.sdk.internal.publisher.n<L> nVar, com.moloco.sdk.internal.publisher.l<L> lVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.n.h> continuation) {
            super(2, continuation);
            this.c = nVar;
            this.d = lVar;
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.n.h) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.publisher.n.h hVar = new com.moloco.sdk.internal.publisher.n.h(this.c, this.d, continuation);
            hVar.b = ((java.lang.Boolean) obj).booleanValue();
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r3 == null) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String lowerCase;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            java.lang.String name;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7112a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.b) {
                com.moloco.sdk.acm.TimerEvent timerEvent = this.c.r;
                if (timerEvent != null) {
                    com.moloco.sdk.internal.publisher.n<L> nVar = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f = nVar.t.f();
                    if (f != null && (creativeType = f.getCreativeType()) != null && (name = creativeType.name()) != null) {
                        lowerCase = name.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.toString().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = nVar.m;
                    java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    java.lang.String lowerCase2 = nVar.o.name().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(c, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
                }
                java.lang.String c2 = this.c.c();
                com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.n.C, "Banner parent view type: " + c2, false, 4, null);
                com.moloco.sdk.internal.publisher.C c3 = this.c.v;
                if (c3 != null) {
                    c3.a(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null), c2);
                }
            } else {
                com.moloco.sdk.internal.publisher.C c4 = this.c.v;
                if (c4 != null) {
                    c4.onAdHidden(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null));
                }
                kotlinx.coroutines.Job a2 = this.d.a();
                if (a2 != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(a2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$load$1", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7113a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.n<L> b;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ com.moloco.sdk.publisher.AdLoad.Listener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.moloco.sdk.internal.publisher.n<L> nVar, java.lang.String str, com.moloco.sdk.publisher.AdLoad.Listener listener, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.n.i> continuation) {
            super(2, continuation);
            this.b = nVar;
            this.c = str;
            this.d = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.n.i) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.n.i(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7113a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.b.x.load(this.c, this.d);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$1", f = "Banner.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7114a;
        public final /* synthetic */ kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> b;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.n<L> c;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.publisher.n<L> f7115a;

            public a(com.moloco.sdk.internal.publisher.n<L> nVar) {
                this.f7115a = nVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object emit(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                this.f7115a.y.b();
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> sharedFlow, com.moloco.sdk.internal.publisher.n<L> nVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.n.j> continuation) {
            super(2, continuation);
            this.b = sharedFlow;
            this.c = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.n.j) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.n.j(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7114a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> sharedFlow = this.b;
                com.moloco.sdk.internal.publisher.n.j.a aVar = new com.moloco.sdk.internal.publisher.n.j.a(this.c);
                this.f7114a = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$2$1", f = "Banner.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7116a;
        public final /* synthetic */ android.view.MotionEvent b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y c;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.n<L> d;
        public final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(android.view.MotionEvent motionEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y yVar, com.moloco.sdk.internal.publisher.n<L> nVar, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.n.k> continuation) {
            super(2, continuation);
            this.b = motionEvent;
            this.c = yVar;
            this.d = nVar;
            this.e = mutableSharedFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.n.k) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.n.k(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7116a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                android.view.MotionEvent motionEvent = this.b;
                if (motionEvent != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y yVar = this.c;
                    com.moloco.sdk.internal.publisher.n<L> nVar = this.d;
                    kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow = this.e;
                    com.moloco.sdk.internal.services.s sVar = nVar.l;
                    java.lang.String c = nVar.t.c();
                    java.lang.String d = nVar.t.d();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar = nVar.u;
                    this.f7116a = 1;
                    a2 = yVar.a(motionEvent, sVar, c, d, hVar, mutableSharedFlow, (r19 & 64) != 0 ? com.moloco.sdk.internal.y.b() : null, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public /* synthetic */ n(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f interfaceC3435f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, java.lang.String str, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, kotlin.jvm.functions.Function8 function8, kotlin.jvm.functions.Function1 function1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.internal.publisher.C3417a c3417a, com.moloco.sdk.internal.A a2, com.moloco.sdk.internal.i iVar, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q q, com.moloco.sdk.publisher.AdFormatType adFormatType, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC3435f, aVar, str, z2, rVar, function8, function1, yVar, c3417a, a2, iVar, sVar, metricsRecorder, q, (i2 & 32768) != 0 ? com.moloco.sdk.publisher.AdFormatType.BANNER : adFormatType);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i l(com.moloco.sdk.internal.publisher.n nVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = nVar.t.f();
        if (f2 != null) {
            return f2.getCreativeType();
        }
        return null;
    }

    public static final com.moloco.sdk.internal.ortb.model.B m(com.moloco.sdk.internal.publisher.n nVar) {
        return nVar.t.e();
    }

    public static final com.moloco.sdk.internal.publisher.C3427k n(com.moloco.sdk.internal.publisher.n nVar) {
        return nVar.t.b();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i o(com.moloco.sdk.internal.publisher.n nVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = nVar.t.f();
        if (f2 != null) {
            return f2.getCreativeType();
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.s, null, 1, null);
        a(this, null, 1, null);
        setAdShowListener(null);
        this.v = null;
    }

    @Override // com.moloco.sdk.publisher.Banner
    public com.moloco.sdk.publisher.BannerAdShowListener getAdShowListener() {
        return this.w;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.i.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.x.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(java.lang.String bidResponseJson, com.moloco.sdk.publisher.AdLoad.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.m.recordTimerEvent(this.q);
        this.r = this.m.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.p.c());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.s, null, null, new com.moloco.sdk.internal.publisher.n.i(this, bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(com.moloco.sdk.publisher.BannerAdShowListener bannerAdShowListener) {
        com.moloco.sdk.internal.publisher.C a2 = a(bannerAdShowListener);
        this.v = a2;
        this.w = a2.b();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j2) {
        this.i.setCreateAdObjectStartTime(j2);
    }

    public static final class l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.publisher.n<L> f7117a;

        public l(com.moloco.sdk.internal.publisher.n<L> nVar) {
            this.f7117a = nVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w
        public void a(boolean z) {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            com.moloco.sdk.internal.publisher.C c = this.f7117a.v;
            if (c != null) {
                c.onAdClicked(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.f7117a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            com.moloco.sdk.internal.publisher.n<L> nVar = this.f7117a;
            nVar.a(com.moloco.sdk.internal.t.a(nVar.d, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }
    }

    public final void b() {
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded;
        com.moloco.sdk.internal.publisher.l<L> lVar = this.t;
        if (!a()) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, C, "Banner: Using isAdShowing function to track ad display state.", false, 4, null);
            kotlinx.coroutines.Job a2 = lVar.a();
            if (a2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(a2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            lVar.a(kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.dropWhile(a(this.t.f()), new com.moloco.sdk.internal.publisher.n.g(null)), new com.moloco.sdk.internal.publisher.n.h(this, lVar, null)), this.s));
            return;
        }
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, C, "MREC: Using ViewVisibilityTracker(ImpressionViewVisibilityTracker) to track ad display state.", false, 4, null);
        kotlinx.coroutines.Job a3 = lVar.a();
        if (a3 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(a3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = lVar.f();
        if (f2 == null || (isLoaded = f2.isLoaded()) == null) {
            return;
        }
        lVar.a(kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.dropWhile(kotlinx.coroutines.flow.FlowKt.combine(isLoaded, this.n.a(this), new com.moloco.sdk.internal.publisher.n.d(null)), new com.moloco.sdk.internal.publisher.n.e(null)), new com.moloco.sdk.internal.publisher.n.f(this, lVar, null)), this.s));
    }

    public final java.lang.String c() {
        java.lang.Object parent = getParent();
        while (parent != null) {
            java.lang.String simpleName = parent.getClass().getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) "RecyclerView", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) "ScrollView", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) "ListView", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) "ViewPager", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) "HorizontalScrollView", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) "AndroidComposeView", false, 2, (java.lang.Object) null)) {
                return simpleName;
            }
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            parent = view != null ? view.getParent() : null;
        }
        return "none";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.lang.String adUnitId, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, kotlin.jvm.functions.Function8<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, ? super com.moloco.sdk.internal.ortb.model.C3415e, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, ? super com.moloco.sdk.internal.A, ? super com.moloco.sdk.internal.services.s, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L>> createXenossBannerView, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, ? extends L> createXenossBannerAdShowListener, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.internal.A viewLifecycleOwner, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.publisher.AdFormatType adFormatType) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createXenossBannerView, "createXenossBannerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createXenossBannerAdShowListener, "createXenossBannerAdShowListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.f7107a = context;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = adUnitId;
        this.e = z2;
        this.f = externalLinkHandler;
        this.g = createXenossBannerView;
        this.h = watermark;
        this.i = adCreateLoadTimeoutManager;
        this.j = viewLifecycleOwner;
        this.k = bannerSize;
        this.l = clickthroughService;
        this.m = metricsRecorder;
        this.n = viewVisibilityTracker;
        this.o = adFormatType;
        com.moloco.sdk.acm.TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        java.lang.String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase = adFormatType.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.q = startTimerEvent.withTag(c2, lowerCase);
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.s = CoroutineScope;
        this.t = new com.moloco.sdk.internal.publisher.l<>(null, null, null, null, false, null, null, false, 255, null);
        this.u = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a();
        this.x = com.moloco.sdk.internal.publisher.C3421e.a(CoroutineScope, new com.moloco.sdk.internal.publisher.n.b(adCreateLoadTimeoutManager), adUnitId, new com.moloco.sdk.internal.publisher.n.c(this), adFormatType, com.moloco.sdk.service_locator.a.C0211a.f7342a.b(), metricsRecorder, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.n.l(com.moloco.sdk.internal.publisher.n.this);
            }
        });
        this.y = createXenossBannerAdShowListener.invoke(new com.moloco.sdk.internal.publisher.n.l(this));
    }

    public final com.moloco.sdk.internal.publisher.C a(com.moloco.sdk.publisher.BannerAdShowListener bannerAdShowListener) {
        return new com.moloco.sdk.internal.publisher.C(bannerAdShowListener, this.b, this.c, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.n.m(com.moloco.sdk.internal.publisher.n.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.n.n(com.moloco.sdk.internal.publisher.n.this);
            }
        }, this.o, this.m, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.n.o(com.moloco.sdk.internal.publisher.n.this);
            }
        });
    }

    public static /* synthetic */ void a(com.moloco.sdk.internal.publisher.n nVar, com.moloco.sdk.internal.s sVar, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            sVar = null;
        }
        nVar.a(sVar);
    }

    public final void a(com.moloco.sdk.internal.s sVar) {
        boolean booleanValue;
        com.moloco.sdk.internal.publisher.C c2;
        com.moloco.sdk.internal.publisher.C c3;
        com.moloco.sdk.internal.publisher.l<L> lVar = this.t;
        kotlinx.coroutines.Job a2 = lVar.a();
        if (a2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(a2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        lVar.a((kotlinx.coroutines.Job) null);
        if (a()) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, C, "MREC : isAdShowing state set from ViewVisibilityTracker (ImpressionViewVisibilityTracker).", false, 4, null);
            booleanValue = this.t.h();
        } else {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, C, "Banner: isAdShowing state set from isAdShowing function.", false, 4, null);
            booleanValue = a(this.t.f()).getValue().booleanValue();
        }
        com.moloco.sdk.internal.publisher.l<L> lVar2 = this.t;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = lVar2.f();
        if (f2 != null) {
            f2.destroy();
        }
        lVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B) null);
        if (sVar != null && (c3 = this.v) != null) {
            c3.a(sVar);
        }
        if (booleanValue && (c2 = this.v) != null) {
            c2.onAdHidden(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        this.t.a((com.moloco.sdk.internal.ortb.model.B) null);
        if (a()) {
            this.t.b(false);
        }
        this.t.a((com.moloco.sdk.internal.publisher.C3427k) null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b a(com.moloco.sdk.internal.ortb.model.C3415e c3415e) {
        com.moloco.sdk.internal.ortb.model.C3414d bannerClickMetaData;
        com.moloco.sdk.internal.ortb.model.C3414d bannerClickMetaData2;
        this.p = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h.f7458a.b(c3415e.getAdm());
        a(this, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> invoke = this.g.invoke(this.f7107a, this.c, c3415e, this.f, this.h, this.j, this.l, this.u);
        com.moloco.sdk.internal.publisher.l<L> lVar = this.t;
        lVar.a(invoke);
        lVar.a(c3415e.getExt().getSdkEvents());
        lVar.a(c3415e.getCom.ironsource.q2.y java.lang.String() != null ? new com.moloco.sdk.internal.publisher.C3427k(c3415e.getCom.ironsource.q2.y java.lang.String(), java.lang.Float.valueOf(c3415e.getPrice())) : null);
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData = c3415e.getExt().getMolocoSdkClickMetaData();
        lVar.b((molocoSdkClickMetaData == null || (bannerClickMetaData2 = molocoSdkClickMetaData.getBannerClickMetaData()) == null) ? null : bannerClickMetaData2.getClickThrough());
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData2 = c3415e.getExt().getMolocoSdkClickMetaData();
        lVar.a((molocoSdkClickMetaData2 == null || (bannerClickMetaData = molocoSdkClickMetaData2.getBannerClickMetaData()) == null) ? null : bannerClickMetaData.getClickTracking());
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData3 = c3415e.getExt().getMolocoSdkClickMetaData();
        lVar.a((molocoSdkClickMetaData3 != null ? molocoSdkClickMetaData3.getBannerClickMetaData() : null) != null);
        invoke.setAdShowListener(this.y);
        b();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(com.moloco.sdk.internal.j.a(this.k.b()), com.moloco.sdk.internal.j.a(this.k.a()));
        layoutParams.gravity = 1;
        addView(invoke, layoutParams);
        if (this.t.g()) {
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y yVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y(this.f7107a);
            final kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.s, null, null, new com.moloco.sdk.internal.publisher.n.j(MutableSharedFlow$default, this, null), 3, null);
            yVar.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return com.moloco.sdk.internal.publisher.n.a(com.moloco.sdk.internal.publisher.n.this, yVar, MutableSharedFlow$default, view, motionEvent);
                }
            });
            addView(yVar, new android.widget.FrameLayout.LayoutParams(-1, com.moloco.sdk.internal.j.a(this.k.a())));
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b(this.f, this.f7107a, null, 0, 12, null);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        bVar.setPadding(12, 0, 0, 12);
        bVar.setPrivacyUrl(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.f7607a);
        bVar.setOnButtonRenderedListener(new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.publisher.n.a(com.moloco.sdk.internal.publisher.n.this, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c) obj);
            }
        });
        bVar.setLayoutParams(layoutParams2);
        addView(bVar);
        return invoke;
    }

    public static final boolean a(com.moloco.sdk.internal.publisher.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y yVar, kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(nVar.s, null, null, new com.moloco.sdk.internal.publisher.n.k(motionEvent, yVar, nVar, mutableSharedFlow, null), 3, null);
        return false;
    }

    public static final kotlin.Unit a(com.moloco.sdk.internal.publisher.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        nVar.u.a(button);
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b2) {
        if (!this.e && b2 != null) {
            return b2.l();
        }
        return isViewShown();
    }

    public final boolean a() {
        return this.o == com.moloco.sdk.publisher.AdFormatType.MREC && this.p;
    }
}
