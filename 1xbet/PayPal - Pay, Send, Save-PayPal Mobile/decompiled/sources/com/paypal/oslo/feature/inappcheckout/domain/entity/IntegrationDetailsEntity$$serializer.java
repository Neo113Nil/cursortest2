package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class IntegrationDetailsEntity$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$serializer integrationDetailsEntity$$serializer = new com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$serializer();
        INSTANCE = integrationDetailsEntity$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity", integrationDetailsEntity$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("returnUrl", false);
        pluginGeneratedSerialDescriptor.addElement("cancelUrl", false);
        pluginGeneratedSerialDescriptor.addElement("editStickyFiScenario", false);
        pluginGeneratedSerialDescriptor.addElement("hideShipping", false);
        pluginGeneratedSerialDescriptor.addElement("billingType", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntegrationDetailsEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.lang.Boolean bool;
        java.lang.String str2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum;
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity.$childSerializers;
        int i2 = 3;
        java.lang.Boolean bool2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.lang.Boolean bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            flowEnum = (com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            str = str3;
            bool = bool3;
            str2 = str4;
            editStickyFiScenarioEnum = editStickyFiScenarioEnum2;
            billingType = billingType2;
            i = 63;
        } else {
            int i3 = 0;
            boolean z = true;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum2 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType3 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum3 = null;
            java.lang.String str6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i3 |= 1;
                        i2 = 3;
                    case 1:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i3 |= 2;
                    case 2:
                        editStickyFiScenarioEnum3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), editStickyFiScenarioEnum3);
                        i3 |= 4;
                    case 3:
                        bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool2);
                        i3 |= 8;
                    case 4:
                        billingType3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), billingType3);
                        i3 |= 16;
                    case 5:
                        flowEnum2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), flowEnum2);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            str = str6;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType4 = billingType3;
            bool = bool2;
            str2 = str5;
            billingType = billingType4;
            com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum4 = editStickyFiScenarioEnum3;
            flowEnum = flowEnum2;
            editStickyFiScenarioEnum = editStickyFiScenarioEnum4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity(i, str, str2, editStickyFiScenarioEnum, bool, billingType, flowEnum, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity.write$Self$inappcheckout_prodRelease(value, beginStructure, serialDescriptor);
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
