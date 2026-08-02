package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class ErasureProjectionComputer {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeProjection computeProjection$default(kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer erasureProjectionComputer, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i & 8) != 0) {
            kotlinType = typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor, erasureTypeAttributes);
        }
        return erasureProjectionComputer.computeProjection(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeProjection computeProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureTypeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, kotlinType);
    }
}
