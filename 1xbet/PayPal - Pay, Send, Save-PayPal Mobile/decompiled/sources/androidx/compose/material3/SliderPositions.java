package androidx.compose.material3;

@kotlin.Deprecated(message = "Not necessary with the introduction of Slider state")
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00058G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/material3/SliderPositions;", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "initialActiveRange", "", "initialTickFractions", "<init>", "(Lkotlin/ranges/ClosedFloatingPointRange;[F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "<set-?>", "activeRange$delegate", "Landroidx/compose/runtime/MutableState;", "getActiveRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "setActiveRange$material3", "(Lkotlin/ranges/ClosedFloatingPointRange;)V", "activeRange", "tickFractions$delegate", "getTickFractions", "()[F", "setTickFractions$material3", "([F)V", "tickFractions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderPositions {
    public static final int $stable = 0;

    /* renamed from: activeRange$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState activeRange;

    /* renamed from: tickFractions$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState tickFractions;

    public SliderPositions(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, float[] fArr) {
        this.activeRange = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(closedFloatingPointRange, null, 2, null);
        this.tickFractions = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }

    public /* synthetic */ SliderPositions(kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, float[] fArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange, (i & 2) != 0 ? new float[0] : fArr);
    }

    public final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getActiveRange() {
        return (kotlin.ranges.ClosedFloatingPointRange) this.activeRange.getValue();
    }

    public final void setActiveRange$material3(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange) {
        this.activeRange.setValue(closedFloatingPointRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions.getValue();
    }

    public final void setTickFractions$material3(float[] fArr) {
        this.tickFractions.setValue(fArr);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.SliderPositions)) {
            return false;
        }
        androidx.compose.material3.SliderPositions sliderPositions = (androidx.compose.material3.SliderPositions) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getActiveRange(), sliderPositions.getActiveRange()) && java.util.Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public final int hashCode() {
        return (getActiveRange().hashCode() * 31) + java.util.Arrays.hashCode(getTickFractions());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SliderPositions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
