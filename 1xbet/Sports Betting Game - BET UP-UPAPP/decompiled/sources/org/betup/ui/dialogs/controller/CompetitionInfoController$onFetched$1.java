package org.betup.ui.dialogs.controller;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* compiled from: CompetitionInfoController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.CompetitionInfoController$onFetched$1", f = "CompetitionInfoController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CompetitionInfoController$onFetched$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<CompetitionDetailsWithParticipantModel, Long> $response;
    int label;
    final /* synthetic */ CompetitionInfoController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompetitionInfoController$onFetched$1(CompetitionInfoController competitionInfoController, FetchedResponseMessage<CompetitionDetailsWithParticipantModel, Long> fetchedResponseMessage, Continuation<? super CompetitionInfoController$onFetched$1> continuation) {
        super(2, continuation);
        this.this$0 = competitionInfoController;
        this.$response = fetchedResponseMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompetitionInfoController$onFetched$1(this.this$0, this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompetitionInfoController$onFetched$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
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
                Log.e("CompetitionInfoController", "Error loading competition details");
            } else {
                CompetitionDetailsWithParticipantModel model = this.$response.getModel();
                Intrinsics.checkNotNull(model);
                CompetitionDetailsWithParticipantModel competitionDetailsWithParticipantModel = model;
                mutableStateFlow3 = this.this$0._competitionDetails;
                mutableStateFlow3.setValue(competitionDetailsWithParticipantModel);
                mutableStateFlow4 = this.this$0._hasError;
                mutableStateFlow4.setValue(Boxing.boxBoolean(false));
                Log.d("CompetitionInfoController", "Competition details loaded successfully: " + competitionDetailsWithParticipantModel.getName());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
