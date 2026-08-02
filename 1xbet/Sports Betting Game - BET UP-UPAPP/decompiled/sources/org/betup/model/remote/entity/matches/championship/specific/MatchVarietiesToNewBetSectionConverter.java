package org.betup.model.remote.entity.matches.championship.specific;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchVarietiesToNewBetSectionConverter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lorg/betup/model/remote/entity/matches/championship/specific/MatchVarietiesToNewBetSectionConverter;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "convert", "", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetSectionModel;", "varieties", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupModel;", "convertVariety", "variety", "convertBetGroup", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetGroupModel;", "betGroup", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MatchVarietiesToNewBetSectionConverter {
    public static final int $stable = 0;
    public static final MatchVarietiesToNewBetSectionConverter INSTANCE = new MatchVarietiesToNewBetSectionConverter();

    private MatchVarietiesToNewBetSectionConverter() {
    }

    public final List<NewBetSectionModel> convert(List<MatchVarietyGroupModel> varieties) {
        Intrinsics.checkNotNullParameter(varieties, "varieties");
        List<MatchVarietyGroupModel> list = varieties;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertVariety((MatchVarietyGroupModel) it.next()));
        }
        return arrayList;
    }

    private final NewBetSectionModel convertVariety(MatchVarietyGroupModel variety) {
        NewVarietyModel newVarietyModel = new NewVarietyModel(variety.getGroup().getId(), variety.getGroup().getScoreAway(), variety.getGroup().getScoreHome(), variety.getGroup().getBetsGameType());
        List<MatchVarietyGroupBetsModel> bets = variety.getBets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets, 10));
        Iterator<T> it = bets.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertBetGroup((MatchVarietyGroupBetsModel) it.next()));
        }
        return new NewBetSectionModel(newVarietyModel, arrayList);
    }

    private final NewBetGroupModel convertBetGroup(MatchVarietyGroupBetsModel betGroup) {
        NewGroupModel newGroupModel = new NewGroupModel((int) betGroup.getGroup().getId(), betGroup.getGroup().getLevel(), betGroup.getGroup().getName(), betGroup.getGroup().getUserAvailable(), betGroup.getGroup().getDisplayColumns(), betGroup.getGroup().getExpToNextLevel(), betGroup.getGroup().getLevelStartExp());
        List<MatchVarietyBetOptionModel> bets = betGroup.getBets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets, 10));
        for (MatchVarietyBetOptionModel matchVarietyBetOptionModel : bets) {
            arrayList.add(new NewBetModel(matchVarietyBetOptionModel.getGrabbedBetId(), matchVarietyBetOptionModel.getGrabbedCoefficient(), matchVarietyBetOptionModel.getBetTypeId(), matchVarietyBetOptionModel.isAvailable(), matchVarietyBetOptionModel.getBetName()));
        }
        return new NewBetGroupModel(newGroupModel, arrayList);
    }
}
