package org.betup.ui.fragment.home.compose;

import com.vk.sdk.api.model.VKAttachments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetGroupModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetSectionModel;
import org.betup.model.remote.entity.matches.championship.specific.NewGroupModel;
import org.betup.model.remote.entity.matches.championship.specific.NewListedMatchModel;
import org.betup.model.remote.entity.matches.championship.specific.NewMatchDetailsDataModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.model.remote.entity.user.UserRankInfoModel;
import org.betup.model.remote.entity.user.details.UserBetStatsModel;
import org.betup.ui.fragment.home.compose.HomeLiveMatchesUiState;
import org.betup.ui.fragment.home.compose.HomeMoreMatchesUiState;
import org.betup.ui.fragment.home.compose.HomePromoUiState;
import org.betup.ui.fragment.home.compose.HomeStatsUiState;
import org.betup.ui.fragment.home.controller.HomeDailyQuestUiState;
import org.betup.ui.fragment.home.controller.HomeMatchesPaginationController;
import org.betup.ui.fragment.home.controller.HomeVideoBonusUiState;
import org.betup.utils.BetHelper;
import org.betup.utils.DateHelper;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeScreenController.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001OB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008a\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001dJD\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u001a\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\tJ&\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ'\u0010%\u001a\u0004\u0018\u00010\u001d2\u0016\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0'\"\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010(J)\u0010)\u001a\u0004\u0018\u00010\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0000¢\u0006\u0004\b-\u0010.J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u001dJ\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0018J\u000e\u00104\u001a\u0002052\u0006\u00103\u001a\u00020\u0018J$\u00106\u001a\b\u0012\u0004\u0012\u000208072\f\u00109\u001a\b\u0012\u0004\u0012\u00020:072\u0006\u0010;\u001a\u00020\u0014H\u0002J\u0015\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020\u001dH\u0000¢\u0006\u0002\b>J#\u0010?\u001a\u0004\u0018\u00010@2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020:H\u0002J\u0018\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0014H\u0002J\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020K072\f\u0010L\u001a\b\u0012\u0004\u0012\u00020H07H\u0002J\u0019\u0010M\u001a\u0004\u0018\u00010@2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010N¨\u0006P"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeScreenController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "buildUiState", "Lorg/betup/ui/fragment/home/compose/HomeUiState;", "profile", "Lorg/betup/model/local/entity/FullUserProfileModel;", "v7BetStats", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "v7BetStatsRecent", "v7Ranks", "Lorg/betup/model/remote/entity/user/NewUserRanksModel;", "v7UserInfo", "Lorg/betup/model/remote/entity/user/NewUserInfoModel;", "dailyQuests", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", "videoBonus", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;", "bonusOfferActive", "", "activeOffer", "Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;", "livePage", "Lorg/betup/ui/fragment/home/controller/HomeMatchesPaginationController$PageState;", "morePage", "statsLoading", "promoLoading", "battlesBadgeCount", "", "mapStats", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", "resolveDisplayedBestStreak", "allTimeStats", "recentStats", "mapGlobalRankLabel", "", "firstPositive", "values", "", "([Ljava/lang/Integer;)Ljava/lang/Integer;", "resolveGlobalRank", "rankMonth", "rankDay", "legacyRank", "resolveGlobalRank$app_release", "(III)Ljava/lang/Integer;", "formatGlobalRank", "rank", "mapLiveMatches", "Lorg/betup/ui/fragment/home/compose/HomeLiveMatchesUiState;", VKAttachments.TYPE_WIKI_PAGE, "mapMoreMatches", "Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;", "mapMatchItems", "", "Lorg/betup/ui/fragment/home/compose/HomeMatchItem;", "items", "Lorg/betup/model/remote/entity/matches/championship/specific/NewListedMatchModel;", "isLive", "formatCompactBetsCount", "count", "formatCompactBetsCount$app_release", "resolveOfferExpirationMs", "", "(Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;Lorg/betup/model/local/entity/FullUserProfileModel;)Ljava/lang/Long;", "extractPrimaryOdds", "Lorg/betup/ui/fragment/home/compose/HomeScreenController$ExtractedMatchOdds;", "item", "mapBetToOddUi", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", "bet", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetModel;", "groupUserAvailable", "computeImpliedPercents", "", "bets", "parseOfferExpirationMs", "(Lorg/betup/model/local/entity/FullUserProfileModel;)Ljava/lang/Long;", "ExtractedMatchOdds", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeScreenController {
    public static final int $stable = 0;
    public static final HomeScreenController INSTANCE = new HomeScreenController();

    private HomeScreenController() {
    }

    public final HomeUiState buildUiState(FullUserProfileModel profile, NewUserBetStatisticsModel v7BetStats, NewUserBetStatisticsModel v7BetStatsRecent, NewUserRanksModel v7Ranks, NewUserInfoModel v7UserInfo, HomeDailyQuestUiState dailyQuests, HomeVideoBonusUiState videoBonus, boolean bonusOfferActive, HomeActiveOfferUiState activeOffer, HomeMatchesPaginationController.PageState livePage, HomeMatchesPaginationController.PageState morePage, boolean statsLoading, boolean promoLoading, int battlesBadgeCount) {
        HomeActiveOfferUiState homeActiveOfferUiState;
        FullUserProfileModel fullUserProfileModel;
        Intrinsics.checkNotNullParameter(dailyQuests, "dailyQuests");
        Intrinsics.checkNotNullParameter(videoBonus, "videoBonus");
        Intrinsics.checkNotNullParameter(livePage, "livePage");
        Intrinsics.checkNotNullParameter(morePage, "morePage");
        HomeStatsUiState mapStats = mapStats(profile, v7BetStats, v7Ranks, v7UserInfo, statsLoading, v7BetStatsRecent);
        HomePromoUiState homePromoUiState = promoLoading ? HomePromoUiState.Loading.INSTANCE : HomePromoUiState.Content.INSTANCE;
        if (activeOffer == null || !bonusOfferActive) {
            homeActiveOfferUiState = null;
            fullUserProfileModel = profile;
        } else {
            fullUserProfileModel = profile;
            homeActiveOfferUiState = activeOffer;
        }
        return new HomeUiState(mapStats, homePromoUiState, dailyQuests, videoBonus, bonusOfferActive, homeActiveOfferUiState, resolveOfferExpirationMs(activeOffer, fullUserProfileModel), mapLiveMatches(livePage), mapMoreMatches(morePage), battlesBadgeCount);
    }

    public static /* synthetic */ HomeStatsUiState mapStats$default(HomeScreenController homeScreenController, FullUserProfileModel fullUserProfileModel, NewUserBetStatisticsModel newUserBetStatisticsModel, NewUserRanksModel newUserRanksModel, NewUserInfoModel newUserInfoModel, boolean z, NewUserBetStatisticsModel newUserBetStatisticsModel2, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            newUserBetStatisticsModel2 = null;
        }
        return homeScreenController.mapStats(fullUserProfileModel, newUserBetStatisticsModel, newUserRanksModel, newUserInfoModel, z2, newUserBetStatisticsModel2);
    }

    public final HomeStatsUiState mapStats(FullUserProfileModel profile, NewUserBetStatisticsModel v7BetStats, NewUserRanksModel v7Ranks, NewUserInfoModel v7UserInfo, boolean statsLoading, NewUserBetStatisticsModel v7BetStatsRecent) {
        int won;
        int allBets;
        if (statsLoading) {
            return HomeStatsUiState.Loading.INSTANCE;
        }
        UserBetStatsModel userBetStatsModel = profile != null ? profile.getUserBetStatsModel() : null;
        UserRankInfoModel userRankInfoModel = profile != null ? profile.getUserRankInfoModel() : null;
        if (userBetStatsModel == null && userRankInfoModel == null && v7BetStats == null) {
            return HomeStatsUiState.Hidden.INSTANCE;
        }
        if (userBetStatsModel != null) {
            won = userBetStatsModel.getWon();
        } else {
            won = v7BetStats != null ? v7BetStats.getWon() : 0;
        }
        if (userBetStatsModel != null) {
            allBets = userBetStatsModel.getAll();
        } else {
            allBets = v7BetStats != null ? v7BetStats.getAllBets() : 0;
        }
        return new HomeStatsUiState.Visible(allBets > 0 ? MathKt.roundToInt((won / allBets) * 100.0d) : 0, mapGlobalRankLabel(profile, v7Ranks, v7UserInfo), resolveDisplayedBestStreak(v7BetStats, v7BetStatsRecent));
    }

    public final int resolveDisplayedBestStreak(NewUserBetStatisticsModel allTimeStats, NewUserBetStatisticsModel recentStats) {
        int coerceAtLeast = allTimeStats != null ? RangesKt.coerceAtLeast(allTimeStats.getBetWinningStreak(), 0) : 0;
        if (coerceAtLeast > 0) {
            return coerceAtLeast;
        }
        int max = Math.max(recentStats != null ? RangesKt.coerceAtLeast(recentStats.getCurrentWinStreak(), 0) : 0, allTimeStats != null ? RangesKt.coerceAtLeast(allTimeStats.getCurrentWinStreak(), 0) : 0);
        if (max > 0) {
            return max;
        }
        return 0;
    }

    public final String mapGlobalRankLabel(FullUserProfileModel profile, NewUserRanksModel v7Ranks, NewUserInfoModel v7UserInfo) {
        UserRankInfoModel userRankInfoModel;
        UserRankInfoModel userRankInfoModel2;
        Integer[] numArr = new Integer[3];
        int i = 0;
        numArr[0] = v7UserInfo != null ? Integer.valueOf(v7UserInfo.getRankMonth()) : null;
        numArr[1] = v7Ranks != null ? v7Ranks.getRankMonth() : null;
        numArr[2] = (profile == null || (userRankInfoModel2 = profile.getUserRankInfoModel()) == null) ? null : Integer.valueOf(userRankInfoModel2.getRankMonth());
        Integer firstPositive = firstPositive(numArr);
        int intValue = firstPositive != null ? firstPositive.intValue() : 0;
        Integer[] numArr2 = new Integer[3];
        numArr2[0] = v7UserInfo != null ? Integer.valueOf(v7UserInfo.getRankDay()) : null;
        numArr2[1] = v7Ranks != null ? v7Ranks.getRankDay() : null;
        numArr2[2] = (profile == null || (userRankInfoModel = profile.getUserRankInfoModel()) == null) ? null : Integer.valueOf(userRankInfoModel.getRankDay());
        Integer firstPositive2 = firstPositive(numArr2);
        int intValue2 = firstPositive2 != null ? firstPositive2.intValue() : 0;
        if (v7UserInfo != null) {
            Integer valueOf = Integer.valueOf(v7UserInfo.getRank());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            }
        }
        Integer resolveGlobalRank$app_release = resolveGlobalRank$app_release(intValue, intValue2, i);
        if (resolveGlobalRank$app_release != null) {
            return formatGlobalRank(resolveGlobalRank$app_release.intValue());
        }
        return null;
    }

    public final Integer resolveGlobalRank$app_release(int rankMonth, int rankDay, int legacyRank) {
        if (rankMonth > 0) {
            return Integer.valueOf(rankMonth);
        }
        if (rankDay > 0) {
            return Integer.valueOf(rankDay);
        }
        if (legacyRank > 0) {
            return Integer.valueOf(legacyRank);
        }
        return null;
    }

    public final String formatGlobalRank(int rank) {
        String formatGroupedWithSpace;
        if (rank >= 1000) {
            formatGroupedWithSpace = UiExtensionsKt.formatCompactCount(rank);
        } else {
            formatGroupedWithSpace = UiExtensionsKt.formatGroupedWithSpace(rank);
        }
        return "#" + formatGroupedWithSpace;
    }

    public final HomeLiveMatchesUiState mapLiveMatches(HomeMatchesPaginationController.PageState page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (page.isInitialLoading()) {
            return HomeLiveMatchesUiState.Loading.INSTANCE;
        }
        List<HomeMatchItem> mapMatchItems = mapMatchItems(page.getItems(), true);
        if (mapMatchItems.isEmpty()) {
            return HomeLiveMatchesUiState.Hidden.INSTANCE;
        }
        return new HomeLiveMatchesUiState.Visible(mapMatchItems, page.isLoadingMore(), page.getHasMore());
    }

    public final HomeMoreMatchesUiState mapMoreMatches(HomeMatchesPaginationController.PageState page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (page.isInitialLoading()) {
            return HomeMoreMatchesUiState.Loading.INSTANCE;
        }
        List<HomeMatchItem> mapMatchItems = mapMatchItems(page.getItems(), false);
        if (mapMatchItems.isEmpty()) {
            return HomeMoreMatchesUiState.Hidden.INSTANCE;
        }
        return new HomeMoreMatchesUiState.Visible(mapMatchItems, page.isLoadingMore(), page.getHasMore());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<HomeMatchItem> mapMatchItems(List<NewListedMatchModel> items, boolean isLive) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (NewListedMatchModel newListedMatchModel : items) {
            NewMatchDetailsDataModel match = newListedMatchModel.getMatch();
            HomeMatchItem homeMatchItem = null;
            if (match.getId() <= 0) {
                arrayList = arrayList2;
            } else {
                HomeScreenController homeScreenController = INSTANCE;
                ExtractedMatchOdds extractPrimaryOdds = homeScreenController.extractPrimaryOdds(newListedMatchModel);
                Integer valueOf = Integer.valueOf(newListedMatchModel.getSocial().getBetsCount());
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                long id = match.getId();
                String name = match.getHomeTeam().getName();
                String name2 = match.getAwayTeam().getName();
                String photoUrl = match.getHomeTeam().getPhotoUrl();
                String photoUrl2 = match.getAwayTeam().getPhotoUrl();
                Integer valueOf2 = isLive ? Integer.valueOf(match.getScoreHome()) : null;
                Integer valueOf3 = isLive ? Integer.valueOf(match.getScoreAway()) : null;
                String name3 = match.getSport().getName();
                if (StringsKt.isBlank(name3)) {
                    name3 = null;
                }
                String formatCompactBetsCount$app_release = valueOf != null ? homeScreenController.formatCompactBetsCount$app_release(valueOf.intValue()) : null;
                if (!isLive) {
                    String formattedTime = UiExtensionsKt.getFormattedTime(match.getDate());
                    if (!StringsKt.isBlank(formattedTime)) {
                        str = formattedTime;
                        if (!isLive) {
                            String formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(match.getDate());
                            if (!StringsKt.isBlank(formattedDateWithoutYear)) {
                                str2 = formattedDateWithoutYear;
                                String name4 = match.getLeague().getName();
                                String str5 = !StringsKt.isBlank(name4) ? name4 : null;
                                if (isLive) {
                                    String normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(match.getCurrentPeriod());
                                    if (!StringsKt.isBlank(normalizeMatchTime)) {
                                        str3 = normalizeMatchTime;
                                        if (isLive) {
                                            String normalizeMatchTime2 = UiExtensionsKt.normalizeMatchTime(match.getCurrentTime());
                                            if (!StringsKt.isBlank(normalizeMatchTime2)) {
                                                str4 = normalizeMatchTime2;
                                                arrayList = arrayList2;
                                                homeMatchItem = new HomeMatchItem(id, name, name2, photoUrl, photoUrl2, valueOf2, valueOf3, isLive, name3, formatCompactBetsCount$app_release, str, str2, str5, str3, str4, extractPrimaryOdds.getSentimentPercents(), extractPrimaryOdds.getOdds(), match.getSport().getId());
                                            }
                                        }
                                        str4 = null;
                                        arrayList = arrayList2;
                                        homeMatchItem = new HomeMatchItem(id, name, name2, photoUrl, photoUrl2, valueOf2, valueOf3, isLive, name3, formatCompactBetsCount$app_release, str, str2, str5, str3, str4, extractPrimaryOdds.getSentimentPercents(), extractPrimaryOdds.getOdds(), match.getSport().getId());
                                    }
                                }
                                str3 = null;
                                if (isLive) {
                                }
                                str4 = null;
                                arrayList = arrayList2;
                                homeMatchItem = new HomeMatchItem(id, name, name2, photoUrl, photoUrl2, valueOf2, valueOf3, isLive, name3, formatCompactBetsCount$app_release, str, str2, str5, str3, str4, extractPrimaryOdds.getSentimentPercents(), extractPrimaryOdds.getOdds(), match.getSport().getId());
                            }
                        }
                        str2 = null;
                        String name42 = match.getLeague().getName();
                        if (!StringsKt.isBlank(name42)) {
                        }
                        if (isLive) {
                        }
                        str3 = null;
                        if (isLive) {
                        }
                        str4 = null;
                        arrayList = arrayList2;
                        homeMatchItem = new HomeMatchItem(id, name, name2, photoUrl, photoUrl2, valueOf2, valueOf3, isLive, name3, formatCompactBetsCount$app_release, str, str2, str5, str3, str4, extractPrimaryOdds.getSentimentPercents(), extractPrimaryOdds.getOdds(), match.getSport().getId());
                    }
                }
                str = null;
                if (!isLive) {
                }
                str2 = null;
                String name422 = match.getLeague().getName();
                if (!StringsKt.isBlank(name422)) {
                }
                if (isLive) {
                }
                str3 = null;
                if (isLive) {
                }
                str4 = null;
                arrayList = arrayList2;
                homeMatchItem = new HomeMatchItem(id, name, name2, photoUrl, photoUrl2, valueOf2, valueOf3, isLive, name3, formatCompactBetsCount$app_release, str, str2, str5, str3, str4, extractPrimaryOdds.getSentimentPercents(), extractPrimaryOdds.getOdds(), match.getSport().getId());
            }
            ArrayList arrayList3 = arrayList;
            if (homeMatchItem != null) {
                arrayList3.add(homeMatchItem);
            }
            arrayList2 = arrayList3;
        }
        return arrayList2;
    }

    public final String formatCompactBetsCount$app_release(int count) {
        return UiExtensionsKt.formatCompactCount(count);
    }

    private final Long resolveOfferExpirationMs(HomeActiveOfferUiState activeOffer, FullUserProfileModel profile) {
        Long l = null;
        if (activeOffer != null) {
            Long valueOf = Long.valueOf(activeOffer.getExpirationMs());
            if (valueOf.longValue() > System.currentTimeMillis()) {
                l = valueOf;
            }
        }
        return l != null ? l : parseOfferExpirationMs(profile);
    }

    /* compiled from: HomeScreenController.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeScreenController$ExtractedMatchOdds;", "", "odds", "", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", "sentimentPercents", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/util/List;)V", "getOdds", "()Ljava/util/List;", "getSentimentPercents", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class ExtractedMatchOdds {
        private final List<HomeMatchOddUi> odds;
        private final List<Float> sentimentPercents;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExtractedMatchOdds copy$default(ExtractedMatchOdds extractedMatchOdds, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = extractedMatchOdds.odds;
            }
            if ((i & 2) != 0) {
                list2 = extractedMatchOdds.sentimentPercents;
            }
            return extractedMatchOdds.copy(list, list2);
        }

        public final List<HomeMatchOddUi> component1() {
            return this.odds;
        }

        public final List<Float> component2() {
            return this.sentimentPercents;
        }

        public final ExtractedMatchOdds copy(List<HomeMatchOddUi> odds, List<Float> sentimentPercents) {
            Intrinsics.checkNotNullParameter(odds, "odds");
            Intrinsics.checkNotNullParameter(sentimentPercents, "sentimentPercents");
            return new ExtractedMatchOdds(odds, sentimentPercents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtractedMatchOdds)) {
                return false;
            }
            ExtractedMatchOdds extractedMatchOdds = (ExtractedMatchOdds) other;
            return Intrinsics.areEqual(this.odds, extractedMatchOdds.odds) && Intrinsics.areEqual(this.sentimentPercents, extractedMatchOdds.sentimentPercents);
        }

        public int hashCode() {
            return (this.odds.hashCode() * 31) + this.sentimentPercents.hashCode();
        }

        public String toString() {
            return "ExtractedMatchOdds(odds=" + this.odds + ", sentimentPercents=" + this.sentimentPercents + ")";
        }

        public ExtractedMatchOdds(List<HomeMatchOddUi> odds, List<Float> sentimentPercents) {
            Intrinsics.checkNotNullParameter(odds, "odds");
            Intrinsics.checkNotNullParameter(sentimentPercents, "sentimentPercents");
            this.odds = odds;
            this.sentimentPercents = sentimentPercents;
        }

        public final List<HomeMatchOddUi> getOdds() {
            return this.odds;
        }

        public final List<Float> getSentimentPercents() {
            return this.sentimentPercents;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    private final ExtractedMatchOdds extractPrimaryOdds(NewListedMatchModel item) {
        List<NewBetModel> list;
        Object obj;
        NewGroupModel group;
        List<NewBetModel> bets;
        NewBetGroupModel newBetGroupModel;
        NewBetSectionModel newBetSectionModel = (NewBetSectionModel) CollectionsKt.firstOrNull((List) item.getBets());
        if (newBetSectionModel == null) {
            return new ExtractedMatchOdds(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
        int id = BetHelper.BetGroupType.WHO_WILL_WIN.getId();
        Iterator it = newBetSectionModel.getGroups().iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NewBetGroupModel newBetGroupModel2 = (NewBetGroupModel) obj;
            if (newBetGroupModel2.getGroup().getId() == id && !newBetGroupModel2.getBets().isEmpty()) {
                break;
            }
        }
        NewBetGroupModel newBetGroupModel3 = (NewBetGroupModel) obj;
        if (newBetGroupModel3 == null) {
            Iterator it2 = newBetSectionModel.getGroups().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    newBetGroupModel = 0;
                    break;
                }
                newBetGroupModel = it2.next();
                if (!((NewBetGroupModel) newBetGroupModel).getBets().isEmpty()) {
                    break;
                }
            }
            newBetGroupModel3 = newBetGroupModel;
        }
        if (newBetGroupModel3 != null && (bets = newBetGroupModel3.getBets()) != null) {
            list = CollectionsKt.take(bets, 3);
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        boolean userAvailable = (newBetGroupModel3 == null || (group = newBetGroupModel3.getGroup()) == null) ? true : group.getUserAvailable();
        List<NewBetModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList.add(INSTANCE.mapBetToOddUi((NewBetModel) it3.next(), userAvailable));
        }
        return new ExtractedMatchOdds(arrayList, computeImpliedPercents(list));
    }

    private final HomeMatchOddUi mapBetToOddUi(NewBetModel bet, boolean groupUserAvailable) {
        long grabbedBetId = bet.getGrabbedBetId();
        int betTypeId = bet.getBetTypeId();
        String betName = bet.getBetName();
        boolean isAvailable = bet.isAvailable();
        double grabbedCoeficient = bet.getGrabbedCoeficient();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(bet.getGrabbedCoeficient())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return new HomeMatchOddUi(grabbedBetId, betTypeId, betName, isAvailable, grabbedCoeficient, format, groupUserAvailable);
    }

    private final List<Float> computeImpliedPercents(List<NewBetModel> bets) {
        if (bets.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<NewBetModel> list = bets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            double d = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            NewBetModel newBetModel = (NewBetModel) it.next();
            if (newBetModel.getGrabbedCoeficient() > 0.0d) {
                d = 1.0d / newBetModel.getGrabbedCoeficient();
            }
            arrayList.add(Double.valueOf(d));
        }
        ArrayList arrayList2 = arrayList;
        if (CollectionsKt.sumOfDouble(arrayList2) <= 0.0d) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(MathKt.roundToInt((((Number) it2.next()).doubleValue() / r5) * 100.0d)));
        }
        return arrayList3;
    }

    private final Long parseOfferExpirationMs(FullUserProfileModel profile) {
        BaseUserModel userModel;
        String offerExpiration;
        if (profile == null || (userModel = profile.getUserModel()) == null || (offerExpiration = userModel.getOfferExpiration()) == null || StringsKt.isBlank(offerExpiration)) {
            return null;
        }
        Long valueOf = Long.valueOf(DateHelper.getTimestamp(offerExpiration));
        if (valueOf.longValue() > System.currentTimeMillis()) {
            return valueOf;
        }
        return null;
    }

    private final Integer firstPositive(Integer... values) {
        for (Integer num : values) {
            if (num != null && num.intValue() > 0) {
                return num;
            }
        }
        return null;
    }
}
