package org.betup.ui.fragment.search;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.services.search.RecentSearchesService;
import org.betup.ui.fragment.BaseFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewSearchFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/search/NewSearchFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "searchController", "Lorg/betup/ui/fragment/search/controller/SearchController;", "getSearchController", "()Lorg/betup/ui/fragment/search/controller/SearchController;", "setSearchController", "(Lorg/betup/ui/fragment/search/controller/SearchController;)V", "recentSearchesService", "Lorg/betup/services/search/RecentSearchesService;", "getRecentSearchesService", "()Lorg/betup/services/search/RecentSearchesService;", "setRecentSearchesService", "(Lorg/betup/services/search/RecentSearchesService;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NewSearchFragment extends BaseFragment {
    public static final int $stable = 8;

    @Inject
    public RecentSearchesService recentSearchesService;

    @Inject
    public org.betup.ui.fragment.search.controller.SearchController searchController;

    public final org.betup.ui.fragment.search.controller.SearchController getSearchController() {
        org.betup.ui.fragment.search.controller.SearchController searchController = this.searchController;
        if (searchController != null) {
            return searchController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchController");
        return null;
    }

    public final void setSearchController(org.betup.ui.fragment.search.controller.SearchController searchController) {
        Intrinsics.checkNotNullParameter(searchController, "<set-?>");
        this.searchController = searchController;
    }

    public final RecentSearchesService getRecentSearchesService() {
        RecentSearchesService recentSearchesService = this.recentSearchesService;
        if (recentSearchesService != null) {
            return recentSearchesService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recentSearchesService");
        return null;
    }

    public final void setRecentSearchesService(RecentSearchesService recentSearchesService) {
        Intrinsics.checkNotNullParameter(recentSearchesService, "<set-?>");
        this.recentSearchesService = recentSearchesService;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1820560382, true, new NewSearchFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        org.betup.ui.fragment.search.controller.SearchController searchController = getSearchController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        searchController.initialize(requireContext);
    }
}
