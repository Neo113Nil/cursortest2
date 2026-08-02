package com.paypal.oslo.feature.mosaic.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPagePersonNameFieldsConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPagePersonNameFieldsConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPagePersonNameFieldsConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPagePersonNameFieldsConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class MosaicPagePersonNameFieldsConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig$$serializer mosaicPagePersonNameFieldsConfig$$serializer = new com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig$$serializer();
        INSTANCE = mosaicPagePersonNameFieldsConfig$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig", mosaicPagePersonNameFieldsConfig$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("givenNameLabel", true);
        pluginGeneratedSerialDescriptor.addElement("isGivenNameRequired", true);
        pluginGeneratedSerialDescriptor.addElement("isMiddleNameRequired", true);
        pluginGeneratedSerialDescriptor.addElement("isSurnameRequired", true);
        pluginGeneratedSerialDescriptor.addElement("middleNameLabel", true);
        pluginGeneratedSerialDescriptor.addElement("surnameLabel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MosaicPagePersonNameFieldsConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        boolean z;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str = str4;
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            z = decodeBooleanElement3;
            str2 = str5;
            z2 = decodeBooleanElement2;
            z3 = decodeBooleanElement;
            i = 63;
        } else {
            boolean z4 = true;
            java.lang.String str6 = null;
            str = null;
            java.lang.String str7 = null;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i3 = 0;
            while (z4) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z4 = false;
                        i2 = 5;
                    case 0:
                        str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        z7 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 |= 2;
                    case 2:
                        z6 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i3 |= 4;
                    case 3:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i3 |= 8;
                    case 4:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i3 |= 16;
                    case 5:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            z = z5;
            str2 = str6;
            i = i3;
            str3 = str7;
            z2 = z6;
            z3 = z7;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig(i, str, z3, z2, z, str2, str3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig.write$Self$mosaic_prodRelease(value, beginStructure, serialDescriptor);
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
