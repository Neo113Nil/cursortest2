package com.paypal.oslo.feature.p2p.api.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/api/navigation/CrossBorderDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/p2p/api/navigation/CrossBorderDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/p2p/api/navigation/CrossBorderDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/p2p/api/navigation/CrossBorderDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CrossBorderDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination$$serializer crossBorderDestination$$serializer = new com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination$$serializer();
        INSTANCE = crossBorderDestination$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination", crossBorderDestination$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, false);
        pluginGeneratedSerialDescriptor.addElement("initialAmount", false);
        pluginGeneratedSerialDescriptor.addElement("sendCurrencyCode", false);
        pluginGeneratedSerialDescriptor.addElement("receiveCurrencyCode", false);
        pluginGeneratedSerialDescriptor.addElement("receiveCurrencyId", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, false);
        pluginGeneratedSerialDescriptor.addElement("isEditMode", true);
        pluginGeneratedSerialDescriptor.addElement("editModeIntent", true);
        pluginGeneratedSerialDescriptor.addElement("initialReceiveAmount", true);
        pluginGeneratedSerialDescriptor.addElement("isFromEditAmountScreen", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private CrossBorderDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[5].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z2;
        int i;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination.$childSerializers;
        int i2 = 9;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 6);
            java.lang.String decodeStringElement6 = beginStructure.decodeStringElement(serialDescriptor, 7);
            java.lang.String decodeStringElement7 = beginStructure.decodeStringElement(serialDescriptor, 8);
            list = list2;
            str4 = decodeStringElement;
            z = beginStructure.decodeBooleanElement(serialDescriptor, 9);
            str5 = decodeStringElement6;
            z2 = decodeBooleanElement;
            str2 = decodeStringElement4;
            str = decodeStringElement7;
            str6 = decodeStringElement5;
            str7 = decodeStringElement3;
            i = 1023;
            str3 = decodeStringElement2;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i3 = 0;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.util.List list3 = null;
            boolean z5 = false;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 9;
                    case 0:
                        str14 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 9;
                    case 1:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                    case 2:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                    case 3:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                    case 4:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                    case 5:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), list3);
                        i3 |= 32;
                    case 6:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                    case 7:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                    case 8:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                    case 9:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            z = z4;
            str = str10;
            str2 = str8;
            str3 = str13;
            z2 = z5;
            i = i3;
            str4 = str14;
            str5 = str11;
            str6 = str9;
            str7 = str12;
            list = list3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination(i, str4, str3, str7, str2, str6, list, z2, str5, str, z, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination.write$Self$p2p_api_prodRelease(value, beginStructure, serialDescriptor);
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
