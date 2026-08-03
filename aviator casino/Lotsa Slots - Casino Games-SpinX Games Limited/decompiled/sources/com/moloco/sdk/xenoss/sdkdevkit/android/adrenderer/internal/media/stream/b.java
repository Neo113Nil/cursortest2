package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c f7485a;
    public final kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> b;
    public kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> c;
    public kotlin.jvm.functions.Function2<? super java.io.File, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d, kotlin.Unit> d;
    public kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a, kotlin.Unit> e;
    public kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b, kotlin.Unit> f;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.MediaStreamListenerFlow$streamStatusFlow$1", f = "MediaStreamListenerFlow.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7486a;
        public /* synthetic */ java.lang.Object b;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7486a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.this.c = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a.a(kotlinx.coroutines.channels.ProducerScope.this, (java.io.File) obj2);
                    }
                };
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.this.d = new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a.a(kotlinx.coroutines.channels.ProducerScope.this, (java.io.File) obj2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d) obj3);
                    }
                };
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.this.e = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a.a(kotlinx.coroutines.channels.ProducerScope.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) obj2);
                    }
                };
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.this.f = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a.a(kotlinx.coroutines.channels.ProducerScope.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b) obj2);
                    }
                };
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.this;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.this);
                    }
                };
                this.f7486a = 1;
                if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

        public static final kotlin.Unit a(kotlinx.coroutines.channels.ProducerScope producerScope, java.io.File file) {
            producerScope.mo10716trySendJP2dKIU(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(file, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d(0L, 0L)));
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(kotlinx.coroutines.channels.ProducerScope producerScope, java.io.File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d dVar) {
            producerScope.mo10716trySendJP2dKIU(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(file, dVar));
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(kotlinx.coroutines.channels.ProducerScope producerScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a aVar) {
            producerScope.mo10716trySendJP2dKIU(aVar);
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(kotlinx.coroutines.channels.ProducerScope producerScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b bVar) {
            producerScope.mo10716trySendJP2dKIU(bVar);
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar) {
            bVar.c = null;
            bVar.d = null;
            bVar.e = null;
            bVar.f = null;
            return kotlin.Unit.INSTANCE;
        }
    }

    public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c initialStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialStatus, "initialStatus");
        this.f7485a = initialStatus;
        this.b = kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b.a(null));
    }

    public final kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> b() {
        return this.b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a() {
        return this.f7485a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        this.f7485a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(file, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d(0L, 0L));
        kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> function1 = this.c;
        if (function1 != null) {
            function1.invoke(file);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(java.io.File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
        this.f7485a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(file, progress);
        kotlin.jvm.functions.Function2<? super java.io.File, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d, kotlin.Unit> function2 = this.d;
        if (function2 != null) {
            function2.invoke(file, progress);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        this.f7485a = result;
        kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a, kotlin.Unit> function1 = this.e;
        if (function1 != null) {
            function1.invoke(result);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f7485a = error;
        kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b, kotlin.Unit> function1 = this.f;
        if (function1 != null) {
            function1.invoke(error);
        }
    }
}
