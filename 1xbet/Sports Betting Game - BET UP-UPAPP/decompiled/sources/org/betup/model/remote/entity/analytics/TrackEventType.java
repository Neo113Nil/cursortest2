package org.betup.model.remote.entity.analytics;

import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrackEventType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b.\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.¨\u0006/"}, d2 = {"Lorg/betup/model/remote/entity/analytics/TrackEventType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "BET_PLACED", "CHALLENGE_STARTED", "CHALLENGE_ACCEPTED", "ACHIEVEMENT_UNLOCKED", "SHOP_CLOSED", "LEVEL_UP", "SAVE_BET", "OPEN_MATCH_ARENA", "BET_LOST", "SESSION_STARTED", "PURCHASE_CANCELED", "SELL_BET", "SERVER_DOWN", "NO_ENERGY_DIALOG_SHOWN", "ACCOUNT_UPGRADE", "ANONYMOUS_LOGIN", "BET_WON", "TUTORIAL_BEGIN", "TUTORIAL_STEP_VIEWED", "TUTORIAL_STEP_COMPLETE", "TUTORIAL_COMPLETE", "TUTORIAL_ABANDONED", "FIRST_BET_PLACED", "POST_TUTORIAL_INACTIVITY", "PURCHASE_PROMPT_SHOWN", "AD_IMPRESSION", "AD_REWARD_EARNED", "OFFER_SHOWN", "OFFER_CLOSED", "NOT_ENOUGH_MONEY", "MINI_GAME_LOST", "MINI_GAME_WON", "SIGN_IN", "PRESENTATION_SHOWN", "PRESENTATION_CLOSED", "PRESENTATION_SKIPPED", "PRESENTATION_REMIND_LATER", "INTERSTITIAL_SHOWN", "INTERSTITIAL_CLICKED", "INTERSTITIAL_CLOSED", "INTERSTITIAL_SKIPPED", "INTERSTITIAL_VIDEO_COMPLETED", "COUNTRY_CHANGED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrackEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrackEventType[] $VALUES;

    @SerializedName("BetPlaced")
    public static final TrackEventType BET_PLACED = new TrackEventType("BET_PLACED", 0);

    @SerializedName("ChallengeStarted")
    public static final TrackEventType CHALLENGE_STARTED = new TrackEventType("CHALLENGE_STARTED", 1);

    @SerializedName("ChallengeAccepted")
    public static final TrackEventType CHALLENGE_ACCEPTED = new TrackEventType("CHALLENGE_ACCEPTED", 2);

    @SerializedName("AchievementUnlocked")
    public static final TrackEventType ACHIEVEMENT_UNLOCKED = new TrackEventType("ACHIEVEMENT_UNLOCKED", 3);

    @SerializedName("ShopClosed")
    public static final TrackEventType SHOP_CLOSED = new TrackEventType("SHOP_CLOSED", 4);

    @SerializedName("LevelUp")
    public static final TrackEventType LEVEL_UP = new TrackEventType("LEVEL_UP", 5);

    @SerializedName("SaveBet")
    public static final TrackEventType SAVE_BET = new TrackEventType("SAVE_BET", 6);

    @SerializedName("OpenMatchArena")
    public static final TrackEventType OPEN_MATCH_ARENA = new TrackEventType("OPEN_MATCH_ARENA", 7);

    @SerializedName("BetLost")
    public static final TrackEventType BET_LOST = new TrackEventType("BET_LOST", 8);

    @SerializedName("SessionStarted")
    public static final TrackEventType SESSION_STARTED = new TrackEventType("SESSION_STARTED", 9);

    @SerializedName("PurchaseCanceled")
    public static final TrackEventType PURCHASE_CANCELED = new TrackEventType("PURCHASE_CANCELED", 10);

    @SerializedName("SellBet")
    public static final TrackEventType SELL_BET = new TrackEventType("SELL_BET", 11);

    @SerializedName("ServerDown")
    public static final TrackEventType SERVER_DOWN = new TrackEventType("SERVER_DOWN", 12);

    @SerializedName("NoEnergyDialogShown")
    public static final TrackEventType NO_ENERGY_DIALOG_SHOWN = new TrackEventType("NO_ENERGY_DIALOG_SHOWN", 13);

    @SerializedName("AccountUpgrade")
    public static final TrackEventType ACCOUNT_UPGRADE = new TrackEventType("ACCOUNT_UPGRADE", 14);

    @SerializedName("AnonymousLogin")
    public static final TrackEventType ANONYMOUS_LOGIN = new TrackEventType("ANONYMOUS_LOGIN", 15);

    @SerializedName("BetWon")
    public static final TrackEventType BET_WON = new TrackEventType("BET_WON", 16);

    @SerializedName("TutorialBegin")
    public static final TrackEventType TUTORIAL_BEGIN = new TrackEventType("TUTORIAL_BEGIN", 17);

    @SerializedName("TutorialStepViewed")
    public static final TrackEventType TUTORIAL_STEP_VIEWED = new TrackEventType("TUTORIAL_STEP_VIEWED", 18);

    @SerializedName("TutorialStepComplete")
    public static final TrackEventType TUTORIAL_STEP_COMPLETE = new TrackEventType("TUTORIAL_STEP_COMPLETE", 19);

    @SerializedName("TutorialComplete")
    public static final TrackEventType TUTORIAL_COMPLETE = new TrackEventType("TUTORIAL_COMPLETE", 20);

    @SerializedName("TutorialAbandoned")
    public static final TrackEventType TUTORIAL_ABANDONED = new TrackEventType("TUTORIAL_ABANDONED", 21);

    @SerializedName("FirstBetPlaced")
    public static final TrackEventType FIRST_BET_PLACED = new TrackEventType("FIRST_BET_PLACED", 22);

    @SerializedName("PostTutorialInactivity")
    public static final TrackEventType POST_TUTORIAL_INACTIVITY = new TrackEventType("POST_TUTORIAL_INACTIVITY", 23);

    @SerializedName("PurchasePromptShown")
    public static final TrackEventType PURCHASE_PROMPT_SHOWN = new TrackEventType("PURCHASE_PROMPT_SHOWN", 24);

    @SerializedName(AppEventsConstants.EVENT_NAME_AD_IMPRESSION)
    public static final TrackEventType AD_IMPRESSION = new TrackEventType("AD_IMPRESSION", 25);

    @SerializedName("AdRewardEarned")
    public static final TrackEventType AD_REWARD_EARNED = new TrackEventType("AD_REWARD_EARNED", 26);

    @SerializedName("OfferShown")
    public static final TrackEventType OFFER_SHOWN = new TrackEventType("OFFER_SHOWN", 27);

    @SerializedName("OfferClosed")
    public static final TrackEventType OFFER_CLOSED = new TrackEventType("OFFER_CLOSED", 28);

    @SerializedName("NotEnoughMoney")
    public static final TrackEventType NOT_ENOUGH_MONEY = new TrackEventType("NOT_ENOUGH_MONEY", 29);

    @SerializedName("MiniGameLost")
    public static final TrackEventType MINI_GAME_LOST = new TrackEventType("MINI_GAME_LOST", 30);

    @SerializedName("MiniGameWon")
    public static final TrackEventType MINI_GAME_WON = new TrackEventType("MINI_GAME_WON", 31);

    @SerializedName("SignIn")
    public static final TrackEventType SIGN_IN = new TrackEventType("SIGN_IN", 32);

    @SerializedName("PresentationShown")
    public static final TrackEventType PRESENTATION_SHOWN = new TrackEventType("PRESENTATION_SHOWN", 33);

    @SerializedName("PresentationClosed")
    public static final TrackEventType PRESENTATION_CLOSED = new TrackEventType("PRESENTATION_CLOSED", 34);

    @SerializedName("PresentationSkipped")
    public static final TrackEventType PRESENTATION_SKIPPED = new TrackEventType("PRESENTATION_SKIPPED", 35);

    @SerializedName("PresentationRemindLater")
    public static final TrackEventType PRESENTATION_REMIND_LATER = new TrackEventType("PRESENTATION_REMIND_LATER", 36);

    @SerializedName("InterstitialShown")
    public static final TrackEventType INTERSTITIAL_SHOWN = new TrackEventType("INTERSTITIAL_SHOWN", 37);

    @SerializedName("InterstitialClicked")
    public static final TrackEventType INTERSTITIAL_CLICKED = new TrackEventType("INTERSTITIAL_CLICKED", 38);

    @SerializedName("InterstitialClosed")
    public static final TrackEventType INTERSTITIAL_CLOSED = new TrackEventType("INTERSTITIAL_CLOSED", 39);

    @SerializedName("InterstitialSkipped")
    public static final TrackEventType INTERSTITIAL_SKIPPED = new TrackEventType("INTERSTITIAL_SKIPPED", 40);

    @SerializedName("InterstitialVideoCompleted")
    public static final TrackEventType INTERSTITIAL_VIDEO_COMPLETED = new TrackEventType("INTERSTITIAL_VIDEO_COMPLETED", 41);

    @SerializedName("CountryChanged")
    public static final TrackEventType COUNTRY_CHANGED = new TrackEventType("COUNTRY_CHANGED", 42);

    private static final /* synthetic */ TrackEventType[] $values() {
        return new TrackEventType[]{BET_PLACED, CHALLENGE_STARTED, CHALLENGE_ACCEPTED, ACHIEVEMENT_UNLOCKED, SHOP_CLOSED, LEVEL_UP, SAVE_BET, OPEN_MATCH_ARENA, BET_LOST, SESSION_STARTED, PURCHASE_CANCELED, SELL_BET, SERVER_DOWN, NO_ENERGY_DIALOG_SHOWN, ACCOUNT_UPGRADE, ANONYMOUS_LOGIN, BET_WON, TUTORIAL_BEGIN, TUTORIAL_STEP_VIEWED, TUTORIAL_STEP_COMPLETE, TUTORIAL_COMPLETE, TUTORIAL_ABANDONED, FIRST_BET_PLACED, POST_TUTORIAL_INACTIVITY, PURCHASE_PROMPT_SHOWN, AD_IMPRESSION, AD_REWARD_EARNED, OFFER_SHOWN, OFFER_CLOSED, NOT_ENOUGH_MONEY, MINI_GAME_LOST, MINI_GAME_WON, SIGN_IN, PRESENTATION_SHOWN, PRESENTATION_CLOSED, PRESENTATION_SKIPPED, PRESENTATION_REMIND_LATER, INTERSTITIAL_SHOWN, INTERSTITIAL_CLICKED, INTERSTITIAL_CLOSED, INTERSTITIAL_SKIPPED, INTERSTITIAL_VIDEO_COMPLETED, COUNTRY_CHANGED};
    }

    public static EnumEntries<TrackEventType> getEntries() {
        return $ENTRIES;
    }

    private TrackEventType(String str, int i) {
    }

    static {
        TrackEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TrackEventType valueOf(String str) {
        return (TrackEventType) Enum.valueOf(TrackEventType.class, str);
    }

    public static TrackEventType[] values() {
        return (TrackEventType[]) $VALUES.clone();
    }
}
