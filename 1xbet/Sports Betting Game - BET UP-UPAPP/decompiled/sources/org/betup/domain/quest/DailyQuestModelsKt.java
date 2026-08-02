package org.betup.domain.quest;

import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DailyQuestModels.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DAILY_BONUS_QUEST_NAVIGATION_TARGETS", "", "", "isClaimDailyBonusTask", "", "Lorg/betup/domain/quest/DailyQuestTask;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DailyQuestModelsKt {
    private static final Set<String> DAILY_BONUS_QUEST_NAVIGATION_TARGETS = SetsKt.setOf((Object[]) new String[]{"DAILY_BONUS", "CLAIM_DAILY_BONUS"});

    public static final boolean isClaimDailyBonusTask(DailyQuestTask dailyQuestTask) {
        String str;
        String obj;
        Intrinsics.checkNotNullParameter(dailyQuestTask, "<this>");
        if (StringsKt.equals(dailyQuestTask.getTaskType(), "CLAIM_DAILY_BONUS", true)) {
            return true;
        }
        Set<String> set = DAILY_BONUS_QUEST_NAVIGATION_TARGETS;
        String navigationTarget = dailyQuestTask.getNavigationTarget();
        if (navigationTarget == null || (obj = StringsKt.trim((CharSequence) navigationTarget).toString()) == null) {
            str = null;
        } else {
            str = obj.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
        }
        return CollectionsKt.contains(set, str);
    }
}
