package com.paypal.oslo.feature.smartroute.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class SmartRouteNavResult$Updated$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated> {
    public static final com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$Updated$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$Updated$$serializer smartRouteNavResult$Updated$$serializer = new com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$Updated$$serializer();
        INSTANCE = smartRouteNavResult$Updated$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("updated", smartRouteNavResult$Updated$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("savingsPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("cryptoPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SmartRouteNavResult$Updated$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        float f;
        java.lang.String str;
        float f2;
        com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated.$childSerializers;
        java.lang.String str2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus2 = (com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            float decodeFloatElement = beginStructure.decodeFloatElement(serialDescriptor, 1);
            float decodeFloatElement2 = beginStructure.decodeFloatElement(serialDescriptor, 2);
            smartRouteStatus = smartRouteStatus2;
            f = decodeFloatElement;
            str = beginStructure.decodeStringElement(serialDescriptor, 3);
            f2 = decodeFloatElement2;
            i = 15;
        } else {
            float f3 = 0.0f;
            float f4 = 0.0f;
            com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus3 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    smartRouteStatus3 = (com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), smartRouteStatus3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    f3 = beginStructure.decodeFloatElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    f4 = beginStructure.decodeFloatElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            f = f3;
            str = str2;
            f2 = f4;
            smartRouteStatus = smartRouteStatus3;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated(i, smartRouteStatus, f, f2, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated.write$Self$smart_route_api_prodRelease(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }
}
