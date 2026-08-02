package org.betup.ui.fragment.competitions.details.controller;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.competitions.PlaceBetResponseModel;
import org.greenrobot.eventbus.EventBus;

/* compiled from: CompetitionDetailsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController$placeBet$3$onFetched$1", f = "CompetitionDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CompetitionDetailsController$placeBet$3$onFetched$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function2<Long, Long, Unit> $onSuccess;
    final /* synthetic */ FetchedResponseMessage<PlaceBetResponseModel, Long> $response;
    int label;
    final /* synthetic */ CompetitionDetailsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CompetitionDetailsController$placeBet$3$onFetched$1(CompetitionDetailsController competitionDetailsController, FetchedResponseMessage<PlaceBetResponseModel, Long> fetchedResponseMessage, Function2<? super Long, ? super Long, Unit> function2, Function1<? super String, Unit> function1, Continuation<? super CompetitionDetailsController$placeBet$3$onFetched$1> continuation) {
        super(2, continuation);
        this.this$0 = competitionDetailsController;
        this.$response = fetchedResponseMessage;
        this.$onSuccess = function2;
        this.$onError = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompetitionDetailsController$placeBet$3$onFetched$1(this.this$0, this.$response, this.$onSuccess, this.$onError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompetitionDetailsController$placeBet$3$onFetched$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        long j;
        FetchStat stat;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._isPlacingBet;
            mutableStateFlow.setValue(Boxing.boxBoolean(false));
            FetchedResponseMessage<PlaceBetResponseModel, Long> fetchedResponseMessage = this.$response;
            if (Intrinsics.areEqual((fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null) ? null : stat.name(), "SUCCESS") && this.$response.getModel() != null) {
                PlaceBetResponseModel model = this.$response.getModel();
                Intrinsics.checkNotNull(model);
                PlaceBetResponseModel placeBetResponseModel = model;
                if (placeBetResponseModel.getSuccess()) {
                    Log.d("CompetitionDetailsController", "Bet placed successfully with participant ID: " + placeBetResponseModel.getParticipantId());
                    mutableStateFlow2 = this.this$0._selectedBetsPerMatch;
                    mutableStateFlow2.setValue(MapsKt.emptyMap());
                    mutableStateFlow3 = this.this$0._selectedBetIds;
                    mutableStateFlow3.setValue(new LinkedHashSet());
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController$placeBet$3$onFetched$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CompetitionDetailsController$placeBet$3$onFetched$1.invokeSuspend$lambda$0();
                        }
                    }, 1000L);
                    Function2<Long, Long, Unit> function2 = this.$onSuccess;
                    j = this.this$0.competitionId;
                    Long boxLong = Boxing.boxLong(j);
                    Long participantId = this.$response.getModel().getParticipantId();
                    function2.invoke(boxLong, Boxing.boxLong(participantId != null ? participantId.longValue() : 0L));
                } else {
                    Log.e("CompetitionDetailsController", "Bet placement failed: Failed to place bet - no participant ID returned");
                    this.$onError.invoke("Failed to place bet - no participant ID returned");
                }
            } else {
                FetchedResponseMessage<PlaceBetResponseModel, Long> fetchedResponseMessage2 = this.$response;
                Log.e("CompetitionDetailsController", "API error: " + (fetchedResponseMessage2 != null ? fetchedResponseMessage2.getStat() : null));
                this.$onError.invoke("Failed to place bet");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0() {
        Log.d("CompetitionDetailsController", "Posting UserProfileUpdatedMessage to update balance");
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }
}
