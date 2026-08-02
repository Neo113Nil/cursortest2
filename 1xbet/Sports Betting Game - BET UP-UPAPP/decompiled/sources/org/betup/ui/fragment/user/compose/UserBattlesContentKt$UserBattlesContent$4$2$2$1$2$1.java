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
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;
import org.betup.ui.fragment.user.controller.UserBattlesController;

/* compiled from: UserBattlesContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1", f = "UserBattlesContent.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserBattlesController $controller;
    final /* synthetic */ List<NewUserBattleUiItem> $currentAvailableBattles;
    final /* synthetic */ State<Boolean> $hasMoreAvailableBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1(LazyListState lazyListState, List<NewUserBattleUiItem> list, UserBattlesController userBattlesController, State<Boolean> state, State<Boolean> state2, Continuation<? super UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$currentAvailableBattles = list;
        this.$controller = userBattlesController;
        this.$hasMoreAvailableBattles$delegate = state;
        this.$isLoading$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1(this.$listState, this.$currentAvailableBattles, this.$controller, this.$hasMoreAvailableBattles$delegate, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final List<NewUserBattleUiItem> list = this.$currentAvailableBattles;
            final UserBattlesController userBattlesController = this.$controller;
            final State<Boolean> state = this.$hasMoreAvailableBattles$delegate;
            final State<Boolean> state2 = this.$isLoading$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    boolean UserBattlesContent$lambda$20;
                    boolean UserBattlesContent$lambda$14;
                    boolean UserBattlesContent$lambda$142;
                    boolean UserBattlesContent$lambda$202;
                    if (!list.isEmpty() && num != null && num.intValue() >= list.size() - 3) {
                        UserBattlesContent$lambda$20 = UserBattlesContentKt.UserBattlesContent$lambda$20(state);
                        if (UserBattlesContent$lambda$20) {
                            UserBattlesContent$lambda$14 = UserBattlesContentKt.UserBattlesContent$lambda$14(state2);
                            if (!UserBattlesContent$lambda$14) {
                                int size = list.size();
                                UserBattlesContent$lambda$142 = UserBattlesContentKt.UserBattlesContent$lambda$14(state2);
                                UserBattlesContent$lambda$202 = UserBattlesContentKt.UserBattlesContent$lambda$20(state);
                                Log.d("UserBattlesContent", "Triggering load more available battles: lastIndex=" + num + ", battlesSize=" + size + ", isLoading=" + UserBattlesContent$lambda$142 + ", hasMore=" + UserBattlesContent$lambda$202);
                                UserBattlesController userBattlesController2 = userBattlesController;
                                if (userBattlesController2 != null) {
                                    userBattlesController2.loadMoreAvailableBattles();
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
