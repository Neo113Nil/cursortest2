package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3445b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g> {
    public static final int z = 8;
    public final android.content.Context h;
    public final com.moloco.sdk.internal.ortb.model.C3415e i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r k;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y l;
    public final com.moloco.sdk.internal.A m;
    public final kotlinx.coroutines.CoroutineScope n;
    public final com.moloco.sdk.internal.services.s o;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h p;
    public final java.lang.String q;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i r;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g s;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> t;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> u;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> v;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b w;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> x;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> y;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a */
    public static final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b {

        /* renamed from: a, reason: collision with root package name */
        public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> f7419a;
        public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0224a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7420a;

            static {
                int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.values().length];
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f7361a.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.d.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.e.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                f7420a = iArr;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$load$1", f = "AggregatedBanner.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b, reason: collision with other inner class name */
        public static final class C0225b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7421a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c;
            public final /* synthetic */ long d;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a e;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a, reason: collision with other inner class name */
            public static final class C0226a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a f7422a;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b b;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0227a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f7423a;

                    static {
                        int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.values().length];
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f7361a.ordinal()] = 1;
                        } catch (java.lang.NoSuchFieldError unused) {
                        }
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b.ordinal()] = 2;
                        } catch (java.lang.NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c.ordinal()] = 3;
                        } catch (java.lang.NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.d.ordinal()] = 4;
                        } catch (java.lang.NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.e.ordinal()] = 5;
                        } catch (java.lang.NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f.ordinal()] = 6;
                        } catch (java.lang.NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.ordinal()] = 7;
                        } catch (java.lang.NoSuchFieldError unused7) {
                        }
                        f7423a = iArr;
                    }
                }

                public C0226a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c3445b) {
                    this.f7422a = aVar;
                    this.b = c3445b;
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
                public void a() {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar = this.f7422a;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
                public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType = this.b.getCreativeType();
                    switch (creativeType == null ? -1 : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.C0225b.C0226a.C0227a.f7423a[creativeType.ordinal()]) {
                        case -1:
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b.q, "creativeType is null", new java.lang.Throwable(), false, 8, null);
                            return;
                        case 0:
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                        case 1:
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar = this.f7422a;
                            if (aVar != null) {
                                aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.h);
                                return;
                            }
                            return;
                        case 2:
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar2 = this.f7422a;
                            if (aVar2 != null) {
                                aVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.i);
                                return;
                            }
                            return;
                        case 3:
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar3 = this.f7422a;
                            if (aVar3 != null) {
                                aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.j);
                                return;
                            }
                            return;
                        case 4:
                        case 5:
                        case 6:
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b.q, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                            return;
                        case 7:
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b.q, "Unknown creative type for timeout error", null, false, 12, null);
                            return;
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
                public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalError, "internalError");
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar = this.f7422a;
                    if (aVar != null) {
                        aVar.a(internalError);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0225b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c3445b, long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.C0225b> continuation) {
                super(2, continuation);
                this.c = c3445b;
                this.d = j;
                this.e = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.C0225b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.this.new C0225b(this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7421a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.this;
                    this.f7421a = 1;
                    if (aVar.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl = this.c.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.a(this.d, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.C0225b.C0226a(this.e, this.c));
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1", f = "AggregatedBanner.kt", i = {0}, l = {160}, m = "prepareBanner", n = {"this"}, s = {"L$0"})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$c */
        public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public java.lang.Object f7424a;
            public /* synthetic */ java.lang.Object b;
            public int d;

            public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.c> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.this.a(this);
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$2", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$d */
        public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7425a;
            public /* synthetic */ boolean b;

            public d(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.d> continuation) {
                super(2, continuation);
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.d) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.this.new d(continuation);
                dVar.b = ((java.lang.Boolean) obj).booleanValue();
                return dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7425a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.this.f7419a.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b));
                return kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$3", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$e */
        public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7426a;
            public /* synthetic */ boolean b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c3445b, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.e> continuation) {
                super(2, continuation);
                this.c = c3445b;
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.e) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.e(this.c, continuation);
                eVar.b = ((java.lang.Boolean) obj).booleanValue();
                return eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7426a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.c.x.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b));
                return kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$crType$1", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$f */
        public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7427a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c3445b, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.f> continuation) {
                super(2, continuation);
                this.b = c3445b;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.f(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7427a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h.f7458a.c(this.b.i.getAdm());
                this.b.r = c;
                return c;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar) {
            this.d = aVar;
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
            this.f7419a = MutableStateFlow;
            this.b = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
        public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
            return this.b;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
        public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.C0225b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this, j, aVar, null), 3, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.c cVar;
            int i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl2;
            kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l;
            kotlinx.coroutines.flow.Flow onEach;
            kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded;
            kotlinx.coroutines.flow.Flow onEach2;
            if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.c) {
                cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.c) continuation;
                int i2 = cVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = cVar.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cVar.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.q, "Preparing banner", false, 4, null);
                        creativeType = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.getCreativeType();
                        if (creativeType != null) {
                            aVar = this;
                            switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.C0224a.f7420a[creativeType.ordinal()]) {
                                case 1:
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.m.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this);
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.h, aVar.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.j.c(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.h), com.moloco.sdk.service_locator.a.C0211a.f7342a.a(), true, null, 32, null));
                                    break;
                                case 2:
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.i.getAdm(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.l, null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n, 16, null);
                                    break;
                                case 3:
                                    android.content.Context context = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.h;
                                    com.moloco.sdk.internal.services.s sVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.o;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.p;
                                    com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.i.getExt().getMolocoSdkClickMetaData();
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, sVar, hVar, (molocoSdkClickMetaData != null ? molocoSdkClickMetaData.getBannerClickMetaData() : null) != null, null, 34, null);
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.v = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.l, aVar2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.i.getAdm(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n, aVar2), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n, null, 32, null);
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.q, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                                    break;
                                case 7:
                                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.q, "Unknown creative type for timeout error", null, false, 12, null);
                                    break;
                                default:
                                    throw new kotlin.NoWhenBranchMatchedException();
                            }
                            bannerImpl = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.getBannerImpl();
                            if (bannerImpl != null && (isLoaded = bannerImpl.isLoaded()) != null && (onEach2 = kotlinx.coroutines.flow.FlowKt.onEach(isLoaded, aVar.new d(null))) != null) {
                                kotlinx.coroutines.flow.FlowKt.launchIn(onEach2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n);
                            }
                            bannerImpl2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.getBannerImpl();
                            if (bannerImpl2 != null && (l = bannerImpl2.l()) != null && (onEach = kotlinx.coroutines.flow.FlowKt.onEach(l, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this, null))) != null) {
                                kotlinx.coroutines.flow.FlowKt.launchIn(onEach, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n);
                            }
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c3445b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this;
                            c3445b.setAdShowListener(c3445b.getAdShowListener());
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.coroutines.CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this, null);
                        cVar.f7424a = this;
                        cVar.d = 1;
                        obj = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, fVar, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a) cVar.f7424a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj;
                    switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.C0224a.f7420a[creativeType.ordinal()]) {
                    }
                    bannerImpl = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.getBannerImpl();
                    if (bannerImpl != null) {
                        kotlinx.coroutines.flow.FlowKt.launchIn(onEach2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n);
                    }
                    bannerImpl2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.getBannerImpl();
                    if (bannerImpl2 != null) {
                        kotlinx.coroutines.flow.FlowKt.launchIn(onEach, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.n);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c3445b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this;
                    c3445b2.setAdShowListener(c3445b2.getAdShowListener());
                    return kotlin.Unit.INSTANCE;
                }
            }
            cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.c(continuation);
            java.lang.Object obj2 = cVar.b;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = cVar.d;
            if (i != 0) {
            }
            creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj2;
            switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a.C0224a.f7420a[creativeType.ordinal()]) {
            }
            bannerImpl = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.getBannerImpl();
            if (bannerImpl != null) {
            }
            bannerImpl2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.getBannerImpl();
            if (bannerImpl2 != null) {
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b c3445b22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this;
            c3445b22.setAdShowListener(c3445b22.getAdShowListener());
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$destroy$1", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$b, reason: collision with other inner class name */
    public static final class C0228b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7428a;

        public C0228b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.C0228b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.C0228b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.new C0228b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7428a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.super.destroy();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.this.getBannerImpl();
            if (bannerImpl != null) {
                bannerImpl.destroy();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3445b(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar, com.moloco.sdk.internal.ortb.model.C3415e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.A viewLifecycleOwner, kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker) {
        super(context, scope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.h = context;
        this.i = bid;
        this.j = options;
        this.k = externalLinkHandler;
        this.l = watermark;
        this.m = viewLifecycleOwner;
        this.n = scope;
        this.o = clickthroughService;
        this.p = buttonTracker;
        this.q = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.r = iVar;
        this.w = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.a(customUserEventBuilderService);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.x = MutableStateFlow;
        this.y = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<?> getBannerImpl() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> b = this.t;
        if (b != null) {
            return b;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> b2 = this.u;
        return b2 == null ? this.v : b2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.n, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b.C0228b(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b getAdLoader() {
        return this.w;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g getAdShowListener() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return this.y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void setAdShowListener(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.s = gVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> b = this.t;
        if (b != null) {
            b.setAdShowListener(gVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> b2 = this.u;
        if (b2 == null) {
            b2 = this.v;
        }
        if (b2 != null) {
            b2.setAdShowListener(gVar);
        }
    }
}
