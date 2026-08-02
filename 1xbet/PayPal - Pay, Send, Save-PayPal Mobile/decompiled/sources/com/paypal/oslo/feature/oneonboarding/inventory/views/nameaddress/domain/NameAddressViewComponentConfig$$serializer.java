package com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class NameAddressViewComponentConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig$$serializer nameAddressViewComponentConfig$$serializer = new com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig$$serializer();
        INSTANCE = nameAddressViewComponentConfig$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig", nameAddressViewComponentConfig$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("variant", false);
        pluginGeneratedSerialDescriptor.addElement("isEditable", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("address", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NameAddressViewComponentConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.PersonName$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.PersonName personName;
        boolean z;
        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId componentId = (com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, null);
            java.lang.String m16614unboximpl = componentId != null ? componentId.m16614unboximpl() : null;
            com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant2 = (com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            com.paypal.oslo.core.i18n.domain.model.PersonName personName2 = (com.paypal.oslo.core.i18n.domain.model.PersonName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.core.i18n.domain.model.PersonName$$serializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            str = m16614unboximpl;
            personName = personName2;
            z = decodeBooleanElement;
            nameAddressVariant = nameAddressVariant2;
            i = 31;
        } else {
            boolean z2 = false;
            int i2 = 0;
            boolean z3 = true;
            java.util.List list2 = null;
            java.lang.String str2 = null;
            com.paypal.oslo.core.i18n.domain.model.PersonName personName3 = null;
            com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant3 = null;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z3 = false;
                } else if (decodeElementIndex == 0) {
                    com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId componentId2 = (com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, str2 != null ? com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(str2) : null);
                    i2 |= 1;
                    str2 = componentId2 != null ? componentId2.m16614unboximpl() : null;
                } else if (decodeElementIndex == 1) {
                    nameAddressVariant3 = (com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), nameAddressVariant3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    personName3 = (com.paypal.oslo.core.i18n.domain.model.PersonName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.core.i18n.domain.model.PersonName$$serializer.INSTANCE, personName3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list2);
                    i2 |= 16;
                }
            }
            list = list2;
            str = str2;
            personName = personName3;
            z = z2;
            nameAddressVariant = nameAddressVariant3;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig(i, str, nameAddressVariant, z, personName, list, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.write$Self$one_onboarding_prodRelease(value, beginStructure, serialDescriptor);
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
