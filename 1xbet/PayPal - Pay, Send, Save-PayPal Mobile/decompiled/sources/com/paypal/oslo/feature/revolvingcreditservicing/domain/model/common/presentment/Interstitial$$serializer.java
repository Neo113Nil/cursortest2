package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/presentment/Interstitial$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/presentment/Interstitial;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/presentment/Interstitial;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/presentment/Interstitial;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Interstitial$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial$$serializer interstitial$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial$$serializer();
        INSTANCE = interstitial$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial", interstitial$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("impressionUrl", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("heading", false);
        pluginGeneratedSerialDescriptor.addElement("subHeading", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("closeButton", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimerLink", false);
        pluginGeneratedSerialDescriptor.addElement("callToActions", false);
        pluginGeneratedSerialDescriptor.addElement("animation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interstitial$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.HeroImage$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[8].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialAnimation$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.HeroImage heroImage;
        java.util.List list;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction interstitialCallToAction;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialAnimation interstitialAnimation;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction interstitialCallToAction2;
        java.lang.String str2;
        java.lang.String str3;
        int i;
        java.lang.String str4;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction interstitialCallToAction3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.HeroImage heroImage2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.HeroImage) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.HeroImage$$serializer.INSTANCE, null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction interstitialCallToAction4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction interstitialCallToAction5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction$$serializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            interstitialAnimation = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialAnimation) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialAnimation$$serializer.INSTANCE, null);
            interstitialCallToAction = interstitialCallToAction5;
            interstitialCallToAction2 = interstitialCallToAction4;
            str4 = str8;
            str = str6;
            str2 = str7;
            i = 1023;
            heroImage = heroImage2;
            str3 = decodeStringElement;
        } else {
            int i5 = 0;
            boolean z = true;
            java.util.List list2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction interstitialCallToAction6 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialAnimation interstitialAnimation2 = null;
            java.lang.String str9 = null;
            heroImage = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                    case 0:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                    case 1:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i5 |= 2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                    case 2:
                        heroImage = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.HeroImage) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.HeroImage$$serializer.INSTANCE, heroImage);
                        i5 |= 4;
                        i2 = 9;
                        i3 = 7;
                    case 3:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i5 |= 8;
                        i2 = 9;
                        i3 = 7;
                    case 4:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i5 |= 16;
                        i2 = 9;
                        i3 = 7;
                    case 5:
                        i5 |= 32;
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i2 = 9;
                        i3 = 7;
                    case 6:
                        interstitialCallToAction3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction) beginStructure.decodeSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction$$serializer.INSTANCE, interstitialCallToAction3);
                        i5 |= 64;
                    case 7:
                        interstitialCallToAction6 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialCallToAction$$serializer.INSTANCE, interstitialCallToAction6);
                        i5 |= 128;
                    case 8:
                        list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), list2);
                        i5 |= 256;
                    case 9:
                        interstitialAnimation2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialAnimation) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.InterstitialAnimation$$serializer.INSTANCE, interstitialAnimation2);
                        i5 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            list = list2;
            interstitialCallToAction = interstitialCallToAction6;
            interstitialAnimation = interstitialAnimation2;
            str = str9;
            interstitialCallToAction2 = interstitialCallToAction3;
            str2 = str10;
            str3 = str13;
            i = i5;
            str4 = str11;
            str5 = str12;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial(i, str3, str5, heroImage, str, str2, str4, interstitialCallToAction2, interstitialCallToAction, list, interstitialAnimation, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.Interstitial.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
