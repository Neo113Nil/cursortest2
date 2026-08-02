package org.betup.ui.fragment.home.compose.matches;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.betup.ui.fragment.home.compose.HomeMatchItem;

/* compiled from: HomeMatchesHorizontalRow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1", f = "HomeMatchesHorizontalRow.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hasMore;
    final /* synthetic */ boolean $isLoadingMore;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ List<HomeMatchItem> $matches;
    final /* synthetic */ Function0<Unit> $onLoadMore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1(LazyListState lazyListState, List<HomeMatchItem> list, boolean z, boolean z2, Function0<Unit> function0, Continuation<? super HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$matches = list;
        this.$isLoadingMore = z;
        this.$hasMore = z2;
        this.$onLoadMore = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1(this.$listState, this.$matches, this.$isLoadingMore, this.$hasMore, this.$onLoadMore, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final List<HomeMatchItem> list = this.$matches;
            final boolean z = this.$isLoadingMore;
            final boolean z2 = this.$hasMore;
            final Function0<Unit> function0 = this.$onLoadMore;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    if (!list.isEmpty() && num != null && num.intValue() >= list.size() - 2 && !z && z2) {
                        function0.invoke();
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer invokeSuspend$lambda$0(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }
}
