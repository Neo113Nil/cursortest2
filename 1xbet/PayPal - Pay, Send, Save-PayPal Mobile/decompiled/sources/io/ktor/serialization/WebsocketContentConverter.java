package io.ktor.serialization;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\f\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/serialization/WebsocketContentConverter;", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lio/ktor/websocket/Frame;", "serialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "isApplicable", "(Lio/ktor/websocket/Frame;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface WebsocketContentConverter {
    java.lang.Object deserialize(java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<java.lang.Object> continuation);

    boolean isApplicable(io.ktor.websocket.Frame frame);

    java.lang.Object serialize(java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, kotlin.coroutines.Continuation<? super io.ktor.websocket.Frame> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.Object serialize(io.ktor.serialization.WebsocketContentConverter websocketContentConverter, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, kotlin.coroutines.Continuation<? super io.ktor.websocket.Frame> continuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            return websocketContentConverter.serialize(charset, typeInfo, obj, continuation);
        }
    }
}
