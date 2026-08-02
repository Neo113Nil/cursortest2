package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class StarProjectionImpl extends kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase {
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getHighSpeedVideoFpsRanges;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final boolean isStarProjection() {
        return true;
    }

    public StarProjectionImpl(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        this.getHighSpeedVideoFpsRanges = typeParameterDescriptor;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.types.KotlinType starProjectionType;
                starProjectionType = kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt.starProjectionType(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges);
                return starProjectionType;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final kotlin.reflect.jvm.internal.impl.types.Variance getProjectionKind() {
        return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return (kotlin.reflect.jvm.internal.impl.types.KotlinType) this.Camera2StreamConfigurationMap.getValue();
    }
}
