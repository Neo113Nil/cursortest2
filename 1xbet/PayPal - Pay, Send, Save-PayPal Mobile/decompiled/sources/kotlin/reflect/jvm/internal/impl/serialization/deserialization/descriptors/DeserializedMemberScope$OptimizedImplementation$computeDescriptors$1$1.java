package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX INFO: Add missing generic type declarations: [M] */
/* loaded from: classes5.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1<M> implements kotlin.jvm.functions.Function0<M> {
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.Parser<M> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.io.ByteArrayInputStream getHighSpeedVideoSizes;

    /* JADX WARN: Incorrect return type in method signature: ()TM; */
    @Override // kotlin.jvm.functions.Function0
    public final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite invoke() {
        return (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) this.getHighResolutionOutputSizeshNQ4ISI.parseDelimitedFrom(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges.getC().getComponents().getExtensionRegistryLite());
    }

    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(kotlin.reflect.jvm.internal.impl.protobuf.Parser<M> parser, java.io.ByteArrayInputStream byteArrayInputStream, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope) {
        this.getHighResolutionOutputSizeshNQ4ISI = parser;
        this.getHighSpeedVideoSizes = byteArrayInputStream;
        this.getHighSpeedVideoFpsRanges = deserializedMemberScope;
    }
}
