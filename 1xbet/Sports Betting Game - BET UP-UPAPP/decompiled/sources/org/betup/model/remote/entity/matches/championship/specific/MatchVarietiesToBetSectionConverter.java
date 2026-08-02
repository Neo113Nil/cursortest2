package org.betup.model.remote.entity.matches.championship.specific;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.bets.BetGroupModel;
import org.betup.model.remote.entity.bets.BetGroupSectionModel;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchVarietiesToBetSectionConverter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lorg/betup/model/remote/entity/matches/championship/specific/MatchVarietiesToBetSectionConverter;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "convert", "", "Lorg/betup/model/remote/entity/bets/BetSectionModel;", "varieties", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupModel;", "convertVariety", "variety", "convertBetGroup", "Lorg/betup/model/remote/entity/bets/BetGroupSectionModel;", "betGroup", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MatchVarietiesToBetSectionConverter {
    public static final int $stable = 0;
    public static final MatchVarietiesToBetSectionConverter INSTANCE = new MatchVarietiesToBetSectionConverter();

    private MatchVarietiesToBetSectionConverter() {
    }

    public final List<BetSectionModel> convert(List<MatchVarietyGroupModel> varieties) {
        Intrinsics.checkNotNullParameter(varieties, "varieties");
        List<MatchVarietyGroupModel> list = varieties;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertVariety((MatchVarietyGroupModel) it.next()));
        }
        return arrayList;
    }

    private final BetSectionModel convertVariety(MatchVarietyGroupModel variety) {
        BetSectionModel betSectionModel = new BetSectionModel();
        SubMatchModel subMatchModel = new SubMatchModel();
        subMatchModel.setId((int) variety.getGroup().getId());
        subMatchModel.setScoreAway(variety.getGroup().getScoreAway());
        subMatchModel.setScoreHome(variety.getGroup().getScoreHome());
        subMatchModel.setName(variety.getGroup().getBetsGameType());
        betSectionModel.setSection(subMatchModel);
        List<MatchVarietyGroupBetsModel> bets = variety.getBets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets, 10));
        Iterator<T> it = bets.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertBetGroup((MatchVarietyGroupBetsModel) it.next()));
        }
        betSectionModel.setGroups(arrayList);
        return betSectionModel;
    }

    private final BetGroupSectionModel convertBetGroup(MatchVarietyGroupBetsModel betGroup) {
        BetGroupSectionModel betGroupSectionModel = new BetGroupSectionModel();
        BetGroupModel betGroupModel = new BetGroupModel();
        betGroupModel.setId((int) betGroup.getGroup().getId());
        betGroupModel.setLevel(betGroup.getGroup().getLevel());
        betGroupModel.setName(betGroup.getGroup().getName());
        betGroupModel.setAvailable(betGroup.getGroup().getUserAvailable());
        betGroupModel.setDisplayColumns(betGroup.getGroup().getDisplayColumns());
        betGroupModel.setExpToNextLevel(betGroup.getGroup().getExpToNextLevel());
        betGroupModel.setLevelStartExp(betGroup.getGroup().getLevelStartExp());
        betGroupSectionModel.setGroup(betGroupModel);
        List<MatchVarietyBetOptionModel> bets = betGroup.getBets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets, 10));
        for (MatchVarietyBetOptionModel matchVarietyBetOptionModel : bets) {
            MatchDetailsBetDataModel matchDetailsBetDataModel = new MatchDetailsBetDataModel();
            matchDetailsBetDataModel.setBetName(matchVarietyBetOptionModel.getBetName());
            matchDetailsBetDataModel.setGrabbedBetId(Long.valueOf(matchVarietyBetOptionModel.getGrabbedBetId()));
            matchDetailsBetDataModel.setGrabbedCoeficient(matchVarietyBetOptionModel.getGrabbedCoefficient());
            matchDetailsBetDataModel.setBetTypeId(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()));
            matchDetailsBetDataModel.setIsAvailable(Boolean.valueOf(matchVarietyBetOptionModel.isAvailable()));
            arrayList.add(matchDetailsBetDataModel);
        }
        betGroupSectionModel.setBets(arrayList);
        return betGroupSectionModel;
    }
}
