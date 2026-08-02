package com.paypal.oslo.core.telemetry.vendors.fpti;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FPTIRequest$EventParams$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams> {
    public static final int $stable;
    public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$EventParams$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$EventParams$$serializer fPTIRequest$EventParams$$serializer = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$EventParams$$serializer();
        INSTANCE = fPTIRequest$EventParams$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams", fPTIRequest$EventParams$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("params", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_EVENT_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("product", true);
        pluginGeneratedSerialDescriptor.addElement(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, false);
        pluginGeneratedSerialDescriptor.addElement("client_event_key", false);
        pluginGeneratedSerialDescriptor.addElement("event_time", false);
        pluginGeneratedSerialDescriptor.addElement("space_key", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FPTIRequest$EventParams$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.core.telemetry.util.AnyMapSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.core.telemetry.util.AnyMap anyMap;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        java.lang.String str7 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.core.telemetry.util.AnyMap anyMap2 = (com.paypal.oslo.core.telemetry.util.AnyMap) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.telemetry.util.AnyMapSerializer.INSTANCE, null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            anyMap = anyMap2;
            str = beginStructure.decodeStringElement(serialDescriptor, 6);
            str4 = decodeStringElement4;
            str5 = decodeStringElement2;
            str6 = decodeStringElement3;
            str2 = str8;
            str3 = decodeStringElement;
            i = 127;
        } else {
            int i3 = 0;
            boolean z = true;
            java.lang.String str9 = null;
            com.paypal.oslo.core.telemetry.util.AnyMap anyMap3 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        anyMap3 = (com.paypal.oslo.core.telemetry.util.AnyMap) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.telemetry.util.AnyMapSerializer.INSTANCE, anyMap3);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                    case 2:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i3 |= 4;
                    case 3:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                    case 4:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                    case 5:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                    case 6:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str10;
            str2 = str9;
            anyMap = anyMap3;
            str3 = str13;
            str4 = str11;
            str5 = str12;
            str6 = str7;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams(i, anyMap, str3, str2, str5, str6, str4, str, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams.write$Self$telemetry_release(value, beginStructure, serialDescriptor);
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
