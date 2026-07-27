package com.vungle.ads.internal.signals;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class k implements GeneratedSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final k f12128a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        k kVar = new k();
        f12128a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SignaledAd", kVar, 5);
        pluginGeneratedSerialDescriptor.addElement("500", true);
        pluginGeneratedSerialDescriptor.addElement("109", false);
        pluginGeneratedSerialDescriptor.addElement("107", true);
        pluginGeneratedSerialDescriptor.addElement("110", true);
        pluginGeneratedSerialDescriptor.addElement("108", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), LongSerializer.INSTANCE, IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        long j;
        Object obj;
        long j2;
        int i2;
        Object obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i3 = 3;
        if (beginStructure.decodeSequentially()) {
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, null);
            j = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, null);
            long decodeLongElement = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
            i = 31;
            i2 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
            j2 = decodeLongElement;
        } else {
            long j3 = 0;
            boolean z = true;
            int i4 = 0;
            Object obj3 = null;
            Object obj4 = null;
            long j4 = 0;
            int i5 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, obj4);
                    i5 |= 1;
                } else if (decodeElementIndex == 1) {
                    j3 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                    i5 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, obj3);
                    i5 |= 4;
                } else if (decodeElementIndex == i3) {
                    j4 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, i3);
                    i5 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    i4 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                    i5 |= 16;
                }
                i3 = 3;
            }
            i = i5;
            j = j3;
            obj = obj3;
            j2 = j4;
            i2 = i4;
            obj2 = obj4;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new m(i, (String) obj2, j, (String) obj, j2, i2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        m value = (m) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        m.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
