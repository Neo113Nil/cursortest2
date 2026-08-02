package com.paypal.oslo.feature.balance.api.models.autoreload;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ThresholdData$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData> {
    public static final com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData$$serializer thresholdData$$serializer = new com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData$$serializer();
        INSTANCE = thresholdData$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData", thresholdData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("balanceId", true);
        pluginGeneratedSerialDescriptor.addElement("financialInstrumentId", true);
        pluginGeneratedSerialDescriptor.addElement("reloadAmount", true);
        pluginGeneratedSerialDescriptor.addElement("thresholdAmount", true);
        pluginGeneratedSerialDescriptor.addElement("formattedReloadAmount", true);
        pluginGeneratedSerialDescriptor.addElement("formattedThresholdAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ThresholdData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount2;
        java.lang.String str4;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        java.lang.String str5 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount3 = (com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount4 = (com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount$$serializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str3 = str6;
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            reloadAmount = reloadAmount4;
            str2 = str8;
            reloadAmount2 = reloadAmount3;
            str4 = str7;
            i = 63;
        } else {
            int i3 = 0;
            boolean z = true;
            java.lang.String str9 = null;
            com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount5 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i3 |= 2;
                    case 2:
                        reloadAmount5 = (com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount$$serializer.INSTANCE, reloadAmount5);
                        i3 |= 4;
                    case 3:
                        reloadAmount6 = (com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount$$serializer.INSTANCE, reloadAmount6);
                        i3 |= 8;
                    case 4:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i3 |= 16;
                    case 5:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str11;
            reloadAmount = reloadAmount6;
            str2 = str9;
            str3 = str10;
            reloadAmount2 = reloadAmount5;
            str4 = str5;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData(i, str3, str4, reloadAmount2, reloadAmount, str2, str, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData.write$Self$balance_api_prodRelease(value, beginStructure, serialDescriptor);
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
