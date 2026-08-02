package com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedemptionConfirmationDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedemptionConfirmationDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedemptionConfirmationDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedemptionConfirmationDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class RedemptionConfirmationDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestination> {
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestination$$serializer redemptionConfirmationDestination$$serializer = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestination$$serializer();
        INSTANCE = redemptionConfirmationDestination$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestination", redemptionConfirmationDestination$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("destinationData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RedemptionConfirmationDestination$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestinationData$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestinationData redemptionConfirmationDestinationData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (beginStructure.decodeSequentially()) {
            redemptionConfirmationDestinationData = (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestinationData) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestinationData$$serializer.INSTANCE, null);
        } else {
            redemptionConfirmationDestinationData = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else {
                    if (decodeElementIndex != 0) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    redemptionConfirmationDestinationData = (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestinationData) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestinationData$$serializer.INSTANCE, redemptionConfirmationDestinationData);
                    i2 = 1;
                }
            }
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestination(i, redemptionConfirmationDestinationData, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        beginStructure.encodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestinationData$$serializer.INSTANCE, value.destinationData);
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
