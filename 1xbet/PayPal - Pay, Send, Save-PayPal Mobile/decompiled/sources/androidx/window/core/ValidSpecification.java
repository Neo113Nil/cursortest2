package androidx.window.core;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00028\u00008\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/window/core/ValidSpecification;", "", "T", "Landroidx/window/core/SpecificationComputer;", "p0", "", "p1", "Landroidx/window/core/VerificationMode;", "p2", "Landroidx/window/core/Logger;", "p3", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/VerificationMode;Landroidx/window/core/Logger;)V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "require", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/window/core/SpecificationComputer;", "compute", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/window/core/VerificationMode;", "getHighSpeedVideoFpsRanges", "Landroidx/window/core/Logger;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ValidSpecification<T> extends androidx.window.core.SpecificationComputer<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.window.core.VerificationMode getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final T Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.window.core.Logger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    public ValidSpecification(T t, java.lang.String str, androidx.window.core.VerificationMode verificationMode, androidx.window.core.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = verificationMode;
        this.getHighResolutionOutputSizeshNQ4ISI = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    public final androidx.window.core.SpecificationComputer<T> require(java.lang.String p0, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (p1.invoke(this.Camera2StreamConfigurationMap).booleanValue()) {
            return this;
        }
        return new androidx.window.core.FailedSpecification(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, p0, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.window.core.SpecificationComputer
    public final T compute() {
        return this.Camera2StreamConfigurationMap;
    }
}
