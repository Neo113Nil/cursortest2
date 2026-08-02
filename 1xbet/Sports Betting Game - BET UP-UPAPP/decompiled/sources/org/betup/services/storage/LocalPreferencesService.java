package org.betup.services.storage;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.injection.provider.PreferencesProvider;
import org.betup.model.local.entity.BetPresentation;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.local.entity.OddType;
import org.betup.model.local.entity.RecentUserSearchesModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.utils.OddHelper;
import org.betup.utils.VarietyBetRestrictions;

@Singleton
/* loaded from: classes2.dex */
public class LocalPreferencesService {
    private static final String KEY_ONE_CLICK_BET_ENABLED = "one_click_bet_enabled";
    private static final String KEY_ONE_CLICK_BET_STAKE = "one_click_bet_stake";
    private static final String KEY_PLAYER_STATS_BET_EVER_PLACED = "player_stats_bet_ever_placed";
    private static final String KEY_PLAYER_STATS_BET_EVER_PLACED_LEGACY = "player_stats_bet_ever_placed";
    private static final String KEY_VARIETY_MIN_STAKE_BET_EVER_PLACED_PREFIX = "variety_min_stake_bet_ever_placed_";
    private static final String LOCAL_PROFILE = "local_profile";
    private final PreferencesProvider preferencesProvider;

    @Inject
    public LocalPreferencesService(PreferencesProvider preferencesProvider) {
        this.preferencesProvider = preferencesProvider;
    }

    public void deleteLocalProfile() {
        this.preferencesProvider.getSharedPreferences().edit().putString(LOCAL_PROFILE, null).remove(KEY_ONE_CLICK_BET_ENABLED).remove(KEY_ONE_CLICK_BET_STAKE).apply();
    }

    public void removeOneClickBetPrefsForUser(long betupUserId) {
        if (betupUserId <= 0) {
            return;
        }
        this.preferencesProvider.getSharedPreferences().edit().remove(oneClickEnabledKey(betupUserId)).remove(oneClickStakeKey(betupUserId)).apply();
    }

    public void saveLocalProfile(FullUserProfileModel userMeModel) {
        if (userMeModel == null) {
            return;
        }
        this.preferencesProvider.getSharedPreferences().edit().putString(LOCAL_PROFILE, new Gson().toJson(userMeModel)).apply();
    }

    public FullUserProfileModel getLocalProfile() {
        String string = this.preferencesProvider.getSharedPreferences().getString(LOCAL_PROFILE, null);
        if (string == null) {
            return null;
        }
        try {
            if (!string.contains("\"userModel\"")) {
                return tryGetOldProfileFromStr(string);
            }
            return (FullUserProfileModel) new Gson().fromJson(string, FullUserProfileModel.class);
        } catch (Exception unused) {
            return tryGetOldProfileFromStr(string);
        }
    }

