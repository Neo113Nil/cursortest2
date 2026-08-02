package io.ktor.serialization.kotlinx;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lio/ktor/serialization/kotlinx/KotlinxWebsocketSerializationConverter;", "Lio/ktor/serialization/WebsocketContentConverter;", "Lkotlinx/serialization/SerialFormat;", "format", "<init>", "(Lkotlinx/serialization/SerialFormat;)V", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lio/ktor/websocket/Frame;", "serialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "isApplicable", "(Lio/ktor/websocket/Frame;)Z", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/SerialFormat;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KotlinxWebsocketSerializationConverter implements io.ktor.serialization.WebsocketContentConverter {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.SerialFormat getHighSpeedVideoFpsRanges;

    public KotlinxWebsocketSerializationConverter(kotlinx.serialization.SerialFormat serialFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialFormat, "");
        this.getHighSpeedVideoFpsRanges = serialFormat;
        if ((serialFormat instanceof kotlinx.serialization.BinaryFormat) || (serialFormat instanceof kotlinx.serialization.StringFormat)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Only binary and string formats are supported, ");
        sb.append(serialFormat);
        sb.append(" is not supported.");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @Override // io.ktor.serialization.WebsocketContentConverter
    public final java.lang.Object serialize(java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, kotlin.coroutines.Continuation<? super io.ktor.websocket.Frame> continuation) {
        kotlinx.serialization.KSerializer<?> guessSerializer;
        try {
            guessSerializer = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighSpeedVideoFpsRanges.getSerializersModule(), typeInfo);
        } catch (kotlinx.serialization.SerializationException unused) {
            guessSerializer = io.ktor.serialization.kotlinx.SerializerLookupKt.guessSerializer(obj, this.getHighSpeedVideoFpsRanges.getSerializersModule());
        }
        kotlinx.serialization.SerialFormat serialFormat = this.getHighSpeedVideoFpsRanges;
        if (serialFormat instanceof kotlinx.serialization.StringFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(guessSerializer, "");
            return new io.ktor.websocket.Frame.Text(((kotlinx.serialization.StringFormat) serialFormat).encodeToString(guessSerializer, obj));
        }
        if (serialFormat instanceof kotlinx.serialization.BinaryFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(guessSerializer, "");
            return new io.ktor.websocket.Frame.Binary(true, ((kotlinx.serialization.BinaryFormat) serialFormat).encodeToByteArray(guessSerializer, obj));
        }
        throw new java.lang.IllegalStateException("Unsupported format ".concat(java.lang.String.valueOf(serialFormat)).toString());
    }

    @Override // io.ktor.serialization.WebsocketContentConverter
    public final java.lang.Object deserialize(java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        if (!isApplicable(frame)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported frame ");
            sb.append(frame.getFrameType().name());
            throw new io.ktor.serialization.WebsocketConverterNotFoundException(sb.toString(), null, 2, null);
        }
        kotlinx.serialization.KSerializer<?> serializerForTypeInfo = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighSpeedVideoFpsRanges.getSerializersModule(), typeInfo);
        kotlinx.serialization.SerialFormat serialFormat = this.getHighSpeedVideoFpsRanges;
        if (serialFormat instanceof kotlinx.serialization.StringFormat) {
            if (frame instanceof io.ktor.websocket.Frame.Text) {
                return ((kotlinx.serialization.StringFormat) serialFormat).decodeFromString(serializerForTypeInfo, io.ktor.websocket.FrameCommonKt.readText((io.ktor.websocket.Frame.Text) frame));
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported format ");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            sb2.append(" for ");
            sb2.append(frame.getFrameType().name());
            throw new io.ktor.serialization.WebsocketDeserializeException(sb2.toString(), null, frame, 2, null);
        }
        if (serialFormat instanceof kotlinx.serialization.BinaryFormat) {
            if (frame instanceof io.ktor.websocket.Frame.Binary) {
                return ((kotlinx.serialization.BinaryFormat) serialFormat).decodeFromByteArray(serializerForTypeInfo, io.ktor.websocket.FrameCommonKt.readBytes(frame));
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unsupported format ");
            sb3.append(this.getHighSpeedVideoFpsRanges);
            sb3.append(" for ");
            sb3.append(frame.getFrameType().name());
            throw new io.ktor.serialization.WebsocketDeserializeException(sb3.toString(), null, frame, 2, null);
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Unsupported format ");
        sb4.append(this.getHighSpeedVideoFpsRanges);
        throw new java.lang.IllegalStateException(sb4.toString().toString());
    }

    @Override // io.ktor.serialization.WebsocketContentConverter
    public final boolean isApplicable(io.ktor.websocket.Frame frame) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        return (frame instanceof io.ktor.websocket.Frame.Text) || (frame instanceof io.ktor.websocket.Frame.Binary);
    }
}
