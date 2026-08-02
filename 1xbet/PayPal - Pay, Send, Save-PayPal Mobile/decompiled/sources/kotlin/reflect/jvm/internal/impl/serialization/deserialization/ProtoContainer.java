package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public abstract class ProtoContainer {
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getHighSpeedVideoSizes;

    public abstract kotlin.reflect.jvm.internal.impl.name.FqName debugFqName();

    private ProtoContainer(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        this.getHighSpeedVideoSizes = nameResolver;
        this.Camera2StreamConfigurationMap = typeTable;
        this.getHighSpeedVideoFpsRangesFor = sourceElement;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getNameResolver() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getTypeTable() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static final class Class extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer {
        private final kotlin.reflect.jvm.internal.impl.name.ClassId Camera2StreamConfigurationMap;
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getHighResolutionOutputSizeshNQ4ISI;
        private final boolean getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoFpsRangesFor;
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind getHighSpeedVideoSizes;
        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class getOutputMinFrameDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r3, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r7) {
            super(nameResolver, typeTable, sourceElement, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
            this.getHighResolutionOutputSizeshNQ4ISI = r3;
            this.getOutputMinFrameDuration = r7;
            this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, r3.getFqName());
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind kind = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.CLASS_KIND.get(r3.getFlags());
            this.getHighSpeedVideoSizes = kind == null ? kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS : kind;
            java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INNER.get(r3.getFlags());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
            this.getHighSpeedVideoFpsRanges = bool.booleanValue();
            java.lang.Boolean bool2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_DATA.get(r3.getFlags());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool2, "");
            this.getHighSpeedVideoFpsRangesFor = bool2.booleanValue();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClassProto() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class getOuterClass() {
            return this.getOutputMinFrameDuration;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
            return this.Camera2StreamConfigurationMap;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind getKind() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean isInner() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public final kotlin.reflect.jvm.internal.impl.name.FqName debugFqName() {
            return this.Camera2StreamConfigurationMap.asSingleFqName();
        }
    }

    public static final class Package extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer {
        private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
            this.getHighSpeedVideoFpsRangesFor = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public final kotlin.reflect.jvm.internal.impl.name.FqName debugFqName() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(debugFqName());
        return sb.toString();
    }

    public /* synthetic */ ProtoContainer(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }
}
