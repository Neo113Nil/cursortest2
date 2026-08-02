package com.paypal.oslo.feature.p2p.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/navigation/SuccessDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/p2p/navigation/SuccessDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/p2p/navigation/SuccessDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/p2p/navigation/SuccessDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class SuccessDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.p2p.navigation.SuccessDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.p2p.navigation.SuccessDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.p2p.navigation.SuccessDestination$$serializer successDestination$$serializer = new com.paypal.oslo.feature.p2p.navigation.SuccessDestination$$serializer();
        INSTANCE = successDestination$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.p2p.navigation.SuccessDestination", successDestination$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, false);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement("currencyCode", false);
        pluginGeneratedSerialDescriptor.addElement("receiver", true);
        pluginGeneratedSerialDescriptor.addElement("payer", true);
        pluginGeneratedSerialDescriptor.addElement("mediaState", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, true);
        pluginGeneratedSerialDescriptor.addElement("paymentLink", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuccessDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.p2p.navigation.SuccessDestination.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.p2p.ui.success.state.UiContact$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.p2p.ui.success.state.UiContact$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.p2p.ui.success.state.MediaState$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.p2p.navigation.SuccessDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink uiPaymentLink;
        java.lang.String str;
        com.paypal.oslo.feature.p2p.ui.success.state.MediaState mediaState;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType;
        com.paypal.oslo.feature.p2p.ui.success.state.UiContact uiContact;
        com.paypal.oslo.feature.p2p.ui.success.state.UiContact uiContact2;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.p2p.navigation.SuccessDestination.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        com.paypal.oslo.feature.p2p.ui.success.state.UiContact uiContact3 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType2 = (com.paypal.oslo.feature.p2p.ui.success.state.FlowType) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            com.paypal.oslo.feature.p2p.ui.success.state.UiContact uiContact4 = (com.paypal.oslo.feature.p2p.ui.success.state.UiContact) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.p2p.ui.success.state.UiContact$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.p2p.ui.success.state.UiContact uiContact5 = (com.paypal.oslo.feature.p2p.ui.success.state.UiContact) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.p2p.ui.success.state.UiContact$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.p2p.ui.success.state.MediaState mediaState2 = (com.paypal.oslo.feature.p2p.ui.success.state.MediaState) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.p2p.ui.success.state.MediaState$$serializer.INSTANCE, null);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            flowType = flowType2;
            str3 = decodeStringElement;
            uiPaymentLink = (com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink$$serializer.INSTANCE, null);
            str = str4;
            mediaState = mediaState2;
            uiContact2 = uiContact4;
            uiContact = uiContact5;
            str2 = decodeStringElement2;
            i = 255;
        } else {
            boolean z = true;
            int i5 = 0;
            com.paypal.oslo.feature.p2p.ui.success.state.UiContact uiContact6 = null;
            com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink uiPaymentLink2 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.feature.p2p.ui.success.state.MediaState mediaState3 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i4 = 5;
                    case 0:
                        flowType3 = (com.paypal.oslo.feature.p2p.ui.success.state.FlowType) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), flowType3);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 1:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                    case 2:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                    case 3:
                        uiContact3 = (com.paypal.oslo.feature.p2p.ui.success.state.UiContact) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.p2p.ui.success.state.UiContact$$serializer.INSTANCE, uiContact3);
                        i5 |= 8;
                    case 4:
                        uiContact6 = (com.paypal.oslo.feature.p2p.ui.success.state.UiContact) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.p2p.ui.success.state.UiContact$$serializer.INSTANCE, uiContact6);
                        i5 |= 16;
                    case 5:
                        mediaState3 = (com.paypal.oslo.feature.p2p.ui.success.state.MediaState) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.p2p.ui.success.state.MediaState$$serializer.INSTANCE, mediaState3);
                        i5 |= 32;
                    case 6:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i5 |= 64;
                    case 7:
                        uiPaymentLink2 = (com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink$$serializer.INSTANCE, uiPaymentLink2);
                        i5 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType4 = flowType3;
            uiPaymentLink = uiPaymentLink2;
            str = str5;
            mediaState = mediaState3;
            str2 = str6;
            str3 = str7;
            flowType = flowType4;
            uiContact = uiContact6;
            uiContact2 = uiContact3;
            i = i5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.p2p.navigation.SuccessDestination(i, flowType, str3, str2, uiContact2, uiContact, mediaState, str, uiPaymentLink, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.p2p.navigation.SuccessDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.p2p.navigation.SuccessDestination.write$Self$p2p_prodRelease(value, beginStructure, serialDescriptor);
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
