package org.betup.ui.fragment.bets;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import com.vk.sdk.api.model.VKAttachments;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.ui.TabMenuItem;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.bets.adapter.BetsAdapter;
import org.betup.ui.fragment.bets.betlist.BetsListFragment;
import org.betup.ui.fragment.bets.betslip.BetslipFragment;
import org.betup.ui.fragment.bets.quiz.QuizResultsFragment;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: BetsFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J \u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u000eH\u0016J\b\u0010'\u001a\u00020\u000eH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006)²\u0006\n\u0010*\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/bets/BetsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/ui/fragment/bets/adapter/BetsAdapter$BetFragmentProvider;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/bets/BetsController;", "getController", "()Lorg/betup/ui/fragment/bets/BetsController;", "setController", "(Lorg/betup/ui/fragment/bets/BetsController;)V", "pager", "Landroidx/viewpager/widget/ViewPager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "getFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getFragmentTitle", "", "processBetPlaced", "message", "Lorg/betup/bus/BetlistUpdatedMessage;", "tryShowDeepLinkedBetDetail", "openBetId", "openBetOwnerUserId", "attempts", X3.i.u0, X3.i.t0, VastTagName.COMPANION, "app_release", "selectedTab"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetsFragment extends BaseFragment implements BetsAdapter.BetFragmentProvider {

    @Inject
    public BetsController controller;

    @BindView(R.id.pager)
    public ViewPager pager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BetsFragment newInstance(BetState betState, BetsPage betsPage) {
        return INSTANCE.newInstance(betState, betsPage);
    }

    @JvmStatic
    public static final BetsFragment newInstance(BetState betState, BetsPage betsPage, int i) {
        return INSTANCE.newInstance(betState, betsPage, i);
    }

    @JvmStatic
    public static final BetsFragment newInstance(BetState betState, BetsPage betsPage, int i, int i2) {
        return INSTANCE.newInstance(betState, betsPage, i, i2);
    }

    public final BetsController getController() {
        BetsController betsController = this.controller;
        if (betsController != null) {
            return betsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(BetsController betsController) {
        Intrinsics.checkNotNullParameter(betsController, "<set-?>");
        this.controller = betsController;
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
        View inflate = inflater.inflate(R.layout.fragment_challenge, container, false);
        ButterKnife.bind(this, inflate);
        updateMenuBars(getString(R.string.bets), TabMenuItem.BETS);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.compose_tab_bar);
        BetsAdapter betsAdapter = new BetsAdapter(getChildFragmentManager(), this);
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            viewPager.setAdapter(betsAdapter);
        }
        ViewPager viewPager2 = this.pager;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(2);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BetsFragment$onViewCreated$1(this, null), 3, null);
        ViewPager viewPager3 = this.pager;
        if (viewPager3 != null) {
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-461159882, true, new BetsFragment$onViewCreated$2$1(this)));
            viewPager3.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: org.betup.ui.fragment.bets.BetsFragment$onViewCreated$2$2
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int state) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int position) {
                    BetsFragment.this.getController().setNewBetsTab(position);
                }
            });
        }
        Bundle arguments = getArguments();
        final int i = arguments != null ? arguments.getInt("openBetId", 0) : 0;
        Bundle arguments2 = getArguments();
        final int i2 = arguments2 != null ? arguments2.getInt("openBetOwnerUserId", 0) : 0;
        if (i <= 0 || savedInstanceState != null) {
            return;
        }
        getController().setNewBetsTab(1);
        view.post(new Runnable() { // from class: org.betup.ui.fragment.bets.BetsFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BetsFragment.this.tryShowDeepLinkedBetDetail(i, i2, 0);
            }
        });
    }

    @Override // org.betup.ui.fragment.bets.adapter.BetsAdapter.BetFragmentProvider
    public Fragment getFragment(int position) {
        if (position == 0) {
            return BetslipFragment.INSTANCE.newInstance();
        }
        if (position == 1) {
            return new BetsListFragment();
        }
        if (position == 2) {
            return QuizResultsFragment.INSTANCE.newInstance();
        }
        return new BetsListFragment();
    }

    @Override // org.betup.ui.fragment.bets.adapter.BetsAdapter.BetFragmentProvider
    public String getFragmentTitle(int position) {
        if (position == 0) {
            String string = getString(R.string.drawer_my_bets);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (position == 1) {
            String string2 = getString(R.string.bets);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (position == 2) {
            String string3 = getString(R.string.quiz_results);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = getString(R.string.bets);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    /* compiled from: BetsFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/bets/BetsFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/bets/BetsFragment;", "betState", "Lorg/betup/model/remote/entity/bets/BetState;", "defaultPage", "Lorg/betup/ui/fragment/bets/BetsPage;", "openBetId", "", "openBetOwnerUserId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final BetsFragment newInstance(BetState betState, BetsPage betsPage) {
            return newInstance$default(this, betState, betsPage, 0, 0, 12, null);
        }

        @JvmStatic
        public final BetsFragment newInstance(BetState betState, BetsPage betsPage, int i) {
            return newInstance$default(this, betState, betsPage, i, 0, 8, null);
        }

        private Companion() {
        }

        public static /* synthetic */ BetsFragment newInstance$default(Companion companion, BetState betState, BetsPage betsPage, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = 0;
            }
            return companion.newInstance(betState, betsPage, i, i2);
        }

        @JvmStatic
        public final BetsFragment newInstance(BetState betState, BetsPage defaultPage, int openBetId, int openBetOwnerUserId) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("state", betState);
            bundle.putSerializable(VKAttachments.TYPE_WIKI_PAGE, defaultPage);
            if (openBetId > 0) {
                bundle.putInt("openBetId", openBetId);
            }
            if (openBetOwnerUserId > 0) {
                bundle.putInt("openBetOwnerUserId", openBetOwnerUserId);
            }
            BetsFragment betsFragment = new BetsFragment();
            betsFragment.setArguments(bundle);
            return betsFragment;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processBetPlaced(BetlistUpdatedMessage message) {
        ViewPager viewPager;
        if (isActive() && (viewPager = this.pager) != null) {
            Intrinsics.checkNotNull(viewPager);
            if (viewPager.getCurrentItem() != 1) {
                ViewPager viewPager2 = this.pager;
                Intrinsics.checkNotNull(viewPager2);
                viewPager2.setCurrentItem(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryShowDeepLinkedBetDetail(final int openBetId, final int openBetOwnerUserId, final int attempts) {
        View view = getView();
        if (view != null && attempts < 25) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BetsListFragment) {
                    arrayList.add(obj);
                }
            }
            BetsListFragment betsListFragment = (BetsListFragment) CollectionsKt.firstOrNull((List) arrayList);
            if (betsListFragment != null) {
                betsListFragment.showBetDetailDialogForDeepLink(openBetId, openBetOwnerUserId);
            } else {
                view.postDelayed(new Runnable() { // from class: org.betup.ui.fragment.bets.BetsFragment$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BetsFragment.tryShowDeepLinkedBetDetail$lambda$2(BetsFragment.this, openBetId, openBetOwnerUserId, attempts);
                    }
                }, 50L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowDeepLinkedBetDetail$lambda$2(BetsFragment betsFragment, int i, int i2, int i3) {
        betsFragment.tryShowDeepLinkedBetDetail(i, i2, i3 + 1);
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }
}
