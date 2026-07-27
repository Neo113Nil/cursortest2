package com.vungle.ads.internal.model;

import com.ironsource.L6;
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
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class x2 implements GeneratedSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f12028a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        x2 x2Var = new x2();
        f12028a = x2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode", x2Var, 11);
        pluginGeneratedSerialDescriptor.addElement(L6.t, false);
        pluginGeneratedSerialDescriptor.addElement("model", false);
        pluginGeneratedSerialDescriptor.addElement("osv", false);
        pluginGeneratedSerialDescriptor.addElement(L6.R0, true);
        pluginGeneratedSerialDescriptor.addElement(L6.F, false);
        pluginGeneratedSerialDescriptor.addElement("w", false);
        pluginGeneratedSerialDescriptor.addElement("h", false);
        pluginGeneratedSerialDescriptor.addElement(L6.d0, true);
        pluginGeneratedSerialDescriptor.addElement("ifa", true);
        pluginGeneratedSerialDescriptor.addElement("lmt", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), StringSerializer.INSTANCE, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(z2.f12033a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        String str;
        String str2;
        String str3;
        Object obj4;
        Object obj5;
        int i3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i4 = 10;
        int i5 = 9;
        int i6 = 7;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, null);
            String decodeStringElement4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
            int decodeIntElement = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
            int decodeIntElement2 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 6);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, StringSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, StringSerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 9, IntSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 10, z2.f12033a, null);
            i = decodeIntElement2;
            i2 = decodeIntElement;
            str3 = decodeStringElement4;
            str4 = decodeStringElement3;
            str2 = decodeStringElement2;
            i3 = 2047;
            str = decodeStringElement;
        } else {
            boolean z = true;
            int i7 = 0;
            int i8 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Object obj10 = null;
            int i9 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                    case 0:
                        str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i8 |= 1;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                    case 1:
                        str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i8 |= 2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                    case 2:
                        str7 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i8 |= 4;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                    case 3:
                        obj9 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, obj9);
                        i8 |= 8;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                    case 4:
                        str8 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                        i8 |= 16;
                    case 5:
                        i9 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                        i8 |= 32;
                    case 6:
                        i7 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 6);
                        i8 |= 64;
                    case 7:
                        obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i6, StringSerializer.INSTANCE, obj6);
                        i8 |= 128;
                    case 8:
                        obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, StringSerializer.INSTANCE, obj7);
                        i8 |= 256;
                    case 9:
                        obj8 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i5, IntSerializer.INSTANCE, obj8);
                        i8 |= 512;
                    case 10:
                        obj10 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i4, z2.f12033a, obj10);
                        i8 |= 1024;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            Object obj11 = obj9;
            i = i7;
            obj = obj6;
            obj2 = obj7;
            obj3 = obj10;
            i2 = i9;
            str = str5;
            str2 = str6;
            str3 = str8;
            obj4 = obj11;
            obj5 = obj8;
            i3 = i8;
            str4 = str7;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new c3(i3, str, str2, str4, (String) obj4, str3, i2, i, (String) obj, (String) obj2, (Integer) obj5, (b3) obj3);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        c3 value = (c3) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        c3.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
