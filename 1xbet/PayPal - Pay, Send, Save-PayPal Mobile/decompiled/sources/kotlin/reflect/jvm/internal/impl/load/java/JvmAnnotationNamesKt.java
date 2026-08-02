package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class JvmAnnotationNamesKt {
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> ArtificialStackFrames;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName Camera2StreamConfigurationMap;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> CoroutineDebuggingKt;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> accessartificialFrame;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.FqName> coroutineBoundary;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName coroutineCreation;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRangesFor;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoSizes;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoSizesFor;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getInputFormats;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getInputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getOutputFormats;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getOutputMinFrameDuration;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getOutputMinFrameDurationlomOqCM;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getOutputSizes;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getOutputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getOutputStallDuration;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getOutputStallDurationlomOqCM;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getValidOutputFormatsForInputhNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName isOutputSupportedFor;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> isOutputSupportedForhNQ4ISI;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> toString;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName unwrapAs;

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.nullness.Nullable");
        isOutputSupportedFor = fqName;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.nullness.NullMarked");
        getValidOutputFormatsForInputhNQ4ISI = fqName2;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.nullness.NullnessUnspecified");
        unwrapAs = fqName3;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.annotations.NonNull");
        getOutputMinFrameDurationlomOqCM = fqName4;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName5 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.annotations.Nullable");
        getOutputSizeshNQ4ISI = fqName5;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName6 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.annotations.NullMarked");
        getOutputSizes = fqName6;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName7 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.annotations.NullnessUnspecified");
        getOutputStallDurationlomOqCM = fqName7;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName8 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jspecify.annotations.NullUnmarked");
        getOutputStallDuration = fqName8;
        getOutputFormats = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.meta.TypeQualifier");
        getInputFormats = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.meta.TypeQualifierNickname");
        getOutputMinFrameDuration = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.meta.TypeQualifierDefault");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName9 = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.Nonnull");
        getHighSpeedVideoSizes = fqName9;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName10 = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.Nullable");
        getHighSpeedVideoFpsRangesFor = fqName10;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName11 = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.CheckForNull");
        Camera2StreamConfigurationMap = fqName11;
        getHighSpeedVideoSizesFor = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.ParametersAreNonnullByDefault");
        getInputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.ParametersAreNullableByDefault");
        getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{fqName9, fqName11});
        kotlin.reflect.jvm.internal.impl.name.FqName fqName12 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName12, "");
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{fqName12, fqName4, new kotlin.reflect.jvm.internal.impl.name.FqName("android.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.RecentlyNonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("android.support.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("com.android.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.qual.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("io.reactivex.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("io.reactivex.rxjava3.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.eclipse.jdt.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("lombok.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("jakarta.annotation.Nonnull")});
        isOutputSupportedForhNQ4ISI = of;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName13 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName13, "");
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> of2 = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{fqName13, fqName, fqName5, fqName10, fqName11, new kotlin.reflect.jvm.internal.impl.name.FqName("android.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.RecentlyNullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("android.support.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("com.android.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.qual.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("io.reactivex.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("io.reactivex.rxjava3.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.eclipse.jdt.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("jakarta.annotation.Nullable")});
        CoroutineDebuggingKt = of2;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{fqName3, fqName7});
        ArtificialStackFrames = kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) new java.util.LinkedHashSet(), (java.lang.Iterable) of), (java.lang.Iterable) of2), fqName9), fqName2), fqName6), fqName8);
        accessartificialFrame = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.READONLY_ANNOTATION});
        toString = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.MUTABLE_ANNOTATION});
        coroutineBoundary = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.TARGET_ANNOTATION, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.target), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.RETENTION_ANNOTATION, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.retention), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEPRECATED_ANNOTATION, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.deprecated), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DOCUMENTED_ANNOTATION, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mustBeDocumented));
        coroutineCreation = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.annotations.jvm.UnderMigration");
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return getValidOutputFormatsForInputhNQ4ISI;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return getOutputSizes;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME() {
        return getOutputStallDuration;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME() {
        return getOutputFormats;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME() {
        return getInputFormats;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME() {
        return getOutputMinFrameDuration;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJAVAX_NONNULL_ANNOTATION_FQ_NAME() {
        return getHighSpeedVideoSizes;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return getHighSpeedVideoSizesFor;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return getInputSizeshNQ4ISI;
    }

    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getNOT_NULL_ANNOTATIONS() {
        return isOutputSupportedForhNQ4ISI;
    }

    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getNULLABLE_ANNOTATIONS() {
        return CoroutineDebuggingKt;
    }

    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getFORCE_FLEXIBILITY_ANNOTATIONS() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getREAD_ONLY_ANNOTATIONS() {
        return accessartificialFrame;
    }

    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getMUTABLE_ANNOTATIONS() {
        return toString;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getUNDER_MIGRATION_ANNOTATION_FQ_NAME() {
        return coroutineCreation;
    }
}
