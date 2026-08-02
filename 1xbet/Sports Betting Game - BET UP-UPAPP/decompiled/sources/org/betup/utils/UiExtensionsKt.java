package org.betup.utils;

import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewChallengeMatchModel;
import org.betup.model.remote.entity.challenges.NewUserBattleMatchModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.NewMatchModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsSportModel;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.statistics.StatisticsUnit;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipUiModel;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchStatsItemValueUnit;
import org.betup.ui.fragment.user.compose.items.NewUserBattleMatch;
import org.betup.ui.views.ComposeUtils;

/* compiled from: UiExtensions.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\u0010\u0010\u0003\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0006\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\f\u001a\u00020\r*\u00020\u0001\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0001\u001a\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\u0001¢\u0006\u0002\u0010\u0011\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0013\u001a\u00020\r*\u00020\u0001\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0001\u001a\u000f\u0010\u0016\u001a\u00020\u0017*\u00020\u0018¢\u0006\u0002\u0010\u0019\u001a\n\u0010\u001a\u001a\u00020\u0006*\u00020\u0018\u001a\n\u0010\u001b\u001a\u00020\u0006*\u00020\u0018\u001a\n\u0010\u001c\u001a\u00020\u0006*\u00020\u0018\u001a\n\u0010\u001d\u001a\u00020\u0006*\u00020\u0018\u001a\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u0006*\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!\u001a\n\u0010\"\u001a\u00020\r*\u00020#\u001a\n\u0010$\u001a\u00020\r*\u00020#\u001a\n\u0010\"\u001a\u00020\r*\u00020%\u001a\n\u0010$\u001a\u00020\r*\u00020%\u001a\n\u0010\"\u001a\u00020\r*\u00020&\u001a\n\u0010$\u001a\u00020\r*\u00020&\u001a\n\u0010\"\u001a\u00020\r*\u00020'\u001a\n\u0010\"\u001a\u00020\r*\u00020(\u001a\n\u0010$\u001a\u00020\r*\u00020(\u001a\n\u0010\"\u001a\u00020\r*\u00020)\u001a\n\u0010$\u001a\u00020\r*\u00020)\u001a\n\u0010\"\u001a\u00020\r*\u00020*\u001a\n\u0010$\u001a\u00020\r*\u00020*\u001a+\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010/\u001a\n\u00100\u001a\u000201*\u00020\u0001\u001a\n\u00102\u001a\u00020\u0001*\u00020\u0001\u001a\n\u00103\u001a\u00020\u0001*\u00020\u0001\u001a\n\u00104\u001a\u00020\u0001*\u00020\u0001\u001a\n\u00105\u001a\u00020\u0001*\u00020\u0001\u001a\f\u00106\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\u0012\u00107\u001a\u00020\u00012\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\n\u00109\u001a\u000201*\u000201\u001a\n\u0010:\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010;\u001a\u00020\u0001*\u00020\u0006\u001a\f\u0010<\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\u000e\u0010=\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u000201\u001a\u0019\u0010>\u001a\u00020?*\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010B\u001a\n\u0010C\u001a\u00020\u0015*\u00020D\u001a\n\u0010\u001b\u001a\u00020\u0006*\u00020E\u001a\n\u0010\u001c\u001a\u00020\u0006*\u00020E\u001a\n\u0010F\u001a\u00020\u0006*\u00020E\u001a\f\u0010G\u001a\u00020E*\u00020EH\u0002¨\u0006H"}, d2 = {"capitalizeFirstCharOnly", "", "toMultiLineIfNeeded", "normalizeMatchTime", "value", "getBackgroundImageResource", "", "toInstantSafe", "Ljava/time/Instant;", "getFormattedDateWithoutYear", "getFormattedDateWithYear", "getFormattedTime", "isToday", "", "getFormattedDateShort", "getFormattedDurationUntil", "extractLeadingNumber", "(Ljava/lang/String;)Ljava/lang/Integer;", "getFormattedLiveTime", "hasMatchTimeReached", "toMatchStatsItemValueUnit", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;", "getTextColor", "Landroidx/compose/ui/graphics/Color;", "Lorg/betup/model/remote/entity/bets/BetState;", "(Lorg/betup/model/remote/entity/bets/BetState;)J", "getTextIdForPrize", "getIcon", "getTitle", "getShortTitle", "getCountFromUserStats", "userStats", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "(Lorg/betup/model/remote/entity/bets/BetState;Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;)Ljava/lang/Integer;", "isStarted", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsPlaceModel;", "isLive", "Lorg/betup/model/remote/entity/matches/NewMatchModel;", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsDataModel;", "Lorg/betup/model/remote/entity/challenges/NewUserBattleMatchModel;", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleMatch;", "isMatchActuallyLive", "matchState", "matchDate", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "(ILjava/lang/String;Ljava/lang/Integer;)Z", "toSafeDouble", "", "formatBetNumbers", "formatHandicapBetNumbers", "formatOverUnderBetNumbers", "formatBetNumbersSmart", "formatBetNumbersSafe", "formatBetNumbersForJava", "text", "formatTwoDecimals", "formatGroupedWithSpace", "formatCompactCount", "trimCompactCountSuffixZeros", "formatRoiPercent", "toBetSlipUiModel", "Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "isCoefficientUp", "(Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;Ljava/lang/Boolean;)Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "convertToUiItem", "Lorg/betup/model/remote/entity/matches/statistics/StatisticsUnit;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", "getStatusText", "toDisplayChallengeState", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UiExtensionsKt {

    /* compiled from: UiExtensions.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BetState.values().length];
            try {
                iArr[BetState.RETURNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetState.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BetState.WON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BetState.LOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BetState.SOLD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BetState.CANCELED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BetState.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StatisticsUnit.values().length];
            try {
                iArr2[StatisticsUnit.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StatisticsUnit.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StatisticsUnit.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StatisticsUnit.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getBackgroundImageResource(int i) {
        return i != 4 ? i != 5 ? (i == 22 || i == 30) ? R.drawable.match_22_bg_new : i != 64 ? i != 65 ? R.drawable.match_22_bg_new : R.drawable.match_65_bg_new : R.drawable.match_64_bg_new : R.drawable.match_5_bg_new : R.drawable.match_4_bg_new;
    }

    public static final boolean isMatchActuallyLive(int i, String str) {
        return isMatchActuallyLive$default(i, str, null, 4, null);
    }

    public static final String capitalizeFirstCharOnly(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(lowerCase.charAt(0));
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        StringBuilder append = sb.append((Object) upperCase);
        String substring = lowerCase.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return append.append(substring).toString();
    }

    public static final String toMultiLineIfNeeded(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) " ", false, 2, (Object) null) ? StringsKt.replace$default(str, " ", "\n", false, 4, (Object) null) : str;
    }

    public static final String normalizeMatchTime(String str) {
        return (str == null || str.length() == 0 || Intrinsics.areEqual(str, "0") || Intrinsics.areEqual(str, "0\"") || Intrinsics.areEqual(str, "0'") || Intrinsics.areEqual(str, AbstractJsonLexerKt.NULL) || Intrinsics.areEqual(str, "null'") || StringsKt.startsWith$default(str, AbstractJsonLexerKt.NULL, false, 2, (Object) null)) ? "" : str;
    }

    public static final Instant toInstantSafe(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Instant.parse(str);
        } catch (DateTimeParseException unused) {
            Iterator it = CollectionsKt.listOf((Object[]) new DateTimeFormatter[]{DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault()), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S", Locale.getDefault()), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.getDefault())}).iterator();
            while (it.hasNext()) {
                try {
                    return ZonedDateTime.parse(str, ((DateTimeFormatter) it.next()).withZone(ZoneId.systemDefault())).toInstant();
                } catch (DateTimeParseException unused2) {
                }
            }
            return null;
        }
    }

    public static final String getFormattedDateWithoutYear(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Instant instantSafe = toInstantSafe(str);
        if (instantSafe != null) {
            LocalDate localDate = instantSafe.atZone(ZoneId.systemDefault()).toLocalDate();
            String str2 = localDate.getDayOfMonth() + " " + localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public static final String getFormattedDateWithYear(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Instant instantSafe = toInstantSafe(str);
        if (instantSafe != null) {
            LocalDate localDate = instantSafe.atZone(ZoneId.systemDefault()).toLocalDate();
            String str2 = localDate.getDayOfMonth() + " " + localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + localDate.getYear();
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public static final String getFormattedTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Instant instantSafe = toInstantSafe(str);
        if (instantSafe != null) {
            String format = DateTimeFormatter.ofPattern("HH:mm").format(instantSafe.atZone(ZoneId.systemDefault()).toLocalTime());
            if (format != null) {
                return format;
            }
        }
        return "";
    }

    public static final boolean isToday(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Instant instantSafe = toInstantSafe(str);
        if (instantSafe != null) {
            return Intrinsics.areEqual(instantSafe.atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now(ZoneId.systemDefault()));
        }
        return false;
    }

    public static final String getFormattedDateShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Instant instantSafe = toInstantSafe(str);
        if (instantSafe != null) {
            LocalDate localDate = instantSafe.atZone(ZoneId.systemDefault()).toLocalDate();
            int dayOfMonth = localDate.getDayOfMonth();
            int monthValue = localDate.getMonthValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02d.%02d", Arrays.copyOf(new Object[]{Integer.valueOf(dayOfMonth), Integer.valueOf(monthValue)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            if (format != null) {
                return format;
            }
        }
        return "";
    }

    public static final String getFormattedDurationUntil(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        long timestamp = DateHelper.getTimestamp(str) - System.currentTimeMillis();
        if (timestamp <= 0) {
            return "0m";
        }
        long j = timestamp / 1000;
        long j2 = 86400;
        long j3 = j / j2;
        long j4 = 3600;
        long j5 = (j % j2) / j4;
        long j6 = (j % j4) / 60;
        StringBuilder sb = new StringBuilder();
        if (j3 > 0) {
            sb.append(j3 + "d");
        }
        if (j5 > 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(j5 + CmcdData.STREAMING_FORMAT_HLS);
        }
        if (j6 > 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(j6 + CmcdData.OBJECT_TYPE_MANIFEST);
        }
        if (sb.length() == 0) {
            sb.append("0m");
        }
        return sb.toString();
    }

    public static final Integer extractLeadingNumber(String str) {
        int parseInt;
        List<String> groupValues;
        Intrinsics.checkNotNullParameter(str, "<this>");
        MatchResult find$default = Regex.find$default(new Regex("^(\\d+\\.?\\d*)"), str, 0, 2, null);
        String str2 = (find$default == null || (groupValues = find$default.getGroupValues()) == null) ? null : groupValues.get(1);
        if (str2 == null) {
            return null;
        }
        try {
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) ".", false, 2, (Object) null)) {
                parseInt = MathKt.roundToInt(Double.parseDouble(str2));
            } else {
                parseInt = Integer.parseInt(str2);
            }
            return Integer.valueOf(parseInt);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final String getFormattedLiveTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        long currentTimeMillis = System.currentTimeMillis() - DateHelper.getTimestamp(str);
        if (currentTimeMillis <= 0) {
            return "00:00:00";
        }
        long j = 1000;
        long j2 = currentTimeMillis / j;
        long j3 = 60;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3), Long.valueOf((currentTimeMillis % j) / 10)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final boolean hasMatchTimeReached(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Instant instantSafe = toInstantSafe(str);
        if (instantSafe == null) {
            return false;
        }
        Instant now = Instant.now();
        return now.isAfter(instantSafe) || Intrinsics.areEqual(now, instantSafe);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final MatchStatsItemValueUnit toMatchStatsItemValueUnit(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -436740454:
                if (str.equals("PERCENTAGE")) {
                    return MatchStatsItemValueUnit.Percentage.INSTANCE;
                }
                break;
            case 72655:
                if (str.equals("INT")) {
                    return MatchStatsItemValueUnit.Int.INSTANCE;
                }
                break;
            case 2402104:
                if (str.equals("NONE")) {
                    return MatchStatsItemValueUnit.None.INSTANCE;
                }
                break;
            case 66988604:
                if (str.equals("FLOAT")) {
                    return MatchStatsItemValueUnit.Float.INSTANCE;
                }
                break;
        }
        return MatchStatsItemValueUnit.None.INSTANCE;
    }

    public static final long getTextColor(BetState betState) {
        Intrinsics.checkNotNullParameter(betState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[betState.ordinal()]) {
            case 1:
                return ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
            case 2:
                return ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            case 3:
                return ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
            case 4:
                return ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
            case 5:
                return ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
            case 6:
                return ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
            default:
                return ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
        }
    }

    public static final int getTextIdForPrize(BetState betState) {
        Intrinsics.checkNotNullParameter(betState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[betState.ordinal()]) {
            case 1:
            case 5:
            case 6:
            default:
                return R.string.bet_return_amount;
            case 2:
                return R.string.bet_pending_amount;
            case 3:
                return R.string.bet_won_amount;
            case 4:
                return R.string.bet_lost_amount;
        }
    }

    public static final int getIcon(BetState betState) {
        Intrinsics.checkNotNullParameter(betState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[betState.ordinal()]) {
            case 1:
            case 5:
            case 6:
                return R.drawable.return_gold;
            case 2:
                return R.drawable.in_play_gold;
            case 3:
                return R.drawable.won_gold;
            case 4:
                return R.drawable.lost_gold;
            case 7:
            default:
                return R.drawable.bets_all;
        }
    }

    public static final int getTitle(BetState betState) {
        Intrinsics.checkNotNullParameter(betState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[betState.ordinal()]) {
            case 1:
                return R.string.drawer_sub_bets_returned;
            case 2:
                return R.string.drawer_sub_bets_in_play;
            case 3:
                return R.string.drawer_sub_bets_won;
            case 4:
                return R.string.drawer_sub_bets_lost;
            case 5:
                return R.string.drawer_sub_bets_sold;
            case 6:
                return R.string.drawer_sub_bets_canceled;
            case 7:
            default:
                return R.string.drawer_sub_bets_all;
        }
    }

    public static final int getShortTitle(BetState betState) {
        Intrinsics.checkNotNullParameter(betState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[betState.ordinal()]) {
            case 1:
                return R.string.bet_state_returned_short;
            case 2:
                return R.string.bet_state_in_play_short;
            case 3:
                return R.string.bet_state_won_short;
            case 4:
                return R.string.bet_state_lost_short;
            case 5:
                return R.string.bet_state_sold_short;
            case 6:
                return R.string.bet_state_canceled_short;
            case 7:
            default:
                return R.string.bet_state_all_short;
        }
    }

    public static final Integer getCountFromUserStats(BetState betState, NewUserBetStatisticsModel newUserBetStatisticsModel) {
        int returned;
        Intrinsics.checkNotNullParameter(betState, "<this>");
        if (newUserBetStatisticsModel == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[betState.ordinal()]) {
            case 1:
                returned = newUserBetStatisticsModel.getReturned();
                break;
            case 2:
                returned = newUserBetStatisticsModel.getPending();
                break;
            case 3:
                returned = newUserBetStatisticsModel.getWon();
                break;
            case 4:
                returned = newUserBetStatisticsModel.getLost();
                break;
            case 5:
                returned = newUserBetStatisticsModel.getSold();
                break;
            case 6:
                returned = newUserBetStatisticsModel.getCanceled();
                break;
            case 7:
                returned = newUserBetStatisticsModel.getAllBets();
                break;
            default:
                returned = newUserBetStatisticsModel.getAllBets();
                break;
        }
        return Integer.valueOf(returned);
    }

    public static final boolean isStarted(BetsPlaceModel betsPlaceModel) {
        Intrinsics.checkNotNullParameter(betsPlaceModel, "<this>");
        MatchDetailsDataModel sportMatch = betsPlaceModel.getSportMatch();
        if (sportMatch == null) {
            return false;
        }
        int val = sportMatch.getState().getVal();
        String date = sportMatch.getDate();
        MatchDetailsSportModel sport = sportMatch.getSport();
        return MatchDisplayState.isMatchStarted(val, date, sport != null ? sport.getId() : null);
    }

    public static final boolean isLive(BetsPlaceModel betsPlaceModel) {
        Intrinsics.checkNotNullParameter(betsPlaceModel, "<this>");
        MatchDetailsDataModel sportMatch = betsPlaceModel.getSportMatch();
        if (sportMatch == null) {
            return false;
        }
        int val = sportMatch.getState().getVal();
        String date = sportMatch.getDate();
        MatchDetailsSportModel sport = sportMatch.getSport();
        return MatchDisplayState.isLive(val, date, sport != null ? sport.getId() : null);
    }

    public static final boolean isStarted(NewMatchModel newMatchModel) {
        Intrinsics.checkNotNullParameter(newMatchModel, "<this>");
        return MatchDisplayState.isMatchStarted(newMatchModel.getMatchState(), newMatchModel.getDate(), Integer.valueOf((int) newMatchModel.getSport().getId()));
    }

    public static final boolean isLive(NewMatchModel newMatchModel) {
        Intrinsics.checkNotNullParameter(newMatchModel, "<this>");
        return MatchDisplayState.isLive(newMatchModel.getMatchState(), newMatchModel.getDate(), Integer.valueOf((int) newMatchModel.getSport().getId()));
    }

    public static final boolean isStarted(MatchDetailsDataModel matchDetailsDataModel) {
        Intrinsics.checkNotNullParameter(matchDetailsDataModel, "<this>");
        int val = matchDetailsDataModel.getState().getVal();
        String date = matchDetailsDataModel.getDate();
        MatchDetailsSportModel sport = matchDetailsDataModel.getSport();
        return MatchDisplayState.isMatchStarted(val, date, sport != null ? sport.getId() : null);
    }

    public static final boolean isLive(MatchDetailsDataModel matchDetailsDataModel) {
        Intrinsics.checkNotNullParameter(matchDetailsDataModel, "<this>");
        int val = matchDetailsDataModel.getState().getVal();
        String date = matchDetailsDataModel.getDate();
        MatchDetailsSportModel sport = matchDetailsDataModel.getSport();
        return MatchDisplayState.isLive(val, date, sport != null ? sport.getId() : null);
    }

    public static final boolean isStarted(NewUserBattleMatchModel newUserBattleMatchModel) {
        Intrinsics.checkNotNullParameter(newUserBattleMatchModel, "<this>");
        Integer matchState = newUserBattleMatchModel.getMatchState();
        return MatchDisplayState.isMatchStarted(matchState != null ? matchState.intValue() : 0, newUserBattleMatchModel.getDate(), null);
    }

    public static final boolean isStarted(MatchShortInfoModel matchShortInfoModel) {
        Intrinsics.checkNotNullParameter(matchShortInfoModel, "<this>");
        return MatchDisplayState.isMatchStarted(matchShortInfoModel.getMatchState(), matchShortInfoModel.getDate(), Integer.valueOf(matchShortInfoModel.getSport().getId()));
    }

    public static final boolean isLive(MatchShortInfoModel matchShortInfoModel) {
        Intrinsics.checkNotNullParameter(matchShortInfoModel, "<this>");
        return MatchDisplayState.isLive(matchShortInfoModel.getMatchState(), matchShortInfoModel.getDate(), Integer.valueOf(matchShortInfoModel.getSport().getId()));
    }

    public static final boolean isStarted(NewChallengeMatchModel newChallengeMatchModel) {
        Intrinsics.checkNotNullParameter(newChallengeMatchModel, "<this>");
        Integer matchState = newChallengeMatchModel.getMatchState();
        return MatchDisplayState.isMatchStarted(matchState != null ? matchState.intValue() : 0, newChallengeMatchModel.getDate(), null);
    }

    public static final boolean isLive(NewChallengeMatchModel newChallengeMatchModel) {
        Intrinsics.checkNotNullParameter(newChallengeMatchModel, "<this>");
        Integer matchState = newChallengeMatchModel.getMatchState();
        return MatchDisplayState.isLive(matchState != null ? matchState.intValue() : 0, newChallengeMatchModel.getDate(), null);
    }

    public static final boolean isStarted(NewUserBattleMatch newUserBattleMatch) {
        Intrinsics.checkNotNullParameter(newUserBattleMatch, "<this>");
        return MatchDisplayState.isMatchStarted(newUserBattleMatch.getMatchState(), newUserBattleMatch.getDate(), null);
    }

    public static final boolean isLive(NewUserBattleMatch newUserBattleMatch) {
        Intrinsics.checkNotNullParameter(newUserBattleMatch, "<this>");
        return MatchDisplayState.isLive(newUserBattleMatch.getMatchState(), newUserBattleMatch.getDate(), null);
    }

    public static /* synthetic */ boolean isMatchActuallyLive$default(int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return isMatchActuallyLive(i, str, num);
    }

    public static final boolean isMatchActuallyLive(int i, String str, Integer num) {
        return MatchDisplayState.isLive(i, str, num);
    }

    public static final double toSafeDouble(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Double.parseDouble(StringsKt.replace$default(str, ",", ".", false, 4, (Object) null));
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public static final String formatBetNumbers(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str;
        return str2.length() == 0 ? str : new Regex("([-+]?\\d+\\.\\d+)").replace(str2, new Function1() { // from class: org.betup.utils.UiExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence formatBetNumbers$lambda$8;
                formatBetNumbers$lambda$8 = UiExtensionsKt.formatBetNumbers$lambda$8((MatchResult) obj);
                return formatBetNumbers$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatBetNumbers$lambda$8(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        String value = matchResult.getValue();
        Double doubleOrNull = StringsKt.toDoubleOrNull(value);
        if (doubleOrNull != null) {
            double round = Math.round(doubleOrNull.doubleValue() * 10000.0d) / 10000.0d;
            double d = (int) round;
            if (Math.abs(round - d) < 1.0E-4d) {
                if (doubleOrNull.doubleValue() >= 0.0d && StringsKt.startsWith$default(value, "+", false, 2, (Object) null)) {
                    value = "+" + ((int) d);
                } else {
                    value = String.valueOf((int) d);
                }
            }
            return value;
        }
        return matchResult.getValue();
    }

    public static final String formatHandicapBetNumbers(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str;
        return str2.length() == 0 ? str : new Regex("(Handicap\\s*\\d?\\s*)\\(([-+]?\\d+)\\.0\\)", RegexOption.IGNORE_CASE).replace(str2, new Function1() { // from class: org.betup.utils.UiExtensionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence formatHandicapBetNumbers$lambda$9;
                formatHandicapBetNumbers$lambda$9 = UiExtensionsKt.formatHandicapBetNumbers$lambda$9((MatchResult) obj);
                return formatHandicapBetNumbers$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatHandicapBetNumbers$lambda$9(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        return matchResult.getGroupValues().get(1) + "(" + matchResult.getGroupValues().get(2) + ")";
    }

    public static final String formatOverUnderBetNumbers(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str;
        return str2.length() == 0 ? str : new Regex("((?:Over|Under)\\s*)\\(([-+]?\\d+)\\.0\\)", RegexOption.IGNORE_CASE).replace(str2, new Function1() { // from class: org.betup.utils.UiExtensionsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence formatOverUnderBetNumbers$lambda$10;
                formatOverUnderBetNumbers$lambda$10 = UiExtensionsKt.formatOverUnderBetNumbers$lambda$10((MatchResult) obj);
                return formatOverUnderBetNumbers$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatOverUnderBetNumbers$lambda$10(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        return matchResult.getGroupValues().get(1) + "(" + matchResult.getGroupValues().get(2) + ")";
    }

    public static final String formatBetNumbersSmart(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str;
        if (str2.length() == 0) {
            return str;
        }
        if (StringsKt.contains((CharSequence) str2, (CharSequence) "Handicap", true) || StringsKt.contains((CharSequence) str2, (CharSequence) "Handiсap", true)) {
            return formatBetNumbers(str);
        }
        if (StringsKt.contains((CharSequence) str2, (CharSequence) "Over", true) || StringsKt.contains((CharSequence) str2, (CharSequence) "Under", true)) {
            return formatBetNumbers(str);
        }
        return formatBetNumbers(str);
    }

    public static final String formatBetNumbersSafe(String str) {
        String formatBetNumbers;
        return (str == null || (formatBetNumbers = formatBetNumbers(str)) == null) ? "" : formatBetNumbers;
    }

    public static final String formatBetNumbersForJava(String str) {
        String formatBetNumbers;
        return (str == null || (formatBetNumbers = formatBetNumbers(str)) == null) ? "" : formatBetNumbers;
    }

    public static final double formatTwoDecimals(double d) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return toSafeDouble(format);
    }

    public static final String formatGroupedWithSpace(int i) {
        String valueOf = String.valueOf(i);
        return valueOf.length() <= 3 ? valueOf : StringsKt.reversed((CharSequence) CollectionsKt.joinToString$default(StringsKt.chunked(StringsKt.reversed((CharSequence) valueOf).toString(), 3), " ", null, null, 0, null, null, 62, null)).toString();
    }

    public static final String formatCompactCount(int i) {
        if (i >= 1000000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%.1fM", Arrays.copyOf(new Object[]{Float.valueOf(i / 1000000.0f)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return trimCompactCountSuffixZeros(format);
        }
        if (i >= 1000) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.US, "%.1fk", Arrays.copyOf(new Object[]{Float.valueOf(i / 1000.0f)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return trimCompactCountSuffixZeros(format2);
        }
        return String.valueOf(i);
    }

    private static final String trimCompactCountSuffixZeros(String str) {
        return new Regex("\\.0([kM])$").replace(str, "$1");
    }

    public static final String formatRoiPercent(double d) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(0);
        numberInstance.setMaximumFractionDigits(2);
        String format = numberInstance.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final BetSlipUiModel toBetSlipUiModel(BetModel betModel, Boolean bool) {
        String str;
        Intrinsics.checkNotNullParameter(betModel, "<this>");
        long intValue = betModel.getMatch().getId().intValue();
        long grabbedBetId = betModel.getGrabbedBetId();
        boolean isAvailable = betModel.isAvailable();
        MatchDetailsBetGroupModel betGroup = betModel.getBet().getBetGroup();
        boolean isAvailable2 = betGroup != null ? betGroup.isAvailable() : true;
        boolean isDeleted = betModel.isDeleted();
        String date = betModel.getMatch().getDate();
        Intrinsics.checkNotNullExpressionValue(date, "getDate(...)");
        String name = betModel.getMatch().getHomeTeam().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String name2 = betModel.getMatch().getAwayTeam().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        String betName = betModel.getBet().getBetName();
        Intrinsics.checkNotNullExpressionValue(betName, "getBetName(...)");
        MatchDetailsBetGroupModel betGroup2 = betModel.getBet().getBetGroup();
        if (betGroup2 == null || (str = betGroup2.getName()) == null) {
            str = "";
        }
        String str2 = str;
        double grabbedCoeficient = betModel.getBet().getGrabbedCoeficient();
        MatchState state = betModel.getMatch().getState();
        Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
        return new BetSlipUiModel(Long.valueOf(grabbedBetId), Long.valueOf(intValue), isAvailable, isAvailable2, isDeleted, date, name, name2, betName, grabbedCoeficient, state, null, str2, bool, null, null, null, null, 247808, null);
    }

    public static final MatchStatsItemValueUnit convertToUiItem(StatisticsUnit statisticsUnit) {
        Intrinsics.checkNotNullParameter(statisticsUnit, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[statisticsUnit.ordinal()];
        if (i == 1) {
            return MatchStatsItemValueUnit.Int.INSTANCE;
        }
        if (i == 2) {
            return MatchStatsItemValueUnit.Float.INSTANCE;
        }
        if (i == 3) {
            return MatchStatsItemValueUnit.Percentage.INSTANCE;
        }
        if (i == 4) {
            return MatchStatsItemValueUnit.None.INSTANCE;
        }
        return MatchStatsItemValueUnit.None.INSTANCE;
    }

    public static final int getIcon(ChallengeState challengeState) {
        Intrinsics.checkNotNullParameter(challengeState, "<this>");
        ChallengeState displayChallengeState = toDisplayChallengeState(challengeState);
        if (Intrinsics.areEqual(displayChallengeState, ChallengeState.WON.INSTANCE)) {
            return R.drawable.won_gold;
        }
        if (!Intrinsics.areEqual(displayChallengeState, ChallengeState.ACCEPTED.INSTANCE) && !Intrinsics.areEqual(displayChallengeState, ChallengeState.STARTED.INSTANCE) && !Intrinsics.areEqual(displayChallengeState, ChallengeState.FINISHED.INSTANCE)) {
            if (!Intrinsics.areEqual(displayChallengeState, ChallengeState.RETURN.INSTANCE) && !Intrinsics.areEqual(displayChallengeState, ChallengeState.CANCELED.INSTANCE)) {
                if (Intrinsics.areEqual(displayChallengeState, ChallengeState.LOST.INSTANCE)) {
                    return R.drawable.lost_gold;
                }
                if (!Intrinsics.areEqual(displayChallengeState, ChallengeState.DRAW.INSTANCE)) {
                    if (!Intrinsics.areEqual(displayChallengeState, ChallengeState.PENDING.INSTANCE)) {
                        return R.drawable.battles_icon_new_selected;
                    }
                }
            }
            return R.drawable.return_gold;
        }
        return R.drawable.in_play_gold;
    }

    public static final int getTitle(ChallengeState challengeState) {
        Intrinsics.checkNotNullParameter(challengeState, "<this>");
        ChallengeState displayChallengeState = toDisplayChallengeState(challengeState);
        return Intrinsics.areEqual(displayChallengeState, ChallengeState.WON.INSTANCE) ? R.string.won : Intrinsics.areEqual(displayChallengeState, ChallengeState.ACCEPTED.INSTANCE) ? R.string.accepted : Intrinsics.areEqual(displayChallengeState, ChallengeState.STARTED.INSTANCE) ? R.string.started : Intrinsics.areEqual(displayChallengeState, ChallengeState.FINISHED.INSTANCE) ? R.string.finished : Intrinsics.areEqual(displayChallengeState, ChallengeState.RETURN.INSTANCE) ? R.string.returned : Intrinsics.areEqual(displayChallengeState, ChallengeState.CANCELED.INSTANCE) ? R.string.canceled_label : Intrinsics.areEqual(displayChallengeState, ChallengeState.LOST.INSTANCE) ? R.string.lost : Intrinsics.areEqual(displayChallengeState, ChallengeState.DRAW.INSTANCE) ? R.string.draw : Intrinsics.areEqual(displayChallengeState, ChallengeState.PENDING.INSTANCE) ? R.string.pending : R.string.all;
    }

    public static final int getStatusText(ChallengeState challengeState) {
        Intrinsics.checkNotNullParameter(challengeState, "<this>");
        ChallengeState displayChallengeState = toDisplayChallengeState(challengeState);
        return Intrinsics.areEqual(displayChallengeState, ChallengeState.WON.INSTANCE) ? R.string.won : Intrinsics.areEqual(displayChallengeState, ChallengeState.ACCEPTED.INSTANCE) ? R.string.accepted : Intrinsics.areEqual(displayChallengeState, ChallengeState.STARTED.INSTANCE) ? R.string.started : Intrinsics.areEqual(displayChallengeState, ChallengeState.FINISHED.INSTANCE) ? R.string.finished : Intrinsics.areEqual(displayChallengeState, ChallengeState.RETURN.INSTANCE) ? R.string.returned : Intrinsics.areEqual(displayChallengeState, ChallengeState.CANCELED.INSTANCE) ? R.string.canceled_label : Intrinsics.areEqual(displayChallengeState, ChallengeState.LOST.INSTANCE) ? R.string.lost : Intrinsics.areEqual(displayChallengeState, ChallengeState.DRAW.INSTANCE) ? R.string.draw : Intrinsics.areEqual(displayChallengeState, ChallengeState.PENDING.INSTANCE) ? R.string.pending : R.string.all;
    }

    private static final ChallengeState toDisplayChallengeState(ChallengeState challengeState) {
        return ChallengeEffectiveStateResolver.INSTANCE.toDisplayState(challengeState);
    }
}
