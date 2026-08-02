package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class ClassLiteralValue {
    private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;

    public ClassLiteralValue(kotlin.reflect.jvm.internal.impl.name.ClassId classId, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        this.getHighResolutionOutputSizeshNQ4ISI = classId;
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final int getArrayNestedness() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.getHighSpeedVideoFpsRanges;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        int i3 = this.getHighSpeedVideoFpsRanges;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, classLiteralValue.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRanges == classLiteralValue.getHighSpeedVideoFpsRanges;
    }

    public final int component2() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId component1() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
