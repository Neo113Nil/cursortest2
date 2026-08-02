package org.betup.ui.fragment.competitions;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.competitions.compose.CompetitionsContentKt;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionsFragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/competitions/NewCompetitionsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "competitionsController", "Lorg/betup/ui/fragment/competitions/controller/CompetitionsController;", "getCompetitionsController", "()Lorg/betup/ui/fragment/competitions/controller/CompetitionsController;", "setCompetitionsController", "(Lorg/betup/ui/fragment/competitions/controller/CompetitionsController;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NewCompetitionsFragment extends BaseFragment {
    public static final int $stable = 8;

    @Inject
    public CompetitionsController competitionsController;

    public final CompetitionsController getCompetitionsController() {
        CompetitionsController competitionsController = this.competitionsController;
        if (competitionsController != null) {
            return competitionsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("competitionsController");
        return null;
    }

    public final void setCompetitionsController(CompetitionsController competitionsController) {
        Intrinsics.checkNotNullParameter(competitionsController, "<set-?>");
        this.competitionsController = competitionsController;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("NewCompetitionsFragment", "onCreate called");
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Log.d("NewCompetitionsFragment", "Dagger injection completed");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Log.d("NewCompetitionsFragment", "onCreateView called");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        Log.d("NewCompetitionsFragment", "ComposeView created, setting content");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1308702224, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.competitions.NewCompetitionsFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1308702224, i, -1, "org.betup.ui.fragment.competitions.NewCompetitionsFragment.onCreateView.<anonymous>.<anonymous> (CompetitionsFragment.kt:37)");
                }
                CompetitionsContentKt.CompetitionsContent(NewCompetitionsFragment.this.getCompetitionsController(), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Log.d("NewCompetitionsFragment", "onViewCreated called");
        CompetitionsController competitionsController = getCompetitionsController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        competitionsController.initialize(requireContext);
        getCompetitionsController().refreshAllCompetitions();
    }
}
