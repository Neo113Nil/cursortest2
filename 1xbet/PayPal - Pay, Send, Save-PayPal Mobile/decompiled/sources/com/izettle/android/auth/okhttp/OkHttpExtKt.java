package com.izettle.android.auth.okhttp;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\f\u001a\u00060\nj\u0002`\u000b*\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010*\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015*\u0006\u0012\u0002\b\u00030\u0013¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u000e*\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0018\u0010\u0019\u001a*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u001a*\u00060\u0014j\u0002`\u0015H\u0086\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u00060\u0014j\u0002`\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001c\u0010 \u001a\u0019\u0010#\u001a\u00020!*\u00020!2\u0006\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010'\u001a\u00020&*\u00020%¢\u0006\u0004\b'\u0010(*\f\b\u0000\u0010)\"\u00020\u00052\u00020\u0005*\f\b\u0000\u0010*\"\u00020\n2\u00020\n*\f\b\u0000\u0010+\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u0010-\"\u00020,2\u00020,*\f\b\u0000\u0010/\"\u00020.2\u00020.*\f\b\u0000\u00100\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00102\"\u0002012\u000201*\f\b\u0000\u00104\"\u0002032\u000203"}, d2 = {"Lokhttp3/OkHttpClient;", "Lcom/izettle/android/net/HttpClient;", "asHttpClient", "(Lokhttp3/OkHttpClient;)Lcom/izettle/android/net/HttpClient;", "Lcom/izettle/android/net/Authenticator;", "Lokhttp3/Authenticator;", "Lcom/izettle/android/auth/okhttp/OkHttpAuthenticator;", "asOkHttpAuthenticator", "(Lcom/izettle/android/net/Authenticator;)Lokhttp3/Authenticator;", "Lcom/izettle/android/net/Interceptor;", "Lokhttp3/Interceptor;", "Lcom/izettle/android/auth/okhttp/OkHttpInterceptor;", "asOkHttpInterceptor", "(Lcom/izettle/android/net/Interceptor;)Lokhttp3/Interceptor;", "Lcom/izettle/android/net/Request;", "Lokhttp3/Request;", "Lcom/izettle/android/auth/okhttp/OkHttpRequest;", "asOkHttpRequest", "(Lcom/izettle/android/net/Request;)Lokhttp3/Request;", "Lcom/izettle/android/net/Response;", "Lokhttp3/Response;", "Lcom/izettle/android/auth/okhttp/OkHttpResponse;", "asOkHttpResponse", "(Lcom/izettle/android/net/Response;)Lokhttp3/Response;", "asRequest", "(Lokhttp3/Request;)Lcom/izettle/android/net/Request;", "", "T", "asResponse", "(Lokhttp3/Response;)Lcom/izettle/android/net/Response;", "Lkotlin/reflect/KClass;", "responseBodyType", "(Lokhttp3/Response;Lkotlin/reflect/KClass;)Lcom/izettle/android/net/Response;", "Lcom/izettle/android/auth/ZettleAuth$Configuration$Builder;", "okHttpClient", "setOkHttpClient", "(Lcom/izettle/android/auth/ZettleAuth$Configuration$Builder;Lokhttp3/OkHttpClient;)Lcom/izettle/android/auth/ZettleAuth$Configuration$Builder;", "Lokhttp3/MediaType;", "Lcom/izettle/android/net/ContentType;", "toContentType", "(Lokhttp3/MediaType;)Lcom/izettle/android/net/ContentType;", "OkHttpAuthenticator", "OkHttpInterceptor", "OkHttpRequest", "Lokhttp3/RequestBody;", "OkHttpRequestBody", "Lokhttp3/Request$Builder;", "OkHttpRequestBuilder", "OkHttpResponse", "Lokhttp3/ResponseBody;", "OkHttpResponseBody", "Lokhttp3/Response$Builder;", "OkHttpResponseBuilder"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpExtKt {
    public static final com.izettle.android.auth.ZettleAuth.Configuration.Builder setOkHttpClient(com.izettle.android.auth.ZettleAuth.Configuration.Builder builder, okhttp3.OkHttpClient okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        builder.m10803setHttpClient(asHttpClient(okHttpClient));
        return builder;
    }

    public static final com.izettle.android.net.HttpClient asHttpClient(okhttp3.OkHttpClient okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        return new com.izettle.android.auth.okhttp.OkHttpClientWrapper(okHttpClient, com.izettle.android.serialization.JsonDeserializer.INSTANCE.create(), null, 0L, 0L, null, null, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    public static final okhttp3.Request asOkHttpRequest(com.izettle.android.net.Request request) {
        java.lang.String joinToString$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        okhttp3.Headers.Companion companion = okhttp3.Headers.INSTANCE;
        com.izettle.android.net.Headers headers = request.getHeaders();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(headers.size()));
        java.util.Iterator<T> it = headers.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), kotlin.collections.CollectionsKt.joinToString$default((java.util.List) entry.getValue(), ",", null, null, 0, null, null, 62, null));
        }
        okhttp3.Request.Builder headers2 = builder.headers(companion.of(linkedHashMap));
        java.lang.String value = request.getMethod().getValue();
        com.izettle.android.net.RequestBody body = request.getBody();
        com.izettle.android.auth.okhttp.InputStreamRequestBody inputStreamRequestBody = null;
        r4 = null;
        okhttp3.MediaType mediaType = null;
        if (body != null) {
            java.util.List<java.lang.String> list = request.getHeaders().get("Content-Type");
            if (list != null && (joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null)) != null) {
                mediaType = okhttp3.MediaType.INSTANCE.parse(joinToString$default);
            }
            inputStreamRequestBody = new com.izettle.android.auth.okhttp.InputStreamRequestBody(mediaType, body.getInputStream(), body.getContentLength());
        }
        return headers2.method(value, inputStreamRequestBody).url(request.getUrl().getUrl()).build();
    }

    public static final okhttp3.Response asOkHttpResponse(com.izettle.android.net.Response<?> response) {
        java.lang.String joinToString$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        okhttp3.Response.Builder builder = new okhttp3.Response.Builder();
        okhttp3.Headers.Companion companion = okhttp3.Headers.INSTANCE;
        com.izettle.android.net.Headers headers = response.getHeaders();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(headers.size()));
        java.util.Iterator<T> it = headers.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), kotlin.collections.CollectionsKt.joinToString$default((java.util.List) entry.getValue(), ",", null, null, 0, null, null, 62, null));
        }
        okhttp3.Response.Builder headers2 = builder.headers(companion.of(linkedHashMap));
        okhttp3.ResponseBody.Companion companion2 = okhttp3.ResponseBody.INSTANCE;
        java.lang.String valueOf = java.lang.String.valueOf(response.getBody());
        java.util.List<java.lang.String> list = response.getHeaders().get((java.lang.Object) "Content-Type");
        return headers2.body(companion2.create(valueOf, (list == null || (joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null)) == null) ? null : okhttp3.MediaType.INSTANCE.parse(joinToString$default))).protocol(okhttp3.Protocol.HTTP_1_1).code(response.getCode()).message(java.lang.String.valueOf(response.getCode())).request(asOkHttpRequest(response.getRequest())).build();
    }

    public static final com.izettle.android.net.ContentType toContentType(okhttp3.MediaType mediaType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
        java.lang.String type = mediaType.type();
        java.lang.String subtype = mediaType.subtype();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(type);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(subtype);
        return new com.izettle.android.net.ContentType(sb.toString(), okhttp3.MediaType.charset$default(mediaType, null, 1, null));
    }

    public static final com.izettle.android.net.Request asRequest(final okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return com.izettle.android.net.RequestKt.request(new kotlin.jvm.functions.Function1<com.izettle.android.net.Request.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.okhttp.OkHttpExtKt$asRequest$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Request.Builder builder) {
                getHighSpeedVideoFpsRanges(builder);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.izettle.android.net.Request.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                builder.setMethod(com.izettle.android.net.HttpMethod.valueOf(okhttp3.Request.this.method()));
                builder.setUrl(com.izettle.android.net.HttpUrl.INSTANCE.parse(okhttp3.Request.this.url().toString()));
                okhttp3.RequestBody body = okhttp3.Request.this.body();
                if (body != null) {
                    com.izettle.android.net.RequestBody.Companion companion = com.izettle.android.net.RequestBody.INSTANCE;
                    okio.Buffer buffer = new okio.Buffer();
                    body.writeTo(buffer);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    java.io.InputStream inputStream = buffer.inputStream();
                    okhttp3.MediaType contentType = body.getContentType();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(contentType);
                    builder.setBody(companion.from(inputStream, com.izettle.android.auth.okhttp.OkHttpExtKt.toContentType(contentType), body.getContentLength()));
                }
                final okhttp3.Request request2 = okhttp3.Request.this;
                builder.headers(new kotlin.jvm.functions.Function1<com.izettle.android.net.Headers, kotlin.Unit>() { // from class: com.izettle.android.auth.okhttp.OkHttpExtKt$asRequest$1.2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Headers headers) {
                        getHighResolutionOutputSizeshNQ4ISI(headers);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighResolutionOutputSizeshNQ4ISI(com.izettle.android.net.Headers headers) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
                        java.util.Iterator<T> it = okhttp3.Request.this.headers().toMultimap().entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            final java.lang.String str = (java.lang.String) entry.getKey();
                            for (final java.lang.String str2 : (java.util.List) entry.getValue()) {
                                headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.okhttp.OkHttpExtKt$asRequest$1$2$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                        Camera2StreamConfigurationMap(builder2);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void Camera2StreamConfigurationMap(com.izettle.android.net.Header.Builder builder2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                        builder2.setName(str);
                                        builder2.setValue(str2);
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                });
                            }
                        }
                    }

                    {
                        super(1);
                    }
                });
            }

            {
                super(1);
            }
        });
    }

    public static final okhttp3.Interceptor asOkHttpInterceptor(final com.izettle.android.net.Interceptor interceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
        return new okhttp3.Interceptor() { // from class: com.izettle.android.auth.okhttp.OkHttpExtKt$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                okhttp3.Response asOkHttpInterceptor$lambda$4;
                asOkHttpInterceptor$lambda$4 = com.izettle.android.auth.okhttp.OkHttpExtKt.asOkHttpInterceptor$lambda$4(com.izettle.android.net.Interceptor.this, chain);
                return asOkHttpInterceptor$lambda$4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.Response asOkHttpInterceptor$lambda$4(com.izettle.android.net.Interceptor interceptor, final okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        return asOkHttpResponse(interceptor.intercept(new com.izettle.android.net.Interceptor.Chain() { // from class: com.izettle.android.auth.okhttp.OkHttpExtKt$asOkHttpInterceptor$1$1
            private final com.izettle.android.net.Request request;

            {
                this.request = com.izettle.android.auth.okhttp.OkHttpExtKt.asRequest(okhttp3.Interceptor.Chain.this.request());
            }

            @Override // com.izettle.android.net.Interceptor.Chain
            public final com.izettle.android.net.Request getRequest() {
                return this.request;
            }

            @Override // com.izettle.android.net.Interceptor.Chain
            public final com.izettle.android.net.Response<java.lang.String> proceed(com.izettle.android.net.Request request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
                return com.izettle.android.auth.okhttp.OkHttpExtKt.asResponse(okhttp3.Interceptor.Chain.this.proceed(com.izettle.android.auth.okhttp.OkHttpExtKt.asOkHttpRequest(request)), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class));
            }
        }));
    }

    public static final okhttp3.Authenticator asOkHttpAuthenticator(final com.izettle.android.net.Authenticator authenticator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "");
        return new okhttp3.Authenticator() { // from class: com.izettle.android.auth.okhttp.OkHttpExtKt$$ExternalSyntheticLambda1
            @Override // okhttp3.Authenticator
            public final okhttp3.Request authenticate(okhttp3.Route route, okhttp3.Response response) {
                okhttp3.Request asOkHttpAuthenticator$lambda$5;
                asOkHttpAuthenticator$lambda$5 = com.izettle.android.auth.okhttp.OkHttpExtKt.asOkHttpAuthenticator$lambda$5(com.izettle.android.net.Authenticator.this, route, response);
                return asOkHttpAuthenticator$lambda$5;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[LOOP:0: B:16:0x007c->B:18:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> com.izettle.android.net.Response<T> asResponse(okhttp3.Response response, kotlin.reflect.KClass<T> kClass) {
        java.lang.Object obj;
        okhttp3.ResponseBody body;
        java.lang.String string;
        java.util.Iterator<T> it;
        okhttp3.ResponseBody body2;
        java.lang.String str;
        java.lang.Object deserialize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        int code = response.code();
        if (response.getIsSuccessful() && (body2 = response.body()) != null) {
            try {
                str = body2.string();
            } catch (java.lang.Exception unused) {
                str = null;
            }
            if (str != null) {
                if (java.lang.String.class.isAssignableFrom(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass))) {
                    deserialize = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).cast(str);
                } else {
                    deserialize = com.izettle.android.serialization.JsonDeserializer.INSTANCE.create().deserialize(str, kClass);
                }
                obj = deserialize;
                if (!response.getIsSuccessful()) {
                    try {
                        body = response.body();
                    } catch (java.lang.Exception unused2) {
                    }
                    if (body != null) {
                        string = body.string();
                        com.izettle.android.net.Headers headers = new com.izettle.android.net.Headers();
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap = response.headers().toMultimap();
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(multimap.size()));
                        it = multimap.entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            linkedHashMap.put(entry.getKey(), kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) entry.getValue()));
                        }
                        headers.putAll(linkedHashMap);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        return new com.izettle.android.net.Response<>(code, obj, string, headers, asRequest(response.request()), null, 32, null);
                    }
                }
                string = null;
                com.izettle.android.net.Headers headers2 = new com.izettle.android.net.Headers();
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap2 = response.headers().toMultimap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(multimap2.size()));
                it = multimap2.entrySet().iterator();
                while (it.hasNext()) {
                }
                headers2.putAll(linkedHashMap2);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                return new com.izettle.android.net.Response<>(code, obj, string, headers2, asRequest(response.request()), null, 32, null);
            }
        }
        obj = null;
        if (!response.getIsSuccessful()) {
        }
        string = null;
        com.izettle.android.net.Headers headers22 = new com.izettle.android.net.Headers();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap22 = response.headers().toMultimap();
        java.util.LinkedHashMap linkedHashMap22 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(multimap22.size()));
        it = multimap22.entrySet().iterator();
        while (it.hasNext()) {
        }
        headers22.putAll(linkedHashMap22);
        kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
        return new com.izettle.android.net.Response<>(code, obj, string, headers22, asRequest(response.request()), null, 32, null);
    }

    public static final /* synthetic */ <T> com.izettle.android.net.Response<T> asResponse(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return asResponse(response, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.Request asOkHttpAuthenticator$lambda$5(com.izettle.android.net.Authenticator authenticator, okhttp3.Route route, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        com.izettle.android.net.Request authenticate = authenticator.authenticate(asResponse(response, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class)));
        if (authenticate != null) {
            return asOkHttpRequest(authenticate);
        }
        return null;
    }
}
