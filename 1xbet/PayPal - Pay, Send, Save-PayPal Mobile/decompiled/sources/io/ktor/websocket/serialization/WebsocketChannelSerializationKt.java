package io.ktor.websocket.serialization;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0086H¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\n\u001a\u00020\t*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000e\u001a2\u0010\u000f\u001a\u0004\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0086H¢\u0006\u0004\b\u000f\u0010\u0010\u001a2\u0010\u000f\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0086@¢\u0006\u0004\b\u000f\u0010\u0011"}, d2 = {"T", "Lio/ktor/websocket/WebSocketSession;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/ktor/serialization/WebsocketContentConverter;", "converter", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "sendSerializedBase", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/Object;Lio/ktor/serialization/WebsocketContentConverter;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/Object;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/serialization/WebsocketContentConverter;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveDeserializedBase", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/serialization/WebsocketContentConverter;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/serialization/WebsocketContentConverter;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebsocketChannelSerializationKt {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r5.send((io.ktor.websocket.Frame) r10, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object sendSerializedBase(io.ktor.websocket.WebSocketSession webSocketSession, java.lang.Object obj, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.serialization.WebsocketContentConverter websocketContentConverter, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2 websocketChannelSerializationKt$sendSerializedBase$2;
        int i;
        if (continuation instanceof io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2) {
            websocketChannelSerializationKt$sendSerializedBase$2 = (io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2) continuation;
            if ((websocketChannelSerializationKt$sendSerializedBase$2.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                websocketChannelSerializationKt$sendSerializedBase$2.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj2 = websocketChannelSerializationKt$sendSerializedBase$2.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = websocketChannelSerializationKt$sendSerializedBase$2.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    websocketChannelSerializationKt$sendSerializedBase$2.getHighSpeedVideoFpsRangesFor = webSocketSession;
                    websocketChannelSerializationKt$sendSerializedBase$2.Camera2StreamConfigurationMap = 1;
                    obj2 = websocketContentConverter.serialize(charset, typeInfo, obj, websocketChannelSerializationKt$sendSerializedBase$2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                    webSocketSession = (io.ktor.websocket.WebSocketSession) websocketChannelSerializationKt$sendSerializedBase$2.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> outgoing = webSocketSession.getOutgoing();
                websocketChannelSerializationKt$sendSerializedBase$2.getHighSpeedVideoFpsRangesFor = null;
                websocketChannelSerializationKt$sendSerializedBase$2.Camera2StreamConfigurationMap = 2;
            }
        }
        websocketChannelSerializationKt$sendSerializedBase$2 = new io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2(continuation);
        java.lang.Object obj22 = websocketChannelSerializationKt$sendSerializedBase$2.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = websocketChannelSerializationKt$sendSerializedBase$2.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> outgoing2 = webSocketSession.getOutgoing();
        websocketChannelSerializationKt$sendSerializedBase$2.getHighSpeedVideoFpsRangesFor = null;
        websocketChannelSerializationKt$sendSerializedBase$2.Camera2StreamConfigurationMap = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r0 != r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object receiveDeserializedBase(io.ktor.websocket.WebSocketSession webSocketSession, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.serialization.WebsocketContentConverter websocketContentConverter, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        io.ktor.websocket.serialization.WebsocketChannelSerializationKt$receiveDeserializedBase$2 websocketChannelSerializationKt$receiveDeserializedBase$2;
        int i;
        io.ktor.util.reflect.TypeInfo typeInfo2;
        io.ktor.serialization.WebsocketContentConverter websocketContentConverter2;
        java.nio.charset.Charset charset2;
        io.ktor.websocket.Frame frame;
        io.ktor.util.reflect.TypeInfo typeInfo3;
        io.ktor.websocket.Frame frame2;
        if (continuation instanceof io.ktor.websocket.serialization.WebsocketChannelSerializationKt$receiveDeserializedBase$2) {
            websocketChannelSerializationKt$receiveDeserializedBase$2 = (io.ktor.websocket.serialization.WebsocketChannelSerializationKt$receiveDeserializedBase$2) continuation;
            if ((websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = websocketChannelSerializationKt$receiveDeserializedBase$2.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> incoming = webSocketSession.getIncoming();
                    typeInfo2 = typeInfo;
                    websocketChannelSerializationKt$receiveDeserializedBase$2.Camera2StreamConfigurationMap = typeInfo2;
                    websocketContentConverter2 = websocketContentConverter;
                    websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoFpsRangesFor = websocketContentConverter2;
                    charset2 = charset;
                    websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoFpsRanges = charset2;
                    websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoSizes = 1;
                    obj = incoming.receive(websocketChannelSerializationKt$receiveDeserializedBase$2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        io.ktor.websocket.Frame frame3 = (io.ktor.websocket.Frame) websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoFpsRangesFor;
                        typeInfo3 = (io.ktor.util.reflect.TypeInfo) websocketChannelSerializationKt$receiveDeserializedBase$2.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        frame2 = frame3;
                        if (!typeInfo3.getType().isInstance(obj)) {
                            return obj;
                        }
                        if (obj == null) {
                            kotlin.reflect.KType kotlinType = typeInfo3.getKotlinType();
                            if (kotlinType == null || !kotlinType.getIsMarkedNullable()) {
                                throw new io.ktor.serialization.WebsocketDeserializeException("Frame has null content", null, frame2, 2, null);
                            }
                            return null;
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't deserialize value: expected value of type ");
                        sb.append(typeInfo3.getType().getSimpleName());
                        sb.append(", got ");
                        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
                        throw new io.ktor.serialization.WebsocketDeserializeException(sb.toString(), null, frame2, 2, null);
                    }
                    java.nio.charset.Charset charset3 = (java.nio.charset.Charset) websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoFpsRanges;
                    websocketContentConverter2 = (io.ktor.serialization.WebsocketContentConverter) websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoFpsRangesFor;
                    io.ktor.util.reflect.TypeInfo typeInfo4 = (io.ktor.util.reflect.TypeInfo) websocketChannelSerializationKt$receiveDeserializedBase$2.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    charset2 = charset3;
                    typeInfo2 = typeInfo4;
                }
                frame = (io.ktor.websocket.Frame) obj;
                if (websocketContentConverter2.isApplicable(frame)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Converter doesn't support frame type ");
                    sb2.append(frame.getFrameType().name());
                    throw new io.ktor.serialization.WebsocketDeserializeException(sb2.toString(), null, frame, 2, null);
                }
                websocketChannelSerializationKt$receiveDeserializedBase$2.Camera2StreamConfigurationMap = typeInfo2;
                websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoFpsRangesFor = frame;
                websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoFpsRanges = null;
                websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoSizes = 2;
                obj = websocketContentConverter2.deserialize(charset2, typeInfo2, frame, websocketChannelSerializationKt$receiveDeserializedBase$2);
                if (obj != coroutine_suspended) {
                    typeInfo3 = typeInfo2;
                    frame2 = frame;
                    if (!typeInfo3.getType().isInstance(obj)) {
                    }
                }
                return coroutine_suspended;
            }
        }
        websocketChannelSerializationKt$receiveDeserializedBase$2 = new io.ktor.websocket.serialization.WebsocketChannelSerializationKt$receiveDeserializedBase$2(continuation);
        java.lang.Object obj2 = websocketChannelSerializationKt$receiveDeserializedBase$2.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = websocketChannelSerializationKt$receiveDeserializedBase$2.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        frame = (io.ktor.websocket.Frame) obj2;
        if (websocketContentConverter2.isApplicable(frame)) {
        }
    }

    public static final /* synthetic */ <T> java.lang.Object sendSerializedBase(io.ktor.websocket.WebSocketSession webSocketSession, java.lang.Object obj, io.ktor.serialization.WebsocketContentConverter websocketContentConverter, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        sendSerializedBase(webSocketSession, obj, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), websocketContentConverter, charset, continuation);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ <T> java.lang.Object receiveDeserializedBase(io.ktor.websocket.WebSocketSession webSocketSession, io.ktor.serialization.WebsocketContentConverter websocketContentConverter, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        return receiveDeserializedBase(webSocketSession, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), websocketContentConverter, charset, continuation);
    }
}
