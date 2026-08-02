package com.paypal.oslo.feature.oneonboarding.domain;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/AddressCorrectionMetadata$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/domain/AddressCorrectionMetadata;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/oneonboarding/domain/AddressCorrectionMetadata;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/oneonboarding/domain/AddressCorrectionMetadata;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AddressCorrectionMetadata$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata$$serializer addressCorrectionMetadata$$serializer = new com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata$$serializer();
        INSTANCE = addressCorrectionMetadata$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata", addressCorrectionMetadata$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("originalAddressId", false);
        pluginGeneratedSerialDescriptor.addElement("correctedAddressId", false);
        pluginGeneratedSerialDescriptor.addElement("correctedAddress", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddressCorrectionMetadata$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.oneonboarding.domain.AddressId$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.domain.AddressId$$serializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.Address$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.Address address;
        java.lang.String str2;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.oneonboarding.domain.AddressId addressId = (com.paypal.oslo.feature.oneonboarding.domain.AddressId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.oneonboarding.domain.AddressId$$serializer.INSTANCE, null);
            java.lang.String m16699unboximpl = addressId != null ? addressId.m16699unboximpl() : null;
            com.paypal.oslo.feature.oneonboarding.domain.AddressId addressId2 = (com.paypal.oslo.feature.oneonboarding.domain.AddressId) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.oneonboarding.domain.AddressId$$serializer.INSTANCE, null);
            java.lang.String m16699unboximpl2 = addressId2 != null ? addressId2.m16699unboximpl() : null;
            str = m16699unboximpl;
            address = (com.paypal.oslo.core.i18n.domain.model.Address) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.i18n.domain.model.Address$$serializer.INSTANCE, null);
            str2 = m16699unboximpl2;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str3 = null;
            com.paypal.oslo.core.i18n.domain.model.Address address2 = null;
            java.lang.String str4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    com.paypal.oslo.feature.oneonboarding.domain.AddressId addressId3 = (com.paypal.oslo.feature.oneonboarding.domain.AddressId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.oneonboarding.domain.AddressId$$serializer.INSTANCE, str3 != null ? com.paypal.oslo.feature.oneonboarding.domain.AddressId.m16693boximpl(str3) : null);
                    str3 = addressId3 != null ? addressId3.m16699unboximpl() : null;
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    com.paypal.oslo.feature.oneonboarding.domain.AddressId addressId4 = (com.paypal.oslo.feature.oneonboarding.domain.AddressId) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.oneonboarding.domain.AddressId$$serializer.INSTANCE, str4 != null ? com.paypal.oslo.feature.oneonboarding.domain.AddressId.m16693boximpl(str4) : null);
                    str4 = addressId4 != null ? addressId4.m16699unboximpl() : null;
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    address2 = (com.paypal.oslo.core.i18n.domain.model.Address) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.i18n.domain.model.Address$$serializer.INSTANCE, address2);
                    i2 |= 4;
                }
            }
            str = str3;
            address = address2;
            str2 = str4;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata(i, str, str2, address, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata.write$Self$one_onboarding_prodRelease(value, beginStructure, serialDescriptor);
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
