package com.moloco.sdk.internal.ortb;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.internal.ortb.b {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.json.Json f7006a;
    public final com.moloco.sdk.internal.scheduling.DispatcherProvider b;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ortb.BidResponseParserImpl$invoke$2", f = "BidResponseParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.ortb.model.g, com.moloco.sdk.internal.ortb.a>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7007a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ortb.c.a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.ortb.model.g, com.moloco.sdk.internal.ortb.a>> continuation) {
            return ((com.moloco.sdk.internal.ortb.c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ortb.c.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7007a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                kotlinx.serialization.json.Json json = com.moloco.sdk.internal.ortb.c.this.f7006a;
                java.lang.String str = this.c;
                json.getSerializersModule();
                return new com.moloco.sdk.internal.v.b(com.moloco.sdk.internal.ortb.e.a((com.moloco.sdk.internal.ortb.model.g) json.decodeFromString(com.moloco.sdk.internal.ortb.model.g.INSTANCE.serializer(), str)));
            } catch (java.util.concurrent.CancellationException e) {
                throw e;
            } catch (kotlinx.serialization.MissingFieldException e2) {
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.ortb.a.b(e2.getMissingFields()));
            } catch (java.lang.Exception e3) {
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.ortb.a.C0184a(e3));
            }
        }
    }

    public c(kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        this.f7006a = json;
        this.b = com.moloco.sdk.internal.scheduling.b.a();
    }

    @Override // com.moloco.sdk.internal.ortb.b
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.ortb.model.g, com.moloco.sdk.internal.ortb.a>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.b.getIo(), new com.moloco.sdk.internal.ortb.c.a(str, null), continuation);
    }
}
