package org.betup.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.matches.details.LeagueModelShort;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsLeagueModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsSportModel;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.details.SportModelShort;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationMatchContext.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\fJ3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lorg/betup/presentation/PresentationMatchContext;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "fromShortMatch", "", "", "match", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "fallbackMatchId", "", "fromMatchDetails", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsDataModel;", "fromBetSlip", "bets", "", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "betAmount", "(Ljava/util/List;Ljava/lang/Integer;)Ljava/util/Map;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationMatchContext {
    public static final int $stable = 0;
    public static final PresentationMatchContext INSTANCE = new PresentationMatchContext();

    private PresentationMatchContext() {
    }

    public static /* synthetic */ Map fromShortMatch$default(PresentationMatchContext presentationMatchContext, MatchShortInfoModel matchShortInfoModel, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return presentationMatchContext.fromShortMatch(matchShortInfoModel, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, String> fromShortMatch(MatchShortInfoModel match, int fallbackMatchId) {
        String num;
        LeagueModelShort league;
        String name;
        String obj;
        LeagueModelShort league2;
        SportModelShort sport;
        SportModelShort sport2;
        String name2;
        String obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (match != null) {
            Long valueOf = Long.valueOf(match.getId());
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                num = valueOf.toString();
            }
        }
        Integer valueOf2 = Integer.valueOf(fallbackMatchId);
        if (valueOf2.intValue() <= 0) {
            valueOf2 = null;
        }
        num = valueOf2 != null ? valueOf2.toString() : null;
        if (num != null) {
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            linkedHashMap2.put("match_id", num);
            linkedHashMap2.put("match_ids", num);
        }
        if (match != null && (sport2 = match.getSport()) != null && (name2 = sport2.getName()) != null && (obj2 = StringsKt.trim((CharSequence) name2).toString()) != null) {
            if (obj2.length() <= 0) {
                obj2 = null;
            }
            if (obj2 != null) {
                linkedHashMap.put("sport", obj2);
            }
        }
        if (match != null && (sport = match.getSport()) != null) {
            Integer valueOf3 = Integer.valueOf(sport.getId());
            if (valueOf3.intValue() <= 0) {
                valueOf3 = null;
            }
            if (valueOf3 != null) {
                linkedHashMap.put("sport_id", String.valueOf(valueOf3.intValue()));
            }
        }
        if (match != null && (league2 = match.getLeague()) != null) {
            Integer valueOf4 = Integer.valueOf(league2.getId());
            if (valueOf4.intValue() <= 0) {
                valueOf4 = null;
            }
            if (valueOf4 != null) {
                linkedHashMap.put("league_id", String.valueOf(valueOf4.intValue()));
            }
        }
        if (match != null && (league = match.getLeague()) != null && (name = league.getName()) != null && (obj = StringsKt.trim((CharSequence) name).toString()) != null) {
            String str = obj.length() > 0 ? obj : null;
            if (str != null) {
                linkedHashMap.put("league", str);
            }
        }
        return linkedHashMap;
    }

    public final Map<String, String> fromMatchDetails(MatchDetailsDataModel match) {
        String name;
        String obj;
        Integer id;
        Integer id2;
        String name2;
        String obj2;
        if (match == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer id3 = match.getId();
        if (id3 != null) {
            if (id3.intValue() <= 0) {
                id3 = null;
            }
            if (id3 != null) {
                int intValue = id3.intValue();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                linkedHashMap2.put("match_id", String.valueOf(intValue));
                linkedHashMap2.put("match_ids", String.valueOf(intValue));
            }
        }
        MatchDetailsSportModel sport = match.getSport();
        if (sport != null && (name2 = sport.getName()) != null && (obj2 = StringsKt.trim((CharSequence) name2).toString()) != null) {
            if (obj2.length() <= 0) {
                obj2 = null;
            }
            if (obj2 != null) {
                linkedHashMap.put("sport", obj2);
            }
        }
        MatchDetailsSportModel sport2 = match.getSport();
        if (sport2 != null && (id2 = sport2.getId()) != null) {
            if (id2.intValue() <= 0) {
                id2 = null;
            }
            if (id2 != null) {
                linkedHashMap.put("sport_id", String.valueOf(id2.intValue()));
            }
        }
        MatchDetailsLeagueModel league = match.getLeague();
        if (league != null && (id = league.getId()) != null) {
            if (id.intValue() <= 0) {
                id = null;
            }
            if (id != null) {
                linkedHashMap.put("league_id", String.valueOf(id.intValue()));
            }
        }
        MatchDetailsLeagueModel league2 = match.getLeague();
        if (league2 != null && (name = league2.getName()) != null && (obj = StringsKt.trim((CharSequence) name).toString()) != null) {
            String str = obj.length() > 0 ? obj : null;
            if (str != null) {
                linkedHashMap.put("league", str);
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map fromBetSlip$default(PresentationMatchContext presentationMatchContext, List list, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return presentationMatchContext.fromBetSlip(list, num);
    }

    public final Map<String, String> fromBetSlip(List<? extends BetModel> bets, Integer betAmount) {
        Integer num;
        String name;
        String obj;
        Integer id;
        Integer id2;
        String name2;
        String obj2;
        List<? extends BetModel> list = bets;
        if (list == null || list.isEmpty()) {
            return MapsKt.emptyMap();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = bets.iterator();
        while (it.hasNext()) {
            MatchDetailsDataModel match = ((BetModel) it.next()).getMatch();
            if (match != null) {
                arrayList.add(match);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return MapsKt.emptyMap();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Integer id3 = ((MatchDetailsDataModel) it2.next()).getId();
            if (id3 != null && id3.intValue() > 0) {
                num = id3;
            }
            if (num != null) {
                arrayList3.add(num);
            }
        }
        List distinct = CollectionsKt.distinct(arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!distinct.isEmpty()) {
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            linkedHashMap2.put("match_id", String.valueOf(((Number) CollectionsKt.first(distinct)).intValue()));
            linkedHashMap2.put("match_ids", CollectionsKt.joinToString$default(distinct, ",", null, null, 0, null, null, 62, null));
        }
        MatchDetailsDataModel matchDetailsDataModel = (MatchDetailsDataModel) CollectionsKt.first((List) arrayList2);
        MatchDetailsSportModel sport = matchDetailsDataModel.getSport();
        if (sport != null && (name2 = sport.getName()) != null && (obj2 = StringsKt.trim((CharSequence) name2).toString()) != null) {
            if (obj2.length() <= 0) {
                obj2 = null;
            }
            if (obj2 != null) {
                linkedHashMap.put("sport", obj2);
            }
        }
        MatchDetailsSportModel sport2 = matchDetailsDataModel.getSport();
        if (sport2 != null && (id2 = sport2.getId()) != null) {
            if (id2.intValue() <= 0) {
                id2 = null;
            }
            if (id2 != null) {
                linkedHashMap.put("sport_id", String.valueOf(id2.intValue()));
            }
        }
        MatchDetailsLeagueModel league = matchDetailsDataModel.getLeague();
        if (league != null && (id = league.getId()) != null) {
            if (id.intValue() <= 0) {
                id = null;
            }
            if (id != null) {
                linkedHashMap.put("league_id", String.valueOf(id.intValue()));
            }
        }
        MatchDetailsLeagueModel league2 = matchDetailsDataModel.getLeague();
        if (league2 != null && (name = league2.getName()) != null && (obj = StringsKt.trim((CharSequence) name).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                linkedHashMap.put("league", obj);
            }
        }
        if (betAmount != null) {
            num = betAmount.intValue() >= 0 ? betAmount : null;
            if (num != null) {
                linkedHashMap.put("bet_amount", String.valueOf(num.intValue()));
            }
        }
        return linkedHashMap;
    }
}
