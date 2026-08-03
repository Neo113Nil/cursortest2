package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

/* loaded from: classes5.dex */
public final class b implements com.google.android.exoplayer2.upstream.DataSource {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7941a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i b;
    public final java.lang.String c;
    public java.io.RandomAccessFile d;
    public long e;
    public boolean f;
    public boolean g;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.ProgressiveMediaFileDataSource$open$1", f = "ProgressiveMediaFileDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7942a;
        public final /* synthetic */ com.google.android.exoplayer2.upstream.DataSpec c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.google.android.exoplayer2.upstream.DataSpec dataSpec, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.a> continuation) {
            super(2, continuation);
            this.c = dataSpec;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.io.File c;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7942a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2 = bVar.a(bVar.f7941a);
                if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) {
                    c = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) a2).b();
                } else {
                    if (!(a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c)) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.g = true;
                        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.c, "Failed to download file: " + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.f7941a, null, false, 12, null);
                        throw new java.io.IOException("Cannot read file: " + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.f7941a);
                    }
                    c = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) a2).c();
                }
                if (!c.exists()) {
                    throw new java.io.IOException("Cannot read file, does not exist yet: " + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.f7941a);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this;
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(c, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                randomAccessFile.seek(this.c.position);
                bVar2.a(randomAccessFile);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this;
                long j = this.c.length;
                if (j == -1) {
                    j = c.length() - this.c.position;
                }
                bVar3.e = j;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.e == 0 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.a(a2)) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.c, "Streaming error likely detected", null, false, 12, null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.g = true;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.e);
            } catch (java.io.IOException e) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.c, "Failed to open file: " + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.f7941a, e, false, 8, null);
                throw e;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.ProgressiveMediaFileDataSource$streamingStatus$1", f = "ProgressiveMediaFileDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b$b, reason: collision with other inner class name */
    public static final class C0316b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7943a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0316b(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.C0316b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.C0316b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.new C0316b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7943a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.this.b.a(this.c);
        }
    }

    public b(java.lang.String url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        this.f7941a = url;
        this.b = mediaCacheRepository;
        this.c = "ProgressiveMediaFileDataSource";
    }

    public static /* synthetic */ void c() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "addTransferListener", null, false, 12, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        try {
            java.io.RandomAccessFile randomAccessFile = this.d;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } finally {
            this.d = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ java.util.Map getResponseHeaders() {
        java.util.Map emptyMap;
        emptyMap = java.util.Collections.emptyMap();
        return emptyMap;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        return android.net.Uri.parse(this.f7941a);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.a(dataSpec, null), 1, null);
        return ((java.lang.Number) runBlocking$default).longValue();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int i, int i2) {
        java.io.IOException iOException;
        int read;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        try {
            if (i2 == 0) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Read length is 0", null, false, 12, null);
                return 0;
            }
            if (this.e == 0 && (a(this.f7941a) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a)) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Media stream is complete", null, false, 12, null);
                return -1;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2 = a(this.f7941a);
            if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Streaming failed: " + this.f7941a, null, false, 12, null);
                this.g = true;
                return 0;
            }
            if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) {
                java.io.RandomAccessFile randomAccessFile = this.d;
                r1 = randomAccessFile != null ? randomAccessFile.read(buffer, i, i2) : 0;
                if (r1 <= 0) {
                    return r1;
                }
                this.f = true;
                this.e -= r1;
                return r1;
            }
            loop0: while (true) {
                while (read <= 0) {
                    try {
                        if (!(a(this.f7941a) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c)) {
                            break loop0;
                        }
                        java.io.RandomAccessFile randomAccessFile2 = this.d;
                        read = randomAccessFile2 != null ? randomAccessFile2.read(buffer, i, i2) : 0;
                    } catch (java.io.IOException e) {
                        iOException = e;
                        r1 = read;
                        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Waiting for more data", iOException, false, 8, null);
                        return r1;
                    }
                }
            }
            if (read <= 0) {
                return read;
            }
            this.f = true;
            this.e -= read;
            return read;
        } catch (java.io.IOException e2) {
            iOException = e2;
        }
    }

    public final java.io.RandomAccessFile b() {
        return this.d;
    }

    public final void a(java.io.RandomAccessFile randomAccessFile) {
        this.d = randomAccessFile;
    }

    public final boolean a() {
        return this.g;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a(java.lang.String str) {
        java.lang.Object runBlocking$default;
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b.C0316b(str, null), 1, null);
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) runBlocking$default;
    }

    public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar) {
        return this.f && (cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) && kotlin.jvm.internal.Intrinsics.areEqual(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) cVar).d(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a());
    }
}
