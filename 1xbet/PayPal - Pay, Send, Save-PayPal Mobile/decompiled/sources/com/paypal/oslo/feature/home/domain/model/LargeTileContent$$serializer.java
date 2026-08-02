package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class LargeTileContent$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.home.domain.model.LargeTileContent> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.home.domain.model.LargeTileContent$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.home.domain.model.LargeTileContent$$serializer largeTileContent$$serializer = new com.paypal.oslo.feature.home.domain.model.LargeTileContent$$serializer();
        INSTANCE = largeTileContent$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.home.domain.model.LargeTileContent", largeTileContent$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("buttonText", true);
        pluginGeneratedSerialDescriptor.addElement("overlayGradient", true);
        pluginGeneratedSerialDescriptor.addElement("showFavoriteButton", true);
        pluginGeneratedSerialDescriptor.addElement("isFavorite", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("paymentOption", true);
        pluginGeneratedSerialDescriptor.addElement("financingDetails", true);
        pluginGeneratedSerialDescriptor.addElement("currentPrice", true);
        pluginGeneratedSerialDescriptor.addElement("originalPrice", true);
        pluginGeneratedSerialDescriptor.addElement("storeUrl", true);
        pluginGeneratedSerialDescriptor.addElement("benefitTypes", true);
        pluginGeneratedSerialDescriptor.addElement("benefitsMetadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LargeTileContent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.home.domain.model.LargeTileContent.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[16].getValue(), com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.home.domain.model.LargeTileContent deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata;
        java.lang.String str3;
        java.lang.String str4;
        boolean z;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.util.List list;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        boolean z2;
        java.lang.String str14;
        int i;
        java.lang.String str15;
        java.lang.String str16;
        kotlin.Lazy[] lazyArr2;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        kotlin.Lazy[] lazyArr3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.home.domain.model.LargeTileContent.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 9);
            java.lang.String str24 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str26 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str27 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str28 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str29 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 16, (kotlinx.serialization.DeserializationStrategy) lazyArr[16].getValue(), null);
            str3 = str29;
            str11 = decodeStringElement2;
            benefitsMetadata = (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) beginStructure.decodeSerializableElement(serialDescriptor, 17, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE, null);
            str6 = str24;
            z2 = decodeBooleanElement2;
            str9 = str22;
            str = str28;
            str14 = str27;
            str2 = str26;
            str7 = str25;
            str13 = decodeStringElement4;
            i = 262143;
            str5 = str23;
            str8 = str21;
            str10 = decodeStringElement3;
            str12 = decodeStringElement;
            z = decodeBooleanElement;
            str4 = str20;
        } else {
            int i2 = 17;
            int i3 = 0;
            boolean z3 = false;
            boolean z4 = true;
            java.lang.String str30 = null;
            java.lang.String str31 = null;
            com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata2 = null;
            java.lang.String str32 = null;
            java.lang.String str33 = null;
            java.lang.String str34 = null;
            java.util.List list2 = null;
            java.lang.String str35 = null;
            java.lang.String str36 = null;
            java.lang.String str37 = null;
            java.lang.String str38 = null;
            java.lang.String str39 = null;
            java.lang.String str40 = null;
            java.lang.String str41 = null;
            java.lang.String str42 = null;
            java.lang.String str43 = null;
            boolean z5 = false;
            while (z4) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        str15 = str35;
                        str16 = str36;
                        lazyArr2 = lazyArr;
                        z4 = false;
                        lazyArr = lazyArr2;
                        str35 = str15;
                        str36 = str16;
                        i2 = 17;
                    case 0:
                        str17 = str43;
                        str15 = str35;
                        str16 = str36;
                        lazyArr2 = lazyArr;
                        str41 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        str43 = str17;
                        lazyArr = lazyArr2;
                        str35 = str15;
                        str36 = str16;
                        i2 = 17;
                    case 1:
                        str17 = str43;
                        str15 = str35;
                        str16 = str36;
                        lazyArr2 = lazyArr;
                        str40 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        str43 = str17;
                        lazyArr = lazyArr2;
                        str35 = str15;
                        str36 = str16;
                        i2 = 17;
                    case 2:
                        str18 = str36;
                        i3 |= 4;
                        str38 = str38;
                        str43 = str43;
                        i2 = 17;
                        str35 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str35);
                        lazyArr = lazyArr;
                        str36 = str18;
                    case 3:
                        str19 = str43;
                        str18 = str36;
                        lazyArr3 = lazyArr;
                        str39 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        str43 = str19;
                        lazyArr = lazyArr3;
                        i2 = 17;
                        str36 = str18;
                    case 4:
                        str19 = str43;
                        str18 = str36;
                        lazyArr3 = lazyArr;
                        str42 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        str43 = str19;
                        lazyArr = lazyArr3;
                        i2 = 17;
                        str36 = str18;
                    case 5:
                        str19 = str43;
                        str18 = str36;
                        lazyArr3 = lazyArr;
                        str38 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str38);
                        i3 |= 32;
                        str37 = str37;
                        str43 = str19;
                        lazyArr = lazyArr3;
                        i2 = 17;
                        str36 = str18;
                    case 6:
                        str18 = str36;
                        lazyArr3 = lazyArr;
                        str19 = str43;
                        str37 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str37);
                        i3 |= 64;
                        str43 = str19;
                        lazyArr = lazyArr3;
                        i2 = 17;
                        str36 = str18;
                    case 7:
                        i3 |= 128;
                        lazyArr = lazyArr;
                        str36 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str36);
                        i2 = 17;
                    case 8:
                        i3 |= 256;
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i2 = 17;
                    case 9:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 17;
                    case 10:
                        str33 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, str33);
                        i3 |= 1024;
                        i2 = 17;
                    case 11:
                        str34 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, str34);
                        i3 |= 2048;
                        i2 = 17;
                    case 12:
                        str30 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, str30);
                        i3 |= 4096;
                        i2 = 17;
                    case 13:
                        str31 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, str31);
                        i3 |= 8192;
                        i2 = 17;
                    case 14:
                        str43 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, str43);
                        i3 |= 16384;
                        i2 = 17;
                    case 15:
                        str32 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kotlinx.serialization.internal.StringSerializer.INSTANCE, str32);
                        i3 |= 32768;
                        i2 = 17;
                    case 16:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 16, (kotlinx.serialization.DeserializationStrategy) lazyArr[16].getValue(), list2);
                        i3 |= 65536;
                        i2 = 17;
                    case 17:
                        benefitsMetadata2 = (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) beginStructure.decodeSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE, benefitsMetadata2);
                        i3 |= 131072;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str43;
            java.lang.String str44 = str35;
            java.lang.String str45 = str36;
            java.lang.String str46 = str37;
            java.lang.String str47 = str38;
            str2 = str30;
            benefitsMetadata = benefitsMetadata2;
            str3 = str32;
            str4 = str44;
            z = z5;
            str5 = str45;
            str6 = str33;
            str7 = str34;
            list = list2;
            str8 = str47;
            str9 = str46;
            str10 = str39;
            str11 = str40;
            str12 = str41;
            str13 = str42;
            z2 = z3;
            str14 = str31;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.home.domain.model.LargeTileContent(i, str12, str11, str4, str10, str13, str8, str9, str5, z, z2, str6, str7, str2, str14, str, str3, list, benefitsMetadata, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.home.domain.model.LargeTileContent value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.home.domain.model.LargeTileContent.write$Self$home_prodRelease(value, beginStructure, serialDescriptor);
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
