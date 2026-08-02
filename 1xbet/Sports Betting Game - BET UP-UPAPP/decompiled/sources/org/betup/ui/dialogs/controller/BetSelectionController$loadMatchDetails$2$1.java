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
import org.betup.model.remote.entity.matches.NewLeagueModel;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.model.remote.entity.matches.NewMatchModel;
import org.betup.model.remote.entity.matches.NewMatchSocialModel;
import org.betup.model.remote.entity.matches.NewSportModel;
import org.betup.model.remote.entity.matches.NewTeamModel;
import org.betup.model.remote.entity.matches.details.LeagueModelShort;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.details.SubmatchModelShort;
import org.betup.model.remote.entity.matches.details.TeamModelShort;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;

/* compiled from: BetSelectionController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.BetSelectionController$loadMatchDetails$2$1", f = "BetSelectionController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BetSelectionController$loadMatchDetails$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<MatchShortInfoModel, Integer> $response;
    int label;
    final /* synthetic */ BetSelectionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetSelectionController$loadMatchDetails$2$1(BetSelectionController betSelectionController, FetchedResponseMessage<MatchShortInfoModel, Integer> fetchedResponseMessage, Continuation<? super BetSelectionController$loadMatchDetails$2$1> continuation) {
        super(2, continuation);
        this.this$0 = betSelectionController;
        this.$response = fetchedResponseMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetSelectionController$loadMatchDetails$2$1(this.this$0, this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetSelectionController$loadMatchDetails$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        MutableStateFlow mutableStateFlow;
        String str;
        String str2;
        String str3;
        String str4;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        String name;
        String name2;
        List<SubmatchModelShort> submatches;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            job = this.this$0.matchLoadingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            MatchShortInfoModel model = this.$response.getModel();
            Log.d("BetSelectionController", "Match details loaded, subMatches: " + ((model == null || (submatches = model.getSubmatches()) == null) ? 0 : submatches.size()));
            if (!Intrinsics.areEqual(this.$response.getStat().name(), "SUCCESS") || this.$response.getModel() == null) {
                Log.w("BetSelectionController", "Received empty match details");
                this.this$0.handleMatchLoadingError("Failed to load match details");
                mutableStateFlow = this.this$0._isLoadingMatch;
                mutableStateFlow.setValue(Boxing.boxBoolean(false));
            } else {
                MatchShortInfoModel model2 = this.$response.getModel();
                long id = model2.getId();
                long id2 = model2.getLeague() != null ? r5.getId() : 0L;
                LeagueModelShort league = model2.getLeague();
                String str5 = "";
                if (league == null || (str = league.getPhotoUrl()) == null) {
                    str = "";
                }
                LeagueModelShort league2 = model2.getLeague();
                if (league2 == null || (str2 = league2.getName()) == null) {
                    str2 = "";
                }
                NewLeagueModel newLeagueModel = new NewLeagueModel(id2, str, str2);
                long id3 = model2.getAwayTeam() != null ? r13.getId() : 0L;
                TeamModelShort awayTeam = model2.getAwayTeam();
                if (awayTeam == null || (str3 = awayTeam.getPhotoUrl()) == null) {
                    str3 = "";
                }
                TeamModelShort awayTeam2 = model2.getAwayTeam();
                NewTeamModel newTeamModel = new NewTeamModel(id3, str3, (awayTeam2 == null || (name2 = awayTeam2.getName()) == null) ? "" : name2);
                long id4 = model2.getHomeTeam() != null ? r13.getId() : 0L;
                TeamModelShort homeTeam = model2.getHomeTeam();
                if (homeTeam == null || (str4 = homeTeam.getPhotoUrl()) == null) {
                    str4 = "";
                }
                TeamModelShort homeTeam2 = model2.getHomeTeam();
                if (homeTeam2 != null && (name = homeTeam2.getName()) != null) {
                    str5 = name;
                }
                NewMatchItemModel newMatchItemModel = new NewMatchItemModel(new NewMatchModel(id, newLeagueModel, newTeamModel, new NewTeamModel(id4, str4, str5), new NewSportModel(model2.getSport().getId(), model2.getSport().getPhotoUrl(), model2.getSport().getName(), model2.getSport().getPeriod(), null, 16, null), model2.getScoreAway().intValue(), model2.getScoreHome().intValue(), model2.getDate(), model2.getMatchState(), null, null, null, null, 7680, null), new NewMatchSocialModel(model2.getId(), 0, 0, 0, 0, false), CollectionsKt.emptyList());
                mutableStateFlow2 = this.this$0._selectedMatch;
                mutableStateFlow2.setValue(newMatchItemModel);
                List<SubmatchModelShort> submatches2 = this.$response.getModel().getSubmatches();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(submatches2, 10));
                int i = 0;
                for (Object obj2 : submatches2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SubmatchModelShort submatchModelShort = (SubmatchModelShort) obj2;
                    arrayList.add(new BetGroupsTabs(submatchModelShort.getBetsGameType(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), new Function0() { // from class: org.betup.ui.dialogs.controller.BetSelectionController$loadMatchDetails$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    }, (int) submatchModelShort.getId(), i == 0, 0, 0, null, null, null, 1984, null));
                    i = i2;
                }
                mutableStateFlow3 = this.this$0._subMatches;
                mutableStateFlow3.setValue(arrayList);
                List<SubmatchModelShort> submatches3 = this.$response.getModel().getSubmatches();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(submatches3, 10));
                Iterator<T> it = submatches3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boxing.boxLong(((SubmatchModelShort) it.next()).getId()));
                }
                ArrayList arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    this.this$0.loadBetGroups(arrayList3);
                } else {
                    mutableStateFlow4 = this.this$0._isLoadingMatch;
                    mutableStateFlow4.setValue(Boxing.boxBoolean(false));
                    this.this$0.setLoadingStates(false);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
