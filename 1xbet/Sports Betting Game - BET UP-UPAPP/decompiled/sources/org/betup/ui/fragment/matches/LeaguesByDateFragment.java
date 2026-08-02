package org.betup.ui.fragment.matches;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.KeyEventDispatcher;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.services.language.AppLanguageObserver;
import org.betup.ui.BackPressedController;
import org.betup.ui.TabMenuItem;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: LeaguesByDateFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010'\u001a\u00020\u001cH\u0016J\b\u0010(\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\u0010\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u0004\u0018\u00010/X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u00108\u001a\u000209X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020\u001aX\u008a\u008e\u0002"}, d2 = {"Lorg/betup/ui/fragment/matches/LeaguesByDateFragment;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/matches/LeaguesByDateController;", "getController", "()Lorg/betup/ui/fragment/matches/LeaguesByDateController;", "setController", "(Lorg/betup/ui/fragment/matches/LeaguesByDateController;)V", "dateFilterState", "Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "getDateFilterState", "()Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "setDateFilterState", "(Lorg/betup/ui/fragment/matches/filter/DateFilterState;)V", "appLanguageObserver", "Lorg/betup/services/language/AppLanguageObserver;", "getAppLanguageObserver", "()Lorg/betup/services/language/AppLanguageObserver;", "setAppLanguageObserver", "(Lorg/betup/services/language/AppLanguageObserver;)V", "backPressedController", "Lorg/betup/ui/BackPressedController;", "isSearchExpanded", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", X3.i.u0, X3.i.t0, "onDestroy", "onBackPressed", VastTagName.COMPANION, "app_release", LeaguesByDateFragment.SELECTED_DATE, "", "items", "", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "isLoading", "isLoadingMore", "error", "query", "hasMore", "swipeStartX", "", "hasSwiped"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LeaguesByDateFragment extends BaseFragment implements BackPressedController.BackPressedListener {
    private static final String SELECTED_DATE = "selectedDate";
    private static final String SPORT_ID = "sportId";

    @Inject
    public AppLanguageObserver appLanguageObserver;
    private BackPressedController backPressedController;

    @Inject
    public LeaguesByDateController controller;

    @Inject
    public DateFilterState dateFilterState;
    private boolean isSearchExpanded;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final LeaguesByDateController getController() {
        LeaguesByDateController leaguesByDateController = this.controller;
        if (leaguesByDateController != null) {
            return leaguesByDateController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(LeaguesByDateController leaguesByDateController) {
        Intrinsics.checkNotNullParameter(leaguesByDateController, "<set-?>");
        this.controller = leaguesByDateController;
    }

    public final DateFilterState getDateFilterState() {
        DateFilterState dateFilterState = this.dateFilterState;
        if (dateFilterState != null) {
            return dateFilterState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dateFilterState");
        return null;
    }

    public final void setDateFilterState(DateFilterState dateFilterState) {
        Intrinsics.checkNotNullParameter(dateFilterState, "<set-?>");
        this.dateFilterState = dateFilterState;
    }

    public final AppLanguageObserver getAppLanguageObserver() {
        AppLanguageObserver appLanguageObserver = this.appLanguageObserver;
        if (appLanguageObserver != null) {
            return appLanguageObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appLanguageObserver");
        return null;
    }

    public final void setAppLanguageObserver(AppLanguageObserver appLanguageObserver) {
        Intrinsics.checkNotNullParameter(appLanguageObserver, "<set-?>");
        this.appLanguageObserver = appLanguageObserver;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) application).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setBackgroundColor(0);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1776939163, true, new LeaguesByDateFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("sportId")) : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString(SELECTED_DATE) : null;
        Log.d("LeaguesByDateFragment", "onViewCreated: sportId=" + valueOf + ", selectedDate=" + string);
        LeaguesByDateController controller = getController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.bind(requireContext, valueOf);
        if (string != null) {
            getController().performDateChange(string);
        }
        updateMenuBars(getString(R.string.bottom_menu_matches), TabMenuItem.MATCHES);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("sportId")) : null;
        if (getController().isControllerActive()) {
            return;
        }
        LeaguesByDateController controller = getController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.bind(requireContext, valueOf);
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("sportId")) : null;
        if (getAppLanguageObserver().wasLanguageRecentlyChanged()) {
            getController().refresh();
            getAppLanguageObserver().markLanguageChangeHandled();
        }
        if (!getController().isControllerActive()) {
            LeaguesByDateController controller = getController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            controller.bind(requireContext, valueOf);
        }
        try {
            KeyEventDispatcher.Component requireActivity = requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.BackPressedController");
            BackPressedController backPressedController = (BackPressedController) requireActivity;
            this.backPressedController = backPressedController;
            if (backPressedController != null) {
                backPressedController.setOnBackPressedListener(this);
            }
        } catch (ClassCastException unused) {
            Log.e("LeaguesByDateFragment", "Activity must implement BackPressedController");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getController().unbind();
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        if (!this.isSearchExpanded) {
            return false;
        }
        getController().resetSearchState();
        this.isSearchExpanded = false;
        return true;
    }

    /* compiled from: LeaguesByDateFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/matches/LeaguesByDateFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "SPORT_ID", "", "SELECTED_DATE", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/matches/LeaguesByDateFragment;", "sportId", "", "isLive", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LeaguesByDateFragment newInstance(int i) {
            return newInstance$default(this, i, false, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ LeaguesByDateFragment newInstance$default(Companion companion, int i, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return companion.newInstance(i, z);
        }

        public final LeaguesByDateFragment newInstance(int sportId, boolean isLive) {
            LeaguesByDateFragment leaguesByDateFragment = new LeaguesByDateFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("sportId", sportId);
            leaguesByDateFragment.setArguments(bundle);
            return leaguesByDateFragment;
        }
    }
}
