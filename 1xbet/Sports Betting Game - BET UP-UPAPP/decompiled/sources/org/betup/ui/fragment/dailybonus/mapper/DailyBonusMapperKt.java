package org.betup.ui.fragment.dailybonus.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.model.remote.entity.bonus.V7DailyBonusItem;
import org.betup.model.remote.entity.bonus.V7DailyBonusResponse;
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.dailybonus.model.DailyBonusDay;
import org.betup.ui.fragment.dailybonus.model.DailyBonusState;

/* compiled from: DailyBonusMapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toDailyBonusData", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;", "Lorg/betup/model/remote/entity/bonus/V7DailyBonusResponse;", "toDailyBonusDay", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusDay;", "Lorg/betup/model/remote/entity/bonus/V7DailyBonusItem;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DailyBonusMapperKt {
    public static final DailyBonusData toDailyBonusData(V7DailyBonusResponse v7DailyBonusResponse) {
        Intrinsics.checkNotNullParameter(v7DailyBonusResponse, "<this>");
        List<V7DailyBonusItem> bonuses = v7DailyBonusResponse.getBonuses();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bonuses, 10));
        Iterator<T> it = bonuses.iterator();
        while (it.hasNext()) {
            arrayList.add(toDailyBonusDay((V7DailyBonusItem) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        String nextRewardBefore = v7DailyBonusResponse.getNextRewardBefore();
        String str = nextRewardBefore == null ? "" : nextRewardBefore;
        String nextRewardAfter = v7DailyBonusResponse.getNextRewardAfter();
        String str2 = nextRewardAfter == null ? "" : nextRewardAfter;
        int coerceAtLeast = RangesKt.coerceAtLeast((int) v7DailyBonusResponse.getMultiplier(), 1);
        String multiplierExpires = v7DailyBonusResponse.getMultiplierExpires();
        return new DailyBonusData(arrayList2, str, str2, coerceAtLeast, multiplierExpires == null ? "" : multiplierExpires);
    }

    public static final DailyBonusDay toDailyBonusDay(V7DailyBonusItem v7DailyBonusItem) {
        DailyBonusState dailyBonusState;
        Intrinsics.checkNotNullParameter(v7DailyBonusItem, "<this>");
        int id = (int) v7DailyBonusItem.getId();
        int dayNumber = v7DailyBonusItem.getDayNumber();
        int betcoinBonus = v7DailyBonusItem.getBetcoinBonus();
        int ticketBonus = v7DailyBonusItem.getTicketBonus();
        String photoUrl = v7DailyBonusItem.getPhotoUrl();
        if (photoUrl == null) {
            photoUrl = "";
        }
        String str = photoUrl;
        String upperCase = v7DailyBonusItem.getState().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (Intrinsics.areEqual(upperCase, "AVAILABLE")) {
            dailyBonusState = DailyBonusState.AVAILABLE;
        } else {
            dailyBonusState = Intrinsics.areEqual(upperCase, "TAKEN") ? DailyBonusState.TAKEN : DailyBonusState.LOCKED;
        }
        return new DailyBonusDay(id, dayNumber, betcoinBonus, ticketBonus, str, dailyBonusState);
    }
}
