package com.ingo.sdk.kotlin.common.core.http.response;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/InputValidationErrorResponse$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/core/http/response/InputValidationErrorResponse;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/core/http/response/InputValidationErrorResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/core/http/response/InputValidationErrorResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class InputValidationErrorResponse$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse> {
    public static final com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse$$serializer inputValidationErrorResponse$$serializer = new com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse$$serializer();
        INSTANCE = inputValidationErrorResponse$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse", inputValidationErrorResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("errorCode", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("detail", false);
        pluginGeneratedSerialDescriptor.addElement("traceId", true);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("validationErrors", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 2);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            str3 = decodeStringElement;
            str = decodeStringElement4;
            str4 = decodeStringElement3;
            str5 = str6;
            i = decodeIntElement;
            i2 = 127;
            str2 = decodeStringElement2;
        } else {
            boolean z = true;
            int i3 = 0;
            java.lang.String str7 = null;
            java.util.List list2 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            int i4 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        i3 = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i4 |= 16;
                        break;
                    case 5:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), list2);
                        i4 |= 64;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            list = list2;
            str = str8;
            str2 = str10;
            str3 = str11;
            str4 = str7;
            str5 = str9;
            i = i3;
            i2 = i4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse(i2, str3, str2, i, str4, str5, str, list, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse.write$Self$sharedSdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private InputValidationErrorResponse$$serializer() {
    }
}
