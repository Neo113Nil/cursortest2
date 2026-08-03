package com.vungle.ads.internal.signals;

/* compiled from: SessionData.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/signals/SessionData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/signals/SessionData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class SessionData$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.vungle.ads.internal.signals.SessionData> {
    public static final com.vungle.ads.internal.signals.SessionData$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        com.vungle.ads.internal.signals.SessionData$$serializer sessionData$$serializer = new com.vungle.ads.internal.signals.SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("103", false);
        pluginGeneratedSerialDescriptor.addElement("101", true);
        pluginGeneratedSerialDescriptor.addElement("100", true);
        pluginGeneratedSerialDescriptor.addElement("106", true);
        pluginGeneratedSerialDescriptor.addElement("102", true);
        pluginGeneratedSerialDescriptor.addElement("104", true);
        pluginGeneratedSerialDescriptor.addElement("105", true);
        pluginGeneratedSerialDescriptor.addElement("112", true);
        pluginGeneratedSerialDescriptor.addElement("113", true);
        pluginGeneratedSerialDescriptor.addElement("114", true);
        pluginGeneratedSerialDescriptor.addElement("115", true);
        pluginGeneratedSerialDescriptor.addElement("116", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SessionData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.signals.SignaledAd$$serializer.INSTANCE), kotlinx.serialization.internal.LongSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.model.UnclosedAd$$serializer.INSTANCE), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public com.vungle.ads.internal.signals.SessionData deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.Object obj;
        int i2;
        int i3;
        int i4;
        java.lang.String str;
        long j;
        int i5;
        int i6;
        java.lang.Object obj2;
        int i7;
        int i8;
        long j2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i9 = 0;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            str = beginStructure.decodeStringElement(descriptor2, 1);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 2);
            obj = beginStructure.decodeSerializableElement(descriptor2, 3, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.signals.SignaledAd$$serializer.INSTANCE), null);
            long decodeLongElement2 = beginStructure.decodeLongElement(descriptor2, 4);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 5);
            obj2 = beginStructure.decodeSerializableElement(descriptor2, 6, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.model.UnclosedAd$$serializer.INSTANCE), null);
            int decodeIntElement3 = beginStructure.decodeIntElement(descriptor2, 7);
            int decodeIntElement4 = beginStructure.decodeIntElement(descriptor2, 8);
            int decodeIntElement5 = beginStructure.decodeIntElement(descriptor2, 9);
            i3 = beginStructure.decodeIntElement(descriptor2, 10);
            i5 = decodeIntElement5;
            i7 = decodeIntElement3;
            i8 = decodeIntElement4;
            i = decodeIntElement2;
            i4 = beginStructure.decodeIntElement(descriptor2, 11);
            j = decodeLongElement;
            j2 = decodeLongElement2;
            i2 = 4095;
            i6 = decodeIntElement;
        } else {
            int i10 = 11;
            java.lang.Object obj3 = null;
            java.lang.Object obj4 = null;
            java.lang.String str2 = null;
            long j3 = 0;
            long j4 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            i = 0;
            int i16 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        i10 = 11;
                        z = false;
                    case 0:
                        i9 |= 1;
                        i11 = beginStructure.decodeIntElement(descriptor2, 0);
                        i10 = 11;
                    case 1:
                        str2 = beginStructure.decodeStringElement(descriptor2, 1);
                        i9 |= 2;
                        i10 = 11;
                    case 2:
                        j4 = beginStructure.decodeLongElement(descriptor2, 2);
                        i9 |= 4;
                        i10 = 11;
                    case 3:
                        obj4 = beginStructure.decodeSerializableElement(descriptor2, 3, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.signals.SignaledAd$$serializer.INSTANCE), obj4);
                        i9 |= 8;
                        i10 = 11;
                    case 4:
                        j3 = beginStructure.decodeLongElement(descriptor2, 4);
                        i9 |= 16;
                        i10 = 11;
                    case 5:
                        i = beginStructure.decodeIntElement(descriptor2, 5);
                        i9 |= 32;
                        i10 = 11;
                    case 6:
                        obj3 = beginStructure.decodeSerializableElement(descriptor2, 6, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.model.UnclosedAd$$serializer.INSTANCE), obj3);
                        i9 |= 64;
                        i10 = 11;
                    case 7:
                        i14 = beginStructure.decodeIntElement(descriptor2, 7);
                        i9 |= 128;
                    case 8:
                        i15 = beginStructure.decodeIntElement(descriptor2, 8);
                        i9 |= 256;
                    case 9:
                        i13 = beginStructure.decodeIntElement(descriptor2, 9);
                        i9 |= 512;
                    case 10:
                        i12 = beginStructure.decodeIntElement(descriptor2, 10);
                        i9 |= 1024;
                    case 11:
                        i16 = beginStructure.decodeIntElement(descriptor2, i10);
                        i9 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj4;
            i2 = i9;
            i3 = i12;
            i4 = i16;
            str = str2;
            j = j4;
            i5 = i13;
            java.lang.Object obj5 = obj3;
            i6 = i11;
            obj2 = obj5;
            long j5 = j3;
            i7 = i14;
            i8 = i15;
            j2 = j5;
        }
        beginStructure.endStructure(descriptor2);
        return new com.vungle.ads.internal.signals.SessionData(i2, i6, str, j, (java.util.List) obj, j2, i, (java.util.List) obj2, i7, i8, i5, i3, i4, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.vungle.ads.internal.signals.SessionData value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.vungle.ads.internal.signals.SessionData.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
