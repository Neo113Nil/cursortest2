package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u000e2\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001b\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/foundation/WrappedOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "", "p0", "p1", "p2", "<init>", "(ZZLandroidx/compose/foundation/OverscrollEffect;)V", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "Lkotlin/Function1;", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToFling", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/OverscrollEffect;", "isInProgress", "()Z", "Landroidx/compose/ui/node/DelegatableNode;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WrappedOverscrollEffect implements androidx.compose.foundation.OverscrollEffect {
    private final androidx.compose.foundation.OverscrollEffect getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.node.DelegatableNode getHighSpeedVideoSizes;

    public WrappedOverscrollEffect(boolean z, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = overscrollEffect;
        this.getHighSpeedVideoSizes = z ? overscrollEffect.getGetHighSpeedVideoSizes() : new androidx.compose.ui.Modifier.Node() { // from class: androidx.compose.foundation.WrappedOverscrollEffect$node$1
        };
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public final long mo1266applyToScrollRhakbz0(long p0, int p1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> p2) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return this.getHighResolutionOutputSizeshNQ4ISI.mo1266applyToScrollRhakbz0(p0, p1, p2);
        }
        return p2.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(p0)).m5762unboximpl();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public final java.lang.Object mo1265applyToFlingBMRW4eQ(long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            java.lang.Object mo1265applyToFlingBMRW4eQ = this.getHighResolutionOutputSizeshNQ4ISI.mo1265applyToFlingBMRW4eQ(j, function2, continuation);
            return mo1265applyToFlingBMRW4eQ == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo1265applyToFlingBMRW4eQ : kotlin.Unit.INSTANCE;
        }
        java.lang.Object invoke = function2.invoke(androidx.compose.ui.unit.Velocity.m8830boximpl(j), continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean isInProgress() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isInProgress();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: getNode, reason: from getter */
    public final androidx.compose.ui.node.DelegatableNode getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.WrappedOverscrollEffect)) {
            return false;
        }
        androidx.compose.foundation.WrappedOverscrollEffect wrappedOverscrollEffect = (androidx.compose.foundation.WrappedOverscrollEffect) p0;
        return this.Camera2StreamConfigurationMap == wrappedOverscrollEffect.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == wrappedOverscrollEffect.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, wrappedOverscrollEffect.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }
}
