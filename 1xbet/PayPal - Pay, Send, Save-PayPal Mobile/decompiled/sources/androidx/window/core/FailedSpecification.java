package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00028\u00008\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u001f8\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010 "}, d2 = {"Landroidx/window/core/FailedSpecification;", "", "T", "Landroidx/window/core/SpecificationComputer;", "p0", "", "p1", "p2", "Landroidx/window/core/Logger;", "p3", "Landroidx/window/core/VerificationMode;", "p4", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroidx/window/core/Logger;Landroidx/window/core/VerificationMode;)V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "require", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/window/core/SpecificationComputer;", "compute", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Landroidx/window/core/Logger;", "getHighSpeedVideoSizesFor", "Landroidx/window/core/VerificationMode;", "Landroidx/window/core/WindowStrictModeException;", "Landroidx/window/core/WindowStrictModeException;", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FailedSpecification<T> extends androidx.window.core.SpecificationComputer<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.window.core.Logger getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final T Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.window.core.WindowStrictModeException getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.window.core.VerificationMode getHighSpeedVideoFpsRangesFor;

    public FailedSpecification(T t, java.lang.String str, java.lang.String str2, androidx.window.core.Logger logger, androidx.window.core.VerificationMode verificationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationMode, "");
        this.Camera2StreamConfigurationMap = t;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoSizes = logger;
        this.getHighSpeedVideoFpsRangesFor = verificationMode;
        androidx.window.core.WindowStrictModeException windowStrictModeException = new androidx.window.core.WindowStrictModeException(createMessage(t, str2));
        java.lang.StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        windowStrictModeException.setStackTrace((java.lang.StackTraceElement[]) kotlin.collections.ArraysKt.drop(stackTrace, 2).toArray(new java.lang.StackTraceElement[0]));
        this.getOutputFormats = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    public final androidx.window.core.SpecificationComputer<T> require(java.lang.String p0, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        return this;
    }

    @Override // androidx.window.core.SpecificationComputer
    public final T compute() {
        int i = androidx.window.core.FailedSpecification.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRangesFor.ordinal()];
        if (i == 1) {
            throw this.getOutputFormats;
        }
        if (i == 2) {
            this.getHighSpeedVideoSizes.debug(this.getHighResolutionOutputSizeshNQ4ISI, createMessage(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges));
            return null;
        }
        if (i == 3) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.window.core.VerificationMode.values().length];
            try {
                iArr[androidx.window.core.VerificationMode.STRICT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.window.core.VerificationMode.LOG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.window.core.VerificationMode.QUIET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
