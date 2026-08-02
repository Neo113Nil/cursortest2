package com.paypal.oslo.feature.userprofile.data.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/model/DmsFile$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/userprofile/data/model/DmsFile;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/userprofile/data/model/DmsFile;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/userprofile/data/model/DmsFile;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DmsFile$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.userprofile.data.model.DmsFile> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.userprofile.data.model.DmsFile$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.userprofile.data.model.DmsFile$$serializer dmsFile$$serializer = new com.paypal.oslo.feature.userprofile.data.model.DmsFile$$serializer();
        INSTANCE = dmsFile$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.userprofile.data.model.DmsFile", dmsFile$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement(androidx.core.provider.FontsContractCompat.Columns.FILE_ID, false);
        pluginGeneratedSerialDescriptor.addElement("size_in_bytes", false);
        pluginGeneratedSerialDescriptor.addElement("mime_type", false);
        pluginGeneratedSerialDescriptor.addElement("filename", false);
        pluginGeneratedSerialDescriptor.addElement("create_time", false);
        pluginGeneratedSerialDescriptor.addElement("update_time", false);
        pluginGeneratedSerialDescriptor.addElement("links", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DmsFile$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.userprofile.data.model.DmsFile.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[6].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.userprofile.data.model.DmsFile deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.userprofile.data.model.DmsFile.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 0);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 1);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            i3 = decodeIntElement;
            str = decodeStringElement4;
            str2 = decodeStringElement2;
            str3 = decodeStringElement3;
            str4 = decodeStringElement;
            i = 127;
            i2 = decodeIntElement2;
        } else {
            boolean z = true;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            java.util.List list2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i6 |= 1;
                        i4 = beginStructure.decodeIntElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        i5 = beginStructure.decodeIntElement(serialDescriptor, 1);
                        i6 |= 2;
                        continue;
                    case 2:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        break;
                    case 6:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), list2);
                        i6 |= 64;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            list = list2;
            str = str7;
            str2 = str8;
            i = i6;
            str3 = str6;
            str4 = str5;
            i2 = i5;
            i3 = i4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.userprofile.data.model.DmsFile(i, i3, i2, str4, str2, str3, str, list, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.userprofile.data.model.DmsFile value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.userprofile.data.model.DmsFile.write$Self$user_profile_prodRelease(value, beginStructure, serialDescriptor);
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
