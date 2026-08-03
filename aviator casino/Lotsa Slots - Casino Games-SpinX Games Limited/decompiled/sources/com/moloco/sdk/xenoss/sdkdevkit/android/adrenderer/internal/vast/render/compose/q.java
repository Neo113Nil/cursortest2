package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.coroutines.CoroutineContext f7882a = com.moloco.sdk.internal.scheduling.b.a().getMain();

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$1", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7883a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> c;
        public final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e e;
        public final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> f;
        public final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a> continuation) {
            super(2, continuation);
            this.c = mutableState;
            this.d = mutableState2;
            this.e = eVar;
            this.f = state;
            this.g = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a) create(aVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(this.c, this.d, this.e, this.f, this.g, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7883a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(this.f).invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(aVar.e()));
            this.c.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(aVar.e()));
            this.d.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(aVar.d()));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b(this.g).invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(aVar.f()));
            android.view.View N = this.e.N();
            if (N != null) {
                N.setKeepScreenOn(aVar.d());
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$2", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7884a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, kotlin.Unit>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b> continuation) {
            super(2, continuation);
            this.c = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b) create(iVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b(this.c, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7884a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.c(this.c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) this.b);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$3", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7885a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, kotlin.Unit>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.c> continuation) {
            super(2, continuation);
            this.c = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.c) create(lVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.c(this.c, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7885a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d(this.c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) this.b);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$2$1", f = "VastVideoPlayer.kt", i = {0, 1}, l = {114, 116}, m = "invokeSuspend", n = {com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY}, s = {"L$0", "L$0"})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7886a;
        public int b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d> continuation) {
            super(2, continuation);
            this.c = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d(this.c, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            android.view.View N;
            android.view.View view;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                N = this.c.N();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.c;
                if (N != null) {
                    N.setVisibility(4);
                }
                this.f7886a = N;
                this.b = 1;
                if (eVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    view = (android.view.View) this.f7886a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (view != null) {
                        view.setVisibility(4);
                    }
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                android.view.View view2 = (android.view.View) this.f7886a;
                kotlin.ResultKt.throwOnFailure(obj);
                N = view2;
            }
            if (N != null) {
                N.setVisibility(0);
            }
            this.f7886a = N;
            this.b = 2;
            if (kotlinx.coroutines.DelayKt.delay(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            view = N;
            if (view != null) {
            }
            if (view != null) {
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$3$1", f = "VastVideoPlayer.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7887a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> e;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$3$1$1", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7888a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ java.lang.String c;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> d;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> mVar2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e.a> continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = str;
                this.d = mVar;
                this.e = mVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e.a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7888a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.b;
                java.lang.String str = this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> mVar = this.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> mVar2 = this.e;
                eVar.a(str);
                eVar.seekTo(mVar.a().longValue());
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b(eVar, mVar2);
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> mVar2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e> continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = str;
            this.d = mVar;
            this.e = mVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7887a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.CoroutineContext coroutineContext = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f7882a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e.a(this.b, this.c, this.d, this.e, null);
                this.f7887a = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$4$1", f = "VastVideoPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7889a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> c;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$4$1$1", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7890a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> mVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f.a> continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = mVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f.a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7890a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b(this.b, this.c);
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> mVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f> continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7889a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.CoroutineContext coroutineContext = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f7882a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f.a(this.b, this.c, null);
                this.f7889a = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$5$1", f = "VastVideoPlayer.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7891a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ boolean c;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$5$1$1", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7892a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, boolean z, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g.a> continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = z;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g.a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7892a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.b.b(this.c);
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, boolean z, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g> continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7891a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.CoroutineContext coroutineContext = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f7882a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g.a(this.b, this.c, null);
                this.f7891a = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
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

    public static final class h implements androidx.compose.runtime.DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.List f7893a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ androidx.compose.runtime.State c;

        public h(java.util.List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, androidx.compose.runtime.State state) {
            this.f7893a = list;
            this.b = eVar;
            this.c = state;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            java.util.Iterator it = this.f7893a.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.b.destroy();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(this.c).invoke(java.lang.Boolean.FALSE);
        }
    }

    public static final kotlin.Unit a(java.lang.String str, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar2, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q q, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, androidx.compose.ui.Modifier modifier, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        a(str, z, mVar, mVar2, z2, function1, function12, q, function13, function14, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.runtime.MutableState b() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
    }

    public static final androidx.compose.runtime.MutableState c() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
    }

    public static final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> mVar) {
        if (mVar.a().booleanValue()) {
            eVar.play();
        } else {
            eVar.pause();
        }
    }

    public static final kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, kotlin.Unit> c(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, kotlin.Unit>> state) {
        return (kotlin.jvm.functions.Function1) state.getValue();
    }

    public static final kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, kotlin.Unit> d(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, kotlin.Unit>> state) {
        return (kotlin.jvm.functions.Function1) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final java.lang.String uri, final boolean z, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> play, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> seekToMillis, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> isPlaying, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> isVisible, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, final kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, kotlin.Unit> onProgressChanged, final kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, kotlin.Unit> onError, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean changed;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer.Companion companion;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        boolean changedInstance;
        java.lang.Object rememberedValue5;
        boolean changedInstance2;
        java.lang.Object rememberedValue6;
        boolean changedInstance3;
        java.lang.Object rememberedValue7;
        int i10;
        int i11;
        androidx.compose.runtime.Composer composer2;
        int i12;
        boolean changedInstance4;
        java.lang.Object rememberedValue8;
        boolean changedInstance5;
        java.lang.Object rememberedValue9;
        final android.view.View N;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(play, "play");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seekToMillis, "seekToMillis");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isVisible, "isVisible");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "onError");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(32444032);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(uri) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(play) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(seekToMillis) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(isPlaying) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            i15 = (1572864 & i) == 0 ? startRestartGroup.changedInstance(isVisible) ? 1048576 : 524288 : 1572864;
            if ((i3 & 128) == 0) {
                i5 = 12582912;
            } else {
                if ((12582912 & i) == 0) {
                    i5 = (16777216 & i) == 0 ? startRestartGroup.changed(viewVisibilityTracker) : startRestartGroup.changedInstance(viewVisibilityTracker) ? 8388608 : 4194304;
                }
                if ((i3 & 256) == 0) {
                    i14 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(onProgressChanged) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((i3 & 512) != 0) {
                        i13 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(onError) ? 536870912 : 268435456 : 805306368;
                        i6 = i3 & 1024;
                        if (i6 != 0) {
                            i8 = i2 | 6;
                        } else {
                            if ((i2 & 6) != 0) {
                                i7 = i2;
                                if ((i4 & 306783379) != 306783378 && (i7 & 3) == 2 && startRestartGroup.getSkipping()) {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    composer2 = startRestartGroup;
                                } else {
                                    androidx.compose.ui.Modifier modifier3 = i6 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(32444032, i4, i7, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayer (VastVideoPlayer.kt:48)");
                                    }
                                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                                    androidx.lifecycle.Lifecycle lifecycle = ((androidx.lifecycle.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                                    startRestartGroup.startReplaceableGroup(-794102752);
                                    i9 = i7;
                                    changed = startRestartGroup.changed(context) | ((i4 & 112) != 32) | startRestartGroup.changed(lifecycle);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context, z, com.moloco.sdk.service_locator.a.g.f7348a.a(), lifecycle, com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                                    startRestartGroup.endReplaceableGroup();
                                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a();
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(773894976);
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    companion = androidx.compose.runtime.Composer.INSTANCE;
                                    if (rememberedValue2 == companion.getEmpty()) {
                                        rememberedValue2 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope((kotlin.coroutines.CoroutineContext) function0.invoke(), startRestartGroup));
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                    startRestartGroup.endReplaceableGroup();
                                    final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i4 >> 15) & 14);
                                    final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i4 >> 18) & 14);
                                    java.lang.Object[] objArr = new java.lang.Object[0];
                                    startRestartGroup.startReplaceableGroup(-794070732);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == companion.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b();
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 3072, 6);
                                    java.lang.Object[] objArr2 = new java.lang.Object[0];
                                    startRestartGroup.startReplaceableGroup(-794067820);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == companion.getEmpty()) {
                                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.c();
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 3072, 6);
                                    final androidx.compose.runtime.State rememberUpdatedState3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i4 >> 24) & 14);
                                    final androidx.compose.runtime.State rememberUpdatedState4 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i4 >> 27) & 14);
                                    startRestartGroup.startReplaceableGroup(-794060174);
                                    changedInstance = startRestartGroup.changedInstance(fVar) | startRestartGroup.changed(rememberUpdatedState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(rememberUpdatedState2) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(rememberUpdatedState3) | startRestartGroup.changed(rememberUpdatedState4);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!changedInstance || rememberedValue5 == companion.getEmpty()) {
                                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope, mutableState2, mutableState, rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, (androidx.compose.runtime.DisposableEffectScope) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.runtime.EffectsKt.DisposableEffect(fVar, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-794023404);
                                    changedInstance2 = startRestartGroup.changedInstance(fVar);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changedInstance2 || rememberedValue6 == companion.getEmpty()) {
                                        rememberedValue6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d(fVar, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                                    startRestartGroup.startReplaceableGroup(-794011885);
                                    int i16 = i4 & 896;
                                    changedInstance3 = startRestartGroup.changedInstance(fVar) | ((i4 & 14) != 4) | ((i4 & 7168) != 2048) | (i16 != 256);
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (!changedInstance3 || rememberedValue7 == companion.getEmpty()) {
                                        i10 = 256;
                                        i11 = i4;
                                        composer2 = startRestartGroup;
                                        i12 = i9;
                                        java.lang.Object eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e(fVar, uri, seekToMillis, play, null);
                                        composer2.updateRememberedValue(eVar);
                                        rememberedValue7 = eVar;
                                    } else {
                                        i11 = i4;
                                        composer2 = startRestartGroup;
                                        i12 = i9;
                                        i10 = 256;
                                    }
                                    composer2.endReplaceableGroup();
                                    int i17 = i11 >> 3;
                                    androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar, uri, seekToMillis, (kotlin.jvm.functions.Function2) rememberedValue7, composer2, ((i11 << 3) & 112) | (i17 & 896));
                                    composer2.startReplaceableGroup(-793995218);
                                    changedInstance4 = composer2.changedInstance(fVar) | (i16 != i10);
                                    rememberedValue8 = composer2.rememberedValue();
                                    if (!changedInstance4 || rememberedValue8 == companion.getEmpty()) {
                                        rememberedValue8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f(fVar, play, null);
                                        composer2.updateRememberedValue(rememberedValue8);
                                    }
                                    composer2.endReplaceableGroup();
                                    androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar, play, (kotlin.jvm.functions.Function2) rememberedValue8, composer2, i17 & 112);
                                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z2);
                                    composer2.startReplaceableGroup(-793989594);
                                    changedInstance5 = composer2.changedInstance(fVar) | ((i11 & 57344) == 16384);
                                    rememberedValue9 = composer2.rememberedValue();
                                    if (!changedInstance5 || rememberedValue9 == companion.getEmpty()) {
                                        rememberedValue9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g(fVar, z2, null);
                                        composer2.updateRememberedValue(rememberedValue9);
                                    }
                                    composer2.endReplaceableGroup();
                                    androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar, valueOf, (kotlin.jvm.functions.Function2) rememberedValue9, composer2, (i11 >> 9) & 112);
                                    N = fVar.N();
                                    if (N != null) {
                                        composer2.startReplaceableGroup(-1928429689);
                                        boolean changedInstance6 = composer2.changedInstance(N);
                                        java.lang.Object rememberedValue10 = composer2.rememberedValue();
                                        if (changedInstance6 || rememberedValue10 == companion.getEmpty()) {
                                            rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj) {
                                                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(N, (android.content.Context) obj);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue10);
                                        }
                                        composer2.endReplaceableGroup();
                                        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView((kotlin.jvm.functions.Function1) rememberedValue10, modifier3, null, composer2, (i12 << 3) & 112, 4);
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(uri, z, play, seekToMillis, z2, isPlaying, isVisible, viewVisibilityTracker, onProgressChanged, onError, modifier2, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i8 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
                        }
                        i7 = i8;
                        if ((i4 & 306783379) != 306783378) {
                        }
                        if (i6 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        androidx.lifecycle.Lifecycle lifecycle2 = ((androidx.lifecycle.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                        startRestartGroup.startReplaceableGroup(-794102752);
                        i9 = i7;
                        changed = startRestartGroup.changed(context2) | ((i4 & 112) != 32) | startRestartGroup.changed(lifecycle2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context2, z, com.moloco.sdk.service_locator.a.g.f7348a.a(), lifecycle2, com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a();
                            }
                        };
                        startRestartGroup.startReplaceableGroup(773894976);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        companion = androidx.compose.runtime.Composer.INSTANCE;
                        if (rememberedValue2 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final kotlinx.coroutines.CoroutineScope coroutineScope2 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        final androidx.compose.runtime.State rememberUpdatedState5 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i4 >> 15) & 14);
                        final androidx.compose.runtime.State rememberUpdatedState22 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i4 >> 18) & 14);
                        java.lang.Object[] objArr3 = new java.lang.Object[0];
                        startRestartGroup.startReplaceableGroup(-794070732);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr3, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 3072, 6);
                        java.lang.Object[] objArr22 = new java.lang.Object[0];
                        startRestartGroup.startReplaceableGroup(-794067820);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final androidx.compose.runtime.MutableState mutableState22 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr22, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 3072, 6);
                        final androidx.compose.runtime.State rememberUpdatedState32 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i4 >> 24) & 14);
                        final androidx.compose.runtime.State rememberUpdatedState42 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i4 >> 27) & 14);
                        startRestartGroup.startReplaceableGroup(-794060174);
                        changedInstance = startRestartGroup.changedInstance(fVar2) | startRestartGroup.changed(rememberUpdatedState5) | startRestartGroup.changed(mutableState22) | startRestartGroup.changed(mutableState3) | startRestartGroup.changed(rememberUpdatedState22) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changed(rememberUpdatedState32) | startRestartGroup.changed(rememberUpdatedState42);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope2, mutableState22, mutableState3, rememberUpdatedState5, rememberUpdatedState22, rememberUpdatedState32, rememberUpdatedState42, (androidx.compose.runtime.DisposableEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.DisposableEffect(fVar2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        startRestartGroup.startReplaceableGroup(-794023404);
                        changedInstance2 = startRestartGroup.changedInstance(fVar2);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changedInstance2) {
                        }
                        rememberedValue6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d(fVar2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-794011885);
                        int i162 = i4 & 896;
                        changedInstance3 = startRestartGroup.changedInstance(fVar2) | ((i4 & 14) != 4) | ((i4 & 7168) != 2048) | (i162 != 256);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (changedInstance3) {
                        }
                        i10 = 256;
                        i11 = i4;
                        composer2 = startRestartGroup;
                        i12 = i9;
                        java.lang.Object eVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e(fVar2, uri, seekToMillis, play, null);
                        composer2.updateRememberedValue(eVar2);
                        rememberedValue7 = eVar2;
                        composer2.endReplaceableGroup();
                        int i172 = i11 >> 3;
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar2, uri, seekToMillis, (kotlin.jvm.functions.Function2) rememberedValue7, composer2, ((i11 << 3) & 112) | (i172 & 896));
                        composer2.startReplaceableGroup(-793995218);
                        changedInstance4 = composer2.changedInstance(fVar2) | (i162 != i10);
                        rememberedValue8 = composer2.rememberedValue();
                        if (!changedInstance4) {
                        }
                        rememberedValue8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f(fVar2, play, null);
                        composer2.updateRememberedValue(rememberedValue8);
                        composer2.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar2, play, (kotlin.jvm.functions.Function2) rememberedValue8, composer2, i172 & 112);
                        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z2);
                        composer2.startReplaceableGroup(-793989594);
                        changedInstance5 = composer2.changedInstance(fVar2) | ((i11 & 57344) == 16384);
                        rememberedValue9 = composer2.rememberedValue();
                        if (!changedInstance5) {
                        }
                        rememberedValue9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g(fVar2, z2, null);
                        composer2.updateRememberedValue(rememberedValue9);
                        composer2.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar2, valueOf2, (kotlin.jvm.functions.Function2) rememberedValue9, composer2, (i11 >> 9) & 112);
                        N = fVar2.N();
                        if (N != null) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i4 |= i13;
                    i6 = i3 & 1024;
                    if (i6 != 0) {
                    }
                    i7 = i8;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    if (i6 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    android.content.Context context22 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    androidx.lifecycle.Lifecycle lifecycle22 = ((androidx.lifecycle.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                    startRestartGroup.startReplaceableGroup(-794102752);
                    i9 = i7;
                    changed = startRestartGroup.changed(context22) | ((i4 & 112) != 32) | startRestartGroup.changed(lifecycle22);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context22, z, com.moloco.sdk.service_locator.a.g.f7348a.a(), lifecycle22, com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e fVar22 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    kotlin.jvm.functions.Function0 function022 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a();
                        }
                    };
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    companion = androidx.compose.runtime.Composer.INSTANCE;
                    if (rememberedValue2 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final kotlinx.coroutines.CoroutineScope coroutineScope22 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.runtime.State rememberUpdatedState52 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i4 >> 15) & 14);
                    final androidx.compose.runtime.State rememberUpdatedState222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i4 >> 18) & 14);
                    java.lang.Object[] objArr32 = new java.lang.Object[0];
                    startRestartGroup.startReplaceableGroup(-794070732);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.runtime.MutableState mutableState32 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr32, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 3072, 6);
                    java.lang.Object[] objArr222 = new java.lang.Object[0];
                    startRestartGroup.startReplaceableGroup(-794067820);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.runtime.MutableState mutableState222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 3072, 6);
                    final androidx.compose.runtime.State rememberUpdatedState322 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i4 >> 24) & 14);
                    final androidx.compose.runtime.State rememberUpdatedState422 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i4 >> 27) & 14);
                    startRestartGroup.startReplaceableGroup(-794060174);
                    changedInstance = startRestartGroup.changedInstance(fVar22) | startRestartGroup.changed(rememberUpdatedState52) | startRestartGroup.changed(mutableState222) | startRestartGroup.changed(mutableState32) | startRestartGroup.changed(rememberUpdatedState222) | startRestartGroup.changedInstance(coroutineScope22) | startRestartGroup.changed(rememberUpdatedState322) | startRestartGroup.changed(rememberUpdatedState422);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope22, mutableState222, mutableState32, rememberUpdatedState52, rememberUpdatedState222, rememberUpdatedState322, rememberUpdatedState422, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.DisposableEffect(fVar22, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                    kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-794023404);
                    changedInstance2 = startRestartGroup.changedInstance(fVar22);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d(fVar22, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-794011885);
                    int i1622 = i4 & 896;
                    changedInstance3 = startRestartGroup.changedInstance(fVar22) | ((i4 & 14) != 4) | ((i4 & 7168) != 2048) | (i1622 != 256);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance3) {
                    }
                    i10 = 256;
                    i11 = i4;
                    composer2 = startRestartGroup;
                    i12 = i9;
                    java.lang.Object eVar22 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e(fVar22, uri, seekToMillis, play, null);
                    composer2.updateRememberedValue(eVar22);
                    rememberedValue7 = eVar22;
                    composer2.endReplaceableGroup();
                    int i1722 = i11 >> 3;
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar22, uri, seekToMillis, (kotlin.jvm.functions.Function2) rememberedValue7, composer2, ((i11 << 3) & 112) | (i1722 & 896));
                    composer2.startReplaceableGroup(-793995218);
                    changedInstance4 = composer2.changedInstance(fVar22) | (i1622 != i10);
                    rememberedValue8 = composer2.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f(fVar22, play, null);
                    composer2.updateRememberedValue(rememberedValue8);
                    composer2.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar22, play, (kotlin.jvm.functions.Function2) rememberedValue8, composer2, i1722 & 112);
                    java.lang.Boolean valueOf22 = java.lang.Boolean.valueOf(z2);
                    composer2.startReplaceableGroup(-793989594);
                    changedInstance5 = composer2.changedInstance(fVar22) | ((i11 & 57344) == 16384);
                    rememberedValue9 = composer2.rememberedValue();
                    if (!changedInstance5) {
                    }
                    rememberedValue9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g(fVar22, z2, null);
                    composer2.updateRememberedValue(rememberedValue9);
                    composer2.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar22, valueOf22, (kotlin.jvm.functions.Function2) rememberedValue9, composer2, (i11 >> 9) & 112);
                    N = fVar22.N();
                    if (N != null) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 |= i14;
                if ((i3 & 512) != 0) {
                }
                i4 |= i13;
                i6 = i3 & 1024;
                if (i6 != 0) {
                }
                i7 = i8;
                if ((i4 & 306783379) != 306783378) {
                }
                if (i6 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                android.content.Context context222 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                androidx.lifecycle.Lifecycle lifecycle222 = ((androidx.lifecycle.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                startRestartGroup.startReplaceableGroup(-794102752);
                i9 = i7;
                changed = startRestartGroup.changed(context222) | ((i4 & 112) != 32) | startRestartGroup.changed(lifecycle222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context222, z, com.moloco.sdk.service_locator.a.g.f7348a.a(), lifecycle222, com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                startRestartGroup.updateRememberedValue(rememberedValue);
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e fVar222 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                kotlin.jvm.functions.Function0 function0222 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a();
                    }
                };
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue2 = startRestartGroup.rememberedValue();
                companion = androidx.compose.runtime.Composer.INSTANCE;
                if (rememberedValue2 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final kotlinx.coroutines.CoroutineScope coroutineScope222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.runtime.State rememberUpdatedState522 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i4 >> 15) & 14);
                final androidx.compose.runtime.State rememberUpdatedState2222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i4 >> 18) & 14);
                java.lang.Object[] objArr322 = new java.lang.Object[0];
                startRestartGroup.startReplaceableGroup(-794070732);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.runtime.MutableState mutableState322 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr322, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 3072, 6);
                java.lang.Object[] objArr2222 = new java.lang.Object[0];
                startRestartGroup.startReplaceableGroup(-794067820);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.runtime.MutableState mutableState2222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 3072, 6);
                final androidx.compose.runtime.State rememberUpdatedState3222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i4 >> 24) & 14);
                final androidx.compose.runtime.State rememberUpdatedState4222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i4 >> 27) & 14);
                startRestartGroup.startReplaceableGroup(-794060174);
                changedInstance = startRestartGroup.changedInstance(fVar222) | startRestartGroup.changed(rememberUpdatedState522) | startRestartGroup.changed(mutableState2222) | startRestartGroup.changed(mutableState322) | startRestartGroup.changed(rememberUpdatedState2222) | startRestartGroup.changedInstance(coroutineScope222) | startRestartGroup.changed(rememberUpdatedState3222) | startRestartGroup.changed(rememberUpdatedState4222);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope222, mutableState2222, mutableState322, rememberUpdatedState522, rememberUpdatedState2222, rememberUpdatedState3222, rememberUpdatedState4222, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.DisposableEffect(fVar222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(-794023404);
                changedInstance2 = startRestartGroup.changedInstance(fVar222);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d(fVar222, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-794011885);
                int i16222 = i4 & 896;
                changedInstance3 = startRestartGroup.changedInstance(fVar222) | ((i4 & 14) != 4) | ((i4 & 7168) != 2048) | (i16222 != 256);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance3) {
                }
                i10 = 256;
                i11 = i4;
                composer2 = startRestartGroup;
                i12 = i9;
                java.lang.Object eVar222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e(fVar222, uri, seekToMillis, play, null);
                composer2.updateRememberedValue(eVar222);
                rememberedValue7 = eVar222;
                composer2.endReplaceableGroup();
                int i17222 = i11 >> 3;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar222, uri, seekToMillis, (kotlin.jvm.functions.Function2) rememberedValue7, composer2, ((i11 << 3) & 112) | (i17222 & 896));
                composer2.startReplaceableGroup(-793995218);
                changedInstance4 = composer2.changedInstance(fVar222) | (i16222 != i10);
                rememberedValue8 = composer2.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f(fVar222, play, null);
                composer2.updateRememberedValue(rememberedValue8);
                composer2.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar222, play, (kotlin.jvm.functions.Function2) rememberedValue8, composer2, i17222 & 112);
                java.lang.Boolean valueOf222 = java.lang.Boolean.valueOf(z2);
                composer2.startReplaceableGroup(-793989594);
                changedInstance5 = composer2.changedInstance(fVar222) | ((i11 & 57344) == 16384);
                rememberedValue9 = composer2.rememberedValue();
                if (!changedInstance5) {
                }
                rememberedValue9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g(fVar222, z2, null);
                composer2.updateRememberedValue(rememberedValue9);
                composer2.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar222, valueOf222, (kotlin.jvm.functions.Function2) rememberedValue9, composer2, (i11 >> 9) & 112);
                N = fVar222.N();
                if (N != null) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i4 |= i5;
            if ((i3 & 256) == 0) {
            }
            i4 |= i14;
            if ((i3 & 512) != 0) {
            }
            i4 |= i13;
            i6 = i3 & 1024;
            if (i6 != 0) {
            }
            i7 = i8;
            if ((i4 & 306783379) != 306783378) {
            }
            if (i6 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            android.content.Context context2222 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.lifecycle.Lifecycle lifecycle2222 = ((androidx.lifecycle.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            startRestartGroup.startReplaceableGroup(-794102752);
            i9 = i7;
            changed = startRestartGroup.changed(context2222) | ((i4 & 112) != 32) | startRestartGroup.changed(lifecycle2222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context2222, z, com.moloco.sdk.service_locator.a.g.f7348a.a(), lifecycle2222, com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
            startRestartGroup.updateRememberedValue(rememberedValue);
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e fVar2222 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            kotlin.jvm.functions.Function0 function02222 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a();
                }
            };
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            companion = androidx.compose.runtime.Composer.INSTANCE;
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final kotlinx.coroutines.CoroutineScope coroutineScope2222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.State rememberUpdatedState5222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i4 >> 15) & 14);
            final androidx.compose.runtime.State rememberUpdatedState22222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i4 >> 18) & 14);
            java.lang.Object[] objArr3222 = new java.lang.Object[0];
            startRestartGroup.startReplaceableGroup(-794070732);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.MutableState mutableState3222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr3222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 3072, 6);
            java.lang.Object[] objArr22222 = new java.lang.Object[0];
            startRestartGroup.startReplaceableGroup(-794067820);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.MutableState mutableState22222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr22222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 3072, 6);
            final androidx.compose.runtime.State rememberUpdatedState32222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i4 >> 24) & 14);
            final androidx.compose.runtime.State rememberUpdatedState42222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i4 >> 27) & 14);
            startRestartGroup.startReplaceableGroup(-794060174);
            changedInstance = startRestartGroup.changedInstance(fVar2222) | startRestartGroup.changed(rememberUpdatedState5222) | startRestartGroup.changed(mutableState22222) | startRestartGroup.changed(mutableState3222) | startRestartGroup.changed(rememberUpdatedState22222) | startRestartGroup.changedInstance(coroutineScope2222) | startRestartGroup.changed(rememberUpdatedState32222) | startRestartGroup.changed(rememberUpdatedState42222);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope2222, mutableState22222, mutableState3222, rememberUpdatedState5222, rememberUpdatedState22222, rememberUpdatedState32222, rememberUpdatedState42222, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.DisposableEffect(fVar2222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
            kotlin.Unit unit2222 = kotlin.Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(-794023404);
            changedInstance2 = startRestartGroup.changedInstance(fVar2222);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d(fVar2222, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-794011885);
            int i162222 = i4 & 896;
            changedInstance3 = startRestartGroup.changedInstance(fVar2222) | ((i4 & 14) != 4) | ((i4 & 7168) != 2048) | (i162222 != 256);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance3) {
            }
            i10 = 256;
            i11 = i4;
            composer2 = startRestartGroup;
            i12 = i9;
            java.lang.Object eVar2222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e(fVar2222, uri, seekToMillis, play, null);
            composer2.updateRememberedValue(eVar2222);
            rememberedValue7 = eVar2222;
            composer2.endReplaceableGroup();
            int i172222 = i11 >> 3;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar2222, uri, seekToMillis, (kotlin.jvm.functions.Function2) rememberedValue7, composer2, ((i11 << 3) & 112) | (i172222 & 896));
            composer2.startReplaceableGroup(-793995218);
            changedInstance4 = composer2.changedInstance(fVar2222) | (i162222 != i10);
            rememberedValue8 = composer2.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f(fVar2222, play, null);
            composer2.updateRememberedValue(rememberedValue8);
            composer2.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar2222, play, (kotlin.jvm.functions.Function2) rememberedValue8, composer2, i172222 & 112);
            java.lang.Boolean valueOf2222 = java.lang.Boolean.valueOf(z2);
            composer2.startReplaceableGroup(-793989594);
            changedInstance5 = composer2.changedInstance(fVar2222) | ((i11 & 57344) == 16384);
            rememberedValue9 = composer2.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g(fVar2222, z2, null);
            composer2.updateRememberedValue(rememberedValue9);
            composer2.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar2222, valueOf2222, (kotlin.jvm.functions.Function2) rememberedValue9, composer2, (i11 >> 9) & 112);
            N = fVar2222.N();
            if (N != null) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 |= i15;
        if ((i3 & 128) == 0) {
        }
        i4 |= i5;
        if ((i3 & 256) == 0) {
        }
        i4 |= i14;
        if ((i3 & 512) != 0) {
        }
        i4 |= i13;
        i6 = i3 & 1024;
        if (i6 != 0) {
        }
        i7 = i8;
        if ((i4 & 306783379) != 306783378) {
        }
        if (i6 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        android.content.Context context22222 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        androidx.lifecycle.Lifecycle lifecycle22222 = ((androidx.lifecycle.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        startRestartGroup.startReplaceableGroup(-794102752);
        i9 = i7;
        changed = startRestartGroup.changed(context22222) | ((i4 & 112) != 32) | startRestartGroup.changed(lifecycle22222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context22222, z, com.moloco.sdk.service_locator.a.g.f7348a.a(), lifecycle22222, com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
        startRestartGroup.updateRememberedValue(rememberedValue);
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e fVar22222 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        kotlin.jvm.functions.Function0 function022222 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a();
            }
        };
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        companion = androidx.compose.runtime.Composer.INSTANCE;
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final kotlinx.coroutines.CoroutineScope coroutineScope22222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.State rememberUpdatedState52222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i4 >> 15) & 14);
        final androidx.compose.runtime.State rememberUpdatedState222222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i4 >> 18) & 14);
        java.lang.Object[] objArr32222 = new java.lang.Object[0];
        startRestartGroup.startReplaceableGroup(-794070732);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState32222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr32222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 3072, 6);
        java.lang.Object[] objArr222222 = new java.lang.Object[0];
        startRestartGroup.startReplaceableGroup(-794067820);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState222222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr222222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 3072, 6);
        final androidx.compose.runtime.State rememberUpdatedState322222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i4 >> 24) & 14);
        final androidx.compose.runtime.State rememberUpdatedState422222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i4 >> 27) & 14);
        startRestartGroup.startReplaceableGroup(-794060174);
        changedInstance = startRestartGroup.changedInstance(fVar22222) | startRestartGroup.changed(rememberUpdatedState52222) | startRestartGroup.changed(mutableState222222) | startRestartGroup.changed(mutableState32222) | startRestartGroup.changed(rememberUpdatedState222222) | startRestartGroup.changedInstance(coroutineScope22222) | startRestartGroup.changed(rememberUpdatedState322222) | startRestartGroup.changed(rememberUpdatedState422222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope22222, mutableState222222, mutableState32222, rememberUpdatedState52222, rememberUpdatedState222222, rememberUpdatedState322222, rememberUpdatedState422222, (androidx.compose.runtime.DisposableEffectScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(fVar22222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
        kotlin.Unit unit22222 = kotlin.Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(-794023404);
        changedInstance2 = startRestartGroup.changedInstance(fVar22222);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d(fVar22222, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-794011885);
        int i1622222 = i4 & 896;
        changedInstance3 = startRestartGroup.changedInstance(fVar22222) | ((i4 & 14) != 4) | ((i4 & 7168) != 2048) | (i1622222 != 256);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (changedInstance3) {
        }
        i10 = 256;
        i11 = i4;
        composer2 = startRestartGroup;
        i12 = i9;
        java.lang.Object eVar22222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.e(fVar22222, uri, seekToMillis, play, null);
        composer2.updateRememberedValue(eVar22222);
        rememberedValue7 = eVar22222;
        composer2.endReplaceableGroup();
        int i1722222 = i11 >> 3;
        androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar22222, uri, seekToMillis, (kotlin.jvm.functions.Function2) rememberedValue7, composer2, ((i11 << 3) & 112) | (i1722222 & 896));
        composer2.startReplaceableGroup(-793995218);
        changedInstance4 = composer2.changedInstance(fVar22222) | (i1622222 != i10);
        rememberedValue8 = composer2.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.f(fVar22222, play, null);
        composer2.updateRememberedValue(rememberedValue8);
        composer2.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar22222, play, (kotlin.jvm.functions.Function2) rememberedValue8, composer2, i1722222 & 112);
        java.lang.Boolean valueOf22222 = java.lang.Boolean.valueOf(z2);
        composer2.startReplaceableGroup(-793989594);
        changedInstance5 = composer2.changedInstance(fVar22222) | ((i11 & 57344) == 16384);
        rememberedValue9 = composer2.rememberedValue();
        if (!changedInstance5) {
        }
        rememberedValue9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g(fVar22222, z2, null);
        composer2.updateRememberedValue(rememberedValue9);
        composer2.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(fVar22222, valueOf22222, (kotlin.jvm.functions.Function2) rememberedValue9, composer2, (i11 >> 9) & 112);
        N = fVar22222.N();
        if (N != null) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> b(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state) {
        return (kotlin.jvm.functions.Function1) state.getValue();
    }

    public static final kotlin.coroutines.CoroutineContext a() {
        return f7882a;
    }

    public static final androidx.compose.runtime.DisposableEffectResult a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.compose.runtime.State state3, androidx.compose.runtime.State state4, androidx.compose.runtime.DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.h(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.Job[]{kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(eVar.isPlaying(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(mutableState, mutableState2, eVar, state, state2, null)), coroutineScope), kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(eVar.o(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.b(state3, null)), coroutineScope), kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.filterNotNull(eVar.f()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.c(state4, null)), coroutineScope)}), eVar, state);
    }

    public static final android.widget.FrameLayout a(android.view.View view, android.content.Context it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(it);
        frameLayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> a(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state) {
        return (kotlin.jvm.functions.Function1) state.getValue();
    }
}
