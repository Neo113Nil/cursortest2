package io.ktor.client.utils;

/* compiled from: HeadersUtils.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\" \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "Lio/ktor/http/HttpMethod;", "method", "Lio/ktor/util/Attributes;", "attributes", "", "alwaysRemove", "", "dropCompressionHeaders", "(Lio/ktor/http/HeadersBuilder;Lio/ktor/http/HttpMethod;Lio/ktor/util/Attributes;Z)V", "Lio/ktor/util/AttributeKey;", "", "", "DecompressionListAttribute", "Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeadersUtilsKt {
    private static final io.ktor.util.AttributeKey<java.util.List<java.lang.String>> DecompressionListAttribute;

    public static /* synthetic */ void dropCompressionHeaders$default(io.ktor.http.HeadersBuilder headersBuilder, io.ktor.http.HttpMethod httpMethod, io.ktor.util.Attributes attributes, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        dropCompressionHeaders(headersBuilder, httpMethod, attributes, z);
    }

    public static final void dropCompressionHeaders(io.ktor.http.HeadersBuilder headersBuilder, io.ktor.http.HttpMethod method, io.ktor.util.Attributes attributes, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (kotlin.jvm.internal.Intrinsics.areEqual(method, io.ktor.http.HttpMethod.INSTANCE.getHead()) || kotlin.jvm.internal.Intrinsics.areEqual(method, io.ktor.http.HttpMethod.INSTANCE.getOptions())) {
            return;
        }
        java.lang.String str = headersBuilder.get(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding());
        if (str != null) {
            ((java.util.List) attributes.computeIfAbsent(DecompressionListAttribute, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.utils.HeadersUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.util.List dropCompressionHeaders$lambda$0;
                    dropCompressionHeaders$lambda$0 = io.ktor.client.utils.HeadersUtilsKt.dropCompressionHeaders$lambda$0();
                    return dropCompressionHeaders$lambda$0;
                }
            })).add(str);
        } else if (!z) {
            return;
        }
        headersBuilder.remove(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding());
        headersBuilder.remove(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List dropCompressionHeaders$lambda$0() {
        return new java.util.ArrayList();
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class);
        try {
            kType = kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class))));
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        DecompressionListAttribute = new io.ktor.util.AttributeKey<>("DecompressionListAttribute", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }
}
