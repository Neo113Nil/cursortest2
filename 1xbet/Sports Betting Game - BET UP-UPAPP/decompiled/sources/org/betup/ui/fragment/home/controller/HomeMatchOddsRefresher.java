package org.betup.ui.fragment.home.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.entity.matches.championship.specific.MatchVarietiesToNewBetSectionConverter;
import org.betup.model.remote.entity.matches.championship.specific.NewBetSectionModel;
import org.betup.model.remote.entity.matches.championship.specific.NewListedMatchModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchOddsRefresher.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\u0017\u001a\u00020\u000bH\u0002J(\u0010\u0018\u001a\u00020\u00192\u001e\u0010\u001a\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000e0\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeMatchOddsRefresher;", "", "matchVarietiesInteractor", "Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;)V", "pendingMatchId", "", "Ljava/lang/Long;", "pendingOnUpdated", "Lkotlin/Function0;", "", "varietiesListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupModel;", "", "pendingPagination", "Lorg/betup/ui/fragment/home/controller/HomeMatchesPaginationController;", "refreshMatchInPlace", "matchId", "pagination", "onUpdated", "clearPending", "isSuccess", "", "response", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchOddsRefresher {
    public static final int $stable = 8;
    private final MatchVarietiesInteractor matchVarietiesInteractor;
    private Long pendingMatchId;
    private Function0<Unit> pendingOnUpdated;
    private HomeMatchesPaginationController pendingPagination;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<MatchVarietyGroupModel>, List<Integer>> varietiesListener;

    public HomeMatchOddsRefresher(MatchVarietiesInteractor matchVarietiesInteractor) {
        Intrinsics.checkNotNullParameter(matchVarietiesInteractor, "matchVarietiesInteractor");
        this.matchVarietiesInteractor = matchVarietiesInteractor;
        this.varietiesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.controller.HomeMatchOddsRefresher$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                HomeMatchOddsRefresher.varietiesListener$lambda$0(HomeMatchOddsRefresher.this, fetchedResponseMessage);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void varietiesListener$lambda$0(HomeMatchOddsRefresher homeMatchOddsRefresher, FetchedResponseMessage fetchedResponseMessage) {
        NewListedMatchModel findListedMatch;
        Long l = homeMatchOddsRefresher.pendingMatchId;
        if (l != null) {
            long longValue = l.longValue();
            HomeMatchesPaginationController homeMatchesPaginationController = homeMatchOddsRefresher.pendingPagination;
            if (homeMatchesPaginationController == null) {
                return;
            }
            Function0<Unit> function0 = homeMatchOddsRefresher.pendingOnUpdated;
            homeMatchOddsRefresher.clearPending();
            Intrinsics.checkNotNull(fetchedResponseMessage);
            if (homeMatchOddsRefresher.isSuccess(fetchedResponseMessage)) {
                List<MatchVarietyGroupModel> list = (List) fetchedResponseMessage.getModel();
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                if (list.isEmpty() || (findListedMatch = homeMatchesPaginationController.findListedMatch(longValue)) == null || !homeMatchesPaginationController.replaceListedMatch(longValue, NewListedMatchModel.copy$default(findListedMatch, null, null, MatchVarietiesToNewBetSectionConverter.INSTANCE.convert(list), 3, null)) || function0 == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }

    public final void refreshMatchInPlace(long matchId, HomeMatchesPaginationController pagination, Function0<Unit> onUpdated) {
        NewListedMatchModel findListedMatch;
        Intrinsics.checkNotNullParameter(pagination, "pagination");
        Intrinsics.checkNotNullParameter(onUpdated, "onUpdated");
        if (matchId > 0 && (findListedMatch = pagination.findListedMatch(matchId)) != null) {
            List<NewBetSectionModel> bets = findListedMatch.getBets();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets, 10));
            Iterator<T> it = bets.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf((int) ((NewBetSectionModel) it.next()).getVariety().getId()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).intValue() > 0) {
                    arrayList2.add(obj);
                }
            }
            List distinct = CollectionsKt.distinct(arrayList2);
            if (distinct.isEmpty()) {
                return;
            }
            this.pendingMatchId = Long.valueOf(matchId);
            this.pendingPagination = pagination;
            this.pendingOnUpdated = onUpdated;
            this.matchVarietiesInteractor.invalidate(distinct);
            this.matchVarietiesInteractor.load(this.varietiesListener, distinct);
        }
    }

    private final void clearPending() {
        this.pendingMatchId = null;
        this.pendingPagination = null;
        this.pendingOnUpdated = null;
    }

    private final boolean isSuccess(FetchedResponseMessage<List<MatchVarietyGroupModel>, List<Integer>> response) {
        return response.getStat() == FetchStat.SUCCESS && response.getModel() != null;
    }
}
