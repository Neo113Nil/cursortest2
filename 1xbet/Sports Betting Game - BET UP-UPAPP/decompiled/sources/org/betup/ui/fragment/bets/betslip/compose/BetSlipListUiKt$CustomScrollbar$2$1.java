package org.betup.ui.fragment.bets.betslip.compose;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BetSlipListUi.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetSlipListUiKt$CustomScrollbar$2$1 implements PointerInputEventHandler {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ float $scrollProgress;
    final /* synthetic */ int $totalItemsCount;
    final /* synthetic */ int $viewportHeight;
    final /* synthetic */ List<LazyListItemInfo> $visibleItems;

    /* JADX WARN: Multi-variable type inference failed */
    BetSlipListUiKt$CustomScrollbar$2$1(int i, List<? extends LazyListItemInfo> list, float f, int i2, CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.$totalItemsCount = i;
        this.$visibleItems = list;
        this.$scrollProgress = f;
        this.$viewportHeight = i2;
        this.$coroutineScope = coroutineScope;
        this.$listState = lazyListState;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final int i = this.$totalItemsCount;
        final List<LazyListItemInfo> list = this.$visibleItems;
        final float f = this.$scrollProgress;
        final int i2 = this.$viewportHeight;
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final LazyListState lazyListState = this.$listState;
        Object detectVerticalDragGestures$default = DragGestureDetectorKt.detectVerticalDragGestures$default(pointerInputScope, null, null, null, new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$CustomScrollbar$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = BetSlipListUiKt$CustomScrollbar$2$1.invoke$lambda$0(i, list, f, i2, coroutineScope, lazyListState, (PointerInputChange) obj, ((Float) obj2).floatValue());
                return invoke$lambda$0;
            }
        }, continuation, 7, null);
        return detectVerticalDragGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectVerticalDragGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(int i, List list, float f, int i2, CoroutineScope coroutineScope, LazyListState lazyListState, PointerInputChange change, float f2) {
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BetSlipListUiKt$CustomScrollbar$2$1$1$1(lazyListState, RangesKt.coerceIn(f + (f2 / i2), 0.0f, 1.0f), i - list.size(), null), 3, null);
        return Unit.INSTANCE;
    }
}
