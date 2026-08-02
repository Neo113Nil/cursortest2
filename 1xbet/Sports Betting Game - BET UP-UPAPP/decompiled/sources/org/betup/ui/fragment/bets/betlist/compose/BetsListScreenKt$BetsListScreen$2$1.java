package org.betup.ui.fragment.bets.betlist.compose;

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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;

/* compiled from: BetsListScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.compose.BetsListScreenKt$BetsListScreen$2$1", f = "BetsListScreen.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BetsListScreenKt$BetsListScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<BetsListModel>> $betLists$delegate;
    final /* synthetic */ State<Boolean> $hasMore$delegate;
    final /* synthetic */ State<Boolean> $isLoadMore$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function0<Unit> $loadMore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BetsListScreenKt$BetsListScreen$2$1(State<? extends List<? extends BetsListModel>> state, State<Boolean> state2, State<Boolean> state3, LazyListState lazyListState, Function0<Unit> function0, Continuation<? super BetsListScreenKt$BetsListScreen$2$1> continuation) {
        super(2, continuation);
        this.$betLists$delegate = state;
        this.$hasMore$delegate = state2;
        this.$isLoadMore$delegate = state3;
        this.$listState = lazyListState;
        this.$loadMore = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetsListScreenKt$BetsListScreen$2$1(this.$betLists$delegate, this.$hasMore$delegate, this.$isLoadMore$delegate, this.$listState, this.$loadMore, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetsListScreenKt$BetsListScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List BetsListScreen$lambda$2;
        boolean BetsListScreen$lambda$5;
        boolean BetsListScreen$lambda$4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BetsListScreen$lambda$2 = BetsListScreenKt.BetsListScreen$lambda$2(this.$betLists$delegate);
            int size = BetsListScreen$lambda$2.size();
            BetsListScreen$lambda$5 = BetsListScreenKt.BetsListScreen$lambda$5(this.$hasMore$delegate);
            BetsListScreen$lambda$4 = BetsListScreenKt.BetsListScreen$lambda$4(this.$isLoadMore$delegate);
            Log.d("BetsListScreen", "LaunchedEffect started - listSize=" + size + ", hasMore=" + BetsListScreen$lambda$5 + ", isLoadMore=" + BetsListScreen$lambda$4);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListScreenKt$BetsListScreen$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BetsListScreenKt$BetsListScreen$2$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final Function0<Unit> function0 = this.$loadMore;
            final State<List<BetsListModel>> state = this.$betLists$delegate;
            final State<Boolean> state2 = this.$isLoadMore$delegate;
            final State<Boolean> state3 = this.$hasMore$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListScreenKt$BetsListScreen$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    List BetsListScreen$lambda$22;
                    List BetsListScreen$lambda$23;
                    boolean BetsListScreen$lambda$42;
                    boolean BetsListScreen$lambda$52;
                    List BetsListScreen$lambda$24;
                    List BetsListScreen$lambda$25;
                    boolean z;
                    boolean BetsListScreen$lambda$43;
                    boolean BetsListScreen$lambda$53;
                    List BetsListScreen$lambda$26;
                    List BetsListScreen$lambda$27;
                    boolean BetsListScreen$lambda$44;
                    boolean BetsListScreen$lambda$54;
                    List BetsListScreen$lambda$28;
                    boolean BetsListScreen$lambda$45;
                    boolean BetsListScreen$lambda$55;
                    BetsListScreen$lambda$22 = BetsListScreenKt.BetsListScreen$lambda$2(state);
                    int size2 = BetsListScreen$lambda$22.size();
                    BetsListScreen$lambda$23 = BetsListScreenKt.BetsListScreen$lambda$2(state);
                    int size3 = BetsListScreen$lambda$23.size() - 3;
                    BetsListScreen$lambda$42 = BetsListScreenKt.BetsListScreen$lambda$4(state2);
                    BetsListScreen$lambda$52 = BetsListScreenKt.BetsListScreen$lambda$5(state3);
                    Log.d("BetsListScreen", "Scroll detected - lastIndex=" + num + ", listSize=" + size2 + ", threshold=" + size3 + ", isLoadMore=" + BetsListScreen$lambda$42 + ", hasMore=" + BetsListScreen$lambda$52);
                    BetsListScreen$lambda$24 = BetsListScreenKt.BetsListScreen$lambda$2(state);
                    if (!BetsListScreen$lambda$24.isEmpty() && num != null) {
                        int intValue = num.intValue();
                        BetsListScreen$lambda$27 = BetsListScreenKt.BetsListScreen$lambda$2(state);
                        if (intValue >= BetsListScreen$lambda$27.size() - 3) {
                            BetsListScreen$lambda$44 = BetsListScreenKt.BetsListScreen$lambda$4(state2);
                            if (!BetsListScreen$lambda$44) {
                                BetsListScreen$lambda$54 = BetsListScreenKt.BetsListScreen$lambda$5(state3);
                                if (BetsListScreen$lambda$54) {
                                    BetsListScreen$lambda$28 = BetsListScreenKt.BetsListScreen$lambda$2(state);
                                    int size4 = BetsListScreen$lambda$28.size();
                                    BetsListScreen$lambda$45 = BetsListScreenKt.BetsListScreen$lambda$4(state2);
                                    BetsListScreen$lambda$55 = BetsListScreenKt.BetsListScreen$lambda$5(state3);
                                    Log.d("BetsListScreen", "✅ TRIGGERING LOAD MORE: lastIndex=" + num + ", listSize=" + size4 + ", isLoadMore=" + BetsListScreen$lambda$45 + ", hasMore=" + BetsListScreen$lambda$55);
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    BetsListScreen$lambda$25 = BetsListScreenKt.BetsListScreen$lambda$2(state);
                    boolean isEmpty = BetsListScreen$lambda$25.isEmpty();
                    if (num != null) {
                        int intValue2 = num.intValue();
                        BetsListScreen$lambda$26 = BetsListScreenKt.BetsListScreen$lambda$2(state);
                        if (intValue2 >= BetsListScreen$lambda$26.size() - 3) {
                            z = true;
                            BetsListScreen$lambda$43 = BetsListScreenKt.BetsListScreen$lambda$4(state2);
                            BetsListScreen$lambda$53 = BetsListScreenKt.BetsListScreen$lambda$5(state3);
                            Boxing.boxInt(Log.d("BetsListScreen", "❌ NOT loading: isEmpty=" + isEmpty + ", lastIndex=" + num + ", condition=" + z + ", isLoadMore=" + BetsListScreen$lambda$43 + ", hasMore=" + BetsListScreen$lambda$53));
                            return Unit.INSTANCE;
                        }
                    }
                    z = false;
                    BetsListScreen$lambda$43 = BetsListScreenKt.BetsListScreen$lambda$4(state2);
                    BetsListScreen$lambda$53 = BetsListScreenKt.BetsListScreen$lambda$5(state3);
                    Boxing.boxInt(Log.d("BetsListScreen", "❌ NOT loading: isEmpty=" + isEmpty + ", lastIndex=" + num + ", condition=" + z + ", isLoadMore=" + BetsListScreen$lambda$43 + ", hasMore=" + BetsListScreen$lambda$53));
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
