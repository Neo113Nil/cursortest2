package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration> {
    public static final com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoSizes;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i = 1;
        if (beginStructure.decodeSequentially()) {
            z = beginStructure.decodeBooleanElement(descriptor, 0);
        } else {
            z = false;
            int i2 = 0;
            boolean z2 = true;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                if (decodeElementIndex == -1) {
                    z2 = false;
                } else {
                    if (decodeElementIndex != 0) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    z = beginStructure.decodeBooleanElement(descriptor, 0);
                    i2 = 1;
                }
            }
            i = i2;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration(i, z, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration.a(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    private FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer faceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer = new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer();
        INSTANCE = faceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration", faceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("faceLiveness", false);
        getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
    }
}
