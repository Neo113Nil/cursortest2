package com.moloco.sdk.internal.publisher.nativead;

/* loaded from: classes5.dex */
public final class c {
    public static final com.moloco.sdk.internal.publisher.nativead.c.a k = new com.moloco.sdk.internal.publisher.nativead.c.a(null);
    public static final int l = 8;
    public static final java.lang.String m = "NativeAdLoader";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7121a;
    public final java.lang.String b;
    public final com.moloco.sdk.internal.publisher.p c;
    public final com.moloco.sdk.internal.publisher.nativead.parser.a d;
    public final com.moloco.sdk.internal.publisher.C3417a e;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder f;
    public final com.moloco.sdk.internal.services.J g;
    public final com.moloco.sdk.publisher.AdFormatType h;
    public final com.moloco.sdk.acm.TimerEvent i;
    public final com.moloco.sdk.internal.scheduling.DispatcherProvider j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {
        public static final int d = 8;

        /* renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.internal.ortb.model.C3415e f7122a;
        public final com.moloco.sdk.internal.publisher.nativead.model.b b;
        public final com.moloco.sdk.internal.publisher.nativead.model.d c;

        public b(com.moloco.sdk.internal.ortb.model.C3415e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.d preparedAssets) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preparedAssets, "preparedAssets");
            this.f7122a = bid;
            this.b = ortbResponse;
            this.c = preparedAssets;
        }

        public final com.moloco.sdk.internal.ortb.model.C3415e a() {
            return this.f7122a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.b b() {
            return this.b;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.d c() {
            return this.c;
        }

        public final com.moloco.sdk.internal.ortb.model.C3415e d() {
            return this.f7122a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.b e() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.internal.publisher.nativead.c.b)) {
                return false;
            }
            com.moloco.sdk.internal.publisher.nativead.c.b bVar = (com.moloco.sdk.internal.publisher.nativead.c.b) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f7122a, bVar.f7122a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, bVar.c);
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.d f() {
            return this.c;
        }

        public int hashCode() {
            return (((this.f7122a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public java.lang.String toString() {
            return "LoadedNativeAd(bid=" + this.f7122a + ", ortbResponse=" + this.b + ", preparedAssets=" + this.c + ')';
        }

        public final com.moloco.sdk.internal.publisher.nativead.c.b a(com.moloco.sdk.internal.ortb.model.C3415e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.d preparedAssets) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preparedAssets, "preparedAssets");
            return new com.moloco.sdk.internal.publisher.nativead.c.b(bid, ortbResponse, preparedAssets);
        }

        public static /* synthetic */ com.moloco.sdk.internal.publisher.nativead.c.b a(com.moloco.sdk.internal.publisher.nativead.c.b bVar, com.moloco.sdk.internal.ortb.model.C3415e c3415e, com.moloco.sdk.internal.publisher.nativead.model.b bVar2, com.moloco.sdk.internal.publisher.nativead.model.d dVar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c3415e = bVar.f7122a;
            }
            if ((i & 2) != 0) {
                bVar2 = bVar.b;
            }
            if ((i & 4) != 0) {
                dVar = bVar.c;
            }
            return bVar.a(c3415e, bVar2, dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0}, l = {239}, m = "fetchAssets-8Mi8wO0", n = {"this", "adType", "nativeAdPrepareTime"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.c$c, reason: collision with other inner class name */
    public static final class C0193c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7123a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public C0193c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.C0193c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.nativead.c.this.a((com.moloco.sdk.internal.publisher.nativead.model.b) null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$fireAdLoadFailedEventOnUiThread$2", f = "NativeAdLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7124a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.y b;
        public final /* synthetic */ com.moloco.sdk.internal.s c;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.B d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.internal.publisher.y yVar, com.moloco.sdk.internal.s sVar, com.moloco.sdk.internal.ortb.model.B b, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.d> continuation) {
            super(2, continuation);
            this.b = yVar;
            this.c = sVar;
            this.d = b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.nativead.c.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.nativead.c.d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7124a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.b.a(this.c, this.d);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0, 1, 2}, l = {189, 202, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "handleAssetsFetching-yxL6bBk", n = {"this", "sdkEvents", "adLoadTracker", "timeoutError", "error"}, s = {"L$0", "L$1", "L$2", "L$0", "L$0"})
    public static final class e extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7125a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public e(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            java.lang.Object a2 = com.moloco.sdk.internal.publisher.nativead.c.this.a((com.moloco.sdk.internal.ortb.model.B) null, (com.moloco.sdk.internal.publisher.nativead.model.b) null, (com.moloco.sdk.internal.publisher.y) null, 0L, this);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Result.m10797boximpl(a2);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$handleAssetsFetching$result$1", f = "NativeAdLoader.kt", i = {}, l = {com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7126a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.b c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.internal.publisher.nativead.model.b bVar, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.f> continuation) {
            super(2, continuation);
            this.c = bVar;
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
            return ((com.moloco.sdk.internal.publisher.nativead.c.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.nativead.c.this.new f(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7126a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.nativead.c cVar = com.moloco.sdk.internal.publisher.nativead.c.this;
                com.moloco.sdk.internal.publisher.nativead.model.b bVar = this.c;
                long j = this.d;
                this.f7126a = 1;
                obj = cVar.a(bVar, j, this);
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0, 1}, l = {143, 159}, m = "handleBidParsing-BWLJW6A", n = {"this", "acmLoadTimerEvent", "adLoadTracker", "it"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class g extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7127a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public g(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            java.lang.Object a2 = com.moloco.sdk.internal.publisher.nativead.c.this.a((java.lang.String) null, (com.moloco.sdk.acm.TimerEvent) null, (com.moloco.sdk.internal.publisher.y) null, this);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Result.m10797boximpl(a2);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0}, l = {175}, m = "handleOrtbParsing-BWLJW6A", n = {"result"}, s = {"L$0"})
    public static final class h extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7128a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public h(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            java.lang.Object a2 = com.moloco.sdk.internal.publisher.nativead.c.this.a((java.lang.String) null, (com.moloco.sdk.internal.ortb.model.B) null, (com.moloco.sdk.internal.publisher.y) null, this);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Result.m10797boximpl(a2);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {}, l = {99}, m = "load-BWLJW6A", n = {}, s = {})
    public static final class i extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7129a;
        public int c;

        public i(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7129a = obj;
            this.c |= Integer.MIN_VALUE;
            java.lang.Object b = com.moloco.sdk.internal.publisher.nativead.c.this.b(null, null, null, this);
            return b == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : kotlin.Result.m10797boximpl(b);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$load$2", f = "NativeAdLoader.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {111, 119, 126, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend", n = {"adLoadStartTimeMs", com.ironsource.M6.f, "adLoadStartTimeMs", com.ironsource.M6.f, "adLoadStartTimeMs", com.ironsource.M6.f, "ortbResponse"}, s = {"J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "L$1"})
    public static final class j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.moloco.sdk.internal.publisher.nativead.c.b>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f7130a;
        public java.lang.Object b;
        public java.lang.Object c;
        public int d;
        public final /* synthetic */ com.moloco.sdk.acm.TimerEvent f;
        public final /* synthetic */ java.lang.String g;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.y h;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$load$2$1", f = "NativeAdLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7131a;
            public final /* synthetic */ com.moloco.sdk.internal.publisher.y b;
            public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.c c;
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.C3415e d;
            public final /* synthetic */ long e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.internal.publisher.y yVar, com.moloco.sdk.internal.publisher.nativead.c cVar, com.moloco.sdk.internal.ortb.model.C3415e c3415e, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.j.a> continuation) {
                super(2, continuation);
                this.b = yVar;
                this.c = cVar;
                this.d = c3415e;
                this.e = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.internal.publisher.nativead.c.j.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.internal.publisher.nativead.c.j.a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7131a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.b.a(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo(this.c.b, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.d.getPrice()), this.d.getCrid()), this.e, this.d.getExt().getSdkEvents());
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.moloco.sdk.acm.TimerEvent timerEvent, java.lang.String str, com.moloco.sdk.internal.publisher.y yVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.j> continuation) {
            super(2, continuation);
            this.f = timerEvent;
            this.g = str;
            this.h = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<com.moloco.sdk.internal.publisher.nativead.c.b>> continuation) {
            return ((com.moloco.sdk.internal.publisher.nativead.c.j) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.nativead.c.this.new j(this.f, this.g, this.h, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0116 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            long j;
            com.moloco.sdk.internal.ortb.model.C3415e c3415e;
            long j2;
            java.lang.Object a3;
            com.moloco.sdk.internal.ortb.model.C3415e c3415e2;
            long j3;
            java.lang.Object obj2;
            java.lang.Throwable m10801exceptionOrNullimpl;
            java.lang.Object a4;
            com.moloco.sdk.internal.ortb.model.C3415e c3415e3;
            com.moloco.sdk.internal.publisher.nativead.model.b bVar;
            java.lang.Throwable m10801exceptionOrNullimpl2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long a5 = com.moloco.sdk.internal.publisher.nativead.c.this.g.a();
                this.f.startTimer();
                com.moloco.sdk.internal.publisher.nativead.c.this.f.recordTimerEvent(com.moloco.sdk.internal.publisher.nativead.c.this.i);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = com.moloco.sdk.internal.publisher.nativead.c.this.f;
                com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.k.c());
                java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                java.lang.String lowerCase = com.moloco.sdk.internal.publisher.nativead.c.this.h.name().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
                com.moloco.sdk.internal.publisher.nativead.c cVar = com.moloco.sdk.internal.publisher.nativead.c.this;
                java.lang.String str = this.g;
                com.moloco.sdk.acm.TimerEvent timerEvent = this.f;
                com.moloco.sdk.internal.publisher.y yVar = this.h;
                this.f7130a = a5;
                this.d = 1;
                a2 = cVar.a(str, timerEvent, yVar, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = a5;
            } else if (i == 1) {
                j = this.f7130a;
                kotlin.ResultKt.throwOnFailure(obj);
                a2 = ((kotlin.Result) obj).getValue();
            } else if (i == 2) {
                j2 = this.f7130a;
                c3415e = (com.moloco.sdk.internal.ortb.model.C3415e) this.b;
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.nativead.c cVar2 = com.moloco.sdk.internal.publisher.nativead.c.this;
                java.lang.String adm = c3415e.getAdm();
                com.moloco.sdk.internal.ortb.model.B sdkEvents = c3415e.getExt().getSdkEvents();
                com.moloco.sdk.internal.publisher.y yVar2 = this.h;
                this.b = c3415e;
                this.f7130a = j2;
                this.d = 3;
                a3 = cVar2.a(adm, sdkEvents, yVar2, this);
                if (a3 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                c3415e2 = c3415e;
                j3 = j2;
                obj2 = a3;
                m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj2);
                if (m10801exceptionOrNullimpl == null) {
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (com.moloco.sdk.internal.publisher.nativead.model.b) this.c;
                    c3415e3 = (com.moloco.sdk.internal.ortb.model.C3415e) this.b;
                    kotlin.ResultKt.throwOnFailure(obj);
                    a4 = ((kotlin.Result) obj).getValue();
                    m10801exceptionOrNullimpl2 = kotlin.Result.m10801exceptionOrNullimpl(a4);
                    if (m10801exceptionOrNullimpl2 != null) {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        return kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(new com.moloco.sdk.internal.publisher.nativead.c.b(c3415e3, bVar, (com.moloco.sdk.internal.publisher.nativead.model.d) a4)));
                    }
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl2)));
                }
                long j4 = this.f7130a;
                com.moloco.sdk.internal.ortb.model.C3415e c3415e4 = (com.moloco.sdk.internal.ortb.model.C3415e) this.b;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = ((kotlin.Result) obj).getValue();
                c3415e2 = c3415e4;
                j3 = j4;
                m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj2);
                if (m10801exceptionOrNullimpl == null) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl)));
                }
                com.moloco.sdk.internal.publisher.nativead.model.b bVar2 = (com.moloco.sdk.internal.publisher.nativead.model.b) obj2;
                com.moloco.sdk.internal.publisher.nativead.c cVar3 = com.moloco.sdk.internal.publisher.nativead.c.this;
                com.moloco.sdk.internal.ortb.model.B sdkEvents2 = c3415e2.getExt().getSdkEvents();
                com.moloco.sdk.internal.publisher.y yVar3 = this.h;
                this.b = c3415e2;
                this.c = bVar2;
                this.d = 4;
                a4 = cVar3.a(sdkEvents2, bVar2, yVar3, j3, this);
                if (a4 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c3415e3 = c3415e2;
                bVar = bVar2;
                m10801exceptionOrNullimpl2 = kotlin.Result.m10801exceptionOrNullimpl(a4);
                if (m10801exceptionOrNullimpl2 != null) {
                }
            }
            java.lang.Throwable m10801exceptionOrNullimpl3 = kotlin.Result.m10801exceptionOrNullimpl(a2);
            if (m10801exceptionOrNullimpl3 != null) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                return kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl3)));
            }
            c3415e = (com.moloco.sdk.internal.ortb.model.C3415e) a2;
            kotlin.coroutines.CoroutineContext main = com.moloco.sdk.internal.publisher.nativead.c.this.j.getMain();
            com.moloco.sdk.internal.publisher.nativead.c.j.a aVar = new com.moloco.sdk.internal.publisher.nativead.c.j.a(this.h, com.moloco.sdk.internal.publisher.nativead.c.this, c3415e, j, null);
            this.b = c3415e;
            this.f7130a = j;
            this.d = 2;
            if (kotlinx.coroutines.BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = j;
            com.moloco.sdk.internal.publisher.nativead.c cVar22 = com.moloco.sdk.internal.publisher.nativead.c.this;
            java.lang.String adm2 = c3415e.getAdm();
            com.moloco.sdk.internal.ortb.model.B sdkEvents3 = c3415e.getExt().getSdkEvents();
            com.moloco.sdk.internal.publisher.y yVar22 = this.h;
            this.b = c3415e;
            this.f7130a = j2;
            this.d = 3;
            a3 = cVar22.a(adm2, sdkEvents3, yVar22, this);
            if (a3 != coroutine_suspended) {
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {}, l = {286}, m = "prepareAssets-8Mi8wO0", n = {}, s = {})
    public static final class k extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7132a;
        public int c;

        public k(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.c.k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7132a = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.nativead.c.this.a((java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a>) null, 0L, this);
        }
    }

    public c(android.content.Context context, java.lang.String adUnitId, com.moloco.sdk.internal.publisher.p bidLoader, com.moloco.sdk.internal.publisher.nativead.parser.a ortbResponseParser, com.moloco.sdk.internal.publisher.C3417a createLoadTimeoutManager, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.J timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidLoader, "bidLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ortbResponseParser, "ortbResponseParser");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f7121a = context;
        this.b = adUnitId;
        this.c = bidLoader;
        this.d = ortbResponseParser;
        this.e = createLoadTimeoutManager;
        this.f = metricsRecorder;
        this.g = timeProvider;
        com.moloco.sdk.publisher.AdFormatType adFormatType = com.moloco.sdk.publisher.AdFormatType.NATIVE;
        this.h = adFormatType;
        com.moloco.sdk.acm.TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase = adFormatType.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.i = startTimerEvent.withTag(c, lowerCase);
        this.j = com.moloco.sdk.internal.scheduling.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.String str, com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.internal.publisher.y yVar, kotlin.coroutines.Continuation<? super kotlin.Result<com.moloco.sdk.internal.publisher.nativead.c.b>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.c.i iVar;
        int i2;
        if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.c.i) {
            iVar = (com.moloco.sdk.internal.publisher.nativead.c.i) continuation;
            int i3 = iVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.f7129a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = iVar.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext coroutineContext = this.j.getDefault();
                    com.moloco.sdk.internal.publisher.nativead.c.j jVar = new com.moloco.sdk.internal.publisher.nativead.c.j(timerEvent, str, yVar, null);
                    iVar.c = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, jVar, iVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlin.Result) obj).getValue();
            }
        }
        iVar = new com.moloco.sdk.internal.publisher.nativead.c.i(continuation);
        java.lang.Object obj2 = iVar.f7129a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = iVar.c;
        if (i2 != 0) {
        }
        return ((kotlin.Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.internal.publisher.y yVar, kotlin.coroutines.Continuation<? super kotlin.Result<com.moloco.sdk.internal.ortb.model.C3415e>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.c.g gVar;
        int i2;
        com.moloco.sdk.internal.publisher.nativead.c cVar;
        com.moloco.sdk.internal.v vVar;
        com.moloco.sdk.internal.v vVar2;
        if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.c.g) {
            gVar = (com.moloco.sdk.internal.publisher.nativead.c.g) continuation;
            int i3 = gVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.f = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = gVar.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = gVar.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.publisher.p pVar = this.c;
                    java.lang.String str2 = this.b;
                    gVar.f7127a = this;
                    gVar.b = timerEvent;
                    gVar.c = yVar;
                    gVar.f = 1;
                    obj = pVar.a(str2, str, gVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vVar2 = (com.moloco.sdk.internal.v) gVar.f7127a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(((com.moloco.sdk.internal.s) ((com.moloco.sdk.internal.v.a) vVar2).a()).toString())));
                    }
                    yVar = (com.moloco.sdk.internal.publisher.y) gVar.c;
                    timerEvent = (com.moloco.sdk.acm.TimerEvent) gVar.b;
                    cVar = (com.moloco.sdk.internal.publisher.nativead.c) gVar.f7127a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = cVar.f;
                    com.moloco.sdk.acm.TimerEvent withTag = timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
                    java.lang.String c = dVar.c();
                    com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                    com.moloco.sdk.acm.TimerEvent withTag2 = withTag.withTag(c, java.lang.String.valueOf(errorType.getErrorCode()));
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    java.lang.String c2 = dVar2.c();
                    java.lang.String name = cVar.h.name();
                    java.util.Locale locale = java.util.Locale.ROOT;
                    java.lang.String lowerCase = name.toLowerCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(withTag2.withTag(c2, lowerCase));
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = cVar.f;
                    com.moloco.sdk.acm.CountEvent withTag3 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag(dVar.c(), java.lang.String.valueOf(errorType.getErrorCode()));
                    java.lang.String c3 = dVar2.c();
                    java.lang.String lowerCase2 = cVar.h.name().toLowerCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder2.recordCountEvent(withTag3.withTag(c3, lowerCase2));
                    com.moloco.sdk.internal.s sVar = (com.moloco.sdk.internal.s) ((com.moloco.sdk.internal.v.a) vVar).a();
                    gVar.f7127a = vVar;
                    gVar.b = null;
                    gVar.c = null;
                    gVar.f = 2;
                    if (cVar.a(yVar, sVar, (com.moloco.sdk.internal.ortb.model.B) null, gVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vVar2 = vVar;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(((com.moloco.sdk.internal.s) ((com.moloco.sdk.internal.v.a) vVar2).a()).toString())));
                }
                if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(((com.moloco.sdk.internal.v.b) vVar).a());
            }
        }
        gVar = new com.moloco.sdk.internal.publisher.nativead.c.g(continuation);
        java.lang.Object obj2 = gVar.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar.f;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, com.moloco.sdk.internal.ortb.model.B b2, com.moloco.sdk.internal.publisher.y yVar, kotlin.coroutines.Continuation<? super kotlin.Result<com.moloco.sdk.internal.publisher.nativead.model.b>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.c.h hVar;
        int i2;
        if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.c.h) {
            hVar = (com.moloco.sdk.internal.publisher.nativead.c.h) continuation;
            int i3 = hVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.e = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = hVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = hVar.e;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj2 = hVar.f7128a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj2;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object a2 = this.d.a(str);
                java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a2);
                if (m10801exceptionOrNullimpl != null) {
                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, "handleOrtbParsing", m10801exceptionOrNullimpl, false, 8, null);
                    com.moloco.sdk.internal.s a3 = com.moloco.sdk.internal.t.a(this.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_FAILED, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f7445a, null, 8, null);
                    hVar.f7128a = a2;
                    hVar.b = a2;
                    hVar.e = 1;
                    if (a(yVar, a3, b2, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return a2;
            }
        }
        hVar = new com.moloco.sdk.internal.publisher.nativead.c.h(continuation);
        java.lang.Object obj3 = hVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = hVar.e;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.internal.ortb.model.B b2, com.moloco.sdk.internal.publisher.nativead.model.b bVar, com.moloco.sdk.internal.publisher.y yVar, long j2, kotlin.coroutines.Continuation<? super kotlin.Result<com.moloco.sdk.internal.publisher.nativead.model.d>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.c.e eVar;
        int i2;
        com.moloco.sdk.internal.ortb.model.B b3;
        com.moloco.sdk.internal.publisher.y yVar2;
        com.moloco.sdk.internal.publisher.nativead.c cVar;
        com.moloco.sdk.internal.v vVar;
        com.moloco.sdk.internal.s sVar;
        com.moloco.sdk.internal.s sVar2;
        if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.c.e) {
            eVar = (com.moloco.sdk.internal.publisher.nativead.c.e) continuation;
            int i3 = eVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f = i3 - Integer.MIN_VALUE;
                com.moloco.sdk.internal.publisher.nativead.c.e eVar2 = eVar;
                java.lang.Object obj = eVar2.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = eVar2.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, "nativeAd load has " + j2 + " to load the ad", null, false, 12, null);
                    long a2 = this.e.a(j2);
                    com.moloco.sdk.internal.publisher.nativead.c.f fVar = new com.moloco.sdk.internal.publisher.nativead.c.f(bVar, a2, null);
                    eVar2.f7125a = this;
                    b3 = b2;
                    eVar2.b = b3;
                    yVar2 = yVar;
                    eVar2.c = yVar2;
                    eVar2.f = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(a2, fVar, eVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            sVar2 = (com.moloco.sdk.internal.s) eVar2.f7125a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(sVar2.toString())));
                        }
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar = (com.moloco.sdk.internal.s) eVar2.f7125a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(sVar.toString())));
                    }
                    com.moloco.sdk.internal.publisher.y yVar3 = (com.moloco.sdk.internal.publisher.y) eVar2.c;
                    com.moloco.sdk.internal.ortb.model.B b4 = (com.moloco.sdk.internal.ortb.model.B) eVar2.b;
                    cVar = (com.moloco.sdk.internal.publisher.nativead.c) eVar2.f7125a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    yVar2 = yVar3;
                    b3 = b4;
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, m, "Handling native ad load result: " + vVar, null, false, 12, null);
                if (vVar != null) {
                    com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger, m, "Native ad load timeout", null, false, 12, null);
                    com.moloco.sdk.internal.s a3 = com.moloco.sdk.internal.t.a(cVar.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.d, null, 8, null);
                    eVar2.f7125a = a3;
                    eVar2.b = null;
                    eVar2.c = null;
                    eVar2.f = 2;
                    if (cVar.a(yVar2, a3, b3, eVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sVar2 = a3;
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(sVar2.toString())));
                }
                if (vVar instanceof com.moloco.sdk.internal.v.a) {
                    com.moloco.sdk.internal.s a4 = com.moloco.sdk.internal.t.a(cVar.b, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_FAILED, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.v.a) vVar).a(), null, 8, null);
                    eVar2.f7125a = a4;
                    eVar2.b = null;
                    eVar2.c = null;
                    eVar2.f = 3;
                    if (cVar.a(yVar2, a4, b3, eVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sVar = a4;
                    kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(sVar.toString())));
                }
                if (vVar instanceof com.moloco.sdk.internal.v.b) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl(((com.moloco.sdk.internal.v.b) vVar).a());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        eVar = new com.moloco.sdk.internal.publisher.nativead.c.e(continuation);
        com.moloco.sdk.internal.publisher.nativead.c.e eVar22 = eVar;
        java.lang.Object obj2 = eVar22.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar22.f;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, m, "Handling native ad load result: " + vVar, null, false, 12, null);
        if (vVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.internal.publisher.nativead.model.b bVar, long j2, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.c.C0193c c0193c;
        int i2;
        java.lang.String str;
        com.moloco.sdk.acm.TimerEvent timerEvent;
        com.moloco.sdk.internal.publisher.nativead.c cVar;
        com.moloco.sdk.internal.v vVar;
        if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.c.C0193c) {
            c0193c = (com.moloco.sdk.internal.publisher.nativead.c.C0193c) continuation;
            int i3 = c0193c.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0193c.f = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c0193c.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0193c.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long duration = kotlin.time.DurationKt.toDuration(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.time.Duration.m12157getInWholeMillisecondsimpl(j2) - (this.g.a() - this.g.a()), 0L), kotlin.time.DurationUnit.MILLISECONDS);
                    java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> a2 = bVar.a();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : a2) {
                        if (obj2 instanceof com.moloco.sdk.internal.publisher.nativead.model.b.a.d) {
                            arrayList.add(obj2);
                        }
                    }
                    str = arrayList.isEmpty() ^ true ? "video" : "image";
                    com.moloco.sdk.acm.TimerEvent startTimerEvent = this.f.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.k.c());
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.f;
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.n.c());
                    java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
                    java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> a3 = bVar.a();
                    c0193c.f7123a = this;
                    c0193c.b = str;
                    c0193c.c = startTimerEvent;
                    c0193c.f = 1;
                    java.lang.Object a4 = a(a3, duration, c0193c);
                    if (a4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    timerEvent = startTimerEvent;
                    obj = a4;
                    cVar = this;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    timerEvent = (com.moloco.sdk.acm.TimerEvent) c0193c.c;
                    str = (java.lang.String) c0193c.b;
                    cVar = (com.moloco.sdk.internal.publisher.nativead.c) c0193c.f7123a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                    com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("NativeAd load failed: ");
                    com.moloco.sdk.internal.v.a aVar = (com.moloco.sdk.internal.v.a) vVar;
                    sb.append(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b());
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, m, sb.toString(), null, false, 12, null);
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = cVar.f;
                    com.moloco.sdk.acm.CountEvent countEvent2 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.o.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    com.moloco.sdk.acm.CountEvent withTag = countEvent2.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    java.lang.String c2 = dVar2.c();
                    java.util.Locale locale = java.util.Locale.ROOT;
                    java.lang.String lowerCase2 = str.toLowerCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    com.moloco.sdk.acm.CountEvent withTag2 = withTag.withTag(c2, lowerCase2);
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    metricsRecorder2.recordCountEvent(withTag2.withTag(dVar3.c(), ((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b().a()).withTag("asset_id", java.lang.String.valueOf(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).a())));
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3 = cVar.f;
                    com.moloco.sdk.acm.TimerEvent withTag3 = timerEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                    java.lang.String c3 = dVar2.c();
                    java.lang.String lowerCase3 = str.toLowerCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    metricsRecorder3.recordTimerEvent(withTag3.withTag(c3, lowerCase3).withTag(dVar3.c(), ((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b().a()).withTag("asset_id", java.lang.String.valueOf(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).a())));
                    return new com.moloco.sdk.internal.v.a(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b());
                }
                if (vVar instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, "NativeAd load successfully parsed and loaded all assets", null, false, 12, null);
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder4 = cVar.f;
                    com.moloco.sdk.acm.CountEvent countEvent3 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.o.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    com.moloco.sdk.acm.CountEvent withTag4 = countEvent3.withTag(dVar4.c(), "success");
                    com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    java.lang.String c4 = dVar5.c();
                    java.util.Locale locale2 = java.util.Locale.ROOT;
                    java.lang.String lowerCase4 = str.toLowerCase(locale2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                    metricsRecorder4.recordCountEvent(withTag4.withTag(c4, lowerCase4));
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder5 = cVar.f;
                    com.moloco.sdk.acm.TimerEvent withTag5 = timerEvent.withTag(dVar4.c(), "success");
                    java.lang.String c5 = dVar5.c();
                    java.lang.String lowerCase5 = str.toLowerCase(locale2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                    metricsRecorder5.recordTimerEvent(withTag5.withTag(c5, lowerCase5));
                    return new com.moloco.sdk.internal.v.b(((com.moloco.sdk.internal.v.b) vVar).a());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        c0193c = new com.moloco.sdk.internal.publisher.nativead.c.C0193c(continuation);
        java.lang.Object obj3 = c0193c.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0193c.f;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj3;
        if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a> list, long j2, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.internal.publisher.nativead.parser.b>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.c.k kVar;
        int i2;
        com.moloco.sdk.internal.v vVar;
        if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.c.k) {
            kVar = (com.moloco.sdk.internal.publisher.nativead.c.k) continuation;
            int i3 = kVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = kVar.f7132a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = kVar.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    android.content.Context context = this.f7121a;
                    kVar.c = 1;
                    obj = com.moloco.sdk.internal.publisher.nativead.parser.c.a(context, list, j2, kVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                    return new com.moloco.sdk.internal.v.b(((com.moloco.sdk.internal.v.b) vVar).a());
                }
                if (vVar instanceof com.moloco.sdk.internal.v.a) {
                    com.moloco.sdk.internal.v.a aVar = (com.moloco.sdk.internal.v.a) vVar;
                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, "NativeAd prepareAssets failed", (java.lang.Throwable) aVar.a(), false, 8, null);
                    return new com.moloco.sdk.internal.v.a(aVar.a());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        kVar = new com.moloco.sdk.internal.publisher.nativead.c.k(continuation);
        java.lang.Object obj2 = kVar.f7132a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.c;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
        }
    }

    public final java.lang.Object a(com.moloco.sdk.internal.publisher.y yVar, com.moloco.sdk.internal.s sVar, com.moloco.sdk.internal.ortb.model.B b2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.j.getMain(), new com.moloco.sdk.internal.publisher.nativead.c.d(yVar, sVar, b2, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
