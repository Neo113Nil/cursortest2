package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapCameraInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapCameraInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MiSnapCameraInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MiSnapCameraInfo> {
    public static final com.miteksystems.misnap.core.MiSnapCameraInfo$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoSizes;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MiSnapCameraInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        java.lang.String str;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.String str2;
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 9;
        int i3 = 7;
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor, 0);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor, 1);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor, 2);
            com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer sizeSerializer = com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer.INSTANCE;
            obj4 = beginStructure.decodeSerializableElement(descriptor, 3, sizeSerializer, null);
            obj2 = beginStructure.decodeSerializableElement(descriptor, 4, sizeSerializer, null);
            obj3 = beginStructure.decodeSerializableElement(descriptor, 5, sizeSerializer, null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor, 6);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor, 7);
            obj = beginStructure.decodeNullableSerializableElement(descriptor, 8, sizeSerializer, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 9, sizeSerializer, null);
            str = decodeStringElement2;
            str2 = decodeStringElement;
            z2 = decodeBooleanElement3;
            z3 = decodeBooleanElement2;
            i = 1023;
            z = decodeBooleanElement;
        } else {
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = false;
            int i4 = 0;
            java.lang.Object obj6 = null;
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            boolean z7 = false;
            while (z4) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z4 = false;
                        i2 = 9;
                    case 0:
                        i4 |= 1;
                        z5 = beginStructure.decodeBooleanElement(descriptor, 0);
                        i2 = 9;
                        i3 = 7;
                    case 1:
                        i4 |= 2;
                        z6 = beginStructure.decodeBooleanElement(descriptor, 1);
                        i2 = 9;
                        i3 = 7;
                    case 2:
                        z7 = beginStructure.decodeBooleanElement(descriptor, 2);
                        i4 |= 4;
                        i2 = 9;
                        i3 = 7;
                    case 3:
                        i4 |= 8;
                        obj9 = beginStructure.decodeSerializableElement(descriptor, 3, com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer.INSTANCE, obj9);
                        i2 = 9;
                        i3 = 7;
                    case 4:
                        obj7 = beginStructure.decodeSerializableElement(descriptor, 4, com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer.INSTANCE, obj7);
                        i4 |= 16;
                        i2 = 9;
                    case 5:
                        obj8 = beginStructure.decodeSerializableElement(descriptor, 5, com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer.INSTANCE, obj8);
                        i4 |= 32;
                    case 6:
                        str3 = beginStructure.decodeStringElement(descriptor, 6);
                        i4 |= 64;
                    case 7:
                        str4 = beginStructure.decodeStringElement(descriptor, i3);
                        i4 |= 128;
                    case 8:
                        obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 8, com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer.INSTANCE, obj6);
                        i4 |= 256;
                    case 9:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor, i2, com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer.INSTANCE, obj10);
                        i4 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            i = i4;
            str = str4;
            obj4 = obj9;
            obj5 = obj10;
            str2 = str3;
            z = z5;
            boolean z8 = z6;
            z2 = z7;
            z3 = z8;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MiSnapCameraInfo(i, z, z3, z2, (android.util.Size) obj4, (android.util.Size) obj2, (android.util.Size) obj3, str2, str, (android.util.Size) obj, (android.util.Size) obj5, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MiSnapCameraInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MiSnapCameraInfo.write$Self(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return getHighSpeedVideoSizes;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.BooleanSerializer booleanSerializer = kotlinx.serialization.internal.BooleanSerializer.INSTANCE;
        com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer sizeSerializer = com.miteksystems.misnap.core.MiSnapSettings.SizeSerializer.INSTANCE;
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, sizeSerializer, sizeSerializer, sizeSerializer, stringSerializer, stringSerializer, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(sizeSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(sizeSerializer)};
    }

    private MiSnapCameraInfo$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MiSnapCameraInfo$$serializer miSnapCameraInfo$$serializer = new com.miteksystems.misnap.core.MiSnapCameraInfo$$serializer();
        INSTANCE = miSnapCameraInfo$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapCameraInfo", miSnapCameraInfo$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SUPPORTS_AUTO_ANALYSIS, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SUPPORTS_AUTO_FOCUS, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SUPPORTS_TORCH, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SUPPORTED_PREVIEW_SIZE, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SUPPORTED_IMAGE_ANALYSIS_SIZE, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SUPPORTED_PICTURE_SIZE, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_DEVICE_HARDWARE_LEVEL, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_DEVICE_FACING_DIRECTION, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SUPPORTED_IMAGE_ANALYSIS_HIGH_RESOLUTION_SIZE, true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SUPPORTED_PICTURE_HIGH_RESOLUTION_SIZE, true);
        getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
    }
}
