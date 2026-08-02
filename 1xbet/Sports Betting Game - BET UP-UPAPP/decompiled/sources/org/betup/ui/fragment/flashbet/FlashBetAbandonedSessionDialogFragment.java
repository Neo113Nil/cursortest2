package org.betup.ui.fragment.flashbet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
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
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: FlashBetAbandonedSessionDialogFragment.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001e\u0010\u001b\u001a\u00020\u00152\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010$\u001a\u00020\u0015H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&²\u0006\f\u0010'\u001a\u0004\u0018\u00010\u0003X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetAbandonedSessionDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getFlashBetSessionInteractor", "Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSessionInteractor;", "getGetFlashBetSessionInteractor", "()Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSessionInteractor;", "setGetFlashBetSessionInteractor", "(Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSessionInteractor;)V", "_session", "Lkotlinx/coroutines/flow/MutableStateFlow;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "Lkotlinx/coroutines/flow/StateFlow;", "_loading", "", "loading", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFetched", "response", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", VastTagName.COMPANION, "app_release", "currentSession", "isLoading"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetAbandonedSessionDialogFragment extends DialogFragment implements BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, String> {
    private static final String ARG_SESSION_ID = "arg_session_id";
    private final MutableStateFlow<Boolean> _loading;
    private final MutableStateFlow<FlashBetGameSessionDto> _session;

    @Inject
    public GetFlashBetSessionInteractor getFlashBetSessionInteractor;
    private final StateFlow<Boolean> loading;
    private final StateFlow<FlashBetGameSessionDto> session;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public FlashBetAbandonedSessionDialogFragment() {
        MutableStateFlow<FlashBetGameSessionDto> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._session = MutableStateFlow;
        this.session = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(true);
        this._loading = MutableStateFlow2;
        this.loading = FlowKt.asStateFlow(MutableStateFlow2);
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
            this._loading.setValue(true);
            getGetFlashBetSessionInteractor().load(this, str, null);
        } else {
            this._loading.setValue(false);
        }
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, String> response) {
        FlashBetGameSessionDto model;
        this._loading.setValue(false);
        if ((response != null ? response.getStat() : null) != FetchStat.SUCCESS || (model = response.getModel()) == null) {
            return;
        }
        this._session.setValue(model);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-853230555, true, new FlashBetAbandonedSessionDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FlashBetDialogWindowKt.applyFlashBetDialogWindow$default(this, 0, 0, 3, null);
    }

    /* compiled from: FlashBetAbandonedSessionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetAbandonedSessionDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_SESSION_ID", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/flashbet/FlashBetAbandonedSessionDialogFragment;", "sessionId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FlashBetAbandonedSessionDialogFragment newInstance(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            FlashBetAbandonedSessionDialogFragment flashBetAbandonedSessionDialogFragment = new FlashBetAbandonedSessionDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(FlashBetAbandonedSessionDialogFragment.ARG_SESSION_ID, sessionId);
            flashBetAbandonedSessionDialogFragment.setArguments(bundle);
            return flashBetAbandonedSessionDialogFragment;
        }
    }
}
