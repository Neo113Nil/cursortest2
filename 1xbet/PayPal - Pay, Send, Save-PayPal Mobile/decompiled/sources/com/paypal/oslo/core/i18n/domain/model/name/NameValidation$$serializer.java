package com.paypal.oslo.core.i18n.domain.model.name;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/name/NameValidation$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/name/NameValidation;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/i18n/domain/model/name/NameValidation;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/i18n/domain/model/name/NameValidation;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class NameValidation$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.i18n.domain.model.name.NameValidation> {
    public static final com.paypal.oslo.core.i18n.domain.model.name.NameValidation$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.i18n.domain.model.name.NameValidation$$serializer nameValidation$$serializer = new com.paypal.oslo.core.i18n.domain.model.name.NameValidation$$serializer();
        INSTANCE = nameValidation$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.i18n.domain.model.name.NameValidation", nameValidation$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("boundaryRegex", true);
        pluginGeneratedSerialDescriptor.addElement("boundaryValidation", true);
        pluginGeneratedSerialDescriptor.addElement("repetition", true);
        pluginGeneratedSerialDescriptor.addElement("honorificsRegex", true);
        pluginGeneratedSerialDescriptor.addElement("singleCharacterRegex", true);
        pluginGeneratedSerialDescriptor.addElement("honorificsVariation", true);
        pluginGeneratedSerialDescriptor.addElement("businessScriptValidations", true);
        pluginGeneratedSerialDescriptor.addElement("scriptValidations", true);
        pluginGeneratedSerialDescriptor.addElement("supportedScripts", true);
        pluginGeneratedSerialDescriptor.addElement("maxLength", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NameValidation$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.core.i18n.domain.model.name.NameValidation.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[7].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.name.SupportedScripts$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[9].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.i18n.domain.model.name.NameValidation deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        java.util.Map map;
        java.util.List list2;
        java.util.Map map2;
        java.util.Map map3;
        java.util.Map map4;
        java.util.Map map5;
        com.paypal.oslo.core.i18n.domain.model.name.SupportedScripts supportedScripts;
        int i;
        java.lang.String str;
        java.util.Map map6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.core.i18n.domain.model.name.NameValidation.$childSerializers;
        int i2 = 8;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 5;
        java.util.Map map7 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.Map map8 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.util.Map map9 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.util.List list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.util.List list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.util.Map map10 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            java.util.Map map11 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            java.util.Map map12 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            com.paypal.oslo.core.i18n.domain.model.name.SupportedScripts supportedScripts2 = (com.paypal.oslo.core.i18n.domain.model.name.SupportedScripts) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.core.i18n.domain.model.name.SupportedScripts$$serializer.INSTANCE, null);
            map5 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            str = str2;
            supportedScripts = supportedScripts2;
            i = 1023;
            map2 = map12;
            map4 = map11;
            map3 = map10;
            list = list3;
            map6 = map8;
            list2 = list4;
            map = map9;
        } else {
            int i7 = 0;
            boolean z = true;
            java.util.List list5 = null;
            java.util.Map map13 = null;
            java.util.Map map14 = null;
            java.util.Map map15 = null;
            com.paypal.oslo.core.i18n.domain.model.name.SupportedScripts supportedScripts3 = null;
            java.util.Map map16 = null;
            java.util.Map map17 = null;
            java.lang.String str3 = null;
            java.util.List list6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 8;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                    case 0:
                        str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                        i7 |= 1;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                    case 1:
                        map17 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), map17);
                        i7 |= 2;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                    case 2:
                        map16 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), map16);
                        i7 |= 4;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 3:
                        list6 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list6);
                        i7 |= 8;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list5);
                        i7 |= 16;
                        i2 = 8;
                    case 5:
                        map14 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, i6, (kotlinx.serialization.DeserializationStrategy) lazyArr[i6].getValue(), map14);
                        i7 |= 32;
                    case 6:
                        map15 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (kotlinx.serialization.DeserializationStrategy) lazyArr[i5].getValue(), map15);
                        i7 |= 64;
                    case 7:
                        map13 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), map13);
                        i7 |= 128;
                    case 8:
                        supportedScripts3 = (com.paypal.oslo.core.i18n.domain.model.name.SupportedScripts) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.core.i18n.domain.model.name.SupportedScripts$$serializer.INSTANCE, supportedScripts3);
                        i7 |= 256;
                    case 9:
                        map7 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), map7);
                        i7 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.util.Map map18 = map17;
            java.lang.String str4 = str3;
            list = list6;
            map = map16;
            list2 = list5;
            map2 = map13;
            map3 = map14;
            map4 = map15;
            map5 = map7;
            supportedScripts = supportedScripts3;
            i = i7;
            str = str4;
            map6 = map18;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.i18n.domain.model.name.NameValidation(i, str, map6, map, list, list2, map3, map4, map2, supportedScripts, map5, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.i18n.domain.model.name.NameValidation value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.i18n.domain.model.name.NameValidation.write$Self$i18n_release(value, beginStructure, serialDescriptor);
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
