package org.betup.ui.fragment.flashbet.controller;

import android.os.Bundle;
import io.sentry.cache.EnvelopeCache;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.bus.FlashBetGameFinishedMessage;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.LeaveFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.SubmitFlashBetAnswerInteractor;
import org.betup.services.user.UserService;
import org.betup.utils.RewardSyncHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameController.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bH\u0002J\"\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u0014J\b\u0010*\u001a\u00020%H\u0002J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u001fJ\"\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020%0/J\u0006\u00100\u001a\u00020%J\u000e\u00101\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lorg/betup/ui/fragment/flashbet/controller/FlashBetGameController;", "", "getFlashBetSessionInteractor", "Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSessionInteractor;", "submitFlashBetAnswerInteractor", "Lorg/betup/model/remote/api/rest/flashbet/SubmitFlashBetAnswerInteractor;", "leaveFlashBetSessionInteractor", "Lorg/betup/model/remote/api/rest/flashbet/LeaveFlashBetSessionInteractor;", "userService", "Lorg/betup/services/user/UserService;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSessionInteractor;Lorg/betup/model/remote/api/rest/flashbet/SubmitFlashBetAnswerInteractor;Lorg/betup/model/remote/api/rest/flashbet/LeaveFlashBetSessionInteractor;Lorg/betup/services/user/UserService;)V", "_session", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "Lkotlinx/coroutines/flow/StateFlow;", "getSession", "()Lkotlinx/coroutines/flow/StateFlow;", "_loading", "", "loading", "getLoading", "_submitLoading", "submitLoading", "getSubmitLoading", "_error", "", "error", "getError", "_selectedAnswerId", "", "selectedAnswerId", "getSelectedAnswerId", "trackedSessionId", "finishOutcomeNotifyDone", "ensureTrackedSession", "", "sessionId", "loadSession", "clearSession", "showLoading", "onFlashBetSessionFinishedOnce", "selectAnswer", "answerId", "submitAnswer", "onUpdated", "Lkotlin/Function1;", "clearError", "leaveSession", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetGameController {
    public static final int $stable = 8;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _loading;
    private final MutableStateFlow<Long> _selectedAnswerId;
    private final MutableStateFlow<FlashBetGameSessionDto> _session;
    private final MutableStateFlow<Boolean> _submitLoading;
    private final StateFlow<String> error;
    private boolean finishOutcomeNotifyDone;
    private final GetFlashBetSessionInteractor getFlashBetSessionInteractor;
    private final LeaveFlashBetSessionInteractor leaveFlashBetSessionInteractor;
    private final StateFlow<Boolean> loading;
    private final StateFlow<Long> selectedAnswerId;
    private final StateFlow<FlashBetGameSessionDto> session;
    private final SubmitFlashBetAnswerInteractor submitFlashBetAnswerInteractor;
    private final StateFlow<Boolean> submitLoading;
    private String trackedSessionId;
    private final UserService userService;

    @Inject
    public FlashBetGameController(GetFlashBetSessionInteractor getFlashBetSessionInteractor, SubmitFlashBetAnswerInteractor submitFlashBetAnswerInteractor, LeaveFlashBetSessionInteractor leaveFlashBetSessionInteractor, UserService userService) {
        Intrinsics.checkNotNullParameter(getFlashBetSessionInteractor, "getFlashBetSessionInteractor");
        Intrinsics.checkNotNullParameter(submitFlashBetAnswerInteractor, "submitFlashBetAnswerInteractor");
        Intrinsics.checkNotNullParameter(leaveFlashBetSessionInteractor, "leaveFlashBetSessionInteractor");
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.getFlashBetSessionInteractor = getFlashBetSessionInteractor;
        this.submitFlashBetAnswerInteractor = submitFlashBetAnswerInteractor;
        this.leaveFlashBetSessionInteractor = leaveFlashBetSessionInteractor;
        this.userService = userService;
        MutableStateFlow<FlashBetGameSessionDto> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._session = MutableStateFlow;
        this.session = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._loading = MutableStateFlow2;
        this.loading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._submitLoading = MutableStateFlow3;
        this.submitLoading = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow4;
        this.error = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Long> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._selectedAnswerId = MutableStateFlow5;
        this.selectedAnswerId = FlowKt.asStateFlow(MutableStateFlow5);
    }

    public final StateFlow<FlashBetGameSessionDto> getSession() {
        return this.session;
    }

    public final StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    public final StateFlow<Boolean> getSubmitLoading() {
        return this.submitLoading;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<Long> getSelectedAnswerId() {
        return this.selectedAnswerId;
    }

    private final void ensureTrackedSession(String sessionId) {
        if (StringsKt.isBlank(sessionId) || Intrinsics.areEqual(this.trackedSessionId, sessionId)) {
            return;
        }
        this.trackedSessionId = sessionId;
        this.finishOutcomeNotifyDone = false;
    }

    public static /* synthetic */ void loadSession$default(FlashBetGameController flashBetGameController, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        flashBetGameController.loadSession(str, z, z2);
    }

    public final void loadSession(String sessionId, boolean clearSession, boolean showLoading) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        if (StringsKt.isBlank(sessionId)) {
            this._loading.setValue(false);
            this._error.setValue("invalid_session");
            return;
        }
        ensureTrackedSession(sessionId);
        if (clearSession) {
            this._session.setValue(null);
        }
        if (showLoading) {
            this._loading.setValue(true);
        }
        this._error.setValue(null);
        this.getFlashBetSessionInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, String>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetGameController$loadSession$1

            /* compiled from: FlashBetGameController.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FetchStat.values().length];
                    try {
                        iArr[FetchStat.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, String> response) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                String str;
                MutableStateFlow mutableStateFlow3;
                MutableStateFlow mutableStateFlow4;
                Intrinsics.checkNotNullParameter(response, "response");
                mutableStateFlow = FlashBetGameController.this._loading;
                mutableStateFlow.setValue(false);
                FetchStat stat = response.getStat();
                if ((stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()]) != 1) {
                    mutableStateFlow2 = FlashBetGameController.this._error;
                    FetchStat stat2 = response.getStat();
                    if (stat2 == null || (str = stat2.name()) == null) {
                        str = "Unknown error";
                    }
                    mutableStateFlow2.setValue(str);
                    return;
                }
                FlashBetGameSessionDto model = response.getModel();
                mutableStateFlow3 = FlashBetGameController.this._session;
                mutableStateFlow3.setValue(model);
                mutableStateFlow4 = FlashBetGameController.this._selectedAnswerId;
                mutableStateFlow4.setValue(null);
                if ((model != null ? model.getResult() : null) != null) {
                    FlashBetGameController.this.onFlashBetSessionFinishedOnce();
                }
            }
        }, sessionId, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFlashBetSessionFinishedOnce() {
        if (this.finishOutcomeNotifyDone) {
            return;
        }
        this.finishOutcomeNotifyDone = true;
        EventBus.getDefault().post(new FlashBetGameFinishedMessage());
        RewardSyncHelper.syncProfileAndNotify$default(RewardSyncHelper.INSTANCE, this.userService, 0L, 2, null);
    }

    public final void selectAnswer(long answerId) {
        this._selectedAnswerId.setValue(Long.valueOf(answerId));
    }

    public final void submitAnswer(String sessionId, final Function1<? super FlashBetGameSessionDto, Unit> onUpdated) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(onUpdated, "onUpdated");
        Long value = this._selectedAnswerId.getValue();
        if (value != null) {
            long longValue = value.longValue();
            if (StringsKt.isBlank(sessionId)) {
                return;
            }
            ensureTrackedSession(sessionId);
            this._submitLoading.setValue(true);
            this._error.setValue(null);
            Bundle bundle = new Bundle();
            bundle.putLong("answerId", longValue);
            this.submitFlashBetAnswerInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, String>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetGameController$submitAnswer$1

                /* compiled from: FlashBetGameController.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FetchStat.values().length];
                        try {
                            iArr[FetchStat.SUCCESS.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, String> response) {
                    MutableStateFlow mutableStateFlow;
                    MutableStateFlow mutableStateFlow2;
                    String str;
                    MutableStateFlow mutableStateFlow3;
                    MutableStateFlow mutableStateFlow4;
                    Intrinsics.checkNotNullParameter(response, "response");
                    mutableStateFlow = FlashBetGameController.this._submitLoading;
                    mutableStateFlow.setValue(false);
                    FetchStat stat = response.getStat();
                    if ((stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()]) != 1) {
                        mutableStateFlow2 = FlashBetGameController.this._error;
                        if (response.getStat() == FetchStat.INVALID) {
                            str = "expired";
                        } else {
                            FetchStat stat2 = response.getStat();
                            if (stat2 == null || (str = stat2.name()) == null) {
                                str = "Unknown error";
                            }
                        }
                        mutableStateFlow2.setValue(str);
                        return;
                    }
                    FlashBetGameSessionDto model = response.getModel();
                    if (model != null) {
                        FlashBetGameController flashBetGameController = FlashBetGameController.this;
                        Function1<FlashBetGameSessionDto, Unit> function1 = onUpdated;
                        mutableStateFlow3 = flashBetGameController._session;
                        mutableStateFlow3.setValue(model);
                        mutableStateFlow4 = flashBetGameController._selectedAnswerId;
                        mutableStateFlow4.setValue(null);
                        function1.invoke(model);
                        if (model.getResult() != null) {
                            flashBetGameController.onFlashBetSessionFinishedOnce();
                        }
                    }
                }
            }, sessionId, bundle);
        }
    }

    public final void clearError() {
        this._error.setValue(null);
    }

    public final void leaveSession(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        if (StringsKt.isBlank(sessionId)) {
            return;
        }
        ensureTrackedSession(sessionId);
        this.leaveFlashBetSessionInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, String>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetGameController$leaveSession$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, String> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.getStat() == FetchStat.SUCCESS) {
                    FlashBetGameController.this.onFlashBetSessionFinishedOnce();
                }
            }
        }, sessionId, null);
    }
}
