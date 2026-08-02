package com.paypal.oslo.core.telemetry.vendors.fpti;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FPTIRequest$UserEvent$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent> {
    public static final int $stable;
    public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$UserEvent$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$UserEvent$$serializer fPTIRequest$UserEvent$$serializer = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$UserEvent$$serializer();
        INSTANCE = fPTIRequest$UserEvent$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent", fPTIRequest$UserEvent$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("common_event_params", false);
        pluginGeneratedSerialDescriptor.addElement("event_params", false);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FPTIRequest$UserEvent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$CommonEventParams$$serializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$User$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.util.List list;
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user;
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent.$childSerializers;
        java.util.List list2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams2 = (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$CommonEventParams$$serializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            commonEventParams = commonEventParams2;
            user = (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$User$$serializer.INSTANCE, null);
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user2 = null;
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    commonEventParams3 = (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$CommonEventParams$$serializer.INSTANCE, commonEventParams3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), list2);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    user2 = (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$User$$serializer.INSTANCE, user2);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list2;
            user = user2;
            commonEventParams = commonEventParams3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent(i, commonEventParams, list, user, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent.write$Self$telemetry_release(value, beginStructure, serialDescriptor);
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
