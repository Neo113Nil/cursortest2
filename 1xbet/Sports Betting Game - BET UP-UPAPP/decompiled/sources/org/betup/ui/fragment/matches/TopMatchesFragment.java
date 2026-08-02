package org.betup.ui.fragment.matches;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.model.local.entity.BetPresentation;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.rest.matches.HotMatchesInteractor;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.ui.BackPressedController;
import org.betup.ui.TabMenuItem;
import org.betup.ui.dialogs.OneClickBetSettingsDialogFragment;
import org.betup.ui.fragment.BaseAnimatedFragment;
import org.betup.ui.fragment.matches.adapter.TopMatchesPagerAdapter;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: TopMatchesFragment.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J$\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u0010;\u001a\u0002032\u0006\u0010<\u001a\u000205H\u0016J\u001a\u0010=\u001a\u0002032\u0006\u0010>\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0010\u0010?\u001a\u0002032\u0006\u0010@\u001a\u00020/H\u0002J\b\u0010A\u001a\u000203H\u0002J\u0010\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DH\u0014J\u001a\u0010E\u001a\u0002032\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020IH\u0014J\b\u0010J\u001a\u00020IH\u0016J\b\u0010K\u001a\u000203H\u0016J\b\u0010L\u001a\u000203H\u0016J\b\u0010M\u001a\u000203H\u0007J\b\u0010N\u001a\u000203H\u0002J\b\u0010O\u001a\u000203H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q²\u0006\n\u0010R\u001a\u00020/X\u008a\u008e\u0002"}, d2 = {"Lorg/betup/ui/fragment/matches/TopMatchesFragment;", "Lorg/betup/ui/fragment/BaseAnimatedFragment;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "expandButton", "Landroid/widget/ImageView;", "getExpandButton", "()Landroid/widget/ImageView;", "setExpandButton", "(Landroid/widget/ImageView;)V", "oneClickBetIv", "getOneClickBetIv", "setOneClickBetIv", "expandContainer", "Landroid/view/View;", "getExpandContainer", "()Landroid/view/View;", "setExpandContainer", "(Landroid/view/View;)V", "tabBarCompose", "Landroidx/compose/ui/platform/ComposeView;", "getTabBarCompose", "()Landroidx/compose/ui/platform/ComposeView;", "setTabBarCompose", "(Landroidx/compose/ui/platform/ComposeView;)V", "pager", "Landroidx/viewpager/widget/ViewPager;", "getPager", "()Landroidx/viewpager/widget/ViewPager;", "setPager", "(Landroidx/viewpager/widget/ViewPager;)V", "hotMatchesInteractor", "Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;", "getHotMatchesInteractor", "()Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;", "setHotMatchesInteractor", "(Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;)V", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "getLocalPreferencesService", "()Lorg/betup/services/storage/LocalPreferencesService;", "setLocalPreferencesService", "(Lorg/betup/services/storage/LocalPreferencesService;)V", "backPressedController", "Lorg/betup/ui/BackPressedController;", "selectedTab", "", "betPresentation", "Lorg/betup/model/local/entity/BetPresentation;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewReady", ViewHierarchyConstants.VIEW_KEY, "switchToTab", "index", "updateTabContent", "onFragmentAttached", "context", "Landroid/content/Context;", "onUserReady", "userModel", "Lorg/betup/model/local/entity/FullUserProfileModel;", "success", "", "onBackPressed", X3.i.u0, X3.i.t0, "onExpandButtonClick", "updateExpandButtonIcon", "updateOneClickBetIcon", VastTagName.COMPANION, "app_release", "currentTab"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopMatchesFragment extends BaseAnimatedFragment implements BackPressedController.BackPressedListener {
    private static final String ARG_INITIAL_TAB = "initialTab";
    private static final String KEY_SELECTED_TAB = "selected_tab";
    private BackPressedController backPressedController;
    private BetPresentation betPresentation = BetPresentation.SHORT;

    @BindView(R.id.expandButton)
    public ImageView expandButton;

    @BindView(R.id.expandContainer)
    public View expandContainer;

    @Inject
    public HotMatchesInteractor hotMatchesInteractor;

    @Inject
    public LocalPreferencesService localPreferencesService;

    @BindView(R.id.one_click_bet_iv)
    public ImageView oneClickBetIv;

    @BindView(R.id.topMatchesPager)
    public ViewPager pager;
    private int selectedTab;

    @BindView(R.id.tabBarCompose)
    public ComposeView tabBarCompose;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TopMatchesFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/matches/TopMatchesFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "KEY_SELECTED_TAB", "", "ARG_INITIAL_TAB", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/matches/TopMatchesFragment;", TopMatchesFragment.ARG_INITIAL_TAB, "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ TopMatchesFragment newInstance$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return companion.newInstance(i);
        }

        public final TopMatchesFragment newInstance(int initialTab) {
            TopMatchesFragment topMatchesFragment = new TopMatchesFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(TopMatchesFragment.ARG_INITIAL_TAB, RangesKt.coerceIn(initialTab, 0, 1));
            topMatchesFragment.setArguments(bundle);
            return topMatchesFragment;
        }
    }

    public final ImageView getExpandButton() {
        ImageView imageView = this.expandButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandButton");
        return null;
    }

    public final void setExpandButton(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.expandButton = imageView;
    }

    public final ImageView getOneClickBetIv() {
        ImageView imageView = this.oneClickBetIv;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("oneClickBetIv");
        return null;
    }

    public final void setOneClickBetIv(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.oneClickBetIv = imageView;
    }

    public final View getExpandContainer() {
        View view = this.expandContainer;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandContainer");
        return null;
    }

    public final void setExpandContainer(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.expandContainer = view;
    }

    public final ComposeView getTabBarCompose() {
        ComposeView composeView = this.tabBarCompose;
        if (composeView != null) {
            return composeView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tabBarCompose");
        return null;
    }

    public final void setTabBarCompose(ComposeView composeView) {
        Intrinsics.checkNotNullParameter(composeView, "<set-?>");
        this.tabBarCompose = composeView;
    }

    public final ViewPager getPager() {
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            return viewPager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pager");
        return null;
    }

    public final void setPager(ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "<set-?>");
        this.pager = viewPager;
    }

    public final HotMatchesInteractor getHotMatchesInteractor() {
        HotMatchesInteractor hotMatchesInteractor = this.hotMatchesInteractor;
        if (hotMatchesInteractor != null) {
            return hotMatchesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hotMatchesInteractor");
        return null;
    }

    public final void setHotMatchesInteractor(HotMatchesInteractor hotMatchesInteractor) {
        Intrinsics.checkNotNullParameter(hotMatchesInteractor, "<set-?>");
        this.hotMatchesInteractor = hotMatchesInteractor;
    }

    public final LocalPreferencesService getLocalPreferencesService() {
        LocalPreferencesService localPreferencesService = this.localPreferencesService;
        if (localPreferencesService != null) {
            return localPreferencesService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localPreferencesService");
        return null;
    }

    public final void setLocalPreferencesService(LocalPreferencesService localPreferencesService) {
        Intrinsics.checkNotNullParameter(localPreferencesService, "<set-?>");
        this.localPreferencesService = localPreferencesService;
    }

    @Override // org.betup.ui.fragment.BaseAnimatedFragment, org.betup.ui.fragment.BaseFragmentWithProfileInfo, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt(ARG_INITIAL_TAB, 0) : 0;
        if (savedInstanceState != null) {
            i = savedInstanceState.getInt(KEY_SELECTED_TAB);
        }
        this.selectedTab = i;
        this.betPresentation = getLocalPreferencesService().getGlobalExpandedBets() ? BetPresentation.FULL : BetPresentation.SHORT;
        setTabMenuType(TabMenuItem.MATCHES);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_top_matches, container, false);
        ButterKnife.bind(this, inflate);
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_SELECTED_TAB, this.selectedTab);
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onViewReady(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewReady(view, savedInstanceState);
        ViewPager pager = getPager();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        pager.setAdapter(new TopMatchesPagerAdapter(childFragmentManager));
        getPager().setOffscreenPageLimit(1);
        getPager().setCurrentItem(this.selectedTab);
        getPager().addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: org.betup.ui.fragment.matches.TopMatchesFragment$onViewReady$1
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                int i;
                i = TopMatchesFragment.this.selectedTab;
                if (i != position) {
                    TopMatchesFragment.this.selectedTab = position;
                    TopMatchesFragment.this.updateTabContent();
                }
            }
        });
        updateTabContent();
        updateExpandButtonIcon();
        getOneClickBetIv().setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.matches.TopMatchesFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TopMatchesFragment.onViewReady$lambda$1(TopMatchesFragment.this, view2);
            }
        });
        updateOneClickBetIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewReady$lambda$1(final TopMatchesFragment topMatchesFragment, View view) {
        OneClickBetSettingsDialogFragment.INSTANCE.newInstance(new Function0() { // from class: org.betup.ui.fragment.matches.TopMatchesFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onViewReady$lambda$1$lambda$0;
                onViewReady$lambda$1$lambda$0 = TopMatchesFragment.onViewReady$lambda$1$lambda$0(TopMatchesFragment.this);
                return onViewReady$lambda$1$lambda$0;
            }
        }).show(topMatchesFragment.getChildFragmentManager(), "OneClickBetSettingsDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewReady$lambda$1$lambda$0(TopMatchesFragment topMatchesFragment) {
        topMatchesFragment.updateOneClickBetIcon();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchToTab(int index) {
        if (this.selectedTab == index) {
            return;
        }
        this.selectedTab = index;
        getPager().setCurrentItem(index, true);
        updateTabContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTabContent() {
        getTabBarCompose().setContent(ComposableLambdaKt.composableLambdaInstance(26341022, true, new TopMatchesFragment$updateTabContent$1(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.betup.ui.fragment.BaseFragment
    protected void onFragmentAttached(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onFragmentAttached(context);
        BackPressedController backPressedController = context instanceof BackPressedController ? (BackPressedController) context : null;
        if (backPressedController == null) {
            throw new ClassCastException(context + " should implement BackPressedController");
        }
        this.backPressedController = backPressedController;
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onUserReady(FullUserProfileModel userModel, boolean success) {
        if (success) {
            isActive();
        }
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        getHotMatchesInteractor().invalidate(false);
        getHotMatchesInteractor().invalidate(true);
        return true;
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.setOnBackPressedListener(this);
        }
        updateExpandButtonIcon();
        updateOneClickBetIcon();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    @OnClick({R.id.expandButton, R.id.expandContainer})
    public final void onExpandButtonClick() {
        BetPresentation betPresentation;
        if (this.betPresentation == BetPresentation.SHORT) {
            betPresentation = BetPresentation.FULL;
        } else {
            betPresentation = BetPresentation.SHORT;
        }
        this.betPresentation = betPresentation;
        getLocalPreferencesService().saveGlobalExpandedBets(this.betPresentation == BetPresentation.FULL);
        updateExpandButtonIcon();
        getHotMatchesInteractor().invalidate(false);
        getHotMatchesInteractor().invalidate(true);
        EventBus.getDefault().post(new CoefficientUpdatedMessage());
    }

    private final void updateExpandButtonIcon() {
        getExpandButton().setImageResource(getLocalPreferencesService().getGlobalExpandedBets() || this.betPresentation == BetPresentation.FULL ? R.drawable.collapse_btn : R.drawable.expand_btn);
    }

    private final void updateOneClickBetIcon() {
        if (this.oneClickBetIv == null) {
            return;
        }
        try {
            UserProgressModel userProgressModel = getUserService().getShortProfile().getUserProgressModel();
            if (userProgressModel != null) {
                userProgressModel.isOneClickBetUnlocked();
            }
        } catch (Exception unused) {
        }
        getOneClickBetIv().setImageResource(getLocalPreferencesService().isOneClickBetEnabled(getUserService().getBetupUserIdOrZero()) ? R.drawable.flash_selected : R.drawable.flash_unselected);
    }
}
