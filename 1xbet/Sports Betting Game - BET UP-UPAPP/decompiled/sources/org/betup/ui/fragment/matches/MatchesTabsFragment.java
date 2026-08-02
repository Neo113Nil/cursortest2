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
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: MatchesTabsFragment.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\b\u0010+\u001a\u00020\u0014H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-²\u0006\u0010\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000200X\u008a\u0084\u0002²\u0006\u0010\u00102\u001a\b\u0012\u0004\u0012\u0002030/X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0004\u0018\u000107X\u008a\u0084\u0002²\u0006\n\u00108\u001a\u000207X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"Lorg/betup/ui/fragment/matches/MatchesTabsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/matches/MatchesController;", "getController", "()Lorg/betup/ui/fragment/matches/MatchesController;", "setController", "(Lorg/betup/ui/fragment/matches/MatchesController;)V", "appLanguageObserver", "Lorg/betup/services/language/AppLanguageObserver;", "getAppLanguageObserver", "()Lorg/betup/services/language/AppLanguageObserver;", "setAppLanguageObserver", "(Lorg/betup/services/language/AppLanguageObserver;)V", "backPressedController", "Lorg/betup/ui/BackPressedController;", "isSearchExpanded", "", "savedFirstVisibleItemIndex", "", "savedFirstVisibleItemScrollOffset", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", X3.i.u0, X3.i.t0, "onStop", "onDestroy", "onBackPressed", VastTagName.COMPANION, "app_release", "filterList", "", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "selectedFilter", "items", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "isLoading", "isLoadingMore", "error", "", "query", "hasMore"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchesTabsFragment extends BaseFragment implements BackPressedController.BackPressedListener {
    private static final String KEY_LIST_FIRST_INDEX = "sports_list_first_index";
    private static final String KEY_LIST_FIRST_OFFSET = "sports_list_first_offset";

    @Inject
    public AppLanguageObserver appLanguageObserver;
    private BackPressedController backPressedController;

    @Inject
    public MatchesController controller;
    private boolean isSearchExpanded;
    private int savedFirstVisibleItemIndex;
    private int savedFirstVisibleItemScrollOffset;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final MatchesController getController() {
        MatchesController matchesController = this.controller;
        if (matchesController != null) {
            return matchesController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(MatchesController matchesController) {
        Intrinsics.checkNotNullParameter(matchesController, "<set-?>");
        this.controller = matchesController;
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
        this.savedFirstVisibleItemIndex = savedInstanceState != null ? savedInstanceState.getInt(KEY_LIST_FIRST_INDEX) : 0;
        this.savedFirstVisibleItemScrollOffset = savedInstanceState != null ? savedInstanceState.getInt(KEY_LIST_FIRST_OFFSET) : 0;
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_LIST_FIRST_INDEX, this.savedFirstVisibleItemIndex);
        outState.putInt(KEY_LIST_FIRST_OFFSET, this.savedFirstVisibleItemScrollOffset);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-605666149, true, new MatchesTabsFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MatchesController controller = getController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.bind(requireContext);
        updateMenuBars(getString(R.string.bottom_menu_matches), TabMenuItem.MATCHES);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Log.d("MatchesTabsFragment", "onStart called");
        if (!getController().isControllerActive()) {
            Log.d("MatchesTabsFragment", "Controller not active, rebinding");
            MatchesController controller = getController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            controller.bind(requireContext);
            return;
        }
        Log.d("MatchesTabsFragment", "Controller already active, skipping rebind");
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.d("MatchesTabsFragment", "onResume called");
        if (getAppLanguageObserver().wasLanguageRecentlyChanged()) {
            getController().refresh();
            getAppLanguageObserver().markLanguageChangeHandled();
        }
        if (!getController().isControllerActive()) {
            Log.d("MatchesTabsFragment", "Controller not active in onResume, rebinding");
            MatchesController controller = getController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            controller.bind(requireContext);
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
            Log.e("MatchesTabsFragment", "Activity must implement BackPressedController");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.d("MatchesTabsFragment", "onPause called");
        getController().setInactive();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Log.d("MatchesTabsFragment", "onStop called");
        getController().setInactive();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.d("MatchesTabsFragment", "onDestroy called");
        getController().unbind();
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        Log.d("MatchesTabsFragment", "onBackPressed called, isSearchExpanded: " + this.isSearchExpanded);
        if (this.isSearchExpanded) {
            getController().resetSearchState();
            getController().refresh();
            this.isSearchExpanded = false;
        }
        return true;
    }

    /* compiled from: MatchesTabsFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/ui/fragment/matches/MatchesTabsFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "KEY_LIST_FIRST_INDEX", "", "KEY_LIST_FIRST_OFFSET", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/matches/MatchesTabsFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MatchesTabsFragment newInstance() {
            return new MatchesTabsFragment();
        }
    }
}
