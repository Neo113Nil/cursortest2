package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class JavaNullabilityAnnotationSettingsKt {
    private static final kotlin.reflect.jvm.internal.impl.name.FqName Camera2StreamConfigurationMap;
    private static final kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates<kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus> getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus getHighSpeedVideoFpsRangesFor;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoSizes;
    private static final java.lang.String getInputFormats;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName[] getInputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getOutputMinFrameDuration;

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.nullness");
        getHighSpeedVideoFpsRanges = fqName;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.annotations");
        getHighSpeedVideoSizes = fqName2;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = new kotlin.reflect.jvm.internal.impl.name.FqName("io.reactivex.rxjava3.annotations");
        getOutputMinFrameDuration = fqName3;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.compatqual");
        Camera2StreamConfigurationMap = fqName4;
        java.lang.String asString = fqName3.asString();
        getInputFormats = asString;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(asString);
        sb.append(".Nullable");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName5 = new kotlin.reflect.jvm.internal.impl.name.FqName(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(asString);
        sb2.append(".NonNull");
        getInputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.name.FqName[]{fqName5, new kotlin.reflect.jvm.internal.impl.name.FqName(sb2.toString())};
        getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("org.jetbrains.annotations"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("android.support.annotation"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("android.annotation"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("com.android.annotations"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("org.eclipse.jdt.annotation"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.qual"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(fqName4, kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("io.reactivex.annotations"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.RecentlyNullable"), new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN, null, null, 4, null)), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.RecentlyNonNull"), new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN, null, null, 4, null)), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("lombok"), kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus.Companion.getDEFAULT()), kotlin.TuplesKt.to(fqName, new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN, new kotlin.KotlinVersion(2, 1), kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT)), kotlin.TuplesKt.to(fqName2, new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN, new kotlin.KotlinVersion(2, 1), kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT)), kotlin.TuplesKt.to(fqName3, new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN, new kotlin.KotlinVersion(1, 8), kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT)), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("jakarta.annotation"), new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN, new kotlin.KotlinVersion(2, 4), kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT))));
        getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN, null, null, 4, null);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return getHighSpeedVideoSizes;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName[] getRXJAVA3_ANNOTATIONS() {
        return getInputSizeshNQ4ISI;
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings getDefaultJsr305Settings(kotlin.KotlinVersion kotlinVersion) {
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevelBefore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinVersion, "");
        kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = getHighSpeedVideoFpsRangesFor;
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null && javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(kotlinVersion) <= 0) {
            reportLevelBefore = javaNullabilityAnnotationsStatus.getReportLevelAfter();
        } else {
            reportLevelBefore = javaNullabilityAnnotationsStatus.getReportLevelBefore();
        }
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel = reportLevelBefore;
        return new kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings(reportLevel, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevel), null, 4, null);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportLevel, "");
        if (reportLevel == kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN) {
            return null;
        }
        return reportLevel;
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getDefaultReportLevelForAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.KotlinVersion kotlinVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinVersion, "");
        return getReportLevelForAnnotation(fqName, kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates.Companion.getEMPTY(), kotlinVersion);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getReportLevelForAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates<? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> nullabilityAnnotationStates, kotlin.KotlinVersion kotlinVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nullabilityAnnotationStates, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinVersion, "");
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel = nullabilityAnnotationStates.get(fqName);
        if (reportLevel != null) {
            return reportLevel;
        }
        kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = getHighResolutionOutputSizeshNQ4ISI.get(fqName);
        if (javaNullabilityAnnotationsStatus == null) {
            return kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE;
        }
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null && javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(kotlinVersion) <= 0) {
            return javaNullabilityAnnotationsStatus.getReportLevelAfter();
        }
        return javaNullabilityAnnotationsStatus.getReportLevelBefore();
    }
}
