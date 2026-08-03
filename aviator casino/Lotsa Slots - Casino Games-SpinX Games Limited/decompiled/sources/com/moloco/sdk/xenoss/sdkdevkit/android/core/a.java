package com.moloco.sdk.xenoss.sdkdevkit.android.core;

/* loaded from: classes5.dex */
public final class a {
    public static final void a(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, final long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        io.ktor.client.plugins.HttpTimeoutKt.timeout(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.core.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(j, (io.ktor.client.plugins.HttpTimeoutConfig) obj);
            }
        });
    }

    public static final kotlin.Unit a(long j, io.ktor.client.plugins.HttpTimeoutConfig timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
        timeout.setRequestTimeoutMillis(java.lang.Long.valueOf(j));
        return kotlin.Unit.INSTANCE;
    }
}
