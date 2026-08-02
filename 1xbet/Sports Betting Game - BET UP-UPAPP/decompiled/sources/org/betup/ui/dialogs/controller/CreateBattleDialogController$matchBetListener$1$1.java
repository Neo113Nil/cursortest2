package org.betup.ui.dialogs.controller;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupModel;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.utils.BetGroupsSortingUtils;

/* compiled from: CreateBattleDialogController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.CreateBattleDialogController$matchBetListener$1$1", f = "CreateBattleDialogController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CreateBattleDialogController$matchBetListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<List<MatchVarietyGroupModel>, List<Integer>> $responseMessage;
    int label;
    final /* synthetic */ CreateBattleDialogController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateBattleDialogController$matchBetListener$1$1(FetchedResponseMessage<List<MatchVarietyGroupModel>, List<Integer>> fetchedResponseMessage, CreateBattleDialogController createBattleDialogController, Continuation<? super CreateBattleDialogController$matchBetListener$1$1> continuation) {
        super(2, continuation);
        this.$responseMessage = fetchedResponseMessage;
        this.this$0 = createBattleDialogController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateBattleDialogController$matchBetListener$1$1(this.$responseMessage, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateBattleDialogController$matchBetListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            if (this.$responseMessage.getModel() != null) {
                mutableStateFlow = this.this$0._subMatches;
                Iterable<BetGroupsTabs> iterable = (Iterable) mutableStateFlow.getValue();
                FetchedResponseMessage<List<MatchVarietyGroupModel>, List<Integer>> fetchedResponseMessage = this.$responseMessage;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (BetGroupsTabs betGroupsTabs : iterable) {
                    List<MatchVarietyGroupModel> model = fetchedResponseMessage.getModel();
                    Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                    Iterator<T> it = model.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((int) ((MatchVarietyGroupModel) obj2).getGroup().getId()) == betGroupsTabs.getId()) {
                            break;
                        }
                    }
                    MatchVarietyGroupModel matchVarietyGroupModel = (MatchVarietyGroupModel) obj2;
                    if (matchVarietyGroupModel != null) {
                        betGroupsTabs = betGroupsTabs.copy((r24 & 1) != 0 ? betGroupsTabs.title : null, (r24 & 2) != 0 ? betGroupsTabs.tabs : null, (r24 & 4) != 0 ? betGroupsTabs.bets : BetGroupsSortingUtils.INSTANCE.sortBetGroups(matchVarietyGroupModel.getBets()), (r24 & 8) != 0 ? betGroupsTabs.onClick : null, (r24 & 16) != 0 ? betGroupsTabs.id : 0, (r24 & 32) != 0 ? betGroupsTabs.isSelected : false, (r24 & 64) != 0 ? betGroupsTabs.scoreHome : 0, (r24 & 128) != 0 ? betGroupsTabs.scoreAway : 0, (r24 & 256) != 0 ? betGroupsTabs.resultRaw : null, (r24 & 512) != 0 ? betGroupsTabs.paramTId : null, (r24 & 1024) != 0 ? betGroupsTabs.varietyBetRestriction : null);
                    }
                    arrayList.add(betGroupsTabs);
                }
                ArrayList arrayList2 = arrayList;
                mutableStateFlow2 = this.this$0._subMatches;
                mutableStateFlow2.setValue(arrayList2);
                CreateBattleDialogController createBattleDialogController = this.this$0;
                mutableStateFlow3 = createBattleDialogController._selectedBetGroupTabIndex;
                createBattleDialogController.onBetGroupTabSelected(((Number) mutableStateFlow3.getValue()).intValue());
                Log.d("CreateBattleDialogController", "Bet groups loaded: " + arrayList2.size());
                this.this$0.setLoadingStates(false);
            } else {
                Log.w("CreateBattleDialogController", "Received empty bet groups response");
                this.this$0.setLoadingStates(false);
            }
        } catch (Exception e) {
            Log.e("CreateBattleDialogController", "Error processing bet groups: " + e.getMessage(), e);
            this.this$0.setLoadingStates(false);
        }
        return Unit.INSTANCE;
    }
}
