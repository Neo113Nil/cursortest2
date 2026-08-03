package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.internal.services.bidtoken.InterfaceC3430a {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7217a;
    public final io.ktor.client.HttpClient b;
    public final com.moloco.sdk.internal.services.bidtoken.j c;
    public final com.moloco.sdk.internal.services.bidtoken.g d;
    public final java.lang.String e;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenApiImpl$fetchBidToken$2", f = "BidTokenApi.kt", i = {0, 0, 0, 1}, l = {80, 127}, m = "invokeSuspend", n = {"lastResult", "serverBidTokenApiTimer", "attempt", "lastResult"}, s = {"L$0", "L$3", "I$2", "L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.services.bidtoken.k, com.moloco.sdk.internal.m>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7218a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public int e;
        public int f;
        public int g;
        public int h;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.c.a> continuation) {
            super(2, continuation);
            this.j = metricsRecorder;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.services.bidtoken.k, com.moloco.sdk.internal.m>> continuation) {
            return ((com.moloco.sdk.internal.services.bidtoken.c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.bidtoken.c.this.new a(this.j, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
        /* JADX WARN: Type inference failed for: r10v1, types: [T, com.moloco.sdk.internal.v, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.moloco.sdk.internal.v$a] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x01e7 -> B:6:0x01ea). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder;
            com.moloco.sdk.internal.services.bidtoken.c cVar;
            int i;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            int i2;
            kotlin.jvm.internal.Ref.ObjectRef objectRef2;
            java.lang.Object obj2;
            com.moloco.sdk.acm.TimerEvent timerEvent;
            int i3;
            ?? r10;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.h;
            int i5 = 1;
            if (i4 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef3.element = new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("retry max parameter is 0", com.moloco.sdk.publisher.MolocoAdError.ErrorType.UNKNOWN.getErrorCode()));
                int e = com.moloco.sdk.internal.services.bidtoken.c.this.c.e();
                com.moloco.sdk.internal.services.bidtoken.c cVar2 = com.moloco.sdk.internal.services.bidtoken.c.this;
                metricsRecorder = this.j;
                cVar = cVar2;
                i = e;
                objectRef = objectRef3;
                i2 = 0;
                if (i2 < i) {
                }
            } else if (i4 == 1) {
                i2 = this.g;
                i3 = this.f;
                i = this.e;
                com.moloco.sdk.acm.TimerEvent timerEvent2 = (com.moloco.sdk.acm.TimerEvent) this.d;
                metricsRecorder = (com.moloco.sdk.acm.recorder.MetricsRecorder) this.c;
                com.moloco.sdk.internal.services.bidtoken.c cVar3 = (com.moloco.sdk.internal.services.bidtoken.c) this.b;
                kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.f7218a;
                kotlin.ResultKt.throwOnFailure(obj);
                objectRef2 = objectRef4;
                obj2 = obj;
                timerEvent = timerEvent2;
                cVar = cVar3;
                r10 = (com.moloco.sdk.internal.v) obj2;
                objectRef2.element = r10;
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, cVar.e, "Received bidtoken fetch result: " + ((java.lang.Object) r10), null, false, 12, null);
                if (r10 instanceof com.moloco.sdk.internal.v.a) {
                }
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = this.f;
                int i7 = this.e;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = (com.moloco.sdk.acm.recorder.MetricsRecorder) this.c;
                cVar = (com.moloco.sdk.internal.services.bidtoken.c) this.b;
                kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.f7218a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj3 = coroutine_suspended;
                i = i7;
                objectRef = objectRef5;
                metricsRecorder = metricsRecorder2;
                i2 = i6 + i5;
                coroutine_suspended = obj3;
                if (i2 < i) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, cVar.e, "Fetching bidtoken, attempt #" + i2, null, false, 12, null);
                    timerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.n.c());
                    this.f7218a = objectRef;
                    this.b = cVar;
                    this.c = metricsRecorder;
                    this.d = timerEvent;
                    this.e = i;
                    this.f = i2;
                    this.g = i2;
                    this.h = i5;
                    obj2 = cVar.a(com.moloco.sdk.internal.services.bidtoken.d.f7220a, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef;
                    i3 = i2;
                    r10 = (com.moloco.sdk.internal.v) obj2;
                    objectRef2.element = r10;
                    com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, cVar.e, "Received bidtoken fetch result: " + ((java.lang.Object) r10), null, false, 12, null);
                    if (r10 instanceof com.moloco.sdk.internal.v.a) {
                        if (!(r10 instanceof com.moloco.sdk.internal.v.b)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                        com.moloco.sdk.acm.TimerEvent withTag = timerEvent.withTag(dVar.c(), "success");
                        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f;
                        metricsRecorder.recordTimerEvent(withTag.withTag(dVar2.c(), java.lang.String.valueOf(i2)));
                        metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.w.c()).withTag(dVar.c(), "success").withTag(dVar2.c(), java.lang.String.valueOf(i2)));
                        return r10;
                    }
                    int b = ((com.moloco.sdk.internal.m) ((com.moloco.sdk.internal.v.a) r10).a()).b();
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    com.moloco.sdk.acm.TimerEvent withTag2 = timerEvent.withTag(dVar3.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    com.moloco.sdk.acm.TimerEvent withTag3 = withTag2.withTag(dVar4.c(), java.lang.String.valueOf(b));
                    com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.f;
                    java.lang.Object obj4 = coroutine_suspended;
                    metricsRecorder.recordTimerEvent(withTag3.withTag(dVar5.c(), java.lang.String.valueOf(i2)));
                    metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.w.c()).withTag(dVar3.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar4.c(), java.lang.String.valueOf(b)).withTag(dVar5.c(), java.lang.String.valueOf(i2)));
                    if (400 <= b && b < 500 && b != 429) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, cVar.e, "Received 4xx error: " + b, null, false, 12, null);
                        return r10;
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, cVar.e, "Received non-4xx or " + b + " error: " + b, null, false, 12, null);
                    long d = cVar.c.d() * ((long) (i2 + 1));
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, cVar.e, "Retrying after delay: " + d, null, false, 12, null);
                    this.f7218a = objectRef2;
                    this.b = cVar;
                    this.c = metricsRecorder;
                    this.d = null;
                    this.e = i;
                    this.f = i3;
                    this.h = 2;
                    java.lang.Object delay = kotlinx.coroutines.DelayKt.delay(d, this);
                    obj3 = obj4;
                    if (delay == obj3) {
                        return obj3;
                    }
                    i6 = i3;
                    objectRef = objectRef2;
                    i5 = 1;
                    i2 = i6 + i5;
                    coroutine_suspended = obj3;
                    if (i2 < i) {
                        return objectRef.element;
                    }
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenApiImpl", f = "BidTokenApi.kt", i = {0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE}, m = "fetchBidTokenWork", n = {"this"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7219a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.c.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.bidtoken.c.this.a((java.lang.String) null, this);
        }
    }

    public c(java.lang.String sdkVersion, io.ktor.client.HttpClient httpClient, com.moloco.sdk.internal.services.bidtoken.j httpRequestInfo, com.moloco.sdk.internal.services.bidtoken.g deviceRequestInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfo, "httpRequestInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRequestInfo, "deviceRequestInfo");
        this.f7217a = sdkVersion;
        this.b = httpClient;
        this.c = httpRequestInfo;
        this.d = deviceRequestInfo;
        this.e = "BidTokenApi";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.InterfaceC3430a
    public java.lang.Object a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.services.bidtoken.k, com.moloco.sdk.internal.m>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.bidtoken.c.a(metricsRecorder, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0107 A[Catch: InvalidProtocolBufferException -> 0x0030, TryCatch #3 {InvalidProtocolBufferException -> 0x0030, blocks: (B:11:0x002b, B:13:0x0107, B:16:0x0131, B:17:0x0138, B:26:0x00e7, B:29:0x00f5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0131 A[Catch: InvalidProtocolBufferException -> 0x0030, TryCatch #3 {InvalidProtocolBufferException -> 0x0030, blocks: (B:11:0x002b, B:13:0x0107, B:16:0x0131, B:17:0x0138, B:26:0x00e7, B:29:0x00f5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7 A[Catch: InvalidProtocolBufferException -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #3 {InvalidProtocolBufferException -> 0x0030, blocks: (B:11:0x002b, B:13:0x0107, B:16:0x0131, B:17:0x0138, B:26:0x00e7, B:29:0x00f5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.services.bidtoken.k, com.moloco.sdk.internal.m>> continuation) {
        com.moloco.sdk.internal.services.bidtoken.c.b bVar;
        int i;
        com.moloco.sdk.internal.services.bidtoken.c cVar;
        kotlin.reflect.KType kType;
        kotlin.reflect.KType kType2;
        io.ktor.client.statement.HttpResponse httpResponse;
        kotlin.reflect.KType kType3;
        try {
            if (continuation instanceof com.moloco.sdk.internal.services.bidtoken.c.b) {
                bVar = (com.moloco.sdk.internal.services.bidtoken.c.b) continuation;
                int i2 = bVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = bVar.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            io.ktor.client.HttpClient httpClient = this.b;
                            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                            io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
                            io.ktor.client.request.HttpRequestKt.headers(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.services.bidtoken.c$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.moloco.sdk.internal.services.bidtoken.c.a(com.moloco.sdk.internal.services.bidtoken.c.this, (io.ktor.http.HeadersBuilder) obj2);
                                }
                            });
                            io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder, io.ktor.http.ContentType.Application.INSTANCE.getProtoBuf());
                            byte[] a2 = a();
                            if (a2 == null) {
                                httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
                                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                                try {
                                    kType2 = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                                } catch (java.lang.Throwable unused) {
                                    kType2 = null;
                                }
                                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType2));
                            } else if (a2 instanceof io.ktor.http.content.OutgoingContent) {
                                httpRequestBuilder.setBody(a2);
                                httpRequestBuilder.setBodyType(null);
                            } else {
                                httpRequestBuilder.setBody(a2);
                                kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                                try {
                                    kType = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                                } catch (java.lang.Throwable unused2) {
                                    kType = null;
                                }
                                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType));
                            }
                            com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, this.c.f());
                            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                            io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                            bVar.f7219a = this;
                            bVar.d = 1;
                            obj = httpStatement.execute(bVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            cVar = this;
                        } catch (io.ktor.client.plugins.HttpRequestTimeoutException e) {
                            e = e;
                            cVar = this;
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, cVar.e, "Request timeout exception", e, false, 8, null);
                            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("bidtoken request failed due to timeout", com.moloco.sdk.internal.services.bidtoken.EnumC3431b.c.c()));
                        } catch (java.net.UnknownHostException e2) {
                            e = e2;
                            cVar = this;
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, cVar.e, "Unknown Host Request exception", e, false, 8, null);
                            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("bidtoken request failed due to not being able to connect to host", com.moloco.sdk.internal.services.bidtoken.EnumC3431b.d.c()));
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            cVar = this;
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, cVar.e, "Bid Token API Request exception", e, false, 8, null);
                            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("bidtoken request failed due to unknown exception", com.moloco.sdk.internal.services.bidtoken.EnumC3431b.b.c()));
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                                com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom = com.moloco.sdk.BidToken.BidTokenResponseV3.parseFrom((byte[]) obj);
                                java.lang.String bidToken = parseFrom.getBidToken();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidToken, "getBidToken(...)");
                                java.lang.String pk = parseFrom.getPk();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pk, "getPk(...)");
                                kotlin.jvm.internal.Intrinsics.checkNotNull(parseFrom);
                                return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.services.bidtoken.k(bidToken, pk, com.moloco.sdk.internal.services.bidtoken.e.a(parseFrom)));
                            }
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                        cVar = (com.moloco.sdk.internal.services.bidtoken.c) bVar.f7219a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (io.ktor.client.plugins.HttpRequestTimeoutException e4) {
                            e = e4;
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, cVar.e, "Request timeout exception", e, false, 8, null);
                            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("bidtoken request failed due to timeout", com.moloco.sdk.internal.services.bidtoken.EnumC3431b.c.c()));
                        } catch (java.net.UnknownHostException e5) {
                            e = e5;
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, cVar.e, "Unknown Host Request exception", e, false, 8, null);
                            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("bidtoken request failed due to not being able to connect to host", com.moloco.sdk.internal.services.bidtoken.EnumC3431b.d.c()));
                        } catch (java.lang.Exception e6) {
                            e = e6;
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, cVar.e, "Bid Token API Request exception", e, false, 8, null);
                            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("bidtoken request failed due to unknown exception", com.moloco.sdk.internal.services.bidtoken.EnumC3431b.b.c()));
                        }
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                        io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                        kotlin.reflect.KClass orCreateKotlinClass3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                        try {
                            kType3 = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                        } catch (java.lang.Throwable unused3) {
                            kType3 = null;
                        }
                        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass3, kType3);
                        bVar.f7219a = null;
                        bVar.d = 2;
                        obj = call.bodyNullable(typeInfo, bVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (obj == null) {
                        }
                    } else {
                        return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("bidtoken request failed", httpResponse.getStatus().getValue()));
                    }
                }
            }
            if (i != 0) {
            }
            httpResponse = (io.ktor.client.statement.HttpResponse) obj;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e7) {
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Bidtoken parsing failed. Reason: " + e7, io.ktor.http.HttpStatusCode.INSTANCE.getBadRequest().getValue()));
        }
        bVar = new com.moloco.sdk.internal.services.bidtoken.c.b(continuation);
        java.lang.Object obj2 = bVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
    }

    public static final kotlin.Unit a(com.moloco.sdk.internal.services.bidtoken.c cVar, io.ktor.http.HeadersBuilder headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "$this$headers");
        com.moloco.sdk.internal.n.a(headers, cVar.f7217a, cVar.d.j(), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public final byte[] a() {
        byte[] byteArray = com.moloco.sdk.BidToken.BidTokenRequestV3.newBuilder().build().toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
