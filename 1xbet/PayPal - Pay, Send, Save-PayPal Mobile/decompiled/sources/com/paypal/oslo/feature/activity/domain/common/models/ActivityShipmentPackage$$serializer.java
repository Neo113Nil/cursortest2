package com.paypal.oslo.feature.activity.domain.common.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityShipmentPackage$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage$$serializer activityShipmentPackage$$serializer = new com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage$$serializer();
        INSTANCE = activityShipmentPackage$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage", activityShipmentPackage$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("trackingNumber", false);
        pluginGeneratedSerialDescriptor.addElement("logoImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("shipmentStatus", false);
        pluginGeneratedSerialDescriptor.addElement("statusMessage", true);
        pluginGeneratedSerialDescriptor.addElement("deliveryTime", true);
        pluginGeneratedSerialDescriptor.addElement("shippingCarrier", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityShipmentPackage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier;
        java.lang.String str;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage.$childSerializers;
        int i2 = 5;
        java.util.List list2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus2 = (com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier2 = (com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier$$serializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            str = decodeStringElement;
            activityShippingCarrier = activityShippingCarrier2;
            str4 = str6;
            str2 = str7;
            i = 127;
            str3 = str5;
            activityPackageTrackingStatus = activityPackageTrackingStatus2;
        } else {
            int i3 = 0;
            boolean z2 = true;
            java.lang.String str8 = null;
            com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier3 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus3 = null;
            java.lang.String str11 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                    case 0:
                        z = true;
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        z = true;
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i3 |= 2;
                        i2 = 5;
                    case 2:
                        activityPackageTrackingStatus3 = (com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), activityPackageTrackingStatus3);
                        i3 |= 4;
                    case 3:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i3 |= 8;
                    case 4:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i3 |= 16;
                    case 5:
                        activityShippingCarrier3 = (com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier$$serializer.INSTANCE, activityShippingCarrier3);
                        i3 |= 32;
                    case 6:
                        list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), list2);
                        i3 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            list = list2;
            activityShippingCarrier = activityShippingCarrier3;
            str = str11;
            i = i3;
            str2 = str9;
            str3 = str8;
            com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus4 = activityPackageTrackingStatus3;
            str4 = str10;
            activityPackageTrackingStatus = activityPackageTrackingStatus4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage(i, str, str3, activityPackageTrackingStatus, str4, str2, activityShippingCarrier, list, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage.write$Self$activity_prodRelease(value, beginStructure, serialDescriptor);
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
