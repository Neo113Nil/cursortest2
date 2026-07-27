package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyGridState.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002\u0089\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J#\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00032\b\b\u0002\u0010l\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010mJ\u0015\u0010n\u001a\u00020j2\u0006\u0010o\u001a\u00020pH\u0000¢\u0006\u0002\bqJ\u0010\u0010r\u001a\u00020^2\u0006\u0010s\u001a\u00020^H\u0016J\u0010\u0010t\u001a\u00020j2\u0006\u0010s\u001a\u00020^H\u0002J\u0015\u0010u\u001a\u00020^2\u0006\u0010v\u001a\u00020^H\u0000¢\u0006\u0002\bwJD\u0010x\u001a\u00020j2\u0006\u0010y\u001a\u00020z2(\u0010{\u001a$\b\u0001\u0012\u0004\u0012\u00020}\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0~\u0012\u0006\u0012\u0004\u0018\u00010\u007f0|¢\u0006\u0003\b\u0080\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0081\u0001J$\u0010\u0082\u0001\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00032\b\b\u0002\u0010l\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010mJ\u001f\u0010\u0083\u0001\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00032\u0006\u0010l\u001a\u00020\u0003H\u0000¢\u0006\u0003\b\u0084\u0001J\u0019\u0010\u0085\u0001\u001a\u00020j2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0000¢\u0006\u0003\b\u0088\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u000fR+\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020-01X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001cR/\u00106\u001a\u0004\u0018\u0001052\b\u0010\f\u001a\u0004\u0018\u0001058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001a\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0088\u0001\u0010D\u001a/\u0012\u0013\u0012\u00110=¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020C0B0A0<23\u0010\f\u001a/\u0012\u0013\u0012\u00110=¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020C0B0A0<8@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bI\u0010\u001a\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020KX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u000f\"\u0004\bP\u0010*R/\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010\f\u001a\u0004\u0018\u00010Q8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010\u001a\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020YX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u000e\u0010\\\u001a\u00020]X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010_\u001a\u00020^2\u0006\u0010\f\u001a\u00020^@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u000e\u0010b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010c\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010\u001a\u001a\u0004\bd\u0010\u001c\"\u0004\be\u0010fR\u000e\u0010h\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008a\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "firstVisibleItemIndex", "", "firstVisibleItemScrollOffset", "(II)V", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "canScrollBackward", "", "<set-?>", "canScrollForward", "getCanScrollForward$foundation_release", "()Z", "currentLinePrefetchHandles", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/ui/unit/Density;", "density", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density$delegate", "Landroidx/compose/runtime/MutableState;", "getFirstVisibleItemIndex", "()I", "getFirstVisibleItemScrollOffset", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "(Z)V", "isVertical$delegate", "layoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "lineToPrefetch", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "setPlacementAnimator$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;)V", "placementAnimator$delegate", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "Lkotlin/ParameterName;", "name", "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever", "getPrefetchInfoRetriever$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setPrefetchInfoRetriever$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever$delegate", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement$delegate", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "scrollToBeConsumed", "getScrollToBeConsumed$foundation_release", "()F", "scrollableState", "slotsPerLine", "getSlotsPerLine$foundation_release", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine$delegate", "wasScrollingForward", "animateScrollToItem", "", "index", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "applyMeasureResult$foundation_release", "dispatchRawDelta", "delta", "notifyPrefetch", "onScroll", "distance", "onScroll$foundation_release", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToItem", "snapToItemIndexInternal", "snapToItemIndexInternal$foundation_release", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", k.M, "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<Integer> invoke(SaverScope listSaver, LazyGridState it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset())});
        }
    }, new Function1<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ LazyGridState invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyGridState invoke2(List<Integer> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyGridState(it.get(0).intValue(), it.get(1).intValue());
        }
    });
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private boolean canScrollBackward;
    private boolean canScrollForward;
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;

    /* renamed from: density$delegate, reason: from kotlin metadata */
    private final MutableState density;
    private final MutableInteractionSource internalInteractionSource;

    /* renamed from: isVertical$delegate, reason: from kotlin metadata */
    private final MutableState isVertical;
    private final MutableState<LazyGridLayoutInfo> layoutInfoState;
    private int lineToPrefetch;
    private int numMeasurePasses;

    /* renamed from: placementAnimator$delegate, reason: from kotlin metadata */
    private final MutableState placementAnimator;

    /* renamed from: prefetchInfoRetriever$delegate, reason: from kotlin metadata */
    private final MutableState prefetchInfoRetriever;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;

    /* renamed from: remeasurement$delegate, reason: from kotlin metadata */
    private final MutableState remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    /* renamed from: slotsPerLine$delegate, reason: from kotlin metadata */
    private final MutableState slotsPerLine;
    private boolean wasScrollingForward;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LazyGridState() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public LazyGridState(int i, int i2) {
        this.scrollPosition = new LazyGridScrollPosition(i, i2);
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyGridLayoutInfo.INSTANCE, null, 2, null);
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.density = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DensityKt.Density(1.0f, 1.0f), null, 2, null);
        this.isVertical = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f) {
                return Float.valueOf(-LazyGridState.this.onScroll$foundation_release(-f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
                LazyGridState.this.setRemeasurement(remeasurement);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.prefetchInfoRetriever = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function1<LineIndex, List<? extends Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchInfoRetriever$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ List<? extends Pair<? extends Integer, ? extends Constraints>> invoke(LineIndex lineIndex) {
                return m608invokebKFJvoY(lineIndex.m627unboximpl());
            }

            /* renamed from: invoke-bKFJvoY, reason: not valid java name */
            public final List<Pair<Integer, Constraints>> m608invokebKFJvoY(int i3) {
                return CollectionsKt.emptyList();
            }
        }, null, 2, null);
        this.placementAnimator = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyGridState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.m603getIndexVZbfaAc();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getSlotsPerLine$foundation_release() {
        return ((Number) this.slotsPerLine.getValue()).intValue();
    }

    public final void setSlotsPerLine$foundation_release(int i) {
        this.slotsPerLine.setValue(Integer.valueOf(i));
    }

    public final Density getDensity$foundation_release() {
        return (Density) this.density.getValue();
    }

    public final void setDensity$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density.setValue(density);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVertical$foundation_release() {
        return ((Boolean) this.isVertical.getValue()).booleanValue();
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical.setValue(Boolean.valueOf(z));
    }

    /* renamed from: getNumMeasurePasses$foundation_release, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    /* renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    private final Remeasurement getRemeasurement() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    public final Function1<LineIndex, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (Function1) this.prefetchInfoRetriever.getValue();
    }

    public final void setPrefetchInfoRetriever$foundation_release(Function1<? super LineIndex, ? extends List<Pair<Integer, Constraints>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.prefetchInfoRetriever.setValue(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return (LazyGridItemPlacementAnimator) this.placementAnimator.getValue();
    }

    public final void setPlacementAnimator$foundation_release(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.placementAnimator.setValue(lazyGridItemPlacementAnimator);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.scrollToItem(i, i2, continuation);
    }

    public final Object scrollToItem(int i, int i2, Continuation<? super Unit> continuation) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyGridState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        return scroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : Unit.INSTANCE;
    }

    public final void snapToItemIndexInternal$foundation_release(int index, int scrollOffset) {
        this.scrollPosition.m604requestPositionyO3Fmg4(ItemIndex.m565constructorimpl(index), scrollOffset);
        LazyGridItemPlacementAnimator placementAnimator$foundation_release = getPlacementAnimator$foundation_release();
        if (placementAnimator$foundation_release != null) {
            placementAnimator$foundation_release.reset();
        }
        Remeasurement remeasurement = getRemeasurement();
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        Object coroutine_suspended;
        int i;
        LazyGridState lazyGridState;
        ScrollableState scrollableState;
        if (continuation instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) continuation;
            if ((lazyGridState$scroll$1.label & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.label -= Integer.MIN_VALUE;
                Object obj = lazyGridState$scroll$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lazyGridState$scroll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                    lazyGridState$scroll$1.L$0 = this;
                    lazyGridState$scroll$1.L$1 = mutatePriority;
                    lazyGridState$scroll$1.L$2 = function2;
                    lazyGridState$scroll$1.label = 1;
                    if (awaitFirstLayoutModifier.waitForFirstLayout(lazyGridState$scroll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lazyGridState = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function2 = (Function2) lazyGridState$scroll$1.L$2;
                    mutatePriority = (MutatePriority) lazyGridState$scroll$1.L$1;
                    lazyGridState = (LazyGridState) lazyGridState$scroll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                scrollableState = lazyGridState.scrollableState;
                lazyGridState$scroll$1.L$0 = null;
                lazyGridState$scroll$1.L$1 = null;
                lazyGridState$scroll$1.L$2 = null;
                lazyGridState$scroll$1.label = 2;
                if (scrollableState.scroll(mutatePriority, function2, lazyGridState$scroll$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuation);
        Object obj2 = lazyGridState$scroll$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lazyGridState$scroll$1.label;
        if (i != 0) {
        }
        scrollableState = lazyGridState.scrollableState;
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.L$2 = null;
        lazyGridState$scroll$1.label = 2;
        if (scrollableState.scroll(mutatePriority, function2, lazyGridState$scroll$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* renamed from: getCanScrollForward$foundation_release, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float onScroll$foundation_release(float distance) {
        if ((distance < 0.0f && !this.canScrollForward) || (distance > 0.0f && !this.canScrollBackward)) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f;
        if (Math.abs(f) > 0.5f) {
            float f2 = this.scrollToBeConsumed;
            Remeasurement remeasurement = getRemeasurement();
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
            if (this.prefetchingEnabled) {
                notifyPrefetch(f2 - this.scrollToBeConsumed);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f3 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f3;
    }

    private final void notifyPrefetch(float delta) {
        int row;
        int index;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector;
        int size;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.prefetchState;
        if (this.prefetchingEnabled) {
            LazyGridLayoutInfo layoutInfo = getLayoutInfo();
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return;
            }
            boolean z = delta < 0.0f;
            if (z) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo());
                row = (isVertical$foundation_release() ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
                index = ((LazyGridItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo());
                row = (isVertical$foundation_release() ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
                index = ((LazyGridItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (row == this.lineToPrefetch || index < 0 || index >= layoutInfo.getTotalItemsCount()) {
                return;
            }
            if (this.wasScrollingForward != z && (size = (mutableVector = this.currentLinePrefetchHandles).getSize()) > 0) {
                LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].cancel();
                    i++;
                } while (i < size);
            }
            this.wasScrollingForward = z;
            this.lineToPrefetch = row;
            this.currentLinePrefetchHandles.clear();
            List<Pair<Integer, Constraints>> invoke = getPrefetchInfoRetriever$foundation_release().invoke(LineIndex.m615boximpl(LineIndex.m617constructorimpl(row)));
            int size2 = invoke.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Pair<Integer, Constraints> pair = invoke.get(i2);
                this.currentLinePrefetchHandles.add(lazyLayoutPrefetchState.m633schedulePrefetch0kLqBqw(pair.getFirst().intValue(), pair.getSecond().getValue()));
            }
        }
    }

    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.animateScrollToItem(i, i2, continuation);
    }

    public final Object animateScrollToItem(int i, int i2, Continuation<? super Unit> continuation) {
        Object doSmoothScrollToItem = LazyGridScrollingKt.doSmoothScrollToItem(this, i, i2, getSlotsPerLine$foundation_release(), continuation);
        return doSmoothScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? doSmoothScrollToItem : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(LazyGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        this.canScrollForward = result.getCanScrollForward();
        LazyMeasuredLine firstVisibleLine = result.getFirstVisibleLine();
        this.canScrollBackward = ((firstVisibleLine != null ? firstVisibleLine.getIndex() : 0) == 0 && result.getFirstVisibleLineScrollOffset() == 0) ? false : true;
        this.numMeasurePasses++;
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyGridItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider);
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }
    }
}
