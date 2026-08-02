package org.betup.ui.fragment.competitions.details;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
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
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: CompetitionDetailsFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/fragment/competitions/details/CompetitionDetailsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "competitionDetailsController", "Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;", "getCompetitionDetailsController", "()Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;", "setCompetitionDetailsController", "(Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;)V", "competitionId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onDestroyView", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompetitionDetailsFragment extends BaseFragment {
    private static final String ARG_COMPETITION_ID = "competition_id";

    @Inject
    public CompetitionDetailsController competitionDetailsController;
    private long competitionId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final CompetitionDetailsController getCompetitionDetailsController() {
        CompetitionDetailsController competitionDetailsController = this.competitionDetailsController;
        if (competitionDetailsController != null) {
            return competitionDetailsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("competitionDetailsController");
        return null;
    }

    public final void setCompetitionDetailsController(CompetitionDetailsController competitionDetailsController) {
        Intrinsics.checkNotNullParameter(competitionDetailsController, "<set-?>");
        this.competitionDetailsController = competitionDetailsController;
    }

    /* compiled from: CompetitionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/competitions/details/CompetitionDetailsFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_COMPETITION_ID", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/competitions/details/CompetitionDetailsFragment;", "competitionId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CompetitionDetailsFragment newInstance(long competitionId) {
            CompetitionDetailsFragment competitionDetailsFragment = new CompetitionDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putLong(CompetitionDetailsFragment.ARG_COMPETITION_ID, competitionId);
            competitionDetailsFragment.setArguments(bundle);
            return competitionDetailsFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("CompetitionDetailsFragment", "onCreate called");
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Log.d("CompetitionDetailsFragment", "Dagger injection completed");
        Bundle arguments = getArguments();
        if (arguments != null) {
            long j = arguments.getLong(ARG_COMPETITION_ID, 0L);
            this.competitionId = j;
            Log.d("CompetitionDetailsFragment", "Competition ID: " + j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Log.d("CompetitionDetailsFragment", "onCreateView called");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        Log.d("CompetitionDetailsFragment", "ComposeView created, setting content");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1223301246, true, new CompetitionDetailsFragment$onCreateView$1$1(this, composeView)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Log.d("CompetitionDetailsFragment", "onViewCreated called");
        getCompetitionDetailsController().initialize(this.competitionId);
        getCompetitionDetailsController().loadCompetitionDetails();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getCompetitionDetailsController().cleanup();
    }
}
