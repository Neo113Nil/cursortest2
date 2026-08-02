package com.ingo.sdk.kotlin.common.features.configuration.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class ConfigurationResponse$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse> {
    public static final com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse$$serializer configurationResponse$$serializer = new com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse$$serializer();
        INSTANCE = configurationResponse$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse", configurationResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("legalDisclaimer", false);
        pluginGeneratedSerialDescriptor.addElement("checkAmountLimits", false);
        pluginGeneratedSerialDescriptor.addElement("feesConfiguration", false);
        pluginGeneratedSerialDescriptor.addElement("customerServiceConfiguration", false);
        pluginGeneratedSerialDescriptor.addElement("exitMessagingByModule", false);
        pluginGeneratedSerialDescriptor.addElement("defaultExitErrorMessaging", false);
        pluginGeneratedSerialDescriptor.addElement("defaultNetworkErrorMessaging", false);
        pluginGeneratedSerialDescriptor.addElement("voidDisclaimer", false);
        pluginGeneratedSerialDescriptor.addElement("mitekLicenseKey", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration$$serializer.INSTANCE, lazyArr[4].getValue(), com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer voidDisclaimer;
        com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage errorMessage;
        java.lang.String str;
        com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations feesConfigurations;
        java.lang.String str2;
        com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration customerServiceConfiguration;
        com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits checkAmountLimits;
        com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage errorMessage2;
        java.util.List list;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits checkAmountLimits2 = (com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits$$serializer.INSTANCE, null);
            com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations feesConfigurations2 = (com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations$$serializer.INSTANCE, null);
            com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration customerServiceConfiguration2 = (com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration$$serializer.INSTANCE, null);
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage errorMessage3 = (com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage$$serializer.INSTANCE, null);
            com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage errorMessage4 = (com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage$$serializer.INSTANCE, null);
            list = list2;
            voidDisclaimer = (com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer$$serializer.INSTANCE, null);
            errorMessage = errorMessage4;
            errorMessage2 = errorMessage3;
            customerServiceConfiguration = customerServiceConfiguration2;
            str = beginStructure.decodeStringElement(serialDescriptor, 8);
            feesConfigurations = feesConfigurations2;
            i = 511;
            checkAmountLimits = checkAmountLimits2;
            str2 = decodeStringElement;
        } else {
            int i5 = 0;
            boolean z = true;
            java.util.List list3 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer voidDisclaimer2 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage errorMessage5 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage errorMessage6 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations feesConfigurations3 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration customerServiceConfiguration3 = null;
            com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits checkAmountLimits3 = null;
            java.lang.String str4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 0:
                        str4 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 1:
                        checkAmountLimits3 = (com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits$$serializer.INSTANCE, checkAmountLimits3);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 2:
                        feesConfigurations3 = (com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations$$serializer.INSTANCE, feesConfigurations3);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 6;
                    case 3:
                        i5 |= 8;
                        customerServiceConfiguration3 = (com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration$$serializer.INSTANCE, customerServiceConfiguration3);
                        i2 = 7;
                        i3 = 6;
                    case 4:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list3);
                        i5 |= 16;
                    case 5:
                        errorMessage6 = (com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage) beginStructure.decodeSerializableElement(serialDescriptor, i4, com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage$$serializer.INSTANCE, errorMessage6);
                        i5 |= 32;
                    case 6:
                        errorMessage5 = (com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage) beginStructure.decodeSerializableElement(serialDescriptor, i3, com.ingo.sdk.kotlin.common.features.configuration.model.ErrorMessage$$serializer.INSTANCE, errorMessage5);
                        i5 |= 64;
                    case 7:
                        voidDisclaimer2 = (com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer) beginStructure.decodeSerializableElement(serialDescriptor, i2, com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer$$serializer.INSTANCE, voidDisclaimer2);
                        i5 |= 128;
                    case 8:
                        str3 = beginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration customerServiceConfiguration4 = customerServiceConfiguration3;
            voidDisclaimer = voidDisclaimer2;
            errorMessage = errorMessage5;
            str = str3;
            feesConfigurations = feesConfigurations3;
            str2 = str4;
            customerServiceConfiguration = customerServiceConfiguration4;
            checkAmountLimits = checkAmountLimits3;
            errorMessage2 = errorMessage6;
            list = list3;
            i = i5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse(i, str2, checkAmountLimits, feesConfigurations, customerServiceConfiguration, list, errorMessage2, errorMessage, voidDisclaimer, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.write$Self$sharedSdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private ConfigurationResponse$$serializer() {
    }
}
