package org.betup.ui.fragment.flashbet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.ui.BackPressedController;
import org.betup.ui.TabMenuItem;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.flashbet.controller.FlashBetGameController;
import org.betup.utils.FlashBetImmersiveSessionGuard;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: FlashBetGameFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010#\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\u000eH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetGameFragment;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetGameController;", "getController", "()Lorg/betup/ui/fragment/flashbet/controller/FlashBetGameController;", "setController", "(Lorg/betup/ui/fragment/flashbet/controller/FlashBetGameController;)V", "backPressedController", "Lorg/betup/ui/BackPressedController;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "navigateToLeaguesSelection", "sportId", "", FlashBetGameFragment.ARG_SPORT_NAME, "onStart", "onStop", X3.i.u0, X3.i.t0, "onBackPressed", "", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "showLeaveConfirmDialog", "goBackToFlashBetListAndShowSessionExpiredDialog", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetGameFragment extends BaseFragment implements BackPressedController.BackPressedListener {
    private static final String ARG_CATEGORY_LOGO_URL = "categoryLogoUrl";
    private static final String ARG_CATEGORY_NAME = "categoryName";
    private static final String ARG_CATEGORY_PHOTO_URL = "categoryPhotoUrl";
    private static final String ARG_SESSION_ID = "sessionId";
    private static final String ARG_SPORT_ID = "sportId";
    private static final String ARG_SPORT_NAME = "sportName";
    private BackPressedController backPressedController;

    @Inject
    public FlashBetGameController controller;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final FlashBetGameController getController() {
        FlashBetGameController flashBetGameController = this.controller;
        if (flashBetGameController != null) {
            return flashBetGameController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(FlashBetGameController flashBetGameController) {
        Intrinsics.checkNotNullParameter(flashBetGameController, "<set-?>");
        this.controller = flashBetGameController;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        String string = requireArguments().getString(ARG_SESSION_ID);
        String str = string == null ? "" : string;
        String string2 = requireArguments().getString(ARG_CATEGORY_NAME);
        String str2 = string2 == null ? "" : string2;
        String string3 = requireArguments().getString(ARG_CATEGORY_LOGO_URL);
        String str3 = string3 == null ? "" : string3;
        String string4 = requireArguments().getString(ARG_CATEGORY_PHOTO_URL);
        String str4 = string4 == null ? "" : string4;
        String string5 = requireArguments().getString("sportId");
        String str5 = string5 == null ? "" : string5;
        String string6 = requireArguments().getString(ARG_SPORT_NAME);
        String str6 = string6 == null ? "" : string6;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1604350555, true, new FlashBetGameFragment$onCreateView$1$1(str, str2, str3, str4, str5, this, str6)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToLeaguesSelection(String sportId, String sportName) {
        FragmentActivity activity;
        if (isAdded() && (activity = getActivity()) != null) {
            FlashBetFragmentNavigation.INSTANCE.popToFlashBetList(activity);
            Bundle bundle = new Bundle();
            bundle.putString("sportId", sportId);
            bundle.putString(ARG_SPORT_NAME, sportName);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.FLASH_BET_CATEGORIES, bundle));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FlashBetImmersiveSessionGuard.enter();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        FlashBetImmersiveSessionGuard.exit();
        super.onStop();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KeyEventDispatcher.Component activity = getActivity();
        BackPressedController backPressedController = activity instanceof BackPressedController ? (BackPressedController) activity : null;
        this.backPressedController = backPressedController;
        if (backPressedController != null) {
            backPressedController.setOnBackPressedListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
        this.backPressedController = null;
        super.onPause();
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        showLeaveConfirmDialog();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(ARG_CATEGORY_NAME)) == null) {
            string = getString(R.string.flash_bet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        updateMenuBars(string, TabMenuItem.NONE);
        FlashBetGameController controller = getController();
        String string2 = requireArguments().getString(ARG_SESSION_ID);
        if (string2 == null) {
            string2 = "";
        }
        FlashBetGameController.loadSession$default(controller, string2, false, false, 6, null);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new OnBackPressedCallback() { // from class: org.betup.ui.fragment.flashbet.FlashBetGameFragment$onViewCreated$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FlashBetGameFragment.this.showLeaveConfirmDialog();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLeaveConfirmDialog() {
        if (!isAdded() || getParentFragmentManager().isStateSaved()) {
            return;
        }
        Bundle arguments = getArguments();
        FlashBetLeaveConfirmDialogFragment.INSTANCE.newInstance(arguments != null ? arguments.getString(ARG_SESSION_ID) : null).show(getParentFragmentManager(), "FlashBetLeaveConfirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goBackToFlashBetListAndShowSessionExpiredDialog() {
        FragmentActivity activity;
        if (isAdded() && (activity = getActivity()) != null) {
            FlashBetFragmentNavigation.INSTANCE.popToFlashBetList(activity);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            if (supportFragmentManager.isStateSaved()) {
                return;
            }
            FlashBetSessionExpiredDialogFragment.INSTANCE.newInstance().show(supportFragmentManager, "FlashBetSessionExpiredDialog");
        }
    }

    /* compiled from: FlashBetGameFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetGameFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_SESSION_ID", "", "ARG_CATEGORY_NAME", "ARG_CATEGORY_LOGO_URL", "ARG_CATEGORY_PHOTO_URL", "ARG_SPORT_ID", "ARG_SPORT_NAME", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/flashbet/FlashBetGameFragment;", FlashBetGameFragment.ARG_SESSION_ID, FlashBetGameFragment.ARG_CATEGORY_NAME, FlashBetGameFragment.ARG_CATEGORY_LOGO_URL, FlashBetGameFragment.ARG_CATEGORY_PHOTO_URL, "sportId", FlashBetGameFragment.ARG_SPORT_NAME, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FlashBetGameFragment newInstance(String sessionId, String categoryName, String categoryLogoUrl, String categoryPhotoUrl, String sportId, String sportName) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(categoryName, "categoryName");
            Intrinsics.checkNotNullParameter(categoryLogoUrl, "categoryLogoUrl");
            Intrinsics.checkNotNullParameter(categoryPhotoUrl, "categoryPhotoUrl");
            Intrinsics.checkNotNullParameter(sportId, "sportId");
            Intrinsics.checkNotNullParameter(sportName, "sportName");
            FlashBetGameFragment flashBetGameFragment = new FlashBetGameFragment();
            Bundle bundle = new Bundle();
            bundle.putString(FlashBetGameFragment.ARG_SESSION_ID, sessionId);
            bundle.putString(FlashBetGameFragment.ARG_CATEGORY_NAME, categoryName);
            bundle.putString(FlashBetGameFragment.ARG_CATEGORY_LOGO_URL, categoryLogoUrl);
            bundle.putString(FlashBetGameFragment.ARG_CATEGORY_PHOTO_URL, categoryPhotoUrl);
            bundle.putString("sportId", sportId);
            bundle.putString(FlashBetGameFragment.ARG_SPORT_NAME, sportName);
            flashBetGameFragment.setArguments(bundle);
            return flashBetGameFragment;
        }
    }
}
