package com.vungle.ads.internal.model;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class n3 implements GeneratedSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final n3 f11996a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        n3 n3Var = new n3();
        f11996a = n3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbToken", n3Var, 5);
        pluginGeneratedSerialDescriptor.addElement("device", false);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        pluginGeneratedSerialDescriptor.addElement("request", true);
        pluginGeneratedSerialDescriptor.addElement("ordinal_view", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{x2.f12028a, BuiltinSerializersKt.getNullable(r1.f12009a), BuiltinSerializersKt.getNullable(l1.f11988a), BuiltinSerializersKt.getNullable(k3.f11986a), IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        Object obj4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            obj4 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, x2.f12028a, null);
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, r1.f12009a, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, l1.f11988a, null);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, k3.f11986a, null);
            i = 31;
            i2 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i4 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj8 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, x2.f12028a, obj8);
                    i4 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, r1.f12009a, obj7);
                    i4 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, l1.f11988a, obj6);
                    i4 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, k3.f11986a, obj5);
                    i4 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    i3 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                    i4 |= 16;
                }
            }
            i = i4;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            i2 = i3;
            obj4 = obj8;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new p3(i, (c3) obj4, (t1) obj3, (n1) obj2, (m3) obj, i2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        p3 value = (p3) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        p3.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
