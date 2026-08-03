package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class o implements com.moloco.sdk.internal.publisher.q {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.publisher.o.a f7164a = new com.moloco.sdk.internal.publisher.o.a(null);
    public static final int b = 0;
    public static final java.lang.String c = "Base64GzippedBidProcessor";

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.Base64GzippedBidProcessor$process$2", f = "BidProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7165a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.o.b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
            return ((com.moloco.sdk.internal.publisher.o.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.o.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7165a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.publisher.o.c, "Starting bid response pre-process with base64 decode and gunzip", false, 4, null);
            java.lang.String a2 = com.moloco.sdk.internal.publisher.o.this.a(this.c);
            com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.publisher.o.c, "Processed bidresponse: " + a2, false, 4, null);
            return a2;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.q
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new com.moloco.sdk.internal.publisher.o.b(str, null), continuation);
    }

    public final java.lang.String a(java.lang.String str) {
        try {
            byte[] decode = android.util.Base64.decode(str, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, c, "Base64 decoded bidresponse: " + decode, false, 4, null);
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(decode);
            java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream, 2048);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    try {
                        int read = gZIPInputStream.read(bArr);
                        if (read != -1) {
                            sb.append(new java.lang.String(bArr, 0, read, kotlin.text.Charsets.UTF_8));
                        } else {
                            byteArrayInputStream.close();
                            gZIPInputStream.close();
                            return sb.toString();
                        }
                    } catch (java.lang.Exception unused) {
                        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, c, "Failed to unzip bidresponse, perhaps a non-gzipped response", null, false, 12, null);
                        byteArrayInputStream.close();
                        gZIPInputStream.close();
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    byteArrayInputStream.close();
                    gZIPInputStream.close();
                    throw th;
                }
            }
        } catch (java.lang.Exception unused2) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, c, "Failed to base64 decode bidresponse, perhpas a non-base64 encoded response", null, false, 12, null);
            return null;
        }
    }
}
