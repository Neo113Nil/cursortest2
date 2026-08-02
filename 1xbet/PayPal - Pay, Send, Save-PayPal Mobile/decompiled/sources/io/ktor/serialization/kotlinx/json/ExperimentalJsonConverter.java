package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lio/ktor/serialization/kotlinx/json/ExperimentalJsonConverter;", "Lio/ktor/serialization/ContentConverter;", "Lkotlinx/serialization/json/Json;", "format", "<init>", "(Lkotlinx/serialization/json/Json;)V", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lio/ktor/http/content/OutgoingContent;", "serialize", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExperimentalJsonConverter implements io.ktor.serialization.ContentConverter {
    private final kotlinx.serialization.json.Json getHighSpeedVideoSizes;

    public ExperimentalJsonConverter(kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighSpeedVideoSizes = json;
    }

    @Override // io.ktor.serialization.ContentConverter
    public final java.lang.Object serialize(io.ktor.http.ContentType contentType, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        kotlinx.serialization.KSerializer<?> guessSerializer;
        try {
            guessSerializer = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighSpeedVideoSizes.getSerializersModule(), typeInfo);
        } catch (kotlinx.serialization.SerializationException unused) {
            guessSerializer = io.ktor.serialization.kotlinx.SerializerLookupKt.guessSerializer(obj, this.getHighSpeedVideoSizes.getSerializersModule());
        }
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.serialization.json.Json json = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(guessSerializer, "");
        kotlinx.serialization.json.io.IoStreamsKt.encodeToSink(json, guessSerializer, obj, buffer);
        return new io.ktor.http.content.ChannelWriterContent(new io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2(buffer, null), contentType, null, kotlin.coroutines.jvm.internal.Boxing.boxLong(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(buffer)), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deserialize(java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1 experimentalJsonConverter$deserialize$1;
        int i;
        kotlinx.serialization.KSerializer<?> kSerializer;
        try {
            if (continuation instanceof io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1) {
                experimentalJsonConverter$deserialize$1 = (io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1) continuation;
                if ((experimentalJsonConverter$deserialize$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    experimentalJsonConverter$deserialize$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = experimentalJsonConverter$deserialize$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = experimentalJsonConverter$deserialize$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.serialization.KSerializer<?> serializerForTypeInfo = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighSpeedVideoSizes.getSerializersModule(), typeInfo);
                        experimentalJsonConverter$deserialize$1.getHighResolutionOutputSizeshNQ4ISI = serializerForTypeInfo;
                        experimentalJsonConverter$deserialize$1.getHighSpeedVideoFpsRanges = 1;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, experimentalJsonConverter$deserialize$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kSerializer = serializerForTypeInfo;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kSerializer = (kotlinx.serialization.KSerializer) experimentalJsonConverter$deserialize$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlinx.serialization.json.io.IoStreamsKt.decodeFromSource(this.getHighSpeedVideoSizes, kSerializer, (kotlinx.io.Source) obj);
                }
            }
            return kotlinx.serialization.json.io.IoStreamsKt.decodeFromSource(this.getHighSpeedVideoSizes, kSerializer, (kotlinx.io.Source) obj);
        } catch (java.lang.Throwable th) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal input: ");
            sb.append(th.getMessage());
            throw new io.ktor.serialization.JsonConvertException(sb.toString(), th);
        }
        experimentalJsonConverter$deserialize$1 = new io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1(this, continuation);
        java.lang.Object obj2 = experimentalJsonConverter$deserialize$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = experimentalJsonConverter$deserialize$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }
}
