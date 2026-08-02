package com.paypal.oslo.feature.p2p.api.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CurrencyPickerDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination$$serializer currencyPickerDestination$$serializer = new com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination$$serializer();
        INSTANCE = currencyPickerDestination$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination", currencyPickerDestination$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, false);
        pluginGeneratedSerialDescriptor.addElement("currentAmount", true);
        pluginGeneratedSerialDescriptor.addElement("sendCurrencyCode", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, true);
        pluginGeneratedSerialDescriptor.addElement("isEditMode", true);
        pluginGeneratedSerialDescriptor.addElement("editModeIntent", true);
        pluginGeneratedSerialDescriptor.addElement("popCurrentOnCurrencySelect", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private CurrencyPickerDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[3].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        boolean z2;
        int i;
        java.lang.String str;
        java.util.List list;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            str4 = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            list = list2;
            i = 127;
            str2 = beginStructure.decodeStringElement(serialDescriptor, 5);
            str = decodeStringElement2;
            z2 = decodeBooleanElement;
            z = beginStructure.decodeBooleanElement(serialDescriptor, 6);
            str3 = decodeStringElement;
        } else {
            boolean z3 = true;
            java.lang.String str5 = null;
            java.util.List list3 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            boolean z4 = false;
            boolean z5 = false;
            int i2 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        continue;
                    case 0:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list3);
                        i2 |= 8;
                        break;
                    case 4:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            z = z4;
            z2 = z5;
            i = i2;
            str = str5;
            list = list3;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination(i, str4, str3, str, list, z2, str2, z, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.write$Self$p2p_api_prodRelease(value, beginStructure, serialDescriptor);
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
