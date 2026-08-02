package org.betup.ui.dialogs.controller;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupModel;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsRows;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.utils.BetGroupsSortingUtils;

/* compiled from: BetSelectionController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.BetSelectionController$loadBetGroups$2$1", f = "BetSelectionController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BetSelectionController$loadBetGroups$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<List<MatchVarietyGroupModel>, List<Integer>> $response;
    int label;
    final /* synthetic */ BetSelectionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetSelectionController$loadBetGroups$2$1(BetSelectionController betSelectionController, FetchedResponseMessage<List<MatchVarietyGroupModel>, List<Integer>> fetchedResponseMessage, Continuation<? super BetSelectionController$loadBetGroups$2$1> continuation) {
        super(2, continuation);
        this.this$0 = betSelectionController;
        this.$response = fetchedResponseMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetSelectionController$loadBetGroups$2$1(this.this$0, this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetSelectionController$loadBetGroups$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        MutableStateFlow mutableStateFlow7;
        BetGroupsTabs copy;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            job = this.this$0.betGroupsLoadingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            List<MatchVarietyGroupModel> model = this.$response.getModel();
            Log.d("BetSelectionController", "Bet groups loaded: " + (model != null ? model.size() : 0));
            if (Intrinsics.areEqual(this.$response.getStat().name(), "SUCCESS") && this.$response.getModel() != null) {
                mutableStateFlow3 = this.this$0._subMatches;
                Iterable<BetGroupsTabs> iterable = (Iterable) mutableStateFlow3.getValue();
                FetchedResponseMessage<List<MatchVarietyGroupModel>, List<Integer>> fetchedResponseMessage = this.$response;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (BetGroupsTabs betGroupsTabs : iterable) {
                    List<MatchVarietyGroupModel> model2 = fetchedResponseMessage.getModel();
                    Intrinsics.checkNotNullExpressionValue(model2, "getModel(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : model2) {
                        if (((MatchVarietyGroupModel) obj2).getGroup().getId() == betGroupsTabs.getId()) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new BetGroupsRows(((MatchVarietyGroupModel) it.next()).getGroup().getBetsGameType(), new Function0() { // from class: org.betup.ui.dialogs.controller.BetSelectionController$loadBetGroups$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        }));
                    }
                    ArrayList arrayList5 = arrayList4;
                    BetGroupsSortingUtils betGroupsSortingUtils = BetGroupsSortingUtils.INSTANCE;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        CollectionsKt.addAll(arrayList6, ((MatchVarietyGroupModel) it2.next()).getBets());
                    }
                    copy = betGroupsTabs.copy((r24 & 1) != 0 ? betGroupsTabs.title : null, (r24 & 2) != 0 ? betGroupsTabs.tabs : arrayList5, (r24 & 4) != 0 ? betGroupsTabs.bets : betGroupsSortingUtils.sortBetGroups(arrayList6), (r24 & 8) != 0 ? betGroupsTabs.onClick : null, (r24 & 16) != 0 ? betGroupsTabs.id : 0, (r24 & 32) != 0 ? betGroupsTabs.isSelected : false, (r24 & 64) != 0 ? betGroupsTabs.scoreHome : 0, (r24 & 128) != 0 ? betGroupsTabs.scoreAway : 0, (r24 & 256) != 0 ? betGroupsTabs.resultRaw : null, (r24 & 512) != 0 ? betGroupsTabs.paramTId : null, (r24 & 1024) != 0 ? betGroupsTabs.varietyBetRestriction : null);
                    arrayList.add(copy);
                }
                ArrayList<BetGroupsTabs> arrayList7 = arrayList;
                mutableStateFlow4 = this.this$0._subMatches;
                mutableStateFlow4.setValue(arrayList7);
                BetSelectionController betSelectionController = this.this$0;
                mutableStateFlow5 = betSelectionController._selectedBetGroupTabIndex;
                betSelectionController.onBetGroupTabSelected(((Number) mutableStateFlow5.getValue()).intValue());
                for (BetGroupsTabs betGroupsTabs2 : arrayList7) {
                    Log.d("BetSelectionController", "Group: " + betGroupsTabs2.getTitle() + ", Bets: " + betGroupsTabs2.getBets().size());
                }
                mutableStateFlow6 = this.this$0._isLoadingBets;
                mutableStateFlow6.setValue(Boxing.boxBoolean(false));
                mutableStateFlow7 = this.this$0._isLoadingMatch;
                mutableStateFlow7.setValue(Boxing.boxBoolean(false));
                this.this$0.setLoadingStates(false);
            } else {
                Log.w("BetSelectionController", "Received empty bet groups response");
                this.this$0.handleBetGroupsLoadingError("Failed to load bet groups");
                mutableStateFlow = this.this$0._isLoadingBets;
                mutableStateFlow.setValue(Boxing.boxBoolean(false));
                mutableStateFlow2 = this.this$0._isLoadingMatch;
                mutableStateFlow2.setValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
