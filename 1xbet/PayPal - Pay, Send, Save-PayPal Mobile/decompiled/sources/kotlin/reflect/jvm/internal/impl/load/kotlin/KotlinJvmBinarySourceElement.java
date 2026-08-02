package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class KotlinJvmBinarySourceElement implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability getHighSpeedVideoFpsRangesFor;

    public KotlinJvmBinarySourceElement(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass, kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion> incompatibleVersionErrorData, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo preReleaseInfo, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability deserializedContainerAbiStability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preReleaseInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedContainerAbiStability, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinJvmBinaryClass;
        this.Camera2StreamConfigurationMap = incompatibleVersionErrorData;
        this.getHighSpeedVideoFpsRanges = preReleaseInfo;
        this.getHighSpeedVideoFpsRangesFor = deserializedContainerAbiStability;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getBinaryClass() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public final java.lang.String getPresentableString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class '");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getClassId().asSingleFqName().asString());
        sb.append('\'');
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceFile, "");
        return sourceFile;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }
}
