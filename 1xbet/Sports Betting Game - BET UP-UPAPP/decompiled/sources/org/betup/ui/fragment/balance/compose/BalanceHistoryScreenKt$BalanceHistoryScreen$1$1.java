package org.betup.ui.fragment.balance.compose;

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
import org.betup.model.remote.entity.user.balance.BalanceDataModel;

/* compiled from: BalanceHistoryScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$1$1", f = "BalanceHistoryScreen.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BalanceHistoryScreenKt$BalanceHistoryScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BalanceDataModel> $balanceHistory;
    final /* synthetic */ boolean $hasMore;
    final /* synthetic */ boolean $isLoadingMore;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function0<Unit> $loadMore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BalanceHistoryScreenKt$BalanceHistoryScreen$1$1(LazyListState lazyListState, List<? extends BalanceDataModel> list, boolean z, boolean z2, Function0<Unit> function0, Continuation<? super BalanceHistoryScreenKt$BalanceHistoryScreen$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$balanceHistory = list;
        this.$isLoadingMore = z;
        this.$hasMore = z2;
        this.$loadMore = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BalanceHistoryScreenKt$BalanceHistoryScreen$1$1(this.$listState, this.$balanceHistory, this.$isLoadingMore, this.$hasMore, this.$loadMore, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BalanceHistoryScreenKt$BalanceHistoryScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BalanceHistoryScreenKt$BalanceHistoryScreen$1$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final List<BalanceDataModel> list = this.$balanceHistory;
            final boolean z = this.$isLoadingMore;
            final boolean z2 = this.$hasMore;
            final Function0<Unit> function0 = this.$loadMore;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    if (!list.isEmpty() && num != null && num.intValue() >= list.size() - 3 && !z && z2) {
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
