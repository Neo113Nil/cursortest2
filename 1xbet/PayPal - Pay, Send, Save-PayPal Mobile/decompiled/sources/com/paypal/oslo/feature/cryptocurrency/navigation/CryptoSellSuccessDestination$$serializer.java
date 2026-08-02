package com.paypal.oslo.feature.cryptocurrency.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoSellSuccessDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoSellSuccessDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoSellSuccessDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoSellSuccessDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CryptoSellSuccessDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination$$serializer cryptoSellSuccessDestination$$serializer = new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination$$serializer();
        INSTANCE = cryptoSellSuccessDestination$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination", cryptoSellSuccessDestination$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("tradeId", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, false);
        pluginGeneratedSerialDescriptor.addElement("assetName", false);
        pluginGeneratedSerialDescriptor.addElement("assetLogoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("cryptoAmount", false);
        pluginGeneratedSerialDescriptor.addElement("fiatAmount", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CryptoSellSuccessDestination$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement6 = beginStructure.decodeStringElement(serialDescriptor, 5);
            str3 = decodeStringElement;
            str = beginStructure.decodeStringElement(serialDescriptor, 6);
            str2 = decodeStringElement6;
            str4 = decodeStringElement4;
            str6 = decodeStringElement5;
            str7 = decodeStringElement3;
            str5 = decodeStringElement2;
            i = 127;
        } else {
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str14 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str9;
            i = i2;
            str2 = str10;
            str3 = str8;
            java.lang.String str15 = str13;
            str4 = str11;
            str5 = str14;
            str6 = str12;
            str7 = str15;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination(i, str3, str5, str7, str4, str6, str2, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination.write$Self$cryptocurrency_prodRelease(value, beginStructure, serialDescriptor);
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
