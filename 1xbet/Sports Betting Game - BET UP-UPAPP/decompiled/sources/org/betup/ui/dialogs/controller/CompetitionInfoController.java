package org.betup.ui.dialogs.controller;

import android.content.Context;
import android.util.Log;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsInteractor;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionInfoController.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0003J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0006\u0010 \u001a\u00020\u001eJ \u0010!\u001a\u00020\u001e2\u0016\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lorg/betup/ui/dialogs/controller/CompetitionInfoController;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/competitions/CompetitionDetailsWithParticipantModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "competitionDetailsInteractor", "Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsInteractor;", "getCompetitionDetailsInteractor", "()Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsInteractor;", "setCompetitionDetailsInteractor", "(Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsInteractor;)V", "_competitionDetails", "Lkotlinx/coroutines/flow/MutableStateFlow;", "competitionDetails", "Lkotlinx/coroutines/flow/StateFlow;", "getCompetitionDetails", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoading", "", "isLoading", "_hasError", "hasError", "getHasError", "competitionId", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "initialize", "", "loadCompetitionDetails", "cleanup", "onFetched", "response", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompetitionInfoController implements BaseCachedSharedInteractor.OnFetchedListener<CompetitionDetailsWithParticipantModel, Long> {
    public static final int $stable = 8;
    private final MutableStateFlow<CompetitionDetailsWithParticipantModel> _competitionDetails;
    private final MutableStateFlow<Boolean> _hasError;
    private final MutableStateFlow<Boolean> _isLoading;
    private final StateFlow<CompetitionDetailsWithParticipantModel> competitionDetails;

    @Inject
    public CompetitionDetailsInteractor competitionDetailsInteractor;
    private long competitionId;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final StateFlow<Boolean> hasError;
    private final StateFlow<Boolean> isLoading;

    @Inject
    public CompetitionInfoController(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        MutableStateFlow<CompetitionDetailsWithParticipantModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._competitionDetails = MutableStateFlow;
        this.competitionDetails = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow2;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._hasError = MutableStateFlow3;
        this.hasError = FlowKt.asStateFlow(MutableStateFlow3);
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    }

    public final CompetitionDetailsInteractor getCompetitionDetailsInteractor() {
        CompetitionDetailsInteractor competitionDetailsInteractor = this.competitionDetailsInteractor;
        if (competitionDetailsInteractor != null) {
            return competitionDetailsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("competitionDetailsInteractor");
        return null;
    }

    public final void setCompetitionDetailsInteractor(CompetitionDetailsInteractor competitionDetailsInteractor) {
        Intrinsics.checkNotNullParameter(competitionDetailsInteractor, "<set-?>");
        this.competitionDetailsInteractor = competitionDetailsInteractor;
    }

    public final StateFlow<CompetitionDetailsWithParticipantModel> getCompetitionDetails() {
        return this.competitionDetails;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> getHasError() {
        return this.hasError;
    }

    public final void initialize(long competitionId) {
        this.competitionId = competitionId;
        Log.d("CompetitionInfoController", "Initialized with competition ID: " + competitionId);
        loadCompetitionDetails();
    }

    private final void loadCompetitionDetails() {
        long j = this.competitionId;
        if (j == 0) {
            Log.e("CompetitionInfoController", "Competition ID not set");
            return;
        }
        Log.d("CompetitionInfoController", "Loading competition details for ID: " + j);
        this._isLoading.setValue(true);
        this._hasError.setValue(false);
        getCompetitionDetailsInteractor().load(this, Long.valueOf(this.competitionId), null);
    }

    public final void cleanup() {
        Log.d("CompetitionInfoController", "Cleaning up controller");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<CompetitionDetailsWithParticipantModel, Long> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new CompetitionInfoController$onFetched$1(this, response, null), 3, null);
    }
}
