package com.paypal.oslo.feature.onboarding.api.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/EmailOtpVerificationModalDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/EmailOtpVerificationModalDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/onboarding/api/navigation/EmailOtpVerificationModalDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/onboarding/api/navigation/EmailOtpVerificationModalDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class EmailOtpVerificationModalDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination> {
    public static final com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination$$serializer emailOtpVerificationModalDestination$$serializer = new com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination$$serializer();
        INSTANCE = emailOtpVerificationModalDestination$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination", emailOtpVerificationModalDestination$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("email", false);
        pluginGeneratedSerialDescriptor.addElement("userIntent", false);
        pluginGeneratedSerialDescriptor.addElement("businessFlow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmailOtpVerificationModalDestination$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.analytics.UserIntent$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow businessFlow;
        com.paypal.oslo.feature.onboarding.api.analytics.UserIntent userIntent;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email email = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, null);
            java.lang.String m15927unboximpl = email != null ? email.m15927unboximpl() : null;
            com.paypal.oslo.feature.onboarding.api.analytics.UserIntent userIntent2 = (com.paypal.oslo.feature.onboarding.api.analytics.UserIntent) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.onboarding.api.analytics.UserIntent$$serializer.INSTANCE, null);
            str = m15927unboximpl;
            businessFlow = (com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow$$serializer.INSTANCE, null);
            userIntent = userIntent2;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow businessFlow2 = null;
            com.paypal.oslo.feature.onboarding.api.analytics.UserIntent userIntent3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email email2 = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, str2 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(str2) : null);
                    str2 = email2 != null ? email2.m15927unboximpl() : null;
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    userIntent3 = (com.paypal.oslo.feature.onboarding.api.analytics.UserIntent) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.onboarding.api.analytics.UserIntent$$serializer.INSTANCE, userIntent3);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    businessFlow2 = (com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow$$serializer.INSTANCE, businessFlow2);
                    i2 |= 4;
                }
            }
            str = str2;
            businessFlow = businessFlow2;
            userIntent = userIntent3;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination(i, str, userIntent, businessFlow, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination.write$Self$onboarding_api_prodRelease(value, beginStructure, serialDescriptor);
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
