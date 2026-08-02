package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ProvisionedWalletToken$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken$$serializer provisionedWalletToken$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken$$serializer();
        INSTANCE = provisionedWalletToken$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken", provisionedWalletToken$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("referenceId", false);
        pluginGeneratedSerialDescriptor.addElement("fundingPrimaryAccountNumberReferenceId", false);
        pluginGeneratedSerialDescriptor.addElement("fundingPrimaryAccountNumberLastDigits", false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("isCompanionToken", false);
        pluginGeneratedSerialDescriptor.addElement("isDefaultToken", false);
        pluginGeneratedSerialDescriptor.addElement("issuerName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProvisionedWalletToken$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[3].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        int i;
        java.lang.String str2;
        java.lang.Boolean bool;
        java.lang.String str3;
        java.lang.String str4;
        boolean z;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken.$childSerializers;
        int i2 = 6;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            java.lang.Boolean bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            externalWalletTokenState = externalWalletTokenState2;
            str4 = decodeStringElement;
            str2 = beginStructure.decodeStringElement(serialDescriptor, 6);
            bool = bool2;
            z = decodeBooleanElement;
            str = str6;
            i = 127;
            str3 = str5;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            java.lang.String str7 = null;
            java.lang.Boolean bool3 = null;
            str = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState3 = null;
            i = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                    case 0:
                        z2 = true;
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i2 = 6;
                    case 1:
                        z2 = true;
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i |= 2;
                        i2 = 6;
                    case 2:
                        str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str);
                        i |= 4;
                    case 3:
                        externalWalletTokenState3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), externalWalletTokenState3);
                        i |= 8;
                    case 4:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i |= 16;
                    case 5:
                        bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool3);
                        i |= 32;
                    case 6:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, i2);
                        i |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str7;
            bool = bool3;
            str3 = str8;
            str4 = str9;
            z = z4;
            externalWalletTokenState = externalWalletTokenState3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken(i, str4, str3, str, externalWalletTokenState, z, bool, str2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
