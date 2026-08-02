package com.paypal.oslo.feature.balance.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/AutoReloadAmountDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/balance/navigation/AutoReloadAmountDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/balance/navigation/AutoReloadAmountDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/balance/navigation/AutoReloadAmountDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AutoReloadAmountDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination$$serializer autoReloadAmountDestination$$serializer = new com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination$$serializer();
        INSTANCE = autoReloadAmountDestination$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination", autoReloadAmountDestination$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("intent", false);
        pluginGeneratedSerialDescriptor.addElement("currencyCode", false);
        pluginGeneratedSerialDescriptor.addElement("minimumAmount", false);
        pluginGeneratedSerialDescriptor.addElement("maximumAmount", false);
        pluginGeneratedSerialDescriptor.addElement("options", false);
        pluginGeneratedSerialDescriptor.addElement("formattedMinimum", true);
        pluginGeneratedSerialDescriptor.addElement("formattedMaximum", true);
        pluginGeneratedSerialDescriptor.addElement("formattedOptions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AutoReloadAmountDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[4].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[7].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent;
        java.util.List list;
        int i;
        java.util.List list2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        java.lang.String str6 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent2 = (com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.util.List list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 6);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            str2 = decodeStringElement5;
            str4 = decodeStringElement4;
            str5 = decodeStringElement3;
            str3 = decodeStringElement2;
            str = decodeStringElement;
            list2 = list3;
            autoReloadAmountIntent = autoReloadAmountIntent2;
            i = 255;
        } else {
            boolean z = true;
            int i5 = 0;
            java.util.List list4 = null;
            java.util.List list5 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i4 = 3;
                    case 0:
                        autoReloadAmountIntent3 = (com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), autoReloadAmountIntent3);
                        i5 |= 1;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                    case 1:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i2 = 6;
                    case 2:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                    case 3:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 8;
                    case 4:
                        list5 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list5);
                        i5 |= 16;
                    case 5:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 32;
                    case 6:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, i2);
                        i5 |= 64;
                    case 7:
                        list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), list4);
                        i5 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            autoReloadAmountIntent = autoReloadAmountIntent3;
            list = list4;
            i = i5;
            java.lang.String str11 = str8;
            list2 = list5;
            str = str10;
            str2 = str6;
            str3 = str9;
            str4 = str7;
            str5 = str11;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination(i, autoReloadAmountIntent, str, str3, str5, list2, str4, str2, list, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination.write$Self$balance_prodRelease(value, beginStructure, serialDescriptor);
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
