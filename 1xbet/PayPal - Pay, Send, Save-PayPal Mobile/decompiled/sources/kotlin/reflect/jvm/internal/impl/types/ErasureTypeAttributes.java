package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class ErasureTypeAttributes {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap;
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.TypeUsage getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ErasureTypeAttributes(kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeUsage, "");
        this.getHighSpeedVideoFpsRanges = typeUsage;
        this.getHighResolutionOutputSizeshNQ4ISI = set;
        this.Camera2StreamConfigurationMap = simpleType;
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeUsage getHowThisTypeIsUsed() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        return this.Camera2StreamConfigurationMap;
    }

    public kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes withNewVisitedTypeParameter(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        java.util.Set of;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.TypeUsage howThisTypeIsUsed = getHowThisTypeIsUsed();
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> visitedTypeParameters = getVisitedTypeParameters();
        if (visitedTypeParameters == null || (of = kotlin.collections.SetsKt.plus(visitedTypeParameters, typeParameterDescriptor)) == null) {
            of = kotlin.collections.SetsKt.setOf(typeParameterDescriptor);
        }
        return new kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes(howThisTypeIsUsed, of, getDefaultType());
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes = (kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(erasureTypeAttributes.getDefaultType(), getDefaultType()) && erasureTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed();
    }

    public int hashCode() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getDefaultType();
        int hashCode = defaultType != null ? defaultType.hashCode() : 0;
        return hashCode + (hashCode * 31) + getHowThisTypeIsUsed().hashCode();
    }
}
