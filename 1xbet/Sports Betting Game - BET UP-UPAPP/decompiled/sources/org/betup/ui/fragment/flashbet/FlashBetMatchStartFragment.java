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
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.BackPressedController;
import org.betup.ui.TabMenuItem;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt;
import org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartUiState;
import org.betup.ui.fragment.flashbet.controller.FlashBetMatchStartController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: FlashBetMatchStartFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetMatchStartFragment;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetMatchStartController;", "getController", "()Lorg/betup/ui/fragment/flashbet/controller/FlashBetMatchStartController;", "setController", "(Lorg/betup/ui/fragment/flashbet/controller/FlashBetMatchStartController;)V", "backPressedController", "Lorg/betup/ui/BackPressedController;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, X3.i.u0, X3.i.t0, "onBackPressed", "", "showLeaveConfirmDialog", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetMatchStartFragment extends BaseFragment implements BackPressedController.BackPressedListener {
    private static final String ARG_CATEGORY_ID = "categoryId";
    private static final String ARG_CATEGORY_LOGO_URL = "categoryLogoUrl";
    private static final String ARG_CATEGORY_NAME = "categoryName";
    private static final String ARG_CATEGORY_PHOTO_URL = "categoryPhotoUrl";
    private static final String ARG_ENTRY_FEE = "entryFee";
    private static final String ARG_SPORT_ID = "sportId";
    private static final String ARG_SPORT_NAME = "sportName";
    private BackPressedController backPressedController;

    @Inject
    public FlashBetMatchStartController controller;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final FlashBetMatchStartController getController() {
        FlashBetMatchStartController flashBetMatchStartController = this.controller;
        if (flashBetMatchStartController != null) {
            return flashBetMatchStartController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(FlashBetMatchStartController flashBetMatchStartController) {
        Intrinsics.checkNotNullParameter(flashBetMatchStartController, "<set-?>");
        this.controller = flashBetMatchStartController;
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
        String string = requireArguments().getString("sportId");
        String str = string == null ? "" : string;
        String string2 = requireArguments().getString(ARG_SPORT_NAME);
        String str2 = string2 == null ? "" : string2;
        String string3 = requireArguments().getString(ARG_CATEGORY_ID);
        String str3 = string3 == null ? "" : string3;
        String string4 = requireArguments().getString(ARG_CATEGORY_NAME);
        String str4 = string4 == null ? "" : string4;
        String string5 = requireArguments().getString(ARG_CATEGORY_PHOTO_URL);
        String str5 = string5 == null ? "" : string5;
        String string6 = requireArguments().getString(ARG_CATEGORY_LOGO_URL);
        String str6 = string6 == null ? "" : string6;
        long j = requireArguments().getLong(ARG_ENTRY_FEE, 0L);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1924056069, true, new FlashBetMatchStartFragment$onCreateView$1$1(str, str4, str5, str6, j, this, str3, str2, composeView)));
        return composeView;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment$onViewCreated$backCallback$1] */
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
        final boolean isSessionCommitted = FlashBetMatchStartContentKt.isSessionCommitted(getController().getUiState().getValue());
        ?? r8 = new OnBackPressedCallback(isSessionCommitted) { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment$onViewCreated$backCallback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FlashBetMatchStartFragment.this.showLeaveConfirmDialog();
            }
        };
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, (OnBackPressedCallback) r8);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new FlashBetMatchStartFragment$onViewCreated$1(this, r8, null), 3, null);
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
        if (!FlashBetMatchStartContentKt.isSessionCommitted(getController().getUiState().getValue())) {
            return true;
        }
        showLeaveConfirmDialog();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLeaveConfirmDialog() {
        FlashBetGameSessionDto session;
        if (!isAdded() || getParentFragmentManager().isStateSaved()) {
            return;
        }
        FlashBetMatchStartUiState value = getController().getUiState().getValue();
        String str = null;
        FlashBetMatchStartUiState.StartSuccess startSuccess = value instanceof FlashBetMatchStartUiState.StartSuccess ? (FlashBetMatchStartUiState.StartSuccess) value : null;
        if (startSuccess != null && (session = startSuccess.getSession()) != null) {
            str = session.getId();
        }
        FlashBetLeaveConfirmDialogFragment.INSTANCE.newInstance(str).show(getParentFragmentManager(), "FlashBetLeaveConfirm");
    }

    /* compiled from: FlashBetMatchStartFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetMatchStartFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_SPORT_ID", "", "ARG_SPORT_NAME", "ARG_CATEGORY_ID", "ARG_CATEGORY_NAME", "ARG_CATEGORY_PHOTO_URL", "ARG_CATEGORY_LOGO_URL", "ARG_ENTRY_FEE", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/flashbet/FlashBetMatchStartFragment;", "sportId", FlashBetMatchStartFragment.ARG_SPORT_NAME, FlashBetMatchStartFragment.ARG_CATEGORY_ID, FlashBetMatchStartFragment.ARG_CATEGORY_NAME, FlashBetMatchStartFragment.ARG_CATEGORY_PHOTO_URL, FlashBetMatchStartFragment.ARG_CATEGORY_LOGO_URL, FlashBetMatchStartFragment.ARG_ENTRY_FEE, "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FlashBetMatchStartFragment newInstance(String sportId, String sportName, String categoryId, String categoryName, String categoryPhotoUrl, String categoryLogoUrl, long entryFee) {
            Intrinsics.checkNotNullParameter(sportId, "sportId");
            Intrinsics.checkNotNullParameter(sportName, "sportName");
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            Intrinsics.checkNotNullParameter(categoryName, "categoryName");
            Intrinsics.checkNotNullParameter(categoryPhotoUrl, "categoryPhotoUrl");
            Intrinsics.checkNotNullParameter(categoryLogoUrl, "categoryLogoUrl");
            FlashBetMatchStartFragment flashBetMatchStartFragment = new FlashBetMatchStartFragment();
            Bundle bundle = new Bundle();
            bundle.putString("sportId", sportId);
            bundle.putString(FlashBetMatchStartFragment.ARG_SPORT_NAME, sportName);
            bundle.putString(FlashBetMatchStartFragment.ARG_CATEGORY_ID, categoryId);
            bundle.putString(FlashBetMatchStartFragment.ARG_CATEGORY_NAME, categoryName);
            bundle.putString(FlashBetMatchStartFragment.ARG_CATEGORY_PHOTO_URL, categoryPhotoUrl);
            bundle.putString(FlashBetMatchStartFragment.ARG_CATEGORY_LOGO_URL, categoryLogoUrl);
            bundle.putLong(FlashBetMatchStartFragment.ARG_ENTRY_FEE, entryFee);
            flashBetMatchStartFragment.setArguments(bundle);
            return flashBetMatchStartFragment;
        }
    }
}
