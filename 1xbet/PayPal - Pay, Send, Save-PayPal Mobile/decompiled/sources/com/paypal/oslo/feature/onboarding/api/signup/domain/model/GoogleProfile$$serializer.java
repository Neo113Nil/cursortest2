package com.paypal.oslo.feature.onboarding.api.signup.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GoogleProfile$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile> {
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile$$serializer googleProfile$$serializer = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile$$serializer();
        INSTANCE = googleProfile$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile", googleProfile$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("email", false);
        pluginGeneratedSerialDescriptor.addElement("firstName", false);
        pluginGeneratedSerialDescriptor.addElement("lastName", false);
        pluginGeneratedSerialDescriptor.addElement("profileUrl", false);
        pluginGeneratedSerialDescriptor.addElement("googleToken", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GoogleProfile$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email email = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, null);
            java.lang.String m15927unboximpl = email != null ? email.m15927unboximpl() : null;
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName firstName = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName$$serializer.INSTANCE, null);
            java.lang.String m15936unboximpl = firstName != null ? firstName.m15936unboximpl() : null;
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName lastName = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName$$serializer.INSTANCE, null);
            java.lang.String m15975unboximpl = lastName != null ? lastName.m15975unboximpl() : null;
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl profileUrl = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl$$serializer.INSTANCE, null);
            java.lang.String m15993unboximpl = profileUrl != null ? profileUrl.m15993unboximpl() : null;
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken googleToken = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken) beginStructure.decodeSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken$$serializer.INSTANCE, null);
            str = m15927unboximpl;
            str2 = m15993unboximpl;
            i = 31;
            str3 = m15975unboximpl;
            str4 = m15936unboximpl;
            str5 = googleToken != null ? googleToken.m15957unboximpl() : null;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email email2 = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, str6 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(str6) : null);
                    str6 = email2 != null ? email2.m15927unboximpl() : null;
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName firstName2 = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName$$serializer.INSTANCE, str9 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15930boximpl(str9) : null);
                    str9 = firstName2 != null ? firstName2.m15936unboximpl() : null;
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName lastName2 = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName$$serializer.INSTANCE, str8 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15969boximpl(str8) : null);
                    str8 = lastName2 != null ? lastName2.m15975unboximpl() : null;
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl profileUrl2 = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl$$serializer.INSTANCE, str7 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15987boximpl(str7) : null);
                    str7 = profileUrl2 != null ? profileUrl2.m15993unboximpl() : null;
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken googleToken2 = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken) beginStructure.decodeSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken$$serializer.INSTANCE, str10 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15951boximpl(str10) : null);
                    str10 = googleToken2 != null ? googleToken2.m15957unboximpl() : null;
                    i2 |= 16;
                }
            }
            str = str6;
            str2 = str7;
            i = i2;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile(i, str, str4, str3, str2, str5, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile.write$Self$onboarding_api_prodRelease(value, beginStructure, serialDescriptor);
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
