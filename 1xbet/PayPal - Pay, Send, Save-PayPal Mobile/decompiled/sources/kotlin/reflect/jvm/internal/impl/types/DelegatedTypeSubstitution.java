package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class DelegatedTypeSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution getHighSpeedVideoFpsRanges;

    public DelegatedTypeSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitution, "");
        this.getHighSpeedVideoFpsRanges = typeSubstitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return this.getHighSpeedVideoFpsRanges.mo23902get(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public kotlin.reflect.jvm.internal.impl.types.KotlinType prepareTopLevelType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variance, "");
        return this.getHighSpeedVideoFpsRanges.prepareTopLevelType(kotlinType, variance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.getHighSpeedVideoFpsRanges.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.getHighSpeedVideoFpsRanges.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations filterAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return this.getHighSpeedVideoFpsRanges.filterAnnotations(annotations);
    }
}
