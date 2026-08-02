package org.betup.ui.fragment.matches.details;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.quiz.QuizParticipationRequest;
import org.betup.model.remote.entity.matches.details.MatchDetailsQuizAvailabilityModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationResponseModel;
import org.betup.ui.MainActivity;
import org.betup.ui.common.compose.HapticFeedbackEffect;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizSelectionState;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\b"}, d2 = {"org/betup/ui/fragment/matches/details/MatchDetailsController$placeQuizParticipation$1", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationResponseModel;", "Lorg/betup/model/remote/api/rest/quiz/QuizParticipationRequest;", "onFetched", "", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchDetailsController$placeQuizParticipation$1 implements BaseCachedSharedInteractor.OnFetchedListener<QuizParticipationResponseModel, QuizParticipationRequest> {
    final /* synthetic */ MatchDetailsController this$0;

    MatchDetailsController$placeQuizParticipation$1(MatchDetailsController matchDetailsController) {
        this.this$0 = matchDetailsController;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<QuizParticipationResponseModel, QuizParticipationRequest> responseMessage) {
        MutableStateFlow mutableStateFlow;
        MainActivity mainActivity;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MainActivity mainActivity2;
        MainActivity mainActivity3;
        MutableStateFlow mutableStateFlow6;
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        mutableStateFlow = this.this$0._isPlacingQuiz;
        mutableStateFlow.setValue(false);
        if (responseMessage.getModel() != null) {
            QuizParticipationResponseModel model = responseMessage.getModel();
            List<Integer> errorCodes = model.getErrorCodes();
            if ((errorCodes == null || errorCodes.isEmpty()) && model.getParticipation() != null) {
                Log.d("MatchDetailsController", "Quiz placed successfully - participation id: " + model.getParticipation().getId());
                mutableStateFlow3 = this.this$0._quizAvailability;
                mutableStateFlow4 = this.this$0._quizAvailability;
                MatchDetailsQuizAvailabilityModel matchDetailsQuizAvailabilityModel = (MatchDetailsQuizAvailabilityModel) mutableStateFlow4.getValue();
                mutableStateFlow3.setValue(matchDetailsQuizAvailabilityModel != null ? MatchDetailsQuizAvailabilityModel.copy$default(matchDetailsQuizAvailabilityModel, 0, 0, 0, false, model.getParticipation(), 15, null) : null);
                mutableStateFlow5 = this.this$0._quizSelectionState;
                mutableStateFlow5.setValue(new QuizSelectionState(0, null, null, false, 15, null));
                mainActivity2 = this.this$0.activity;
                if (mainActivity2 != null) {
                    final MatchDetailsController matchDetailsController = this.this$0;
                    mainActivity2.runOnUiThread(new Runnable() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$placeQuizParticipation$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MatchDetailsController$placeQuizParticipation$1.onFetched$lambda$0(MatchDetailsController.this);
                        }
                    });
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$placeQuizParticipation$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MatchDetailsController$placeQuizParticipation$1.onFetched$lambda$1();
                    }
                }, 1000L);
                return;
            }
            Object errorCodes2 = model.getErrorCodes();
            if (errorCodes2 == null) {
                errorCodes2 = AbstractJsonLexerKt.NULL;
            }
            Log.e("MatchDetailsController", "Quiz placement failed - error codes: " + errorCodes2);
            mainActivity3 = this.this$0.activity;
            if (mainActivity3 != null) {
                final MatchDetailsController matchDetailsController2 = this.this$0;
                mainActivity3.runOnUiThread(new Runnable() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$placeQuizParticipation$1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MatchDetailsController$placeQuizParticipation$1.onFetched$lambda$2(MatchDetailsController.this);
                    }
                });
            }
            mutableStateFlow6 = this.this$0._error;
            Object errorCodes3 = model.getErrorCodes();
            if (errorCodes3 == null) {
                errorCodes3 = "unknown";
            }
            mutableStateFlow6.setValue("Failed to place quiz. Error codes: " + errorCodes3);
            return;
        }
        Log.e("MatchDetailsController", "Quiz placement failed - no model in response");
        mainActivity = this.this$0.activity;
        if (mainActivity != null) {
            final MatchDetailsController matchDetailsController3 = this.this$0;
            mainActivity.runOnUiThread(new Runnable() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$placeQuizParticipation$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    MatchDetailsController$placeQuizParticipation$1.onFetched$lambda$3(MatchDetailsController.this);
                }
            });
        }
        mutableStateFlow2 = this.this$0._error;
        mutableStateFlow2.setValue("Failed to place quiz");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$0(MatchDetailsController matchDetailsController) {
        MainActivity mainActivity;
        MainActivity mainActivity2;
        mainActivity = matchDetailsController.activity;
        HapticFeedbackEffect.perform(mainActivity, HapticFeedbackType.PlaceBetSuccess);
        mainActivity2 = matchDetailsController.activity;
        SnackbarHelper.showShortIfForeground(mainActivity2, R.string.quiz_placed_successfully);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$1() {
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$2(MatchDetailsController matchDetailsController) {
        MainActivity mainActivity;
        mainActivity = matchDetailsController.activity;
        HapticFeedbackEffect.perform(mainActivity, HapticFeedbackType.Reject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$3(MatchDetailsController matchDetailsController) {
        MainActivity mainActivity;
        mainActivity = matchDetailsController.activity;
        HapticFeedbackEffect.perform(mainActivity, HapticFeedbackType.Reject);
    }
}
