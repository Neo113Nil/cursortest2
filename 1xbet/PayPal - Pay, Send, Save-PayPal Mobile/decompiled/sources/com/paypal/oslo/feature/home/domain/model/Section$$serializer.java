package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\t¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/Section$$serializer;", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "(Lkotlinx/serialization/KSerializer;)V", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/home/domain/model/Section;)V", "typeParametersSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Section$$serializer<T> implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.home.domain.model.Section<T>> {
    public static final int $stable = 8;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;
    private final /* synthetic */ kotlinx.serialization.KSerializer<?> getHighSpeedVideoFpsRangesFor;

    private Section$$serializer() {
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.home.domain.model.Section", this, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("buttonText", true);
        pluginGeneratedSerialDescriptor.addElement("ctaPrompt", true);
        pluginGeneratedSerialDescriptor.addElement("instrumentation", true);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Section$$serializer(kotlinx.serialization.KSerializer<T> kSerializer) {
        this();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        this.getHighSpeedVideoFpsRangesFor = kSerializer;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), new kotlinx.serialization.internal.ArrayListSerializer(this.getHighSpeedVideoFpsRangesFor), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.home.domain.model.SectionInstrumentation$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.home.domain.model.Section<T> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        com.paypal.oslo.feature.home.domain.model.SectionInstrumentation sectionInstrumentation;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i;
        java.lang.String str4;
        java.util.List list;
        java.lang.String str5;
        java.lang.String str6;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = this.descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        java.lang.String str7 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, new kotlinx.serialization.internal.ArrayListSerializer(this.getHighSpeedVideoFpsRangesFor), null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 6);
            str3 = decodeStringElement;
            sectionInstrumentation = (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.home.domain.model.SectionInstrumentation$$serializer.INSTANCE, null);
            str2 = decodeStringElement3;
            str = str10;
            str4 = str9;
            list = list2;
            str6 = str8;
            str5 = decodeStringElement2;
            i = 255;
        } else {
            int i3 = 0;
            boolean z2 = true;
            java.lang.String str11 = null;
            com.paypal.oslo.feature.home.domain.model.SectionInstrumentation sectionInstrumentation2 = null;
            java.lang.String str12 = null;
            java.util.List list3 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                    case 0:
                        z = true;
                        str15 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        z = true;
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, new kotlinx.serialization.internal.ArrayListSerializer(this.getHighSpeedVideoFpsRangesFor), list3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i3 |= 32;
                    case 6:
                        str14 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                    case 7:
                        sectionInstrumentation2 = (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.home.domain.model.SectionInstrumentation$$serializer.INSTANCE, sectionInstrumentation2);
                        i3 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            sectionInstrumentation = sectionInstrumentation2;
            str = str12;
            str2 = str14;
            str3 = str15;
            i = i3;
            str4 = str7;
            list = list3;
            str5 = str13;
            str6 = str11;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.home.domain.model.Section<>(i, str3, str5, str6, str4, list, str, str2, sectionInstrumentation, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.home.domain.model.Section<T> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = this.descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.home.domain.model.Section.write$Self$home_prodRelease(value, beginStructure, serialDescriptor, this.getHighSpeedVideoFpsRangesFor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return new kotlinx.serialization.KSerializer[]{this.getHighSpeedVideoFpsRangesFor};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
}
