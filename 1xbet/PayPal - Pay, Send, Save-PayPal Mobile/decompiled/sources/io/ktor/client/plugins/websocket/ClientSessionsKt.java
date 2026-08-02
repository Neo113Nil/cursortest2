package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086H¢\u0006\u0004\b\u0006\u0010\t\u001a\"\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\n\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\n\u0010\f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "", "sendSerialized", "(Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;Ljava/lang/Object;Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "(Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveDeserialized", "(Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/serialization/WebsocketContentConverter;", "getConverter", "(Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;)Lio/ktor/serialization/WebsocketContentConverter;", "converter"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ClientSessionsKt {
    public static final io.ktor.serialization.WebsocketContentConverter getConverter(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultClientWebSocketSession, "");
        io.ktor.client.plugins.websocket.WebSockets webSockets = (io.ktor.client.plugins.websocket.WebSockets) io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(defaultClientWebSocketSession.getCall().getClient(), io.ktor.client.plugins.websocket.WebSockets.INSTANCE);
        if (webSockets != null) {
            return webSockets.getContentConverter();
        }
        return null;
    }

    public static final java.lang.Object sendSerialized(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession, java.lang.Object obj, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.serialization.WebsocketContentConverter converter = getConverter(defaultClientWebSocketSession);
        if (converter == null) {
            throw new io.ktor.serialization.WebsocketConverterNotFoundException("No converter was found for websocket", null, 2, null);
        }
        java.lang.Object sendSerializedBase = io.ktor.websocket.serialization.WebsocketChannelSerializationKt.sendSerializedBase(defaultClientWebSocketSession, obj, typeInfo, converter, io.ktor.serialization.ContentConverterKt.suitableCharset$default(defaultClientWebSocketSession.getCall().getRequest().getHeaders(), null, 1, null), continuation);
        return sendSerializedBase == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendSerializedBase : kotlin.Unit.INSTANCE;
    }

    public static final <T> java.lang.Object receiveDeserialized(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<? super T> continuation) {
        io.ktor.serialization.WebsocketContentConverter converter = getConverter(defaultClientWebSocketSession);
        if (converter == null) {
            throw new io.ktor.serialization.WebsocketConverterNotFoundException("No converter was found for websocket", null, 2, null);
        }
        java.lang.Object receiveDeserializedBase = io.ktor.websocket.serialization.WebsocketChannelSerializationKt.receiveDeserializedBase(defaultClientWebSocketSession, typeInfo, converter, io.ktor.serialization.ContentConverterKt.suitableCharset$default(defaultClientWebSocketSession.getCall().getRequest().getHeaders(), null, 1, null), continuation);
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return receiveDeserializedBase;
    }

    public static final /* synthetic */ <T> java.lang.Object sendSerialized(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        sendSerialized(defaultClientWebSocketSession, t, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), continuation);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ <T> java.lang.Object receiveDeserialized(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        return receiveDeserialized(defaultClientWebSocketSession, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), continuation);
    }
}
