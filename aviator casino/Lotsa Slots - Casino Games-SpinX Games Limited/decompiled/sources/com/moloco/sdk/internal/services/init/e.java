package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.internal.services.init.d {
    public static final int j = 8;
    public final com.moloco.sdk.internal.services.y c;
    public final com.moloco.sdk.internal.services.InterfaceC3440k d;
    public final com.moloco.sdk.internal.services.usertracker.f e;
    public final java.lang.String f;
    public final long g;
    public final io.ktor.client.HttpClient h;
    public final android.net.Uri i;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitApiImpl", f = "InitApi.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {67, 157, 99}, m = "invoke", n = {"this", "appKey", "mediationInfo", "metricsRecorder", "httpRequestTimerEvent", "deviceInfo", "appInfo", "this", "metricsRecorder", "httpRequestTimerEvent", "this", "metricsRecorder", "httpRequestTimerEvent"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7285a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public /* synthetic */ java.lang.Object h;
        public int j;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.e.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.init.e.this.a(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitApiImpl$invoke$2", f = "InitApi.kt", i = {}, l = {androidx.compose.material.TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.Init.SDKInitResponse>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7286a;
        public final /* synthetic */ io.ktor.client.statement.HttpResponse b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.e.b> continuation) {
            super(2, continuation);
            this.b = httpResponse;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.Init.SDKInitResponse> continuation) {
            return ((com.moloco.sdk.internal.services.init.e.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.services.init.e.b(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.reflect.KType kType;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7286a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.f.f7287a, "Successful Init", null, false, 12, null);
                io.ktor.client.call.HttpClientCall call = this.b.getCall();
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                } catch (java.lang.Throwable unused) {
                    kType = null;
                }
                io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
                this.f7286a = 1;
                obj = call.bodyNullable(typeInfo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (obj != null) {
                return com.moloco.sdk.Init.SDKInitResponse.parseFrom((byte[]) obj);
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
        }
    }

    public e(com.moloco.sdk.internal.services.y deviceInfoService, com.moloco.sdk.internal.services.InterfaceC3440k appInfoService, com.moloco.sdk.internal.services.usertracker.f userTrackerService, java.lang.String sdkVersion, java.lang.String endpoint, long j2, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfoService, "appInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userTrackerService, "userTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.c = deviceInfoService;
        this.d = appInfoService;
        this.e = userTrackerService;
        this.f = sdkVersion;
        this.g = j2;
        this.h = httpClient;
        this.i = android.net.Uri.parse(endpoint);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016f A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #3 {Exception -> 0x0065, blocks: (B:31:0x0060, B:32:0x015d, B:34:0x016f, B:38:0x01ab, B:41:0x01b7, B:44:0x0203), top: B:30:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab A[Catch: Exception -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0065, blocks: (B:31:0x0060, B:32:0x015d, B:34:0x016f, B:38:0x01ab, B:41:0x01b7, B:44:0x0203), top: B:30:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // com.moloco.sdk.internal.services.init.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(java.lang.String str, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
        com.moloco.sdk.internal.services.init.e.a aVar;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        final com.moloco.sdk.internal.services.init.e eVar;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2;
        com.moloco.sdk.acm.TimerEvent timerEvent;
        java.lang.String str2;
        final com.moloco.sdk.publisher.MediationInfo mediationInfo2;
        final com.moloco.sdk.internal.services.C3439j c3439j;
        final com.moloco.sdk.internal.services.x xVar;
        com.moloco.sdk.internal.services.init.e eVar2;
        com.moloco.sdk.acm.TimerEvent timerEvent2;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3;
        io.ktor.http.HttpStatusCode status;
        io.ktor.http.HttpStatusCode.Companion companion;
        com.moloco.sdk.internal.v.a aVar2;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder4;
        com.moloco.sdk.internal.services.init.e eVar3;
        if (continuation instanceof com.moloco.sdk.internal.services.init.e.a) {
            aVar = (com.moloco.sdk.internal.services.init.e.a) continuation;
            int i2 = aVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.j = i2 - Integer.MIN_VALUE;
                obj = aVar.h;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.j;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.acm.TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.d.c());
                    try {
                        com.moloco.sdk.internal.services.x invoke = this.c.invoke();
                        com.moloco.sdk.internal.services.C3439j invoke2 = this.d.invoke();
                        com.moloco.sdk.internal.services.usertracker.f fVar = this.e;
                        aVar.f7285a = this;
                        str2 = str;
                        aVar.b = str2;
                        mediationInfo2 = mediationInfo;
                        aVar.c = mediationInfo2;
                        aVar.d = metricsRecorder;
                        aVar.e = startTimerEvent;
                        aVar.f = invoke;
                        aVar.g = invoke2;
                        aVar.j = 1;
                        java.lang.Object b2 = fVar.b(aVar);
                        if (b2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        metricsRecorder2 = metricsRecorder;
                        c3439j = invoke2;
                        eVar = this;
                        xVar = invoke;
                        obj = b2;
                        timerEvent = startTimerEvent;
                    } catch (java.lang.Exception e) {
                        e = e;
                        eVar = this;
                        metricsRecorder2 = metricsRecorder;
                        timerEvent = startTimerEvent;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            timerEvent2 = (com.moloco.sdk.acm.TimerEvent) aVar.c;
                            metricsRecorder3 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar.b;
                            eVar2 = (com.moloco.sdk.internal.services.init.e) aVar.f7285a;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                                status = httpResponse.getStatus();
                                companion = io.ktor.http.HttpStatusCode.INSTANCE;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(status, companion.getOK())) {
                                    metricsRecorder3.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success"));
                                    kotlin.coroutines.CoroutineContext io2 = com.moloco.sdk.internal.scheduling.b.a().getIo();
                                    com.moloco.sdk.internal.services.init.e.b bVar = new com.moloco.sdk.internal.services.init.e.b(httpResponse, null);
                                    aVar.f7285a = eVar2;
                                    aVar.b = metricsRecorder3;
                                    aVar.c = timerEvent2;
                                    aVar.j = 3;
                                    obj = kotlinx.coroutines.BuildersKt.withContext(io2, bVar, aVar);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    metricsRecorder4 = metricsRecorder3;
                                    eVar3 = eVar2;
                                    return new com.moloco.sdk.internal.v.b(obj);
                                }
                                if (kotlin.jvm.internal.Intrinsics.areEqual(status, companion.getNotFound())) {
                                    metricsRecorder3.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(status.getValue())));
                                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.f.f7287a, "http status " + status + ": App not found or AppKey is not correct", null, false, 12, null);
                                    aVar2 = new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.services.init.j.b(status.getValue()));
                                } else {
                                    metricsRecorder3.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(status.getValue())));
                                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.f.f7287a, "SDK Init failed with status code: " + status, null, false, 12, null);
                                    aVar2 = new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.services.init.j.b(status.getValue()));
                                }
                                return aVar2;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                eVar3 = eVar2;
                            }
                        } else {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            timerEvent2 = (com.moloco.sdk.acm.TimerEvent) aVar.c;
                            metricsRecorder4 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar.b;
                            eVar3 = (com.moloco.sdk.internal.services.init.e) aVar.f7285a;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                try {
                                    return new com.moloco.sdk.internal.v.b(obj);
                                } catch (java.lang.Exception e3) {
                                    e = e3;
                                    timerEvent = timerEvent2;
                                    metricsRecorder2 = metricsRecorder4;
                                    eVar = eVar3;
                                }
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                metricsRecorder3 = metricsRecorder4;
                            }
                        }
                        timerEvent = timerEvent2;
                        eVar = eVar3;
                        metricsRecorder2 = metricsRecorder3;
                        return eVar.a(e, timerEvent, metricsRecorder2);
                    }
                    c3439j = (com.moloco.sdk.internal.services.C3439j) aVar.g;
                    xVar = (com.moloco.sdk.internal.services.x) aVar.f;
                    timerEvent = (com.moloco.sdk.acm.TimerEvent) aVar.e;
                    metricsRecorder2 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar.d;
                    com.moloco.sdk.publisher.MediationInfo mediationInfo3 = (com.moloco.sdk.publisher.MediationInfo) aVar.c;
                    java.lang.String str3 = (java.lang.String) aVar.b;
                    eVar = (com.moloco.sdk.internal.services.init.e) aVar.f7285a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mediationInfo2 = mediationInfo3;
                        str2 = str3;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                    }
                }
                java.lang.String str4 = (java.lang.String) obj;
                com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.f.f7287a, "Requesting Init with appKey: " + str2 + ", mref: " + str4 + ", url: " + eVar.i, false, 4, null);
                io.ktor.client.HttpClient httpClient = eVar.h;
                java.lang.String uri = eVar.i.buildUpon().appendQueryParameter(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_APP_KEY, str2).appendQueryParameter("rid", str4).build().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, uri);
                io.ktor.client.request.HttpRequestKt.headers(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.services.init.e$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.moloco.sdk.internal.services.init.e.a(com.moloco.sdk.internal.services.init.e.this, xVar, mediationInfo2, c3439j, (io.ktor.http.HeadersBuilder) obj2);
                    }
                });
                com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, eVar.g);
                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                aVar.f7285a = eVar;
                aVar.b = metricsRecorder2;
                aVar.c = timerEvent;
                aVar.d = null;
                aVar.e = null;
                aVar.f = null;
                aVar.g = null;
                aVar.j = 2;
                obj = httpStatement.execute(aVar);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                eVar2 = eVar;
                timerEvent2 = timerEvent;
                metricsRecorder3 = metricsRecorder2;
                io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
                status = httpResponse2.getStatus();
                companion = io.ktor.http.HttpStatusCode.INSTANCE;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(status, companion.getOK())) {
                }
            }
        }
        aVar = new com.moloco.sdk.internal.services.init.e.a(continuation);
        obj = aVar.h;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.j;
        if (i != 0) {
        }
        java.lang.String str42 = (java.lang.String) obj;
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.f.f7287a, "Requesting Init with appKey: " + str2 + ", mref: " + str42 + ", url: " + eVar.i, false, 4, null);
        io.ktor.client.HttpClient httpClient2 = eVar.h;
        java.lang.String uri2 = eVar.i.buildUpon().appendQueryParameter(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_APP_KEY, str2).appendQueryParameter("rid", str42).build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder2, uri2);
        io.ktor.client.request.HttpRequestKt.headers(httpRequestBuilder2, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.services.init.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.moloco.sdk.internal.services.init.e.a(com.moloco.sdk.internal.services.init.e.this, xVar, mediationInfo2, c3439j, (io.ktor.http.HeadersBuilder) obj2);
            }
        });
        com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder2, eVar.g);
        httpRequestBuilder2.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        io.ktor.client.statement.HttpStatement httpStatement2 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder2, httpClient2);
        aVar.f7285a = eVar;
        aVar.b = metricsRecorder2;
        aVar.c = timerEvent;
        aVar.d = null;
        aVar.e = null;
        aVar.f = null;
        aVar.g = null;
        aVar.j = 2;
        obj = httpStatement2.execute(aVar);
        if (obj != coroutine_suspended) {
        }
    }

    public static final kotlin.Unit a(com.moloco.sdk.internal.services.init.e eVar, com.moloco.sdk.internal.services.x xVar, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.internal.services.C3439j c3439j, io.ktor.http.HeadersBuilder headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "$this$headers");
        com.moloco.sdk.internal.n.a(headers, eVar.f, xVar.x(), mediationInfo);
        java.lang.String b2 = c3439j.b();
        if (kotlin.jvm.internal.Intrinsics.areEqual(b2, "com.example.demo2")) {
            b2 = "com.trickytribe.penetrator";
        }
        headers.append("X-Moloco-App-Bundle", b2);
        return kotlin.Unit.INSTANCE;
    }

    public final com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> a(java.lang.Exception exc, com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        com.moloco.sdk.internal.services.init.b bVar;
        if (exc instanceof io.ktor.client.plugins.HttpRequestTimeoutException) {
            bVar = com.moloco.sdk.internal.services.init.b.f7281a;
        } else if (exc instanceof javax.net.ssl.SSLHandshakeException) {
            bVar = com.moloco.sdk.internal.services.init.b.d;
        } else if (exc instanceof java.net.SocketException) {
            bVar = com.moloco.sdk.internal.services.init.b.c;
        } else {
            bVar = exc instanceof java.net.UnknownHostException ? com.moloco.sdk.internal.services.init.b.b : com.moloco.sdk.internal.services.init.b.f;
        }
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.f.f7287a, "SDK Init failed with client exception", exc, false, 8, null);
        metricsRecorder.recordTimerEvent(timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), bVar.name()));
        return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.services.init.j.a(bVar));
    }
}
