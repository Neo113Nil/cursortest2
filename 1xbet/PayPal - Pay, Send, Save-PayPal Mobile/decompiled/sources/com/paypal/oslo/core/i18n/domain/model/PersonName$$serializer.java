package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/PersonName$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/i18n/domain/model/PersonName;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PersonName$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.i18n.domain.model.PersonName> {
    public static final com.paypal.oslo.core.i18n.domain.model.PersonName$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.i18n.domain.model.PersonName$$serializer personName$$serializer = new com.paypal.oslo.core.i18n.domain.model.PersonName$$serializer();
        INSTANCE = personName$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.i18n.domain.model.PersonName", personName$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, true);
        pluginGeneratedSerialDescriptor.addElement(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, true);
        pluginGeneratedSerialDescriptor.addElement("surName", true);
        pluginGeneratedSerialDescriptor.addElement("secondSurname", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PersonName$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.GivenName$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.MiddleName$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.Surname$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.SecondSurname$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.i18n.domain.model.PersonName deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.core.i18n.domain.model.GivenName givenName = (com.paypal.oslo.core.i18n.domain.model.GivenName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.i18n.domain.model.GivenName$$serializer.INSTANCE, null);
            java.lang.String m11419unboximpl = givenName != null ? givenName.m11419unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.MiddleName middleName = (com.paypal.oslo.core.i18n.domain.model.MiddleName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.core.i18n.domain.model.MiddleName$$serializer.INSTANCE, null);
            java.lang.String m11434unboximpl = middleName != null ? middleName.m11434unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.Surname surname = (com.paypal.oslo.core.i18n.domain.model.Surname) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.i18n.domain.model.Surname$$serializer.INSTANCE, null);
            java.lang.String m11528unboximpl = surname != null ? surname.m11528unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.SecondSurname secondSurname = (com.paypal.oslo.core.i18n.domain.model.SecondSurname) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.core.i18n.domain.model.SecondSurname$$serializer.INSTANCE, null);
            str = m11419unboximpl;
            i = 15;
            str2 = m11528unboximpl;
            str3 = m11434unboximpl;
            str4 = secondSurname != null ? secondSurname.m11483unboximpl() : null;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    com.paypal.oslo.core.i18n.domain.model.GivenName givenName2 = (com.paypal.oslo.core.i18n.domain.model.GivenName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.i18n.domain.model.GivenName$$serializer.INSTANCE, str5 != null ? com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(str5) : null);
                    str5 = givenName2 != null ? givenName2.m11419unboximpl() : null;
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    com.paypal.oslo.core.i18n.domain.model.MiddleName middleName2 = (com.paypal.oslo.core.i18n.domain.model.MiddleName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.core.i18n.domain.model.MiddleName$$serializer.INSTANCE, str7 != null ? com.paypal.oslo.core.i18n.domain.model.MiddleName.m11428boximpl(str7) : null);
                    str7 = middleName2 != null ? middleName2.m11434unboximpl() : null;
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    com.paypal.oslo.core.i18n.domain.model.Surname surname2 = (com.paypal.oslo.core.i18n.domain.model.Surname) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.i18n.domain.model.Surname$$serializer.INSTANCE, str6 != null ? com.paypal.oslo.core.i18n.domain.model.Surname.m11522boximpl(str6) : null);
                    str6 = surname2 != null ? surname2.m11528unboximpl() : null;
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    com.paypal.oslo.core.i18n.domain.model.SecondSurname secondSurname2 = (com.paypal.oslo.core.i18n.domain.model.SecondSurname) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.core.i18n.domain.model.SecondSurname$$serializer.INSTANCE, str8 != null ? com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11477boximpl(str8) : null);
                    str8 = secondSurname2 != null ? secondSurname2.m11483unboximpl() : null;
                    i2 |= 8;
                }
            }
            str = str5;
            i = i2;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.i18n.domain.model.PersonName(i, str, str3, str2, str4, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.i18n.domain.model.PersonName value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.i18n.domain.model.PersonName.write$Self$i18n_release(value, beginStructure, serialDescriptor);
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
