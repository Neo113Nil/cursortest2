package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public final class l {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt", f = "PreparedVastResource.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {76, 140}, m = "prepareVastResource", n = {"$this$prepareVastResource", "context", "customUserEventBuilderService", "externalLinkHandler", "onWebViewClick", "onWebViewError", "linkHandler", "mraidHtml", "startMuted", "mraidInline", "staticWebView", "staticWebViewListenerScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "L$0", "L$1", "L$2"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7913a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public java.lang.Object h;
        public boolean i;
        public /* synthetic */ java.lang.Object j;
        public int k;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a(null, null, null, null, 0, 0, null, null, false, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$2", f = "PreparedVastResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7914a;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> objectRef, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.b> continuation) {
            super(2, continuation);
            this.b = objectRef;
            this.c = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.b(this.b, this.c, continuation);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7914a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.b.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a(this.c);
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.Integer f7915a;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m> b;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d> c;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.CoroutineScope> d;

        public c(java.lang.Integer num, kotlin.jvm.internal.Ref.ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m> objectRef, kotlin.jvm.internal.Ref.ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d> objectRef2, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.CoroutineScope> objectRef3) {
            this.f7915a = num;
            this.b = objectRef;
            this.c = objectRef2;
            this.d = objectRef3;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void destroy() {
            java.lang.Integer num = this.f7915a;
            if (num != null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.U.f7418a.b(num.intValue());
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar = this.b.element;
            if (mVar != null) {
                mVar.destroy();
            }
            this.b.element = null;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d c3447d = this.c.element;
            if (c3447d != null) {
                c3447d.destroy();
            }
            this.c.element = null;
            kotlinx.coroutines.CoroutineScope coroutineScope = this.d.element;
            if (coroutineScope != null) {
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
            this.d.element = null;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$1", f = "PreparedVastResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7916a;
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.d> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.d) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.d(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7916a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.b.invoke();
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$2", f = "PreparedVastResource.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7917a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a b;
        public final /* synthetic */ kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, kotlin.Unit> c;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$2$1", f = "PreparedVastResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7918a;
            public /* synthetic */ java.lang.Object b;

            public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e.a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e.a) create(gVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e.a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7918a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.b) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e> continuation) {
            super(2, continuation);
            this.b = aVar;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7917a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.b.getUnrecoverableError();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e.a(null);
                this.f7917a = 1;
                obj = kotlinx.coroutines.flow.FlowKt.first(unrecoverableError, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
            if (gVar != null) {
                this.c.invoke(gVar);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c) yVar;
            if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f7775a) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b(cVar.a().b(), i, i2);
            }
        }
        return null;
    }

    public static final kotlin.Unit b() {
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.String a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.a) yVar;
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h.f7458a.a(aVar.a().a())) {
                return aVar.a().a();
            }
        } else if (yVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.b) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.b) yVar;
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h.f7458a.a(bVar.a().a())) {
                return bVar.a().a();
            }
        } else if (yVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c) yVar;
            if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h.f7458a.a(cVar.a().b())) {
                return cVar.a().b();
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, int i, int i2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, kotlin.Unit> function1, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a aVar2;
        int i3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar2;
        kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, kotlin.Unit> function12;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar2;
        boolean z2;
        android.content.Context context2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        java.lang.String str;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef7;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d c3447d;
        java.lang.Integer boxInt;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a) {
            aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a) continuation;
            int i4 = aVar2.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar2.k = i4 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar2.j;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = aVar2.k;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a2 = a(yVar, i, i2);
                    if (a2 != null) {
                        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k(a2, null);
                    }
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.coroutines.CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.b(objectRef, yVar, null);
                    aVar2.f7913a = yVar;
                    aVar2.b = context;
                    aVar3 = aVar;
                    aVar2.c = aVar3;
                    rVar2 = rVar;
                    aVar2.d = rVar2;
                    aVar2.e = function0;
                    aVar2.f = function1;
                    aVar2.g = lVar;
                    aVar2.h = objectRef;
                    aVar2.i = z;
                    aVar2.k = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, bVar, aVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function12 = function1;
                    lVar2 = lVar;
                    yVar2 = yVar;
                    z2 = z;
                    context2 = context;
                    function02 = function0;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) aVar2.c;
                        objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) aVar2.b;
                        objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) aVar2.f7913a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d) {
                            objectRef4 = objectRef7;
                            objectRef2 = objectRef5;
                            objectRef3 = objectRef6;
                            c3447d = null;
                        } else {
                            objectRef4 = objectRef7;
                            c3447d = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d) obj;
                            objectRef2 = objectRef5;
                            objectRef3 = objectRef6;
                        }
                        boxInt = c3447d != null ? kotlin.coroutines.jvm.internal.Boxing.boxInt(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.U.f7418a.a(c3447d)) : null;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.c(boxInt, objectRef2, objectRef3, objectRef4);
                        if (boxInt != null) {
                            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.a(boxInt.intValue()), cVar);
                        }
                        return null;
                    }
                    z2 = aVar2.i;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) aVar2.h;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l) aVar2.g;
                    function12 = (kotlin.jvm.functions.Function1) aVar2.f;
                    function02 = (kotlin.jvm.functions.Function0) aVar2.e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r) aVar2.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) aVar2.c;
                    android.content.Context context3 = (android.content.Context) aVar2.b;
                    yVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) aVar2.f7913a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    lVar2 = lVar3;
                    context2 = context3;
                    rVar2 = rVar3;
                    aVar3 = aVar4;
                }
                objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                str = (java.lang.String) objectRef.element;
                if (str != null) {
                    android.content.Context applicationContext = context2.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    ?? aVar5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(applicationContext, null, new com.moloco.sdk.internal.services.t(rVar2, aVar3), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a(), false, null, 50, null);
                    objectRef3.element = aVar5;
                    ?? CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
                    objectRef4.element = CoroutineScope;
                    kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(aVar5.getClickthroughEvent(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.d(function02, null)), CoroutineScope);
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.e(aVar5, function12, null), 3, null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q.a(aVar5, yVar2);
                    c3447d = aVar5;
                    if (c3447d != null) {
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.c cVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.c(boxInt, objectRef2, objectRef3, objectRef4);
                    if (boxInt != null) {
                    }
                } else {
                    ?? mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(context2, str, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a();
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.b();
                        }
                    }, function02, function12, true, rVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h.a(context2, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain()), z2), lVar2, null, 1024, null);
                    objectRef2.element = mVar;
                    aVar2.f7913a = objectRef2;
                    aVar2.b = objectRef3;
                    aVar2.c = objectRef4;
                    aVar2.d = null;
                    aVar2.e = null;
                    aVar2.f = null;
                    aVar2.g = null;
                    aVar2.h = null;
                    aVar2.k = 2;
                    java.lang.Object c2 = mVar.c(aVar2);
                    if (c2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef5 = objectRef2;
                    objectRef6 = objectRef3;
                    obj = c2;
                    objectRef7 = objectRef4;
                    if (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d) {
                    }
                    if (c3447d != null) {
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.c cVar22 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.c(boxInt, objectRef2, objectRef3, objectRef4);
                    if (boxInt != null) {
                    }
                }
            }
        }
        aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a(continuation);
        java.lang.Object obj2 = aVar2.j;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = aVar2.k;
        if (i3 != 0) {
        }
        objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
        str = (java.lang.String) objectRef.element;
        if (str != null) {
        }
    }

    public static final kotlin.Unit a() {
        return kotlin.Unit.INSTANCE;
    }
}