    public List<String> getRecentSearches(int userId) {
        String string = this.preferencesProvider.getSharedPreferences().getString("recent_searches_" + userId, null);
        if (string != null) {
            try {
                return ((RecentUserSearchesModel) new Gson().fromJson(string, RecentUserSearchesModel.class)).getTerms();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    public void saveRecentSearches(int userId, List<String> recents) {
        RecentUserSearchesModel recentUserSearchesModel = new RecentUserSearchesModel();
        recentUserSearchesModel.setUserId(userId);
        recentUserSearchesModel.setTerms(recents);
        this.preferencesProvider.getSharedPreferences().edit().putString("recent_searches_" + userId, new Gson().toJson(recentUserSearchesModel)).apply();
    }

    private FullUserProfileModel tryGetOldProfileFromStr(String profileStr) {
        try {
            BaseUserModel baseUserModel = (BaseUserModel) new Gson().fromJson(profileStr, BaseUserModel.class);
            FullUserProfileModel fullUserProfileModel = new FullUserProfileModel();
            fullUserProfileModel.setUserModel(baseUserModel);
            return fullUserProfileModel;
        } catch (Exception unused) {
            return null;
        }
    }

    public void saveExpandMatchesHighlighted() {
        this.preferencesProvider.getSharedPreferences().edit().putBoolean("expand_highlighted", true).apply();
    }

    public boolean isExpandMatchesHighlighted() {
        return this.preferencesProvider.getSharedPreferences().getBoolean("expand_highlighted", false);
    }

    public void saveOddType(OddType oddType) {
        this.preferencesProvider.getSharedPreferences().edit().putString("oddType", oddType.toString()).apply();
    }

    public OddType getOddType() {
        return OddHelper.getFromString(this.preferencesProvider.getSharedPreferences().getString("oddType", OddType.DECIMAL.toString()));
    }

    public void saveBetPresentation(BetPresentation betPresentation) {
        this.preferencesProvider.getSharedPreferences().edit().putString("betPresentation", betPresentation.getBetFormatName()).apply();
    }

    public BetPresentation getBetPresentation() {
        return BetPresentation.getFromString(this.preferencesProvider.getSharedPreferences().getString("betPresentation", BetPresentation.SHORT.getBetFormatName()));
    }

    public void saveBetPresentationForLeague(int leagueId, BetPresentation betPresentation) {
        this.preferencesProvider.getSharedPreferences().edit().putString("betPresentation_league_" + leagueId, betPresentation.getBetFormatName()).apply();
    }

    public BetPresentation getBetPresentationForLeague(int leagueId) {
        String string = this.preferencesProvider.getSharedPreferences().getString("betPresentation_league_" + leagueId, null);
        if (string != null) {
            return BetPresentation.getFromString(string);
        }
        return getBetPresentation();
    }

    public boolean getUserConsent() {
        return this.preferencesProvider.getSharedPreferences().getBoolean(X3.j.b0, false);
    }

    public void saveUserContent(boolean consent) {
        this.preferencesProvider.getSharedPreferences().edit().putBoolean(X3.j.b0, consent).apply();
    }

    public void saveUserConsentAsked(boolean consent) {
        this.preferencesProvider.getSharedPreferences().edit().putBoolean("consent_asked", consent).apply();
    }

    public boolean getIsEU() {
        return this.preferencesProvider.getSharedPreferences().getBoolean("is_eu", false);
    }

    public void saveIsEU(boolean consent) {
        this.preferencesProvider.getSharedPreferences().edit().putBoolean("is_eu", consent).apply();
    }

    public void saveExpandedBetGroupsForMatch(int matchId, Map<Integer, Map<Long, Boolean>> expandedStatesPerTab) {
        try {
            this.preferencesProvider.getSharedPreferences().edit().putString("expanded_bet_groups_match_" + matchId, new Gson().toJson(expandedStatesPerTab)).apply();
        } catch (Exception unused) {
        }
    }

    public Map<Integer, Map<Long, Boolean>> getExpandedBetGroupsForMatch(int matchId) {
        try {
            String string = this.preferencesProvider.getSharedPreferences().getString("expanded_bet_groups_match_" + matchId, null);
            if (string != null) {
                return (Map) new Gson().fromJson(string, new TypeToken<Map<Integer, Map<Long, Boolean>>>() { // from class: org.betup.services.storage.LocalPreferencesService.1
                }.getType());
            }
        } catch (Exception unused) {
        }
        return new HashMap();
    }

    public void saveGlobalExpandedBets(boolean expanded) {
        this.preferencesProvider.getSharedPreferences().edit().putBoolean("global_expanded_bets", expanded).apply();
    }

    public boolean getGlobalExpandedBets() {
        return this.preferencesProvider.getSharedPreferences().getBoolean("global_expanded_bets", false);
    }

    private static String oneClickEnabledKey(long betupUserId) {
        return "one_click_bet_enabled_" + betupUserId;
    }

    private static String oneClickStakeKey(long betupUserId) {
        return "one_click_bet_stake_" + betupUserId;
    }

    public void migrateLegacyOneClickPrefsToUserIfPresent(long betupUserId) {
        if (betupUserId <= 0) {
            return;
        }
        SharedPreferences sharedPreferences = this.preferencesProvider.getSharedPreferences();
        String oneClickEnabledKey = oneClickEnabledKey(betupUserId);
        String oneClickStakeKey = oneClickStakeKey(betupUserId);
        if (sharedPreferences.contains(KEY_ONE_CLICK_BET_ENABLED) || sharedPreferences.contains(KEY_ONE_CLICK_BET_STAKE)) {
            if (sharedPreferences.contains(oneClickEnabledKey) || sharedPreferences.contains(oneClickStakeKey)) {
                sharedPreferences.edit().remove(KEY_ONE_CLICK_BET_ENABLED).remove(KEY_ONE_CLICK_BET_STAKE).apply();
                return;
            }
            boolean z = sharedPreferences.getBoolean(KEY_ONE_CLICK_BET_ENABLED, false);
            sharedPreferences.edit().putBoolean(oneClickEnabledKey, z).putLong(oneClickStakeKey, sharedPreferences.getLong(KEY_ONE_CLICK_BET_STAKE, 500L)).remove(KEY_ONE_CLICK_BET_ENABLED).remove(KEY_ONE_CLICK_BET_STAKE).apply();
        }
    }

    public void setOneClickBetEnabled(long betupUserId, boolean enabled) {
        if (betupUserId <= 0) {
            return;
        }
        this.preferencesProvider.getSharedPreferences().edit().putBoolean(oneClickEnabledKey(betupUserId), enabled).remove(KEY_ONE_CLICK_BET_ENABLED).remove(KEY_ONE_CLICK_BET_STAKE).apply();
    }

    public boolean isOneClickBetEnabled(long betupUserId) {
        if (betupUserId <= 0) {
            return false;
        }
        return this.preferencesProvider.getSharedPreferences().getBoolean(oneClickEnabledKey(betupUserId), false);
    }

    public void setOneClickBetStake(long betupUserId, long stake) {
        if (betupUserId <= 0) {
            return;
        }
        this.preferencesProvider.getSharedPreferences().edit().putLong(oneClickStakeKey(betupUserId), stake).remove(KEY_ONE_CLICK_BET_ENABLED).remove(KEY_ONE_CLICK_BET_STAKE).apply();
    }

    public long getOneClickBetStake(long betupUserId) {
        if (betupUserId <= 0) {
            return 500L;
        }
        return this.preferencesProvider.getSharedPreferences().getLong(oneClickStakeKey(betupUserId), 500L);
    }

    private static String playerStatsBetEverPlacedKey(long betupUserId) {
        return varietyMinStakeBetEverPlacedKey(betupUserId, VarietyBetRestrictions.RULE_ID_PLAYER_STATS);
    }

    private static String varietyMinStakeBetEverPlacedKey(long betupUserId, String ruleId) {
        return KEY_VARIETY_MIN_STAKE_BET_EVER_PLACED_PREFIX + betupUserId + "_" + ruleId;
    }

    public void migrateLegacyPlayerStatsBetEverPlacedToUserIfPresent(long betupUserId) {
        if (betupUserId <= 0) {
            return;
        }
        SharedPreferences sharedPreferences = this.preferencesProvider.getSharedPreferences();
        if (sharedPreferences.contains("player_stats_bet_ever_placed")) {
            String playerStatsBetEverPlacedKey = playerStatsBetEverPlacedKey(betupUserId);
            if (sharedPreferences.contains(playerStatsBetEverPlacedKey)) {
                sharedPreferences.edit().remove("player_stats_bet_ever_placed").apply();
            } else {
                sharedPreferences.edit().putBoolean(playerStatsBetEverPlacedKey, sharedPreferences.getBoolean("player_stats_bet_ever_placed", false)).remove("player_stats_bet_ever_placed").apply();
            }
        }
    }

    public boolean hasVarietyMinStakeBetEverPlaced(long betupUserId, String ruleId) {
        if (betupUserId > 0 && ruleId != null && !ruleId.isEmpty()) {
            SharedPreferences sharedPreferences = this.preferencesProvider.getSharedPreferences();
            if (sharedPreferences.getBoolean(varietyMinStakeBetEverPlacedKey(betupUserId, ruleId), false)) {
                return true;
            }
            if (VarietyBetRestrictions.RULE_ID_PLAYER_STATS.equals(ruleId)) {
                return sharedPreferences.getBoolean("player_stats_bet_ever_placed", false);
            }
        }
        return false;
    }

    public void setVarietyMinStakeBetEverPlaced(long betupUserId, String ruleId) {
        if (betupUserId <= 0 || ruleId == null || ruleId.isEmpty()) {
            return;
        }
        this.preferencesProvider.getSharedPreferences().edit().putBoolean(varietyMinStakeBetEverPlacedKey(betupUserId, ruleId), true).remove("player_stats_bet_ever_placed").apply();
    }

    public void removeVarietyMinStakeBetEverPlacedForUser(long betupUserId, String ruleId) {
        if (betupUserId <= 0 || ruleId == null || ruleId.isEmpty()) {
            return;
        }
        this.preferencesProvider.getSharedPreferences().edit().remove(varietyMinStakeBetEverPlacedKey(betupUserId, ruleId)).apply();
    }

    public boolean hasPlayerStatsBetEverPlaced(long betupUserId) {
        return hasVarietyMinStakeBetEverPlaced(betupUserId, VarietyBetRestrictions.RULE_ID_PLAYER_STATS);
    }

    public void setPlayerStatsBetEverPlaced(long betupUserId) {
        setVarietyMinStakeBetEverPlaced(betupUserId, VarietyBetRestrictions.RULE_ID_PLAYER_STATS);
    }

    public void removePlayerStatsBetEverPlacedForUser(long betupUserId) {
        removeVarietyMinStakeBetEverPlacedForUser(betupUserId, VarietyBetRestrictions.RULE_ID_PLAYER_STATS);
    }
}
