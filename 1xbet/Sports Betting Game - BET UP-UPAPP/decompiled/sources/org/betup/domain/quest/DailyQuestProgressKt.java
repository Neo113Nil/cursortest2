package org.betup.domain.quest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: DailyQuestProgress.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0003\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0001\u001a\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u000f\u001a\u0010\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DEFAULT_DAILY_QUEST_TASK_TARGET", "", "effectiveProgressTarget", "Lorg/betup/domain/quest/DailyQuestTask;", "contributedProgress", "percentComplete", "countsTowardAggregate", "", "isCompletedForAggregate", "distributeQuestRewardPerTask", "", "", "totalRewardBetcoins", "taskCount", "perTaskDisplayRewards", "Lorg/betup/domain/quest/DailyQuest;", "aggregateProgress", "Lorg/betup/domain/quest/DailyQuestAggregateProgress;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DailyQuestProgressKt {
    public static final int DEFAULT_DAILY_QUEST_TASK_TARGET = 100;

    public static final int effectiveProgressTarget(DailyQuestTask dailyQuestTask) {
        Intrinsics.checkNotNullParameter(dailyQuestTask, "<this>");
        Integer valueOf = Integer.valueOf(dailyQuestTask.getProgressTarget());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 100;
    }

    public static final int contributedProgress(DailyQuestTask dailyQuestTask) {
        Intrinsics.checkNotNullParameter(dailyQuestTask, "<this>");
        return RangesKt.coerceIn(dailyQuestTask.getProgressCurrent(), 0, effectiveProgressTarget(dailyQuestTask));
    }

    public static final int percentComplete(DailyQuestTask dailyQuestTask) {
        Intrinsics.checkNotNullParameter(dailyQuestTask, "<this>");
        int effectiveProgressTarget = effectiveProgressTarget(dailyQuestTask);
        if (effectiveProgressTarget <= 0) {
            return 0;
        }
        return RangesKt.coerceIn((contributedProgress(dailyQuestTask) * 100) / effectiveProgressTarget, 0, 100);
    }

    public static final boolean countsTowardAggregate(DailyQuestTask dailyQuestTask) {
        Intrinsics.checkNotNullParameter(dailyQuestTask, "<this>");
        return (dailyQuestTask.getStatus() == DailyQuestTaskStatus.EXPIRED || dailyQuestTask.getStatus() == DailyQuestTaskStatus.CANCELLED) ? false : true;
    }

    public static final boolean isCompletedForAggregate(DailyQuestTask dailyQuestTask) {
        Intrinsics.checkNotNullParameter(dailyQuestTask, "<this>");
        return dailyQuestTask.isCompleted();
    }

    public static final List<Long> distributeQuestRewardPerTask(long j, int i) {
        if (i <= 0) {
            return CollectionsKt.emptyList();
        }
        int i2 = 0;
        if (j <= 0) {
            ArrayList arrayList = new ArrayList(i);
            while (i2 < i) {
                arrayList.add(0L);
                i2++;
            }
            return arrayList;
        }
        long j2 = i;
        long j3 = j / j2;
        int i3 = (int) (j % j2);
        ArrayList arrayList2 = new ArrayList(i);
        while (i2 < i) {
            arrayList2.add(Long.valueOf((i2 < i3 ? 1L : 0L) + j3));
            i2++;
        }
        return arrayList2;
    }

    public static final List<Long> perTaskDisplayRewards(DailyQuest dailyQuest) {
        Intrinsics.checkNotNullParameter(dailyQuest, "<this>");
        if (dailyQuest.getTasks().isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<DailyQuestTask> tasks = dailyQuest.getTasks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tasks, 10));
        Iterator<T> it = tasks.iterator();
        while (it.hasNext()) {
            arrayList.add(((DailyQuestTask) it.next()).getRewardBetcoins());
        }
        ArrayList<Long> arrayList2 = arrayList;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Long) it2.next()) == null) {
                    return distributeQuestRewardPerTask(dailyQuest.getRewardBetcoins(), dailyQuest.getTasks().size());
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (Long l : arrayList2) {
            arrayList3.add(Long.valueOf(l != null ? l.longValue() : 0L));
        }
        return arrayList3;
    }

    public static final DailyQuestAggregateProgress aggregateProgress(List<DailyQuestTask> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (countsTowardAggregate((DailyQuestTask) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        int i = 0;
        if (arrayList2.isEmpty()) {
            return new DailyQuestAggregateProgress(0, 1, 0.0f);
        }
        ArrayList arrayList3 = arrayList2;
        if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                if (isCompletedForAggregate((DailyQuestTask) it.next()) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        int size = arrayList2.size();
        return new DailyQuestAggregateProgress(i, size, RangesKt.coerceIn(i / size, 0.0f, 1.0f));
    }
}
