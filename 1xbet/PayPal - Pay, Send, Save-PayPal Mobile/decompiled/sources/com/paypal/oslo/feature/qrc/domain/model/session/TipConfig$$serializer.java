package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class TipConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.domain.model.session.TipConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.TipConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfig$$serializer tipConfig$$serializer = new com.paypal.oslo.feature.qrc.domain.model.session.TipConfig$$serializer();
        INSTANCE = tipConfig$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.domain.model.session.TipConfig", tipConfig$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        pluginGeneratedSerialDescriptor.addElement("thresholdType", true);
        pluginGeneratedSerialDescriptor.addElement("thresholdValuesAmount", true);
        pluginGeneratedSerialDescriptor.addElement("thresholdValuesPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("defaultConfigs", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("allowCustom", true);
        pluginGeneratedSerialDescriptor.addElement("maximumAllowedTipPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("maximumAllowedTipAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TipConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.session.TipConfig.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs$$serializer.INSTANCE), lazyArr[6].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.domain.model.session.TipConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType tipConfigThresholdType;
        com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultTipConfigs;
        java.util.List list2;
        java.lang.Boolean bool;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney;
        java.lang.String str;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus qrcTippingStatus;
        int i;
        java.lang.String str2;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory tipConfigCategory;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.session.TipConfig.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 5;
        int i5 = 8;
        int i6 = 6;
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory tipConfigCategory2 = (com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType tipConfigThresholdType2 = (com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.util.List list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.util.List list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultTipConfigs2 = (com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus qrcTippingStatus2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            java.lang.Boolean bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            qrcTippingStatus = qrcTippingStatus2;
            str2 = str4;
            qrcMoney = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            bool = bool2;
            defaultTipConfigs = defaultTipConfigs2;
            str = str5;
            i = 1023;
            list = list3;
            tipConfigCategory = tipConfigCategory2;
            list2 = list4;
            tipConfigThresholdType = tipConfigThresholdType2;
        } else {
            int i7 = 0;
            boolean z = true;
            com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultTipConfigs3 = null;
            java.util.List list5 = null;
            java.lang.Boolean bool3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus qrcTippingStatus3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory tipConfigCategory3 = null;
            java.util.List list6 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType tipConfigThresholdType3 = null;
            java.lang.String str6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i4 = 5;
                        i5 = 8;
                        i6 = 6;
                    case 0:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i7 |= 1;
                        i2 = 9;
                        i3 = 7;
                        i4 = 5;
                        i5 = 8;
                        i6 = 6;
                    case 1:
                        tipConfigCategory3 = (com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), tipConfigCategory3);
                        i7 |= 2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 5;
                        i5 = 8;
                        i6 = 6;
                    case 2:
                        tipConfigThresholdType3 = (com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), tipConfigThresholdType3);
                        i7 |= 4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 5;
                        i5 = 8;
                    case 3:
                        list6 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list6);
                        i7 |= 8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 5;
                    case 4:
                        list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list5);
                        i7 |= 16;
                        i2 = 9;
                    case 5:
                        defaultTipConfigs3 = (com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs$$serializer.INSTANCE, defaultTipConfigs3);
                        i7 |= 32;
                    case 6:
                        qrcTippingStatus3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus) beginStructure.decodeSerializableElement(serialDescriptor, i6, (kotlinx.serialization.DeserializationStrategy) lazyArr[i6].getValue(), qrcTippingStatus3);
                        i7 |= 64;
                    case 7:
                        bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool3);
                        i7 |= 128;
                    case 8:
                        str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                        i7 |= 256;
                    case 9:
                        qrcMoney2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney2);
                        i7 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory tipConfigCategory4 = tipConfigCategory3;
            java.lang.String str7 = str6;
            list = list6;
            tipConfigThresholdType = tipConfigThresholdType3;
            defaultTipConfigs = defaultTipConfigs3;
            list2 = list5;
            bool = bool3;
            qrcMoney = qrcMoney2;
            str = str3;
            qrcTippingStatus = qrcTippingStatus3;
            i = i7;
            str2 = str7;
            tipConfigCategory = tipConfigCategory4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.domain.model.session.TipConfig(i, str2, tipConfigCategory, tipConfigThresholdType, list, list2, defaultTipConfigs, qrcTippingStatus, bool, str, qrcMoney, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.domain.model.session.TipConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfig.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
