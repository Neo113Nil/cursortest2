package com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class RewardsDetailArgs$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs$$serializer rewardsDetailArgs$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs$$serializer();
        INSTANCE = rewardsDetailArgs$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs", rewardsDetailArgs$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, false);
        pluginGeneratedSerialDescriptor.addElement("rewardsSummary", false);
        pluginGeneratedSerialDescriptor.addElement("productFeatureOffers", true);
        pluginGeneratedSerialDescriptor.addElement("hasPastDueAmount", true);
        pluginGeneratedSerialDescriptor.addElement("creditAccountId", true);
        pluginGeneratedSerialDescriptor.addElement("rewardsContentUrls", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RewardsDetailArgs$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers$$serializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary;
        boolean z;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs.$childSerializers;
        int i2 = 5;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers$$serializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            java.lang.String str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            creditProductIdentifier = creditProductIdentifier2;
            rewardsSummary = rewardsSummary2;
            rewardsContentUrls = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls$$serializer.INSTANCE, null);
            z = decodeBooleanElement;
            str = str2;
            productFeatureOffers = productFeatureOffers2;
            i = 63;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary3 = null;
            int i3 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), creditProductIdentifier3);
                        i3 |= 1;
                        i2 = 5;
                        continue;
                    case 1:
                        rewardsSummary3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary$$serializer.INSTANCE, rewardsSummary3);
                        i3 |= 2;
                        break;
                    case 2:
                        productFeatureOffers3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers$$serializer.INSTANCE, productFeatureOffers3);
                        i3 |= 4;
                        break;
                    case 3:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                        i3 |= 16;
                        break;
                    case 5:
                        rewardsContentUrls2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls$$serializer.INSTANCE, rewardsContentUrls2);
                        i3 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str3;
            rewardsContentUrls = rewardsContentUrls2;
            creditProductIdentifier = creditProductIdentifier3;
            productFeatureOffers = productFeatureOffers3;
            rewardsSummary = rewardsSummary3;
            z = z3;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs(i, creditProductIdentifier, rewardsSummary, productFeatureOffers, z, str, rewardsContentUrls, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
