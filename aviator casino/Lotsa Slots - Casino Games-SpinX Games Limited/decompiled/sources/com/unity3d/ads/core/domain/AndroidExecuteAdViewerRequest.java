package com.unity3d.ads.core.domain;

/* compiled from: AndroidExecuteAdViewerRequest.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0010J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidExecuteAdViewerRequest;", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/GetCachedAsset;)V", "createRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "type", "Lcom/unity3d/services/core/network/model/RequestType;", "parameters", "", "", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;)Lcom/unity3d/services/core/network/model/HttpRequest;", "invoke", "Lcom/unity3d/services/core/network/model/HttpResponse;", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidExecuteAdViewerRequest implements com.unity3d.ads.core.domain.ExecuteAdViewerRequest {
    private final com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset;
    private final com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;

    /* compiled from: AndroidExecuteAdViewerRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.services.core.network.model.RequestType.values().length];
            try {
                iArr[com.unity3d.services.core.network.model.RequestType.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.services.core.network.model.RequestType.HEAD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.services.core.network.model.RequestType.POST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidExecuteAdViewerRequest(kotlinx.coroutines.CoroutineDispatcher ioDispatcher, com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider, com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = ioDispatcher;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public java.lang.Object invoke(com.unity3d.services.core.network.model.RequestType requestType, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2(objArr, this, requestType, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.unity3d.services.core.network.model.HttpRequest createRequest(com.unity3d.services.core.network.model.RequestType type, java.lang.Object[] parameters) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> emptyMap;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> emptyMap2;
        java.lang.String str = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(parameters, 1);
        java.lang.String str2 = str;
        if (!(!(str2 == null || str2.length() == 0))) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) kotlin.collections.ArraysKt.getOrNull(parameters, 2);
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(parameters, 3);
            java.lang.Integer num2 = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(parameters, 4);
            if (jSONArray == null || (emptyMap = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                emptyMap = kotlin.collections.MapsKt.emptyMap();
            }
            return new com.unity3d.services.core.network.model.HttpRequest(str, null, type, null, emptyMap, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String str3 = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(parameters, 2);
        org.json.JSONArray jSONArray2 = (org.json.JSONArray) kotlin.collections.ArraysKt.getOrNull(parameters, 3);
        java.lang.Integer num3 = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(parameters, 4);
        java.lang.Integer num4 = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(parameters, 5);
        if (jSONArray2 == null || (emptyMap2 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
            emptyMap2 = kotlin.collections.MapsKt.emptyMap();
        }
        return new com.unity3d.services.core.network.model.HttpRequest(str, null, type, str3, emptyMap2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }
}
