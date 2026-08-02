package com.paypal.oslo.feature.identity.unifiedalert.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class UnifiedAlert$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert$$serializer unifiedAlert$$serializer = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert$$serializer();
        INSTANCE = unifiedAlert$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert", unifiedAlert$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("userId", false);
        pluginGeneratedSerialDescriptor.addElement("transactionId", false);
        pluginGeneratedSerialDescriptor.addElement("documentId", false);
        pluginGeneratedSerialDescriptor.addElement("alertType", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, false);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        pluginGeneratedSerialDescriptor.addElement("expiresAtEpoch", false);
        pluginGeneratedSerialDescriptor.addElement("actionDateEpoch", false);
        pluginGeneratedSerialDescriptor.addElement("acceptableClaims", false);
        pluginGeneratedSerialDescriptor.addElement("isUnifiedAlert", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UnifiedAlert$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[6].getValue(), kotlinx.serialization.internal.LongSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE, lazyArr[9].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        long j;
        long j2;
        java.util.List list;
        java.lang.String str4;
        java.util.Map map;
        java.lang.String str5;
        java.lang.String str6;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.$childSerializers;
        int i2 = 10;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 5);
            java.util.Map map2 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            long decodeLongElement = beginStructure.decodeLongElement(serialDescriptor, 7);
            long decodeLongElement2 = beginStructure.decodeLongElement(serialDescriptor, 8);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            z = beginStructure.decodeBooleanElement(serialDescriptor, 10);
            str = decodeStringElement5;
            str5 = str7;
            str3 = decodeStringElement2;
            j2 = decodeLongElement2;
            i = 2047;
            str4 = decodeStringElement4;
            j = decodeLongElement;
            map = map2;
            str2 = decodeStringElement3;
            str6 = decodeStringElement;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            java.lang.String str8 = null;
            java.util.List list2 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            long j3 = 0;
            long j4 = 0;
            java.lang.String str13 = null;
            java.util.Map map3 = null;
            int i3 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 10;
                    case 0:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 10;
                    case 1:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 10;
                    case 2:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 10;
                    case 3:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                    case 4:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i3 |= 16;
                    case 5:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                    case 6:
                        map3 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), map3);
                        i3 |= 64;
                    case 7:
                        j3 = beginStructure.decodeLongElement(serialDescriptor, 7);
                        i3 |= 128;
                    case 8:
                        j4 = beginStructure.decodeLongElement(serialDescriptor, 8);
                        i3 |= 256;
                    case 9:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), list2);
                        i3 |= 512;
                    case 10:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            str = str9;
            str2 = str10;
            str3 = str11;
            j = j3;
            j2 = j4;
            list = list2;
            str4 = str13;
            map = map3;
            str5 = str8;
            str6 = str12;
            z = z3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert(i, str6, str3, str2, str4, str5, str, map, j, j2, list, z, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.write$Self$identity_prodRelease(value, beginStructure, serialDescriptor);
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
