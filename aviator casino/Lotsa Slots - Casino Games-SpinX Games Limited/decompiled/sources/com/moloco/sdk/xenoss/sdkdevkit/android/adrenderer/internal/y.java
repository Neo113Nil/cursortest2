package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class y implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f7972a;
    public final com.moloco.sdk.internal.ortb.model.C3415e b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m c;
    public final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, java.lang.Object> d;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> e;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> f;
    public com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> g;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1", f = "MraidAdLoad.kt", i = {0}, l = {60, 80}, m = "invokeSuspend", n = {"decDeferred"}, s = {"L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7973a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a e;
        public final /* synthetic */ long f;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1", f = "MraidAdLoad.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$a, reason: collision with other inner class name */
        public static final class C0322a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7974a;
            public final /* synthetic */ long b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y d;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1$1", f = "MraidAdLoad.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$a$a, reason: collision with other inner class name */
            public static final class C0323a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public java.lang.Object f7975a;
                public int b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0323a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y yVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a.C0323a> continuation) {
                    super(2, continuation);
                    this.c = c3453i;
                    this.d = yVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a.C0323a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a.C0323a(this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i;
                    com.moloco.sdk.internal.ortb.model.C3416f ext;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i2 = this.c;
                        java.lang.String str = null;
                        if (c3453i2 == null) {
                            return null;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y yVar = this.d;
                        try {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m interfaceC3457m = yVar.c;
                            com.moloco.sdk.internal.ortb.model.C3415e c3415e = yVar.b;
                            if (c3415e != null && (ext = c3415e.getExt()) != null) {
                                str = ext.getMtid();
                            }
                            this.f7975a = c3453i2;
                            this.b = 1;
                            java.lang.Object a2 = interfaceC3457m.a(c3453i2, str, this);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c3453i = c3453i2;
                            obj = a2;
                        } catch (java.lang.Exception unused) {
                            return c3453i2;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c3453i = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) this.f7975a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.lang.Exception unused2) {
                            return c3453i;
                        }
                    }
                    return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0322a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y yVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c3453i;
                this.d = yVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7974a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a.C0323a c0323a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a.C0323a(this.c, this.d, null);
                    this.f7974a = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(j, c0323a, this);
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

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1", f = "MraidAdLoad.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7976a;
            public final /* synthetic */ long b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y c;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1$1", f = "MraidAdLoad.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$b$a, reason: collision with other inner class name */
            public static final class C0324a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7977a;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0324a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y yVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b.C0324a> continuation) {
                    super(2, continuation);
                    this.b = yVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b.C0324a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b.C0324a(this.b, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f7977a;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.functions.Function1 function1 = this.b.d;
                        this.f7977a = 1;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y yVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = yVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7976a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b.C0324a c0324a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b.C0324a(this.c, null);
                    this.f7976a = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(j, c0324a, this);
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
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this.new a(this.e, this.f, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0103  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Deferred async$default;
            kotlinx.coroutines.Deferred async$default2;
            kotlinx.coroutines.Deferred deferred;
            com.moloco.sdk.internal.ortb.model.C3416f ext;
            com.moloco.sdk.internal.ortb.model.z player;
            com.moloco.sdk.internal.ortb.model.l dec;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y yVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.c;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this.a() instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar3 = this.e;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.b(this.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this, null), 3, null);
                com.moloco.sdk.internal.ortb.model.C3415e c3415e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this.b;
                async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.C0322a(this.f, (c3415e == null || (ext = c3415e.getExt()) == null || (player = ext.getPlayer()) == null || (dec = player.getDec()) == null) ? null : com.moloco.sdk.internal.l.a(dec), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this, null), 3, null);
                try {
                    this.c = async$default2;
                    this.b = 1;
                    java.lang.Object await = async$default.await(this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deferred = async$default2;
                    obj = await;
                } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
                    deferred = async$default2;
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this.a(new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e));
                    aVar = this.e;
                    if (aVar != null) {
                        aVar.a(aVar4);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) this.f7973a;
                    yVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    yVar.a(new com.moloco.sdk.internal.v.b(cVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) obj)));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this.e.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    aVar2 = this.e;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                deferred = (kotlinx.coroutines.Deferred) this.c;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (kotlinx.coroutines.TimeoutCancellationException unused2) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar42 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this.a(new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e));
                    aVar = this.e;
                    if (aVar != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) obj;
            if (vVar == null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar5 = this.e;
                if (aVar5 != null) {
                    aVar5.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.c);
                }
            } else if (vVar instanceof com.moloco.sdk.internal.v.a) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar6 = this.e;
                if (aVar6 != null) {
                    aVar6.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.v.a) vVar).a());
                }
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            } else {
                if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y yVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((com.moloco.sdk.internal.v.b) vVar).a();
                this.c = yVar2;
                this.f7973a = cVar2;
                this.b = 2;
                java.lang.Object await2 = deferred.await(this);
                if (await2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
                obj = await2;
                yVar = yVar2;
                yVar.a(new com.moloco.sdk.internal.v.b(cVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) obj)));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.this.e.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                aVar2 = this.e;
                if (aVar2 != null) {
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.internal.ortb.model.C3415e c3415e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m decLoader, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, ? extends java.lang.Object> loadAndReadyMraid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAndReadyMraid, "loadAndReadyMraid");
        this.f7972a = scope;
        this.b = c3415e;
        this.c = decLoader;
        this.d = loadAndReadyMraid;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        this.g = new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
        return this.f;
    }

    public final com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a() {
        return this.g;
    }

    public final void a(com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> vVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.g = vVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f7972a, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a(aVar, j, null), 3, null);
    }
}
