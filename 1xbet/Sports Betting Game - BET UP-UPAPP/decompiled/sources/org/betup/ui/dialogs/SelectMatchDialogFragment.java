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
import org.betup.ui.dialogs.controller.MatchSelectionController;
import org.betup.ui.dialogs.events.BattleBackToLeaguesEvent;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SelectMatchDialogFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lorg/betup/ui/dialogs/SelectMatchDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/dialogs/controller/MatchSelectionController;", "getController", "()Lorg/betup/ui/dialogs/controller/MatchSelectionController;", "setController", "(Lorg/betup/ui/dialogs/controller/MatchSelectionController;)V", "leagueId", "", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "userId", "", "Ljava/lang/Long;", "allSportId", "allLeagueId", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "updateUserId", "newUserId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectMatchDialogFragment extends DialogFragment {
    public static final int $stable = 8;
    private int allLeagueId;
    private int allSportId;

    @Inject
    public MatchSelectionController controller;
    private int leagueId;
    private int sportId;
    private Long userId;

    public final MatchSelectionController getController() {
        MatchSelectionController matchSelectionController = this.controller;
        if (matchSelectionController != null) {
            return matchSelectionController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(MatchSelectionController matchSelectionController) {
        Intrinsics.checkNotNullParameter(matchSelectionController, "<set-?>");
        this.controller = matchSelectionController;
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
        this.leagueId = arguments != null ? arguments.getInt("leagueId") : 0;
        Bundle arguments2 = getArguments();
        this.sportId = arguments2 != null ? arguments2.getInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID) : 0;
        Bundle arguments3 = getArguments();
        Long valueOf = arguments3 != null ? Long.valueOf(arguments3.getLong("userId", -1L)) : null;
        this.userId = (valueOf == null || valueOf.longValue() != -1) ? valueOf : null;
        this.allSportId = this.sportId;
        this.allLeagueId = this.leagueId;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-661607467, true, new SelectMatchDialogFragment$onCreateView$2$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MatchSelectionController controller = getController();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        Function0<Unit> function0 = new Function0() { // from class: org.betup.ui.dialogs.SelectMatchDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onViewCreated$lambda$2;
                onViewCreated$lambda$2 = SelectMatchDialogFragment.onViewCreated$lambda$2(SelectMatchDialogFragment.this);
                return onViewCreated$lambda$2;
            }
        };
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.bind((MainActivity) requireActivity, function0, requireContext, this.leagueId, this.userId);
        getController().resetAndLoad(this.leagueId, this.userId);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: org.betup.ui.dialogs.SelectMatchDialogFragment$onViewCreated$2
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                int i;
                Long l;
                EventBus eventBus = EventBus.getDefault();
                i = SelectMatchDialogFragment.this.allSportId;
                l = SelectMatchDialogFragment.this.userId;
                eventBus.post(new BattleBackToLeaguesEvent(i, l));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SelectMatchDialogFragment selectMatchDialogFragment) {
        selectMatchDialogFragment.dismiss();
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
