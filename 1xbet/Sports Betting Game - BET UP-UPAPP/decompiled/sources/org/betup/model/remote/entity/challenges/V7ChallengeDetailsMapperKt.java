package org.betup.model.remote.entity.challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.challenges.ChallengeState;

/* compiled from: V7ChallengeDetailsMapper.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\b\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000bH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u000bH\u0002\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u000bH\u0002\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0002\u001a\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u001aH\u0002\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0002¨\u0006\u001e"}, d2 = {"toLegacyDetails", "Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;", "Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;", "currentUserId", "", "(Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;Ljava/lang/Long;)Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;", "toHistoryBattle", "Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "(Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;Ljava/lang/Long;)Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "toCreatorModel", "Lorg/betup/model/remote/entity/challenges/NewChallengeCreatorModel;", "Lorg/betup/model/remote/entity/challenges/V7ChallengeUserModel;", "toChallengeCreator", "Lorg/betup/model/remote/entity/challenges/ChallengeCreator;", "toUserBattleParticipant", "Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantModel;", "Lorg/betup/model/remote/entity/challenges/V7ChallengeParticipantModel;", "toUserBattleParticipantUser", "Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantUserModel;", "toParticipantModel", "Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;", "toCountryModel", "Lorg/betup/model/remote/entity/challenges/NewChallengeCountryModel;", "Lorg/betup/model/remote/entity/challenges/V7ChallengeCountryModel;", "toBetModel", "Lorg/betup/model/remote/entity/challenges/NewChallengeBetModel;", "Lorg/betup/model/remote/entity/challenges/V7ChallengePlacedBetModel;", "toUserBattleMatch", "Lorg/betup/model/remote/entity/challenges/NewUserBattleMatchModel;", "Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class V7ChallengeDetailsMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final NewChallengeDetailsResponseModelP toLegacyDetails(V7ChallengeDetailsResponseModel v7ChallengeDetailsResponseModel, Long l) {
        Object obj;
        Integer num;
        Iterator<T> it;
        Iterator<T> it2;
        Object obj2;
        Intrinsics.checkNotNullParameter(v7ChallengeDetailsResponseModel, "<this>");
        List<V7ChallengeParticipantModel> participants = v7ChallengeDetailsResponseModel.getParticipants();
        if (participants == null) {
            participants = CollectionsKt.emptyList();
        }
        List<V7ChallengeParticipantModel> list = participants;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (Intrinsics.areEqual((Object) ((V7ChallengeParticipantModel) obj).isCreator(), (Object) true)) {
                break;
            }
        }
        V7ChallengeParticipantModel v7ChallengeParticipantModel = (V7ChallengeParticipantModel) obj;
        V7ChallengeUserModel user = v7ChallengeParticipantModel != null ? v7ChallengeParticipantModel.getUser() : null;
        if (l != null) {
            long longValue = l.longValue();
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                V7ChallengeUserModel user2 = ((V7ChallengeParticipantModel) obj2).getUser();
                if (user2 != null && user2.getId() == longValue) {
                    break;
                }
            }
            V7ChallengeParticipantModel v7ChallengeParticipantModel2 = (V7ChallengeParticipantModel) obj2;
            if (v7ChallengeParticipantModel2 != null) {
                num = v7ChallengeParticipantModel2.getState();
                NewChallengeDetailsModel newChallengeDetailsModel = new NewChallengeDetailsModel(Long.valueOf(v7ChallengeDetailsResponseModel.getId()), v7ChallengeDetailsResponseModel.getMoneyAccept() == null ? Long.valueOf(r4.intValue()) : null, v7ChallengeDetailsResponseModel.getEnterFee() == null ? Long.valueOf(r4.intValue()) : null, v7ChallengeDetailsResponseModel.getMoneyToWin() == null ? Long.valueOf(r4.intValue()) : null, v7ChallengeDetailsResponseModel.getState(), num);
                NewChallengeCreatorModel creatorModel = user == null ? toCreatorModel(user) : null;
                NewChallengeMatchModel match = v7ChallengeDetailsResponseModel.getMatch();
                ArrayList arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    V7ChallengeUserModel user3 = ((V7ChallengeParticipantModel) it.next()).getUser();
                    NewChallengeParticipantModel participantModel = user3 != null ? toParticipantModel(user3) : null;
                    if (participantModel != null) {
                        arrayList.add(participantModel);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList();
                it2 = list.iterator();
                while (it2.hasNext()) {
                    V7ChallengePlacedBetModel placedBet = ((V7ChallengeParticipantModel) it2.next()).getPlacedBet();
                    NewChallengeBetModel betModel = placedBet != null ? toBetModel(placedBet) : null;
                    if (betModel != null) {
                        arrayList3.add(betModel);
                    }
                }
                return new NewChallengeDetailsResponseModelP(newChallengeDetailsModel, creatorModel, match, num, arrayList2, arrayList3);
            }
        }
        num = null;
        if (v7ChallengeDetailsResponseModel.getMoneyAccept() == null) {
        }
        if (v7ChallengeDetailsResponseModel.getEnterFee() == null) {
        }
        NewChallengeDetailsModel newChallengeDetailsModel2 = new NewChallengeDetailsModel(Long.valueOf(v7ChallengeDetailsResponseModel.getId()), v7ChallengeDetailsResponseModel.getMoneyAccept() == null ? Long.valueOf(r4.intValue()) : null, v7ChallengeDetailsResponseModel.getEnterFee() == null ? Long.valueOf(r4.intValue()) : null, v7ChallengeDetailsResponseModel.getMoneyToWin() == null ? Long.valueOf(r4.intValue()) : null, v7ChallengeDetailsResponseModel.getState(), num);
        if (user == null) {
        }
        NewChallengeMatchModel match2 = v7ChallengeDetailsResponseModel.getMatch();
        ArrayList arrayList4 = new ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = arrayList4;
        ArrayList arrayList32 = new ArrayList();
        it2 = list.iterator();
        while (it2.hasNext()) {
        }
        return new NewChallengeDetailsResponseModelP(newChallengeDetailsModel2, creatorModel, match2, num, arrayList22, arrayList32);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103 A[LOOP:2: B:57:0x00fd->B:59:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final NewUserBattleModel toHistoryBattle(V7ChallengeDetailsResponseModel v7ChallengeDetailsResponseModel, Long l) {
        Integer num;
        ChallengeState.NONE fromServerGlobalInt;
        ChallengeState.NONE fromInt;
        List<V7ChallengeParticipantModel> participants;
        Iterator<T> it;
        Object obj;
        List<V7ChallengeParticipantModel> participants2;
        Iterator<T> it2;
        V7ChallengeUserModel user;
        Object obj2;
        Intrinsics.checkNotNullParameter(v7ChallengeDetailsResponseModel, "<this>");
        if (l != null) {
            long longValue = l.longValue();
            List<V7ChallengeParticipantModel> participants3 = v7ChallengeDetailsResponseModel.getParticipants();
            if (participants3 == null) {
                participants3 = CollectionsKt.emptyList();
            }
            Iterator<T> it3 = participants3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                V7ChallengeUserModel user2 = ((V7ChallengeParticipantModel) obj2).getUser();
                if (user2 != null && user2.getId() == longValue) {
                    break;
                }
            }
            V7ChallengeParticipantModel v7ChallengeParticipantModel = (V7ChallengeParticipantModel) obj2;
            if (v7ChallengeParticipantModel != null) {
                num = v7ChallengeParticipantModel.getState();
                long id = v7ChallengeDetailsResponseModel.getId();
                long intValue = v7ChallengeDetailsResponseModel.getMoneyAccept() == null ? r3.intValue() : 0L;
                long intValue2 = v7ChallengeDetailsResponseModel.getEnterFee() == null ? r3.intValue() : 0L;
                long intValue3 = v7ChallengeDetailsResponseModel.getMoneyToWin() != null ? r3.intValue() : 0L;
                ChallengeState.Companion companion = ChallengeState.INSTANCE;
                Integer state = v7ChallengeDetailsResponseModel.getState();
                fromServerGlobalInt = companion.fromServerGlobalInt(state == null ? state.intValue() : 0);
                if (fromServerGlobalInt == null) {
                    fromServerGlobalInt = ChallengeState.NONE.INSTANCE;
                }
                ChallengeState challengeState = fromServerGlobalInt;
                fromInt = ChallengeState.INSTANCE.fromInt(num != null ? num.intValue() : 0);
                if (fromInt == null) {
                    fromInt = ChallengeState.NONE.INSTANCE;
                }
                participants = v7ChallengeDetailsResponseModel.getParticipants();
                if (participants == null) {
                    participants = CollectionsKt.emptyList();
                }
                it = participants.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((V7ChallengeParticipantModel) obj).isCreator(), (Object) true)) {
                        break;
                    }
                }
                V7ChallengeParticipantModel v7ChallengeParticipantModel2 = (V7ChallengeParticipantModel) obj;
                ChallengeCreator challengeCreator = (v7ChallengeParticipantModel2 != null || (user = v7ChallengeParticipantModel2.getUser()) == null) ? null : toChallengeCreator(user);
                participants2 = v7ChallengeDetailsResponseModel.getParticipants();
                if (participants2 == null) {
                    participants2 = CollectionsKt.emptyList();
                }
                List<V7ChallengeParticipantModel> list = participants2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(toUserBattleParticipant((V7ChallengeParticipantModel) it2.next()));
                }
                ArrayList arrayList2 = arrayList;
                NewChallengeMatchModel match = v7ChallengeDetailsResponseModel.getMatch();
                return new NewUserBattleModel(id, intValue, intValue2, intValue3, challengeState, fromInt, challengeCreator, arrayList2, match != null ? toUserBattleMatch(match) : null);
            }
        }
        num = null;
        long id2 = v7ChallengeDetailsResponseModel.getId();
        if (v7ChallengeDetailsResponseModel.getMoneyAccept() == null) {
        }
        if (v7ChallengeDetailsResponseModel.getEnterFee() == null) {
        }
        long intValue32 = v7ChallengeDetailsResponseModel.getMoneyToWin() != null ? r3.intValue() : 0L;
        ChallengeState.Companion companion2 = ChallengeState.INSTANCE;
        Integer state2 = v7ChallengeDetailsResponseModel.getState();
        fromServerGlobalInt = companion2.fromServerGlobalInt(state2 == null ? state2.intValue() : 0);
        if (fromServerGlobalInt == null) {
        }
        ChallengeState challengeState2 = fromServerGlobalInt;
        fromInt = ChallengeState.INSTANCE.fromInt(num != null ? num.intValue() : 0);
        if (fromInt == null) {
        }
        participants = v7ChallengeDetailsResponseModel.getParticipants();
        if (participants == null) {
        }
        it = participants.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        V7ChallengeParticipantModel v7ChallengeParticipantModel22 = (V7ChallengeParticipantModel) obj;
        if (v7ChallengeParticipantModel22 != null) {
        }
        participants2 = v7ChallengeDetailsResponseModel.getParticipants();
        if (participants2 == null) {
        }
        List<V7ChallengeParticipantModel> list2 = participants2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList22 = arrayList3;
        NewChallengeMatchModel match2 = v7ChallengeDetailsResponseModel.getMatch();
        return new NewUserBattleModel(id2, intValue, intValue2, intValue32, challengeState2, fromInt, challengeCreator, arrayList22, match2 != null ? toUserBattleMatch(match2) : null);
    }

    private static final NewChallengeCreatorModel toCreatorModel(V7ChallengeUserModel v7ChallengeUserModel) {
        return new NewChallengeCreatorModel(v7ChallengeUserModel.getId(), v7ChallengeUserModel.getName(), null, v7ChallengeUserModel.getPhotoUrl());
    }

    private static final ChallengeCreator toChallengeCreator(V7ChallengeUserModel v7ChallengeUserModel) {
        return new ChallengeCreator(v7ChallengeUserModel.getId(), v7ChallengeUserModel.getName(), null, v7ChallengeUserModel.getPhotoUrl());
    }

    private static final NewUserBattleParticipantModel toUserBattleParticipant(V7ChallengeParticipantModel v7ChallengeParticipantModel) {
        V7ChallengeUserModel user = v7ChallengeParticipantModel.getUser();
        return new NewUserBattleParticipantModel(user != null ? toUserBattleParticipantUser(user) : null, v7ChallengeParticipantModel.isCreator(), v7ChallengeParticipantModel.getState(), v7ChallengeParticipantModel.getMoneyReturned(), v7ChallengeParticipantModel.getFinalCoefficient(), v7ChallengeParticipantModel.getPlacedBet());
    }

    private static final NewUserBattleParticipantUserModel toUserBattleParticipantUser(V7ChallengeUserModel v7ChallengeUserModel) {
        return new NewUserBattleParticipantUserModel(v7ChallengeUserModel.getPhotoUrl(), v7ChallengeUserModel.getId(), v7ChallengeUserModel.getName(), v7ChallengeUserModel.getCountry());
    }

    private static final NewChallengeParticipantModel toParticipantModel(V7ChallengeUserModel v7ChallengeUserModel) {
        long id = v7ChallengeUserModel.getId();
        String name = v7ChallengeUserModel.getName();
        String photoUrl = v7ChallengeUserModel.getPhotoUrl();
        V7ChallengeCountryModel country = v7ChallengeUserModel.getCountry();
        return new NewChallengeParticipantModel(id, name, photoUrl, null, null, null, null, country != null ? toCountryModel(country) : null, null, null, null, null, null, null);
    }

    private static final NewChallengeCountryModel toCountryModel(V7ChallengeCountryModel v7ChallengeCountryModel) {
        return new NewChallengeCountryModel(v7ChallengeCountryModel.getId(), v7ChallengeCountryModel.getIso(), v7ChallengeCountryModel.getNiceName(), v7ChallengeCountryModel.getPhoto());
    }

    private static final NewChallengeBetModel toBetModel(V7ChallengePlacedBetModel v7ChallengePlacedBetModel) {
        Long id = v7ChallengePlacedBetModel.getId();
        if (id != null) {
            return new NewChallengeBetModel(id.longValue(), v7ChallengePlacedBetModel.getBet());
        }
        return null;
    }

    private static final NewUserBattleMatchModel toUserBattleMatch(NewChallengeMatchModel newChallengeMatchModel) {
        NewUserBattleSportModel newUserBattleSportModel;
        long id = newChallengeMatchModel.getId();
        NewChallengeLeagueModel league = newChallengeMatchModel.getLeague();
        NewUserBattleLeagueModel newUserBattleLeagueModel = league != null ? new NewUserBattleLeagueModel(Integer.valueOf((int) league.getId()), league.getPhotoUrl(), league.getName()) : null;
        NewChallengeTeamModel awayTeam = newChallengeMatchModel.getAwayTeam();
        NewUserBattleTeamModel newUserBattleTeamModel = awayTeam != null ? new NewUserBattleTeamModel(Integer.valueOf((int) awayTeam.getId()), awayTeam.getPhotoUrl(), awayTeam.getName()) : null;
        NewChallengeTeamModel homeTeam = newChallengeMatchModel.getHomeTeam();
        NewUserBattleTeamModel newUserBattleTeamModel2 = homeTeam != null ? new NewUserBattleTeamModel(Integer.valueOf((int) homeTeam.getId()), homeTeam.getPhotoUrl(), homeTeam.getName()) : null;
        NewChallengeSportModel sport = newChallengeMatchModel.getSport();
        if (sport != null) {
            Integer valueOf = Integer.valueOf((int) sport.getId());
            String photoUrl = sport.getPhotoUrl();
            String name = sport.getName();
            String period = sport.getPeriod();
            Object photoBackground = sport.getPhotoBackground();
            newUserBattleSportModel = new NewUserBattleSportModel(valueOf, photoUrl, name, period, photoBackground instanceof String ? (String) photoBackground : null);
        } else {
            newUserBattleSportModel = null;
        }
        Double scoreAway = newChallengeMatchModel.getScoreAway();
        Integer valueOf2 = scoreAway != null ? Integer.valueOf((int) scoreAway.doubleValue()) : null;
        Double scoreHome = newChallengeMatchModel.getScoreHome();
        Integer valueOf3 = scoreHome != null ? Integer.valueOf((int) scoreHome.doubleValue()) : null;
        String date = newChallengeMatchModel.getDate();
        Integer matchState = newChallengeMatchModel.getMatchState();
        List<Object> submatches = newChallengeMatchModel.getSubmatches();
        Object statVarietyId = newChallengeMatchModel.getStatVarietyId();
        Integer num = statVarietyId instanceof Integer ? (Integer) statVarietyId : null;
        Object currentPeriod = newChallengeMatchModel.getCurrentPeriod();
        return new NewUserBattleMatchModel(id, newUserBattleLeagueModel, newUserBattleTeamModel, newUserBattleTeamModel2, newUserBattleSportModel, valueOf2, valueOf3, date, matchState, submatches, num, currentPeriod instanceof String ? (String) currentPeriod : null, newChallengeMatchModel.getCurrentTime(), null, 8192, null);
    }
}
