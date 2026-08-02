package org.betup.ui.fragment.flashbet;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.BetUpApp;
import org.betup.bus.FlashBetGameFinishedMessage;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.flashbet.LeaveFlashBetSessionInteractor;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: FlashBetLeaveConfirmDialogFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetLeaveConfirmDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "leaveFlashBetSessionInteractor", "Lorg/betup/model/remote/api/rest/flashbet/LeaveFlashBetSessionInteractor;", "getLeaveFlashBetSessionInteractor", "()Lorg/betup/model/remote/api/rest/flashbet/LeaveFlashBetSessionInteractor;", "setLeaveFlashBetSessionInteractor", "(Lorg/betup/model/remote/api/rest/flashbet/LeaveFlashBetSessionInteractor;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "dismissSafely", "notifyServerSessionLeft", "onStart", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetLeaveConfirmDialogFragment extends DialogFragment {
    private static final String ARG_SESSION_ID = "arg_session_id";
    private static final String TAG = "FlashBetLeaveConfirm";

    @Inject
    public LeaveFlashBetSessionInteractor leaveFlashBetSessionInteractor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final LeaveFlashBetSessionInteractor getLeaveFlashBetSessionInteractor() {
        LeaveFlashBetSessionInteractor leaveFlashBetSessionInteractor = this.leaveFlashBetSessionInteractor;
        if (leaveFlashBetSessionInteractor != null) {
            return leaveFlashBetSessionInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leaveFlashBetSessionInteractor");
        return null;
    }

    public final void setLeaveFlashBetSessionInteractor(LeaveFlashBetSessionInteractor leaveFlashBetSessionInteractor) {
        Intrinsics.checkNotNullParameter(leaveFlashBetSessionInteractor, "<set-?>");
        this.leaveFlashBetSessionInteractor = leaveFlashBetSessionInteractor;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1874474107, true, new FlashBetLeaveConfirmDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissSafely() {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyServerSessionLeft() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(ARG_SESSION_ID) : null;
        if (string == null) {
            string = "";
        }
        if (StringsKt.isBlank(string)) {
            return;
        }
        getLeaveFlashBetSessionInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, String>() { // from class: org.betup.ui.fragment.flashbet.FlashBetLeaveConfirmDialogFragment$notifyServerSessionLeft$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, String> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.getStat() == FetchStat.SUCCESS) {
                    EventBus.getDefault().post(new FlashBetGameFinishedMessage());
                } else {
                    Log.w("FlashBetLeaveConfirm", "Leave session call failed: " + response.getStat());
                }
            }
        }, string, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FlashBetDialogWindowKt.applyFlashBetDialogWindow$default(this, 0, 0, 3, null);
    }

    /* compiled from: FlashBetLeaveConfirmDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetLeaveConfirmDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_SESSION_ID", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/flashbet/FlashBetLeaveConfirmDialogFragment;", "sessionId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ FlashBetLeaveConfirmDialogFragment newInstance$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.newInstance(str);
        }

        public final FlashBetLeaveConfirmDialogFragment newInstance(String sessionId) {
            FlashBetLeaveConfirmDialogFragment flashBetLeaveConfirmDialogFragment = new FlashBetLeaveConfirmDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(FlashBetLeaveConfirmDialogFragment.ARG_SESSION_ID, sessionId);
            flashBetLeaveConfirmDialogFragment.setArguments(bundle);
            return flashBetLeaveConfirmDialogFragment;
        }
    }
}
