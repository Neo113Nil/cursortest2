package com.moloco.sdk.acm.http;

/* loaded from: classes5.dex */
public final class a {
    public final kotlin.jvm.functions.Function1<io.ktor.http.HeadersBuilder, kotlin.Unit> a(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6) {
        return new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.acm.http.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.acm.http.a.a(str4, str5, str3, str, str6, str2, (io.ktor.http.HeadersBuilder) obj);
            }
        };
    }

    public static final kotlin.Unit a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, io.ktor.http.HeadersBuilder headersBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str != null) {
            sb.append("AppBundle/" + str + ';');
        }
        if (str2 != null) {
            sb.append("AppVersion/" + str2 + ';');
        }
        if (str3 != null) {
            sb.append("AppKey/" + str3 + ';');
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        if (str4 != null) {
            sb3.append("SdkVersion/" + str4 + ';');
        }
        if (str5 != null) {
            sb3.append("Mediator/" + str5 + ';');
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("OS/Android;");
        if (str6 != null) {
            sb5.append("osv/" + str6 + ';');
        }
        java.lang.String sb6 = sb5.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb6, "toString(...)");
        headersBuilder.append("X-Moloco-App-Info", sb2);
        headersBuilder.append("X-Moloco-Device-Info", sb6);
        headersBuilder.append("X-Moloco-SDK-Info", sb4);
        return kotlin.Unit.INSTANCE;
    }
}
