package com.vungle.ads.internal.model;

/* compiled from: DeviceNode.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class DeviceNode$VungleExt$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.vungle.ads.internal.model.DeviceNode.VungleExt> {
    public static final com.vungle.ads.internal.model.DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        com.vungle.ads.internal.model.DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new com.vungle.ads.internal.model.DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id_scope", true);
        pluginGeneratedSerialDescriptor.addElement("battery_level", true);
        pluginGeneratedSerialDescriptor.addElement("battery_state", true);
        pluginGeneratedSerialDescriptor.addElement("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("time_zone", true);
        pluginGeneratedSerialDescriptor.addElement("volume_level", true);
        pluginGeneratedSerialDescriptor.addElement("sound_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_tv", true);
        pluginGeneratedSerialDescriptor.addElement("sd_card_available", true);
        pluginGeneratedSerialDescriptor.addElement("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.M6.X0, true);
        pluginGeneratedSerialDescriptor.addElement("amazon_advertising_id", true);
        pluginGeneratedSerialDescriptor.addElement("sit", true);
        pluginGeneratedSerialDescriptor.addElement("oit", true);
        pluginGeneratedSerialDescriptor.addElement("ort", true);
        pluginGeneratedSerialDescriptor.addElement("obt", true);
        pluginGeneratedSerialDescriptor.addElement("gp_version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.LongSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.LongSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.LongSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.LongSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public com.vungle.ads.internal.model.DeviceNode.VungleExt deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z;
        float f;
        int i;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i2;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        boolean z2;
        float f2;
        int i3;
        java.lang.Object obj10;
        int i4;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        boolean z3;
        java.lang.Object obj15;
        java.lang.Object obj16;
        java.lang.Object obj17;
        int i5;
        int i6;
        java.lang.Object obj18;
        java.lang.Object obj19;
        java.lang.Object obj20;
        java.lang.Object obj21;
        java.lang.Object obj22;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 0);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            float decodeFloatElement = beginStructure.decodeFloatElement(descriptor2, 3);
            java.lang.Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            java.lang.Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement6 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement7 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement8 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            float decodeFloatElement2 = beginStructure.decodeFloatElement(descriptor2, 11);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 12);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 13);
            int decodeIntElement3 = beginStructure.decodeIntElement(descriptor2, 14);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 15);
            java.lang.Object decodeNullableSerializableElement9 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement10 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement11 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, kotlinx.serialization.internal.LongSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement12 = beginStructure.decodeNullableSerializableElement(descriptor2, 19, kotlinx.serialization.internal.LongSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement13 = beginStructure.decodeNullableSerializableElement(descriptor2, 20, kotlinx.serialization.internal.LongSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement14 = beginStructure.decodeNullableSerializableElement(descriptor2, 21, kotlinx.serialization.internal.LongSerializer.INSTANCE, null);
            obj4 = decodeNullableSerializableElement2;
            z = decodeBooleanElement2;
            f = decodeFloatElement2;
            obj3 = decodeNullableSerializableElement5;
            i = decodeIntElement2;
            obj6 = decodeNullableSerializableElement11;
            z3 = decodeBooleanElement;
            obj = decodeNullableSerializableElement13;
            obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 22, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj13 = decodeNullableSerializableElement3;
            obj11 = decodeNullableSerializableElement;
            obj12 = decodeNullableSerializableElement4;
            f2 = decodeFloatElement;
            z2 = decodeBooleanElement3;
            obj10 = decodeNullableSerializableElement9;
            obj5 = decodeNullableSerializableElement12;
            obj9 = decodeNullableSerializableElement6;
            obj7 = decodeNullableSerializableElement8;
            i3 = decodeIntElement;
            i4 = decodeIntElement3;
            obj14 = decodeNullableSerializableElement14;
            i2 = 8388607;
            obj8 = decodeNullableSerializableElement7;
            obj2 = decodeNullableSerializableElement10;
        } else {
            obj = null;
            int i7 = 0;
            java.lang.Object obj23 = null;
            java.lang.Object obj24 = null;
            java.lang.Object obj25 = null;
            java.lang.Object obj26 = null;
            java.lang.Object obj27 = null;
            java.lang.Object obj28 = null;
            java.lang.Object obj29 = null;
            java.lang.Object obj30 = null;
            obj2 = null;
            java.lang.Object obj31 = null;
            java.lang.Object obj32 = null;
            java.lang.Object obj33 = null;
            java.lang.Object obj34 = null;
            java.lang.Object obj35 = null;
            boolean z4 = false;
            float f3 = 0.0f;
            int i8 = 0;
            z = false;
            boolean z5 = false;
            int i9 = 0;
            f = 0.0f;
            i = 0;
            boolean z6 = true;
            while (z6) {
                java.lang.Object obj36 = obj26;
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        obj18 = obj25;
                        obj19 = obj27;
                        obj20 = obj34;
                        obj23 = obj23;
                        obj26 = obj36;
                        z6 = false;
                        obj27 = obj19;
                        obj34 = obj20;
                        obj25 = obj18;
                    case 0:
                        obj18 = obj25;
                        obj19 = obj27;
                        obj20 = obj34;
                        z5 = beginStructure.decodeBooleanElement(descriptor2, 0);
                        i7 |= 1;
                        obj23 = obj23;
                        obj26 = obj36;
                        obj24 = obj24;
                        obj27 = obj19;
                        obj34 = obj20;
                        obj25 = obj18;
                    case 1:
                        obj21 = obj27;
                        i7 |= 2;
                        obj35 = obj35;
                        obj25 = obj25;
                        obj24 = obj24;
                        obj34 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj34);
                        obj23 = obj23;
                        obj26 = obj36;
                        obj27 = obj21;
                    case 2:
                        obj22 = obj24;
                        obj21 = obj27;
                        obj35 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj35);
                        i7 |= 4;
                        obj23 = obj23;
                        obj26 = obj36;
                        obj25 = obj25;
                        obj24 = obj22;
                        obj27 = obj21;
                    case 3:
                        obj22 = obj24;
                        obj21 = obj27;
                        f3 = beginStructure.decodeFloatElement(descriptor2, 3);
                        i7 |= 8;
                        obj23 = obj23;
                        obj26 = obj36;
                        obj24 = obj22;
                        obj27 = obj21;
                    case 4:
                        i7 |= 16;
                        obj27 = obj27;
                        obj24 = obj24;
                        obj26 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj36);
                        obj23 = obj23;
                    case 5:
                        i8 = beginStructure.decodeIntElement(descriptor2, 5);
                        i7 |= 32;
                        obj27 = obj27;
                        obj23 = obj23;
                        obj26 = obj36;
                    case 6:
                        obj23 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj23);
                        i7 |= 64;
                        obj27 = obj27;
                        obj26 = obj36;
                    case 7:
                        obj16 = obj23;
                        obj17 = obj27;
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj24);
                        i7 |= 128;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 8:
                        obj16 = obj23;
                        obj17 = obj27;
                        obj33 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj33);
                        i7 |= 256;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 9:
                        obj16 = obj23;
                        obj17 = obj27;
                        obj32 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj32);
                        i7 |= 512;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 10:
                        obj16 = obj23;
                        obj17 = obj27;
                        obj31 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj31);
                        i7 |= 1024;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 11:
                        obj16 = obj23;
                        obj17 = obj27;
                        f = beginStructure.decodeFloatElement(descriptor2, 11);
                        i7 |= 2048;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 12:
                        obj16 = obj23;
                        obj17 = obj27;
                        i = beginStructure.decodeIntElement(descriptor2, 12);
                        i7 |= 4096;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 13:
                        obj16 = obj23;
                        obj17 = obj27;
                        z = beginStructure.decodeBooleanElement(descriptor2, 13);
                        i7 |= 8192;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 14:
                        obj16 = obj23;
                        obj17 = obj27;
                        i9 = beginStructure.decodeIntElement(descriptor2, 14);
                        i7 |= 16384;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 15:
                        obj16 = obj23;
                        obj17 = obj27;
                        z4 = beginStructure.decodeBooleanElement(descriptor2, 15);
                        i7 |= 32768;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 16:
                        obj16 = obj23;
                        obj17 = obj27;
                        obj25 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj25);
                        i5 = 65536;
                        i7 |= i5;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 17:
                        obj16 = obj23;
                        obj17 = obj27;
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj2);
                        i5 = 131072;
                        i7 |= i5;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 18:
                        obj16 = obj23;
                        obj17 = obj27;
                        obj30 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, kotlinx.serialization.internal.LongSerializer.INSTANCE, obj30);
                        i5 = 262144;
                        i7 |= i5;
                        obj27 = obj17;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 19:
                        obj16 = obj23;
                        obj29 = beginStructure.decodeNullableSerializableElement(descriptor2, 19, kotlinx.serialization.internal.LongSerializer.INSTANCE, obj29);
                        i6 = 524288;
                        i7 |= i6;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 20:
                        obj16 = obj23;
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 20, kotlinx.serialization.internal.LongSerializer.INSTANCE, obj);
                        i6 = 1048576;
                        i7 |= i6;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 21:
                        obj16 = obj23;
                        obj28 = beginStructure.decodeNullableSerializableElement(descriptor2, 21, kotlinx.serialization.internal.LongSerializer.INSTANCE, obj28);
                        i6 = 2097152;
                        i7 |= i6;
                        obj26 = obj36;
                        obj23 = obj16;
                    case 22:
                        obj16 = obj23;
                        obj27 = beginStructure.decodeNullableSerializableElement(descriptor2, 22, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj27);
                        i6 = 4194304;
                        i7 |= i6;
                        obj26 = obj36;
                        obj23 = obj16;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj3 = obj24;
            java.lang.Object obj37 = obj25;
            java.lang.Object obj38 = obj27;
            java.lang.Object obj39 = obj34;
            obj4 = obj35;
            java.lang.Object obj40 = obj26;
            java.lang.Object obj41 = obj23;
            i2 = i7;
            obj5 = obj29;
            obj6 = obj30;
            obj7 = obj31;
            obj8 = obj32;
            obj9 = obj33;
            z2 = z4;
            f2 = f3;
            i3 = i8;
            obj10 = obj37;
            i4 = i9;
            obj11 = obj39;
            obj12 = obj41;
            obj13 = obj40;
            obj14 = obj28;
            z3 = z5;
            obj15 = obj38;
        }
        beginStructure.endStructure(descriptor2);
        return new com.vungle.ads.internal.model.DeviceNode.VungleExt(i2, z3, (java.lang.String) obj11, (java.lang.Integer) obj4, f2, (java.lang.String) obj13, i3, (java.lang.String) obj12, (java.lang.String) obj3, (java.lang.String) obj9, (java.lang.String) obj8, (java.lang.String) obj7, f, i, z, i4, z2, (java.lang.String) obj10, (java.lang.String) obj2, (java.lang.Long) obj6, (java.lang.Long) obj5, (java.lang.Long) obj, (java.lang.Long) obj14, (java.lang.String) obj15, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.vungle.ads.internal.model.DeviceNode.VungleExt value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.vungle.ads.internal.model.DeviceNode.VungleExt.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
