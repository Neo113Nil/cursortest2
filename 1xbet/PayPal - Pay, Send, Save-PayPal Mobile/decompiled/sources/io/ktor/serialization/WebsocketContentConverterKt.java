package io.ktor.serialization;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0086H¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\n\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\u00062\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0086H¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"T", "Lio/ktor/serialization/WebsocketContentConverter;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/websocket/Frame;", "serialize", "(Lio/ktor/serialization/WebsocketContentConverter;Ljava/lang/Object;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "deserialize", "(Lio/ktor/serialization/WebsocketContentConverter;Lio/ktor/websocket/Frame;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebsocketContentConverterKt {
    public static /* synthetic */ java.lang.Object serialize$default(io.ktor.serialization.WebsocketContentConverter websocketContentConverter, java.lang.Object obj, java.nio.charset.Charset charset, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        return websocketContentConverter.serialize(charset, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), obj, continuation);
    }

    public static /* synthetic */ java.lang.Object deserialize$default(io.ktor.serialization.WebsocketContentConverter websocketContentConverter, io.ktor.websocket.Frame frame, java.nio.charset.Charset charset, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        java.lang.Object deserialize = websocketContentConverter.deserialize(charset, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), frame, continuation);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return deserialize;
    }

    public static final /* synthetic */ <T> java.lang.Object serialize(io.ktor.serialization.WebsocketContentConverter websocketContentConverter, T t, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super io.ktor.websocket.Frame> continuation) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        return websocketContentConverter.serialize(charset, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), t, continuation);
    }

    public static final /* synthetic */ <T> java.lang.Object deserialize(io.ktor.serialization.WebsocketContentConverter websocketContentConverter, io.ktor.websocket.Frame frame, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        java.lang.Object deserialize = websocketContentConverter.deserialize(charset, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), frame, continuation);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return deserialize;
    }
}
