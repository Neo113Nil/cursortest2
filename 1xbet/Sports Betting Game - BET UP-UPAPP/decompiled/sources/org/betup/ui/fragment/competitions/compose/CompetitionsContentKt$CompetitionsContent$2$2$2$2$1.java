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
import org.betup.ui.fragment.competitions.compose.items.NewCompetitionUiItem;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: CompetitionsContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$2$1", f = "CompetitionsContent.kt", i = {}, l = {Opcodes.IF_ACMPNE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CompetitionsContentKt$CompetitionsContent$2$2$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<NewCompetitionUiItem>> $activeCompetitions$delegate;
    final /* synthetic */ LazyListState $activeListState;
    final /* synthetic */ CompetitionsController $controller;
    final /* synthetic */ State<Boolean> $hasMoreActive$delegate;
    final /* synthetic */ State<Boolean> $isLoadMoreActive$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CompetitionsContentKt$CompetitionsContent$2$2$2$2$1(LazyListState lazyListState, CompetitionsController competitionsController, State<? extends List<NewCompetitionUiItem>> state, State<Boolean> state2, State<Boolean> state3, Continuation<? super CompetitionsContentKt$CompetitionsContent$2$2$2$2$1> continuation) {
        super(2, continuation);
        this.$activeListState = lazyListState;
        this.$controller = competitionsController;
        this.$activeCompetitions$delegate = state;
        this.$hasMoreActive$delegate = state2;
        this.$isLoadMoreActive$delegate = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompetitionsContentKt$CompetitionsContent$2$2$2$2$1(this.$activeListState, this.$controller, this.$activeCompetitions$delegate, this.$hasMoreActive$delegate, this.$isLoadMoreActive$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompetitionsContentKt$CompetitionsContent$2$2$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$activeListState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = CompetitionsContentKt$CompetitionsContent$2$2$2$2$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final CompetitionsController competitionsController = this.$controller;
            final State<List<NewCompetitionUiItem>> state = this.$activeCompetitions$delegate;
            final State<Boolean> state2 = this.$hasMoreActive$delegate;
            final State<Boolean> state3 = this.$isLoadMoreActive$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    List CompetitionsContent$lambda$3;
                    List CompetitionsContent$lambda$32;
                    boolean CompetitionsContent$lambda$9;
                    boolean CompetitionsContent$lambda$11;
                    List CompetitionsContent$lambda$33;
                    boolean CompetitionsContent$lambda$92;
                    CompetitionsContent$lambda$3 = CompetitionsContentKt.CompetitionsContent$lambda$3(state);
                    if (!CompetitionsContent$lambda$3.isEmpty() && num != null) {
                        int intValue = num.intValue();
                        CompetitionsContent$lambda$32 = CompetitionsContentKt.CompetitionsContent$lambda$3(state);
                        if (intValue >= CompetitionsContent$lambda$32.size() - 3) {
                            CompetitionsContent$lambda$9 = CompetitionsContentKt.CompetitionsContent$lambda$9(state2);
                            if (CompetitionsContent$lambda$9) {
                                CompetitionsContent$lambda$11 = CompetitionsContentKt.CompetitionsContent$lambda$11(state3);
                                if (!CompetitionsContent$lambda$11) {
                                    CompetitionsContent$lambda$33 = CompetitionsContentKt.CompetitionsContent$lambda$3(state);
                                    int size = CompetitionsContent$lambda$33.size();
                                    CompetitionsContent$lambda$92 = CompetitionsContentKt.CompetitionsContent$lambda$9(state2);
                                    Log.d("CompetitionsContent", "Triggering load more active competitions: lastIndex=" + num + ", competitionsSize=" + size + ", hasMore=" + CompetitionsContent$lambda$92);
                                    CompetitionsController competitionsController2 = CompetitionsController.this;
                                    if (competitionsController2 != null) {
                                        competitionsController2.loadMoreActiveCompetitions();
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
