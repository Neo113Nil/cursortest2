package org.betup.ui.fragment.matches;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.betup.model.remote.entity.matches.MatchesSportModel;
import org.betup.model.remote.entity.matches.championship.ChampionshipLeagueModel;

/* loaded from: classes4.dex */
public final class SortUtil {
    private SortUtil() {
    }

    public static List<ChampionshipLeagueModel> processLeagues(List<ChampionshipLeagueModel> leagues, final List<Integer> favs) {
        if (!FirebaseRemoteConfig.getInstance().getBoolean("sortLeagues")) {
            return leagues;
        }
        Collections.sort(leagues, new Comparator() { // from class: org.betup.ui.fragment.matches.SortUtil$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SortUtil.lambda$processLeagues$0(favs, (ChampionshipLeagueModel) obj, (ChampionshipLeagueModel) obj2);
            }
        });
        return leagues;
    }

    static /* synthetic */ int lambda$processLeagues$0(List list, ChampionshipLeagueModel championshipLeagueModel, ChampionshipLeagueModel championshipLeagueModel2) {
        int i = 0;
        if (list.contains(championshipLeagueModel.getId())) {
            if (!list.contains(championshipLeagueModel2.getId())) {
                i = -1;
            }
        } else if (list.contains(championshipLeagueModel2.getId())) {
            i = 1;
        }
        if (i != 0) {
            return i;
        }
        int compare = Integer.compare(championshipLeagueModel2.getInterestFactor(), championshipLeagueModel.getInterestFactor());
        return compare == 0 ? championshipLeagueModel.getName().compareTo(championshipLeagueModel2.getName()) : compare;
    }

    static List<MatchesSportModel> processSports(List<MatchesSportModel> sports, final List<Integer> favs) {
        if (!FirebaseRemoteConfig.getInstance().getBoolean("sortSports")) {
            return sports;
        }
        Collections.sort(sports, new Comparator() { // from class: org.betup.ui.fragment.matches.SortUtil$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SortUtil.lambda$processSports$1(favs, (MatchesSportModel) obj, (MatchesSportModel) obj2);
            }
        });
        return sports;
    }

    static /* synthetic */ int lambda$processSports$1(List list, MatchesSportModel matchesSportModel, MatchesSportModel matchesSportModel2) {
        if (list.contains(matchesSportModel.getId())) {
            if (list.contains(matchesSportModel2.getId())) {
                return Integer.compare(matchesSportModel2.getCount(), matchesSportModel.getCount());
            }
            return -1;
        }
        if (list.contains(matchesSportModel2.getId())) {
            return 1;
        }
        return Integer.compare(matchesSportModel2.getCount(), matchesSportModel.getCount());
    }
}
