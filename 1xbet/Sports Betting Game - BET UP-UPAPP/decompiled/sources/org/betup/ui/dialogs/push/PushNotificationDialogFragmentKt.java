package org.betup.ui.dialogs.push;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.provider.CredentialEntry;
import com.vk.sdk.api.model.VKApiCommunityFull;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.betup.ui.dialogs.push.PushNotificationData;

/* compiled from: PushNotificationDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toBundle", "Landroid/os/Bundle;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PushNotificationDialogFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle toBundle(PushNotificationData pushNotificationData) {
        Bundle bundle = new Bundle();
        bundle.putString("type", pushNotificationData.getNotificationType().name());
        bundle.putString("title", pushNotificationData.getTitle());
        bundle.putString("body", pushNotificationData.getBody());
        String iconUrl = pushNotificationData.getIconUrl();
        if (iconUrl != null) {
            bundle.putString(UnifiedMediationParams.KEY_ICON_URL, iconUrl);
        }
        if (pushNotificationData instanceof PushNotificationData.ChallengeAccepted) {
            bundle.putString("id", String.valueOf(((PushNotificationData.ChallengeAccepted) pushNotificationData).getChallengeId()));
        } else if (pushNotificationData instanceof PushNotificationData.ChallengeResult) {
            bundle.putString("id", String.valueOf(((PushNotificationData.ChallengeResult) pushNotificationData).getChallengeId()));
        } else if (pushNotificationData instanceof PushNotificationData.PrivateChallengeInvite) {
            PushNotificationData.PrivateChallengeInvite privateChallengeInvite = (PushNotificationData.PrivateChallengeInvite) pushNotificationData;
            bundle.putString("id", String.valueOf(privateChallengeInvite.getChallengeId()));
            Long buyIn = privateChallengeInvite.getBuyIn();
            if (buyIn != null) {
                bundle.putString("buyIn", String.valueOf(buyIn.longValue()));
            }
            Long potentialWin = privateChallengeInvite.getPotentialWin();
            if (potentialWin != null) {
                bundle.putString("potentialWin", String.valueOf(potentialWin.longValue()));
            }
        } else if (pushNotificationData instanceof PushNotificationData.BetResult) {
            PushNotificationData.BetResult betResult = (PushNotificationData.BetResult) pushNotificationData;
            bundle.putString("betlistId", String.valueOf(betResult.getBetlistId()));
            bundle.putString("betState", String.valueOf(betResult.getBetState()));
            bundle.putString("price", String.valueOf(betResult.getPrice()));
        } else if (pushNotificationData instanceof PushNotificationData.CompetitionResult) {
            PushNotificationData.CompetitionResult competitionResult = (PushNotificationData.CompetitionResult) pushNotificationData;
            bundle.putString("competitionId", String.valueOf(competitionResult.getCompetitionId()));
            bundle.putString("participantId", String.valueOf(competitionResult.getParticipantId()));
            bundle.putString("state", String.valueOf(competitionResult.getState()));
        } else if (pushNotificationData instanceof PushNotificationData.AchievementUnlocked) {
            PushNotificationData.AchievementUnlocked achievementUnlocked = (PushNotificationData.AchievementUnlocked) pushNotificationData;
            bundle.putString("id", String.valueOf(achievementUnlocked.getAchievementId()));
            bundle.putString("name", achievementUnlocked.getAchievementName());
            bundle.putString("desc", achievementUnlocked.getAchievementDesc());
            bundle.putString("price", String.valueOf(achievementUnlocked.getPrice()));
        } else if (pushNotificationData instanceof PushNotificationData.MatchNotification) {
            bundle.putString("id", String.valueOf(((PushNotificationData.MatchNotification) pushNotificationData).getMatchId()));
        } else if (pushNotificationData instanceof PushNotificationData.SupportMessage) {
            String chatId = ((PushNotificationData.SupportMessage) pushNotificationData).getChatId();
            if (chatId != null) {
                bundle.putString("chatId", chatId);
            }
        } else if (!(pushNotificationData instanceof PushNotificationData.Info)) {
            if (pushNotificationData instanceof PushNotificationData.Reward) {
                PushNotificationData.Reward reward = (PushNotificationData.Reward) pushNotificationData;
                Integer place = reward.getPlace();
                if (place != null) {
                    bundle.putString(VKApiCommunityFull.PLACE, String.valueOf(place.intValue()));
                }
                Long won = reward.getWon();
                if (won != null) {
                    bundle.putString("won", String.valueOf(won.longValue()));
                }
                Long price = reward.getPrice();
                if (price != null) {
                    bundle.putString("price", String.valueOf(price.longValue()));
                }
                String period = reward.getPeriod();
                if (period != null) {
                    bundle.putString(TypedValues.CycleType.S_WAVE_PERIOD, period);
                }
            } else {
                if (!(pushNotificationData instanceof PushNotificationData.DailyQuest)) {
                    throw new NoWhenBranchMatchedException();
                }
                PushNotificationData.DailyQuest dailyQuest = (PushNotificationData.DailyQuest) pushNotificationData;
                bundle.putString("dailyQuestId", dailyQuest.getQuestId());
                bundle.putString("dailyQuestClaimable", dailyQuest.getShowClaimAction() ? "true" : CredentialEntry.FALSE_STRING);
            }
        }
        return bundle;
    }
}
