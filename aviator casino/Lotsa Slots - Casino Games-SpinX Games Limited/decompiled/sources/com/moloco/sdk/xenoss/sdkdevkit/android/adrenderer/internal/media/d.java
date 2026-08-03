package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* loaded from: classes5.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.u f7468a;
    public final com.moloco.sdk.internal.error.b b;
    public final io.ktor.client.HttpClient c;
    public final java.lang.String d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.LegacyMediaDownloader$downloadMedia$2", f = "LegacyMediaDownloader.kt", i = {0, 1, 2, 2, 3, 3}, l = {42, 52, 63, 63}, m = "invokeSuspend", n = {"httpRequestComplete", "httpRequestComplete", com.ironsource.Ve.n, "httpRequestComplete", com.ironsource.Ve.n, "httpRequestComplete"}, s = {"I$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7469a;
        public java.lang.Object b;
        public int c;
        public final /* synthetic */ java.lang.String e;
        public final /* synthetic */ java.io.File f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String str, java.io.File file, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a> continuation) {
            super(2, continuation);
            this.e = str;
            this.f = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.new a(this.e, this.f, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0167 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0150 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0215  */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v28, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v36, types: [int] */
        /* JADX WARN: Type inference failed for: r2v39 */
        /* JADX WARN: Type inference failed for: r2v40 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            ?? r2;
            java.lang.Object a2;
            int i;
            java.lang.Object a3;
            io.ktor.client.statement.HttpResponse httpResponse;
            int value;
            int value2;
            java.lang.Object bodyAsChannel;
            io.ktor.client.statement.HttpResponse httpResponse2;
            ?? r22;
            java.lang.Object copyAndClose;
            io.ktor.client.statement.HttpResponse httpResponse3;
            java.lang.String str = "Fetching asset from network: ";
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.c;
            try {
                try {
                } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
                    r2 = str;
                }
                try {
                    if (i2 == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Fetching asset from network: " + this.e, null, false, 12, null);
                            com.moloco.sdk.internal.services.u uVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.f7468a;
                            this.f7469a = 0;
                            this.c = 1;
                            a2 = uVar.a(5000L, this);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = 0;
                        } catch (kotlinx.coroutines.TimeoutCancellationException unused2) {
                            r2 = 0;
                            com.moloco.sdk.internal.error.b.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.a(r2 != 0), null, 2, null);
                            if (r2 != 0) {
                                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Timeout occurred after request had completed: " + this.e, null, false, 12, null);
                            } else {
                                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Timeout occurred when still waiting for request to complete: " + this.e, null, false, 12, null);
                            }
                            throw new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p();
                        }
                    } else if (i2 == 1) {
                        int i3 = this.f7469a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i = i3;
                        a2 = obj;
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ?? r23 = this.f7469a;
                                httpResponse3 = (io.ktor.client.statement.HttpResponse) this.b;
                                kotlin.ResultKt.throwOnFailure(obj);
                                copyAndClose = obj;
                                str = r23;
                                long longValue = ((java.lang.Number) copyAndClose).longValue();
                                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Downloaded full response: " + io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse3) + " and saved to disk: " + longValue + " bytes, file size: " + this.f.length(), null, false, 12, null);
                                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b(this.f);
                            }
                            int i4 = this.f7469a;
                            io.ktor.client.statement.HttpResponse httpResponse4 = (io.ktor.client.statement.HttpResponse) this.b;
                            kotlin.ResultKt.throwOnFailure(obj);
                            httpResponse2 = httpResponse4;
                            bodyAsChannel = obj;
                            r22 = i4;
                            io.ktor.utils.io.ByteWriteChannel writeChannel$default = io.ktor.util.cio.FileChannelsKt.writeChannel$default(this.f, null, 1, null);
                            this.b = httpResponse2;
                            this.f7469a = r22;
                            this.c = 4;
                            copyAndClose = io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose((io.ktor.utils.io.ByteReadChannel) bodyAsChannel, writeChannel$default, this);
                            if (copyAndClose != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            httpResponse3 = httpResponse2;
                            str = r22;
                            long longValue2 = ((java.lang.Number) copyAndClose).longValue();
                            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Downloaded full response: " + io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse3) + " and saved to disk: " + longValue2 + " bytes, file size: " + this.f.length(), null, false, 12, null);
                            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b(this.f);
                        }
                        int i5 = this.f7469a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        a3 = obj;
                        httpResponse = (io.ktor.client.statement.HttpResponse) a3;
                        try {
                            value = httpResponse.getStatus().getValue();
                            if (400 > value && value < 500) {
                                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Failed to fetch media from url: " + this.e + ", status: " + httpResponse.getStatus(), null, false, 12, null);
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.e.c;
                            }
                            value2 = httpResponse.getStatus().getValue();
                            if (500 > value2 && value2 < 600) {
                                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Failed to fetch media from url: " + this.e + ", status: " + httpResponse.getStatus(), null, false, 12, null);
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.h.c;
                            }
                            this.b = httpResponse;
                            this.f7469a = 1;
                            this.c = 3;
                            bodyAsChannel = io.ktor.client.statement.HttpResponseKt.bodyAsChannel(httpResponse, this);
                            if (bodyAsChannel != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            httpResponse2 = httpResponse;
                            r22 = 1;
                            io.ktor.utils.io.ByteWriteChannel writeChannel$default2 = io.ktor.util.cio.FileChannelsKt.writeChannel$default(this.f, null, 1, null);
                            this.b = httpResponse2;
                            this.f7469a = r22;
                            this.c = 4;
                            copyAndClose = io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose((io.ktor.utils.io.ByteReadChannel) bodyAsChannel, writeChannel$default2, this);
                            if (copyAndClose != coroutine_suspended) {
                            }
                        } catch (kotlinx.coroutines.TimeoutCancellationException unused3) {
                            r2 = 1;
                            com.moloco.sdk.internal.error.b.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.a(r2 != 0), null, 2, null);
                            if (r2 != 0) {
                            }
                            throw new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p();
                        }
                    }
                    if (!((java.lang.Boolean) a2).booleanValue()) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.n.c;
                    }
                    if (this.f.exists()) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Deleting existing file and re-downloading it", null, false, 12, null);
                        this.f.delete();
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this;
                    java.lang.String str2 = this.e;
                    this.f7469a = i;
                    this.c = 2;
                    a3 = dVar.a(str2, this);
                    if (a3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) a3;
                    value = httpResponse.getStatus().getValue();
                    if (400 > value) {
                    }
                    value2 = httpResponse.getStatus().getValue();
                    if (500 > value2) {
                    }
                    this.b = httpResponse;
                    this.f7469a = 1;
                    this.c = 3;
                    bodyAsChannel = io.ktor.client.statement.HttpResponseKt.bodyAsChannel(httpResponse, this);
                    if (bodyAsChannel != coroutine_suspended) {
                    }
                } catch (kotlinx.coroutines.TimeoutCancellationException unused4) {
                    r2 = i;
                    com.moloco.sdk.internal.error.b.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.a(r2 != 0), null, 2, null);
                    if (r2 != 0) {
                    }
                    throw new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p();
                }
            } catch (java.lang.Exception e) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this.d, "Failed to fetch media from url: " + this.e, e, false, 8, null);
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o.a(e);
            }
        }
    }

    public d(com.moloco.sdk.internal.services.u connectivityService, com.moloco.sdk.internal.error.b errorReportingService, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f7468a = connectivityService;
        this.b = errorReportingService;
        this.c = httpClient;
        this.d = "LegacyMediaDownloader";
    }

    public static final long a(io.ktor.client.plugins.HttpRetryDelayContext delayMillis, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n
    public java.lang.Object a(java.lang.String str, java.io.File file, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a(str, file, null), continuation);
    }

    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.HttpClient httpClient = this.c;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        io.ktor.client.plugins.HttpRequestRetryKt.retry(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this, (io.ktor.client.plugins.HttpRequestRetryConfig) obj);
            }
        });
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final kotlin.Unit a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d dVar, io.ktor.client.plugins.HttpRequestRetryConfig retry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retry, "$this$retry");
        retry.setMaxRetries(10);
        io.ktor.client.plugins.HttpRequestRetryConfig.delayMillis$default(retry, false, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a((io.ktor.client.plugins.HttpRetryDelayContext) obj, ((java.lang.Integer) obj2).intValue()));
            }
        }, 1, null);
        retry.retryOnException(10, true);
        retry.retryOnServerErrors(10);
        retry.modifyRequest(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.this, (io.ktor.client.plugins.HttpRetryModifyRequestContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d dVar, io.ktor.client.plugins.HttpRetryModifyRequestContext modifyRequest, io.ktor.client.request.HttpRequestBuilder it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, dVar.d, "Retry attempt #" + modifyRequest.getRetryCount() + " for " + modifyRequest.getRequest().getUrl(), null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String a(boolean z) {
        if (z) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e.f7470a;
        }
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e.b;
    }
}
