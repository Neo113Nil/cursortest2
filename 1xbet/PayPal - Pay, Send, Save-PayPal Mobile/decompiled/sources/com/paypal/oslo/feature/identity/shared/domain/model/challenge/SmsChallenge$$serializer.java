package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SmsChallenge$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SmsChallenge;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SmsChallenge;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SmsChallenge;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class SmsChallenge$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge$$serializer smsChallenge$$serializer = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge$$serializer();
        INSTANCE = smsChallenge$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge", smsChallenge$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("isEligible", false);
        pluginGeneratedSerialDescriptor.addElement("phoneNumbers", false);
        pluginGeneratedSerialDescriptor.addElement("nonce", false);
        pluginGeneratedSerialDescriptor.addElement("partialToken", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SmsChallenge$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, lazyArr[3].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        java.util.List list;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            list = list2;
            str2 = decodeStringElement;
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str3 = str4;
            z = decodeBooleanElement;
            i = 63;
            challengeType = challengeType2;
        } else {
            boolean z2 = false;
            boolean z3 = true;
            java.lang.String str5 = null;
            java.util.List list3 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType3 = null;
            i = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        continue;
                    case 0:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case 1:
                        challengeType3 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), challengeType3);
                        i |= 2;
                        break;
                    case 2:
                        z2 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list3);
                        i |= 8;
                        break;
                    case 4:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i |= 16;
                        break;
                    case 5:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str5;
            str2 = str6;
            z = z2;
            java.lang.String str8 = str7;
            list = list3;
            challengeType = challengeType3;
            str3 = str8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge(i, str2, challengeType, z, list, str3, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge.write$Self$identity_prodRelease(value, beginStructure, serialDescriptor);
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
