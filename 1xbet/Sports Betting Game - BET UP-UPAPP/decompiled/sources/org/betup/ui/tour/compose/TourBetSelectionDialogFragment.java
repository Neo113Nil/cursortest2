package org.betup.ui.tour.compose;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.MatchDetailsFragmentK;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: TourBetSelectionDialogFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J.\u0010\u0017\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/tour/compose/TourBetSelectionDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "onBetClick", "Lkotlin/Function2;", "", "", "", "onDismiss", "Lkotlin/Function0;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "setCallbacks", "setController", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourBetSelectionDialogFragment extends DialogFragment {
    private static final String TAG = "TourBetSelectionDialog";
    private MatchDetailsController controller;
    private Function2<? super Long, ? super Integer, Unit> onBetClick;
    private Function0<Unit> onDismiss;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.Theme.Translucent.NoTitleBar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TourComposeHelper tourComposeHelper;
        Fragment fragment;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Fragment parentFragment = getParentFragment();
        TourState tourState = null;
        if (parentFragment == null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            List<Fragment> fragments = parentFragmentManager.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            Iterator it = fragments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fragment = 0;
                    break;
                }
                fragment = it.next();
                if (((Fragment) fragment) instanceof MatchDetailsFragmentK) {
                    break;
                }
            }
            parentFragment = fragment;
        }
        if (parentFragment instanceof MatchDetailsFragmentK) {
            this.controller = ((MatchDetailsFragmentK) parentFragment).getController();
        }
        MatchDetailsController matchDetailsController = this.controller;
        if (matchDetailsController == null) {
            Log.e("TourFlow", "TourBetSelectionDialogFragment - Controller is null!");
            return new View(requireContext());
        }
        FragmentActivity requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null && (tourComposeHelper = mainActivity.tourComposeHelper) != null) {
            tourState = tourComposeHelper.getTourState();
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(726791828, true, new TourBetSelectionDialogFragment$onCreateView$2$1(matchDetailsController, this, tourState)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setGravity(80);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.getDecorView().setBackgroundColor(0);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.0f);
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(2);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    public final void setCallbacks(Function2<? super Long, ? super Integer, Unit> onBetClick, Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        this.onBetClick = onBetClick;
        this.onDismiss = onDismiss;
    }

    public final void setController(MatchDetailsController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    /* compiled from: TourBetSelectionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lorg/betup/ui/tour/compose/TourBetSelectionDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/tour/compose/TourBetSelectionDialogFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TourBetSelectionDialogFragment newInstance() {
            return new TourBetSelectionDialogFragment();
        }
    }
}
