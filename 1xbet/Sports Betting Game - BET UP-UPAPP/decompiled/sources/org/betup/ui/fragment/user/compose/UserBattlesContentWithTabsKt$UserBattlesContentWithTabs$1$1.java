package org.betup.ui.fragment.user.compose;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.entity.challenges.BattleCountModel;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;

/* compiled from: UserBattlesContentWithTabs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$1$1", f = "UserBattlesContentWithTabs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<BattleCountModel>> $battleCounts$delegate;
    final /* synthetic */ UserDetailsController $controller;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ State<List<NewUserBattleUiItem>> $realAvailableBattles$delegate;
    final /* synthetic */ State<List<NewUserBattleUiItem>> $realPrivateBattles$delegate;
    final /* synthetic */ State<List<NewUserBattleModel>> $realStatsBattles$delegate;
    final /* synthetic */ MutableState<Integer> $selectedTab$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$1$1(UserDetailsController userDetailsController, MutableState<Integer> mutableState, State<? extends List<NewUserBattleUiItem>> state, State<Boolean> state2, State<? extends List<NewUserBattleUiItem>> state3, State<? extends List<NewUserBattleModel>> state4, State<? extends List<BattleCountModel>> state5, Continuation<? super UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$1$1> continuation) {
        super(2, continuation);
        this.$controller = userDetailsController;
        this.$selectedTab$delegate = mutableState;
        this.$realAvailableBattles$delegate = state;
        this.$isLoading$delegate = state2;
        this.$realPrivateBattles$delegate = state3;
        this.$realStatsBattles$delegate = state4;
        this.$battleCounts$delegate = state5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$1$1(this.$controller, this.$selectedTab$delegate, this.$realAvailableBattles$delegate, this.$isLoading$delegate, this.$realPrivateBattles$delegate, this.$realStatsBattles$delegate, this.$battleCounts$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int UserBattlesContentWithTabs$lambda$1;
        int UserBattlesContentWithTabs$lambda$12;
        List UserBattlesContentWithTabs$lambda$4;
        boolean UserBattlesContentWithTabs$lambda$10;
        boolean UserBattlesContentWithTabs$lambda$102;
        List UserBattlesContentWithTabs$lambda$42;
        boolean UserBattlesContentWithTabs$lambda$103;
        List UserBattlesContentWithTabs$lambda$43;
        List UserBattlesContentWithTabs$lambda$6;
        boolean UserBattlesContentWithTabs$lambda$104;
        boolean UserBattlesContentWithTabs$lambda$105;
        List UserBattlesContentWithTabs$lambda$62;
        boolean UserBattlesContentWithTabs$lambda$106;
        List UserBattlesContentWithTabs$lambda$63;
        List UserBattlesContentWithTabs$lambda$8;
        boolean UserBattlesContentWithTabs$lambda$107;
        boolean UserBattlesContentWithTabs$lambda$108;
        List UserBattlesContentWithTabs$lambda$82;
        boolean UserBattlesContentWithTabs$lambda$109;
        List UserBattlesContentWithTabs$lambda$122;
        List UserBattlesContentWithTabs$lambda$83;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            UserBattlesContentWithTabs$lambda$1 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$1(this.$selectedTab$delegate);
            Log.d("UserBattlesContentWithTabs", "Tab changed to: " + UserBattlesContentWithTabs$lambda$1);
            UserBattlesContentWithTabs$lambda$12 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$1(this.$selectedTab$delegate);
            if (UserBattlesContentWithTabs$lambda$12 == 0) {
                UserBattlesContentWithTabs$lambda$4 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$4(this.$realAvailableBattles$delegate);
                int size = UserBattlesContentWithTabs$lambda$4.size();
                UserBattlesContentWithTabs$lambda$10 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                Log.d("UserBattlesContentWithTabs", "Available battles tab selected, current count: " + size + ", isLoading: " + UserBattlesContentWithTabs$lambda$10);
                UserBattlesContentWithTabs$lambda$102 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                if (!UserBattlesContentWithTabs$lambda$102) {
                    UserBattlesContentWithTabs$lambda$43 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$4(this.$realAvailableBattles$delegate);
                    if (UserBattlesContentWithTabs$lambda$43.isEmpty()) {
                        Log.d("UserBattlesContentWithTabs", "Calling loadAvailableBattles() - list is empty");
                        UserDetailsController userDetailsController = this.$controller;
                        if (userDetailsController != null) {
                            userDetailsController.loadAvailableBattles();
                        }
                    }
                }
                UserBattlesContentWithTabs$lambda$42 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$4(this.$realAvailableBattles$delegate);
                int size2 = UserBattlesContentWithTabs$lambda$42.size();
                UserBattlesContentWithTabs$lambda$103 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                Boxing.boxInt(Log.d("UserBattlesContentWithTabs", "Skipping loadAvailableBattles() - list has " + size2 + " items or isLoading=" + UserBattlesContentWithTabs$lambda$103));
            } else if (UserBattlesContentWithTabs$lambda$12 == 1) {
                UserBattlesContentWithTabs$lambda$6 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$6(this.$realPrivateBattles$delegate);
                int size3 = UserBattlesContentWithTabs$lambda$6.size();
                UserBattlesContentWithTabs$lambda$104 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                Log.d("UserBattlesContentWithTabs", "Private battles tab selected, current count: " + size3 + ", isLoading: " + UserBattlesContentWithTabs$lambda$104);
                UserBattlesContentWithTabs$lambda$105 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                if (!UserBattlesContentWithTabs$lambda$105) {
                    UserBattlesContentWithTabs$lambda$63 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$6(this.$realPrivateBattles$delegate);
                    if (UserBattlesContentWithTabs$lambda$63.isEmpty()) {
                        Log.d("UserBattlesContentWithTabs", "Calling loadPrivateBattles() - list is empty");
                        UserDetailsController userDetailsController2 = this.$controller;
                        if (userDetailsController2 != null) {
                            userDetailsController2.loadPrivateBattles();
                        }
                    }
                }
                UserBattlesContentWithTabs$lambda$62 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$6(this.$realPrivateBattles$delegate);
                int size4 = UserBattlesContentWithTabs$lambda$62.size();
                UserBattlesContentWithTabs$lambda$106 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                Boxing.boxInt(Log.d("UserBattlesContentWithTabs", "Skipping loadPrivateBattles() - list has " + size4 + " items or isLoading=" + UserBattlesContentWithTabs$lambda$106));
            } else if (UserBattlesContentWithTabs$lambda$12 == 2) {
                UserBattlesContentWithTabs$lambda$8 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$8(this.$realStatsBattles$delegate);
                int size5 = UserBattlesContentWithTabs$lambda$8.size();
                UserBattlesContentWithTabs$lambda$107 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                Log.d("UserBattlesContentWithTabs", "Stats battles tab selected, current count: " + size5 + ", isLoading: " + UserBattlesContentWithTabs$lambda$107);
                UserBattlesContentWithTabs$lambda$108 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                if (!UserBattlesContentWithTabs$lambda$108) {
                    UserBattlesContentWithTabs$lambda$83 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$8(this.$realStatsBattles$delegate);
                    if (UserBattlesContentWithTabs$lambda$83.isEmpty()) {
                        Log.d("UserBattlesContentWithTabs", "Calling loadStatsBattles() - list is empty");
                        UserDetailsController userDetailsController3 = this.$controller;
                        if (userDetailsController3 != null) {
                            UserDetailsController.loadStatsBattles$default(userDetailsController3, null, 1, null);
                        }
                        UserBattlesContentWithTabs$lambda$122 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$12(this.$battleCounts$delegate);
                        if (UserBattlesContentWithTabs$lambda$122.isEmpty()) {
                            Log.d("UserBattlesContentWithTabs", "Calling loadBattleCounts() - counts list is empty");
                            UserDetailsController userDetailsController4 = this.$controller;
                            if (userDetailsController4 != null) {
                                userDetailsController4.loadBattleCounts();
                            }
                        }
                    }
                }
                UserBattlesContentWithTabs$lambda$82 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$8(this.$realStatsBattles$delegate);
                int size6 = UserBattlesContentWithTabs$lambda$82.size();
                UserBattlesContentWithTabs$lambda$109 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(this.$isLoading$delegate);
                Boxing.boxInt(Log.d("UserBattlesContentWithTabs", "Skipping loadStatsBattles() - list has " + size6 + " items or isLoading=" + UserBattlesContentWithTabs$lambda$109));
                UserBattlesContentWithTabs$lambda$122 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$12(this.$battleCounts$delegate);
                if (UserBattlesContentWithTabs$lambda$122.isEmpty()) {
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
