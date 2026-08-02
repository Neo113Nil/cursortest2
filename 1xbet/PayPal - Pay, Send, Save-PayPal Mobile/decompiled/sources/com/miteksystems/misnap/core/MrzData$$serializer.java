package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MrzData$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MrzData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MrzData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MrzData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class MrzData$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MrzData> {
    public static final com.miteksystems.misnap.core.MrzData$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MrzData deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(descriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(descriptor, 3);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(descriptor, 4);
            str6 = decodeStringElement;
            str2 = beginStructure.decodeStringElement(descriptor, 5);
            str5 = decodeStringElement4;
            str3 = decodeStringElement5;
            str = decodeStringElement3;
            str4 = decodeStringElement2;
            i = 63;
        } else {
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            str = null;
            java.lang.String str11 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str7 = beginStructure.decodeStringElement(descriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str11 = beginStructure.decodeStringElement(descriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str = beginStructure.decodeStringElement(descriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str9 = beginStructure.decodeStringElement(descriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str10 = beginStructure.decodeStringElement(descriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str8 = beginStructure.decodeStringElement(descriptor, 5);
                        i2 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str8;
            i = i2;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            str6 = str7;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MrzData(i, str6, str4, str, str5, str3, str2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MrzData value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MrzData.write$Self(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    private MrzData$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MrzData$$serializer mrzData$$serializer = new com.miteksystems.misnap.core.MrzData$$serializer();
        INSTANCE = mrzData$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MrzData", mrzData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("documentNumber", false);
        pluginGeneratedSerialDescriptor.addElement("dateOfBirth", false);
        pluginGeneratedSerialDescriptor.addElement("dateOfExpiry", false);
        pluginGeneratedSerialDescriptor.addElement(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, false);
        pluginGeneratedSerialDescriptor.addElement("documentCode", false);
        pluginGeneratedSerialDescriptor.addElement("optionalData1", true);
        getHighResolutionOutputSizeshNQ4ISI = pluginGeneratedSerialDescriptor;
    }
}
