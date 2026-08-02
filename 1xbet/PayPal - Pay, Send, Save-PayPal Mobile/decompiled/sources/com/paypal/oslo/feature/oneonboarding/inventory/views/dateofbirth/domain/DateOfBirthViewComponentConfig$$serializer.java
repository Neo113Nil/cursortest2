package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DateOfBirthViewComponentConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig$$serializer dateOfBirthViewComponentConfig$$serializer = new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig$$serializer();
        INSTANCE = dateOfBirthViewComponentConfig$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig", dateOfBirthViewComponentConfig$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("variant", false);
        pluginGeneratedSerialDescriptor.addElement("isEditable", false);
        pluginGeneratedSerialDescriptor.addElement("prefilledValue", false);
        pluginGeneratedSerialDescriptor.addElement("allowDatePicker", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DateOfBirthViewComponentConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate$$serializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant;
        java.lang.String str;
        boolean z;
        int i;
        boolean z2;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId componentId = (com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, null);
            java.lang.String m16614unboximpl = componentId != null ? componentId.m16614unboximpl() : null;
            com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant2 = (com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate birthDate = (com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate$$serializer.INSTANCE, null);
            java.lang.String m16997unboximpl = birthDate != null ? birthDate.m16997unboximpl() : null;
            dateOfBirthVariant = dateOfBirthVariant2;
            str = m16614unboximpl;
            z = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            i = 31;
            z2 = decodeBooleanElement;
            str2 = m16997unboximpl;
        } else {
            boolean z3 = false;
            int i2 = 0;
            boolean z4 = false;
            boolean z5 = true;
            com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant3 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z5 = false;
                } else if (decodeElementIndex == 0) {
                    com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId componentId2 = (com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, str3 != null ? com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(str3) : null);
                    i2 |= 1;
                    str3 = componentId2 != null ? componentId2.m16614unboximpl() : null;
                } else if (decodeElementIndex == 1) {
                    dateOfBirthVariant3 = (com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), dateOfBirthVariant3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    z4 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate birthDate2 = (com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate$$serializer.INSTANCE, str4 != null ? com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate.m16991boximpl(str4) : null);
                    str4 = birthDate2 != null ? birthDate2.m16997unboximpl() : null;
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    z3 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            dateOfBirthVariant = dateOfBirthVariant3;
            str = str3;
            z = z3;
            i = i2;
            z2 = z4;
            str2 = str4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig(i, str, dateOfBirthVariant, z2, str2, z, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig.write$Self$one_onboarding_prodRelease(value, beginStructure, serialDescriptor);
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
