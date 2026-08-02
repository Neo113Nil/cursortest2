package com.paypal.oslo.feature.oneonboarding.api.domain;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class IntentId$AccountCreationSignupWithGoogle$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle> {
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreationSignupWithGoogle$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreationSignupWithGoogle$$serializer intentId$AccountCreationSignupWithGoogle$$serializer = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreationSignupWithGoogle$$serializer();
        INSTANCE = intentId$AccountCreationSignupWithGoogle$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle", intentId$AccountCreationSignupWithGoogle$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, false);
        pluginGeneratedSerialDescriptor.addElement(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, false);
        pluginGeneratedSerialDescriptor.addElement("googleToken", false);
        pluginGeneratedSerialDescriptor.addElement("entryPoint", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntentId$AccountCreationSignupWithGoogle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken$$serializer.INSTANCE, lazyArr[3].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.core.i18n.domain.model.CountryCode countryCode = (com.paypal.oslo.core.i18n.domain.model.CountryCode) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, null);
            java.lang.String m11369unboximpl = countryCode != null ? countryCode.m11369unboximpl() : null;
            com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken googleToken = (com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken$$serializer.INSTANCE, null);
            java.lang.String m16641unboximpl = googleToken != null ? googleToken.m16641unboximpl() : null;
            accountCreationEntryPoint = (com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            str = decodeStringElement;
            str2 = m16641unboximpl;
            str3 = m11369unboximpl;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint2 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str4 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    com.paypal.oslo.core.i18n.domain.model.CountryCode countryCode2 = (com.paypal.oslo.core.i18n.domain.model.CountryCode) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, str6 != null ? com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str6) : null);
                    str6 = countryCode2 != null ? countryCode2.m11369unboximpl() : null;
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken googleToken2 = (com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken$$serializer.INSTANCE, str5 != null ? com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken.m16635boximpl(str5) : null);
                    str5 = googleToken2 != null ? googleToken2.m16641unboximpl() : null;
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    accountCreationEntryPoint2 = (com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), accountCreationEntryPoint2);
                    i2 |= 8;
                }
            }
            accountCreationEntryPoint = accountCreationEntryPoint2;
            str = str4;
            str2 = str5;
            str3 = str6;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle(i, str, str3, str2, accountCreationEntryPoint, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle.write$Self$one_onboarding_api_prodRelease(value, beginStructure, serialDescriptor);
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
