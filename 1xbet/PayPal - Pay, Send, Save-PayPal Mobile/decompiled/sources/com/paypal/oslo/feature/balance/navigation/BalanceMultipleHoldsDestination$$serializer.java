package com.paypal.oslo.feature.balance.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/BalanceMultipleHoldsDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/balance/navigation/BalanceMultipleHoldsDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/balance/navigation/BalanceMultipleHoldsDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/balance/navigation/BalanceMultipleHoldsDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class BalanceMultipleHoldsDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination$$serializer balanceMultipleHoldsDestination$$serializer = new com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination$$serializer();
        INSTANCE = balanceMultipleHoldsDestination$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination", balanceMultipleHoldsDestination$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("taxHoldAmount", false);
        pluginGeneratedSerialDescriptor.addElement("taxHoldCurrencyCode", false);
        pluginGeneratedSerialDescriptor.addElement("taxHoldTaxRate", false);
        pluginGeneratedSerialDescriptor.addElement("taxHoldNextWithholdingDate", false);
        pluginGeneratedSerialDescriptor.addElement("taxHoldAmountTaxIdRequired", false);
        pluginGeneratedSerialDescriptor.addElement("isTaxIdProvided", false);
        pluginGeneratedSerialDescriptor.addElement("otherHoldsAmount", false);
        pluginGeneratedSerialDescriptor.addElement("otherHoldsCurrencyCode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BalanceMultipleHoldsDestination$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.DoubleSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        double d;
        int i;
        java.lang.String str;
        double d2;
        boolean z;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        double d3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            double decodeDoubleElement = beginStructure.decodeDoubleElement(serialDescriptor, 0);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 3);
            double decodeDoubleElement2 = beginStructure.decodeDoubleElement(serialDescriptor, 4);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 5);
            double decodeDoubleElement3 = beginStructure.decodeDoubleElement(serialDescriptor, 6);
            str = beginStructure.decodeStringElement(serialDescriptor, 7);
            z = decodeBooleanElement;
            str3 = decodeStringElement3;
            str4 = decodeStringElement2;
            d = decodeDoubleElement2;
            d2 = decodeDoubleElement3;
            str2 = decodeStringElement;
            i = 255;
            d3 = decodeDoubleElement;
        } else {
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            boolean z2 = true;
            boolean z3 = false;
            double d4 = 0.0d;
            d = 0.0d;
            double d5 = 0.0d;
            java.lang.String str8 = null;
            i = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        d4 = beginStructure.decodeDoubleElement(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case 1:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        d = beginStructure.decodeDoubleElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        d5 = beginStructure.decodeDoubleElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str8;
            d2 = d5;
            z = z3;
            java.lang.String str9 = str7;
            str2 = str5;
            double d6 = d4;
            str3 = str6;
            str4 = str9;
            d3 = d6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination(i, d3, str2, str4, str3, d, z, d2, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination.write$Self$balance_prodRelease(value, beginStructure, serialDescriptor);
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
