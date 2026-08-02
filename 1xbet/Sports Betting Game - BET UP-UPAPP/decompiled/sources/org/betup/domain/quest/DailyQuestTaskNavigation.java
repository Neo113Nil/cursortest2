package org.betup.domain.quest;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.bus.NavigateMessage;
import org.betup.domain.quest.DailyQuestDestination;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyQuestTaskNavigation.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Lorg/betup/domain/quest/DailyQuestTaskNavigation;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "resolveDestination", "Lorg/betup/domain/quest/DailyQuestDestination;", "task", "Lorg/betup/domain/quest/DailyQuestTask;", "resolveNavigationTargetOverride", "raw", "", "resolveFromTaskType", "taskType", "parseNavigateTarget", "Lorg/betup/bus/NavigateMessage$Target;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DailyQuestTaskNavigation {
    public static final int $stable = 0;
    public static final DailyQuestTaskNavigation INSTANCE = new DailyQuestTaskNavigation();

    private DailyQuestTaskNavigation() {
    }

    public final DailyQuestDestination resolveDestination(DailyQuestTask task) {
        String obj;
        DailyQuestDestination resolveNavigationTargetOverride;
        Intrinsics.checkNotNullParameter(task, "task");
        String navigationTarget = task.getNavigationTarget();
        if (navigationTarget != null && (obj = StringsKt.trim((CharSequence) navigationTarget).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null && (resolveNavigationTargetOverride = INSTANCE.resolveNavigationTargetOverride(obj)) != null) {
                return resolveNavigationTargetOverride;
            }
        }
        return resolveFromTaskType(task.getTaskType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r0.equals("CLAIM_VIDEO_REWARD") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r0.equals("DAILY_BONUS") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return org.betup.domain.quest.DailyQuestDestination.ShowDailyBonus.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r0.equals("CLAIM_DAILY_BONUS") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r0.equals("VIDEO_REWARD") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        return org.betup.domain.quest.DailyQuestDestination.TriggerVideoReward.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r0.equals("WATCH_REWARDED_AD") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final DailyQuestDestination resolveNavigationTargetOverride(String raw) {
        String upperCase = StringsKt.trim((CharSequence) raw).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1598220650:
                break;
            case -1146072519:
                break;
            case -516727082:
                break;
            case -289101212:
                break;
            case 614963091:
                break;
            default:
                NavigateMessage.Target parseNavigateTarget = parseNavigateTarget(raw);
                return parseNavigateTarget != null ? new DailyQuestDestination.Navigate(parseNavigateTarget) : null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return new org.betup.domain.quest.DailyQuestDestination.Navigate(org.betup.bus.NavigateMessage.Target.TOP_MATCHES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r2.equals("ANSWER_FLASHBET_QUESTION_CORRECTLY") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r2.equals("PLAY_TVBET_ROUND") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return new org.betup.domain.quest.DailyQuestDestination.Navigate(org.betup.bus.NavigateMessage.Target.TVBET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r2.equals("PLAY_DISTINCT_MINIGAMES") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return new org.betup.domain.quest.DailyQuestDestination.Navigate(org.betup.bus.NavigateMessage.Target.MINI_GAMES_HOME_ACTIVITY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r2.equals("JOIN_BATTLE") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return new org.betup.domain.quest.DailyQuestDestination.Navigate(org.betup.bus.NavigateMessage.Target.BATTLES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r2.equals("PLAY_MINIGAME") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r2.equals("WIN_MINIGAME") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r2.equals("PLACE_BET_AMOUNT") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r2.equals("COMPLETE_PERFECT_FLASHBET") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r2.equals("ENTER_COMPETITION") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return new org.betup.domain.quest.DailyQuestDestination.Navigate(org.betup.bus.NavigateMessage.Target.DAILY_COMPETITIONS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r2.equals("EARN_WINNINGS") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        if (r2.equals("COMPLETE_COMPETITION_BETS") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r2.equals("VIEW_RANKING") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return new org.betup.domain.quest.DailyQuestDestination.Navigate(org.betup.bus.NavigateMessage.Target.RANKINGS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r2.equals("HIT_COMPETITION_BETS") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        if (r2.equals("IMPROVE_RANK") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r2.equals("COMPLETE_FLASHBET") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        if (r2.equals("REACH_COMPETITION_PAYOUT_TIER") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r2.equals("PLACE_BET") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if (r2.equals("WIN_BATTLE") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        if (r2.equals("OPEN_SHOP") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return new org.betup.domain.quest.DailyQuestDestination.Navigate(org.betup.bus.NavigateMessage.Target.SHOP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0103, code lost:
    
        if (r2.equals("WATCH_REWARDED_AD") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return org.betup.domain.quest.DailyQuestDestination.TriggerVideoReward.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010d, code lost:
    
        if (r2.equals("CLAIM_VIDEO_REWARD") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011d, code lost:
    
        if (r2.equals("START_FLASHBET") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0132, code lost:
    
        if (r2.equals("STAKE_TVBET_AMOUNT") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        return new org.betup.domain.quest.DailyQuestDestination.Navigate(org.betup.bus.NavigateMessage.Target.FLASH_BET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013c, code lost:
    
        if (r2.equals("WIN_COMPETITION_JACKPOT") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0151, code lost:
    
        if (r2.equals("CREATE_BATTLE") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0180, code lost:
    
        if (r2.equals("WIN_TVBET_ROUND") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0193, code lost:
    
        if (r2.equals("OPEN_TOP_MATCHES") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a6, code lost:
    
        if (r2.equals("COMPLETE_PURCHASE") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r2.equals("WIN_BET") == false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final DailyQuestDestination resolveFromTaskType(String taskType) {
        String upperCase = StringsKt.trim((CharSequence) taskType).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -2057808569:
                break;
            case -1799005804:
                break;
            case -1610293285:
                break;
            case -1598220650:
                if (upperCase.equals("CLAIM_DAILY_BONUS")) {
                    return DailyQuestDestination.ShowDailyBonus.INSTANCE;
                }
                return DailyQuestDestination.None.INSTANCE;
            case -1132650631:
                if (upperCase.equals("START_SESSION")) {
                    return DailyQuestDestination.None.INSTANCE;
                }
                return DailyQuestDestination.None.INSTANCE;
            case -949200549:
                break;
            case -921241005:
                break;
            case -689913683:
                break;
            case -531937794:
                break;
            case -516727082:
                break;
            case -289101212:
                break;
            case 67488715:
                break;
            case 148899483:
                break;
            case 285099289:
                break;
            case 350532431:
                break;
            case 507835571:
                break;
            case 815008750:
                break;
            case 932822140:
                break;
            case 1085409000:
                break;
            case 1327977578:
                break;
            case 1424899736:
                break;
            case 1484517625:
                break;
            case 1611972158:
                break;
            case 1677537772:
                break;
            case 1884251508:
                break;
            case 1890593133:
                break;
            case 1904228882:
                break;
            case 1910480723:
                break;
            case 1972796315:
                break;
            case 2068267374:
                break;
            case 2119407335:
                break;
            default:
                return DailyQuestDestination.None.INSTANCE;
        }
    }

    private final NavigateMessage.Target parseNavigateTarget(String raw) {
        Object m10853constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DailyQuestTaskNavigation dailyQuestTaskNavigation = this;
            String upperCase = StringsKt.trim((CharSequence) raw).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            m10853constructorimpl = Result.m10853constructorimpl(NavigateMessage.Target.valueOf(upperCase));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = null;
        }
        return (NavigateMessage.Target) m10853constructorimpl;
    }
}
