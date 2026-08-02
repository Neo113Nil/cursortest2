package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class BankAccountDetails$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$serializer bankAccountDetails$$serializer = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$serializer();
        INSTANCE = bankAccountDetails$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails", bankAccountDetails$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("lastNChars", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("availableActions", false);
        pluginGeneratedSerialDescriptor.addElement("currencyCode", false);
        pluginGeneratedSerialDescriptor.addElement("confirmation", false);
        pluginGeneratedSerialDescriptor.addElement("isSepaCompliant", false);
        pluginGeneratedSerialDescriptor.addElement("issuer", false);
        pluginGeneratedSerialDescriptor.addElement("institutionImages", false);
        pluginGeneratedSerialDescriptor.addElement("nickname", false);
        pluginGeneratedSerialDescriptor.addElement("onboardingEntity", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("authorization", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BankAccountDetails$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[2].getValue(), lazyArr[3].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation$$serializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer$$serializer.INSTANCE, lazyArr[8].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[10].getValue(), com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization bankAccountAuthorization;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation;
        java.util.List list;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer bankAccountIssuer;
        java.util.List list2;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus bankAccountStatus;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        int i;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 10;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            bankAccountType = (com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.util.List list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation2 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation$$serializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 6);
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer bankAccountIssuer2 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer$$serializer.INSTANCE, null);
            java.util.List list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity3 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus bankAccountStatus2 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus) beginStructure.decodeSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus$$serializer.INSTANCE, null);
            bankAccountOnboardingEntity = bankAccountOnboardingEntity3;
            bankAccountAuthorization = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization) beginStructure.decodeSerializableElement(serialDescriptor, 12, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization$$serializer.INSTANCE, null);
            str = str5;
            bankAccountIssuer = bankAccountIssuer2;
            z = decodeBooleanElement;
            str2 = decodeStringElement3;
            bankAccountStatus = bankAccountStatus2;
            list2 = list4;
            str4 = decodeStringElement;
            i = 8191;
            list = list3;
            str3 = decodeStringElement2;
            bankAccountConfirmation = bankAccountConfirmation2;
        } else {
            int i5 = 12;
            int i6 = 0;
            boolean z2 = false;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization bankAccountAuthorization2 = null;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer bankAccountIssuer3 = null;
            java.util.List list5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation3 = null;
            java.util.List list6 = null;
            com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType2 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            boolean z3 = true;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus bankAccountStatus3 = null;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 10;
                    case 0:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 10;
                    case 1:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 10;
                    case 2:
                        bankAccountType2 = (com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), bankAccountType2);
                        i6 |= 4;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 10;
                    case 3:
                        list6 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list6);
                        i6 |= 8;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                    case 4:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                    case 5:
                        i6 |= 32;
                        bankAccountConfirmation3 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation$$serializer.INSTANCE, bankAccountConfirmation3);
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                    case 6:
                        z2 = beginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i6 |= 64;
                        i5 = 12;
                    case 7:
                        bankAccountIssuer3 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer) beginStructure.decodeSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer$$serializer.INSTANCE, bankAccountIssuer3);
                        i6 |= 128;
                        i5 = 12;
                    case 8:
                        list5 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), list5);
                        i6 |= 256;
                        i5 = 12;
                    case 9:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i6 |= 512;
                        i5 = 12;
                    case 10:
                        bankAccountOnboardingEntity2 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity) beginStructure.decodeSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), bankAccountOnboardingEntity2);
                        i6 |= 1024;
                        i5 = 12;
                    case 11:
                        bankAccountStatus3 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus) beginStructure.decodeSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus$$serializer.INSTANCE, bankAccountStatus3);
                        i6 |= 2048;
                        i5 = 12;
                    case 12:
                        bankAccountAuthorization2 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization) beginStructure.decodeSerializableElement(serialDescriptor, i5, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization$$serializer.INSTANCE, bankAccountAuthorization2);
                        i6 |= 4096;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.util.List list7 = list6;
            bankAccountAuthorization = bankAccountAuthorization2;
            bankAccountOnboardingEntity = bankAccountOnboardingEntity2;
            bankAccountConfirmation = bankAccountConfirmation3;
            list = list7;
            bankAccountIssuer = bankAccountIssuer3;
            list2 = list5;
            bankAccountStatus = bankAccountStatus3;
            str = str6;
            str2 = str7;
            str3 = str8;
            z = z2;
            i = i6;
            bankAccountType = bankAccountType2;
            str4 = str9;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails(i, str4, str3, bankAccountType, list, str2, bankAccountConfirmation, z, bankAccountIssuer, list2, str, bankAccountOnboardingEntity, bankAccountStatus, bankAccountAuthorization, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.write$Self$wallet_prodRelease(value, beginStructure, serialDescriptor);
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
