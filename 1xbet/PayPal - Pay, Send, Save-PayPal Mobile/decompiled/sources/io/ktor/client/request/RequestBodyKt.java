package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0004\u001a\u00020\u0003*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\t\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"T", "Lio/ktor/client/request/HttpRequestBuilder;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "setBody", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)V", "", "Lio/ktor/util/reflect/TypeInfo;", "bodyType", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;Lio/ktor/util/reflect/TypeInfo;)V", "Lio/ktor/util/AttributeKey;", "BodyTypeAttributeKey", "Lio/ktor/util/AttributeKey;", "getBodyTypeAttributeKey", "()Lio/ktor/util/AttributeKey;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestBodyKt {
    private static final io.ktor.util.AttributeKey<io.ktor.util.reflect.TypeInfo> BodyTypeAttributeKey;

    public static final io.ktor.util.AttributeKey<io.ktor.util.reflect.TypeInfo> getBodyTypeAttributeKey() {
        return BodyTypeAttributeKey;
    }

    public static final /* synthetic */ <T> void setBody(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        if (t == null) {
            httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
            try {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null));
            return;
        }
        if (t instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(t);
            httpRequestBuilder.setBodyType(null);
            return;
        }
        httpRequestBuilder.setBody(t);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused2) {
        }
        httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, null));
    }

    public static final void setBody(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Object obj, io.ktor.util.reflect.TypeInfo typeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeInfo, "");
        if (obj == null) {
            obj = io.ktor.http.content.NullBody.INSTANCE;
        }
        httpRequestBuilder.setBody(obj);
        httpRequestBuilder.setBodyType(typeInfo);
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.util.reflect.TypeInfo.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.util.reflect.TypeInfo.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        BodyTypeAttributeKey = new io.ktor.util.AttributeKey<>("BodyTypeAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }
}
