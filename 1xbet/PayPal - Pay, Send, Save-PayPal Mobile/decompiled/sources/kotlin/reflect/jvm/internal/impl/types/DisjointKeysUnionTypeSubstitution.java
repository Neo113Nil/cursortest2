package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class DisjointKeysUnionTypeSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    public static final kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean isEmpty() {
        return false;
    }

    private DisjointKeysUnionTypeSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2) {
        this.Camera2StreamConfigurationMap = typeSubstitution;
        this.getHighSpeedVideoSizes = typeSubstitution2;
    }

    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitution, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitution2, "");
            return typeSubstitution.isEmpty() ? typeSubstitution2 : typeSubstitution2.isEmpty() ? typeSubstitution : new kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get = this.Camera2StreamConfigurationMap.mo23902get(kotlinType);
        return mo23902get == null ? this.getHighSpeedVideoSizes.mo23902get(kotlinType) : mo23902get;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType prepareTopLevelType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variance, "");
        return this.getHighSpeedVideoSizes.prepareTopLevelType(this.Camera2StreamConfigurationMap.prepareTopLevelType(kotlinType, variance), variance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean approximateCapturedTypes() {
        return this.Camera2StreamConfigurationMap.approximateCapturedTypes() || this.getHighSpeedVideoSizes.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean approximateContravariantCapturedTypes() {
        return this.Camera2StreamConfigurationMap.approximateContravariantCapturedTypes() || this.getHighSpeedVideoSizes.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations filterAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return this.getHighSpeedVideoSizes.filterAnnotations(this.Camera2StreamConfigurationMap.filterAnnotations(annotations));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2) {
        return Companion.create(typeSubstitution, typeSubstitution2);
    }

    public /* synthetic */ DisjointKeysUnionTypeSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeSubstitution, typeSubstitution2);
    }
}
