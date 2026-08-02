package com.ingo.sdk.kotlin.common.features.sdk_authorization.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/SdkAuthorizationRequest$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/SdkAuthorizationRequest;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/SdkAuthorizationRequest;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/SdkAuthorizationRequest;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class SdkAuthorizationRequest$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest> {
    public static final com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest$$serializer sdkAuthorizationRequest$$serializer = new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest$$serializer();
        INSTANCE = sdkAuthorizationRequest$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest", sdkAuthorizationRequest$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(com.ingo.sdk.android.ux.activity.IngoSdkActivity.SDK_AUTHORIZATION_TOKEN, false);
        pluginGeneratedSerialDescriptor.addElement("customerId", false);
        pluginGeneratedSerialDescriptor.addElement("iovationBlackBox", false);
        pluginGeneratedSerialDescriptor.addElement("ingoSdkVersion", false);
        pluginGeneratedSerialDescriptor.addElement("deviceInfo", false);
        pluginGeneratedSerialDescriptor.addElement("partnerAppInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo partnerAppInfo;
        java.lang.String str;
        int i;
        com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo deviceInfo;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        java.lang.String str5 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo deviceInfo2 = (com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo) beginStructure.decodeSerializableElement(serialDescriptor, 4, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo$$serializer.INSTANCE, null);
            str2 = decodeStringElement;
            partnerAppInfo = (com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo$$serializer.INSTANCE, null);
            str3 = decodeStringElement4;
            deviceInfo = deviceInfo2;
            str4 = decodeStringElement3;
            str = decodeStringElement2;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo deviceInfo3 = null;
            com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo partnerAppInfo2 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        deviceInfo3 = (com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo) beginStructure.decodeSerializableElement(serialDescriptor, 4, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo$$serializer.INSTANCE, deviceInfo3);
                        i2 |= 16;
                        break;
                    case 5:
                        partnerAppInfo2 = (com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo$$serializer.INSTANCE, partnerAppInfo2);
                        i2 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            partnerAppInfo = partnerAppInfo2;
            str = str5;
            i = i2;
            java.lang.String str9 = str8;
            deviceInfo = deviceInfo3;
            str2 = str7;
            str3 = str6;
            str4 = str9;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest(i, str2, str, str4, str3, deviceInfo, partnerAppInfo, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest.write$Self$sharedSdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private SdkAuthorizationRequest$$serializer() {
    }
}
