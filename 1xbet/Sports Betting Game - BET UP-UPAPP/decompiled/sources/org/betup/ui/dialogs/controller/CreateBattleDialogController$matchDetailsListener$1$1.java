package org.betup.ui.dialogs.controller;

import android.util.Log;
import com.ironsource.InterfaceC3497ge;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.details.SubmatchModelShort;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;

/* compiled from: CreateBattleDialogController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.CreateBattleDialogController$matchDetailsListener$1$1", f = "CreateBattleDialogController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CreateBattleDialogController$matchDetailsListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<MatchShortInfoModel, Integer> $responseMessage;
    int label;
    final /* synthetic */ CreateBattleDialogController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateBattleDialogController$matchDetailsListener$1$1(FetchedResponseMessage<MatchShortInfoModel, Integer> fetchedResponseMessage, CreateBattleDialogController createBattleDialogController, Continuation<? super CreateBattleDialogController$matchDetailsListener$1$1> continuation) {
        super(2, continuation);
        this.$responseMessage = fetchedResponseMessage;
        this.this$0 = createBattleDialogController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateBattleDialogController$matchDetailsListener$1$1(this.$responseMessage, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateBattleDialogController$matchDetailsListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        BaseCachedSharedInteractor.OnFetchedListener onFetchedListener;
        MutableStateFlow mutableStateFlow2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            if (this.$responseMessage.getModel() != null) {
                mutableStateFlow = this.this$0._subMatches;
                List<SubmatchModelShort> submatches = this.$responseMessage.getModel().getSubmatches();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(submatches, 10));
                for (SubmatchModelShort submatchModelShort : submatches) {
                    arrayList.add(new BetGroupsTabs(submatchModelShort.getBetsGameType(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), new Function0() { // from class: org.betup.ui.dialogs.controller.CreateBattleDialogController$matchDetailsListener$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    }, (int) submatchModelShort.getId(), false, 0, 0, null, submatchModelShort.getParamTId(), null, InterfaceC3497ge.c.g, null));
                }
                mutableStateFlow.setValue(arrayList);
                this.this$0.setLoadingStates(false);
                List<SubmatchModelShort> submatches2 = this.$responseMessage.getModel().getSubmatches();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(submatches2, 10));
                Iterator<T> it = submatches2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boxing.boxInt((int) ((SubmatchModelShort) it.next()).getId()));
                }
                MatchVarietiesInteractor matchBetGroupsInteractor = this.this$0.getMatchBetGroupsInteractor();
                onFetchedListener = this.this$0.matchBetListener;
                matchBetGroupsInteractor.load(onFetchedListener, arrayList2);
                mutableStateFlow2 = this.this$0._subMatches;
                Boxing.boxInt(Log.d("CreateBattleDialogController", "Match details loaded, subMatches: " + ((List) mutableStateFlow2.getValue()).size()));
            } else {
                Log.w("CreateBattleDialogController", "Received empty match details");
                this.this$0.setLoadingStates(false);
            }
        } catch (Exception e) {
            Log.e("CreateBattleDialogController", "Error processing match details: " + e.getMessage(), e);
            this.this$0.setLoadingStates(false);
        }
        return Unit.INSTANCE;
    }
}
