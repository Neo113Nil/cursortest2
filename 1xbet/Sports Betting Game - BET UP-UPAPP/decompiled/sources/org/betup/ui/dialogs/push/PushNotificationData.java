package org.betup.ui.dialogs.push;

import android.os.Bundle;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.vk.sdk.api.model.VKApiCommunityFull;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.local.entity.Event;
import org.betup.model.local.entity.NotificationType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PushNotificationData.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u000b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "title", "", "getTitle", "()Ljava/lang/String;", "body", "getBody", UnifiedMediationParams.KEY_ICON_URL, "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "ChallengeAccepted", "ChallengeResult", "PrivateChallengeInvite", "BetResult", "CompetitionResult", "AchievementUnlocked", "MatchNotification", "SupportMessage", "Info", "DailyQuest", "Reward", VastTagName.COMPANION, "Lorg/betup/ui/dialogs/push/PushNotificationData$AchievementUnlocked;", "Lorg/betup/ui/dialogs/push/PushNotificationData$BetResult;", "Lorg/betup/ui/dialogs/push/PushNotificationData$ChallengeAccepted;", "Lorg/betup/ui/dialogs/push/PushNotificationData$ChallengeResult;", "Lorg/betup/ui/dialogs/push/PushNotificationData$CompetitionResult;", "Lorg/betup/ui/dialogs/push/PushNotificationData$DailyQuest;", "Lorg/betup/ui/dialogs/push/PushNotificationData$Info;", "Lorg/betup/ui/dialogs/push/PushNotificationData$MatchNotification;", "Lorg/betup/ui/dialogs/push/PushNotificationData$PrivateChallengeInvite;", "Lorg/betup/ui/dialogs/push/PushNotificationData$Reward;", "Lorg/betup/ui/dialogs/push/PushNotificationData$SupportMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PushNotificationData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long PRIVATE_CHALLENGE_PLAYER_COUNT = 2;

    public /* synthetic */ PushNotificationData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getBody();

    public abstract String getIconUrl();

    public abstract NotificationType getNotificationType();

    public abstract String getTitle();

    private PushNotificationData() {
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$ChallengeAccepted;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "challengeId", "", "title", "", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallengeId", "()I", "getTitle", "()Ljava/lang/String;", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChallengeAccepted extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final int challengeId;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final String title;

        public static /* synthetic */ ChallengeAccepted copy$default(ChallengeAccepted challengeAccepted, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = challengeAccepted.challengeId;
            }
            if ((i2 & 2) != 0) {
                str = challengeAccepted.title;
            }
            if ((i2 & 4) != 0) {
                str2 = challengeAccepted.body;
            }
            if ((i2 & 8) != 0) {
                str3 = challengeAccepted.iconUrl;
            }
            return challengeAccepted.copy(i, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final ChallengeAccepted copy(int challengeId, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new ChallengeAccepted(challengeId, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChallengeAccepted)) {
                return false;
            }
            ChallengeAccepted challengeAccepted = (ChallengeAccepted) other;
            return this.challengeId == challengeAccepted.challengeId && Intrinsics.areEqual(this.title, challengeAccepted.title) && Intrinsics.areEqual(this.body, challengeAccepted.body) && Intrinsics.areEqual(this.iconUrl, challengeAccepted.iconUrl);
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.challengeId) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ChallengeAccepted(challengeId=" + this.challengeId + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ ChallengeAccepted(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i2 & 8) != 0 ? null : str3);
        }

        public final int getChallengeId() {
            return this.challengeId;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeAccepted(int i, String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.challengeId = i;
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.CHALLENGE_ACCEPT;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$ChallengeResult;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "challengeId", "", "title", "", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallengeId", "()I", "getTitle", "()Ljava/lang/String;", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChallengeResult extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final int challengeId;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final String title;

        public static /* synthetic */ ChallengeResult copy$default(ChallengeResult challengeResult, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = challengeResult.challengeId;
            }
            if ((i2 & 2) != 0) {
                str = challengeResult.title;
            }
            if ((i2 & 4) != 0) {
                str2 = challengeResult.body;
            }
            if ((i2 & 8) != 0) {
                str3 = challengeResult.iconUrl;
            }
            return challengeResult.copy(i, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final ChallengeResult copy(int challengeId, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new ChallengeResult(challengeId, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChallengeResult)) {
                return false;
            }
            ChallengeResult challengeResult = (ChallengeResult) other;
            return this.challengeId == challengeResult.challengeId && Intrinsics.areEqual(this.title, challengeResult.title) && Intrinsics.areEqual(this.body, challengeResult.body) && Intrinsics.areEqual(this.iconUrl, challengeResult.iconUrl);
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.challengeId) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ChallengeResult(challengeId=" + this.challengeId + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ ChallengeResult(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i2 & 8) != 0 ? null : str3);
        }

        public final int getChallengeId() {
            return this.challengeId;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeResult(int i, String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.challengeId = i;
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.CHALLENGE;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$PrivateChallengeInvite;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "challengeId", "", "buyIn", "", "potentialWin", "title", "", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallengeId", "()I", "getBuyIn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPotentialWin", "getTitle", "()Ljava/lang/String;", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/ui/dialogs/push/PushNotificationData$PrivateChallengeInvite;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrivateChallengeInvite extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final Long buyIn;
        private final int challengeId;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final Long potentialWin;
        private final String title;

        public static /* synthetic */ PrivateChallengeInvite copy$default(PrivateChallengeInvite privateChallengeInvite, int i, Long l, Long l2, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = privateChallengeInvite.challengeId;
            }
            if ((i2 & 2) != 0) {
                l = privateChallengeInvite.buyIn;
            }
            Long l3 = l;
            if ((i2 & 4) != 0) {
                l2 = privateChallengeInvite.potentialWin;
            }
            Long l4 = l2;
            if ((i2 & 8) != 0) {
                str = privateChallengeInvite.title;
            }
            String str4 = str;
            if ((i2 & 16) != 0) {
                str2 = privateChallengeInvite.body;
            }
            String str5 = str2;
            if ((i2 & 32) != 0) {
                str3 = privateChallengeInvite.iconUrl;
            }
            return privateChallengeInvite.copy(i, l3, l4, str4, str5, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getBuyIn() {
            return this.buyIn;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getPotentialWin() {
            return this.potentialWin;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component6, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final PrivateChallengeInvite copy(int challengeId, Long buyIn, Long potentialWin, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new PrivateChallengeInvite(challengeId, buyIn, potentialWin, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrivateChallengeInvite)) {
                return false;
            }
            PrivateChallengeInvite privateChallengeInvite = (PrivateChallengeInvite) other;
            return this.challengeId == privateChallengeInvite.challengeId && Intrinsics.areEqual(this.buyIn, privateChallengeInvite.buyIn) && Intrinsics.areEqual(this.potentialWin, privateChallengeInvite.potentialWin) && Intrinsics.areEqual(this.title, privateChallengeInvite.title) && Intrinsics.areEqual(this.body, privateChallengeInvite.body) && Intrinsics.areEqual(this.iconUrl, privateChallengeInvite.iconUrl);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.challengeId) * 31;
            Long l = this.buyIn;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.potentialWin;
            int hashCode3 = (((((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "PrivateChallengeInvite(challengeId=" + this.challengeId + ", buyIn=" + this.buyIn + ", potentialWin=" + this.potentialWin + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ PrivateChallengeInvite(int i, Long l, Long l2, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, str, str2, (i2 & 32) != 0 ? null : str3);
        }

        public final int getChallengeId() {
            return this.challengeId;
        }

        public final Long getBuyIn() {
            return this.buyIn;
        }

        public final Long getPotentialWin() {
            return this.potentialWin;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivateChallengeInvite(int i, Long l, Long l2, String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.challengeId = i;
            this.buyIn = l;
            this.potentialWin = l2;
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.CHALLENGE_PRIVATE;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$BetResult;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "betlistId", "", "betState", "price", "", "title", "", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBetlistId", "()I", "getBetState", "getPrice", "()J", "getTitle", "()Ljava/lang/String;", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BetResult extends PushNotificationData {
        public static final int $stable = 0;
        private final int betState;
        private final int betlistId;
        private final String body;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final long price;
        private final String title;

        public static /* synthetic */ BetResult copy$default(BetResult betResult, int i, int i2, long j, String str, String str2, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = betResult.betlistId;
            }
            if ((i3 & 2) != 0) {
                i2 = betResult.betState;
            }
            int i4 = i2;
            if ((i3 & 4) != 0) {
                j = betResult.price;
            }
            long j2 = j;
            if ((i3 & 8) != 0) {
                str = betResult.title;
            }
            String str4 = str;
            if ((i3 & 16) != 0) {
                str2 = betResult.body;
            }
            String str5 = str2;
            if ((i3 & 32) != 0) {
                str3 = betResult.iconUrl;
            }
            return betResult.copy(i, i4, j2, str4, str5, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getBetlistId() {
            return this.betlistId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBetState() {
            return this.betState;
        }

        /* renamed from: component3, reason: from getter */
        public final long getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component6, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final BetResult copy(int betlistId, int betState, long price, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new BetResult(betlistId, betState, price, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BetResult)) {
                return false;
            }
            BetResult betResult = (BetResult) other;
            return this.betlistId == betResult.betlistId && this.betState == betResult.betState && this.price == betResult.price && Intrinsics.areEqual(this.title, betResult.title) && Intrinsics.areEqual(this.body, betResult.body) && Intrinsics.areEqual(this.iconUrl, betResult.iconUrl);
        }

        public int hashCode() {
            int hashCode = ((((((((Integer.hashCode(this.betlistId) * 31) + Integer.hashCode(this.betState)) * 31) + Long.hashCode(this.price)) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "BetResult(betlistId=" + this.betlistId + ", betState=" + this.betState + ", price=" + this.price + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ BetResult(int i, int i2, long j, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, j, str, str2, (i3 & 32) != 0 ? null : str3);
        }

        public final int getBetlistId() {
            return this.betlistId;
        }

        public final int getBetState() {
            return this.betState;
        }

        public final long getPrice() {
            return this.price;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BetResult(int i, int i2, long j, String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.betlistId = i;
            this.betState = i2;
            this.price = j;
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.BET;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$CompetitionResult;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "competitionId", "", "participantId", "state", "", "title", "", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompetitionId", "()J", "getParticipantId", "getState", "()I", "getTitle", "()Ljava/lang/String;", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CompetitionResult extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final long competitionId;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final long participantId;
        private final int state;
        private final String title;

        /* renamed from: component1, reason: from getter */
        public final long getCompetitionId() {
            return this.competitionId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getParticipantId() {
            return this.participantId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component6, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final CompetitionResult copy(long competitionId, long participantId, int state, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new CompetitionResult(competitionId, participantId, state, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompetitionResult)) {
                return false;
            }
            CompetitionResult competitionResult = (CompetitionResult) other;
            return this.competitionId == competitionResult.competitionId && this.participantId == competitionResult.participantId && this.state == competitionResult.state && Intrinsics.areEqual(this.title, competitionResult.title) && Intrinsics.areEqual(this.body, competitionResult.body) && Intrinsics.areEqual(this.iconUrl, competitionResult.iconUrl);
        }

        public int hashCode() {
            int hashCode = ((((((((Long.hashCode(this.competitionId) * 31) + Long.hashCode(this.participantId)) * 31) + Integer.hashCode(this.state)) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CompetitionResult(competitionId=" + this.competitionId + ", participantId=" + this.participantId + ", state=" + this.state + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ CompetitionResult(long j, long j2, int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, i, str, str2, (i2 & 32) != 0 ? null : str3);
        }

        public final long getCompetitionId() {
            return this.competitionId;
        }

        public final long getParticipantId() {
            return this.participantId;
        }

        public final int getState() {
            return this.state;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompetitionResult(long j, long j2, int i, String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.competitionId = j;
            this.participantId = j2;
            this.state = i;
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.COMPETITION;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$AchievementUnlocked;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "achievementId", "", "achievementName", "", "achievementDesc", "price", "title", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAchievementId", "()I", "getAchievementName", "()Ljava/lang/String;", "getAchievementDesc", "getPrice", "getTitle", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AchievementUnlocked extends PushNotificationData {
        public static final int $stable = 0;
        private final String achievementDesc;
        private final int achievementId;
        private final String achievementName;
        private final String body;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final int price;
        private final String title;

        public static /* synthetic */ AchievementUnlocked copy$default(AchievementUnlocked achievementUnlocked, int i, String str, String str2, int i2, String str3, String str4, String str5, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = achievementUnlocked.achievementId;
            }
            if ((i3 & 2) != 0) {
                str = achievementUnlocked.achievementName;
            }
            String str6 = str;
            if ((i3 & 4) != 0) {
                str2 = achievementUnlocked.achievementDesc;
            }
            String str7 = str2;
            if ((i3 & 8) != 0) {
                i2 = achievementUnlocked.price;
            }
            int i4 = i2;
            if ((i3 & 16) != 0) {
                str3 = achievementUnlocked.title;
            }
            String str8 = str3;
            if ((i3 & 32) != 0) {
                str4 = achievementUnlocked.body;
            }
            String str9 = str4;
            if ((i3 & 64) != 0) {
                str5 = achievementUnlocked.iconUrl;
            }
            return achievementUnlocked.copy(i, str6, str7, i4, str8, str9, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAchievementId() {
            return this.achievementId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAchievementName() {
            return this.achievementName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAchievementDesc() {
            return this.achievementDesc;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPrice() {
            return this.price;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component7, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final AchievementUnlocked copy(int achievementId, String achievementName, String achievementDesc, int price, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(achievementName, "achievementName");
            Intrinsics.checkNotNullParameter(achievementDesc, "achievementDesc");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new AchievementUnlocked(achievementId, achievementName, achievementDesc, price, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AchievementUnlocked)) {
                return false;
            }
            AchievementUnlocked achievementUnlocked = (AchievementUnlocked) other;
            return this.achievementId == achievementUnlocked.achievementId && Intrinsics.areEqual(this.achievementName, achievementUnlocked.achievementName) && Intrinsics.areEqual(this.achievementDesc, achievementUnlocked.achievementDesc) && this.price == achievementUnlocked.price && Intrinsics.areEqual(this.title, achievementUnlocked.title) && Intrinsics.areEqual(this.body, achievementUnlocked.body) && Intrinsics.areEqual(this.iconUrl, achievementUnlocked.iconUrl);
        }

        public int hashCode() {
            int hashCode = ((((((((((Integer.hashCode(this.achievementId) * 31) + this.achievementName.hashCode()) * 31) + this.achievementDesc.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AchievementUnlocked(achievementId=" + this.achievementId + ", achievementName=" + this.achievementName + ", achievementDesc=" + this.achievementDesc + ", price=" + this.price + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ AchievementUnlocked(int i, String str, String str2, int i2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, i2, str3, str4, (i3 & 64) != 0 ? null : str5);
        }

        public final int getAchievementId() {
            return this.achievementId;
        }

        public final String getAchievementName() {
            return this.achievementName;
        }

        public final String getAchievementDesc() {
            return this.achievementDesc;
        }

        public final int getPrice() {
            return this.price;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AchievementUnlocked(int i, String achievementName, String achievementDesc, int i2, String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(achievementName, "achievementName");
            Intrinsics.checkNotNullParameter(achievementDesc, "achievementDesc");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.achievementId = i;
            this.achievementName = achievementName;
            this.achievementDesc = achievementDesc;
            this.price = i2;
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.ACHIEVEMENT;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$MatchNotification;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "matchId", "", "title", "", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()I", "getTitle", "()Ljava/lang/String;", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchNotification extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final String iconUrl;
        private final int matchId;
        private final NotificationType notificationType;
        private final String title;

        public static /* synthetic */ MatchNotification copy$default(MatchNotification matchNotification, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = matchNotification.matchId;
            }
            if ((i2 & 2) != 0) {
                str = matchNotification.title;
            }
            if ((i2 & 4) != 0) {
                str2 = matchNotification.body;
            }
            if ((i2 & 8) != 0) {
                str3 = matchNotification.iconUrl;
            }
            return matchNotification.copy(i, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMatchId() {
            return this.matchId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final MatchNotification copy(int matchId, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new MatchNotification(matchId, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchNotification)) {
                return false;
            }
            MatchNotification matchNotification = (MatchNotification) other;
            return this.matchId == matchNotification.matchId && Intrinsics.areEqual(this.title, matchNotification.title) && Intrinsics.areEqual(this.body, matchNotification.body) && Intrinsics.areEqual(this.iconUrl, matchNotification.iconUrl);
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.matchId) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MatchNotification(matchId=" + this.matchId + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ MatchNotification(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i2 & 8) != 0 ? null : str3);
        }

        public final int getMatchId() {
            return this.matchId;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchNotification(int i, String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.matchId = i;
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.MATCH;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$SupportMessage;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "chatId", "", "title", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getTitle", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SupportMessage extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final String chatId;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final String title;

        public static /* synthetic */ SupportMessage copy$default(SupportMessage supportMessage, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = supportMessage.chatId;
            }
            if ((i & 2) != 0) {
                str2 = supportMessage.title;
            }
            if ((i & 4) != 0) {
                str3 = supportMessage.body;
            }
            if ((i & 8) != 0) {
                str4 = supportMessage.iconUrl;
            }
            return supportMessage.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final SupportMessage copy(String chatId, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new SupportMessage(chatId, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportMessage)) {
                return false;
            }
            SupportMessage supportMessage = (SupportMessage) other;
            return Intrinsics.areEqual(this.chatId, supportMessage.chatId) && Intrinsics.areEqual(this.title, supportMessage.title) && Intrinsics.areEqual(this.body, supportMessage.body) && Intrinsics.areEqual(this.iconUrl, supportMessage.iconUrl);
        }

        public int hashCode() {
            String str = this.chatId;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str2 = this.iconUrl;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SupportMessage(chatId=" + this.chatId + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ SupportMessage(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4);
        }

        public final String getChatId() {
            return this.chatId;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportMessage(String str, String title, String body, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.chatId = str;
            this.title = title;
            this.body = body;
            this.iconUrl = str2;
            this.notificationType = NotificationType.SUPPORT;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$Info;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "title", "", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final String title;

        public static /* synthetic */ Info copy$default(Info info, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = info.title;
            }
            if ((i & 2) != 0) {
                str2 = info.body;
            }
            if ((i & 4) != 0) {
                str3 = info.iconUrl;
            }
            return info.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final Info copy(String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new Info(title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.areEqual(this.title, info.title) && Intrinsics.areEqual(this.body, info.body) && Intrinsics.areEqual(this.iconUrl, info.iconUrl);
        }

        public int hashCode() {
            int hashCode = ((this.title.hashCode() * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Info(title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ Info(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Info(String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.INFO;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$DailyQuest;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "questId", "", "showClaimAction", "", "title", "body", UnifiedMediationParams.KEY_ICON_URL, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuestId", "()Ljava/lang/String;", "getShowClaimAction", "()Z", "getTitle", "getBody", "getIconUrl", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DailyQuest extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final String questId;
        private final boolean showClaimAction;
        private final String title;

        public static /* synthetic */ DailyQuest copy$default(DailyQuest dailyQuest, String str, boolean z, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dailyQuest.questId;
            }
            if ((i & 2) != 0) {
                z = dailyQuest.showClaimAction;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                str2 = dailyQuest.title;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = dailyQuest.body;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = dailyQuest.iconUrl;
            }
            return dailyQuest.copy(str, z2, str5, str6, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuestId() {
            return this.questId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowClaimAction() {
            return this.showClaimAction;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final DailyQuest copy(String questId, boolean showClaimAction, String title, String body, String iconUrl) {
            Intrinsics.checkNotNullParameter(questId, "questId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new DailyQuest(questId, showClaimAction, title, body, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyQuest)) {
                return false;
            }
            DailyQuest dailyQuest = (DailyQuest) other;
            return Intrinsics.areEqual(this.questId, dailyQuest.questId) && this.showClaimAction == dailyQuest.showClaimAction && Intrinsics.areEqual(this.title, dailyQuest.title) && Intrinsics.areEqual(this.body, dailyQuest.body) && Intrinsics.areEqual(this.iconUrl, dailyQuest.iconUrl);
        }

        public int hashCode() {
            int hashCode = ((((((this.questId.hashCode() * 31) + Boolean.hashCode(this.showClaimAction)) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DailyQuest(questId=" + this.questId + ", showClaimAction=" + this.showClaimAction + ", title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ DailyQuest(String str, boolean z, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2, str3, (i & 16) != 0 ? null : str4);
        }

        public final String getQuestId() {
            return this.questId;
        }

        public final boolean getShowClaimAction() {
            return this.showClaimAction;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DailyQuest(String questId, boolean z, String title, String body, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(questId, "questId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.questId = questId;
            this.showClaimAction = z;
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.notificationType = NotificationType.INFO;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J^\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$Reward;", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "title", "", "body", UnifiedMediationParams.KEY_ICON_URL, VKApiCommunityFull.PLACE, "", "won", "", "price", TypedValues.CycleType.S_WAVE_PERIOD, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getIconUrl", "getPlace", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWon", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPrice", "getPeriod", "notificationType", "Lorg/betup/model/local/entity/NotificationType;", "getNotificationType", "()Lorg/betup/model/local/entity/NotificationType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lorg/betup/ui/dialogs/push/PushNotificationData$Reward;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Reward extends PushNotificationData {
        public static final int $stable = 0;
        private final String body;
        private final String iconUrl;
        private final NotificationType notificationType;
        private final String period;
        private final Integer place;
        private final Long price;
        private final String title;
        private final Long won;

        public static /* synthetic */ Reward copy$default(Reward reward, String str, String str2, String str3, Integer num, Long l, Long l2, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reward.title;
            }
            if ((i & 2) != 0) {
                str2 = reward.body;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = reward.iconUrl;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                num = reward.place;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                l = reward.won;
            }
            Long l3 = l;
            if ((i & 32) != 0) {
                l2 = reward.price;
            }
            Long l4 = l2;
            if ((i & 64) != 0) {
                str4 = reward.period;
            }
            return reward.copy(str, str5, str6, num2, l3, l4, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getPlace() {
            return this.place;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getWon() {
            return this.won;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getPrice() {
            return this.price;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPeriod() {
            return this.period;
        }

        public final Reward copy(String title, String body, String iconUrl, Integer place, Long won, Long price, String period) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new Reward(title, body, iconUrl, place, won, price, period);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reward)) {
                return false;
            }
            Reward reward = (Reward) other;
            return Intrinsics.areEqual(this.title, reward.title) && Intrinsics.areEqual(this.body, reward.body) && Intrinsics.areEqual(this.iconUrl, reward.iconUrl) && Intrinsics.areEqual(this.place, reward.place) && Intrinsics.areEqual(this.won, reward.won) && Intrinsics.areEqual(this.price, reward.price) && Intrinsics.areEqual(this.period, reward.period);
        }

        public int hashCode() {
            int hashCode = ((this.title.hashCode() * 31) + this.body.hashCode()) * 31;
            String str = this.iconUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.place;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.won;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.price;
            int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str2 = this.period;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Reward(title=" + this.title + ", body=" + this.body + ", iconUrl=" + this.iconUrl + ", place=" + this.place + ", won=" + this.won + ", price=" + this.price + ", period=" + this.period + ")";
        }

        public /* synthetic */ Reward(String str, String str2, String str3, Integer num, Long l, Long l2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : str4);
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getBody() {
            return this.body;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public String getIconUrl() {
            return this.iconUrl;
        }

        public final Integer getPlace() {
            return this.place;
        }

        public final Long getWon() {
            return this.won;
        }

        public final Long getPrice() {
            return this.price;
        }

        public final String getPeriod() {
            return this.period;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reward(String title, String body, String str, Integer num, Long l, Long l2, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.title = title;
            this.body = body;
            this.iconUrl = str;
            this.place = num;
            this.won = l;
            this.price = l2;
            this.period = str2;
            this.notificationType = NotificationType.REWARD;
        }

        @Override // org.betup.ui.dialogs.push.PushNotificationData
        public NotificationType getNotificationType() {
            return this.notificationType;
        }
    }

    /* compiled from: PushNotificationData.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ-\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationData$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "fromBundle", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "bundle", "Landroid/os/Bundle;", "fromEvent", "event", "Lorg/betup/model/local/entity/Event;", "resolveChallengeInviteBuyInFromParams", "", "params", "", "", "prizePool", "(Ljava/util/Map;Ljava/lang/Long;)Ljava/lang/Long;", "resolveChallengeInviteBuyIn", "(Landroid/os/Bundle;Ljava/lang/Long;)Ljava/lang/Long;", "PRIVATE_CHALLENGE_PLAYER_COUNT", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: PushNotificationData.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NotificationType.values().length];
                try {
                    iArr[NotificationType.CHALLENGE_ACCEPT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NotificationType.CHALLENGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NotificationType.CHALLENGE_PRICE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[NotificationType.CHALLENGE_PRIVATE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[NotificationType.BET.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[NotificationType.COMPETITION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[NotificationType.ACHIEVEMENT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[NotificationType.MATCH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[NotificationType.MATCH_FINISHED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[NotificationType.MATCH_SCORE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[NotificationType.SUPPORT.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[NotificationType.MESSAGE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[NotificationType.REWARD.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[NotificationType.INFO.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PushNotificationData fromBundle(Bundle bundle) {
            Integer intOrNull;
            Integer intOrNull2;
            Integer intOrNull3;
            Long longOrNull;
            Companion companion;
            Long l;
            Integer intOrNull4;
            BetResult betResult;
            Long longOrNull2;
            Integer intOrNull5;
            Long longOrNull3;
            Integer intOrNull6;
            Long longOrNull4;
            Integer intOrNull7;
            Integer intOrNull8;
            Integer intOrNull9;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("type");
            if (string == null) {
                return null;
            }
            NotificationType fromString = NotificationType.fromString(string);
            String string2 = bundle.getString("title");
            if (string2 == null && (string2 = bundle.getString("name")) == null) {
                string2 = "";
            }
            String string3 = bundle.getString("body");
            String str = (string3 == null && (string3 = bundle.getString("desc")) == null) ? "" : string3;
            String string4 = bundle.getString(UnifiedMediationParams.KEY_ICON_URL);
            if (string4 == null) {
                string4 = bundle.getString("img");
            }
            String str2 = string4;
            String string5 = bundle.getString("dailyQuestId");
            if (string5 != null) {
                String str3 = !StringsKt.isBlank(string5) ? string5 : null;
                if (str3 != null) {
                    return new DailyQuest(str3, Intrinsics.areEqual(bundle.getString("dailyQuestClaimable"), "true"), string2, str, str2);
                }
            }
            int i = 0;
            switch (fromString == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()]) {
                case 1:
                    String string6 = bundle.getString("id");
                    if (string6 == null || (intOrNull = StringsKt.toIntOrNull(string6)) == null) {
                        return null;
                    }
                    return new ChallengeAccepted(intOrNull.intValue(), string2, str, str2);
                case 2:
                case 3:
                    String string7 = bundle.getString("id");
                    if (string7 == null || (intOrNull2 = StringsKt.toIntOrNull(string7)) == null) {
                        return null;
                    }
                    return new ChallengeResult(intOrNull2.intValue(), string2, str, str2);
                case 4:
                    String string8 = bundle.getString("id");
                    if (string8 == null || (intOrNull3 = StringsKt.toIntOrNull(string8)) == null) {
                        return null;
                    }
                    int intValue = intOrNull3.intValue();
                    String string9 = bundle.getString("potentialWin");
                    if (string9 == null || (longOrNull = StringsKt.toLongOrNull(string9)) == null) {
                        String string10 = bundle.getString("price");
                        longOrNull = string10 != null ? StringsKt.toLongOrNull(string10) : null;
                        if (longOrNull == null) {
                            String string11 = bundle.getString("won");
                            Long longOrNull5 = string11 != null ? StringsKt.toLongOrNull(string11) : null;
                            companion = this;
                            l = longOrNull5;
                            return new PrivateChallengeInvite(intValue, companion.resolveChallengeInviteBuyIn(bundle, l), l, string2, str, str2);
                        }
                    }
                    l = longOrNull;
                    companion = this;
                    return new PrivateChallengeInvite(intValue, companion.resolveChallengeInviteBuyIn(bundle, l), l, string2, str, str2);
                case 5:
                    String string12 = bundle.getString("betlistId");
                    if (string12 != null && (intOrNull4 = StringsKt.toIntOrNull(string12)) != null) {
                        int intValue2 = intOrNull4.intValue();
                        String string13 = bundle.getString("betState");
                        int intValue3 = (string13 == null || (intOrNull5 = StringsKt.toIntOrNull(string13)) == null) ? 0 : intOrNull5.intValue();
                        String string14 = bundle.getString("price");
                        betResult = new BetResult(intValue2, intValue3, (string14 == null || (longOrNull2 = StringsKt.toLongOrNull(string14)) == null) ? 0L : longOrNull2.longValue(), string2, str, str2);
                        break;
                    } else {
                        return null;
                    }
                    break;
                case 6:
                    String string15 = bundle.getString("competitionId");
                    if (string15 != null && (longOrNull3 = StringsKt.toLongOrNull(string15)) != null) {
                        long longValue = longOrNull3.longValue();
                        String string16 = bundle.getString("participantId");
                        long longValue2 = (string16 == null || (longOrNull4 = StringsKt.toLongOrNull(string16)) == null) ? 0L : longOrNull4.longValue();
                        String string17 = bundle.getString("state");
                        if (string17 != null && (intOrNull6 = StringsKt.toIntOrNull(string17)) != null) {
                            i = intOrNull6.intValue();
                        }
                        betResult = new CompetitionResult(longValue, longValue2, i, string2, str, str2);
                        break;
                    } else {
                        return null;
                    }
                    break;
                case 7:
                    String string18 = bundle.getString("id");
                    if (string18 != null && (intOrNull7 = StringsKt.toIntOrNull(string18)) != null) {
                        int intValue4 = intOrNull7.intValue();
                        String string19 = bundle.getString("name");
                        String str4 = string19 == null ? "" : string19;
                        String string20 = bundle.getString("desc");
                        String str5 = string20 == null ? "" : string20;
                        String string21 = bundle.getString("price");
                        betResult = new AchievementUnlocked(intValue4, str4, str5, (string21 == null || (intOrNull8 = StringsKt.toIntOrNull(string21)) == null) ? 0 : intOrNull8.intValue(), string2, str, str2);
                        break;
                    } else {
                        return null;
                    }
                case 8:
                case 9:
                case 10:
                    String string22 = bundle.getString("id");
                    if (string22 != null && (intOrNull9 = StringsKt.toIntOrNull(string22)) != null) {
                        betResult = new MatchNotification(intOrNull9.intValue(), string2, str, str2);
                        break;
                    } else {
                        return null;
                    }
                case 11:
                    betResult = new SupportMessage(bundle.getString("chatId"), string2, str, str2);
                    break;
                case 12:
                    String string23 = bundle.getString("chatId");
                    if (string23 != null) {
                        betResult = new SupportMessage(string23, string2, str, str2);
                        break;
                    } else {
                        betResult = new Info(string2, str, str2);
                        break;
                    }
                case 13:
                    String string24 = bundle.getString(VKApiCommunityFull.PLACE);
                    Integer intOrNull10 = string24 != null ? StringsKt.toIntOrNull(string24) : null;
                    String string25 = bundle.getString("won");
                    Long longOrNull6 = string25 != null ? StringsKt.toLongOrNull(string25) : null;
                    String string26 = bundle.getString("price");
                    Long longOrNull7 = string26 != null ? StringsKt.toLongOrNull(string26) : null;
                    String string27 = bundle.getString(TypedValues.CycleType.S_WAVE_PERIOD);
                    betResult = new Reward(string2, str, str2, intOrNull10, longOrNull6, longOrNull7, string27 == null ? bundle.getString("periodType") : string27);
                    break;
                case 14:
                    betResult = new Info(string2, str, str2);
                    break;
                default:
                    return new Info(string2, str, str2);
            }
            return betResult;
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x02d3  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x033d  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x034c  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x03b3  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x03c1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final PushNotificationData fromEvent(Event event) {
            Integer intOrNull;
            Integer intOrNull2;
            Integer intOrNull3;
            Long longOrNull;
            Long longOrNull2;
            Integer intOrNull4;
            int intValue;
            Long longOrNull3;
            Integer intOrNull5;
            Long longOrNull4;
            Integer intOrNull6;
            Long longOrNull5;
            Integer intOrNull7;
            Integer intOrNull8;
            Integer intOrNull9;
            Intrinsics.checkNotNullParameter(event, "event");
            NotificationType type = event.getType();
            Integer num = null;
            Integer intOrNull10 = null;
            if (type == null) {
                return null;
            }
            String title = event.getTitle();
            if (title == null) {
                title = "";
            }
            String body = event.getBody();
            String str = body != null ? body : "";
            Map<String, String> paramsAsMap = event.getParamsAsMap();
            String str2 = paramsAsMap.get(UnifiedMediationParams.KEY_ICON_URL);
            if (str2 == null && (str2 = paramsAsMap.get("img")) == null) {
                str2 = paramsAsMap.get("photoUrl");
            }
            String str3 = str2;
            Log.d("PushNotificationData", "fromEvent - type: " + type + ", title: " + title + ", params: " + paramsAsMap);
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    String str4 = paramsAsMap.get("id");
                    if (str4 == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) {
                        String str5 = paramsAsMap.get("challengeId");
                        intOrNull = str5 != null ? StringsKt.toIntOrNull(str5) : null;
                        if (intOrNull == null) {
                            String str6 = paramsAsMap.get("challenge_id");
                            intOrNull = str6 != null ? StringsKt.toIntOrNull(str6) : null;
                            if (intOrNull == null) {
                                String str7 = paramsAsMap.get("battleId");
                                if (str7 != null) {
                                    num = StringsKt.toIntOrNull(str7);
                                }
                                Log.d("PushNotificationData", "CHALLENGE_ACCEPT - params: " + paramsAsMap + ", resolved id: " + num);
                                if (num != null) {
                                    Log.w("PushNotificationData", "CHALLENGE_ACCEPT has no ID, creating Info notification instead");
                                    return new Info(title, str, str3);
                                }
                                return new ChallengeAccepted(num.intValue(), title, str, str3);
                            }
                        }
                    }
                    num = intOrNull;
                    Log.d("PushNotificationData", "CHALLENGE_ACCEPT - params: " + paramsAsMap + ", resolved id: " + num);
                    if (num != null) {
                    }
                    break;
                case 2:
                case 3:
                    String str8 = paramsAsMap.get("id");
                    if (str8 == null || (intOrNull2 = StringsKt.toIntOrNull(str8)) == null) {
                        String str9 = paramsAsMap.get("challengeId");
                        intOrNull2 = str9 != null ? StringsKt.toIntOrNull(str9) : null;
                        if (intOrNull2 == null) {
                            String str10 = paramsAsMap.get("challenge_id");
                            intOrNull2 = str10 != null ? StringsKt.toIntOrNull(str10) : null;
                            if (intOrNull2 == null) {
                                String str11 = paramsAsMap.get("battleId");
                                if (str11 != null) {
                                    intOrNull10 = StringsKt.toIntOrNull(str11);
                                }
                                Log.d("PushNotificationData", "CHALLENGE - params: " + paramsAsMap + ", resolved id: " + intOrNull10);
                                if (intOrNull10 != null) {
                                    Log.w("PushNotificationData", "CHALLENGE has no ID, creating Info notification instead");
                                    return new Info(title, str, str3);
                                }
                                return new ChallengeResult(intOrNull10.intValue(), title, str, str3);
                            }
                        }
                    }
                    intOrNull10 = intOrNull2;
                    Log.d("PushNotificationData", "CHALLENGE - params: " + paramsAsMap + ", resolved id: " + intOrNull10);
                    if (intOrNull10 != null) {
                    }
                    break;
                case 4:
                    String str12 = paramsAsMap.get("id");
                    if (str12 == null || (intOrNull3 = StringsKt.toIntOrNull(str12)) == null) {
                        String str13 = paramsAsMap.get("challengeId");
                        intOrNull3 = str13 != null ? StringsKt.toIntOrNull(str13) : null;
                        if (intOrNull3 == null) {
                            String str14 = paramsAsMap.get("challenge_id");
                            intOrNull3 = str14 != null ? StringsKt.toIntOrNull(str14) : null;
                            if (intOrNull3 == null) {
                                String str15 = paramsAsMap.get("battleId");
                                intOrNull3 = str15 != null ? StringsKt.toIntOrNull(str15) : null;
                            }
                        }
                    }
                    String str16 = paramsAsMap.get("potentialWin");
                    if (str16 == null || (longOrNull = StringsKt.toLongOrNull(str16)) == null) {
                        String str17 = paramsAsMap.get("price");
                        longOrNull = str17 != null ? StringsKt.toLongOrNull(str17) : null;
                        if (longOrNull == null) {
                            String str18 = paramsAsMap.get("won");
                            longOrNull2 = str18 != null ? StringsKt.toLongOrNull(str18) : null;
                            Intrinsics.checkNotNull(paramsAsMap);
                            Long resolveChallengeInviteBuyInFromParams = resolveChallengeInviteBuyInFromParams(paramsAsMap, longOrNull2);
                            Log.d("PushNotificationData", "CHALLENGE_PRIVATE - params: " + paramsAsMap + ", resolved id: " + intOrNull3 + ", buyIn: " + resolveChallengeInviteBuyInFromParams + ", prizePool: " + longOrNull2);
                            if (intOrNull3 != null) {
                                Log.w("PushNotificationData", "CHALLENGE_PRIVATE has no ID, creating Info notification instead");
                                return new Info(title, str, str3);
                            }
                            return new PrivateChallengeInvite(intOrNull3.intValue(), resolveChallengeInviteBuyInFromParams, longOrNull2, title, str, str3);
                        }
                    }
                    longOrNull2 = longOrNull;
                    Intrinsics.checkNotNull(paramsAsMap);
                    Long resolveChallengeInviteBuyInFromParams2 = resolveChallengeInviteBuyInFromParams(paramsAsMap, longOrNull2);
                    Log.d("PushNotificationData", "CHALLENGE_PRIVATE - params: " + paramsAsMap + ", resolved id: " + intOrNull3 + ", buyIn: " + resolveChallengeInviteBuyInFromParams2 + ", prizePool: " + longOrNull2);
                    if (intOrNull3 != null) {
                    }
                    break;
                case 5:
                    String str19 = paramsAsMap.get("betlistId");
                    if (str19 == null || (intOrNull4 = StringsKt.toIntOrNull(str19)) == null) {
                        return null;
                    }
                    int intValue2 = intOrNull4.intValue();
                    String str20 = paramsAsMap.get("betState");
                    if (str20 == null || (intOrNull5 = StringsKt.toIntOrNull(str20)) == null) {
                        String str21 = paramsAsMap.get("state");
                        Integer intOrNull11 = str21 != null ? StringsKt.toIntOrNull(str21) : null;
                        intValue = intOrNull11 != null ? intOrNull11.intValue() : 0;
                    } else {
                        intValue = intOrNull5.intValue();
                    }
                    String str22 = paramsAsMap.get("price");
                    return new BetResult(intValue2, intValue, (str22 == null || (longOrNull3 = StringsKt.toLongOrNull(str22)) == null) ? 0L : longOrNull3.longValue(), title, str, str3);
                case 6:
                    String str23 = paramsAsMap.get("competitionId");
                    if (str23 == null || (longOrNull4 = StringsKt.toLongOrNull(str23)) == null) {
                        return null;
                    }
                    long longValue = longOrNull4.longValue();
                    String str24 = paramsAsMap.get("participantId");
                    long longValue2 = (str24 == null || (longOrNull5 = StringsKt.toLongOrNull(str24)) == null) ? 0L : longOrNull5.longValue();
                    String str25 = paramsAsMap.get("state");
                    return new CompetitionResult(longValue, longValue2, (str25 == null || (intOrNull6 = StringsKt.toIntOrNull(str25)) == null) ? 0 : intOrNull6.intValue(), title, str, str3);
                case 7:
                    String str26 = paramsAsMap.get("id");
                    if (str26 == null || (intOrNull7 = StringsKt.toIntOrNull(str26)) == null) {
                        return null;
                    }
                    int intValue3 = intOrNull7.intValue();
                    String str27 = paramsAsMap.get("name");
                    if (str27 == null) {
                        str27 = title;
                    }
                    String str28 = paramsAsMap.get("desc");
                    String str29 = str28 == null ? str : str28;
                    String str30 = paramsAsMap.get("price");
                    return new AchievementUnlocked(intValue3, str27, str29, (str30 == null || (intOrNull8 = StringsKt.toIntOrNull(str30)) == null) ? 0 : intOrNull8.intValue(), title, str, str3);
                case 8:
                case 9:
                case 10:
                    String str31 = paramsAsMap.get("id");
                    if (str31 == null || (intOrNull9 = StringsKt.toIntOrNull(str31)) == null) {
                        String str32 = paramsAsMap.get("matchId");
                        intOrNull9 = str32 != null ? StringsKt.toIntOrNull(str32) : null;
                        if (intOrNull9 == null) {
                            return null;
                        }
                    }
                    return new MatchNotification(intOrNull9.intValue(), title, str, str3);
                case 11:
                    return new SupportMessage(paramsAsMap.get("chatId"), title, str, str3);
                case 12:
                default:
                    return new Info(title, str, str3);
                case 13:
                    String str33 = paramsAsMap.get(VKApiCommunityFull.PLACE);
                    Integer intOrNull12 = str33 != null ? StringsKt.toIntOrNull(str33) : null;
                    String str34 = paramsAsMap.get("won");
                    Long longOrNull6 = str34 != null ? StringsKt.toLongOrNull(str34) : null;
                    String str35 = paramsAsMap.get("price");
                    Long longOrNull7 = str35 != null ? StringsKt.toLongOrNull(str35) : null;
                    String str36 = paramsAsMap.get(TypedValues.CycleType.S_WAVE_PERIOD);
                    return new Reward(title, str, str3, intOrNull12, longOrNull6, longOrNull7, str36 == null ? paramsAsMap.get("periodType") : str36);
            }
        }

        private final Long resolveChallengeInviteBuyInFromParams(Map<String, String> params, Long prizePool) {
            Long longOrNull;
            Long longOrNull2;
            Long longOrNull3;
            String str = params.get("buyIn");
            if (str != null && (longOrNull3 = StringsKt.toLongOrNull(str)) != null) {
                if (longOrNull3.longValue() <= 0) {
                    longOrNull3 = null;
                }
                if (longOrNull3 != null) {
                    return Long.valueOf(longOrNull3.longValue());
                }
            }
            String str2 = params.get("moneyPlaced");
            if (str2 != null && (longOrNull2 = StringsKt.toLongOrNull(str2)) != null) {
                if (longOrNull2.longValue() <= 0) {
                    longOrNull2 = null;
                }
                if (longOrNull2 != null) {
                    return Long.valueOf(longOrNull2.longValue());
                }
            }
            String str3 = params.get("moneyAccept");
            if (str3 != null && (longOrNull = StringsKt.toLongOrNull(str3)) != null) {
                if (longOrNull.longValue() <= 0) {
                    longOrNull = null;
                }
                if (longOrNull != null) {
                    return Long.valueOf(longOrNull.longValue());
                }
            }
            if (prizePool == null) {
                return null;
            }
            if (prizePool.longValue() <= 0) {
                prizePool = null;
            }
            if (prizePool != null) {
                return Long.valueOf(prizePool.longValue() / 2);
            }
            return null;
        }

        private final Long resolveChallengeInviteBuyIn(Bundle bundle, Long prizePool) {
            Long longOrNull;
            Long longOrNull2;
            Long longOrNull3;
            String string = bundle.getString("buyIn");
            if (string != null && (longOrNull3 = StringsKt.toLongOrNull(string)) != null) {
                if (longOrNull3.longValue() <= 0) {
                    longOrNull3 = null;
                }
                if (longOrNull3 != null) {
                    return Long.valueOf(longOrNull3.longValue());
                }
            }
            String string2 = bundle.getString("moneyPlaced");
            if (string2 != null && (longOrNull2 = StringsKt.toLongOrNull(string2)) != null) {
                if (longOrNull2.longValue() <= 0) {
                    longOrNull2 = null;
                }
                if (longOrNull2 != null) {
                    return Long.valueOf(longOrNull2.longValue());
                }
            }
            String string3 = bundle.getString("moneyAccept");
            if (string3 != null && (longOrNull = StringsKt.toLongOrNull(string3)) != null) {
                if (longOrNull.longValue() <= 0) {
                    longOrNull = null;
                }
                if (longOrNull != null) {
                    return Long.valueOf(longOrNull.longValue());
                }
            }
            if (prizePool == null) {
                return null;
            }
            if (prizePool.longValue() <= 0) {
                prizePool = null;
            }
            if (prizePool != null) {
                return Long.valueOf(prizePool.longValue() / 2);
            }
            return null;
        }
    }
}
