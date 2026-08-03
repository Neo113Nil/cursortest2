package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

/* loaded from: classes5.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c f7952a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> c;
    public final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> d;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> e;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$1", f = "VisibilityAwareVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7953a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.a> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object a(boolean z, boolean z2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.this.new a(continuation);
            aVar.b = z;
            aVar.c = z2;
            return aVar.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7953a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            boolean z2 = this.c;
            if (z && z2) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.this.f7952a.play();
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.this.f7952a.pause();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$2", f = "VisibilityAwareVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, java.lang.Boolean, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7954a;
        public /* synthetic */ java.lang.Object b;
        public /* synthetic */ boolean c;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.b> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, boolean z, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.b(continuation);
            bVar.b = aVar;
            bVar.c = z;
            return bVar.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> continuation) {
            return a(aVar, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7954a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b, false, this.c, false, 5, null);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$3", f = "VisibilityAwareVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7955a;
        public /* synthetic */ java.lang.Object b;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.c) create(aVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7955a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.this.e.setValue((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b);
            return kotlin.Unit.INSTANCE;
        }
    }

    public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c basePlayer, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker) {
        kotlinx.coroutines.flow.Flow b2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basePlayer, "basePlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        this.f7952a = basePlayer;
        kotlinx.coroutines.CoroutineScope MainScope = kotlinx.coroutines.CoroutineScopeKt.MainScope();
        this.b = MainScope;
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g.b(viewVisibilityTracker, basePlayer.N());
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> stateIn = kotlinx.coroutines.flow.FlowKt.stateIn(b2, MainScope, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.FALSE);
        this.c = stateIn;
        kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, 2, null);
        this.d = MutableSharedFlow$default;
        this.e = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a(basePlayer.isPlaying().getValue(), false, stateIn.getValue().booleanValue(), false, 5, null));
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.combine(stateIn, MutableSharedFlow$default, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.a(null)), MainScope);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.combine(basePlayer.isPlaying(), stateIn, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.b(null)), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.c(null)), MainScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public boolean C() {
        return this.f7952a.C();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public android.view.View N() {
        return this.f7952a.N();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.f7952a.a(continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void b(boolean z) {
        this.f7952a.b(z);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.b, null, 1, null);
        this.f7952a.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> f() {
        return this.f7952a.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> isPlaying() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public java.lang.String m() {
        return this.f7952a.m();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> o() {
        return this.f7952a.o();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void pause() {
        this.d.tryEmit(java.lang.Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void play() {
        this.d.tryEmit(java.lang.Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void seekTo(long j) {
        this.f7952a.seekTo(j);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void a(java.lang.String str) {
        this.f7952a.a(str);
    }
}
