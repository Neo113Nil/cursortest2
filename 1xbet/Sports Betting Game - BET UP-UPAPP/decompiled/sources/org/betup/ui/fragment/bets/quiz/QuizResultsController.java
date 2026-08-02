package org.betup.ui.fragment.bets.quiz;

import android.os.Bundle;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.quiz.QuizParticipationsInteractor;
import org.betup.model.remote.api.rest.quiz.QuizStateCountInteractor;
import org.betup.model.remote.entity.matches.details.QuizParticipationListResponseModel;
import org.betup.model.remote.entity.quiz.QuizShortParticipationModel;
import org.betup.model.remote.entity.quiz.QuizStateCountModel;
import org.betup.ui.MainActivity;
import org.betup.utils.SnackbarHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizResultsController.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 >2\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001:\u0001>B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u00102\u001a\u0002032\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u000203J\u0015\u00106\u001a\u0002032\b\u00107\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J&\u00109\u001a\u0002032\u001c\u0010:\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010;H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001d¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030%0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030%0\u001d¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001d¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0%0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0%0\u001d¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\"\u0010<\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0%\u0012\u0006\u0012\u0004\u0018\u00010=0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lorg/betup/ui/fragment/bets/quiz/QuizResultsController;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationListResponseModel;", "Lorg/betup/model/remote/entity/quiz/QuizShortParticipationModel;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "quizParticipationsInteractor", "Lorg/betup/model/remote/api/rest/quiz/QuizParticipationsInteractor;", "getQuizParticipationsInteractor", "()Lorg/betup/model/remote/api/rest/quiz/QuizParticipationsInteractor;", "setQuizParticipationsInteractor", "(Lorg/betup/model/remote/api/rest/quiz/QuizParticipationsInteractor;)V", "quizStateCountInteractor", "Lorg/betup/model/remote/api/rest/quiz/QuizStateCountInteractor;", "getQuizStateCountInteractor", "()Lorg/betup/model/remote/api/rest/quiz/QuizStateCountInteractor;", "setQuizStateCountInteractor", "(Lorg/betup/model/remote/api/rest/quiz/QuizStateCountInteractor;)V", "activity", "Lorg/betup/ui/MainActivity;", "currentOffset", AppLovinMediationProvider.MAX, "", "DEFAULT_OFFSET", "DEFAULT_LIMIT", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoadingMore", "isLoadingMore", "_hasMore", "hasMore", "getHasMore", "_participations", "", "participations", "getParticipations", "_filterState", "filterState", "getFilterState", "_totalCount", "totalCount", "getTotalCount", "_stateCounts", "Lorg/betup/model/remote/entity/quiz/QuizStateCountModel;", "stateCounts", "getStateCounts", "bind", "", "reloadParticipations", "loadMoreParticipations", "setFilterState", "state", "(Ljava/lang/Integer;)V", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "stateCountsListener", "Ljava/lang/Void;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizResultsController implements BaseCachedSharedInteractor.OnFetchedListener<QuizParticipationListResponseModel<QuizShortParticipationModel>, Integer> {
    private static final String TAG = "QuizResultsController";
    private final int DEFAULT_LIMIT = 10;
    private final int DEFAULT_OFFSET;
    private final MutableStateFlow<Integer> _filterState;
    private final MutableStateFlow<Boolean> _hasMore;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isLoadingMore;
    private final MutableStateFlow<List<QuizShortParticipationModel>> _participations;
    private final MutableStateFlow<List<QuizStateCountModel>> _stateCounts;
    private final MutableStateFlow<Integer> _totalCount;
    private MainActivity activity;
    private int currentOffset;
    private final StateFlow<Integer> filterState;
    private final StateFlow<Boolean> hasMore;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isLoadingMore;
    private boolean max;
    private final StateFlow<List<QuizShortParticipationModel>> participations;

    @Inject
    public QuizParticipationsInteractor quizParticipationsInteractor;

    @Inject
    public QuizStateCountInteractor quizStateCountInteractor;
    private final StateFlow<List<QuizStateCountModel>> stateCounts;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<QuizStateCountModel>, Void> stateCountsListener;
    private final StateFlow<Integer> totalCount;
    public static final int $stable = 8;

    @Inject
    public QuizResultsController() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingMore = MutableStateFlow2;
        this.isLoadingMore = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(true);
        this._hasMore = MutableStateFlow3;
        this.hasMore = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<QuizShortParticipationModel>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._participations = MutableStateFlow4;
        this.participations = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._filterState = MutableStateFlow5;
        this.filterState = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Integer> MutableStateFlow6 = StateFlowKt.MutableStateFlow(0);
        this._totalCount = MutableStateFlow6;
        this.totalCount = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<List<QuizStateCountModel>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._stateCounts = MutableStateFlow7;
        this.stateCounts = FlowKt.asStateFlow(MutableStateFlow7);
        this.stateCountsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.bets.quiz.QuizResultsController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                QuizResultsController.stateCountsListener$lambda$3(QuizResultsController.this, fetchedResponseMessage);
            }
        };
    }

    public final QuizParticipationsInteractor getQuizParticipationsInteractor() {
        QuizParticipationsInteractor quizParticipationsInteractor = this.quizParticipationsInteractor;
        if (quizParticipationsInteractor != null) {
            return quizParticipationsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quizParticipationsInteractor");
        return null;
    }

    public final void setQuizParticipationsInteractor(QuizParticipationsInteractor quizParticipationsInteractor) {
        Intrinsics.checkNotNullParameter(quizParticipationsInteractor, "<set-?>");
        this.quizParticipationsInteractor = quizParticipationsInteractor;
    }

    public final QuizStateCountInteractor getQuizStateCountInteractor() {
        QuizStateCountInteractor quizStateCountInteractor = this.quizStateCountInteractor;
        if (quizStateCountInteractor != null) {
            return quizStateCountInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quizStateCountInteractor");
        return null;
    }

    public final void setQuizStateCountInteractor(QuizStateCountInteractor quizStateCountInteractor) {
        Intrinsics.checkNotNullParameter(quizStateCountInteractor, "<set-?>");
        this.quizStateCountInteractor = quizStateCountInteractor;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> isLoadingMore() {
        return this.isLoadingMore;
    }

    public final StateFlow<Boolean> getHasMore() {
        return this.hasMore;
    }

    public final StateFlow<List<QuizShortParticipationModel>> getParticipations() {
        return this.participations;
    }

    public final StateFlow<Integer> getFilterState() {
        return this.filterState;
    }

    public final StateFlow<Integer> getTotalCount() {
        return this.totalCount;
    }

    public final StateFlow<List<QuizStateCountModel>> getStateCounts() {
        return this.stateCounts;
    }

    public final void bind(MainActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    public final void reloadParticipations() {
        Log.d(TAG, "reloadParticipations called");
        this.currentOffset = this.DEFAULT_OFFSET;
        this._isLoading.setValue(true);
        this.max = false;
        this._hasMore.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.DEFAULT_OFFSET);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.DEFAULT_LIMIT);
        getQuizParticipationsInteractor().load(this, this._filterState.getValue(), bundle);
        getQuizStateCountInteractor().load(this.stateCountsListener, null, new Bundle());
    }

    public final void loadMoreParticipations() {
        Log.d(TAG, "loadMoreParticipations called - max=" + this.max + ", isLoadMore=" + this._isLoadingMore.getValue() + ", currentOffset=" + this.currentOffset);
        if (!this.max && !this._isLoadingMore.getValue().booleanValue()) {
            Log.d(TAG, "Loading more participations - offset=" + this.currentOffset);
            this._isLoadingMore.setValue(true);
            Bundle bundle = new Bundle();
            bundle.putInt("offset", this.currentOffset);
            bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.DEFAULT_LIMIT);
            getQuizParticipationsInteractor().load(this, this._filterState.getValue(), bundle);
            return;
        }
        Log.d(TAG, "NOT loading more - max=" + this.max + ", isLoadMore=" + this._isLoadingMore.getValue());
    }

    public final void setFilterState(Integer state) {
        Log.d(TAG, "setFilterState called - state=" + state);
        if (Intrinsics.areEqual(this._filterState.getValue(), state)) {
            return;
        }
        this._filterState.setValue(state);
        reloadParticipations();
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<QuizParticipationListResponseModel<QuizShortParticipationModel>, Integer> responseMessage) {
        this._isLoading.setValue(false);
        this._isLoadingMore.setValue(false);
        if ((responseMessage != null ? responseMessage.getStat() : null) != FetchStat.SUCCESS) {
            Log.e(TAG, "onFetched - FAILED response");
            MainActivity mainActivity = this.activity;
            if (mainActivity != null) {
                SnackbarHelper.showShortIfForeground(mainActivity, R.string.invalid_server_response);
                return;
            }
            return;
        }
        QuizParticipationListResponseModel<QuizShortParticipationModel> model = responseMessage.getModel();
        if (model == null) {
            return;
        }
        List<QuizShortParticipationModel> content = model.getContent();
        Log.d(TAG, "onFetched - received " + content.size() + " participations, currentOffset=" + this.currentOffset);
        this.currentOffset += this.DEFAULT_LIMIT;
        boolean isEmpty = content.isEmpty();
        this.max = isEmpty;
        this._hasMore.setValue(Boolean.valueOf(!isEmpty));
        int i = this.currentOffset;
        boolean z = this.max;
        Log.d(TAG, "onFetched - newOffset=" + i + ", max=" + z + ", hasMore=" + (!z) + ", currentListSize=" + this._participations.getValue().size());
        if (this.currentOffset == this.DEFAULT_LIMIT) {
            this._participations.setValue(CollectionsKt.emptyList());
            Log.d(TAG, "onFetched - Cleared list (first load)");
        }
        MutableStateFlow<List<QuizShortParticipationModel>> mutableStateFlow = this._participations;
        mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) content));
        this._totalCount.setValue(Integer.valueOf(this._participations.getValue().size()));
        Log.d(TAG, "onFetched - newListSize=" + this._participations.getValue().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void stateCountsListener$lambda$3(QuizResultsController quizResultsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            return;
        }
        MutableStateFlow<List<QuizStateCountModel>> mutableStateFlow = quizResultsController._stateCounts;
        Object model = fetchedResponseMessage.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
        mutableStateFlow.setValue(model);
        Log.d(TAG, "State counts loaded: " + fetchedResponseMessage.getModel());
    }
}
