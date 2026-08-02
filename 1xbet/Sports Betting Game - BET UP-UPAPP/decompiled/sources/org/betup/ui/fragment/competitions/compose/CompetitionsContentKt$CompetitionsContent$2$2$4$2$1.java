package org.betup.ui.fragment.competitions.compose;

import android.util.Log;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
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
import org.betup.ui.fragment.competitions.compose.history.model.CompetitionHistoryItemUiModel;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;

/* compiled from: CompetitionsContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$2$1", f = "CompetitionsContent.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CompetitionsContentKt$CompetitionsContent$2$2$4$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompetitionsController $controller;
    final /* synthetic */ State<Boolean> $hasMoreHistory$delegate;
    final /* synthetic */ State<List<CompetitionHistoryItemUiModel>> $historyCompetitions$delegate;
    final /* synthetic */ LazyListState $historyListState;
    final /* synthetic */ State<Boolean> $isLoadMoreHistory$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CompetitionsContentKt$CompetitionsContent$2$2$4$2$1(LazyListState lazyListState, CompetitionsController competitionsController, State<? extends List<CompetitionHistoryItemUiModel>> state, State<Boolean> state2, State<Boolean> state3, Continuation<? super CompetitionsContentKt$CompetitionsContent$2$2$4$2$1> continuation) {
        super(2, continuation);
        this.$historyListState = lazyListState;
        this.$controller = competitionsController;
        this.$historyCompetitions$delegate = state;
        this.$hasMoreHistory$delegate = state2;
        this.$isLoadMoreHistory$delegate = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompetitionsContentKt$CompetitionsContent$2$2$4$2$1(this.$historyListState, this.$controller, this.$historyCompetitions$delegate, this.$hasMoreHistory$delegate, this.$isLoadMoreHistory$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompetitionsContentKt$CompetitionsContent$2$2$4$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$historyListState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = CompetitionsContentKt$CompetitionsContent$2$2$4$2$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final CompetitionsController competitionsController = this.$controller;
            final State<List<CompetitionHistoryItemUiModel>> state = this.$historyCompetitions$delegate;
            final State<Boolean> state2 = this.$hasMoreHistory$delegate;
            final State<Boolean> state3 = this.$isLoadMoreHistory$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    List CompetitionsContent$lambda$5;
                    List CompetitionsContent$lambda$52;
                    boolean CompetitionsContent$lambda$13;
                    boolean CompetitionsContent$lambda$15;
                    List CompetitionsContent$lambda$53;
                    boolean CompetitionsContent$lambda$132;
                    CompetitionsContent$lambda$5 = CompetitionsContentKt.CompetitionsContent$lambda$5(state);
                    if (!CompetitionsContent$lambda$5.isEmpty() && num != null) {
                        int intValue = num.intValue();
                        CompetitionsContent$lambda$52 = CompetitionsContentKt.CompetitionsContent$lambda$5(state);
                        if (intValue >= CompetitionsContent$lambda$52.size() - 3) {
                            CompetitionsContent$lambda$13 = CompetitionsContentKt.CompetitionsContent$lambda$13(state2);
                            if (CompetitionsContent$lambda$13) {
                                CompetitionsContent$lambda$15 = CompetitionsContentKt.CompetitionsContent$lambda$15(state3);
                                if (!CompetitionsContent$lambda$15) {
                                    CompetitionsContent$lambda$53 = CompetitionsContentKt.CompetitionsContent$lambda$5(state);
                                    int size = CompetitionsContent$lambda$53.size();
                                    CompetitionsContent$lambda$132 = CompetitionsContentKt.CompetitionsContent$lambda$13(state2);
                                    Log.d("CompetitionsContent", "Triggering load more history competitions: lastIndex=" + num + ", competitionsSize=" + size + ", hasMore=" + CompetitionsContent$lambda$132);
                                    CompetitionsController competitionsController2 = CompetitionsController.this;
                                    if (competitionsController2 != null) {
                                        competitionsController2.loadMoreHistoryCompetitions();
                                    }
                                }
                            }
                        }
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
