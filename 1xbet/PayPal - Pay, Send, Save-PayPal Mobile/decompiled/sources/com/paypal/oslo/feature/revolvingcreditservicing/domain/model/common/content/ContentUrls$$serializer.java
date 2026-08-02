package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrls$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrls;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrls;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrls;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ContentUrls$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls$$serializer contentUrls$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls$$serializer();
        INSTANCE = contentUrls$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls", contentUrls$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("autopayTerms", false);
        pluginGeneratedSerialDescriptor.addElement("oneTimePaymentTerms", false);
        pluginGeneratedSerialDescriptor.addElement("paymentSecurityEntrypoint", false);
        pluginGeneratedSerialDescriptor.addElement("avoidInterestOnNextStatementGuide", false);
        pluginGeneratedSerialDescriptor.addElement("noInterestPromotionCurrentAccruedInterestExplanation", false);
        pluginGeneratedSerialDescriptor.addElement("eSignConsent", false);
        pluginGeneratedSerialDescriptor.addElement("privacyStatement", false);
        pluginGeneratedSerialDescriptor.addElement("persistentDebt", false);
        pluginGeneratedSerialDescriptor.addElement("cardHolderTerms", false);
        pluginGeneratedSerialDescriptor.addElement("benefitsUrl", false);
        pluginGeneratedSerialDescriptor.addElement("creditDisclosuresUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContentUrls$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl8;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl9;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl10;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl12 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl13 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl14 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl15 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl16 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl17 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl18 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl19 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl20 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl21 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl22 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            contentUrl4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, null);
            contentUrl3 = contentUrl22;
            contentUrl2 = contentUrl20;
            contentUrl5 = contentUrl19;
            contentUrl9 = contentUrl18;
            contentUrl = contentUrl21;
            contentUrl6 = contentUrl17;
            i = 2047;
            contentUrl8 = contentUrl13;
            contentUrl10 = contentUrl16;
            contentUrl11 = contentUrl15;
            contentUrl7 = contentUrl14;
        } else {
            int i7 = 0;
            boolean z = true;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl23 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl24 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl25 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl26 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl27 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl28 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl29 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl30 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl31 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl32 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 0:
                        contentUrl32 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl32);
                        i7 |= 1;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 1:
                        i7 |= 2;
                        contentUrl29 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl29);
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 2:
                        contentUrl31 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl31);
                        i7 |= 4;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 3:
                        contentUrl26 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl26);
                        i7 |= 8;
                        i2 = 10;
                        i3 = 9;
                    case 4:
                        i7 |= 16;
                        contentUrl30 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl30);
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        contentUrl23 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl23);
                        i7 |= 32;
                        i2 = 10;
                    case 6:
                        contentUrl28 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl28);
                        i7 |= 64;
                    case 7:
                        contentUrl25 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl25);
                        i7 |= 128;
                    case 8:
                        contentUrl24 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, i6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl24);
                        i7 |= 256;
                    case 9:
                        contentUrl27 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl27);
                        i7 |= 512;
                    case 10:
                        contentUrl12 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, contentUrl12);
                        i7 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl33 = contentUrl29;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl34 = contentUrl30;
            i = i7;
            contentUrl = contentUrl24;
            contentUrl2 = contentUrl25;
            contentUrl3 = contentUrl27;
            contentUrl4 = contentUrl12;
            contentUrl5 = contentUrl28;
            contentUrl6 = contentUrl34;
            contentUrl7 = contentUrl33;
            contentUrl8 = contentUrl32;
            contentUrl9 = contentUrl23;
            contentUrl10 = contentUrl26;
            contentUrl11 = contentUrl31;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls(i, contentUrl8, contentUrl7, contentUrl11, contentUrl10, contentUrl6, contentUrl9, contentUrl5, contentUrl2, contentUrl, contentUrl3, contentUrl4, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
