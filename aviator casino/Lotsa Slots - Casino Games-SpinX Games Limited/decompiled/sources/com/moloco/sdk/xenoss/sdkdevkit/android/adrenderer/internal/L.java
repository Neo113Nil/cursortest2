package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class L implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b {
    public static final int m = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.C3415e f7393a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m d;
    public final boolean e;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder f;
    public com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> g;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> h;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> i;
    public kotlinx.coroutines.Job j;
    public com.moloco.sdk.acm.TimerEvent k;
    public java.lang.String l;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$captureLoadMetrics$2", f = "VastAdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7394a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.a> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Integer e;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7394a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
            com.moloco.sdk.internal.utils.f fVar = com.moloco.sdk.internal.utils.f.f7337a;
            com.moloco.sdk.internal.utils.e a2 = fVar.a(this.c.j().j());
            l.l = (a2 == null || (e = a2.e()) == null) ? null : fVar.b(e.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1", f = "VastAdLoad.kt", i = {0}, l = {118, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135}, m = "invokeSuspend", n = {"decDeferred"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7395a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a d;
        public final /* synthetic */ long e;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1", f = "VastAdLoad.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7396a;
            public final /* synthetic */ long b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L d;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$a$a, reason: collision with other inner class name */
            public static final class C0218a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7397a;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0218a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a.C0218a> continuation) {
                    super(2, continuation);
                    this.b = c3453i;
                    this.c = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a.C0218a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a.C0218a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f7397a;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i = this.b;
                        if (c3453i == null) {
                            return null;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l = this.c;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m interfaceC3457m = l.d;
                        com.moloco.sdk.internal.ortb.model.C3416f ext = l.f7393a.getExt();
                        java.lang.String mtid = ext != null ? ext.getMtid() : null;
                        this.f7397a = 1;
                        obj = interfaceC3457m.a(c3453i, mtid, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c3453i;
                this.d = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7396a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a.C0218a c0218a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a.C0218a(this.c, this.d, null);
                    this.f7396a = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(j, c0218a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) obj;
                return c3453i == null ? this.c : c3453i;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1", f = "VastAdLoad.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$b, reason: collision with other inner class name */
        public static final class C0219b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7398a;
            public final /* synthetic */ long b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L c;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$b$a */
            public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7399a;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b.a> continuation) {
                    super(2, continuation);
                    this.b = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b.a(this.b, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f7399a;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar = this.b.c;
                        java.lang.String adm = this.b.f7393a.getAdm();
                        java.lang.String a2 = com.moloco.sdk.internal.ortb.model.h.a(this.b.f7393a);
                        this.f7399a = 1;
                        obj = dVar.a(adm, a2, false, this);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0219b(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7398a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b.a(this.c, null);
                    this.f7398a = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12301withTimeoutKLykuaI(j, aVar, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b> continuation) {
            super(2, continuation);
            this.d = aVar;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.new b(this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00fe A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.Deferred] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Deferred async$default;
            kotlinx.coroutines.Deferred async$default2;
            java.lang.Object await;
            com.moloco.sdk.internal.ortb.model.l dec;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
            java.lang.Object await2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.f7395a;
            try {
                if (r2 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.d() instanceof com.moloco.sdk.internal.v.b) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar3 = this.d;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.C0219b(this.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this, null), 3, null);
                    com.moloco.sdk.internal.ortb.model.z player = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.f7393a.getExt().getPlayer();
                    async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b.a(this.e, (player == null || (dec = player.getDec()) == null) ? null : com.moloco.sdk.internal.l.a(dec), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this, null), 3, null);
                    this.b = async$default2;
                    this.f7395a = 1;
                    await = async$default.await(this);
                    r2 = async$default2;
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.h.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                            aVar2 = this.d;
                            if (aVar2 != null) {
                                aVar2.a();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) this.b;
                        kotlin.ResultKt.throwOnFailure(obj);
                        aVar = aVar4;
                        await2 = obj;
                        a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) await2, 15, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.a(new com.moloco.sdk.internal.v.b(a2));
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
                        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = l2.f;
                        l2.k = metricsRecorder == null ? metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                        l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
                        this.b = null;
                        this.f7395a = 3;
                        if (l.a(a2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.h.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                        aVar2 = this.d;
                        if (aVar2 != null) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) this.b;
                    kotlin.ResultKt.throwOnFailure(obj);
                    await = obj;
                    r2 = deferred;
                }
                com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) await;
                if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                    if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.a((kotlinx.coroutines.Deferred<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>) r2, this.d, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.v.a) vVar).a());
                    return kotlin.Unit.INSTANCE;
                }
                aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.v.b) vVar).a();
                this.b = aVar;
                this.f7395a = 2;
                await2 = r2.await(this);
                if (await2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) await2, 15, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.a(new com.moloco.sdk.internal.v.b(a2));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = l22.f;
                l22.k = metricsRecorder2 == null ? metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
                this.b = null;
                this.f7395a = 3;
                if (l.a(a2, this) == coroutine_suspended) {
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.h.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                aVar2 = this.d;
                if (aVar2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
                com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.M.f7403a, "main VAST ad didn't load due to timeout", false, 4, null);
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) r2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.a(new com.moloco.sdk.internal.v.a(aVar5));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar6 = this.d;
                if (aVar6 != null) {
                    aVar6.a(aVar5);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1", f = "VastAdLoad.kt", i = {0, 1, 1}, l = {158, 173, 175, 178}, m = "invokeSuspend", n = {"$this$launch", "vastAdDeferred", "decDeferred"}, s = {"L$0", "L$0", "L$1"})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7400a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a e;
        public final /* synthetic */ long f;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1", f = "VastAdLoad.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7401a;
            public final /* synthetic */ long b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L d;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$c$a$a, reason: collision with other inner class name */
            public static final class C0220a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7402a;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0220a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a.C0220a> continuation) {
                    super(2, continuation);
                    this.b = c3453i;
                    this.c = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a.C0220a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a.C0220a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f7402a;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i = this.b;
                        if (c3453i == null) {
                            return null;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l = this.c;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m interfaceC3457m = l.d;
                        java.lang.String mtid = l.f7393a.getExt().getMtid();
                        this.f7402a = 1;
                        obj = interfaceC3457m.a(c3453i, mtid, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c3453i;
                this.d = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7401a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a.C0220a c0220a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a.C0220a(this.c, this.d, null);
                    this.f7401a = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(j, c0220a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) obj;
                return c3453i == null ? this.c : c3453i;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.new c(this.e, this.f, continuation);
            cVar.c = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x013d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0155  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope;
            java.lang.Object a2;
            kotlinx.coroutines.Deferred async$default;
            java.lang.Object a3;
            com.moloco.sdk.internal.v vVar;
            kotlinx.coroutines.Deferred deferred;
            com.moloco.sdk.internal.ortb.model.l dec;
            com.moloco.sdk.internal.v vVar2;
            java.lang.Object await;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a4;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.c;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.d() instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar3 = this.e;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.c;
                java.lang.String adm = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.f7393a.getAdm();
                java.lang.String a5 = com.moloco.sdk.internal.ortb.model.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.f7393a);
                this.c = coroutineScope;
                this.b = 1;
                a2 = dVar.a(adm, a5, true, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.h.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                            aVar2 = this.e;
                            if (aVar2 != null) {
                                aVar2.a();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) this.c;
                        kotlin.ResultKt.throwOnFailure(obj);
                        aVar = aVar4;
                        await = obj;
                        a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) await, 15, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.a(new com.moloco.sdk.internal.v.b(a4));
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
                        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = l2.f;
                        l2.k = metricsRecorder == null ? metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                        l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
                        this.c = null;
                        this.b = 4;
                        if (l.a(a4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.h.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                        aVar2 = this.e;
                        if (aVar2 != null) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    deferred = (kotlinx.coroutines.Deferred) this.f7400a;
                    com.moloco.sdk.internal.v vVar3 = (com.moloco.sdk.internal.v) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    vVar = vVar3;
                    a3 = obj;
                    vVar2 = (com.moloco.sdk.internal.v) a3;
                    if (vVar2 instanceof com.moloco.sdk.internal.v.b) {
                        if (!(vVar2 instanceof com.moloco.sdk.internal.v.a)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.M.f7403a, "main VAST ad didn't load due to failure or timeout", false, 4, null);
                        com.moloco.sdk.internal.v.a aVar5 = (com.moloco.sdk.internal.v.a) vVar2;
                        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) aVar5.a()).d()) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.b(deferred, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) aVar5.a());
                        } else {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.a((kotlinx.coroutines.Deferred<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>) deferred, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) aVar5.a());
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.v.b) vVar).a();
                    this.c = aVar6;
                    this.f7400a = null;
                    this.b = 3;
                    await = deferred.await(this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = aVar6;
                    a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) await, 15, null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.a(new com.moloco.sdk.internal.v.b(a4));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L l22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = l22.f;
                    l22.k = metricsRecorder2 == null ? metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                    l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this;
                    this.c = null;
                    this.b = 4;
                    if (l.a(a4, this) == coroutine_suspended) {
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.h.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    aVar2 = this.e;
                    if (aVar2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                a2 = obj;
            }
            kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
            com.moloco.sdk.internal.v vVar4 = (com.moloco.sdk.internal.v) a2;
            com.moloco.sdk.internal.ortb.model.z player = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.f7393a.getExt().getPlayer();
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c.a(this.f, (player == null || (dec = player.getDec()) == null) ? null : com.moloco.sdk.internal.l.a(dec), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this, null), 3, null);
            if (!(vVar4 instanceof com.moloco.sdk.internal.v.b)) {
                if (!(vVar4 instanceof com.moloco.sdk.internal.v.a)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.a((kotlinx.coroutines.Deferred<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>) async$default, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.v.a) vVar4).a());
                return kotlin.Unit.INSTANCE;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.this.c;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.v.b) vVar4).a();
            long j = this.f;
            this.c = vVar4;
            this.f7400a = async$default;
            this.b = 2;
            a3 = dVar2.a(aVar7, j, this);
            if (a3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            vVar = vVar4;
            deferred = async$default;
            vVar2 = (com.moloco.sdk.internal.v) a3;
            if (vVar2 instanceof com.moloco.sdk.internal.v.b) {
            }
        }
    }

    public L(com.moloco.sdk.internal.ortb.model.C3415e bid, kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m decLoader, boolean z, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        this.f7393a = bid;
        this.b = scope;
        this.c = loadVast;
        this.d = decLoader;
        this.e = z;
        this.f = metricsRecorder;
        this.g = new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f7450a);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.h = MutableStateFlow;
        this.i = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
        return this.i;
    }

    public final com.moloco.sdk.acm.TimerEvent c() {
        return this.k;
    }

    public final com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d() {
        return this.g;
    }

    public final java.lang.String b() {
        return this.l;
    }

    public final void c(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.j;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.c(aVar, j, null), 3, null);
        this.j = launch$default;
    }

    public final void b(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.j;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.b(aVar, j, null), 3, null);
        this.j = launch$default;
    }

    public final void a(com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> vVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.g = vVar;
    }

    public final void b(kotlinx.coroutines.Deferred<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> deferred, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b;
        this.g = new com.moloco.sdk.internal.v.a(cVar);
        if (aVar != null) {
            aVar.a(aVar2);
        }
    }

    public final java.lang.Integer a() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
        com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> vVar = this.g;
        com.moloco.sdk.internal.v.b bVar = vVar instanceof com.moloco.sdk.internal.v.b ? (com.moloco.sdk.internal.v.b) vVar : null;
        if (bVar == null || (aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) bVar.a()) == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2 = this.c.a(aVar.j().l());
        if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) {
            return 100;
        }
        if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d d = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) a2).d();
            if (d.d() > 0) {
                return java.lang.Integer.valueOf((int) ((d.c() * 100) / d.d()));
            }
            return null;
        }
        if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ L(com.moloco.sdk.internal.ortb.model.C3415e c3415e, kotlinx.coroutines.CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m interfaceC3457m, boolean z, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c3415e, coroutineScope, dVar, interfaceC3457m, z, (i & 32) != 0 ? null : metricsRecorder);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        if (this.e) {
            c(j, aVar);
        } else {
            b(j, aVar);
        }
    }

    public final void a(kotlinx.coroutines.Deferred<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> deferred, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.M.f7403a, "Vast AD failed to load: " + cVar, null, false, 12, null);
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        this.g = new com.moloco.sdk.internal.v.a(cVar);
        if (aVar != null) {
            aVar.a(cVar);
        }
    }

    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.a(aVar, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
