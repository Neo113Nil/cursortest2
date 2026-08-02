package com.paypal.oslo.feature.wallet.api.navigation.result.cards;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Card$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card$$serializer card$$serializer = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card$$serializer();
        INSTANCE = card$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card", card$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("lastNChars", true);
        pluginGeneratedSerialDescriptor.addElement("brand", true);
        pluginGeneratedSerialDescriptor.addElement("issuerName", true);
        pluginGeneratedSerialDescriptor.addElement("issuerId", true);
        pluginGeneratedSerialDescriptor.addElement("issuerCountryCode", true);
        pluginGeneratedSerialDescriptor.addElement("issuerDescription", true);
        pluginGeneratedSerialDescriptor.addElement("nickName", true);
        pluginGeneratedSerialDescriptor.addElement("expirationDate", true);
        pluginGeneratedSerialDescriptor.addElement("billingAddress", true);
        pluginGeneratedSerialDescriptor.addElement("address", true);
        pluginGeneratedSerialDescriptor.addElement("currencyCode", true);
        pluginGeneratedSerialDescriptor.addElement("productClass", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("institutionImages", true);
        pluginGeneratedSerialDescriptor.addElement("cardArtPrimaryImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("thumbnailImageUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private Card$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[14].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.util.List list;
        int i;
        java.lang.String str13;
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address;
        java.lang.String str14;
        java.lang.String str15;
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address2;
        java.lang.String str16;
        java.lang.String str17;
        kotlin.Lazy[] lazyArr2;
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address3;
        java.lang.String str18;
        kotlin.Lazy[] lazyArr3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card.$childSerializers;
        java.lang.String str19 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str24 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str26 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str27 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str28 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address4 = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address$$serializer.INSTANCE, null);
            java.lang.String str29 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str30 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str31 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 14, (kotlinx.serialization.DeserializationStrategy) lazyArr[14].getValue(), null);
            str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str3 = str31;
            str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str15 = str22;
            address = address4;
            str7 = str25;
            list = list2;
            str11 = str30;
            str10 = str29;
            i = 131071;
            str8 = str26;
            str6 = str24;
            str = str27;
            str4 = decodeStringElement;
            str13 = str21;
            str2 = str28;
            str5 = str23;
            str14 = str20;
        } else {
            int i2 = 16;
            int i3 = 0;
            boolean z = true;
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address5 = null;
            java.lang.String str32 = null;
            java.lang.String str33 = null;
            java.lang.String str34 = null;
            java.lang.String str35 = null;
            java.lang.String str36 = null;
            java.lang.String str37 = null;
            java.util.List list3 = null;
            java.lang.String str38 = null;
            java.lang.String str39 = null;
            java.lang.String str40 = null;
            java.lang.String str41 = null;
            java.lang.String str42 = null;
            java.lang.String str43 = null;
            java.lang.String str44 = null;
            java.lang.String str45 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 16;
                        str38 = str38;
                        address5 = address5;
                    case 0:
                        address2 = address5;
                        str16 = str38;
                        str17 = str40;
                        lazyArr2 = lazyArr;
                        str39 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        lazyArr = lazyArr2;
                        i2 = 16;
                        str38 = str16;
                        str40 = str17;
                        address5 = address2;
                    case 1:
                        address2 = address5;
                        str17 = str40;
                        lazyArr2 = lazyArr;
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str38);
                        i3 |= 2;
                        str45 = str45;
                        lazyArr = lazyArr2;
                        i2 = 16;
                        str38 = str16;
                        str40 = str17;
                        address5 = address2;
                    case 2:
                        address3 = address5;
                        str18 = str40;
                        lazyArr3 = lazyArr;
                        str45 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str45);
                        i3 |= 4;
                        str44 = str44;
                        address5 = address3;
                        lazyArr = lazyArr3;
                        i2 = 16;
                        str40 = str18;
                    case 3:
                        address3 = address5;
                        str18 = str40;
                        lazyArr3 = lazyArr;
                        str33 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str33);
                        i3 |= 8;
                        address5 = address3;
                        lazyArr = lazyArr3;
                        i2 = 16;
                        str40 = str18;
                    case 4:
                        address3 = address5;
                        str18 = str40;
                        lazyArr3 = lazyArr;
                        str44 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str44);
                        i3 |= 16;
                        str43 = str43;
                        address5 = address3;
                        lazyArr = lazyArr3;
                        i2 = 16;
                        str40 = str18;
                    case 5:
                        address3 = address5;
                        str18 = str40;
                        lazyArr3 = lazyArr;
                        str43 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str43);
                        i3 |= 32;
                        str42 = str42;
                        address5 = address3;
                        lazyArr = lazyArr3;
                        i2 = 16;
                        str40 = str18;
                    case 6:
                        address3 = address5;
                        str18 = str40;
                        lazyArr3 = lazyArr;
                        str42 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str42);
                        i3 |= 64;
                        str41 = str41;
                        address5 = address3;
                        lazyArr = lazyArr3;
                        i2 = 16;
                        str40 = str18;
                    case 7:
                        str18 = str40;
                        lazyArr3 = lazyArr;
                        address3 = address5;
                        str41 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str41);
                        i3 |= 128;
                        address5 = address3;
                        lazyArr = lazyArr3;
                        i2 = 16;
                        str40 = str18;
                    case 8:
                        i3 |= 256;
                        lazyArr = lazyArr;
                        str40 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str40);
                        i2 = 16;
                    case 9:
                        str34 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, str34);
                        i3 |= 512;
                        i2 = 16;
                    case 10:
                        address5 = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address$$serializer.INSTANCE, address5);
                        i3 |= 1024;
                        i2 = 16;
                    case 11:
                        str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, str19);
                        i3 |= 2048;
                        i2 = 16;
                    case 12:
                        str35 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, str35);
                        i3 |= 4096;
                        i2 = 16;
                    case 13:
                        str36 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, str36);
                        i3 |= 8192;
                        i2 = 16;
                    case 14:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 14, (kotlinx.serialization.DeserializationStrategy) lazyArr[14].getValue(), list3);
                        i3 |= 16384;
                        i2 = 16;
                    case 15:
                        str37 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kotlinx.serialization.internal.StringSerializer.INSTANCE, str37);
                        i3 |= 32768;
                        i2 = 16;
                    case 16:
                        str32 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str32);
                        i3 |= 65536;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address6 = address5;
            java.lang.String str46 = str38;
            str = str40;
            str2 = str34;
            str3 = str36;
            str4 = str39;
            str5 = str44;
            str6 = str43;
            str7 = str42;
            str8 = str41;
            str9 = str32;
            str10 = str19;
            str11 = str35;
            str12 = str37;
            list = list3;
            i = i3;
            str13 = str45;
            address = address6;
            str14 = str46;
            str15 = str33;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card(i, str4, str14, str13, str15, str5, str6, str7, str8, str, str2, address, str10, str11, str3, list, str12, str9, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card.write$Self$wallet_api_prodRelease(value, beginStructure, serialDescriptor);
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
