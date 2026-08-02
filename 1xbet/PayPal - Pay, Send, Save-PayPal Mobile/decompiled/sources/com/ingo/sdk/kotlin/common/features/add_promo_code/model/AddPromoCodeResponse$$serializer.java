package com.ingo.sdk.kotlin.common.features.add_promo_code.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/add_promo_code/model/AddPromoCodeResponse$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/features/add_promo_code/model/AddPromoCodeResponse;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/features/add_promo_code/model/AddPromoCodeResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/features/add_promo_code/model/AddPromoCodeResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class AddPromoCodeResponse$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse> {
    public static final com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse$$serializer addPromoCodeResponse$$serializer = new com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse$$serializer();
        INSTANCE = addPromoCodeResponse$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse", addPromoCodeResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("transactionReferenceNumber", false);
        pluginGeneratedSerialDescriptor.addElement("inMinutesPromoCodeInfo", false);
        pluginGeneratedSerialDescriptor.addElement("inDaysPromoCodeInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming promoCodeInfoForTiming;
        java.lang.String str;
        com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming promoCodeInfoForTiming2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming promoCodeInfoForTiming3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming promoCodeInfoForTiming4 = (com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming$$serializer.INSTANCE, null);
            str = decodeStringElement;
            promoCodeInfoForTiming2 = (com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming$$serializer.INSTANCE, null);
            promoCodeInfoForTiming = promoCodeInfoForTiming4;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str2 = null;
            com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming promoCodeInfoForTiming5 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    promoCodeInfoForTiming3 = (com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming$$serializer.INSTANCE, promoCodeInfoForTiming3);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    promoCodeInfoForTiming5 = (com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.ingo.sdk.kotlin.common.features.add_promo_code.model.PromoCodeInfoForTiming$$serializer.INSTANCE, promoCodeInfoForTiming5);
                    i2 |= 4;
                }
            }
            i = i2;
            promoCodeInfoForTiming = promoCodeInfoForTiming3;
            str = str2;
            promoCodeInfoForTiming2 = promoCodeInfoForTiming5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse(i, str, promoCodeInfoForTiming, promoCodeInfoForTiming2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse.write$Self$sharedSdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private AddPromoCodeResponse$$serializer() {
    }
}
