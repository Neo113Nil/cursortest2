package com.moloco.sdk.internal.publisher.nativead.parser;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7146a = "PrepareNativeAssets";

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", i = {0}, l = {113}, m = "prepareImageAsset", n = {"asset"}, s = {"L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7147a;
        public /* synthetic */ java.lang.Object b;
        public int c;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.parser.c.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.nativead.parser.c.b(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", i = {0, 0, 0, 1}, l = {37, 58}, m = "prepareNativeAssets-exY8QGI", n = {"loadVast", "optionalAssetsGroup", "timeout", "preparedRequiredAssets"}, s = {"L$0", "L$1", "J$0", "L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f7148a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int e;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.parser.c.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.nativead.parser.c.a((android.content.Context) null, (java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a>) null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedOptionalAssets$1", f = "PrepareNativeAssets.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.parser.c$c, reason: collision with other inner class name */
    public static final class C0199c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, ? extends com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7149a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> c;
        public final /* synthetic */ kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> d;
        public final /* synthetic */ long e;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedOptionalAssets$1$1$1", f = "PrepareNativeAssets.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.parser.c$c$a */
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, ? extends com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public java.lang.Object f7150a;
            public int b;
            public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.b.a c;
            public final /* synthetic */ kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> d;
            public final /* synthetic */ long e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(com.moloco.sdk.internal.publisher.nativead.model.b.a aVar, kotlin.Lazy<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c.a> continuation) {
                super(2, continuation);
                this.c = aVar;
                this.d = lazy;
                this.e = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, ? extends com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>> continuation) {
                return ((com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c.a(this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.moloco.sdk.internal.publisher.nativead.model.b.a aVar;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.publisher.nativead.model.b.a aVar2 = this.c;
                    kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy = this.d;
                    long j = this.e;
                    this.f7150a = aVar2;
                    this.b = 1;
                    java.lang.Object b = com.moloco.sdk.internal.publisher.nativead.parser.c.b(aVar2, lazy, j, this);
                    if (b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = aVar2;
                    obj = b;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (com.moloco.sdk.internal.publisher.nativead.model.b.a) this.f7150a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.TuplesKt.to(aVar, obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0199c(java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a> list, kotlin.Lazy<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = lazy;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, ? extends com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>> continuation) {
            return ((com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c c0199c = new com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c(this.c, this.d, this.e, continuation);
            c0199c.b = obj;
            return c0199c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Deferred async$default;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7149a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
                java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> list = this.c;
                kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy = this.d;
                long j = this.e;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c.a((com.moloco.sdk.internal.publisher.nativead.model.b.a) it.next(), lazy, j, null), 3, null);
                    arrayList.add(async$default);
                }
                this.f7149a = 1;
                obj = kotlinx.coroutines.AwaitKt.awaitAll(arrayList, this);
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedRequiredAssets$1", f = "PrepareNativeAssets.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, ? extends com.moloco.sdk.internal.v.b<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7151a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> c;
        public final /* synthetic */ kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> d;
        public final /* synthetic */ long e;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedRequiredAssets$1$1$1", f = "PrepareNativeAssets.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, ? extends com.moloco.sdk.internal.v.b<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7152a;
            public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.b.a b;
            public final /* synthetic */ kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(com.moloco.sdk.internal.publisher.nativead.model.b.a aVar, kotlin.Lazy<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.parser.c.d.a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = lazy;
                this.d = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, com.moloco.sdk.internal.v.b<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>> continuation) {
                return ((com.moloco.sdk.internal.publisher.nativead.parser.c.d.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.internal.publisher.nativead.parser.c.d.a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7152a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.publisher.nativead.model.b.a aVar = this.b;
                    kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy = this.c;
                    long j = this.d;
                    this.f7152a = 1;
                    obj = com.moloco.sdk.internal.publisher.nativead.parser.c.b(aVar, lazy, j, this);
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
                if (vVar instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.nativead.parser.c.f7146a, "Successfully prepared native asset: " + this.b.a(), null, false, 12, null);
                    return kotlin.TuplesKt.to(this.b, vVar);
                }
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.nativead.parser.c.f7146a, "Failed to prepare required native asset: " + this.b.a(), null, false, 12, null);
                throw new com.moloco.sdk.internal.publisher.nativead.parser.b(this.b.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.v.a) vVar).a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a> list, kotlin.Lazy<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.parser.c.d> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = lazy;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, com.moloco.sdk.internal.v.b<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>> continuation) {
            return ((com.moloco.sdk.internal.publisher.nativead.parser.c.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.publisher.nativead.parser.c.d dVar = new com.moloco.sdk.internal.publisher.nativead.parser.c.d(this.c, this.d, this.e, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Deferred async$default;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7151a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
                java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> list = this.c;
                kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy = this.d;
                long j = this.e;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.moloco.sdk.internal.publisher.nativead.parser.c.d.a((com.moloco.sdk.internal.publisher.nativead.model.b.a) it.next(), lazy, j, null), 3, null);
                    arrayList.add(async$default);
                }
                this.f7151a = 1;
                obj = kotlinx.coroutines.AwaitKt.awaitAll(arrayList, this);
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", i = {0, 0, 0, 1}, l = {148, 155}, m = "prepareVideoAsset-exY8QGI", n = {"asset", "loadVast", "timeout", "asset"}, s = {"L$0", "L$1", "J$0", "L$0"})
    public static final class e extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7153a;
        public java.lang.Object b;
        public long c;
        public /* synthetic */ java.lang.Object d;
        public int e;

        public e(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.parser.c.e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.nativead.parser.c.b((com.moloco.sdk.internal.publisher.nativead.model.b.a.d) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d) null, 0L, this);
        }
    }

    public static final java.lang.Object b(com.moloco.sdk.internal.publisher.nativead.model.b.a aVar, kotlin.Lazy<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d> lazy, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
        if (aVar instanceof com.moloco.sdk.internal.publisher.nativead.model.b.a.C0195a) {
            return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.publisher.nativead.model.c.a((com.moloco.sdk.internal.publisher.nativead.model.b.a.C0195a) aVar));
        }
        if (aVar instanceof com.moloco.sdk.internal.publisher.nativead.model.b.a.C0196b) {
            return a((com.moloco.sdk.internal.publisher.nativead.model.b.a.C0196b) aVar, null, continuation, 2, null);
        }
        if (aVar instanceof com.moloco.sdk.internal.publisher.nativead.model.b.a.c) {
            return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.publisher.nativead.model.c.C0198c((com.moloco.sdk.internal.publisher.nativead.model.b.a.c) aVar));
        }
        if (aVar instanceof com.moloco.sdk.internal.publisher.nativead.model.b.a.d) {
            return b((com.moloco.sdk.internal.publisher.nativead.model.b.a.d) aVar, lazy.getValue(), j, continuation);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(final android.content.Context context, java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a> list, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.internal.publisher.nativead.parser.b>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.parser.c.b bVar;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.Lazy lazy;
        java.util.List list2;
        java.util.List list3;
        try {
            if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.parser.c.b) {
                bVar = (com.moloco.sdk.internal.publisher.nativead.parser.c.b) continuation;
                int i2 = bVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.e = i2 - Integer.MIN_VALUE;
                    obj = bVar.d;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.parser.c$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.moloco.sdk.internal.publisher.nativead.parser.c.a(context);
                            }
                        });
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        for (java.lang.Object obj2 : list) {
                            java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.moloco.sdk.internal.publisher.nativead.model.b.a) obj2).b());
                            java.lang.Object obj3 = linkedHashMap.get(boxBoolean);
                            if (obj3 == null) {
                                obj3 = new java.util.ArrayList();
                                linkedHashMap.put(boxBoolean, obj3);
                            }
                            ((java.util.List) obj3).add(obj2);
                        }
                        java.util.List list4 = (java.util.List) linkedHashMap.get(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                        if (list4 == null) {
                            list4 = kotlin.collections.CollectionsKt.emptyList();
                        }
                        java.util.List list5 = list4;
                        java.util.List list6 = (java.util.List) linkedHashMap.get(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                        if (list6 == null) {
                            list6 = kotlin.collections.CollectionsKt.emptyList();
                        }
                        com.moloco.sdk.internal.publisher.nativead.parser.c.d dVar = new com.moloco.sdk.internal.publisher.nativead.parser.c.d(list5, lazy2, j, null);
                        bVar.b = lazy2;
                        bVar.c = list6;
                        bVar.f7148a = j;
                        bVar.e = 1;
                        obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(dVar, bVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        lazy = lazy2;
                        list2 = list6;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list3 = (java.util.List) bVar.b;
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                            java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                            java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (kotlin.Pair pair : kotlin.collections.CollectionsKt.plus((java.util.Collection) list3, (java.lang.Iterable) obj)) {
                                com.moloco.sdk.internal.publisher.nativead.model.b.a aVar = (com.moloco.sdk.internal.publisher.nativead.model.b.a) pair.component1();
                                com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) pair.component2();
                                if (vVar instanceof com.moloco.sdk.internal.v.a) {
                                    arrayList.add(kotlin.TuplesKt.to(aVar, ((com.moloco.sdk.internal.v.a) vVar).a()));
                                } else if (vVar instanceof com.moloco.sdk.internal.v.b) {
                                    com.moloco.sdk.internal.publisher.nativead.model.c cVar = (com.moloco.sdk.internal.publisher.nativead.model.c) ((com.moloco.sdk.internal.v.b) vVar).a();
                                    if (cVar instanceof com.moloco.sdk.internal.publisher.nativead.model.c.a) {
                                        kotlin.Pair pair2 = kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(cVar.b().a()), cVar);
                                        linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                                    } else if (cVar instanceof com.moloco.sdk.internal.publisher.nativead.model.c.b) {
                                        kotlin.Pair pair3 = kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(cVar.b().a()), cVar);
                                        linkedHashMap3.put(pair3.getFirst(), pair3.getSecond());
                                    } else if (cVar instanceof com.moloco.sdk.internal.publisher.nativead.model.c.C0198c) {
                                        kotlin.Pair pair4 = kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(cVar.b().a()), cVar);
                                        linkedHashMap4.put(pair4.getFirst(), pair4.getSecond());
                                    } else {
                                        if (!(cVar instanceof com.moloco.sdk.internal.publisher.nativead.model.c.d)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        kotlin.Pair pair5 = kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(cVar.b().a()), cVar);
                                        linkedHashMap5.put(pair5.getFirst(), pair5.getSecond());
                                    }
                                } else {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                            }
                            return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.publisher.nativead.model.d(linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, arrayList));
                        }
                        j = bVar.f7148a;
                        java.util.List list7 = (java.util.List) bVar.c;
                        kotlin.Lazy lazy3 = (kotlin.Lazy) bVar.b;
                        kotlin.ResultKt.throwOnFailure(obj);
                        list2 = list7;
                        lazy = lazy3;
                    }
                    list3 = (java.util.List) obj;
                    com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c c0199c = new com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c(list2, lazy, j, null);
                    bVar.b = list3;
                    bVar.c = null;
                    bVar.e = 2;
                    obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c0199c, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    java.util.LinkedHashMap linkedHashMap22 = new java.util.LinkedHashMap();
                    java.util.LinkedHashMap linkedHashMap32 = new java.util.LinkedHashMap();
                    java.util.LinkedHashMap linkedHashMap42 = new java.util.LinkedHashMap();
                    java.util.LinkedHashMap linkedHashMap52 = new java.util.LinkedHashMap();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (r11.hasNext()) {
                    }
                    return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.publisher.nativead.model.d(linkedHashMap22, linkedHashMap32, linkedHashMap42, linkedHashMap52, arrayList2));
                }
            }
            if (i != 0) {
            }
            list3 = (java.util.List) obj;
            com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c c0199c2 = new com.moloco.sdk.internal.publisher.nativead.parser.c.C0199c(list2, lazy, j, null);
            bVar.b = list3;
            bVar.c = null;
            bVar.e = 2;
            obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c0199c2, bVar);
            if (obj == coroutine_suspended) {
            }
            java.util.LinkedHashMap linkedHashMap222 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap322 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap422 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap522 = new java.util.LinkedHashMap();
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            while (r11.hasNext()) {
            }
            return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.publisher.nativead.model.d(linkedHashMap222, linkedHashMap322, linkedHashMap422, linkedHashMap522, arrayList22));
        } catch (com.moloco.sdk.internal.publisher.nativead.parser.b e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f7146a, "Failed to prepare required assets", e2, false, 8, null);
            return new com.moloco.sdk.internal.v.a(e2);
        }
        bVar = new com.moloco.sdk.internal.publisher.nativead.parser.c.b(continuation);
        obj = bVar.d;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(com.moloco.sdk.internal.publisher.nativead.model.b.a.C0196b c0196b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.parser.c.a aVar;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a aVar2;
        if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.parser.c.a) {
            aVar = (com.moloco.sdk.internal.publisher.nativead.parser.c.a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String e2 = c0196b.e();
                    aVar.f7147a = c0196b;
                    aVar.c = 1;
                    obj = iVar.a(e2, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0196b = (com.moloco.sdk.internal.publisher.nativead.model.b.a.C0196b) aVar.f7147a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a) obj;
                if (!(aVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b)) {
                    try {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f7146a, "Successfully loaded image asset media", null, false, 12, null);
                        java.lang.String absolutePath = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b) aVar2).a().getAbsolutePath();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.publisher.nativead.model.c.b(c0196b, android.net.Uri.parse(absolutePath)));
                    } catch (java.lang.Exception e3) {
                        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f7146a, "Failed to prepare image asset", e3, false, 8, null);
                        return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.c);
                    }
                }
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f7146a, "Failed to fetch image asset media", null, false, 12, null);
                return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.b);
            }
        }
        aVar = new com.moloco.sdk.internal.publisher.nativead.parser.c.a(continuation);
        java.lang.Object obj2 = aVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.c;
        if (i != 0) {
        }
        aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a) obj2;
        if (!(aVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(com.moloco.sdk.internal.publisher.nativead.model.b.a.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.publisher.nativead.model.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
        com.moloco.sdk.internal.publisher.nativead.parser.c.e eVar;
        int i;
        com.moloco.sdk.internal.v vVar;
        com.moloco.sdk.internal.v vVar2;
        if (continuation instanceof com.moloco.sdk.internal.publisher.nativead.parser.c.e) {
            eVar = (com.moloco.sdk.internal.publisher.nativead.parser.c.e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = eVar.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String c = dVar.c();
                    eVar.f7153a = dVar;
                    eVar.b = dVar2;
                    eVar.c = j;
                    eVar.e = 1;
                    obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d.a.a(dVar2, c, null, true, eVar, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = (com.moloco.sdk.internal.publisher.nativead.model.b.a.d) eVar.f7153a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        vVar2 = (com.moloco.sdk.internal.v) obj;
                        if (!(vVar2 instanceof com.moloco.sdk.internal.v.b)) {
                            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f7146a, "Successfully loaded video asset media", null, false, 12, null);
                            return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.publisher.nativead.model.c.d(dVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.v.b) vVar2).a()));
                        }
                        if (vVar2 instanceof com.moloco.sdk.internal.v.a) {
                            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f7146a, "Failed to fetch video asset media: " + ((com.moloco.sdk.internal.v.a) vVar2).a(), null, false, 12, null);
                            return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.d);
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    j = eVar.c;
                    dVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d) eVar.b;
                    dVar = (com.moloco.sdk.internal.publisher.nativead.model.b.a.d) eVar.f7153a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                    long duration = kotlin.time.DurationKt.toDuration(kotlin.time.Duration.m12157getInWholeMillisecondsimpl(j) * 0.9d, kotlin.time.DurationUnit.MILLISECONDS);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.v.b) vVar).a();
                    eVar.f7153a = dVar;
                    eVar.b = null;
                    eVar.e = 2;
                    obj = dVar2.a(aVar, duration, eVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vVar2 = (com.moloco.sdk.internal.v) obj;
                    if (!(vVar2 instanceof com.moloco.sdk.internal.v.b)) {
                    }
                } else {
                    if (vVar instanceof com.moloco.sdk.internal.v.a) {
                        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f7146a, "Failed to fetch video asset media: " + ((com.moloco.sdk.internal.v.a) vVar).a(), null, false, 12, null);
                        return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.e);
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        eVar = new com.moloco.sdk.internal.publisher.nativead.parser.c.e(continuation);
        java.lang.Object obj2 = eVar.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.e;
        if (i != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d a(android.content.Context context) {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(context);
    }

    public static /* synthetic */ java.lang.Object a(com.moloco.sdk.internal.publisher.nativead.model.b.a.C0196b c0196b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            iVar = com.moloco.sdk.service_locator.a.g.f7348a.a();
        }
        return b(c0196b, iVar, continuation);
    }
}
