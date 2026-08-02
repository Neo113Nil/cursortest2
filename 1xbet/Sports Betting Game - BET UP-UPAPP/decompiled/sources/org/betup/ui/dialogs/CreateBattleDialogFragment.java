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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.controller.SportsSelectionController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: CreateBattleDialogFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/dialogs/CreateBattleDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/dialogs/controller/SportsSelectionController;", "getController", "()Lorg/betup/ui/dialogs/controller/SportsSelectionController;", "setController", "(Lorg/betup/ui/dialogs/controller/SportsSelectionController;)V", "userId", "", "Ljava/lang/Long;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "dismissAllBattleDialogs", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateBattleDialogFragment extends DialogFragment {

    @Inject
    public SportsSelectionController controller;
    private Long userId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final SportsSelectionController getController() {
        SportsSelectionController sportsSelectionController = this.controller;
        if (sportsSelectionController != null) {
            return sportsSelectionController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(SportsSelectionController sportsSelectionController) {
        Intrinsics.checkNotNullParameter(sportsSelectionController, "<set-?>");
        this.controller = sportsSelectionController;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Long valueOf = Long.valueOf(arguments.getLong("userId", -1L));
            if (!Boolean.valueOf(valueOf.longValue() != -1).booleanValue()) {
                valueOf = null;
            }
            this.userId = valueOf;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(2120142681, true, new CreateBattleDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SportsSelectionController controller = getController();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        Function0<Unit> function0 = new Function0() { // from class: org.betup.ui.dialogs.CreateBattleDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onViewCreated$lambda$3;
                onViewCreated$lambda$3 = CreateBattleDialogFragment.onViewCreated$lambda$3(CreateBattleDialogFragment.this);
                return onViewCreated$lambda$3;
            }
        };
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.bind((MainActivity) requireActivity, function0, requireContext, this.userId);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: org.betup.ui.dialogs.CreateBattleDialogFragment$onViewCreated$2
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                CreateBattleDialogFragment.this.dismissAllBattleDialogs();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(CreateBattleDialogFragment createBattleDialogFragment) {
        createBattleDialogFragment.dismiss();
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

    /* compiled from: CreateBattleDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/CreateBattleDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/CreateBattleDialogFragment;", "userId", "", "(Ljava/lang/Long;)Lorg/betup/ui/dialogs/CreateBattleDialogFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CreateBattleDialogFragment newInstance$default(Companion companion, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                l = null;
            }
            return companion.newInstance(l);
        }

        public final CreateBattleDialogFragment newInstance(Long userId) {
            CreateBattleDialogFragment createBattleDialogFragment = new CreateBattleDialogFragment();
            Bundle bundle = new Bundle();
            if (userId != null) {
                bundle.putLong("userId", userId.longValue());
            }
            createBattleDialogFragment.setArguments(bundle);
            return createBattleDialogFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissAllBattleDialogs() {
        Fragment findFragmentByTag = getParentFragmentManager().findFragmentByTag("challengeAcceptDialog");
        if (findFragmentByTag != null && (findFragmentByTag instanceof ChallengeAcceptDialogFragment)) {
            ((ChallengeAcceptDialogFragment) findFragmentByTag).dismiss();
        }
        Fragment findFragmentByTag2 = getParentFragmentManager().findFragmentByTag("selectBetDialog");
        if (findFragmentByTag2 != null && (findFragmentByTag2 instanceof SelectBetDialogFragment)) {
            ((SelectBetDialogFragment) findFragmentByTag2).dismiss();
        }
        Fragment findFragmentByTag3 = getParentFragmentManager().findFragmentByTag("selectMatchDialog");
        if (findFragmentByTag3 != null && (findFragmentByTag3 instanceof SelectMatchDialogFragment)) {
            ((SelectMatchDialogFragment) findFragmentByTag3).dismiss();
        }
        Fragment findFragmentByTag4 = getParentFragmentManager().findFragmentByTag("selectLeagueDialog");
        if (findFragmentByTag4 != null && (findFragmentByTag4 instanceof SelectLeagueDialogFragment)) {
            ((SelectLeagueDialogFragment) findFragmentByTag4).dismiss();
        }
        Fragment findFragmentByTag5 = getParentFragmentManager().findFragmentByTag("createBattleDialog");
        if (findFragmentByTag5 != null && (findFragmentByTag5 instanceof CreateBattleDialogFragment)) {
            ((CreateBattleDialogFragment) findFragmentByTag5).dismiss();
        }
        Fragment findFragmentByTag6 = getParentFragmentManager().findFragmentByTag("followersDialog");
        if (findFragmentByTag6 == null || !(findFragmentByTag6 instanceof FollowersDialog)) {
            return;
        }
        ((FollowersDialog) findFragmentByTag6).dismiss();
    }
}
