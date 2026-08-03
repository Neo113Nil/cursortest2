package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class n {
    public static /* synthetic */ void a(io.ktor.http.HeadersBuilder headersBuilder, java.lang.String str, java.lang.String str2, com.moloco.sdk.publisher.MediationInfo mediationInfo, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            mediationInfo = null;
        }
        a(headersBuilder, str, str2, mediationInfo);
    }

    public static final void a(io.ktor.http.HeadersBuilder headersBuilder, java.lang.String str, java.lang.String str2, com.moloco.sdk.publisher.MediationInfo mediationInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str != null) {
            sb.append("MolocoSDK/" + str + ';');
        }
        if (mediationInfo != null) {
            sb.append("Mediator/" + mediationInfo.getName() + ';');
        }
        if (str2 != null) {
            sb.append("Android/" + str2 + ';');
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        headersBuilder.append("X-Moloco-User-Agent", sb2);
    }
}
