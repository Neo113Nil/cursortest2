package com.paypal.oslo.feature.bankingbundle.api.domain;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibility$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibility;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibility;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibility;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class BankingBundleEligibility$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility> {
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility$$serializer bankingBundleEligibility$$serializer = new com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility$$serializer();
        INSTANCE = bankingBundleEligibility$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility", bankingBundleEligibility$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("reason", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Products, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BankingBundleEligibility$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason$$serializer.INSTANCE), lazyArr[2].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason eligibilityReason;
        java.util.List list;
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility.$childSerializers;
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason eligibilityReason2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus2 = (com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason eligibilityReason3 = (com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason$$serializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            eligibilityStatus = eligibilityStatus2;
            eligibilityReason = eligibilityReason3;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            java.util.List list2 = null;
            com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    eligibilityStatus3 = (com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), eligibilityStatus3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    eligibilityReason2 = (com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason$$serializer.INSTANCE, eligibilityReason2);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), list2);
                    i2 |= 4;
                }
            }
            i = i2;
            eligibilityReason = eligibilityReason2;
            list = list2;
            eligibilityStatus = eligibilityStatus3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility(i, eligibilityStatus, eligibilityReason, list, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility.write$Self$banking_bundle_api_prodRelease(value, beginStructure, serialDescriptor);
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
