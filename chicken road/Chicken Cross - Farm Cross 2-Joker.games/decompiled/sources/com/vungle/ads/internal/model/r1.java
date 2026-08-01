package com.vungle.ads.internal.model;

import com.chartboost.sdk.privacy.model.COPPA;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class r1 implements GeneratedSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f12009a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        r1 r1Var = new r1();
        f12009a = r1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.User", r1Var, 5);
        pluginGeneratedSerialDescriptor.addElement("gdpr", true);
        pluginGeneratedSerialDescriptor.addElement("ccpa", true);
        pluginGeneratedSerialDescriptor.addElement(COPPA.COPPA_STANDARD, true);
        pluginGeneratedSerialDescriptor.addElement("fpd", true);
        pluginGeneratedSerialDescriptor.addElement("iab", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(f1.f11968a), BuiltinSerializersKt.getNullable(v0.f12020a), BuiltinSerializersKt.getNullable(y0.f12029a), BuiltinSerializersKt.getNullable(FirstPartyData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(i1.f11978a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Object obj6 = null;
        if (beginStructure.decodeSequentially()) {
            obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, f1.f11968a, null);
            obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, v0.f12020a, null);
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, y0.f12029a, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, FirstPartyData$$serializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, i1.f11978a, null);
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj10 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, f1.f11968a, obj10);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj9 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, v0.f12020a, obj9);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj8 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, y0.f12029a, obj8);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, FirstPartyData$$serializer.INSTANCE, obj7);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, i1.f11978a, obj6);
                    i2 |= 16;
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            i = i2;
            obj5 = obj10;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new t1(i, (h1) obj5, (x0) obj4, (a1) obj3, (FirstPartyData) obj2, (k1) obj);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        t1 value = (t1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        t1.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
