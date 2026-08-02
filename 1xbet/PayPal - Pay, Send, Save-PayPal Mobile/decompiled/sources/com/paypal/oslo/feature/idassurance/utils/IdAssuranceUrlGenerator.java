package com.paypal.oslo.feature.idassurance.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/idassurance/utils/IdAssuranceUrlGenerator;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/idassurance/api/model/IdAssuranceConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "restConfig", "", "generateUrl", "(Lcom/paypal/oslo/feature/idassurance/api/model/IdAssuranceConfiguration;Lcom/paypal/oslo/core/network/rest/config/RestConfig;)Ljava/lang/String;", "baseUrl", "getWebviewHost", "(Ljava/lang/String;)Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "encode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IdAssuranceUrlGenerator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.idassurance.utils.IdAssuranceUrlGenerator INSTANCE = new com.paypal.oslo.feature.idassurance.utils.IdAssuranceUrlGenerator();

    private IdAssuranceUrlGenerator() {
    }

    public final java.lang.String generateUrl(com.paypal.oslo.feature.idassurance.api.model.IdAssuranceConfiguration configuration, com.paypal.oslo.core.network.rest.config.RestConfig restConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restConfig, "");
        java.lang.String webviewHost = getWebviewHost(restConfig.getBaseUrl());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://");
        sb.append(webviewHost);
        sb.append("/idassurance/");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String token = configuration.getToken();
        if (token != null) {
            arrayList.add("token=".concat(java.lang.String.valueOf(INSTANCE.encode(token))));
        }
        java.lang.String sid = configuration.getSid();
        if (sid != null) {
            arrayList.add("sid=".concat(java.lang.String.valueOf(INSTANCE.encode(sid))));
        }
        java.lang.String refToken = configuration.getRefToken();
        if (refToken != null) {
            arrayList.add("param=".concat(java.lang.String.valueOf(INSTANCE.encode(refToken))));
        }
        java.util.Map<java.lang.String, java.lang.String> analyticsExtras = configuration.getAnalyticsExtras();
        if (analyticsExtras != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : analyticsExtras.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                com.paypal.oslo.feature.idassurance.utils.IdAssuranceUrlGenerator idAssuranceUrlGenerator = INSTANCE;
                java.lang.String encode = idAssuranceUrlGenerator.encode(key);
                java.lang.String encode2 = idAssuranceUrlGenerator.encode(value);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(encode);
                sb3.append("=");
                sb3.append(encode2);
                arrayList.add(sb3.toString());
            }
        }
        sb2.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        sb2.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null));
        java.lang.String obj = sb2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String getWebviewHost(java.lang.String baseUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) baseUrl, (java.lang.CharSequence) com.paypal.oslo.feature.idassurance.utils.IdAssuranceConstants.PROD_REST_BASE_URL, false, 2, (java.lang.Object) null)) {
            return "www.paypal.com";
        }
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.text.StringsKt.split$default((java.lang.CharSequence) kotlin.text.StringsKt.removePrefix(kotlin.text.StringsKt.removePrefix(baseUrl, (java.lang.CharSequence) "https://"), (java.lang.CharSequence) "http://"), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null), ".", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.idassurance.utils.IdAssuranceUrlGenerator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.idassurance.utils.IdAssuranceUrlGenerator.$r8$lambda$Ye_NzlDRUwZSekoIC2M7sAwPEJs((java.lang.String) obj);
            }
        }, 30, null);
    }

    public final java.lang.String encode(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.String encode = java.net.URLEncoder.encode(value, kotlin.text.Charsets.UTF_8.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "");
        return encode;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$Ye_NzlDRUwZSekoIC2M7sAwPEJs(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, false, 2, (java.lang.Object) null) ? kotlin.text.StringsKt.replaceFirst$default(str, com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "www", false, 4, (java.lang.Object) null) : kotlin.jvm.internal.Intrinsics.areEqual(str, "qa") ? "stage" : kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "te-", false, 2, (java.lang.Object) null) ? kotlin.text.StringsKt.replaceFirst$default(str, "te-", "", false, 4, (java.lang.Object) null) : str2;
    }
}
