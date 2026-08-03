package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

/* loaded from: classes5.dex */
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r f7927a;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D d;
    public kotlinx.coroutines.Job e;
    public int f;
    public final java.lang.String b = "LinearGoNextActionImpl";
    public final kotlinx.coroutines.CoroutineScope c = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> g = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.c.b);

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearGoNextActionImpl$startTimer$1", f = "LinearGoNextAction.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7928a;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearGoNextActionImpl$startTimer$1$1", f = "LinearGoNextAction.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h$a$a, reason: collision with other inner class name */
        public static final class C0314a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.UInt, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7929a;
            public /* synthetic */ int b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0314a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a.C0314a> continuation) {
                super(2, continuation);
                this.c = hVar;
            }

            public final java.lang.Object a(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a.C0314a) create(kotlin.UInt.m10890boximpl(i), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a.C0314a c0314a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a.C0314a(this.c, continuation);
                c0314a.b = ((kotlin.UInt) obj).getData();
                return c0314a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.UInt uInt, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return a(uInt.getData(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a b2;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7929a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                int i = this.b;
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.c.b, "Updating countdown to " + ((java.lang.Object) kotlin.UInt.m10942toStringimpl(i)), null, false, 12, null);
                this.c.f = i;
                java.lang.String str = this.c.b;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Propagating state: ");
                b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.b(i);
                sb.append(b);
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, sb.toString(), null, false, 12, null);
                kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> l = this.c.l();
                b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.b(i);
                l.setValue(b2);
                return kotlin.Unit.INSTANCE;
            }
        }

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.StateFlow<kotlin.UInt> a2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7928a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this.d == null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this.d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this.c, null);
                } else {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this.d;
                    if (d != null) {
                        d.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this.f);
                    }
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this.d;
                if (d2 != null && (a2 = d2.a()) != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a.C0314a c0314a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a.C0314a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.this, null);
                    this.f7928a = 1;
                    if (kotlinx.coroutines.flow.FlowKt.collectLatest(a2, c0314a, this) == coroutine_suspended) {
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

    public h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar) {
        this.f7927a = rVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void I() {
        l().setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.c.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> l() {
        return this.g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void pause() {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b, "Canceling timer", null, false, 12, null);
        kotlinx.coroutines.Job job = this.e;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void s() {
        int compare;
        compare = java.lang.Integer.compare(this.f ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            a(this.f & 4294967295L);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void a(int i, int i2) {
        long b;
        int b2;
        double d = (i / i2) * 100;
        if (i >= i2) {
            l().setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.C0312a.b);
            return;
        }
        if (this.f7927a == null) {
            l().setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.c.b);
            return;
        }
        if (this.e == null) {
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.b, "Starting timer", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar = this.f7927a;
            if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a) {
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.b, "Offset Percents detected", null, false, 12, null);
                b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.b(new kotlin.ranges.IntRange((int) d, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a) this.f7927a).b()), i2);
                a(b2 & 4294967295L);
            } else {
                if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.b, "Offset Millis detected", null, false, 12, null);
                    b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.b(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b) this.f7927a).b());
                    a(b);
                    return;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
    }

    public final void a(long j) {
        boolean b;
        kotlinx.coroutines.Job launch$default;
        b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.b(this.e);
        if (b) {
            this.f = kotlin.UInt.m10896constructorimpl((int) j);
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b, "Start timer for duration: " + j + " seconds", null, false, 12, null);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a(null), 3, null);
            this.e = launch$default;
        }
    }
}
