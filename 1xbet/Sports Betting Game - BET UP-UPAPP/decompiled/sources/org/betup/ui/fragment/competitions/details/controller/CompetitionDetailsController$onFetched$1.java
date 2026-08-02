package org.betup.ui.fragment.competitions.details.controller;

import android.util.Log;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchWithBetsModel;

/* compiled from: CompetitionDetailsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController$onFetched$1", f = "CompetitionDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CompetitionDetailsController$onFetched$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<CompetitionDetailsWithParticipantModel, Long> $response;
    int label;
    final /* synthetic */ CompetitionDetailsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompetitionDetailsController$onFetched$1(CompetitionDetailsController competitionDetailsController, FetchedResponseMessage<CompetitionDetailsWithParticipantModel, Long> fetchedResponseMessage, Continuation<? super CompetitionDetailsController$onFetched$1> continuation) {
        super(2, continuation);
        this.this$0 = competitionDetailsController;
        this.$response = fetchedResponseMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompetitionDetailsController$onFetched$1(this.this$0, this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompetitionDetailsController$onFetched$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        FetchStat stat;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._isLoading;
            mutableStateFlow.setValue(Boxing.boxBoolean(false));
            FetchedResponseMessage<CompetitionDetailsWithParticipantModel, Long> fetchedResponseMessage = this.$response;
            if (!Intrinsics.areEqual((fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null) ? null : stat.name(), "SUCCESS") || this.$response.getModel() == null) {
                mutableStateFlow2 = this.this$0._hasError;
                mutableStateFlow2.setValue(Boxing.boxBoolean(true));
                Boxing.boxInt(Log.e("CompetitionDetailsController", "Error loading competition details"));
            } else {
                CompetitionDetailsWithParticipantModel model = this.$response.getModel();
                Intrinsics.checkNotNull(model);
                CompetitionDetailsWithParticipantModel competitionDetailsWithParticipantModel = model;
                mutableStateFlow3 = this.this$0._competitionDetails;
                mutableStateFlow3.setValue(competitionDetailsWithParticipantModel);
                mutableStateFlow4 = this.this$0._hasError;
                mutableStateFlow4.setValue(Boxing.boxBoolean(false));
                Log.d("CompetitionDetailsController", "Competition details loaded successfully: " + competitionDetailsWithParticipantModel.getName());
                if (!competitionDetailsWithParticipantModel.getMatches().isEmpty()) {
                    mutableStateFlow5 = this.this$0._selectedMatchId;
                    if (mutableStateFlow5.getValue() == null) {
                        this.this$0.selectMatch(((CompetitionMatchWithBetsModel) CollectionsKt.first((List) competitionDetailsWithParticipantModel.getMatches())).getMatchInfo().getId());
                        mutableStateFlow6 = this.this$0._currentMatchIndex;
                        mutableStateFlow6.setValue(Boxing.boxInt(0));
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
