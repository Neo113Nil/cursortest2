package org.betup.ui.fragment.matches.details.compose.tabs.battles;

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
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleUiItem;

/* compiled from: BattlesTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1", f = "BattlesTabContent.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<BattleUiItem>> $battles$delegate;
    final /* synthetic */ MatchDetailsController $controller;
    final /* synthetic */ State<Boolean> $hasMoreBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1(LazyListState lazyListState, MatchDetailsController matchDetailsController, State<? extends List<BattleUiItem>> state, State<Boolean> state2, State<Boolean> state3, Continuation<? super BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$controller = matchDetailsController;
        this.$battles$delegate = state;
        this.$isLoading$delegate = state2;
        this.$hasMoreBattles$delegate = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1(this.$listState, this.$controller, this.$battles$delegate, this.$isLoading$delegate, this.$hasMoreBattles$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final MatchDetailsController matchDetailsController = this.$controller;
            final State<List<BattleUiItem>> state = this.$battles$delegate;
            final State<Boolean> state2 = this.$isLoading$delegate;
            final State<Boolean> state3 = this.$hasMoreBattles$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    List BattlesTabContent$lambda$1;
                    List BattlesTabContent$lambda$12;
                    List BattlesTabContent$lambda$13;
                    boolean BattlesTabContent$lambda$0;
                    boolean BattlesTabContent$lambda$2;
                    BattlesTabContent$lambda$1 = BattlesTabContentKt.BattlesTabContent$lambda$1(state);
                    if (!BattlesTabContent$lambda$1.isEmpty() && num != null) {
                        int intValue = num.intValue();
                        BattlesTabContent$lambda$12 = BattlesTabContentKt.BattlesTabContent$lambda$1(state);
                        if (intValue >= BattlesTabContent$lambda$12.size() - 3) {
                            BattlesTabContent$lambda$13 = BattlesTabContentKt.BattlesTabContent$lambda$1(state);
                            int size = BattlesTabContent$lambda$13.size();
                            BattlesTabContent$lambda$0 = BattlesTabContentKt.BattlesTabContent$lambda$0(state2);
                            BattlesTabContent$lambda$2 = BattlesTabContentKt.BattlesTabContent$lambda$2(state3);
                            Log.d("BattlesTabContent", "Triggering load more battles: lastIndex=" + num + ", battlesSize=" + size + ", isLoading=" + BattlesTabContent$lambda$0 + ", hasMore=" + BattlesTabContent$lambda$2);
                            MatchDetailsController.this.loadMoreAvailableBattles();
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
