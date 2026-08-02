package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class JavaDefaultQualifiers {
    private final boolean Camera2StreamConfigurationMap;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> collection, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nullabilityQualifierWithMigrationStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        this.getHighSpeedVideoFpsRanges = nullabilityQualifierWithMigrationStatus;
        this.getHighResolutionOutputSizeshNQ4ISI = collection;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.Camera2StreamConfigurationMap = z3;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus getNullabilityQualifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> getQualifierApplicabilityTypes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ JavaDefaultQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, java.util.Collection collection, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifierWithMigrationStatus, collection, r4, (i & 8) == 0 ? false : z2, (i & 16) == 0 ? false : z3);
        boolean z4;
        if ((i & 4) != 0) {
            if (nullabilityQualifierWithMigrationStatus.getQualifier() != kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL) {
                z4 = false;
            }
            z = true;
        }
        z4 = z;
    }

    public final boolean getDefinitelyNotNull() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean getPreferQualifierOverSupertype() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", definitelyNotNull=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", preferQualifierOverSupertype=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes)) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers = (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, javaDefaultQualifiers.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, javaDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoSizes == javaDefaultQualifiers.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == javaDefaultQualifiers.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap == javaDefaultQualifiers.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers copy(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> collection, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nullabilityQualifierWithMigrationStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers(nullabilityQualifierWithMigrationStatus, collection, z, z2, z3);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers copy$default(kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, java.util.Collection collection, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.getHighSpeedVideoFpsRanges;
        }
        if ((i & 2) != 0) {
            collection = javaDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI;
        }
        java.util.Collection collection2 = collection;
        if ((i & 4) != 0) {
            z = javaDefaultQualifiers.getHighSpeedVideoSizes;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = javaDefaultQualifiers.getHighSpeedVideoFpsRangesFor;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = javaDefaultQualifiers.Camera2StreamConfigurationMap;
        }
        return javaDefaultQualifiers.copy(nullabilityQualifierWithMigrationStatus, collection2, z4, z5, z3);
    }
}
