package com.paypal.oslo.core.pushnotification.deeplink;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebDeeplinkNormalizer;", "", "<init>", "()V", "", "deeplink", "Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebSource;", "source", "normalize", "(Ljava/lang/String;Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebSource;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OpenWebDeeplinkNormalizer {

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_TYPE = "internal";

    @java.lang.Deprecated
    public static final java.lang.String OPEN_WEB_PATH = "/open_web";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_SOURCE = "source";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_TYPE = "type";
    private static final com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer.Companion Companion = new com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer.Companion(null);
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("%[0-9a-fA-F]{2}");

    @javax.inject.Inject
    public OpenWebDeeplinkNormalizer() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebDeeplinkNormalizer$Companion;", "", "<init>", "()V", "", "OPEN_WEB_PATH", "Ljava/lang/String;", "PARAM_TYPE", "PARAM_SOURCE", "DEFAULT_TYPE", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$lkSxfk-mA7CLLciSSoqVGhx4ZVQ, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m11676$r8$lambda$lkSxfkmA7CLLciSSoqVGhx4ZVQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, '=', 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return str2;
        }
        java.lang.String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String substring2 = str.substring(indexOf$default + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        if (!getHighSpeedVideoFpsRangesFor.containsMatchIn(substring2)) {
            java.lang.String encode = java.net.URLEncoder.encode(substring2, java.nio.charset.StandardCharsets.UTF_8.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "");
            substring2 = kotlin.text.StringsKt.replace$default(encode, "+", "%20", false, 4, (java.lang.Object) null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append("=");
        sb.append(substring2);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String normalize(java.lang.String deeplink, com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource source) {
        java.lang.String path;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.substringBefore$default(deeplink, '?', (java.lang.String) null, 2, (java.lang.Object) null), OPEN_WEB_PATH)) {
            android.net.Uri parse = android.net.Uri.parse(deeplink);
            java.lang.String scheme = parse.getScheme();
            if (kotlin.jvm.internal.Intrinsics.areEqual(scheme, "http") || kotlin.jvm.internal.Intrinsics.areEqual(scheme, "https")) {
                path = parse.getPath();
            } else {
                if (scheme != null) {
                    java.lang.String host = parse.getHost();
                    if (host == null) {
                        host = "";
                    }
                    java.lang.String path2 = parse.getPath();
                    if (path2 == null) {
                        path2 = "";
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    sb.append(host);
                    sb.append(path2);
                    path = sb.toString();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(path, OPEN_WEB_PATH)) {
                        return deeplink;
                    }
                }
                path = "";
                if (!kotlin.jvm.internal.Intrinsics.areEqual(path, OPEN_WEB_PATH)) {
                }
            }
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) deeplink, '?', 0, false, 6, (java.lang.Object) null);
        if (indexOf$default != -1) {
            java.lang.String substring = deeplink.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.String substring2 = deeplink.substring(indexOf$default + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring2, new java.lang.String[]{"&"}, false, 0, 6, (java.lang.Object) null), "&", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer.m11676$r8$lambda$lkSxfkmA7CLLciSSoqVGhx4ZVQ((java.lang.String) obj);
                }
            }, 30, null);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(substring);
            sb2.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
            sb2.append(joinToString$default);
            deeplink = sb2.toString();
        }
        android.net.Uri parse2 = android.net.Uri.parse(deeplink);
        android.net.Uri.Builder buildUpon = parse2.buildUpon();
        java.lang.String queryParameter = parse2.getQueryParameter("type");
        if (queryParameter == null || kotlin.text.StringsKt.isBlank(queryParameter)) {
            buildUpon.appendQueryParameter("type", "internal");
        }
        java.lang.String queryParameter2 = parse2.getQueryParameter("source");
        if (queryParameter2 == null || kotlin.text.StringsKt.isBlank(queryParameter2)) {
            buildUpon.appendQueryParameter("source", source.getValue());
        }
        java.lang.String obj = buildUpon.build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
