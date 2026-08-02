package org.betup.ui.dialogs.fav;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.BasePagingController;
import org.betup.ui.fragment.matches.LeaguesController;
import org.betup.ui.fragment.matches.MatchesController;
import org.betup.ui.fragment.matches.TeamsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: EditFavouritesDialog.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00103\u001a\u00020&H\u0016J\b\u00104\u001a\u00020&H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00066²\u0006\u0010\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020;X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020;X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020;X\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010@\u001a\u00020;X\u008a\u008e\u0002²\u0006\f\u0010A\u001a\u0004\u0018\u000109X\u008a\u0084\u0002²\u0006\u0010\u0010B\u001a\b\u0012\u0004\u0012\u00020908X\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020;X\u008a\u0084\u0002²\u0006\n\u0010D\u001a\u00020;X\u008a\u0084\u0002²\u0006\n\u0010E\u001a\u00020;X\u008a\u0084\u0002²\u0006\n\u0010F\u001a\u00020?X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/fav/EditFavouritesDialog;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "matchesController", "Lorg/betup/ui/fragment/matches/MatchesController;", "getMatchesController", "()Lorg/betup/ui/fragment/matches/MatchesController;", "setMatchesController", "(Lorg/betup/ui/fragment/matches/MatchesController;)V", "leaguesController", "Lorg/betup/ui/fragment/matches/LeaguesController;", "getLeaguesController", "()Lorg/betup/ui/fragment/matches/LeaguesController;", "setLeaguesController", "(Lorg/betup/ui/fragment/matches/LeaguesController;)V", "teamsController", "Lorg/betup/ui/fragment/matches/TeamsController;", "getTeamsController", "()Lorg/betup/ui/fragment/matches/TeamsController;", "setTeamsController", "(Lorg/betup/ui/fragment/matches/TeamsController;)V", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "", "getSportId", "()Ljava/lang/Integer;", "setSportId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "myController", "Lorg/betup/ui/fragment/matches/BasePagingController;", "getMyController", "()Lorg/betup/ui/fragment/matches/BasePagingController;", "setMyController", "(Lorg/betup/ui/fragment/matches/BasePagingController;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onDestroyView", VastTagName.COMPANION, "app_release", "items", "", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "isLoad", "", "isLoadMore", "hasMoreI", "query", "", "isSportSelectionMode", "selectedSport", "itemsS", "isLoadS", "isLoadMoreS", "hasMoreS", "queryS"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EditFavouritesDialog extends DialogFragment {

    @Inject
    public LeaguesController leaguesController;

    @Inject
    public MatchesController matchesController;
    public BasePagingController myController;

    @Inject
    public TeamsController teamsController;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private Integer sportId = 22;
    private FavouriteTypeK favouriteType = FavouriteTypeK.Sports.INSTANCE;

    public final MatchesController getMatchesController() {
        MatchesController matchesController = this.matchesController;
        if (matchesController != null) {
            return matchesController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchesController");
        return null;
    }

    public final void setMatchesController(MatchesController matchesController) {
        Intrinsics.checkNotNullParameter(matchesController, "<set-?>");
        this.matchesController = matchesController;
    }

    public final LeaguesController getLeaguesController() {
        LeaguesController leaguesController = this.leaguesController;
        if (leaguesController != null) {
            return leaguesController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leaguesController");
        return null;
    }

    public final void setLeaguesController(LeaguesController leaguesController) {
        Intrinsics.checkNotNullParameter(leaguesController, "<set-?>");
        this.leaguesController = leaguesController;
    }

    public final TeamsController getTeamsController() {
        TeamsController teamsController = this.teamsController;
        if (teamsController != null) {
            return teamsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("teamsController");
        return null;
    }

    public final void setTeamsController(TeamsController teamsController) {
        Intrinsics.checkNotNullParameter(teamsController, "<set-?>");
        this.teamsController = teamsController;
    }

    public final Integer getSportId() {
        return this.sportId;
    }

    public final void setSportId(Integer num) {
        this.sportId = num;
    }

    public final BasePagingController getMyController() {
        BasePagingController basePagingController = this.myController;
        if (basePagingController != null) {
            return basePagingController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myController");
        return null;
    }

    public final void setMyController(BasePagingController basePagingController) {
        Intrinsics.checkNotNullParameter(basePagingController, "<set-?>");
        this.myController = basePagingController;
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
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-621624436, true, new EditFavouritesDialog$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TeamsController teamsController;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Log.d("EditFavouritesDialog", "onViewCreated - favouriteType: " + this.favouriteType);
        FavouriteTypeK favouriteTypeK = this.favouriteType;
        if (favouriteTypeK instanceof FavouriteTypeK.Sports) {
            MatchesController matchesController = getMatchesController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            matchesController.bind(requireContext);
            teamsController = matchesController;
        } else if (favouriteTypeK instanceof FavouriteTypeK.Leagues) {
            LeaguesController leaguesController = getLeaguesController();
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            leaguesController.bind(requireContext2, 22);
            teamsController = leaguesController;
        } else {
            if (!(favouriteTypeK instanceof FavouriteTypeK.Teams)) {
                throw new NoWhenBranchMatchedException();
            }
            TeamsController teamsController2 = getTeamsController();
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            teamsController2.bind(requireContext3, 22);
            teamsController = teamsController2;
        }
        setMyController(teamsController);
        MatchesController matchesController2 = getMatchesController();
        Context requireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
        matchesController2.bind(requireContext4);
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
        window.setDimAmount(0.6f);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getMatchesController().unbind();
        getLeaguesController().unbind();
    }

    /* compiled from: EditFavouritesDialog.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/dialogs/fav/EditFavouritesDialog$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/fav/EditFavouritesDialog;", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EditFavouritesDialog newInstance(FavouriteTypeK favouriteType) {
            Intrinsics.checkNotNullParameter(favouriteType, "favouriteType");
            Log.d("EditFavouritesDialog", "Creating new instance with type: " + favouriteType);
            EditFavouritesDialog editFavouritesDialog = new EditFavouritesDialog();
            editFavouritesDialog.favouriteType = favouriteType;
            Log.d("EditFavouritesDialog", "Set favouriteType to: " + editFavouritesDialog.favouriteType);
            return editFavouritesDialog;
        }
    }
}
