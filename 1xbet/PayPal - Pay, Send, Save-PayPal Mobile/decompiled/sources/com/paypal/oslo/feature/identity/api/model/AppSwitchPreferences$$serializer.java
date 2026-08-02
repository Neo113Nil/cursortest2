package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AppSwitchPreferences$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences> {
    public static final com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences$$serializer appSwitchPreferences$$serializer = new com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences$$serializer();
        INSTANCE = appSwitchPreferences$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences", appSwitchPreferences$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("returnFlow", false);
        pluginGeneratedSerialDescriptor.addElement("appSwitchApiIntegrationChannel", false);
        pluginGeneratedSerialDescriptor.addElement("browserName", false);
        pluginGeneratedSerialDescriptor.addElement("isWebView", false);
        pluginGeneratedSerialDescriptor.addElement("fallbackUrlScheme", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AppSwitchPreferences$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[0].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel;
        java.lang.Boolean bool;
        com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType appSwitchReturnFlowType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences.$childSerializers;
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType appSwitchReturnFlowType2 = (com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel2 = (com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            appSwitchAPIIntegrationChannel = appSwitchAPIIntegrationChannel2;
            appSwitchReturnFlowType = appSwitchReturnFlowType2;
            bool = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str = str4;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str5 = null;
            com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel3 = null;
            java.lang.Boolean bool2 = null;
            com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType appSwitchReturnFlowType3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    appSwitchReturnFlowType3 = (com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), appSwitchReturnFlowType3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    appSwitchAPIIntegrationChannel3 = (com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), appSwitchAPIIntegrationChannel3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool2);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            str2 = str5;
            appSwitchAPIIntegrationChannel = appSwitchAPIIntegrationChannel3;
            bool = bool2;
            appSwitchReturnFlowType = appSwitchReturnFlowType3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences(i, appSwitchReturnFlowType, appSwitchAPIIntegrationChannel, str, bool, str2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences.write$Self$identity_api_prodRelease(value, beginStructure, serialDescriptor);
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
