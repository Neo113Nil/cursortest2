package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.controller.LeagueSelectionController;
import org.betup.ui.dialogs.events.BattleBackToSportsEvent;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SelectLeagueDialogFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u000e\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lorg/betup/ui/dialogs/SelectLeagueDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/dialogs/controller/LeagueSelectionController;", "getController", "()Lorg/betup/ui/dialogs/controller/LeagueSelectionController;", "setController", "(Lorg/betup/ui/dialogs/controller/LeagueSelectionController;)V", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "", "userId", "", "Ljava/lang/Long;", "forChallenges", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "updateUserId", "newUserId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectLeagueDialogFragment extends DialogFragment {
    public static final int $stable = 8;

    @Inject
    public LeagueSelectionController controller;
    private boolean forChallenges;
    private int sportId;
    private Long userId;

    public final LeagueSelectionController getController() {
        LeagueSelectionController leagueSelectionController = this.controller;
        if (leagueSelectionController != null) {
            return leagueSelectionController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(LeagueSelectionController leagueSelectionController) {
        Intrinsics.checkNotNullParameter(leagueSelectionController, "<set-?>");
        this.controller = leagueSelectionController;
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
        this.sportId = arguments != null ? arguments.getInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID) : 0;
        Bundle arguments2 = getArguments();
        Long valueOf = arguments2 != null ? Long.valueOf(arguments2.getLong("userId", -1L)) : null;
        this.userId = (valueOf == null || valueOf.longValue() != -1) ? valueOf : null;
        Bundle arguments3 = getArguments();
        this.forChallenges = arguments3 != null ? arguments3.getBoolean("forChallenges") : false;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-765252743, true, new SelectLeagueDialogFragment$onCreateView$2$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LeagueSelectionController controller = getController();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        Function0<Unit> function0 = new Function0() { // from class: org.betup.ui.dialogs.SelectLeagueDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onViewCreated$lambda$2;
                onViewCreated$lambda$2 = SelectLeagueDialogFragment.onViewCreated$lambda$2(SelectLeagueDialogFragment.this);
                return onViewCreated$lambda$2;
            }
        };
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.bind((MainActivity) requireActivity, function0, requireContext, this.sportId, this.userId, this.forChallenges);
        getController().resetAndLoad(this.sportId, this.userId, this.forChallenges);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: org.betup.ui.dialogs.SelectLeagueDialogFragment$onViewCreated$2
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                Long l;
                EventBus eventBus = EventBus.getDefault();
                l = SelectLeagueDialogFragment.this.userId;
                eventBus.post(new BattleBackToSportsEvent(l));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SelectLeagueDialogFragment selectLeagueDialogFragment) {
        selectLeagueDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
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

    public final void updateUserId(long newUserId) {
        this.userId = Long.valueOf(newUserId);
        getController().updateUserId(newUserId);
    }
}
