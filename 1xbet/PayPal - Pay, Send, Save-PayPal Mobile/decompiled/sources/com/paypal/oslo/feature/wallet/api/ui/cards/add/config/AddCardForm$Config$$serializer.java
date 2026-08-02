package com.paypal.oslo.feature.wallet.api.ui.cards.add.config;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AddCardForm$Config$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer addCardForm$Config$$serializer = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer();
        INSTANCE = addCardForm$Config$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config", addCardForm$Config$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("headerTitle", true);
        pluginGeneratedSerialDescriptor.addElement("headerDescription", true);
        pluginGeneratedSerialDescriptor.addElement("formSubmitButtonLabel", true);
        pluginGeneratedSerialDescriptor.addElement("showBillingAddress", true);
        pluginGeneratedSerialDescriptor.addElement("showUserName", true);
        pluginGeneratedSerialDescriptor.addElement("showCardScan", true);
        pluginGeneratedSerialDescriptor.addElement("allowEditBillingAddress", true);
        pluginGeneratedSerialDescriptor.addElement("disableBackNavigation", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private AddCardForm$Config$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.String str;
        java.lang.String str2;
        boolean z5;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i = 7;
        int i2 = 6;
        int i3 = 5;
        int i4 = 0;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean decodeBooleanElement4 = beginStructure.decodeBooleanElement(serialDescriptor, 6);
            str2 = str4;
            z = beginStructure.decodeBooleanElement(serialDescriptor, 7);
            z2 = decodeBooleanElement4;
            z3 = decodeBooleanElement3;
            z5 = decodeBooleanElement;
            z4 = decodeBooleanElement2;
            str = str6;
            str3 = str5;
            i4 = 255;
        } else {
            boolean z6 = true;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (z6) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z6 = false;
                        i = 7;
                        i2 = 6;
                        i3 = 5;
                    case 0:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i4 |= 1;
                        i = 7;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        i4 |= 2;
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i = 7;
                        i2 = 6;
                    case 2:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i4 |= 4;
                    case 3:
                        z10 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i4 |= 8;
                    case 4:
                        z11 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        z9 = beginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i4 |= 32;
                    case 6:
                        z8 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i4 |= 64;
                    case 7:
                        z7 = beginStructure.decodeBooleanElement(serialDescriptor, i);
                        i4 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str10 = str8;
            java.lang.String str11 = str9;
            z = z7;
            z2 = z8;
            z3 = z9;
            z4 = z11;
            str = str7;
            str2 = str10;
            z5 = z10;
            str3 = str11;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config(i4, str2, str3, str, z5, z4, z3, z2, z, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config.write$Self$wallet_api_prodRelease(value, beginStructure, serialDescriptor);
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
