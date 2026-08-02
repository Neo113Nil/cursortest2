package org.betup.ui.fragment.flashbet;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.cache.EnvelopeCache;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSessionInteractor;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogState;
import org.betup.utils.RewardSyncHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: FlashBetDetailsDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001 \b\u0007\u0018\u0000 92\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u00019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0004H\u0002J\u001e\u0010.\u001a\u00020%2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u000100H\u0016J$\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00107\u001a\u00020%H\u0002J\b\u00108\u001a\u00020%H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u0006:²\u0006\f\u0010;\u001a\u0004\u0018\u00010\u0003X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020\u001bX\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetDetailsDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getFlashBetSessionInteractor", "Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSessionInteractor;", "getGetFlashBetSessionInteractor", "()Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSessionInteractor;", "setGetFlashBetSessionInteractor", "(Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSessionInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "_session", "Lkotlinx/coroutines/flow/MutableStateFlow;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "Lkotlinx/coroutines/flow/StateFlow;", "_dialogState", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetDetailsDialogState;", "dialogState", "_loading", "", "loading", "handler", "Landroid/os/Handler;", "pollRunnable", "org/betup/ui/fragment/flashbet/FlashBetDetailsDialogFragment$pollRunnable$1", "Lorg/betup/ui/fragment/flashbet/FlashBetDetailsDialogFragment$pollRunnable$1;", "isStartPending", "showCollectForFinishedSession", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "loadSession", "sessionId", "onFetched", "response", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "dismissWithResult", "onStart", VastTagName.COMPANION, "app_release", "currentSession", "state", "isLoading"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetDetailsDialogFragment extends DialogFragment implements BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, String> {
    private static final String ARG_POP_TO_FLASH_BET_LIST_ON_DISMISS = "arg_pop_to_flash_bet_list_on_dismiss";
    private static final String ARG_SESSION_ID = "arg_session_id";
    private static final String ARG_SHOW_COLLECT_FOR_FINISHED = "arg_show_collect_for_finished";
    private static final String ARG_START_PENDING = "arg_start_pending";
    private static final long POLL_INTERVAL_MS = 2000;
    private final MutableStateFlow<FlashBetDetailsDialogState> _dialogState;
    private final MutableStateFlow<Boolean> _loading;
    private final MutableStateFlow<FlashBetGameSessionDto> _session;
    private final StateFlow<FlashBetDetailsDialogState> dialogState;

    @Inject
    public GetFlashBetSessionInteractor getFlashBetSessionInteractor;
    private final Handler handler;
    private final StateFlow<Boolean> loading;
    private final FlashBetDetailsDialogFragment$pollRunnable$1 pollRunnable;
    private final StateFlow<FlashBetGameSessionDto> session;

    @Inject
    public UserService userService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r0v11, types: [org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment$pollRunnable$1] */
    public FlashBetDetailsDialogFragment() {
        MutableStateFlow<FlashBetGameSessionDto> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._session = MutableStateFlow;
        this.session = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<FlashBetDetailsDialogState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(FlashBetDetailsDialogState.Preview);
        this._dialogState = MutableStateFlow2;
        this.dialogState = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(true);
        this._loading = MutableStateFlow3;
        this.loading = FlowKt.asStateFlow(MutableStateFlow3);
        this.handler = new Handler(Looper.getMainLooper());
        this.pollRunnable = new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment$pollRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                Bundle arguments;
                String string;
                if (!FlashBetDetailsDialogFragment.this.isAdded() || (arguments = FlashBetDetailsDialogFragment.this.getArguments()) == null || (string = arguments.getString("arg_session_id")) == null) {
                    return;
                }
                FlashBetDetailsDialogFragment.this.loadSession(string);
            }
        };
    }

    public final GetFlashBetSessionInteractor getGetFlashBetSessionInteractor() {
        GetFlashBetSessionInteractor getFlashBetSessionInteractor = this.getFlashBetSessionInteractor;
        if (getFlashBetSessionInteractor != null) {
            return getFlashBetSessionInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getFlashBetSessionInteractor");
        return null;
    }

    public final void setGetFlashBetSessionInteractor(GetFlashBetSessionInteractor getFlashBetSessionInteractor) {
        Intrinsics.checkNotNullParameter(getFlashBetSessionInteractor, "<set-?>");
        this.getFlashBetSessionInteractor = getFlashBetSessionInteractor;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    private final boolean isStartPending() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean(ARG_START_PENDING, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean showCollectForFinishedSession() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(ARG_SHOW_COLLECT_FOR_FINISHED, true);
        }
        return true;
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
        String str;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(ARG_SESSION_ID)) == null) {
            str = "";
        }
        if (!StringsKt.isBlank(str)) {
            if (isStartPending()) {
                this._dialogState.setValue(FlashBetDetailsDialogState.Waiting);
            }
            loadSession(str);
            return;
        }
        this._loading.setValue(false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.handler.removeCallbacks(this.pollRunnable);
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadSession(String sessionId) {
        this._loading.setValue(true);
        getGetFlashBetSessionInteractor().load(this, sessionId, null);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, String> response) {
        FlashBetGameSessionDto model;
        this._loading.setValue(false);
        if ((response != null ? response.getStat() : null) != FetchStat.SUCCESS || (model = response.getModel()) == null) {
            return;
        }
        this._session.setValue(model);
        FlashBetDetailsDialogState value = this._dialogState.getValue();
        if (model.getResult() != null) {
            if (value == FlashBetDetailsDialogState.Waiting || value == FlashBetDetailsDialogState.Preview) {
                this._dialogState.setValue(FlashBetDetailsDialogState.Results);
                RewardSyncHelper.syncProfileAndNotify$default(RewardSyncHelper.INSTANCE, getUserService(), 0L, 2, null);
            }
            this.handler.removeCallbacks(this.pollRunnable);
            return;
        }
        if (isStartPending() && value == FlashBetDetailsDialogState.Waiting) {
            this.handler.removeCallbacks(this.pollRunnable);
            this.handler.postDelayed(this.pollRunnable, 2000L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String str;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(ARG_SESSION_ID)) == null) {
            str = "";
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1116622329, true, new FlashBetDetailsDialogFragment$onCreateView$1$1(this, str)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissWithResult() {
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getBoolean(ARG_POP_TO_FLASH_BET_LIST_ON_DISMISS, false)) {
            z = true;
        }
        FragmentActivity activity = getActivity();
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
        if (z) {
            FlashBetFragmentNavigation.INSTANCE.popToFlashBetList(activity);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FlashBetDialogWindowKt.applyFlashBetDialogWindow$default(this, 0, 0, 3, null);
    }

    /* compiled from: FlashBetDetailsDialogFragment.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetDetailsDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_SESSION_ID", "", "ARG_START_PENDING", "ARG_SHOW_COLLECT_FOR_FINISHED", "ARG_POP_TO_FLASH_BET_LIST_ON_DISMISS", "POLL_INTERVAL_MS", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/flashbet/FlashBetDetailsDialogFragment;", "sessionId", "startPending", "", "showCollectForFinishedSession", "popToFlashBetListOnDismiss", "newInstanceFromPush", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ FlashBetDetailsDialogFragment newInstance$default(Companion companion, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            return companion.newInstance(str, z, z2, z3);
        }

        public final FlashBetDetailsDialogFragment newInstance(String sessionId, boolean startPending, boolean showCollectForFinishedSession, boolean popToFlashBetListOnDismiss) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            FlashBetDetailsDialogFragment flashBetDetailsDialogFragment = new FlashBetDetailsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(FlashBetDetailsDialogFragment.ARG_SESSION_ID, sessionId);
            bundle.putBoolean(FlashBetDetailsDialogFragment.ARG_START_PENDING, startPending);
            bundle.putBoolean(FlashBetDetailsDialogFragment.ARG_SHOW_COLLECT_FOR_FINISHED, showCollectForFinishedSession);
            bundle.putBoolean(FlashBetDetailsDialogFragment.ARG_POP_TO_FLASH_BET_LIST_ON_DISMISS, popToFlashBetListOnDismiss);
            flashBetDetailsDialogFragment.setArguments(bundle);
            return flashBetDetailsDialogFragment;
        }

        public final FlashBetDetailsDialogFragment newInstanceFromPush(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return newInstance$default(this, sessionId, false, true, false, 8, null);
        }
    }
}
