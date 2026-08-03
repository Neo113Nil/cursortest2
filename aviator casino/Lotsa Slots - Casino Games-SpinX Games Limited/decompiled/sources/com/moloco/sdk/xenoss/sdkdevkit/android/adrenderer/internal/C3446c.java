package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3446c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public static final int t = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7429a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;
    public final com.moloco.sdk.internal.ortb.model.C3415e c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y e;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder f;
    public final java.lang.String g;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i h;
    public final kotlinx.coroutines.CoroutineScope i;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> j;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> l;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v m;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> n;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> o;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> p;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> q;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> s;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7430a;

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
            f7430a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$load$1", f = "AggregatedFullscreenAd.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b */
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7431a;
        public final /* synthetic */ long c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a */
        public static final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a f7432a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c b;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0229a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f7433a;

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
                    f7433a = iArr;
                }
            }

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c c3446c) {
                this.f7432a = aVar;
                this.b = c3446c;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
            public void a() {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar = this.f7432a;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType = this.b.getCreativeType();
                switch (creativeType == null ? -1 : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.b.a.C0229a.f7433a[creativeType.ordinal()]) {
                    case -1:
                        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b.g, "creativeType is null", null, false, 12, null);
                        return;
                    case 0:
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                    case 1:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar = this.f7432a;
                        if (aVar != null) {
                            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.e);
                            return;
                        }
                        return;
                    case 2:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar2 = this.f7432a;
                        if (aVar2 != null) {
                            aVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f);
                            return;
                        }
                        return;
                    case 3:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar3 = this.f7432a;
                        if (aVar3 != null) {
                            aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.g);
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                    case 6:
                        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b.g, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                        return;
                    case 7:
                        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b.g, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                        return;
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalError, "internalError");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar = this.f7432a;
                if (aVar != null) {
                    aVar.a(internalError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7431a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c c3446c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this;
                this.f7431a = 1;
                if (c3446c.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l n = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.n();
            if (n != null) {
                n.a(this.c, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.b.a(this.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this));
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd", f = "AggregatedFullscreenAd.kt", i = {0}, l = {69}, m = "prepareAd", n = {"this"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$c, reason: collision with other inner class name */
    public static final class C0230c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7434a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public C0230c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.C0230c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$2", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$d */
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7435a;
        public /* synthetic */ boolean b;

        public d(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.d> continuation) {
            super(2, continuation);
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.d) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.new d(continuation);
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
            if (this.f7435a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.n.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b));
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$3", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$e */
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7436a;
        public /* synthetic */ boolean b;

        public e(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.e> continuation) {
            super(2, continuation);
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.e) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.e eVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.new e(continuation);
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
            if (this.f7436a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.p.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b));
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$4", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$f */
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7437a;
        public /* synthetic */ boolean b;

        public f(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.f> continuation) {
            super(2, continuation);
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.f) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.f fVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.new f(continuation);
            fVar.b = ((java.lang.Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7437a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.r.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b));
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$crType$1", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$g */
    public static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7438a;

        public g(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.g) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7438a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h.f7458a.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this.c.getAdm());
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c c3446c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.this;
            c3446c.h = c;
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, c3446c.g, "Native ad resolved creativeType: " + c, false, 4, null);
            return c;
        }
    }

    public C3446c(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar, com.moloco.sdk.internal.ortb.model.C3415e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7429a = context;
        this.b = customUserEventBuilderService;
        this.c = bid;
        this.d = externalLinkHandler;
        this.e = watermark;
        this.f = metricsRecorder;
        this.g = "AggregatedFullscreenAd";
        this.h = iVar;
        this.i = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.n = MutableStateFlow;
        this.o = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.p = MutableStateFlow2;
        this.q = MutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.r = MutableStateFlow3;
        this.s = MutableStateFlow3;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.i, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n = n();
        if (n != null) {
            n.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
        return this.o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> k() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return this.q;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> lVar = this.j;
        if (lVar != null) {
            return lVar;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar2 = this.k;
        return lVar2 == null ? this.l : lVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.C0230c c0230c;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c c3446c;
        com.moloco.sdk.internal.ortb.model.y mute;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n3;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> k;
        kotlinx.coroutines.flow.Flow onEach;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l;
        kotlinx.coroutines.flow.Flow onEach2;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded;
        kotlinx.coroutines.flow.Flow onEach3;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.C0230c) {
            c0230c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.C0230c) continuation;
            int i2 = c0230c.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0230c.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c0230c.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0230c.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    creativeType = getCreativeType();
                    if (creativeType != null) {
                        c3446c = this;
                        switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.a.f7430a[creativeType.ordinal()]) {
                            case 1:
                                c3446c.j = c3446c.m.a(c3446c.f7429a, c3446c.c, com.moloco.sdk.service_locator.a.g.f7348a.b().h(), c3446c.e, c3446c.f);
                                break;
                            case 2:
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v vVar = c3446c.m;
                                android.content.Context context = c3446c.f7429a;
                                kotlinx.coroutines.CoroutineScope coroutineScope = c3446c.i;
                                com.moloco.sdk.internal.ortb.model.C3415e c3415e = c3446c.c;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar = c3446c.d;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar = c3446c.e;
                                kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = c3446c.p;
                                com.moloco.sdk.internal.ortb.model.z player = c3415e.getExt().getPlayer();
                                c3446c.k = vVar.a(context, coroutineScope, c3415e, rVar, yVar, mutableStateFlow, (player == null || (mute = player.getMute()) == null) ? false : mute.getMute(), c3446c.f);
                                break;
                            case 3:
                                c3446c.l = c3446c.m.a(c3446c.f7429a, c3446c.b, c3446c.c.getAdm(), c3446c.d, c3446c.e);
                                break;
                            case 4:
                            case 5:
                            case 6:
                                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, c3446c.g, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                                break;
                            case 7:
                                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, c3446c.g, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                                break;
                            default:
                                throw new kotlin.NoWhenBranchMatchedException();
                        }
                        n = c3446c.n();
                        if (n != null && (isLoaded = n.isLoaded()) != null && (onEach3 = kotlinx.coroutines.flow.FlowKt.onEach(isLoaded, c3446c.new d(null))) != null) {
                            kotlinx.coroutines.flow.FlowKt.launchIn(onEach3, c3446c.i);
                        }
                        n2 = c3446c.n();
                        if (n2 != null && (l = n2.l()) != null && (onEach2 = kotlinx.coroutines.flow.FlowKt.onEach(l, c3446c.new e(null))) != null) {
                            kotlinx.coroutines.flow.FlowKt.launchIn(onEach2, c3446c.i);
                        }
                        n3 = c3446c.n();
                        if (n3 != null && (k = n3.k()) != null && (onEach = kotlinx.coroutines.flow.FlowKt.onEach(k, c3446c.new f(null))) != null) {
                            kotlinx.coroutines.flow.FlowKt.launchIn(onEach, c3446c.i);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.coroutines.CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.g(null);
                    c0230c.f7434a = this;
                    c0230c.d = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, gVar, c0230c);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c3446c = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3446c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c) c0230c.f7434a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj;
                switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.a.f7430a[creativeType.ordinal()]) {
                }
                n = c3446c.n();
                if (n != null) {
                    kotlinx.coroutines.flow.FlowKt.launchIn(onEach3, c3446c.i);
                }
                n2 = c3446c.n();
                if (n2 != null) {
                    kotlinx.coroutines.flow.FlowKt.launchIn(onEach2, c3446c.i);
                }
                n3 = c3446c.n();
                if (n3 != null) {
                    kotlinx.coroutines.flow.FlowKt.launchIn(onEach, c3446c.i);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c0230c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.C0230c(continuation);
        java.lang.Object obj2 = c0230c.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0230c.d;
        if (i != 0) {
        }
        creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj2;
        switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.a.f7430a[creativeType.ordinal()]) {
        }
        n = c3446c.n();
        if (n != null) {
        }
        n2 = c3446c.n();
        if (n2 != null) {
        }
        n3 = c3446c.n();
        if (n3 != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.i, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c.b(j, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> lVar = this.j;
        if (lVar != null) {
            lVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x>) options.c(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x) gVar);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar2 = this.k;
        if (lVar2 != null) {
            lVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f>) options.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) gVar);
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar3 = this.l;
        if (lVar3 != null) {
            lVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f>) options.b(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) gVar);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || gVar == null) {
            return;
        }
        gVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.f7442a);
        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
    }
}
