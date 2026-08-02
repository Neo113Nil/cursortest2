package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class JavaTypeEnhancementState {
    public static final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState.Companion(null);
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings jsr305Settings, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.FqName, ? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsr305Settings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = jsr305Settings;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRanges = jsr305Settings.isDisabled() || function1.invoke(kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings getJsr305() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> getGetReportLevelForAnnotation() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState getDefault(final kotlin.KotlinVersion kotlinVersion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinVersion, "");
            return new kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState(kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings(kotlinVersion), new kotlin.jvm.functions.Function1(kotlinVersion) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState$Companion$$Lambda$0
                private final kotlin.KotlinVersion getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState.Companion.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.name.FqName) obj);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlinVersion;
                }
            });
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getHighResolutionOutputSizeshNQ4ISI(kotlin.KotlinVersion kotlinVersion, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
            return kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(fqName, kotlinVersion);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JavaTypeEnhancementState(jsr305=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getReportLevelForAnnotation=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }
}
