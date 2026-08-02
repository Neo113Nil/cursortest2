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
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;
import org.betup.ui.fragment.user.controller.UserBattlesController;

/* compiled from: UserBattlesContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$3$1", f = "UserBattlesContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class UserBattlesContentKt$UserBattlesContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<BattleCountModel>> $battleCounts$delegate;
    final /* synthetic */ UserBattlesController $controller;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ State<List<NewUserBattleUiItem>> $realAvailableBattles$delegate;
    final /* synthetic */ State<List<NewUserBattleUiItem>> $realPrivateBattles$delegate;
    final /* synthetic */ State<List<NewUserBattleModel>> $realStatsBattles$delegate;
    final /* synthetic */ MutableState<ChallengeState> $selectedStatsFilter$delegate;
    final /* synthetic */ MutableState<Integer> $selectedTab$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UserBattlesContentKt$UserBattlesContent$3$1(UserBattlesController userBattlesController, MutableState<Integer> mutableState, State<? extends List<NewUserBattleUiItem>> state, State<Boolean> state2, State<? extends List<NewUserBattleUiItem>> state3, State<? extends List<NewUserBattleModel>> state4, MutableState<ChallengeState> mutableState2, State<? extends List<BattleCountModel>> state5, Continuation<? super UserBattlesContentKt$UserBattlesContent$3$1> continuation) {
        super(2, continuation);
        this.$controller = userBattlesController;
        this.$selectedTab$delegate = mutableState;
        this.$realAvailableBattles$delegate = state;
        this.$isLoading$delegate = state2;
        this.$realPrivateBattles$delegate = state3;
        this.$realStatsBattles$delegate = state4;
        this.$selectedStatsFilter$delegate = mutableState2;
        this.$battleCounts$delegate = state5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserBattlesContentKt$UserBattlesContent$3$1(this.$controller, this.$selectedTab$delegate, this.$realAvailableBattles$delegate, this.$isLoading$delegate, this.$realPrivateBattles$delegate, this.$realStatsBattles$delegate, this.$selectedStatsFilter$delegate, this.$battleCounts$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserBattlesContentKt$UserBattlesContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int UserBattlesContent$lambda$3;
        int UserBattlesContent$lambda$32;
        List UserBattlesContent$lambda$8;
        boolean UserBattlesContent$lambda$14;
        boolean UserBattlesContent$lambda$142;
        List UserBattlesContent$lambda$82;
        boolean UserBattlesContent$lambda$143;
        List UserBattlesContent$lambda$83;
        List UserBattlesContent$lambda$10;
        boolean UserBattlesContent$lambda$144;
        boolean UserBattlesContent$lambda$145;
        List UserBattlesContent$lambda$102;
        boolean UserBattlesContent$lambda$146;
        List UserBattlesContent$lambda$103;
        List UserBattlesContent$lambda$12;
        boolean UserBattlesContent$lambda$147;
        boolean UserBattlesContent$lambda$148;
        List UserBattlesContent$lambda$122;
        boolean UserBattlesContent$lambda$149;
        List UserBattlesContent$lambda$16;
        List UserBattlesContent$lambda$123;
        ChallengeState UserBattlesContent$lambda$322;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            UserBattlesContent$lambda$3 = UserBattlesContentKt.UserBattlesContent$lambda$3(this.$selectedTab$delegate);
            Log.d("UserBattlesContent", "Tab changed to: " + UserBattlesContent$lambda$3);
            UserBattlesContent$lambda$32 = UserBattlesContentKt.UserBattlesContent$lambda$3(this.$selectedTab$delegate);
            if (UserBattlesContent$lambda$32 == 0) {
                UserBattlesContent$lambda$8 = UserBattlesContentKt.UserBattlesContent$lambda$8(this.$realAvailableBattles$delegate);
                int size = UserBattlesContent$lambda$8.size();
                UserBattlesContent$lambda$14 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                Log.d("UserBattlesContent", "Available battles tab selected, current count: " + size + ", isLoading: " + UserBattlesContent$lambda$14);
                UserBattlesContent$lambda$142 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                if (!UserBattlesContent$lambda$142) {
                    UserBattlesContent$lambda$83 = UserBattlesContentKt.UserBattlesContent$lambda$8(this.$realAvailableBattles$delegate);
                    if (UserBattlesContent$lambda$83.isEmpty()) {
                        Log.d("UserBattlesContent", "Calling loadAvailableBattles() - list is empty");
                        UserBattlesController userBattlesController = this.$controller;
                        if (userBattlesController != null) {
                            userBattlesController.loadAvailableBattles();
                        }
                    }
                }
                UserBattlesContent$lambda$82 = UserBattlesContentKt.UserBattlesContent$lambda$8(this.$realAvailableBattles$delegate);
                int size2 = UserBattlesContent$lambda$82.size();
                UserBattlesContent$lambda$143 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                Boxing.boxInt(Log.d("UserBattlesContent", "Skipping loadAvailableBattles() - list has " + size2 + " items or isLoading=" + UserBattlesContent$lambda$143));
            } else if (UserBattlesContent$lambda$32 == 1) {
                UserBattlesContent$lambda$10 = UserBattlesContentKt.UserBattlesContent$lambda$10(this.$realPrivateBattles$delegate);
                int size3 = UserBattlesContent$lambda$10.size();
                UserBattlesContent$lambda$144 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                Log.d("UserBattlesContent", "Private battles tab selected, current count: " + size3 + ", isLoading: " + UserBattlesContent$lambda$144);
                UserBattlesContent$lambda$145 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                if (!UserBattlesContent$lambda$145) {
                    UserBattlesContent$lambda$103 = UserBattlesContentKt.UserBattlesContent$lambda$10(this.$realPrivateBattles$delegate);
                    if (UserBattlesContent$lambda$103.isEmpty()) {
                        Log.d("UserBattlesContent", "Calling loadPrivateBattles() - list is empty");
                        UserBattlesController userBattlesController2 = this.$controller;
                        if (userBattlesController2 != null) {
                            userBattlesController2.loadPrivateBattles();
                        }
                    }
                }
                UserBattlesContent$lambda$102 = UserBattlesContentKt.UserBattlesContent$lambda$10(this.$realPrivateBattles$delegate);
                int size4 = UserBattlesContent$lambda$102.size();
                UserBattlesContent$lambda$146 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                Boxing.boxInt(Log.d("UserBattlesContent", "Skipping loadPrivateBattles() - list has " + size4 + " items or isLoading=" + UserBattlesContent$lambda$146));
            } else if (UserBattlesContent$lambda$32 == 2) {
                UserBattlesContent$lambda$12 = UserBattlesContentKt.UserBattlesContent$lambda$12(this.$realStatsBattles$delegate);
                int size5 = UserBattlesContent$lambda$12.size();
                UserBattlesContent$lambda$147 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                Log.d("UserBattlesContent", "Stats battles tab selected, current count: " + size5 + ", isLoading: " + UserBattlesContent$lambda$147);
                UserBattlesContent$lambda$148 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                if (!UserBattlesContent$lambda$148) {
                    UserBattlesContent$lambda$123 = UserBattlesContentKt.UserBattlesContent$lambda$12(this.$realStatsBattles$delegate);
                    if (UserBattlesContent$lambda$123.isEmpty()) {
                        Log.d("UserBattlesContent", "Calling loadStatsBattles() - list is empty");
                        UserBattlesController userBattlesController3 = this.$controller;
                        if (userBattlesController3 != null) {
                            UserBattlesContent$lambda$322 = UserBattlesContentKt.UserBattlesContent$lambda$32(this.$selectedStatsFilter$delegate);
                            userBattlesController3.loadStatsBattles(UserBattlesContent$lambda$322 != null ? Boxing.boxInt(UserBattlesContent$lambda$322.getValue()) : null);
                        }
                        UserBattlesContent$lambda$16 = UserBattlesContentKt.UserBattlesContent$lambda$16(this.$battleCounts$delegate);
                        if (UserBattlesContent$lambda$16.isEmpty()) {
                            Log.d("UserBattlesContent", "Calling loadBattleCounts() - counts list is empty");
                            UserBattlesController userBattlesController4 = this.$controller;
                            if (userBattlesController4 != null) {
                                userBattlesController4.loadBattleCounts();
                            }
                        }
                    }
                }
                UserBattlesContent$lambda$122 = UserBattlesContentKt.UserBattlesContent$lambda$12(this.$realStatsBattles$delegate);
                int size6 = UserBattlesContent$lambda$122.size();
                UserBattlesContent$lambda$149 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
                Boxing.boxInt(Log.d("UserBattlesContent", "Skipping loadStatsBattles() - list has " + size6 + " items or isLoading=" + UserBattlesContent$lambda$149));
                UserBattlesContent$lambda$16 = UserBattlesContentKt.UserBattlesContent$lambda$16(this.$battleCounts$delegate);
                if (UserBattlesContent$lambda$16.isEmpty()) {
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
