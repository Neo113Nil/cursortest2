package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\b\u001a$\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R6\u0010\u0015\u001a$\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/animation/SizeTransformImpl;", "Landroidx/compose/animation/SizeTransform;", "", "p0", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "p1", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "createAnimationSpec-TemP2vQ", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;", "createAnimationSpec", "getHighSpeedVideoSizes", "Z", "getClip", "()Z", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeTransformImpl implements androidx.compose.animation.SizeTransform {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeTransformImpl(boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.IntSize, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> function2) {
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: getClip, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> mo1156createAnimationSpecTemP2vQ(long p0, long p1) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(p0), androidx.compose.ui.unit.IntSize.m8764boximpl(p1));
    }
}
