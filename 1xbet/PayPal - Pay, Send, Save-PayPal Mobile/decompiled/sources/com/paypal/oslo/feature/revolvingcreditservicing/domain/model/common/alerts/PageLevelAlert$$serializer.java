package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/alerts/PageLevelAlert$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/alerts/PageLevelAlert;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/alerts/PageLevelAlert;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/alerts/PageLevelAlert;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PageLevelAlert$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert$$serializer pageLevelAlert$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert$$serializer();
        INSTANCE = pageLevelAlert$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert", pageLevelAlert$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("message", false);
        pluginGeneratedSerialDescriptor.addElement("callToAction", false);
        pluginGeneratedSerialDescriptor.addElement("closeButton", false);
        pluginGeneratedSerialDescriptor.addElement("impressionUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PageLevelAlert$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.CallToAction$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType alertType;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.CallToAction callToAction;
        java.lang.String str;
        java.util.List list;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert.$childSerializers;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.CallToAction callToAction2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType alertType2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.CallToAction callToAction3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.CallToAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.CallToAction$$serializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            str = decodeStringElement;
            str2 = beginStructure.decodeStringElement(serialDescriptor, 5);
            callToAction = callToAction3;
            str3 = decodeStringElement2;
            alertType = alertType2;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            alertType = null;
            java.lang.String str4 = null;
            java.util.List list2 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        alertType = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), alertType);
                        i2 |= 2;
                        break;
                    case 2:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        callToAction2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.CallToAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.CallToAction$$serializer.INSTANCE, callToAction2);
                        i2 |= 8;
                        break;
                    case 4:
                        list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list2);
                        i2 |= 16;
                        break;
                    case 5:
                        str4 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i2;
            java.util.List list3 = list2;
            callToAction = callToAction2;
            str = str5;
            list = list3;
            java.lang.String str7 = str6;
            str2 = str4;
            str3 = str7;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert(i, str, alertType, str3, callToAction, list, str2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.PageLevelAlert.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
