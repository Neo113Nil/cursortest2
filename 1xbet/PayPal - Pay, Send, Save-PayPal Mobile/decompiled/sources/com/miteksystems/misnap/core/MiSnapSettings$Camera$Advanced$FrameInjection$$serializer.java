package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$Advanced$FrameInjection$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$Advanced$FrameInjection;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$Advanced$FrameInjection;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$Advanced$FrameInjection;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MiSnapSettings$Camera$Advanced$FrameInjection$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MiSnapSettings.Camera.Advanced.FrameInjection> {
    public static final com.miteksystems.misnap.core.MiSnapSettings$Camera$Advanced$FrameInjection$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoFpsRangesFor;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MiSnapSettings.Camera.Advanced.FrameInjection deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        java.lang.Object obj = null;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor, 0);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor, 1);
            obj = beginStructure.decodeNullableSerializableElement(descriptor, 2, com.miteksystems.misnap.core.MiSnapCameraInfo$$serializer.INSTANCE, null);
            i = decodeIntElement;
            i2 = 7;
            i3 = decodeIntElement2;
        } else {
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    i4 = beginStructure.decodeIntElement(descriptor, 0);
                    i5 |= 1;
                } else if (decodeElementIndex == 1) {
                    i6 = beginStructure.decodeIntElement(descriptor, 1);
                    i5 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    obj = beginStructure.decodeNullableSerializableElement(descriptor, 2, com.miteksystems.misnap.core.MiSnapCameraInfo$$serializer.INSTANCE, obj);
                    i5 |= 4;
                }
            }
            i = i4;
            i2 = i5;
            i3 = i6;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MiSnapSettings.Camera.Advanced.FrameInjection(i2, i, i3, (com.miteksystems.misnap.core.MiSnapCameraInfo) obj, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MiSnapSettings.Camera.Advanced.FrameInjection value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MiSnapSettings.Camera.Advanced.FrameInjection.write$Self(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.IntSerializer intSerializer = kotlinx.serialization.internal.IntSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{intSerializer, intSerializer, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.miteksystems.misnap.core.MiSnapCameraInfo$$serializer.INSTANCE)};
    }

    private MiSnapSettings$Camera$Advanced$FrameInjection$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MiSnapSettings$Camera$Advanced$FrameInjection$$serializer miSnapSettings$Camera$Advanced$FrameInjection$$serializer = new com.miteksystems.misnap.core.MiSnapSettings$Camera$Advanced$FrameInjection$$serializer();
        INSTANCE = miSnapSettings$Camera$Advanced$FrameInjection$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Camera.Advanced.FrameInjection", miSnapSettings$Camera$Advanced$FrameInjection$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("rawResourceId", false);
        pluginGeneratedSerialDescriptor.addElement("rotationDegrees", false);
        pluginGeneratedSerialDescriptor.addElement("cameraInfo", true);
        getHighSpeedVideoFpsRangesFor = pluginGeneratedSerialDescriptor;
    }
}
