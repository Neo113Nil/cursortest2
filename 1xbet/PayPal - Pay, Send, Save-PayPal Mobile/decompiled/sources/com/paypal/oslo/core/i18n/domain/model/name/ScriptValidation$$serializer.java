package com.paypal.oslo.core.i18n.domain.model.name;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/name/ScriptValidation$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/name/ScriptValidation;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/i18n/domain/model/name/ScriptValidation;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/i18n/domain/model/name/ScriptValidation;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ScriptValidation$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation> {
    public static final com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation$$serializer scriptValidation$$serializer = new com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation$$serializer();
        INSTANCE = scriptValidation$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation", scriptValidation$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("characterRange", true);
        pluginGeneratedSerialDescriptor.addElement("numberRange", true);
        pluginGeneratedSerialDescriptor.addElement("initialsRange", true);
        pluginGeneratedSerialDescriptor.addElement("offensive", true);
        pluginGeneratedSerialDescriptor.addElement("punctuation", true);
        pluginGeneratedSerialDescriptor.addElement("nonVowel", true);
        pluginGeneratedSerialDescriptor.addElement("punctuationRegex", true);
        pluginGeneratedSerialDescriptor.addElement("keyboardBanging", true);
        pluginGeneratedSerialDescriptor.addElement("registeredBusinessNameRange", true);
        pluginGeneratedSerialDescriptor.addElement("restrictedBusinessNameRange", true);
        pluginGeneratedSerialDescriptor.addElement("validList", true);
        pluginGeneratedSerialDescriptor.addElement("singleCharacterValidation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScriptValidation$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[7].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[8].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[9].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[10].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[11].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.Map map;
        java.util.Map map2;
        java.lang.String str;
        java.util.Map map3;
        java.util.Map map4;
        java.util.Map map5;
        java.util.Map map6;
        int i;
        java.util.Map map7;
        java.util.Map map8;
        java.util.Map map9;
        java.util.Map map10;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        java.util.Map map11 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.Map map12 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.util.Map map13 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.util.Map map14 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.util.Map map15 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.util.Map map16 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.Map map17 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            java.util.Map map18 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            java.util.Map map19 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            java.util.Map map20 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            map5 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), null);
            str = str5;
            map = map20;
            map3 = map19;
            map10 = map17;
            map2 = map16;
            map4 = map18;
            map7 = map15;
            map6 = map13;
            map8 = map14;
            map9 = map12;
            str2 = str4;
            i = 4095;
        } else {
            int i5 = 11;
            java.lang.String str6 = null;
            java.util.Map map21 = null;
            java.util.Map map22 = null;
            java.util.Map map23 = null;
            java.lang.String str7 = null;
            java.util.Map map24 = null;
            java.util.Map map25 = null;
            java.util.Map map26 = null;
            java.util.Map map27 = null;
            int i6 = 0;
            boolean z = true;
            java.util.Map map28 = null;
            java.util.Map map29 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        str3 = str7;
                        z = false;
                        lazyArr = lazyArr;
                        i3 = 9;
                        i4 = 8;
                        str7 = str3;
                        i5 = 11;
                    case 0:
                        str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i6 |= 1;
                        lazyArr = lazyArr;
                        map27 = map27;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str7 = str3;
                        i5 = 11;
                    case 1:
                        map27 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), map27);
                        i6 |= 2;
                        lazyArr = lazyArr;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        map29 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), map29);
                        i6 |= 4;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 3:
                        map26 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), map26);
                        i6 |= 8;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        map25 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), map25);
                        i6 |= 16;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        map24 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), map24);
                        i6 |= 32;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                    case 6:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i6 |= 64;
                        i5 = 11;
                        i2 = 10;
                    case 7:
                        map28 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), map28);
                        i6 |= 128;
                        i5 = 11;
                    case 8:
                        map22 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), map22);
                        i6 |= 256;
                    case 9:
                        map21 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), map21);
                        i6 |= 512;
                    case 10:
                        map11 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, (kotlinx.serialization.DeserializationStrategy) lazyArr[i2].getValue(), map11);
                        i6 |= 1024;
                    case 11:
                        map23 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (kotlinx.serialization.DeserializationStrategy) lazyArr[i5].getValue(), map23);
                        i6 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str8 = str7;
            map = map11;
            map2 = map24;
            str = str6;
            map3 = map21;
            map4 = map22;
            map5 = map23;
            map6 = map29;
            i = i6;
            map7 = map25;
            map8 = map26;
            map9 = map27;
            map10 = map28;
            str2 = str8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation(i, str2, map9, map6, map8, map7, map2, str, map10, map4, map3, map, map5, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation.write$Self$i18n_release(value, beginStructure, serialDescriptor);
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
