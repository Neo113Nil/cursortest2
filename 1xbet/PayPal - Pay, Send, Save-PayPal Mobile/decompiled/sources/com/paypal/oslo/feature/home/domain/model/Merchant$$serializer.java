package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/Merchant$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/home/domain/model/Merchant;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/home/domain/model/Merchant;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/home/domain/model/Merchant;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Merchant$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.home.domain.model.Merchant> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.home.domain.model.Merchant$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.home.domain.model.Merchant$$serializer merchant$$serializer = new com.paypal.oslo.feature.home.domain.model.Merchant$$serializer();
        INSTANCE = merchant$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.home.domain.model.Merchant", merchant$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("logoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundColor", false);
        pluginGeneratedSerialDescriptor.addElement("showFavoriteButton", true);
        pluginGeneratedSerialDescriptor.addElement("isFavorite", true);
        pluginGeneratedSerialDescriptor.addElement("storeUrl", true);
        pluginGeneratedSerialDescriptor.addElement("benefitTypes", true);
        pluginGeneratedSerialDescriptor.addElement("benefitsMetadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Merchant$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.home.domain.model.Merchant.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[9].getValue(), com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.home.domain.model.Merchant deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        boolean z;
        boolean z2;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.List list;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata;
        java.lang.String str7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.home.domain.model.Merchant.$childSerializers;
        int i2 = 10;
        int i3 = 7;
        int i4 = 6;
        int i5 = 0;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 5);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            i = 2047;
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            benefitsMetadata = (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) beginStructure.decodeSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE, null);
            z = decodeBooleanElement2;
            z2 = decodeBooleanElement;
            str = decodeStringElement5;
            str3 = decodeStringElement3;
            str6 = str9;
            str2 = decodeStringElement4;
            str5 = str8;
            str4 = decodeStringElement2;
            str7 = decodeStringElement;
        } else {
            boolean z3 = true;
            java.lang.String str10 = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata2 = null;
            java.lang.String str11 = null;
            str = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            boolean z4 = false;
            boolean z5 = false;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                    case 0:
                        str14 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                    case 1:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                    case 2:
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        i5 |= 4;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                    case 3:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i2 = 10;
                    case 4:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                    case 5:
                        str = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                    case 6:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i5 |= 64;
                    case 7:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i5 |= 128;
                    case 8:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i5 |= 256;
                    case 9:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), list2);
                        i5 |= 512;
                    case 10:
                        benefitsMetadata2 = (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) beginStructure.decodeSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE, benefitsMetadata2);
                        i5 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            z = z4;
            z2 = z5;
            i = i5;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = str15;
            str6 = str10;
            list = list2;
            java.lang.String str16 = str14;
            benefitsMetadata = benefitsMetadata2;
            str7 = str16;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.home.domain.model.Merchant(i, str7, str4, str5, str3, str2, str, z2, z, str6, list, benefitsMetadata, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.home.domain.model.Merchant value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.home.domain.model.Merchant.write$Self$home_prodRelease(value, beginStructure, serialDescriptor);
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
