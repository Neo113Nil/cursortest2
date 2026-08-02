package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class DeserializedDescriptorResolver {
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.Companion(null);
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf(kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS);
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[]{kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(1, 1, 2);
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(1, 1, 11);
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(1, 1, 13);

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getComponents() {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setComponents(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationComponents, "");
        this.components = deserializationComponents;
    }

    public final void setComponents(kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava deserializationComponentsForJava) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "");
        setComponents(deserializationComponentsForJava.getComponents());
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData readClassData$descriptors_jvm = readClassData$descriptors_jvm(kotlinJvmBinaryClass);
        if (readClassData$descriptors_jvm == null) {
            return null;
        }
        return getComponents().getClassDeserializer().deserializeClass(kotlinJvmBinaryClass.getClassId(), readClassData$descriptors_jvm);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData readClassData$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        java.lang.String[] strings;
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        java.lang.String[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(kotlinJvmBinaryClass, Camera2StreamConfigurationMap);
        if (highSpeedVideoFpsRanges == null || (strings = kotlinJvmBinaryClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            try {
                pair = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(highSpeedVideoFpsRanges, strings);
            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not read data from ");
                sb.append(kotlinJvmBinaryClass.getLocation());
                throw new java.lang.IllegalStateException(sb.toString(), e);
            }
        } catch (java.lang.Throwable th) {
            if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(getComponents().getConfiguration().getMetadataVersion())) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData(pair.component1(), pair.component2(), kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, Camera2StreamConfigurationMap(kotlinJvmBinaryClass), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo(getHighSpeedVideoFpsRangesFor(kotlinJvmBinaryClass), null, 2, null), getHighResolutionOutputSizeshNQ4ISI(kotlinJvmBinaryClass)));
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createKotlinPackagePartScope(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        java.lang.String[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(kotlinJvmBinaryClass, getHighSpeedVideoFpsRangesFor);
        if (highSpeedVideoFpsRanges == null) {
            return null;
        }
        java.lang.String[] strings = kotlinJvmBinaryClass.getClassHeader().getStrings();
        try {
        } catch (java.lang.Throwable th) {
            if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(getComponents().getConfiguration().getMetadataVersion())) {
                throw th;
            }
            pair = null;
        }
        if (strings == null) {
            return null;
        }
        try {
            pair = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(highSpeedVideoFpsRanges, strings);
            if (pair == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver component1 = pair.component1();
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package component2 = pair.component2();
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver jvmNameResolver = component1;
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource jvmPackagePartSource = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource(kotlinJvmBinaryClass, component2, jvmNameResolver, Camera2StreamConfigurationMap(kotlinJvmBinaryClass), getHighSpeedVideoFpsRangesFor(kotlinJvmBinaryClass), getHighResolutionOutputSizeshNQ4ISI(kotlinJvmBinaryClass));
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components = getComponents();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("scope for ");
            sb.append(jvmPackagePartSource);
            sb.append(" in ");
            sb.append(packageFragmentDescriptor);
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope(packageFragmentDescriptor, component2, jvmNameResolver, kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), jvmPackagePartSource, components, sb.toString(), new kotlin.jvm.functions.Function0() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$$Lambda$0
                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Collection emptyList;
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                    return emptyList;
                }
            });
        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not read data from ");
            sb2.append(kotlinJvmBinaryClass.getLocation());
            throw new java.lang.IllegalStateException(sb2.toString(), e);
        }
    }

    private final boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || kotlin.jvm.internal.Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), getHighSpeedVideoFpsRanges))) {
            return true;
        }
        return !getComponents().getConfiguration().getSkipPrereleaseCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && kotlin.jvm.internal.Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), getHighResolutionOutputSizeshNQ4ISI);
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return getComponents().getConfiguration().getAllowUnstableDependencies() ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.STABLE : kotlinJvmBinaryClass.getClassHeader().isUnstableJvmIrBinary() ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.UNSTABLE : kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.STABLE;
    }

    private static java.lang.String[] getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> set) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
        java.lang.String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null || !set.contains(classHeader.getKind())) {
            return null;
        }
        return data;
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.getHighSpeedVideoSizes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion> Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(getComponents().getConfiguration().getMetadataVersion())) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE, getComponents().getConfiguration().getMetadataVersion(), getComponents().getConfiguration().getMetadataVersion().lastSupportedVersionWithThisLanguageVersion(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isStrictSemantics()), kotlinJvmBinaryClass.getLocation());
    }
}
