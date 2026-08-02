package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "", "", "p0", "<init>", "(I)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue$foundation", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan.Companion INSTANCE = new androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan.Companion(null);
    private static final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan FullLine = new androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan(0);
    private static final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan SingleLane = new androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan(1);
    private final int value;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "FullLine", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "getFullLine", "()Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "SingleLane", "getSingleLane"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan getFullLine() {
            return androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan.FullLine;
        }

        public final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan getSingleLane() {
            return androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan.SingleLane;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private StaggeredGridItemSpan(int i) {
        this.value = i;
    }

    /* renamed from: getValue$foundation, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
