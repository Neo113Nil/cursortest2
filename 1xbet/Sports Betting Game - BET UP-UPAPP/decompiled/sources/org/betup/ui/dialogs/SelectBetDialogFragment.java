package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.MainActivity;
import org.betup.ui.base.SnackbarDialogFragment;
import org.betup.ui.dialogs.controller.BattleBetSelectionState;
import org.betup.ui.dialogs.controller.BetSelectionController;
import org.betup.ui.dialogs.events.BattleBackToMatchesEvent;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SelectBetDialogFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lorg/betup/ui/dialogs/SelectBetDialogFragment;", "Lorg/betup/ui/base/SnackbarDialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/dialogs/controller/BetSelectionController;", "getController", "()Lorg/betup/ui/dialogs/controller/BetSelectionController;", "setController", "(Lorg/betup/ui/dialogs/controller/BetSelectionController;)V", "matchId", "", "leagueId", "", "battleId", "Ljava/lang/Long;", "userId", "rematchBuyIn", "allSportId", "allLeagueId", "allMatchId", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onDestroyView", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectBetDialogFragment extends SnackbarDialogFragment {
    public static final int $stable = 8;
    private int allLeagueId;
    private long allMatchId;
    private int allSportId;
    private Long battleId;

    @Inject
    public BetSelectionController controller;
    private int leagueId;
    private long matchId;
    private Long rematchBuyIn;
    private Long userId;

    public final BetSelectionController getController() {
        BetSelectionController betSelectionController = this.controller;
        if (betSelectionController != null) {
            return betSelectionController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(BetSelectionController betSelectionController) {
        Intrinsics.checkNotNullParameter(betSelectionController, "<set-?>");
        this.controller = betSelectionController;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        this.matchId = arguments != null ? arguments.getLong("matchId") : 0L;
        Bundle arguments2 = getArguments();
        this.leagueId = arguments2 != null ? arguments2.getInt("leagueId") : 0;
        Bundle arguments3 = getArguments();
        Long l = null;
        this.battleId = arguments3 != null ? Long.valueOf(arguments3.getLong("battleId")) : null;
        Bundle arguments4 = getArguments();
        Long valueOf = arguments4 != null ? Long.valueOf(arguments4.getLong("userId", -1L)) : null;
        if (valueOf != null && valueOf.longValue() == -1) {
            valueOf = null;
        }
        this.userId = valueOf;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            Long valueOf2 = Long.valueOf(arguments5.getLong("rematchBuyIn", -1L));
            if (valueOf2.longValue() > 0) {
                l = valueOf2;
            }
        }
        this.rematchBuyIn = l;
        Bundle arguments6 = getArguments();
        this.allSportId = arguments6 != null ? arguments6.getInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID) : 0;
        this.allLeagueId = this.leagueId;
        this.allMatchId = this.matchId;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-446213059, true, new SelectBetDialogFragment$onCreateView$3$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        BattleBetSelectionState.CreateNewBattle createNewBattle;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        long j = this.matchId;
        if (j > 0) {
            Log.d("SelectBetDialogFragment", "Match ID: " + j + ", Battle ID: " + this.battleId + ", User ID: " + this.userId);
            BetSelectionController controller = getController();
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
            MainActivity mainActivity = (MainActivity) requireActivity;
            Function0<Unit> function0 = new Function0() { // from class: org.betup.ui.dialogs.SelectBetDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit onViewCreated$lambda$3;
                    onViewCreated$lambda$3 = SelectBetDialogFragment.onViewCreated$lambda$3(SelectBetDialogFragment.this);
                    return onViewCreated$lambda$3;
                }
            };
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            long j2 = this.matchId;
            Long l = this.battleId;
            if (l != null && (l == null || l.longValue() != 0)) {
                createNewBattle = new BattleBetSelectionState.JoinExistingBattle(R.string.join_battle, R.string.accept_battle);
            } else {
                createNewBattle = new BattleBetSelectionState.CreateNewBattle(R.string.create_battle, R.string.create_battle);
            }
            controller.bind(mainActivity, function0, requireContext, j2, l, createNewBattle, this.userId, this.rematchBuyIn, new Function1() { // from class: org.betup.ui.dialogs.SelectBetDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onViewCreated$lambda$4;
                    onViewCreated$lambda$4 = SelectBetDialogFragment.onViewCreated$lambda$4(SelectBetDialogFragment.this, (CharSequence) obj);
                    return onViewCreated$lambda$4;
                }
            });
            getController().resetAndLoad(this.matchId, this.battleId, this.userId);
        }
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: org.betup.ui.dialogs.SelectBetDialogFragment$onViewCreated$3
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                int i;
                int i2;
                Long l2;
                EventBus eventBus = EventBus.getDefault();
                i = SelectBetDialogFragment.this.allLeagueId;
                i2 = SelectBetDialogFragment.this.allSportId;
                l2 = SelectBetDialogFragment.this.userId;
                eventBus.post(new BattleBackToMatchesEvent(i, i2, l2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(SelectBetDialogFragment selectBetDialogFragment) {
        selectBetDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(SelectBetDialogFragment selectBetDialogFragment, CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SnackbarDialogFragment.showSnackbar$default(selectBetDialogFragment, message, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.base.SnackbarDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.5f);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
