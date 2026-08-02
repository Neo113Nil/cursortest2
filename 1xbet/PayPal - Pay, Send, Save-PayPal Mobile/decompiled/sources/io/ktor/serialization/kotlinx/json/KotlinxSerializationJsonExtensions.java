package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions;", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "Lkotlinx/serialization/json/Json;", "format", "<init>", "(Lkotlinx/serialization/json/Json;)V", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lio/ktor/http/content/OutgoingContent;", "serialize", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI", "", "Lio/ktor/serialization/kotlinx/json/JsonArraySymbols;", "Camera2StreamConfigurationMap", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KotlinxSerializationJsonExtensions implements io.ktor.serialization.kotlinx.KotlinxSerializationExtension {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.nio.charset.Charset, io.ktor.serialization.kotlinx.json.JsonArraySymbols> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r3, r4, 0, 0, r11, 6, null) != r12) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$serialize(io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, kotlinx.coroutines.flow.Flow flow, kotlinx.serialization.KSerializer kSerializer, java.nio.charset.Charset charset, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation continuation) {
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3 kotlinxSerializationJsonExtensions$serialize$3;
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3 kotlinxSerializationJsonExtensions$serialize$32;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.serialization.KSerializer kSerializer2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        java.nio.charset.Charset charset2;
        kotlinx.coroutines.flow.Flow flow2;
        io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols;
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols2;
        if (continuation instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3) {
            kotlinxSerializationJsonExtensions$serialize$3 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3) continuation;
            if ((kotlinxSerializationJsonExtensions$serialize$3.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                kotlinxSerializationJsonExtensions$serialize$3.getOutputMinFrameDuration -= 2147483648;
                kotlinxSerializationJsonExtensions$serialize$32 = kotlinxSerializationJsonExtensions$serialize$3;
                java.lang.Object obj = kotlinxSerializationJsonExtensions$serialize$32.getOutputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kotlinxSerializationJsonExtensions$serialize$32.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map<java.nio.charset.Charset, io.ktor.serialization.kotlinx.json.JsonArraySymbols> map = kotlinxSerializationJsonExtensions.getHighSpeedVideoFpsRangesFor;
                    io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols3 = map.get(charset);
                    if (jsonArraySymbols3 == null) {
                        jsonArraySymbols3 = new io.ktor.serialization.kotlinx.json.JsonArraySymbols(charset);
                        map.put(charset, jsonArraySymbols3);
                    }
                    io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols4 = jsonArraySymbols3;
                    byte[] bArr = jsonArraySymbols4.Camera2StreamConfigurationMap;
                    kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRanges = flow;
                    kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoSizes = kSerializer;
                    kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRangesFor = charset;
                    kotlinxSerializationJsonExtensions$serialize$32.Camera2StreamConfigurationMap = byteWriteChannel;
                    kotlinxSerializationJsonExtensions$serialize$32.getHighResolutionOutputSizeshNQ4ISI = jsonArraySymbols4;
                    kotlinxSerializationJsonExtensions$serialize$32.getOutputMinFrameDuration = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, kotlinxSerializationJsonExtensions$serialize$32, 6, null) != coroutine_suspended) {
                        kSerializer2 = kSerializer;
                        byteWriteChannel2 = byteWriteChannel;
                        charset2 = charset;
                        flow2 = flow;
                        jsonArraySymbols = jsonArraySymbols4;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols5 = (io.ktor.serialization.kotlinx.json.JsonArraySymbols) kotlinxSerializationJsonExtensions$serialize$32.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) kotlinxSerializationJsonExtensions$serialize$32.Camera2StreamConfigurationMap;
                    java.nio.charset.Charset charset3 = (java.nio.charset.Charset) kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRangesFor;
                    kotlinx.serialization.KSerializer kSerializer3 = (kotlinx.serialization.KSerializer) kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoSizes;
                    flow2 = (kotlinx.coroutines.flow.Flow) kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    jsonArraySymbols = jsonArraySymbols5;
                    byteWriteChannel2 = byteWriteChannel4;
                    charset2 = charset3;
                    kSerializer2 = kSerializer3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    jsonArraySymbols2 = (io.ktor.serialization.kotlinx.json.JsonArraySymbols) kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoSizes;
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = (io.ktor.utils.io.ByteWriteChannel) kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteWriteChannel3 = byteWriteChannel5;
                    byte[] bArr2 = jsonArraySymbols2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRanges = null;
                    kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoSizes = null;
                    kotlinxSerializationJsonExtensions$serialize$32.getOutputMinFrameDuration = 3;
                }
                kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(byteWriteChannel2, jsonArraySymbols, kotlinxSerializationJsonExtensions, kSerializer2, charset2);
                kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRanges = byteWriteChannel2;
                kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoSizes = jsonArraySymbols;
                kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRangesFor = null;
                kotlinxSerializationJsonExtensions$serialize$32.Camera2StreamConfigurationMap = null;
                kotlinxSerializationJsonExtensions$serialize$32.getHighResolutionOutputSizeshNQ4ISI = null;
                kotlinxSerializationJsonExtensions$serialize$32.getOutputMinFrameDuration = 2;
                if (flow2.collect(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1, kotlinxSerializationJsonExtensions$serialize$32) != coroutine_suspended) {
                    byteWriteChannel3 = byteWriteChannel2;
                    jsonArraySymbols2 = jsonArraySymbols;
                    byte[] bArr22 = jsonArraySymbols2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRanges = null;
                    kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoSizes = null;
                    kotlinxSerializationJsonExtensions$serialize$32.getOutputMinFrameDuration = 3;
                }
                return coroutine_suspended;
            }
        }
        kotlinxSerializationJsonExtensions$serialize$3 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3(kotlinxSerializationJsonExtensions, continuation);
        kotlinxSerializationJsonExtensions$serialize$32 = kotlinxSerializationJsonExtensions$serialize$3;
        java.lang.Object obj2 = kotlinxSerializationJsonExtensions$serialize$32.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinxSerializationJsonExtensions$serialize$32.getOutputMinFrameDuration;
        if (i != 0) {
        }
        kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(byteWriteChannel2, jsonArraySymbols, kotlinxSerializationJsonExtensions, kSerializer2, charset2);
        kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRanges = byteWriteChannel2;
        kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoSizes = jsonArraySymbols;
        kotlinxSerializationJsonExtensions$serialize$32.getHighSpeedVideoFpsRangesFor = null;
        kotlinxSerializationJsonExtensions$serialize$32.Camera2StreamConfigurationMap = null;
        kotlinxSerializationJsonExtensions$serialize$32.getHighResolutionOutputSizeshNQ4ISI = null;
        kotlinxSerializationJsonExtensions$serialize$32.getOutputMinFrameDuration = 2;
        if (flow2.collect(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1, kotlinxSerializationJsonExtensions$serialize$32) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public KotlinxSerializationJsonExtensions(kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighResolutionOutputSizeshNQ4ISI = json;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
    }

    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    public final java.lang.Object serialize(io.ktor.http.ContentType contentType, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8) || !kotlin.jvm.internal.Intrinsics.areEqual(typeInfo.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.flow.Flow.class))) {
            return null;
        }
        return new io.ktor.http.content.ChannelWriterContent(new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2(this, obj, io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighResolutionOutputSizeshNQ4ISI.getSerializersModule(), io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensionsKt.argumentTypeInfo(typeInfo)), charset, null), io.ktor.http.ContentTypesKt.withCharsetIfNeeded(contentType, charset), null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deserialize(java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1 kotlinxSerializationJsonExtensions$deserialize$1;
        int i;
        try {
            if (continuation instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1) {
                kotlinxSerializationJsonExtensions$deserialize$1 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1) continuation;
                if ((kotlinxSerializationJsonExtensions$deserialize$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    kotlinxSerializationJsonExtensions$deserialize$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = kotlinxSerializationJsonExtensions$deserialize$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = kotlinxSerializationJsonExtensions$deserialize$1.getHighSpeedVideoFpsRangesFor;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8) || !kotlin.jvm.internal.Intrinsics.areEqual(typeInfo.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.sequences.Sequence.class))) {
                        return null;
                    }
                    kotlinx.serialization.json.Json json = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlinxSerializationJsonExtensions$deserialize$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object deserializeSequence = io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt.deserializeSequence(json, byteReadChannel, typeInfo, kotlinxSerializationJsonExtensions$deserialize$1);
                    return deserializeSequence == coroutine_suspended ? coroutine_suspended : deserializeSequence;
                }
            }
            if (i == 0) {
            }
        } catch (java.lang.Throwable th) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal input: ");
            sb.append(th.getMessage());
            throw new io.ktor.serialization.JsonConvertException(sb.toString(), th);
        }
        kotlinxSerializationJsonExtensions$deserialize$1 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1(this, continuation);
        java.lang.Object obj2 = kotlinxSerializationJsonExtensions$deserialize$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinxSerializationJsonExtensions$deserialize$1.getHighSpeedVideoFpsRangesFor;
    }
}
