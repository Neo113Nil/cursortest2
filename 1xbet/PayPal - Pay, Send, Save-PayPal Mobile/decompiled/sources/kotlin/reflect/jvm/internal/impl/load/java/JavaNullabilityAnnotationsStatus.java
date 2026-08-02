package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class JavaNullabilityAnnotationsStatus {
    public static final kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT, null, null, 6, null);
    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.KotlinVersion getHighSpeedVideoFpsRanges;

    public JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel, kotlin.KotlinVersion kotlinVersion, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportLevel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportLevel2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = reportLevel;
        this.getHighSpeedVideoFpsRanges = kotlinVersion;
        this.Camera2StreamConfigurationMap = reportLevel2;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getReportLevelBefore() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel, kotlin.KotlinVersion kotlinVersion, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new kotlin.KotlinVersion(1, 0) : kotlinVersion, (i & 4) != 0 ? reportLevel : reportLevel2);
    }

    public final kotlin.KotlinVersion getSinceVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getReportLevelAfter() {
        return this.Camera2StreamConfigurationMap;
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus getDEFAULT() {
            return kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.getHighSpeedVideoFpsRangesFor;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JavaNullabilityAnnotationsStatus(reportLevelBefore=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", sinceVersion=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", reportLevelAfter=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        kotlin.KotlinVersion kotlinVersion = this.getHighSpeedVideoFpsRanges;
        return (((hashCode * 31) + (kotlinVersion == null ? 0 : kotlinVersion.hashCode())) * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == javaNullabilityAnnotationsStatus.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, javaNullabilityAnnotationsStatus.getHighSpeedVideoFpsRanges) && this.Camera2StreamConfigurationMap == javaNullabilityAnnotationsStatus.Camera2StreamConfigurationMap;
    }
}
