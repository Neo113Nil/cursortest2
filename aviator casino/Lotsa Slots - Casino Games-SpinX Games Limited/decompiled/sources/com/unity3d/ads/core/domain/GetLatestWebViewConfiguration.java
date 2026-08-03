package com.unity3d.ads.core.domain;

/* compiled from: GetLatestWebViewConfiguration.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JG\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "", "webviewConfigurationDataSource", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "(Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;)V", "invoke", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "receivedEntryPoint", "", "receivedVersion", "", "receivedAdditionalFiles", "", "receivedType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetLatestWebViewConfiguration {
    private final com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource;

    public GetLatestWebViewConfiguration(com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.Integer num, java.util.List<java.lang.String> list, java.lang.String str2, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.WebViewConfiguration> continuation) {
        com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1 getLatestWebViewConfiguration$invoke$1;
        int i;
        com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration;
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration;
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration2;
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration3;
        if (continuation instanceof com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1) {
            getLatestWebViewConfiguration$invoke$1 = (com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1) continuation;
            if ((getLatestWebViewConfiguration$invoke$1.label & Integer.MIN_VALUE) != 0) {
                getLatestWebViewConfiguration$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = getLatestWebViewConfiguration$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getLatestWebViewConfiguration$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource = this.webviewConfigurationDataSource;
                    getLatestWebViewConfiguration$invoke$1.L$0 = this;
                    getLatestWebViewConfiguration$invoke$1.L$1 = str;
                    getLatestWebViewConfiguration$invoke$1.L$2 = num;
                    getLatestWebViewConfiguration$invoke$1.L$3 = list;
                    getLatestWebViewConfiguration$invoke$1.L$4 = str2;
                    getLatestWebViewConfiguration$invoke$1.label = 1;
                    obj = webviewConfigurationDataSource.get(getLatestWebViewConfiguration$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getLatestWebViewConfiguration = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        webViewConfiguration3 = (com.unity3d.ads.core.data.model.WebViewConfiguration) getLatestWebViewConfiguration$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return webViewConfiguration3;
                    }
                    str2 = (java.lang.String) getLatestWebViewConfiguration$invoke$1.L$4;
                    list = (java.util.List) getLatestWebViewConfiguration$invoke$1.L$3;
                    num = (java.lang.Integer) getLatestWebViewConfiguration$invoke$1.L$2;
                    str = (java.lang.String) getLatestWebViewConfiguration$invoke$1.L$1;
                    getLatestWebViewConfiguration = (com.unity3d.ads.core.domain.GetLatestWebViewConfiguration) getLatestWebViewConfiguration$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore) obj;
                int version = webViewConfigurationStore.getVersion();
                java.lang.String entryPoint = webViewConfigurationStore.getEntryPoint();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entryPoint, "it.entryPoint");
                java.util.List<java.lang.String> additionalFilesList = webViewConfigurationStore.getAdditionalFilesList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(additionalFilesList, "it.additionalFilesList");
                java.lang.String type = webViewConfigurationStore.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "it.type");
                webViewConfiguration = new com.unity3d.ads.core.data.model.WebViewConfiguration(version, entryPoint, additionalFilesList, type);
                if (str != null && num == null && list == null && str2 == null) {
                    return webViewConfiguration;
                }
                int intValue = num == null ? num.intValue() : webViewConfiguration.getVersion();
                if (str == null) {
                    str = webViewConfiguration.getEntryPoint();
                }
                if (list == null) {
                    list = webViewConfiguration.getAdditionalFiles();
                }
                if (str2 == null) {
                    str2 = webViewConfiguration.getType();
                }
                webViewConfiguration2 = new com.unity3d.ads.core.data.model.WebViewConfiguration(intValue, str, list, str2);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(webViewConfiguration2, webViewConfiguration)) {
                    return webViewConfiguration2;
                }
                com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource2 = getLatestWebViewConfiguration.webviewConfigurationDataSource;
                com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder newBuilder = com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.newBuilder();
                newBuilder.setVersion(webViewConfiguration2.getVersion());
                newBuilder.setEntryPoint(webViewConfiguration2.getEntryPoint());
                newBuilder.addAllAdditionalFiles(webViewConfiguration2.getAdditionalFiles());
                newBuilder.setType(webViewConfiguration2.getType());
                com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore build = newBuilder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "newBuilder().apply {\n   …                }.build()");
                getLatestWebViewConfiguration$invoke$1.L$0 = webViewConfiguration2;
                getLatestWebViewConfiguration$invoke$1.L$1 = null;
                getLatestWebViewConfiguration$invoke$1.L$2 = null;
                getLatestWebViewConfiguration$invoke$1.L$3 = null;
                getLatestWebViewConfiguration$invoke$1.L$4 = null;
                getLatestWebViewConfiguration$invoke$1.label = 2;
                if (webviewConfigurationDataSource2.set(build, getLatestWebViewConfiguration$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                webViewConfiguration3 = webViewConfiguration2;
                return webViewConfiguration3;
            }
        }
        getLatestWebViewConfiguration$invoke$1 = new com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1(this, continuation);
        java.lang.Object obj2 = getLatestWebViewConfiguration$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getLatestWebViewConfiguration$invoke$1.label;
        if (i != 0) {
        }
        com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore2 = (com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore) obj2;
        int version2 = webViewConfigurationStore2.getVersion();
        java.lang.String entryPoint2 = webViewConfigurationStore2.getEntryPoint();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entryPoint2, "it.entryPoint");
        java.util.List<java.lang.String> additionalFilesList2 = webViewConfigurationStore2.getAdditionalFilesList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(additionalFilesList2, "it.additionalFilesList");
        java.lang.String type2 = webViewConfigurationStore2.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "it.type");
        webViewConfiguration = new com.unity3d.ads.core.data.model.WebViewConfiguration(version2, entryPoint2, additionalFilesList2, type2);
        if (str != null) {
        }
        if (num == null) {
        }
        if (str == null) {
        }
        if (list == null) {
        }
        if (str2 == null) {
        }
        webViewConfiguration2 = new com.unity3d.ads.core.data.model.WebViewConfiguration(intValue, str, list, str2);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(webViewConfiguration2, webViewConfiguration)) {
        }
    }
}
