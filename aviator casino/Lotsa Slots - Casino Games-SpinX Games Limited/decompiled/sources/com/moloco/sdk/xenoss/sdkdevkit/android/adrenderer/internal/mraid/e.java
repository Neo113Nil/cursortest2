package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    public static final int n = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7498a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r b;
    public kotlin.jvm.functions.Function0<kotlin.Unit> c;
    public kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> d;
    public kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, kotlin.Unit> e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;
    public final boolean g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f h;
    public final java.lang.String i;
    public final kotlinx.coroutines.CoroutineScope j;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t l;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u m;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$loadAndReadyMraid$2", f = "MraidBaseAd.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7499a;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7499a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f I = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.I();
                java.lang.String str = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.f7498a;
                this.f7499a = 1;
                obj = I.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) obj;
            boolean z = vVar instanceof com.moloco.sdk.internal.v.a;
            if (z) {
                return vVar;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f I2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.I();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e eVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this;
            I2.a(false, false, false, false, true);
            I2.a(eVar.b);
            I2.a(eVar.m.l().getValue().booleanValue());
            I2.a(eVar.m.k().getValue().a());
            eVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t.c);
            eVar.W();
            eVar.X();
            eVar.Y();
            I2.j();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e eVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this;
            if (vVar instanceof com.moloco.sdk.internal.v.b) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar2.i, "Mraid Html data successfully loaded", null, false, 12, null);
                cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((com.moloco.sdk.internal.v.b) vVar).a();
            } else {
                if (!z) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar2.i, "Mraid Html data load failed.", null, false, 12, null);
                cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c(null, 1, null);
            }
            eVar2.k = cVar;
            return vVar;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToErrors$1", f = "MraidBaseAd.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7500a;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7501a;

            static {
                int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.values().length];
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.c.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.b.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f7501a = iArr;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToErrors$1$error$1", f = "MraidBaseAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$b$b, reason: collision with other inner class name */
        public static final class C0238b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7502a;
            public /* synthetic */ java.lang.Object b;

            public C0238b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b.C0238b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b.C0238b) create(dVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b.C0238b c0238b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b.C0238b(continuation);
                c0238b.b = obj;
                return c0238b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7502a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.b) != null);
            }
        }

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7500a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> w = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.I().w();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b.C0238b c0238b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b.C0238b(null);
                this.f7500a = 1;
                obj = kotlinx.coroutines.flow.FlowKt.first(w, c0238b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
            if (dVar != null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e eVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this;
                int i2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b.a.f7501a[eVar.b.ordinal()];
                if (i2 == 1) {
                    eVar.S().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                } else {
                    if (i2 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    eVar.S().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.a(dVar));
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToMraidJsCommands$1", f = "MraidBaseAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7503a;
        public /* synthetic */ java.lang.Object b;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n nVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.c) create(nVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7503a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n) this.b;
            if (kotlin.jvm.internal.Intrinsics.areEqual(nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.a.i)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.U();
            } else if (nVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.d) nVar);
            } else if (!(nVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f)) {
                if (nVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.c) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.c) nVar);
                } else {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.I().a(nVar, "unsupported command: " + nVar.a());
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToVisualMetricsChanges$1", f = "MraidBaseAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7504a;
        public /* synthetic */ boolean b;

        public d(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.d> continuation) {
            super(2, continuation);
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.d) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.new d(continuation);
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
            if (this.f7504a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.I().a(this.b);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToVisualMetricsChanges$2", f = "MraidBaseAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$e, reason: collision with other inner class name */
    public static final class C0239e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7505a;
        public /* synthetic */ java.lang.Object b;

        public C0239e(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.C0239e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a aVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.C0239e) create(aVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.C0239e c0239e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.new C0239e(continuation);
            c0239e.b = obj;
            return c0239e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7505a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.this.I().a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a) this.b).a());
            return kotlin.Unit.INSTANCE;
        }
    }

    public e(android.content.Context context, java.lang.String adm, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r mraidPlacementType, kotlin.jvm.functions.Function0<kotlin.Unit> onShowListenerClick, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickthroughClick, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, kotlin.Unit> onError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f mraidBridge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidPlacementType, "mraidPlacementType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClickthroughClick, "onClickthroughClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidBridge, "mraidBridge");
        this.f7498a = adm;
        this.b = mraidPlacementType;
        this.c = onShowListenerClick;
        this.d = onClickthroughClick;
        this.e = onError;
        this.f = externalLinkHandler;
        this.g = z;
        this.h = mraidBridge;
        this.i = "MraidBaseAd";
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.j = CoroutineScope;
        this.m = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u(mraidBridge.c(), context, CoroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit l() {
        return kotlin.Unit.INSTANCE;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f I() {
        return this.h;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> J() {
        return this.d;
    }

    public final kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, kotlin.Unit> S() {
        return this.e;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> T() {
        return this.c;
    }

    public final void U() {
        if (this.m.l().getValue().booleanValue()) {
            s();
        } else {
            this.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.a.i, "Can't close ad when mraid container is not visible to the user");
        }
    }

    public void V() {
    }

    public final void W() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b(null), 3, null);
    }

    public final void X() {
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.h.v(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.c(null)), this.j);
    }

    public final void Y() {
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.m.l(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.d(null)), this.j);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.m.k(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.C0239e(null)), this.j);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.j, null, 1, null);
        this.h.destroy();
        this.m.destroy();
    }

    public void s() {
        if (this.l == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t.e) {
            b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t.c);
        }
    }

    public static final kotlin.Unit b(java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.Unit.INSTANCE;
    }

    public final void b(kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.e = function1;
    }

    public final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t tVar) {
        this.l = tVar;
        if (tVar != null) {
            this.h.a(tVar);
        }
    }

    public final void a(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.c = function0;
    }

    public final java.lang.Object b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
        kotlinx.coroutines.Deferred async$default;
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.j, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.a(null), 3, null);
        return async$default.await(continuation);
    }

    public final void a(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.d = function1;
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.Unit.INSTANCE;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.d dVar) {
        if (this.m.l().getValue().booleanValue()) {
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1 = this.d;
            java.lang.String uri = dVar.b().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            function1.invoke(uri);
            return;
        }
        this.h.a(dVar, "Can't open links when mraid container is not visible to the user");
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.c cVar) {
        if (this.g) {
            this.h.a(cVar, "expand() is force blocked for the current ad");
            return;
        }
        if (!this.m.l().getValue().booleanValue()) {
            this.h.a(cVar, "Can't expand() when mraid container is not visible to the user");
            return;
        }
        if (this.l != com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t.c) {
            this.h.a(cVar, "In order to expand() mraid ad, container must be in Default view state");
            return;
        }
        if (this.b == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.c) {
            this.h.a(cVar, "expand() is not supported for interstitials");
        } else if (cVar.b() != null) {
            this.h.a(cVar, "Two-part expand is not supported yet");
        } else {
            V();
            b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t.e);
        }
    }

    public /* synthetic */ e(android.content.Context context, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r rVar, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar2, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f fVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, rVar, (i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit l;
                l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.l();
                return l;
            }
        } : function0, (i & 16) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.b((java.lang.String) obj);
            }
        } : function1, (i & 32) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            }
        } : function12, rVar2, (i & 128) != 0 ? false : z, fVar);
    }
}
