package org.betup.ui.dialogs.compose.stepsChallenges;

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
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.ui.dialogs.controller.MatchSelectionController;

/* compiled from: MatchesStep.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$MatchesStep$1$1", f = "MatchesStep.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class MatchesStepKt$MatchesStep$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MatchSelectionController $controller;
    final /* synthetic */ State<Boolean> $hasMore$delegate;
    final /* synthetic */ State<Boolean> $isLoadingMore$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ State<List<NewMatchItemModel>> $matches$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchesStepKt$MatchesStep$1$1(LazyListState lazyListState, MatchSelectionController matchSelectionController, State<? extends List<NewMatchItemModel>> state, State<Boolean> state2, State<Boolean> state3, Continuation<? super MatchesStepKt$MatchesStep$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$controller = matchSelectionController;
        this.$matches$delegate = state;
        this.$isLoadingMore$delegate = state2;
        this.$hasMore$delegate = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchesStepKt$MatchesStep$1$1(this.$listState, this.$controller, this.$matches$delegate, this.$isLoadingMore$delegate, this.$hasMore$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchesStepKt$MatchesStep$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$MatchesStep$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = MatchesStepKt$MatchesStep$1$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final MatchSelectionController matchSelectionController = this.$controller;
            final State<List<NewMatchItemModel>> state = this.$matches$delegate;
            final State<Boolean> state2 = this.$isLoadingMore$delegate;
            final State<Boolean> state3 = this.$hasMore$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$MatchesStep$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    List MatchesStep$lambda$0;
                    List MatchesStep$lambda$02;
                    boolean MatchesStep$lambda$2;
                    boolean MatchesStep$lambda$3;
                    List MatchesStep$lambda$03;
                    boolean MatchesStep$lambda$22;
                    boolean MatchesStep$lambda$32;
                    MatchesStep$lambda$0 = MatchesStepKt.MatchesStep$lambda$0(state);
                    if (!MatchesStep$lambda$0.isEmpty() && num != null) {
                        int intValue = num.intValue();
                        MatchesStep$lambda$02 = MatchesStepKt.MatchesStep$lambda$0(state);
                        if (intValue >= MatchesStep$lambda$02.size() - 3) {
                            MatchesStep$lambda$2 = MatchesStepKt.MatchesStep$lambda$2(state2);
                            if (!MatchesStep$lambda$2) {
                                MatchesStep$lambda$3 = MatchesStepKt.MatchesStep$lambda$3(state3);
                                if (MatchesStep$lambda$3) {
                                    MatchesStep$lambda$03 = MatchesStepKt.MatchesStep$lambda$0(state);
                                    int size = MatchesStep$lambda$03.size();
                                    MatchesStep$lambda$22 = MatchesStepKt.MatchesStep$lambda$2(state2);
                                    MatchesStep$lambda$32 = MatchesStepKt.MatchesStep$lambda$3(state3);
                                    Log.d("MatchesStep", "Triggering load more: lastIndex=" + num + ", matchesSize=" + size + ", isLoadingMore=" + MatchesStep$lambda$22 + ", hasMore=" + MatchesStep$lambda$32);
                                    MatchSelectionController.this.loadNextPage();
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
