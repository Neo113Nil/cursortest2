package org.betup.ui.fragment.dailybonus.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.utils.UiExtensionsKt;

/* compiled from: DailyBonusModels.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"hasClaimableRewardToday", "", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;", "nextClaimEpochMs", "", "(Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;)Ljava/lang/Long;", "nextClaimableDayId", "", "(Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;)Ljava/lang/Integer;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DailyBonusModelsKt {
    public static final boolean hasClaimableRewardToday(DailyBonusData dailyBonusData) {
        Intrinsics.checkNotNullParameter(dailyBonusData, "<this>");
        List<DailyBonusDay> bonuses = dailyBonusData.getBonuses();
        if ((bonuses instanceof Collection) && bonuses.isEmpty()) {
            return false;
        }
        Iterator<T> it = bonuses.iterator();
        while (it.hasNext()) {
            if (((DailyBonusDay) it.next()).getState() == DailyBonusState.AVAILABLE) {
                return true;
            }
        }
        return false;
    }

    public static final Long nextClaimEpochMs(DailyBonusData dailyBonusData) {
        Intrinsics.checkNotNullParameter(dailyBonusData, "<this>");
        Instant instantSafe = UiExtensionsKt.toInstantSafe(dailyBonusData.getNextRewardAfter());
        if (instantSafe == null) {
            return null;
        }
        Long valueOf = Long.valueOf(instantSafe.toEpochMilli());
        if (valueOf.longValue() > 0) {
            return valueOf;
        }
        return null;
    }

    public static final Integer nextClaimableDayId(DailyBonusData dailyBonusData) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(dailyBonusData, "<this>");
        Iterator<T> it = dailyBonusData.getBonuses().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DailyBonusDay) obj).getState() == DailyBonusState.AVAILABLE) {
                break;
            }
        }
        DailyBonusDay dailyBonusDay = (DailyBonusDay) obj;
        if (dailyBonusDay != null) {
            return Integer.valueOf(dailyBonusDay.getId());
        }
        List<DailyBonusDay> bonuses = dailyBonusData.getBonuses();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : bonuses) {
            if (((DailyBonusDay) obj2).getState() == DailyBonusState.LOCKED) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int dayNumber = ((DailyBonusDay) next).getDayNumber();
                do {
                    Object next2 = it2.next();
                    int dayNumber2 = ((DailyBonusDay) next2).getDayNumber();
                    if (dayNumber > dayNumber2) {
                        next = next2;
                        dayNumber = dayNumber2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        DailyBonusDay dailyBonusDay2 = (DailyBonusDay) next;
        if (dailyBonusDay2 != null) {
            return Integer.valueOf(dailyBonusDay2.getId());
        }
        return null;
    }
}
