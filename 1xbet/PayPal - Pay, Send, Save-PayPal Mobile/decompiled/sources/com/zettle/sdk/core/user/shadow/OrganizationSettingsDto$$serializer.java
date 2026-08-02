package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/OrganizationSettingsDto$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/zettle/sdk/core/user/shadow/OrganizationSettingsDto;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/zettle/sdk/core/user/shadow/OrganizationSettingsDto;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/zettle/sdk/core/user/shadow/OrganizationSettingsDto;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class OrganizationSettingsDto$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.zettle.sdk.core.user.shadow.OrganizationSettingsDto> {
    public static final com.zettle.sdk.core.user.shadow.OrganizationSettingsDto$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor descriptor;

    static {
        com.zettle.sdk.core.user.shadow.OrganizationSettingsDto$$serializer organizationSettingsDto$$serializer = new com.zettle.sdk.core.user.shadow.OrganizationSettingsDto$$serializer();
        INSTANCE = organizationSettingsDto$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.zettle.sdk.core.user.shadow.OrganizationSettingsDto", organizationSettingsDto$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("loyalty", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, true);
        pluginGeneratedSerialDescriptor.addElement("paymentLink", true);
        pluginGeneratedSerialDescriptor.addElement("cashRegister", true);
        pluginGeneratedSerialDescriptor.addElement("cashRegisterTss", true);
        pluginGeneratedSerialDescriptor.addElement("klarnaInStore", true);
        pluginGeneratedSerialDescriptor.addElement("paypalKeyIn", true);
        pluginGeneratedSerialDescriptor.addElement("giftcard", true);
        pluginGeneratedSerialDescriptor.addElement("paypalQRC", true);
        pluginGeneratedSerialDescriptor.addElement("venmoQRC", true);
        pluginGeneratedSerialDescriptor.addElement("receipt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrganizationSettingsDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.CustomersSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.InvoiceSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.PaymentLinkSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.CashRegisterTssDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.KlarnaInStoreSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.KeyInSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.GiftCardSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.PayPalQrcSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.VenmoQrcSettingsDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.shadow.ReceiptSettingsDto$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.zettle.sdk.core.user.shadow.OrganizationSettingsDto deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        int i;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i2 = 10;
        int i3 = 9;
        java.lang.Object obj12 = null;
        if (beginStructure.decodeSequentially()) {
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, com.zettle.sdk.core.user.shadow.CustomersSettingsDto$$serializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, com.zettle.sdk.core.user.shadow.InvoiceSettingsDto$$serializer.INSTANCE, null);
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, com.zettle.sdk.core.user.shadow.PaymentLinkSettingsDto$$serializer.INSTANCE, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto$$serializer.INSTANCE, null);
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, com.zettle.sdk.core.user.shadow.CashRegisterTssDto$$serializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, com.zettle.sdk.core.user.shadow.KlarnaInStoreSettingsDto$$serializer.INSTANCE, null);
            obj11 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, com.zettle.sdk.core.user.shadow.KeyInSettingsDto$$serializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, com.zettle.sdk.core.user.shadow.GiftCardSettingsDto$$serializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, com.zettle.sdk.core.user.shadow.PayPalQrcSettingsDto$$serializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, com.zettle.sdk.core.user.shadow.VenmoQrcSettingsDto$$serializer.INSTANCE, null);
            obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, com.zettle.sdk.core.user.shadow.ReceiptSettingsDto$$serializer.INSTANCE, null);
            i = 2047;
        } else {
            int i4 = 0;
            boolean z = true;
            java.lang.Object obj13 = null;
            java.lang.Object obj14 = null;
            java.lang.Object obj15 = null;
            java.lang.Object obj16 = null;
            java.lang.Object obj17 = null;
            java.lang.Object obj18 = null;
            obj = null;
            java.lang.Object obj19 = null;
            java.lang.Object obj20 = null;
            java.lang.Object obj21 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i3 = 9;
                    case 0:
                        obj21 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, com.zettle.sdk.core.user.shadow.CustomersSettingsDto$$serializer.INSTANCE, obj21);
                        i4 |= 1;
                        i2 = 10;
                        i3 = 9;
                    case 1:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, com.zettle.sdk.core.user.shadow.InvoiceSettingsDto$$serializer.INSTANCE, obj);
                        i4 |= 2;
                        i2 = 10;
                    case 2:
                        obj20 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, com.zettle.sdk.core.user.shadow.PaymentLinkSettingsDto$$serializer.INSTANCE, obj20);
                        i4 |= 4;
                        i2 = 10;
                    case 3:
                        obj18 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto$$serializer.INSTANCE, obj18);
                        i4 |= 8;
                        i2 = 10;
                    case 4:
                        obj19 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, com.zettle.sdk.core.user.shadow.CashRegisterTssDto$$serializer.INSTANCE, obj19);
                        i4 |= 16;
                        i2 = 10;
                    case 5:
                        obj17 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, com.zettle.sdk.core.user.shadow.KlarnaInStoreSettingsDto$$serializer.INSTANCE, obj17);
                        i4 |= 32;
                        i2 = 10;
                    case 6:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, com.zettle.sdk.core.user.shadow.KeyInSettingsDto$$serializer.INSTANCE, obj12);
                        i4 |= 64;
                        i2 = 10;
                    case 7:
                        obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, com.zettle.sdk.core.user.shadow.GiftCardSettingsDto$$serializer.INSTANCE, obj15);
                        i4 |= 128;
                        i2 = 10;
                    case 8:
                        obj16 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, com.zettle.sdk.core.user.shadow.PayPalQrcSettingsDto$$serializer.INSTANCE, obj16);
                        i4 |= 256;
                        i2 = 10;
                    case 9:
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, i3, com.zettle.sdk.core.user.shadow.VenmoQrcSettingsDto$$serializer.INSTANCE, obj13);
                        i4 |= 512;
                    case 10:
                        obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, i2, com.zettle.sdk.core.user.shadow.ReceiptSettingsDto$$serializer.INSTANCE, obj14);
                        i4 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj2 = obj13;
            obj3 = obj15;
            obj4 = obj16;
            obj5 = obj17;
            obj6 = obj18;
            obj7 = obj19;
            obj8 = obj20;
            java.lang.Object obj22 = obj12;
            i = i4;
            obj9 = obj21;
            obj10 = obj14;
            obj11 = obj22;
        }
        beginStructure.endStructure(descriptor2);
        return new com.zettle.sdk.core.user.shadow.OrganizationSettingsDto(i, (com.zettle.sdk.core.user.shadow.CustomersSettingsDto) obj9, (com.zettle.sdk.core.user.shadow.InvoiceSettingsDto) obj, (com.zettle.sdk.core.user.shadow.PaymentLinkSettingsDto) obj8, (com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto) obj6, (com.zettle.sdk.core.user.shadow.CashRegisterTssDto) obj7, (com.zettle.sdk.core.user.shadow.KlarnaInStoreSettingsDto) obj5, (com.zettle.sdk.core.user.shadow.KeyInSettingsDto) obj11, (com.zettle.sdk.core.user.shadow.GiftCardSettingsDto) obj3, (com.zettle.sdk.core.user.shadow.PayPalQrcSettingsDto) obj4, (com.zettle.sdk.core.user.shadow.VenmoQrcSettingsDto) obj2, (com.zettle.sdk.core.user.shadow.ReceiptSettingsDto) obj10, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.zettle.sdk.core.user.shadow.OrganizationSettingsDto value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.zettle.sdk.core.user.shadow.OrganizationSettingsDto.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
