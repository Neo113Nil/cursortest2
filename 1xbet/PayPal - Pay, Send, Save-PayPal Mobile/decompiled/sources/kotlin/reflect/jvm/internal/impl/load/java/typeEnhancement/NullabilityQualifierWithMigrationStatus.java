package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class NullabilityQualifierWithMigrationStatus {
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier getHighSpeedVideoFpsRangesFor;

    public NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nullabilityQualifier, "");
        this.getHighSpeedVideoFpsRangesFor = nullabilityQualifier;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier getQualifier() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isForWarningOnly() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", isForWarningOnly=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus) obj;
        return this.getHighSpeedVideoFpsRangesFor == nullabilityQualifierWithMigrationStatus.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == nullabilityQualifierWithMigrationStatus.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus copy(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nullabilityQualifier, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus copy$default(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.getHighSpeedVideoFpsRangesFor;
        }
        if ((i & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus.getHighSpeedVideoFpsRanges;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z);
    }
}
