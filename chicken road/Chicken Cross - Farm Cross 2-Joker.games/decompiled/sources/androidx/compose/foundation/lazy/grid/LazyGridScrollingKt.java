package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: LazyGridScrolling.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\u0017\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b\u001a-\u0010\u0011\u001a\u00020\r*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"BoundDistance", "Landroidx/compose/ui/unit/Dp;", "F", "DEBUG", "", "TargetDistance", "calculateLineAverageMainAxisSize", "", "visibleItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "isVertical", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "doSmoothScrollToItem", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "index", "scrollOffset", "slotsPerLine", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridScrollingKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m3840constructorimpl(2500);
    private static final float BoundDistance = Dp.m3840constructorimpl(1500);

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridItemInfo doSmoothScrollToItem$getTargetItem(LazyGridState lazyGridState, int i) {
        LazyGridItemInfo lazyGridItemInfo;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridState.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                lazyGridItemInfo = null;
                break;
            }
            lazyGridItemInfo = visibleItemsInfo.get(i2);
            if (lazyGridItemInfo.getIndex() == i) {
                break;
            }
            i2++;
        }
        return lazyGridItemInfo;
    }

    public static final Object doSmoothScrollToItem(LazyGridState lazyGridState, int i, int i2, int i3, Continuation<? super Unit> continuation) {
        if (i < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
        Object scroll$default = ScrollableState.scroll$default(lazyGridState, null, new LazyGridScrollingKt$doSmoothScrollToItem$3(lazyGridState, i, i3, i2, null), continuation, 1, null);
        return scroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateLineAverageMainAxisSize(final List<? extends LazyGridItemInfo> list, final boolean z) {
        int m4000getWidthimpl;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i) {
                return Integer.valueOf(z ? list.get(i).getRow() : list.get(i).getColumn());
            }
        };
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            int intValue = function1.invoke(Integer.valueOf(i)).intValue();
            if (intValue == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < list.size() && function1.invoke(Integer.valueOf(i)).intValue() == intValue) {
                    if (z) {
                        m4000getWidthimpl = IntSize.m3999getHeightimpl(list.get(i).getSize());
                    } else {
                        m4000getWidthimpl = IntSize.m4000getWidthimpl(list.get(i).getSize());
                    }
                    i4 = Math.max(i4, m4000getWidthimpl);
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return i2 / i3;
    }
}
