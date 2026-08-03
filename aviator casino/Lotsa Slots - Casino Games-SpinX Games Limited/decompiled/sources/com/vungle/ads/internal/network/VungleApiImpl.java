package com.vungle.ads.internal.network;

/* compiled from: VungleApiImpl.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J<\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0019H\u0002JF\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J(\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiImpl;", "Lcom/vungle/ads/internal/network/VungleApi;", "okHttpClient", "Lokhttp3/Call$Factory;", "(Lokhttp3/Call$Factory;)V", "emptyResponseConverter", "Lcom/vungle/ads/internal/network/converters/EmptyResponseConverter;", "getOkHttpClient$vungle_ads_release", "()Lokhttp3/Call$Factory;", "ads", "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/AdPayload;", com.ironsource.M6.d0, "", "path", "body", "Lcom/vungle/ads/internal/model/CommonRequestBody;", com.helpshift.proactive.InAppViewConstants.CONFIG, "Lcom/vungle/ads/internal/model/ConfigPayload;", "defaultBuilder", "Lokhttp3/Request$Builder;", "placementReferenceId", "headers", "", "defaultProtoBufBuilder", "Lokhttp3/HttpUrl;", "pingTPAT", "Ljava/lang/Void;", "url", "requestType", "Lcom/vungle/ads/internal/network/HttpMethod;", "requestBody", "Lokhttp3/RequestBody;", "ri", "sendAdMarkup", "sendErrors", "sendMetrics", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleApiImpl implements com.vungle.ads.internal.network.VungleApi {
    private static final java.lang.String VUNGLE_VERSION = "7.1.0";
    private final com.vungle.ads.internal.network.converters.EmptyResponseConverter emptyResponseConverter;
    private final okhttp3.Call.Factory okHttpClient;
    private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.network.VungleApiImpl$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kotlinx.serialization.json.JsonBuilder Json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
            Json.setAllowStructuredMapKeys(true);
        }
    }, 1, null);

    /* compiled from: VungleApiImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.vungle.ads.internal.network.HttpMethod.values().length];
            iArr[com.vungle.ads.internal.network.HttpMethod.GET.ordinal()] = 1;
            iArr[com.vungle.ads.internal.network.HttpMethod.POST.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VungleApiImpl(okhttp3.Call.Factory okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new com.vungle.ads.internal.network.converters.EmptyResponseConverter();
    }

    /* renamed from: getOkHttpClient$vungle_ads_release, reason: from getter */
    public final okhttp3.Call.Factory getOkHttpClient() {
        return this.okHttpClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ okhttp3.Request.Builder defaultBuilder$default(com.vungle.ads.internal.network.VungleApiImpl vungleApiImpl, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        return vungleApiImpl.defaultBuilder(str, str2, str3, map);
    }

    private final okhttp3.Request.Builder defaultBuilder(java.lang.String ua, java.lang.String path, java.lang.String placementReferenceId, java.util.Map<java.lang.String, java.lang.String> headers) {
        okhttp3.Request.Builder addHeader = new okhttp3.Request.Builder().url(path).addHeader(com.google.common.net.HttpHeaders.USER_AGENT, ua).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader("Content-Type", com.ironsource.B5.M);
        if (headers != null) {
            addHeader.headers(okhttp3.Headers.INSTANCE.of(headers));
        }
        if (placementReferenceId != null) {
            addHeader.addHeader("X-Vungle-Placement-Ref-Id", placementReferenceId);
        }
        java.lang.String appVersion = com.vungle.ads.internal.network.VungleHeader.INSTANCE.getAppVersion();
        if (appVersion != null) {
            addHeader.addHeader("X-VUNGLE-APP-VERSION", appVersion);
        }
        java.lang.String appId = com.vungle.ads.internal.network.VungleHeader.INSTANCE.getAppId();
        if (appId != null) {
            addHeader.addHeader("X-Vungle-App-Id", appId);
        }
        return addHeader;
    }

    private final okhttp3.Request.Builder defaultProtoBufBuilder(java.lang.String ua, okhttp3.HttpUrl path) {
        okhttp3.Request.Builder addHeader = new okhttp3.Request.Builder().url(path).addHeader(com.google.common.net.HttpHeaders.USER_AGENT, ua).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader("Content-Type", com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF);
        java.lang.String appId = com.vungle.ads.internal.network.VungleHeader.INSTANCE.getAppId();
        if (appId != null) {
            addHeader.addHeader("X-Vungle-App-Id", appId);
        }
        java.lang.String appVersion = com.vungle.ads.internal.network.VungleHeader.INSTANCE.getAppVersion();
        if (appVersion != null) {
            addHeader.addHeader("X-VUNGLE-APP-VERSION", appVersion);
        }
        return addHeader;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.ConfigPayload> config(java.lang.String ua, java.lang.String path, com.vungle.ads.internal.model.CommonRequestBody body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ua, "ua");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        try {
            kotlinx.serialization.json.Json json2 = json;
            kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json2.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.CommonRequestBody.class));
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new com.vungle.ads.internal.network.OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua, path, null, null, 12, null).post(okhttp3.RequestBody.INSTANCE.create(json2.encodeToString(serializer, body), (okhttp3.MediaType) null)).build()), new com.vungle.ads.internal.network.converters.JsonConverter(kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.ConfigPayload.class)));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> ads(java.lang.String ua, java.lang.String path, com.vungle.ads.internal.model.CommonRequestBody body) {
        java.util.List<java.lang.String> placements;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ua, "ua");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        try {
            kotlinx.serialization.json.Json json2 = json;
            kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json2.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.CommonRequestBody.class));
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            java.lang.String encodeToString = json2.encodeToString(serializer, body);
            com.vungle.ads.internal.model.CommonRequestBody.RequestParam request = body.getRequest();
            return new com.vungle.ads.internal.network.OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua, path, (request == null || (placements = request.getPlacements()) == null) ? null : (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) placements), null, 8, null).post(okhttp3.RequestBody.INSTANCE.create(encodeToString, (okhttp3.MediaType) null)).build()), new com.vungle.ads.internal.network.converters.JsonConverter(kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.AdPayload.class)));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.Call<java.lang.Void> ri(java.lang.String ua, java.lang.String path, com.vungle.ads.internal.model.CommonRequestBody body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ua, "ua");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        try {
            kotlinx.serialization.json.Json json2 = json;
            kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json2.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.CommonRequestBody.class));
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new com.vungle.ads.internal.network.OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua, path, null, null, 12, null).post(okhttp3.RequestBody.INSTANCE.create(json2.encodeToString(serializer, body), (okhttp3.MediaType) null)).build()), this.emptyResponseConverter);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.Call<java.lang.Void> pingTPAT(java.lang.String ua, java.lang.String url, com.vungle.ads.internal.network.HttpMethod requestType, java.util.Map<java.lang.String, java.lang.String> headers, okhttp3.RequestBody requestBody) {
        okhttp3.Request build;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ua, "ua");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "requestType");
        okhttp3.Request.Builder defaultBuilder$default = defaultBuilder$default(this, ua, url, null, headers, 4, null);
        int i = com.vungle.ads.internal.network.VungleApiImpl.WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i == 1) {
            build = defaultBuilder$default.get().build();
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (requestBody == null) {
                requestBody = okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, new byte[0], (okhttp3.MediaType) null, 0, 0, 6, (java.lang.Object) null);
            }
            build = defaultBuilder$default.post(requestBody).build();
        }
        return new com.vungle.ads.internal.network.OkHttpCall(this.okHttpClient.newCall(build), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.Call<java.lang.Void> sendMetrics(java.lang.String ua, java.lang.String path, okhttp3.RequestBody requestBody) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ua, "ua");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new com.vungle.ads.internal.network.OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(ua, okhttp3.HttpUrl.INSTANCE.get(path).newBuilder().build()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.Call<java.lang.Void> sendErrors(java.lang.String ua, java.lang.String path, okhttp3.RequestBody requestBody) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ua, "ua");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new com.vungle.ads.internal.network.OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(ua, okhttp3.HttpUrl.INSTANCE.get(path).newBuilder().build()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.Call<java.lang.Void> sendAdMarkup(java.lang.String path, okhttp3.RequestBody requestBody) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new com.vungle.ads.internal.network.OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, "debug", okhttp3.HttpUrl.INSTANCE.get(path).newBuilder().build().getUrl(), null, null, 12, null).post(requestBody).build()), this.emptyResponseConverter);
    }
}
