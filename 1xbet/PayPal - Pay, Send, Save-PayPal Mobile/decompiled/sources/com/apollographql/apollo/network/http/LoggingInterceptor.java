package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/network/http/LoggingInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "Lcom/apollographql/apollo/network/http/LoggingInterceptor$Level;", "level", "Lkotlin/Function1;", "", "", "log", "<init>", "(Lcom/apollographql/apollo/network/http/LoggingInterceptor$Level;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "request", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "chain", "Lcom/apollographql/apollo/api/http/HttpResponse;", "intercept", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/network/http/LoggingInterceptor$Level;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Level"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoggingInterceptor implements com.apollographql.apollo.network.http.HttpInterceptor {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private final com.apollographql.apollo.network.http.LoggingInterceptor.Level getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public LoggingInterceptor(com.apollographql.apollo.network.http.LoggingInterceptor.Level level, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = level;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    public /* synthetic */ LoggingInterceptor(com.apollographql.apollo.network.http.LoggingInterceptor.Level level, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(level, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.network.http.LoggingInterceptor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.network.http.LoggingInterceptor.m9978$r8$lambda$0sEBAFSzTHpJBhaIQ2QUCt827E((java.lang.String) obj);
            }
        } : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoggingInterceptor(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        this(com.apollographql.apollo.network.http.LoggingInterceptor.Level.BODY, function1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    public /* synthetic */ LoggingInterceptor(kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.network.http.LoggingInterceptor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.network.http.LoggingInterceptor.$r8$lambda$TFz7gfJ3c_eq3T9Fbwc0y3gDaoU((java.lang.String) obj);
            }
        } : function1);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/apollographql/apollo/network/http/LoggingInterceptor$Level;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        public static final com.apollographql.apollo.network.http.LoggingInterceptor.Level BASIC;
        public static final com.apollographql.apollo.network.http.LoggingInterceptor.Level BODY;
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.apollographql.apollo.network.http.LoggingInterceptor.Level HEADERS;
        public static final com.apollographql.apollo.network.http.LoggingInterceptor.Level NONE;
        private static final /* synthetic */ com.apollographql.apollo.network.http.LoggingInterceptor.Level[] getHighSpeedVideoSizes;

        private Level(java.lang.String str, int i) {
        }

        static {
            com.apollographql.apollo.network.http.LoggingInterceptor.Level level = new com.apollographql.apollo.network.http.LoggingInterceptor.Level("NONE", 0);
            NONE = level;
            com.apollographql.apollo.network.http.LoggingInterceptor.Level level2 = new com.apollographql.apollo.network.http.LoggingInterceptor.Level("BASIC", 1);
            BASIC = level2;
            com.apollographql.apollo.network.http.LoggingInterceptor.Level level3 = new com.apollographql.apollo.network.http.LoggingInterceptor.Level("HEADERS", 2);
            HEADERS = level3;
            com.apollographql.apollo.network.http.LoggingInterceptor.Level level4 = new com.apollographql.apollo.network.http.LoggingInterceptor.Level("BODY", 3);
            BODY = level4;
            com.apollographql.apollo.network.http.LoggingInterceptor.Level[] levelArr = {level, level2, level3, level4};
            getHighSpeedVideoSizes = levelArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(levelArr);
        }

        public static com.apollographql.apollo.network.http.LoggingInterceptor.Level valueOf(java.lang.String str) {
            return (com.apollographql.apollo.network.http.LoggingInterceptor.Level) java.lang.Enum.valueOf(com.apollographql.apollo.network.http.LoggingInterceptor.Level.class, str);
        }

        public static com.apollographql.apollo.network.http.LoggingInterceptor.Level[] values() {
            return (com.apollographql.apollo.network.http.LoggingInterceptor.Level[]) getHighSpeedVideoSizes.clone();
        }

        public static kotlin.enums.EnumEntries<com.apollographql.apollo.network.http.LoggingInterceptor.Level> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object intercept(com.apollographql.apollo.api.http.HttpRequest httpRequest, com.apollographql.apollo.network.http.HttpInterceptorChain httpInterceptorChain, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) {
        com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2 loggingInterceptor$intercept$2;
        int i;
        int i2;
        int i3;
        if (continuation instanceof com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2) {
            loggingInterceptor$intercept$2 = (com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2) continuation;
            if ((loggingInterceptor$intercept$2.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                loggingInterceptor$intercept$2.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = loggingInterceptor$intercept$2.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingInterceptor$intercept$2.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoSizes == com.apollographql.apollo.network.http.LoggingInterceptor.Level.NONE) {
                        loggingInterceptor$intercept$2.getHighSpeedVideoSizes = 1;
                        java.lang.Object proceed = httpInterceptorChain.proceed(httpRequest, loggingInterceptor$intercept$2);
                        if (proceed != coroutine_suspended) {
                            return proceed;
                        }
                    } else {
                        int i4 = (this.getHighSpeedVideoSizes == com.apollographql.apollo.network.http.LoggingInterceptor.Level.HEADERS || this.getHighSpeedVideoSizes == com.apollographql.apollo.network.http.LoggingInterceptor.Level.BODY) ? 1 : 0;
                        int i5 = this.getHighSpeedVideoSizes != com.apollographql.apollo.network.http.LoggingInterceptor.Level.BODY ? 0 : 1;
                        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String name2 = httpRequest.getMethod().name();
                        java.lang.String url = httpRequest.getUrl();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(name2);
                        sb.append(" ");
                        sb.append(url);
                        function1.invoke(sb.toString());
                        if (i4 != 0) {
                            for (com.apollographql.apollo.api.http.HttpHeader httpHeader : httpRequest.getHeaders()) {
                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.String name3 = httpHeader.getName();
                                java.lang.String value = httpHeader.getValue();
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(name3);
                                sb2.append(": ");
                                sb2.append(value);
                                function12.invoke(sb2.toString());
                            }
                            this.getHighResolutionOutputSizeshNQ4ISI.invoke("[end of headers]");
                        }
                        com.apollographql.apollo.api.http.HttpBody body = httpRequest.getBody();
                        if (i5 != 0 && body != null) {
                            okio.Buffer buffer = new okio.Buffer();
                            body.writeTo(buffer);
                            okio.ByteString readByteString = buffer.readByteString();
                            this.getHighResolutionOutputSizeshNQ4ISI.invoke(readByteString.utf8());
                            httpRequest = com.apollographql.apollo.api.http.HttpRequest.newBuilder$default(httpRequest, null, null, 3, null).body(new com.apollographql.apollo.api.http.ByteStringHttpBody(body.getContentType(), readByteString)).build();
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.invoke("");
                        loggingInterceptor$intercept$2.getHighResolutionOutputSizeshNQ4ISI = i4;
                        loggingInterceptor$intercept$2.getHighSpeedVideoFpsRangesFor = i5;
                        loggingInterceptor$intercept$2.getHighSpeedVideoSizes = 2;
                        java.lang.Object proceed2 = httpInterceptorChain.proceed(httpRequest, loggingInterceptor$intercept$2);
                        if (proceed2 != coroutine_suspended) {
                            i2 = i4;
                            obj = proceed2;
                            i3 = i5;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = loggingInterceptor$intercept$2.getHighSpeedVideoFpsRangesFor;
                i2 = loggingInterceptor$intercept$2.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                com.apollographql.apollo.api.http.HttpResponse httpResponse = (com.apollographql.apollo.api.http.HttpResponse) obj;
                this.getHighResolutionOutputSizeshNQ4ISI.invoke("HTTP: ".concat(java.lang.String.valueOf(httpResponse.getStatusCode())));
                if (i2 != 0) {
                    for (com.apollographql.apollo.api.http.HttpHeader httpHeader2 : httpResponse.getHeaders()) {
                        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function13 = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String name4 = httpHeader2.getName();
                        java.lang.String value2 = httpHeader2.getValue();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(name4);
                        sb3.append(": ");
                        sb3.append(value2);
                        function13.invoke(sb3.toString());
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.invoke("[end of headers]");
                }
                final okio.BufferedSource body2 = httpResponse.getBody();
                return (i3 != 0 || body2 == null) ? httpResponse : new com.apollographql.apollo.api.http.HttpResponse.Builder(httpResponse.getStatusCode()).body(okio.Okio.buffer(new okio.Source() { // from class: com.apollographql.apollo.network.http.LoggingInterceptor$intercept$1

                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
                    private final okio.Buffer getHighSpeedVideoFpsRangesFor = new okio.Buffer();

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        okio.BufferedSource.this.close();
                    }

                    @Override // okio.Source
                    public final long read(okio.Buffer sink, long byteCount) {
                        kotlin.jvm.functions.Function1 function14;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                        okio.Buffer buffer2 = new okio.Buffer();
                        long read = okio.BufferedSource.this.read(buffer2, byteCount);
                        this.getHighSpeedVideoFpsRangesFor.writeAll(buffer2.peek());
                        while (true) {
                            java.lang.String readUtf8Line = this.getHighSpeedVideoFpsRangesFor.readUtf8Line();
                            if (readUtf8Line != null) {
                                function14 = this.getHighResolutionOutputSizeshNQ4ISI;
                                function14.invoke(readUtf8Line);
                            } else {
                                sink.writeAll(buffer2);
                                return read;
                            }
                        }
                    }

                    @Override // okio.Source
                    /* renamed from: timeout */
                    public final okio.Timeout getGetHighSpeedVideoFpsRanges() {
                        return okio.Timeout.NONE;
                    }
                })).addHeaders(httpResponse.getHeaders()).build();
            }
        }
        loggingInterceptor$intercept$2 = new com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2(this, continuation);
        java.lang.Object obj2 = loggingInterceptor$intercept$2.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingInterceptor$intercept$2.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.apollographql.apollo.api.http.HttpResponse httpResponse2 = (com.apollographql.apollo.api.http.HttpResponse) obj2;
        this.getHighResolutionOutputSizeshNQ4ISI.invoke("HTTP: ".concat(java.lang.String.valueOf(httpResponse2.getStatusCode())));
        if (i2 != 0) {
        }
        final okio.BufferedSource body22 = httpResponse2.getBody();
        if (i3 != 0) {
        }
    }

    /* renamed from: $r8$lambda$0sEBAFSz-THpJBhaIQ2QUCt827E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9978$r8$lambda$0sEBAFSzTHpJBhaIQ2QUCt827E(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.System.out.println((java.lang.Object) str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TFz7gfJ3c_eq3T9Fbwc0y3gDaoU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.System.out.println((java.lang.Object) str);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
