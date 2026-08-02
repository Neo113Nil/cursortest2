package org.betup.ui.fragment.matches.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.ui.fragment.BaseFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: TeamDetailsFragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/matches/details/TeamDetailsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/matches/details/TeamDetailsController;", "getController", "()Lorg/betup/ui/fragment/matches/details/TeamDetailsController;", "setController", "(Lorg/betup/ui/fragment/matches/details/TeamDetailsController;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TeamDetailsFragment extends BaseFragment {

    @Inject
    public TeamDetailsController controller;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final TeamDetailsController getController() {
        TeamDetailsController teamDetailsController = this.controller;
        if (teamDetailsController != null) {
            return teamDetailsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(TeamDetailsController teamDetailsController) {
        Intrinsics.checkNotNullParameter(teamDetailsController, "<set-?>");
        this.controller = teamDetailsController;
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
        Bundle arguments = getArguments();
        long j = arguments != null ? arguments.getLong("teamId") : 0L;
        if (j <= 0) {
            requireActivity().getSupportFragmentManager().popBackStack();
            return new View(requireContext());
        }
        TeamDetailsController controller = getController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.bind(requireContext, j);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext2, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1787567727, true, new TeamDetailsFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getController().unbind();
    }

    /* compiled from: TeamDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/matches/details/TeamDetailsFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/matches/details/TeamDetailsFragment;", "teamId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TeamDetailsFragment newInstance(long teamId) {
            TeamDetailsFragment teamDetailsFragment = new TeamDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("teamId", teamId);
            teamDetailsFragment.setArguments(bundle);
            return teamDetailsFragment;
        }
    }
}
