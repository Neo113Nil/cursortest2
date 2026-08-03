package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class J implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.a s = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.a(null);
    public static final int t = 8;
    public static final java.lang.String u = "TemplateFullscreenAd";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7382a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i d;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder e;
    public final kotlinx.coroutines.CoroutineScope f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j k;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c l;
    public final java.util.Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a n;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i o;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> p;
    public final kotlin.Lazy q;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$isAdDisplaying$2$1", f = "TemplateFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7383a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.b> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object a(boolean z, boolean z2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.b(continuation);
            bVar.b = z;
            bVar.c = z2;
            return bVar.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7383a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            boolean z2 = this.c;
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("isAdDisplaying final: ");
            sb.append(z && z2);
            sb.append(", _isAdDisplaying: ");
            sb.append(z);
            sb.append(", webViewIsDisplaying: ");
            sb.append(z2);
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.u, sb.toString(), null, false, 12, null);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z && z2);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1", f = "TemplateFullscreenAd.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7384a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d d;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$1", f = "TemplateFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7385a;
            public final /* synthetic */ java.util.List<kotlinx.coroutines.Job> b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(java.util.List<? extends kotlinx.coroutines.Job> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J j, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.a> continuation) {
                super(2, continuation);
                this.b = list;
                this.c = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.a) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7385a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.Iterator<T> it = this.b.iterator();
                while (it.hasNext()) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.u, "Calling close()", null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.INSTANCE.a();
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J j = this.c;
                handler.postDelayed(new java.lang.Runnable() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.this);
                    }
                }, 1000L);
                return kotlin.Unit.INSTANCE;
            }

            public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J j) {
                j.destroy();
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$1", f = "TemplateFullscreenAd.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7386a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d c;

            public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d f7387a;

                public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d dVar) {
                    this.f7387a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    this.f7387a.b();
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d dVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.b> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7386a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> c = this.b.i.c();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.b.a(this.c);
                    this.f7386a = 1;
                    if (c.collect(aVar, this) == coroutine_suspended) {
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

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$2", f = "TemplateFullscreenAd.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$c, reason: collision with other inner class name */
        public static final class C0217c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7388a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$c$a */
            public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d f7389a;

                public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d dVar) {
                    this.f7389a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    this.f7389a.a();
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0217c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d dVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.C0217c> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.C0217c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.C0217c(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7388a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> c = this.b.k.c();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.C0217c.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.C0217c.a(this.c);
                    this.f7388a = 1;
                    if (c.collect(aVar, this) == coroutine_suspended) {
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

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$3", f = "TemplateFullscreenAd.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7390a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d c;

            public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d f7391a;

                public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d dVar) {
                    this.f7391a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    this.f7391a.a();
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d dVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.d> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.d(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7390a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> c = this.b.l.c();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.d.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.d.a(this.c);
                    this.f7390a = 1;
                    if (c.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d dVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c> continuation) {
            super(2, continuation);
            this.d = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.this.new c(this.d, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Job launch$default;
            kotlinx.coroutines.Job launch$default2;
            kotlinx.coroutines.Job launch$default3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7384a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.this, this.d, null), 3, null);
                launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.C0217c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.this, this.d, null), 3, null);
                launch$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.this, this.d, null), 3, null);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.Job[]{launch$default, launch$default2, launch$default3});
                kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.this.g.c();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c.a(listOf, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.this, null);
                this.f7384a = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(c, aVar, this) == coroutine_suspended) {
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

    public J(android.content.Context context, java.lang.String adm, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7382a = context;
        this.b = watermark;
        this.c = externalLinkHandler;
        this.d = persistentHttpRequest;
        this.e = metricsRecorder;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.f = CoroutineScope;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d(CoroutineScope);
        this.g = dVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i(CoroutineScope);
        this.h = iVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b(clickthroughService, CoroutineScope);
        this.i = bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h(CoroutineScope);
        this.j = hVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j(CoroutineScope);
        this.k = jVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(CoroutineScope);
        this.l = cVar;
        java.util.Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a[]{dVar, bVar, iVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(metricsRecorder), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g(externalLinkHandler), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f(persistentHttpRequest), hVar, jVar, cVar});
        this.m = of;
        this.n = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(context, adm, of, bVar, iVar, hVar, metricsRecorder, z);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h.f7458a.c(adm);
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Template ad resolved creativeType: " + c2, false, 4, null);
        this.o = c2;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.p = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.q = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.this);
            }
        });
        this.r = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
    }

    public static final kotlinx.coroutines.flow.StateFlow e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J j) {
        return kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flowCombine(j.p, j.n.l(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.b(null)), j.f, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "destroy called", null, false, 12, null);
        this.n.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.INSTANCE.a();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
        return this.n.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> k() {
        return this.r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return (kotlinx.coroutines.flow.StateFlow) this.q.getValue();
    }

    public static final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u f7392a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J b;

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J j) {
            this.f7392a = uVar;
            this.b = j;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar = this.f7392a;
            if (uVar != null) {
                uVar.a(internalShowError);
            }
            this.b.destroy();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar = this.f7392a;
            if (uVar != null) {
                uVar.b();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.u, "Skip button shown, triggering listener callback", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar = this.f7392a;
            if (uVar != null) {
                uVar.a();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "fullscreen ad show called", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.d(uVar, this);
        this.b.a(this.n.p());
        this.n.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u) dVar);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.INSTANCE.a(this.f7382a, this.p, this.n, this.e, this.r);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J.c(dVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        this.n.a(j, aVar);
    }

    public /* synthetic */ J(android.content.Context context, java.lang.String str, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, sVar, yVar, rVar, iVar, metricsRecorder, (i & 128) != 0 ? true : z);
    }
}
