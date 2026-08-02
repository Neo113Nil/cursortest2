package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0012\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "p0", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ConstraintLayoutParentData implements androidx.compose.ui.layout.LayoutIdParentData {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainedLayoutReference getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.constraintlayout.compose.ConstrainScope, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutParentData(androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference, kotlin.jvm.functions.Function1<? super androidx.constraintlayout.compose.ConstrainScope, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = constrainedLayoutReference;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = constrainedLayoutReference.getId();
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final androidx.constraintlayout.compose.ConstrainedLayoutReference getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function1<androidx.constraintlayout.compose.ConstrainScope, kotlin.Unit> getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public final java.lang.Object getLayoutId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.constraintlayout.compose.ConstraintLayoutParentData)) {
            return false;
        }
        androidx.constraintlayout.compose.ConstraintLayoutParentData constraintLayoutParentData = (androidx.constraintlayout.compose.ConstraintLayoutParentData) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI.getId(), constraintLayoutParentData.getHighResolutionOutputSizeshNQ4ISI.getId()) && this.getHighSpeedVideoFpsRanges == constraintLayoutParentData.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.getId().hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }
}
