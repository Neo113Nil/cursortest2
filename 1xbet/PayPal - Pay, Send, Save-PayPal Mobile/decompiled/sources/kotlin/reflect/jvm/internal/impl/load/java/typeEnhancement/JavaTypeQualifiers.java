package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class JavaTypeQualifiers {
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(null, null, false, false, 8, null);
    private final boolean Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    public JavaTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.getHighResolutionOutputSizeshNQ4ISI = nullabilityQualifier;
        this.getHighSpeedVideoFpsRangesFor = mutabilityQualifier;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = z2;
    }

    public /* synthetic */ JavaTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier getNullability() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier getMutability() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean getDefinitelyNotNull() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.getHighSpeedVideoSizes;
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers getNONE() {
            return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.getHighSpeedVideoFpsRanges;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", mutability=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", definitelyNotNull=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode = nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier = this.getHighSpeedVideoFpsRangesFor;
        return (((((hashCode * 31) + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == javaTypeQualifiers.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == javaTypeQualifiers.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap == javaTypeQualifiers.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == javaTypeQualifiers.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers copy(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers copy$default(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.getHighResolutionOutputSizeshNQ4ISI;
        }
        if ((i & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.getHighSpeedVideoFpsRangesFor;
        }
        if ((i & 4) != 0) {
            z = javaTypeQualifiers.Camera2StreamConfigurationMap;
        }
        if ((i & 8) != 0) {
            z2 = javaTypeQualifiers.getHighSpeedVideoSizes;
        }
        return javaTypeQualifiers.copy(nullabilityQualifier, mutabilityQualifier, z, z2);
    }
}
