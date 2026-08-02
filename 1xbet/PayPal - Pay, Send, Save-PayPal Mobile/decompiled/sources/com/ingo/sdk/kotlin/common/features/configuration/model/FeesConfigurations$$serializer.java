package com.ingo.sdk.kotlin.common.features.configuration.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/model/FeesConfigurations$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/FeesConfigurations;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/features/configuration/model/FeesConfigurations;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/features/configuration/model/FeesConfigurations;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class FeesConfigurations$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations> {
    public static final com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations$$serializer feesConfigurations$$serializer = new com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations$$serializer();
        INSTANCE = feesConfigurations$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations", feesConfigurations$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("minimumInMinutesFee", false);
        pluginGeneratedSerialDescriptor.addElement("printedPayrollAndGovernmentChecks", false);
        pluginGeneratedSerialDescriptor.addElement("allOtherChecks", false);
        pluginGeneratedSerialDescriptor.addElement("feeDisclaimer", false);
        pluginGeneratedSerialDescriptor.addElement("loadAmountDisclaimer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.String str;
        java.lang.String str2;
        com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration checkFeeConfiguration;
        com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration minimumInMinutesFeeConfiguration;
        com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration checkFeeConfiguration2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration minimumInMinutesFeeConfiguration2 = (com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration$$serializer.INSTANCE, null);
            com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration checkFeeConfiguration3 = (com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration$$serializer.INSTANCE, null);
            com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration checkFeeConfiguration4 = (com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration$$serializer.INSTANCE, null);
            minimumInMinutesFeeConfiguration = minimumInMinutesFeeConfiguration2;
            str = beginStructure.decodeStringElement(serialDescriptor, 3);
            str2 = beginStructure.decodeStringElement(serialDescriptor, 4);
            checkFeeConfiguration = checkFeeConfiguration4;
            checkFeeConfiguration2 = checkFeeConfiguration3;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str4 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration checkFeeConfiguration5 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration minimumInMinutesFeeConfiguration3 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration checkFeeConfiguration6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    minimumInMinutesFeeConfiguration3 = (com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration$$serializer.INSTANCE, minimumInMinutesFeeConfiguration3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    checkFeeConfiguration6 = (com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration$$serializer.INSTANCE, checkFeeConfiguration6);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    checkFeeConfiguration5 = (com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration$$serializer.INSTANCE, checkFeeConfiguration5);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    str3 = beginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    str4 = beginStructure.decodeStringElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            checkFeeConfiguration = checkFeeConfiguration5;
            minimumInMinutesFeeConfiguration = minimumInMinutesFeeConfiguration3;
            checkFeeConfiguration2 = checkFeeConfiguration6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations(i, minimumInMinutesFeeConfiguration, checkFeeConfiguration2, checkFeeConfiguration, str, str2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations.write$Self$sharedSdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private FeesConfigurations$$serializer() {
    }
}
