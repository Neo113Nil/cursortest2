package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AnnotationArgumentsRenderingPolicy {
    public static final kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy ALWAYS_PARENTHESIZED;
    public static final kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy NO_ARGUMENTS;
    public static final kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy UNLESS_EMPTY;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;

    private /* synthetic */ AnnotationArgumentsRenderingPolicy(java.lang.String str, int i, boolean z, int i2) {
        this(str, i, (i2 & 1) != 0 ? false : z, false);
    }

    private AnnotationArgumentsRenderingPolicy(java.lang.String str, int i, boolean z, boolean z2) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = new kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, (boolean) (0 == true ? 1 : 0), 3);
        NO_ARGUMENTS = annotationArgumentsRenderingPolicy;
        kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy2 = new kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, (boolean) (1 == true ? 1 : 0), 2);
        UNLESS_EMPTY = annotationArgumentsRenderingPolicy2;
        kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy3 = new kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true);
        ALWAYS_PARENTHESIZED = annotationArgumentsRenderingPolicy3;
        kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] annotationArgumentsRenderingPolicyArr = {annotationArgumentsRenderingPolicy, annotationArgumentsRenderingPolicy2, annotationArgumentsRenderingPolicy3};
        getHighSpeedVideoFpsRanges = annotationArgumentsRenderingPolicyArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(annotationArgumentsRenderingPolicyArr);
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] values() {
        return (kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.class, str);
    }
}
