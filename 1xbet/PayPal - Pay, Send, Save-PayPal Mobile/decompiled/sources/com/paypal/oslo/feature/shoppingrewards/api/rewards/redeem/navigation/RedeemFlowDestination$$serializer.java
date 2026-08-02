package com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemFlowDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemFlowDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemFlowDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemFlowDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class RedeemFlowDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination> {
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination$$serializer redeemFlowDestination$$serializer = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination$$serializer();
        INSTANCE = redeemFlowDestination$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination", redeemFlowDestination$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("step", false);
        pluginGeneratedSerialDescriptor.addElement("redeemType", false);
        pluginGeneratedSerialDescriptor.addElement("availablePoints", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RedeemFlowDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), kotlinx.serialization.internal.IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        int i2;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep redeemStep;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep redeemStep2 = (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            redeemType = (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            redeemStep = redeemStep2;
            i = beginStructure.decodeIntElement(serialDescriptor, 2);
            i2 = 7;
        } else {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType2 = null;
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep redeemStep3 = null;
            int i3 = 0;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    redeemStep3 = (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), redeemStep3);
                    i4 |= 1;
                } else if (decodeElementIndex == 1) {
                    redeemType2 = (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), redeemType2);
                    i4 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    i3 = beginStructure.decodeIntElement(serialDescriptor, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            redeemType = redeemType2;
            redeemStep = redeemStep3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination(i2, redeemStep, redeemType, i, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination.write$Self$shopping_rewards_api_prodRelease(value, beginStructure, serialDescriptor);
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
