package com.paypal.oslo.feature.wallet.api.ui.cards.edit.config;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/edit/config/UpdateCardConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/edit/config/UpdateCardConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/edit/config/UpdateCardConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/api/ui/cards/edit/config/UpdateCardConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class UpdateCardConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig$$serializer updateCardConfig$$serializer = new com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig$$serializer();
        INSTANCE = updateCardConfig$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig", updateCardConfig$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("cardId", false);
        pluginGeneratedSerialDescriptor.addElement("cardArtUrl", false);
        pluginGeneratedSerialDescriptor.addElement("expiryMonth", false);
        pluginGeneratedSerialDescriptor.addElement("expiryYear", false);
        pluginGeneratedSerialDescriptor.addElement("issuer", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("lastNChars", false);
        pluginGeneratedSerialDescriptor.addElement("addressId", true);
        pluginGeneratedSerialDescriptor.addElement("addressLine1", false);
        pluginGeneratedSerialDescriptor.addElement("addressLine2", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, false);
        pluginGeneratedSerialDescriptor.addElement("countryCode", false);
        pluginGeneratedSerialDescriptor.addElement("cardBrand", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private UpdateCardConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        int i;
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
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        java.lang.String str16 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 6);
            java.lang.String str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement6 = beginStructure.decodeStringElement(serialDescriptor, 8);
            java.lang.String str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement7 = beginStructure.decodeStringElement(serialDescriptor, 10);
            java.lang.String decodeStringElement8 = beginStructure.decodeStringElement(serialDescriptor, 11);
            java.lang.String decodeStringElement9 = beginStructure.decodeStringElement(serialDescriptor, 12);
            java.lang.String decodeStringElement10 = beginStructure.decodeStringElement(serialDescriptor, 13);
            str11 = decodeStringElement2;
            str3 = beginStructure.decodeStringElement(serialDescriptor, 14);
            str = str20;
            str8 = decodeStringElement8;
            str13 = decodeStringElement7;
            str4 = decodeStringElement9;
            str2 = str19;
            str14 = decodeStringElement5;
            str7 = decodeStringElement4;
            str12 = str18;
            str10 = decodeStringElement6;
            str5 = decodeStringElement3;
            str9 = decodeStringElement10;
            str15 = str17;
            i = 32767;
            str6 = decodeStringElement;
        } else {
            int i4 = 14;
            int i5 = 0;
            boolean z = true;
            java.lang.String str21 = null;
            java.lang.String str22 = null;
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
            java.lang.String str34 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 14;
                        i2 = 11;
                    case 0:
                        str33 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 1:
                        str32 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 2:
                        i5 |= 4;
                        str31 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str31);
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 3:
                        str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str23);
                        i5 |= 8;
                        i4 = 14;
                        i2 = 11;
                    case 4:
                        str30 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 14;
                    case 5:
                        str34 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 14;
                    case 6:
                        str25 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 14;
                    case 7:
                        str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str22);
                        i5 |= 128;
                        i4 = 14;
                    case 8:
                        str26 = beginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        i4 = 14;
                    case 9:
                        str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, str21);
                        i5 |= 512;
                        i4 = 14;
                    case 10:
                        str29 = beginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 1024;
                        i4 = 14;
                    case 11:
                        str16 = beginStructure.decodeStringElement(serialDescriptor, i2);
                        i5 |= 2048;
                        i4 = 14;
                    case 12:
                        str28 = beginStructure.decodeStringElement(serialDescriptor, 12);
                        i5 |= 4096;
                        i4 = 14;
                    case 13:
                        str24 = beginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 |= 8192;
                    case 14:
                        str27 = beginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 16384;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str35 = str31;
            str = str21;
            str2 = str22;
            i = i5;
            str3 = str27;
            str4 = str28;
            str5 = str30;
            str6 = str33;
            str7 = str34;
            str8 = str16;
            str9 = str24;
            str10 = str26;
            str11 = str32;
            str12 = str23;
            str13 = str29;
            str14 = str25;
            str15 = str35;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig(i, str6, str11, str15, str12, str5, str7, str14, str2, str10, str, str13, str8, str4, str9, str3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig.write$Self$wallet_api_prodRelease(value, beginStructure, serialDescriptor);
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
