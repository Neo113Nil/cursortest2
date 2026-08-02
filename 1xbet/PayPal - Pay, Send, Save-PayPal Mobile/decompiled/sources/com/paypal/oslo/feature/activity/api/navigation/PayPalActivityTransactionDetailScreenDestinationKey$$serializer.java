package com.paypal.oslo.feature.activity.api.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PayPalActivityTransactionDetailScreenDestinationKey$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey$$serializer payPalActivityTransactionDetailScreenDestinationKey$$serializer = new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey$$serializer();
        INSTANCE = payPalActivityTransactionDetailScreenDestinationKey$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey", payPalActivityTransactionDetailScreenDestinationKey$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("myAccountPathTransactionId", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID, true);
        pluginGeneratedSerialDescriptor.addElement("groupId", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, true);
        pluginGeneratedSerialDescriptor.addElement("transactionShortDescription", true);
        pluginGeneratedSerialDescriptor.addElement("sourcePage", true);
        pluginGeneratedSerialDescriptor.addElement("source", true);
        pluginGeneratedSerialDescriptor.addElement("isShipmentAvailable", true);
        pluginGeneratedSerialDescriptor.addElement("subdomainId", true);
        pluginGeneratedSerialDescriptor.addElement("subdomainType", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private PayPalActivityTransactionDetailScreenDestinationKey$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 8;
        java.lang.String str13 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str5 = str22;
            str3 = str21;
            str2 = str19;
            str12 = str18;
            str11 = str17;
            str = str20;
            str10 = decodeStringElement;
            str7 = str15;
            i = 4095;
            str6 = str16;
            str9 = str14;
        } else {
            int i7 = 0;
            boolean z = true;
            java.lang.String str23 = null;
            java.lang.String str24 = null;
            java.lang.String str25 = null;
            java.lang.String str26 = null;
            java.lang.String str27 = null;
            java.lang.String str28 = null;
            java.lang.String str29 = null;
            java.lang.String str30 = null;
            java.lang.String str31 = null;
            java.lang.String str32 = null;
            java.lang.String str33 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                    case 0:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                    case 1:
                        str32 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str32);
                        i7 |= 2;
                        str29 = str29;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                    case 2:
                        str31 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str31);
                        i7 |= 4;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                    case 3:
                        str30 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str30);
                        i7 |= 8;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 4:
                        str33 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str33);
                        i7 |= 16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 5:
                        str29 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str29);
                        i7 |= 32;
                        i2 = 11;
                        i3 = 10;
                    case 6:
                        str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str23);
                        i7 |= 64;
                        i2 = 11;
                    case 7:
                        str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str25);
                        i7 |= 128;
                    case 8:
                        str24 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str24);
                        i7 |= 256;
                    case 9:
                        str26 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str26);
                        i7 |= 512;
                    case 10:
                        str28 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str28);
                        i7 |= 1024;
                    case 11:
                        str27 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str27);
                        i7 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str34 = str29;
            str = str24;
            str2 = str25;
            str3 = str26;
            str4 = str27;
            str5 = str28;
            i = i7;
            str6 = str33;
            str7 = str30;
            str8 = str31;
            str9 = str32;
            str10 = str13;
            str11 = str34;
            str12 = str23;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey(i, str10, str9, str8, str7, str6, str11, str12, str2, str, str3, str5, str4, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey.write$Self$activity_api_prodRelease(value, beginStructure, serialDescriptor);
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
