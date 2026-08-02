package org.betup.ui.fragment.competitions.compose.items;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.betup.model.remote.entity.competitions.NewCompetitionModel;
import org.betup.model.remote.entity.competitions.NewCompetitionSportModel;

/* compiled from: NewCompetitionUiItem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"toUiItem", "Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionUiItem;", "Lorg/betup/model/remote/entity/competitions/NewCompetitionModel;", "Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionSportUiItem;", "Lorg/betup/model/remote/entity/competitions/NewCompetitionSportModel;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NewCompetitionUiItemKt {
    public static final NewCompetitionUiItem toUiItem(NewCompetitionModel newCompetitionModel) {
        Intrinsics.checkNotNullParameter(newCompetitionModel, "<this>");
        long id = newCompetitionModel.getId();
        String str = newCompetitionModel.getId() + "_" + System.currentTimeMillis() + "_" + RangesKt.random(new IntRange(0, 9999), Random.INSTANCE);
        String name = newCompetitionModel.getName();
        NewCompetitionSportModel sport = newCompetitionModel.getSport();
        return new NewCompetitionUiItem(id, str, name, sport != null ? toUiItem(sport) : null, newCompetitionModel.getEnterFee(), newCompetitionModel.getPrizePool(), newCompetitionModel.getJackPot(), newCompetitionModel.isParticipant(), newCompetitionModel.getCloseDate(), newCompetitionModel.getDate(), newCompetitionModel.getBackgroundUrl());
    }

    public static final NewCompetitionSportUiItem toUiItem(NewCompetitionSportModel newCompetitionSportModel) {
        Intrinsics.checkNotNullParameter(newCompetitionSportModel, "<this>");
        return new NewCompetitionSportUiItem(newCompetitionSportModel.getId(), newCompetitionSportModel.getPhotoUrl(), newCompetitionSportModel.getName(), newCompetitionSportModel.getPeriod(), newCompetitionSportModel.getPhotoBackground(), newCompetitionSportModel.getBackgroundUrl());
    }
}
