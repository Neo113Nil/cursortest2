package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class SilentAuthChallenge$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge$$serializer silentAuthChallenge$$serializer = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge$$serializer();
        INSTANCE = silentAuthChallenge$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge", silentAuthChallenge$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("isEligible", false);
        pluginGeneratedSerialDescriptor.addElement("evUrl", false);
        pluginGeneratedSerialDescriptor.addElement("phoneNumbers", false);
        pluginGeneratedSerialDescriptor.addElement("nonce", false);
        pluginGeneratedSerialDescriptor.addElement("partialToken", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SilentAuthChallenge$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[4].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        java.util.List list;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        boolean z;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            list = list2;
            str = decodeStringElement;
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str2 = str5;
            str4 = decodeStringElement2;
            z = decodeBooleanElement;
            i = 127;
            challengeType = challengeType2;
        } else {
            boolean z2 = false;
            boolean z3 = true;
            java.lang.String str6 = null;
            str = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType3 = null;
            java.util.List list3 = null;
            int i4 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 6;
                        i3 = 5;
                    case 0:
                        str = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        challengeType3 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), challengeType3);
                        i4 |= 2;
                        i2 = 6;
                        i3 = 5;
                    case 2:
                        z2 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i4 |= 4;
                    case 3:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                    case 4:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list3);
                        i4 |= 16;
                    case 5:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i4 |= 32;
                    case 6:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i4 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType4 = challengeType3;
            list = list3;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            z = z2;
            challengeType = challengeType4;
            i = i4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge(i, str, challengeType, z, str4, list, str2, str3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge.write$Self$identity_prodRelease(value, beginStructure, serialDescriptor);
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
