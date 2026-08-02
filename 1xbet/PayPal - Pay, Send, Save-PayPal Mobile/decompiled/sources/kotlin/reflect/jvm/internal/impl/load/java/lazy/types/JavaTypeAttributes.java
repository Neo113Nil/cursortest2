package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* loaded from: classes5.dex */
public final class JavaTypeAttributes extends kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes {
    private final kotlin.reflect.jvm.internal.impl.types.TypeUsage Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getOutputFormats;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeAttributes(kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        super(typeUsage, set, simpleType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeUsage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeFlexibility, "");
        this.Camera2StreamConfigurationMap = typeUsage;
        this.getHighSpeedVideoFpsRanges = javaTypeFlexibility;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getOutputFormats = set;
        this.getHighSpeedVideoFpsRangesFor = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final kotlin.reflect.jvm.internal.impl.types.TypeUsage getHowThisTypeIsUsed() {
        return this.Camera2StreamConfigurationMap;
    }

    public /* synthetic */ JavaTypeAttributes(kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, java.util.Set set, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : simpleType);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility getFlexibility() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isRaw() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isForAnnotationParameter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.getOutputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeFlexibility, "");
        return copy$default(this, null, javaTypeFlexibility, false, false, null, null, 61, null);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes markIsRaw(boolean z) {
        return copy$default(this, null, null, z, false, null, null, 59, null);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes withDefaultType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        return copy$default(this, null, null, false, false, null, simpleType, 31, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes withNewVisitedTypeParameter(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        return copy$default(this, null, null, false, false, getVisitedTypeParameters() != null ? kotlin.collections.SetsKt.plus(getVisitedTypeParameters(), typeParameterDescriptor) : kotlin.collections.SetsKt.setOf(typeParameterDescriptor), null, 47, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(javaTypeAttributes.getDefaultType(), getDefaultType()) && javaTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed() && javaTypeAttributes.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoFpsRanges && javaTypeAttributes.getHighSpeedVideoSizes == this.getHighSpeedVideoSizes && javaTypeAttributes.getHighResolutionOutputSizeshNQ4ISI == this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final int hashCode() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getDefaultType();
        int hashCode = defaultType != null ? defaultType.hashCode() : 0;
        int hashCode2 = hashCode + (hashCode * 31) + getHowThisTypeIsUsed().hashCode();
        int hashCode3 = hashCode2 + (hashCode2 * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
        int i = hashCode3 + (hashCode3 * 31) + (this.getHighSpeedVideoSizes ? 1 : 0);
        return i + (i * 31) + (this.getHighResolutionOutputSizeshNQ4ISI ? 1 : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", flexibility=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", isRaw=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", visitedTypeParameters=");
        sb.append(this.getOutputFormats);
        sb.append(", defaultType=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes copy(kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeUsage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeFlexibility, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes(typeUsage, javaTypeFlexibility, z, z2, set, simpleType);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes copy$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, java.util.Set set, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.Camera2StreamConfigurationMap;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.getHighSpeedVideoFpsRanges;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i & 4) != 0) {
            z = javaTypeAttributes.getHighSpeedVideoSizes;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = javaTypeAttributes.getHighResolutionOutputSizeshNQ4ISI;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            set = javaTypeAttributes.getOutputFormats;
        }
        java.util.Set set2 = set;
        if ((i & 32) != 0) {
            simpleType = javaTypeAttributes.getHighSpeedVideoFpsRangesFor;
        }
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility2, z3, z4, set2, simpleType);
    }
}
