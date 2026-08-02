package org.betup.utils;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchUtils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJM\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lorg/betup/utils/MatchUtils;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "shouldShowLiveTime", "", "matchState", "", "matchDate", "", "currentPeriod", "currentTime", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z", "getDisplayDateTime", "Lkotlin/Pair;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Pair;", "MAIN_SPORT_IDS_FOR_PERIOD_SCORES", "", "getMAIN_SPORT_IDS_FOR_PERIOD_SCORES", "()Ljava/util/Set;", "extractPeriodScoresFromResultRaw", "resultRaw", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchUtils {
    public static final MatchUtils INSTANCE = new MatchUtils();
    private static final Set<Integer> MAIN_SPORT_IDS_FOR_PERIOD_SCORES = SetsKt.setOf((Object[]) new Integer[]{5, 22, 23, 24, 25});
    public static final int $stable = 8;

    private MatchUtils() {
    }

    public static /* synthetic */ boolean shouldShowLiveTime$default(MatchUtils matchUtils, int i, String str, String str2, String str3, Integer num, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            num = null;
        }
        return matchUtils.shouldShowLiveTime(i, str, str2, str3, num);
    }

    public final boolean shouldShowLiveTime(int matchState, String matchDate, String currentPeriod, String currentTime, Integer sportId) {
        String str;
        if (!MatchDisplayState.isLive(matchState, matchDate, sportId)) {
            return false;
        }
        String str2 = currentPeriod;
        return ((str2 == null || str2.length() == 0) && ((str = currentTime) == null || str.length() == 0)) ? false : true;
    }

    public static /* synthetic */ Pair getDisplayDateTime$default(MatchUtils matchUtils, int i, String str, String str2, String str3, Integer num, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            num = null;
        }
        return matchUtils.getDisplayDateTime(i, str, str2, str3, num);
    }

    public final Pair<String, String> getDisplayDateTime(int matchState, String matchDate, String currentPeriod, String currentTime, Integer sportId) {
        if (shouldShowLiveTime(matchState, matchDate, currentPeriod, currentTime, sportId)) {
            return new Pair<>(currentPeriod, currentTime);
        }
        return new Pair<>(matchDate != null ? DateHelper.getDate(matchDate) : null, matchDate != null ? DateHelper.getTime(matchDate) : null);
    }

    public final Set<Integer> getMAIN_SPORT_IDS_FOR_PERIOD_SCORES() {
        return MAIN_SPORT_IDS_FOR_PERIOD_SCORES;
    }

    public final String extractPeriodScoresFromResultRaw(String resultRaw) {
        String str = resultRaw;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '(', 0, false, 6, (Object) null);
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ')', 0, false, 6, (Object) null);
        if (indexOf$default < 0 || indexOf$default2 <= indexOf$default) {
            return null;
        }
        String substring = resultRaw.substring(indexOf$default + 1, indexOf$default2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String obj = StringsKt.trim((CharSequence) substring).toString();
        if (obj.length() > 0) {
            return obj;
        }
        return null;
    }
}
