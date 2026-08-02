package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* loaded from: classes5.dex */
public final class RawProjectionComputer extends kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer {
    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection computeProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureTypeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        if (!(erasureTypeAttributes instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes)) {
            return super.computeProjection(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes) erasureTypeAttributes;
        if (!javaTypeAttributes.isRaw()) {
            javaTypeAttributes = javaTypeAttributes.withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE);
        }
        int i = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer.WhenMappings.$EnumSwitchMapping$0[javaTypeAttributes.getFlexibility().ordinal()];
        if (i == 1) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlinType);
        }
        if (i != 2 && i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (!typeParameterDescriptor.getVariance().getAllowsOutPosition()) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType());
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = kotlinType.getConstructor().getParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
        if (!parameters.isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, kotlinType);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeProjection makeStarProjection = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
        kotlin.jvm.internal.Intrinsics.checkNotNull(makeStarProjection);
        return makeStarProjection;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
