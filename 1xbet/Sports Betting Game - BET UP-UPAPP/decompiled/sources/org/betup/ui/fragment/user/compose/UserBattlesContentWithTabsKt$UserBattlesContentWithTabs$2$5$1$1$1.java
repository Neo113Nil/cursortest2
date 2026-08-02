package org.betup.ui.fragment.user.compose;

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
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;

/* compiled from: UserBattlesContentWithTabs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1", f = "UserBattlesContentWithTabs.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserDetailsController $controller;
    final /* synthetic */ List<NewUserBattleUiItem> $currentPrivateBattles;
    final /* synthetic */ State<Boolean> $hasMorePrivateBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1(LazyListState lazyListState, List<NewUserBattleUiItem> list, UserDetailsController userDetailsController, State<Boolean> state, State<Boolean> state2, Continuation<? super UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$currentPrivateBattles = list;
        this.$controller = userDetailsController;
        this.$hasMorePrivateBattles$delegate = state;
        this.$isLoading$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1(this.$listState, this.$currentPrivateBattles, this.$controller, this.$hasMorePrivateBattles$delegate, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final List<NewUserBattleUiItem> list = this.$currentPrivateBattles;
            final UserDetailsController userDetailsController = this.$controller;
            final State<Boolean> state = this.$hasMorePrivateBattles$delegate;
            final State<Boolean> state2 = this.$isLoading$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    boolean UserBattlesContentWithTabs$lambda$18;
                    boolean UserBattlesContentWithTabs$lambda$10;
                    boolean UserBattlesContentWithTabs$lambda$102;
                    boolean UserBattlesContentWithTabs$lambda$182;
                    if (!list.isEmpty() && num != null && num.intValue() >= list.size() - 3) {
                        UserBattlesContentWithTabs$lambda$18 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$18(state);
                        if (UserBattlesContentWithTabs$lambda$18) {
                            UserBattlesContentWithTabs$lambda$10 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(state2);
                            if (!UserBattlesContentWithTabs$lambda$10) {
                                int size = list.size();
                                UserBattlesContentWithTabs$lambda$102 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(state2);
                                UserBattlesContentWithTabs$lambda$182 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$18(state);
                                Log.d("UserBattlesContentWithTabs", "Triggering load more private battles: lastIndex=" + num + ", battlesSize=" + size + ", isLoading=" + UserBattlesContentWithTabs$lambda$102 + ", hasMore=" + UserBattlesContentWithTabs$lambda$182);
                                UserDetailsController userDetailsController2 = userDetailsController;
                                if (userDetailsController2 != null) {
                                    userDetailsController2.loadMorePrivateBattles();
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
