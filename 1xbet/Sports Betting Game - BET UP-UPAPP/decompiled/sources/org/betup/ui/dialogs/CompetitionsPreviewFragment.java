package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: CompetitionsPreviewFragment.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006#"}, d2 = {"Lorg/betup/ui/dialogs/CompetitionsPreviewFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;", "getController", "()Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;", "setController", "(Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;)V", "competitionId", "", "participantId", "Ljava/lang/Long;", "isWon", "", "Ljava/lang/Boolean;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onDestroyView", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompetitionsPreviewFragment extends DialogFragment {
    private static final String ARG_COMPETITION_ID = "competition_id";
    private static final String ARG_IS_WON = "is_won";
    private static final String ARG_PARTICIPANT_ID = "participant_id";
    private long competitionId;

    @Inject
    public CompetitionDetailsController controller;
    private Boolean isWon;
    private Long participantId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CompetitionsPreviewFragment newInstance(long j) {
        return INSTANCE.newInstance(j);
    }

    @JvmStatic
    public static final CompetitionsPreviewFragment newInstance(long j, Long l, Boolean bool) {
        return INSTANCE.newInstance(j, l, bool);
    }

    public final CompetitionDetailsController getController() {
        CompetitionDetailsController competitionDetailsController = this.controller;
        if (competitionDetailsController != null) {
            return competitionDetailsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(CompetitionDetailsController competitionDetailsController) {
        Intrinsics.checkNotNullParameter(competitionDetailsController, "<set-?>");
        this.controller = competitionDetailsController;
    }

    /* compiled from: CompetitionsPreviewFragment.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J+\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lorg/betup/ui/dialogs/CompetitionsPreviewFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_COMPETITION_ID", "", "ARG_PARTICIPANT_ID", "ARG_IS_WON", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/CompetitionsPreviewFragment;", "competitionId", "", "participantId", "isWon", "", "(JLjava/lang/Long;Ljava/lang/Boolean;)Lorg/betup/ui/dialogs/CompetitionsPreviewFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CompetitionsPreviewFragment newInstance(long competitionId) {
            CompetitionsPreviewFragment competitionsPreviewFragment = new CompetitionsPreviewFragment();
            Bundle bundle = new Bundle();
            bundle.putLong(CompetitionsPreviewFragment.ARG_COMPETITION_ID, competitionId);
            competitionsPreviewFragment.setArguments(bundle);
            return competitionsPreviewFragment;
        }

        public static /* synthetic */ CompetitionsPreviewFragment newInstance$default(Companion companion, long j, Long l, Boolean bool, int i, Object obj) {
            if ((i & 4) != 0) {
                bool = null;
            }
            return companion.newInstance(j, l, bool);
        }

        @JvmStatic
        public final CompetitionsPreviewFragment newInstance(long competitionId, Long participantId, Boolean isWon) {
            CompetitionsPreviewFragment competitionsPreviewFragment = new CompetitionsPreviewFragment();
            Bundle bundle = new Bundle();
            bundle.putLong(CompetitionsPreviewFragment.ARG_COMPETITION_ID, competitionId);
            if (participantId != null) {
                bundle.putLong(CompetitionsPreviewFragment.ARG_PARTICIPANT_ID, participantId.longValue());
            }
            if (isWon != null) {
                bundle.putBoolean(CompetitionsPreviewFragment.ARG_IS_WON, isWon.booleanValue());
            }
            competitionsPreviewFragment.setArguments(bundle);
            return competitionsPreviewFragment;
        }
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
            this.competitionId = arguments.getLong(ARG_COMPETITION_ID, 0L);
            this.participantId = Long.valueOf(arguments.getLong(ARG_PARTICIPANT_ID, 0L));
            this.isWon = Boolean.valueOf(arguments.getBoolean(ARG_IS_WON, false));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2107845041, true, new CompetitionsPreviewFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getController().initialize(this.competitionId, this.participantId, this.isWon);
        getController().loadCompetitionDetails();
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
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.6f);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getController().cleanup();
    }
}
