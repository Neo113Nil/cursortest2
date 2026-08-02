package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class InstitutionImage$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage$$serializer institutionImage$$serializer = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage$$serializer();
        INSTANCE = institutionImage$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage", institutionImage$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("url", false);
        pluginGeneratedSerialDescriptor.addElement(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, false);
        pluginGeneratedSerialDescriptor.addElement("width", false);
        pluginGeneratedSerialDescriptor.addElement("height", false);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstitutionImage$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.Integer num;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory;
        java.lang.Integer num2;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage.$childSerializers;
        java.lang.Integer num3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Integer num4 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            java.lang.Integer num5 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            institutionImageCategory = (com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            str2 = decodeStringElement;
            num2 = num5;
            num = num4;
            str = str3;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory2 = null;
            java.lang.Integer num6 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str5 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    num3 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, num3);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    num6 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, num6);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    institutionImageCategory2 = (com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), institutionImageCategory2);
                    i2 |= 16;
                }
            }
            i = i2;
            num = num3;
            institutionImageCategory = institutionImageCategory2;
            num2 = num6;
            str = str4;
            str2 = str5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage(i, str2, str, num, num2, institutionImageCategory, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage.write$Self$wallet_prodRelease(value, beginStructure, serialDescriptor);
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
