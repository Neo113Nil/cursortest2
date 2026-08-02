package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class JvmPackagePartSource implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo getOutputMinFrameDuration;

    public JvmPackagePartSource(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassName, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassName2, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassName3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r5, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion> incompatibleVersionErrorData, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo preReleaseInfo, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability deserializedContainerAbiStability, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmClassName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preReleaseInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedContainerAbiStability, "");
        this.getHighResolutionOutputSizeshNQ4ISI = jvmClassName;
        this.getHighSpeedVideoFpsRanges = jvmClassName2;
        this.getHighSpeedVideoSizes = jvmClassName3;
        this.Camera2StreamConfigurationMap = incompatibleVersionErrorData;
        this.getOutputMinFrameDuration = preReleaseInfo;
        this.getHighSpeedVideoFpsRangesFor = deserializedContainerAbiStability;
        this.getInputSizeshNQ4ISI = kotlinJvmBinaryClass;
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, java.lang.Integer> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.packageModuleName;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        java.lang.Integer num = (java.lang.Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r5, generatedExtension);
        this.getHighSpeedVideoSizesFor = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName getClassName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName getFacadeClassName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.getInputSizeshNQ4ISI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JvmPackagePartSource(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r13, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion> incompatibleVersionErrorData, boolean z, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability deserializedContainerAbiStability) {
        this(r2, (r0 == null || r0.length() <= 0) ? null : kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(r0), null, r13, nameResolver, incompatibleVersionErrorData, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo(z, null, 2, null), deserializedContainerAbiStability, kotlinJvmBinaryClass);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedContainerAbiStability, "");
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName byClassId = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byClassId(kotlinJvmBinaryClass.getClassId());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byClassId, "");
        java.lang.String multifileClassName = kotlinJvmBinaryClass.getClassHeader().getMultifileClassName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public final java.lang.String getPresentableString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class '");
        sb.append(getClassId().asSingleFqName().asString());
        sb.append('\'');
        return sb.toString();
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getSimpleName() {
        java.lang.String internalName = getClassName().getInternalName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(internalName, "");
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlin.text.StringsKt.substringAfterLast$default(internalName, kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return identifier;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = getClassName().getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageFqName, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName, getSimpleName());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(getClassName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceFile, "");
        return sourceFile;
    }
}
