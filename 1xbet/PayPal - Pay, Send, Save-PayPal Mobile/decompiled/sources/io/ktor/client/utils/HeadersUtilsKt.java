package io.ktor.client.utils;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\" \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "Lio/ktor/http/HttpMethod;", "method", "Lio/ktor/util/Attributes;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "alwaysRemove", "", "dropCompressionHeaders", "(Lio/ktor/http/HeadersBuilder;Lio/ktor/http/HttpMethod;Lio/ktor/util/Attributes;Z)V", "Lio/ktor/util/AttributeKey;", "", "", "Camera2StreamConfigurationMap", "Lio/ktor/util/AttributeKey;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HeadersUtilsKt {
    private static final io.ktor.util.AttributeKey<java.util.List<java.lang.String>> Camera2StreamConfigurationMap;

    public static /* synthetic */ void dropCompressionHeaders$default(io.ktor.http.HeadersBuilder headersBuilder, io.ktor.http.HttpMethod httpMethod, io.ktor.util.Attributes attributes, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        dropCompressionHeaders(headersBuilder, httpMethod, attributes, z);
    }

    public static final void dropCompressionHeaders(io.ktor.http.HeadersBuilder headersBuilder, io.ktor.http.HttpMethod httpMethod, io.ktor.util.Attributes attributes, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(httpMethod, io.ktor.http.HttpMethod.INSTANCE.getHead()) || kotlin.jvm.internal.Intrinsics.areEqual(httpMethod, io.ktor.http.HttpMethod.INSTANCE.getOptions())) {
            return;
        }
        java.lang.String str = headersBuilder.get(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding());
        if (str != null) {
            ((java.util.List) attributes.computeIfAbsent(Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.utils.HeadersUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return io.ktor.client.utils.HeadersUtilsKt.$r8$lambda$bw8Hj4pLjkgkcI6Jz_JokLLfoxI();
                }
            })).add(str);
        } else if (!z) {
            return;
        }
        headersBuilder.remove(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding());
        headersBuilder.remove(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class);
        try {
            kType = kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class))));
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        Camera2StreamConfigurationMap = new io.ktor.util.AttributeKey<>("DecompressionListAttribute", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    public static /* synthetic */ java.util.List $r8$lambda$bw8Hj4pLjkgkcI6Jz_JokLLfoxI() {
        return new java.util.ArrayList();
    }
}
