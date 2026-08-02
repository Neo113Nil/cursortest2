package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "", "<init>", "()V", "", "delta", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "updateScrollDeltaForApproach$foundation", "(FLandroidx/compose/ui/unit/Density;Lkotlinx/coroutines/CoroutineScope;)V", "stop$foundation", "getScrollDeltaBetweenPasses$foundation", "()F", "scrollDeltaBetweenPasses", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "getJob$foundation", "()Lkotlinx/coroutines/Job;", "setJob$foundation", "(Lkotlinx/coroutines/Job;)V", "", "isActive$foundation", "()Z", "isActive", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/AnimationState;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutScrollDeltaBetweenPasses {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizes;
    private kotlinx.coroutines.Job job;

    public LazyLayoutScrollDeltaBetweenPasses() {
        androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> AnimationState;
        androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        AnimationState = androidx.compose.animation.core.AnimationStateKt.AnimationState(vectorConverter, valueOf, valueOf, (r19 & 8) != 0 ? Long.MIN_VALUE : 0L, (r19 & 16) != 0 ? Long.MIN_VALUE : 0L, (r19 & 32) != 0 ? false : false);
        this.getHighSpeedVideoSizes = AnimationState;
    }

    public final float getScrollDeltaBetweenPasses$foundation() {
        return this.getHighSpeedVideoSizes.getValue().floatValue();
    }

    /* renamed from: getJob$foundation, reason: from getter */
    public final kotlinx.coroutines.Job getJob() {
        return this.job;
    }

    public final void setJob$foundation(kotlinx.coroutines.Job job) {
        this.job = job;
    }

    public final boolean isActive$foundation() {
        return !(this.getHighSpeedVideoSizes.getValue().floatValue() == 0.0f);
    }

    public final void updateScrollDeltaForApproach$foundation(float delta, androidx.compose.ui.unit.Density density, kotlinx.coroutines.CoroutineScope coroutineScope) {
        float f;
        kotlinx.coroutines.Job launch$default;
        f = androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPassesKt.getHighSpeedVideoFpsRanges;
        if (delta <= density.mo1418toPx0680j_4(f)) {
            return;
        }
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            float floatValue = this.getHighSpeedVideoSizes.getValue().floatValue();
            kotlinx.coroutines.Job job = this.job;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            if (this.getHighSpeedVideoSizes.getIsRunning()) {
                this.getHighSpeedVideoSizes = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) this.getHighSpeedVideoSizes, floatValue - delta, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
            } else {
                this.getHighSpeedVideoSizes = new androidx.compose.animation.core.AnimationState<>(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), java.lang.Float.valueOf(-delta), null, 0L, 0L, false, 60, null);
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3, null);
            this.job = launch$default;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void stop$foundation() {
        kotlinx.coroutines.Job job = this.job;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighSpeedVideoSizes = new androidx.compose.animation.core.AnimationState<>(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), java.lang.Float.valueOf(0.0f), null, 0L, 0L, false, 60, null);
    }
}
