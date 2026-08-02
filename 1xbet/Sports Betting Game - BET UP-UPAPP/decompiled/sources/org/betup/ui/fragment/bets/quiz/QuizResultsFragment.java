package org.betup.ui.fragment.bets.quiz;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.BaseFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: QuizResultsFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/bets/quiz/QuizResultsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/bets/quiz/QuizResultsController;", "getController", "()Lorg/betup/ui/fragment/bets/quiz/QuizResultsController;", "setController", "(Lorg/betup/ui/fragment/bets/quiz/QuizResultsController;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showQuizParticipationDialog", "", "participationId", "", "onStart", "onCreate", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizResultsFragment extends BaseFragment {

    @Inject
    public QuizResultsController controller;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final QuizResultsFragment newInstance() {
        return INSTANCE.newInstance();
    }

    public final QuizResultsController getController() {
        QuizResultsController quizResultsController = this.controller;
        if (quizResultsController != null) {
            return quizResultsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(QuizResultsController quizResultsController) {
        Intrinsics.checkNotNullParameter(quizResultsController, "<set-?>");
        this.controller = quizResultsController;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1444076329, true, new QuizResultsFragment$onCreateView$1$1(this)));
        getController().reloadParticipations();
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showQuizParticipationDialog(long participationId) {
        QuizParticipationDialog.INSTANCE.newInstance(participationId).show(requireActivity().getSupportFragmentManager(), "QuizParticipationDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getController().reloadParticipations();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setControllingMenus(false);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        FragmentActivity requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null) {
            getController().bind(mainActivity);
        }
    }

    /* compiled from: QuizResultsFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/bets/quiz/QuizResultsFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/bets/quiz/QuizResultsFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final QuizResultsFragment newInstance() {
            return new QuizResultsFragment();
        }
    }
}
