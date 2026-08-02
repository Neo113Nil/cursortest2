package org.betup.ui.dialogs.controller;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.challenges.NewChallengeBetModel;
import org.betup.model.remote.entity.challenges.NewChallengeCreatorModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsResponseModelP;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsMapperKt;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.model.remote.entity.user.BaseUserModel;

/* compiled from: BetSelectionController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.BetSelectionController$loadChallengeDetails$2$1", f = "BetSelectionController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BetSelectionController$loadChallengeDetails$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<V7ChallengeDetailsResponseModel, Long> $response;
    int label;
    final /* synthetic */ BetSelectionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetSelectionController$loadChallengeDetails$2$1(BetSelectionController betSelectionController, FetchedResponseMessage<V7ChallengeDetailsResponseModel, Long> fetchedResponseMessage, Continuation<? super BetSelectionController$loadChallengeDetails$2$1> continuation) {
        super(2, continuation);
        this.this$0 = betSelectionController;
        this.$response = fetchedResponseMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetSelectionController$loadChallengeDetails$2$1(this.this$0, this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetSelectionController$loadChallengeDetails$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        MutableStateFlow mutableStateFlow;
        String str;
        String str2;
        Long l;
        Long moneyToWin;
        String l2;
        Long moneyAccept;
        String name;
        Integer id;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            job = this.this$0.challengeLoadingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            BaseUserModel userModel = this.this$0.getUserService().getShortProfile().getUserModel();
            Long boxLong = (userModel == null || (id = userModel.getId()) == null) ? null : Boxing.boxLong(id.intValue());
            V7ChallengeDetailsResponseModel model = this.$response.getModel();
            NewChallengeDetailsResponseModelP legacyDetails = model != null ? V7ChallengeDetailsMapperKt.toLegacyDetails(model, boxLong) : null;
            if ((legacyDetails != null ? legacyDetails.getChallenge() : null) != null) {
                mutableStateFlow = this.this$0._battleInfo;
                NewChallengeCreatorModel createdBy = legacyDetails.getCreatedBy();
                String str3 = "";
                if (createdBy == null || (str = createdBy.getPhotoUrl()) == null) {
                    str = "";
                }
                NewChallengeCreatorModel createdBy2 = legacyDetails.getCreatedBy();
                if (createdBy2 != null && (name = createdBy2.getName()) != null) {
                    str3 = name;
                }
                NewChallengeDetailsModel challenge = legacyDetails.getChallenge();
                String str4 = "0";
                if (challenge == null || (moneyAccept = challenge.getMoneyAccept()) == null || (str2 = moneyAccept.toString()) == null) {
                    str2 = "0";
                }
                NewChallengeDetailsModel challenge2 = legacyDetails.getChallenge();
                if (challenge2 != null && (moneyToWin = challenge2.getMoneyToWin()) != null && (l2 = moneyToWin.toString()) != null) {
                    str4 = l2;
                }
                mutableStateFlow.setValue(new BattleUserUi(str, str3, str2, str4));
                List<NewChallengeBetModel> bets = legacyDetails.getBets();
                NewChallengeBetModel newChallengeBetModel = bets != null ? (NewChallengeBetModel) CollectionsKt.firstOrNull((List) bets) : null;
                if (newChallengeBetModel != null && newChallengeBetModel.getBet() != null) {
                    this.this$0._opponentBetId = Boxing.boxLong(newChallengeBetModel.getBet().getId());
                    l = this.this$0._opponentBetId;
                    Log.d("BetSelectionController", "Opponent bet loaded: betId=" + l);
                }
                Boxing.boxInt(Log.d("BetSelectionController", "Challenge details loaded successfully"));
            } else {
                Log.w("BetSelectionController", "Challenge details response model or challenge is null");
                this.this$0.handleChallengeLoadingError("Failed to load challenge details");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
