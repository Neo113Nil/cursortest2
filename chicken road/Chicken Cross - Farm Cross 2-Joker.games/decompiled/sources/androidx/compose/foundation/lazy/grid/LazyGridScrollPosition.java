package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyGridScrollPosition.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J#\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0005J%\u0010\u0019\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "initialIndex", "", "initialScrollOffset", "(II)V", "hadFirstNotEmptyLayout", "", "<set-?>", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "index", "getIndex-VZbfaAc", "()I", "setIndex-YGsSkvE", "(I)V", "index$delegate", "Landroidx/compose/runtime/MutableState;", "lastKnownFirstItemKey", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "requestPosition", "", "requestPosition-yO3Fmg4", "update", "update-yO3Fmg4", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", k.M, "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridScrollPosition {
    private static final Companion Companion = new Companion(null);
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: index$delegate, reason: from kotlin metadata */
    private final MutableState index;
    private Object lastKnownFirstItemKey;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    private final MutableState scrollOffset;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LazyGridScrollPosition() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public LazyGridScrollPosition(int i, int i2) {
        this.index = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ItemIndex.m563boximpl(ItemIndex.m565constructorimpl(i)), null, 2, null);
        this.scrollOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), null, 2, null);
    }

    public /* synthetic */ LazyGridScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    /* renamed from: setIndex-YGsSkvE, reason: not valid java name */
    private final void m601setIndexYGsSkvE(int i) {
        this.index.setValue(ItemIndex.m563boximpl(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getIndex-VZbfaAc, reason: not valid java name */
    public final int m603getIndexVZbfaAc() {
        return ((ItemIndex) this.index.getValue()).m575unboximpl();
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getScrollOffset() {
        return ((Number) this.scrollOffset.getValue()).intValue();
    }

    public final void updateFromMeasureResult(LazyGridMeasureResult measureResult) {
        LazyMeasuredItem[] items;
        LazyMeasuredItem lazyMeasuredItem;
        LazyMeasuredItem[] items2;
        LazyMeasuredItem lazyMeasuredItem2;
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        LazyMeasuredLine firstVisibleLine = measureResult.getFirstVisibleLine();
        this.lastKnownFirstItemKey = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (lazyMeasuredItem2 = (LazyMeasuredItem) ArraysKt.firstOrNull(items2)) == null) ? null : lazyMeasuredItem2.getKey();
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = measureResult.getFirstVisibleLineScrollOffset();
            if (firstVisibleLineScrollOffset < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')').toString());
            }
            Snapshot createNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    LazyMeasuredLine firstVisibleLine2 = measureResult.getFirstVisibleLine();
                    m602updateyO3Fmg4(ItemIndex.m565constructorimpl((firstVisibleLine2 == null || (items = firstVisibleLine2.getItems()) == null || (lazyMeasuredItem = (LazyMeasuredItem) ArraysKt.firstOrNull(items)) == null) ? 0 : lazyMeasuredItem.getIndex()), firstVisibleLineScrollOffset);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    /* renamed from: requestPosition-yO3Fmg4, reason: not valid java name */
    public final void m604requestPositionyO3Fmg4(int index, int scrollOffset) {
        m602updateyO3Fmg4(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved(LazyGridItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Snapshot createNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                m602updateyO3Fmg4(Companion.m606findLazyGridIndexByKeyCw5TLFk(this.lastKnownFirstItemKey, m603getIndexVZbfaAc(), itemProvider), getScrollOffset());
                Unit unit = Unit.INSTANCE;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* renamed from: update-yO3Fmg4, reason: not valid java name */
    private final void m602updateyO3Fmg4(int index, int scrollOffset) {
        if (index < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + index + ')').toString());
        }
        if (!ItemIndex.m568equalsimpl0(index, m603getIndexVZbfaAc())) {
            m601setIndexYGsSkvE(index);
        }
        if (scrollOffset != getScrollOffset()) {
            setScrollOffset(scrollOffset);
        }
    }

    /* compiled from: LazyGridScrollPosition.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition$Companion;", "", "()V", "findLazyGridIndexByKey", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "key", "lastKnownIndex", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "findLazyGridIndexByKey-Cw5TLFk", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/grid/LazyGridItemProvider;)I", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: findLazyGridIndexByKey-Cw5TLFk, reason: not valid java name */
        public final int m606findLazyGridIndexByKeyCw5TLFk(Object key, int lastKnownIndex, LazyGridItemProvider itemProvider) {
            Integer num;
            return key == null ? lastKnownIndex : ((lastKnownIndex >= itemProvider.getItemCount() || !Intrinsics.areEqual(key, itemProvider.getKey(lastKnownIndex))) && (num = itemProvider.getKeyToIndexMap().get(key)) != null) ? ItemIndex.m565constructorimpl(num.intValue()) : lastKnownIndex;
        }
    }
}
