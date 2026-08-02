package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class WebViewChallenge$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge$$serializer webViewChallenge$$serializer = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge$$serializer();
        INSTANCE = webViewChallenge$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge", webViewChallenge$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("isEligible", false);
        pluginGeneratedSerialDescriptor.addElement("webChallengeUrl", false);
        pluginGeneratedSerialDescriptor.addElement("returnUri", false);
        pluginGeneratedSerialDescriptor.addElement("returnUriParam", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID, false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("flowContext", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WebViewChallenge$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType;
        java.lang.String str5;
        boolean z;
        int i;
        java.lang.String str6;
        java.lang.String str7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge.$childSerializers;
        int i2 = 7;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 6);
            challengeType = challengeType2;
            str4 = decodeStringElement;
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str3 = decodeStringElement5;
            str5 = decodeStringElement4;
            str7 = decodeStringElement2;
            str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str6 = decodeStringElement3;
            z = decodeBooleanElement;
            i = 511;
        } else {
            boolean z2 = false;
            boolean z3 = true;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType3 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            int i3 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 7;
                    case 0:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        challengeType3 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), challengeType3);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        z2 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i3 |= 4;
                    case 3:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                    case 4:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                    case 5:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                    case 6:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                    case 7:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i3 |= 128;
                    case 8:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i3 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str14;
            str2 = str8;
            str3 = str9;
            str4 = str13;
            challengeType = challengeType3;
            str5 = str10;
            z = z2;
            i = i3;
            java.lang.String str15 = str12;
            str6 = str11;
            str7 = str15;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge(i, str4, challengeType, z, str7, str6, str5, str3, str, str2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge.write$Self$identity_prodRelease(value, beginStructure, serialDescriptor);
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
