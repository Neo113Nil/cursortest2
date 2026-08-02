package org.betup.ui.fragment.bets.quiz;

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
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.details.GetParticipationInteractor;
import org.betup.model.remote.entity.matches.details.QuizParticipationModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: QuizParticipationDialog.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u001e\u0010 \u001a\u00020\u00182\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010)\u001a\u00020\u0018H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006+²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/bets/quiz/QuizParticipationDialog;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getParticipationInteractor", "Lorg/betup/model/remote/api/rest/matches/details/GetParticipationInteractor;", "getGetParticipationInteractor", "()Lorg/betup/model/remote/api/rest/matches/details/GetParticipationInteractor;", "setGetParticipationInteractor", "(Lorg/betup/model/remote/api/rest/matches/details/GetParticipationInteractor;)V", "participationId", "", "_participation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "participation", "getParticipation", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_isLoading", "", "isLoading", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "fetchParticipationInfo", "id", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizParticipationDialog extends DialogFragment implements BaseCachedSharedInteractor.OnFetchedListener<QuizParticipationModel, Integer> {
    private static final String ARG_PARTICIPATION_ID = "arg_participation_id";
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<QuizParticipationModel> _participation;

    @Inject
    public GetParticipationInteractor getParticipationInteractor;
    private final MutableStateFlow<Boolean> isLoading;
    private final MutableStateFlow<QuizParticipationModel> participation;
    private long participationId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final QuizParticipationDialog newInstance(long j) {
        return INSTANCE.newInstance(j);
    }

    public QuizParticipationDialog() {
        MutableStateFlow<QuizParticipationModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._participation = MutableStateFlow;
        this.participation = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(true);
        this._isLoading = MutableStateFlow2;
        this.isLoading = MutableStateFlow2;
    }

    /* compiled from: QuizParticipationDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/bets/quiz/QuizParticipationDialog$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_PARTICIPATION_ID", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/bets/quiz/QuizParticipationDialog;", "participationId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final QuizParticipationDialog newInstance(long participationId) {
            QuizParticipationDialog quizParticipationDialog = new QuizParticipationDialog();
            Bundle bundle = new Bundle();
            bundle.putLong(QuizParticipationDialog.ARG_PARTICIPATION_ID, participationId);
            quizParticipationDialog.setArguments(bundle);
            return quizParticipationDialog;
        }
    }

    public final GetParticipationInteractor getGetParticipationInteractor() {
        GetParticipationInteractor getParticipationInteractor = this.getParticipationInteractor;
        if (getParticipationInteractor != null) {
            return getParticipationInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getParticipationInteractor");
        return null;
    }

    public final void setGetParticipationInteractor(GetParticipationInteractor getParticipationInteractor) {
        Intrinsics.checkNotNullParameter(getParticipationInteractor, "<set-?>");
        this.getParticipationInteractor = getParticipationInteractor;
    }

    public final MutableStateFlow<QuizParticipationModel> getParticipation() {
        return this.participation;
    }

    public final MutableStateFlow<Boolean> isLoading() {
        return this.isLoading;
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
            long j = arguments.getLong(ARG_PARTICIPATION_ID);
            this.participationId = j;
            fetchParticipationInfo((int) j);
        }
    }

    private final void fetchParticipationInfo(int id) {
        this._isLoading.setValue(true);
        this._participation.setValue(null);
        getGetParticipationInteractor().load(this, Integer.valueOf(id));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<QuizParticipationModel, Integer> responseMessage) {
        QuizParticipationModel model;
        if ((responseMessage != null ? responseMessage.getStat() : null) == FetchStat.SUCCESS && (model = responseMessage.getModel()) != null) {
            this._participation.setValue(model);
        }
        this._isLoading.setValue(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(147869129, true, new QuizParticipationDialog$onCreateView$1$1(this)));
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
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.6f);
    }
}
