package org.betup.ui.fragment.flashbet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.FlashBetGameFinishedMessage;
import org.betup.ui.TabMenuItem;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.flashbet.controller.FlashBetCategoriesController;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: FlashBetCategoriesFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetCategoriesFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "flashBetCategoriesController", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesController;", "getFlashBetCategoriesController", "()Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesController;", "setFlashBetCategoriesController", "(Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesController;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDestroy", "onFlashBetGameFinished", "event", "Lorg/betup/bus/FlashBetGameFinishedMessage;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetCategoriesFragment extends BaseFragment {
    private static final String ARG_SPORT_ID = "sportId";
    private static final String ARG_SPORT_NAME = "sportName";

    @Inject
    public FlashBetCategoriesController flashBetCategoriesController;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final FlashBetCategoriesController getFlashBetCategoriesController() {
        FlashBetCategoriesController flashBetCategoriesController = this.flashBetCategoriesController;
        if (flashBetCategoriesController != null) {
            return flashBetCategoriesController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flashBetCategoriesController");
        return null;
    }

    public final void setFlashBetCategoriesController(FlashBetCategoriesController flashBetCategoriesController) {
        Intrinsics.checkNotNullParameter(flashBetCategoriesController, "<set-?>");
        this.flashBetCategoriesController = flashBetCategoriesController;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onFlashBetGameFinished(FlashBetGameFinishedMessage event) {
        String string;
        Intrinsics.checkNotNullParameter(event, "event");
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("sportId")) == null) {
            return;
        }
        getFlashBetCategoriesController().loadCategories(string, true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        String string = requireArguments().getString("sportId");
        if (string == null) {
            string = "";
        }
        String string2 = requireArguments().getString(ARG_SPORT_NAME);
        String str = string2 != null ? string2 : "";
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(196807781, true, new FlashBetCategoriesFragment$onCreateView$1$1(this, string, str)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String string = requireArguments().getString(ARG_SPORT_NAME);
        if (string == null) {
            string = getString(R.string.flash_bet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        updateMenuBars(string, TabMenuItem.NONE);
    }

    /* compiled from: FlashBetCategoriesFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetCategoriesFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_SPORT_ID", "", "ARG_SPORT_NAME", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/flashbet/FlashBetCategoriesFragment;", "sportId", FlashBetCategoriesFragment.ARG_SPORT_NAME, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FlashBetCategoriesFragment newInstance(String sportId, String sportName) {
            Intrinsics.checkNotNullParameter(sportId, "sportId");
            Intrinsics.checkNotNullParameter(sportName, "sportName");
            FlashBetCategoriesFragment flashBetCategoriesFragment = new FlashBetCategoriesFragment();
            Bundle bundle = new Bundle();
            bundle.putString("sportId", sportId);
            bundle.putString(FlashBetCategoriesFragment.ARG_SPORT_NAME, sportName);
            flashBetCategoriesFragment.setArguments(bundle);
            return flashBetCategoriesFragment;
        }
    }
}
