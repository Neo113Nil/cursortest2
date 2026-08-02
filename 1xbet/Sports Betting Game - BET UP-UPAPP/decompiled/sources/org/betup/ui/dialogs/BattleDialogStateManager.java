package org.betup.ui.dialogs;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.ReturnToLastTabMessage;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.ChallengePreviewNewDialogFragment;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleDialogStateManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/dialogs/BattleDialogStateManager;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "pendingDialogState", "Lorg/betup/ui/dialogs/BattleDialogStateManager$DialogState;", "activityReference", "Lorg/betup/ui/MainActivity;", "storeDialogState", "", "state", "activity", "clearDialogState", "hasPendingDialog", "", "restorePendingDialog", "onReturnToLastTab", "message", "Lorg/betup/bus/ReturnToLastTabMessage;", "DialogState", "DialogType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BattleDialogStateManager {
    private static MainActivity activityReference;
    private static DialogState pendingDialogState;
    public static final BattleDialogStateManager INSTANCE = new BattleDialogStateManager();
    public static final int $stable = 8;

    /* compiled from: BattleDialogStateManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogType.values().length];
            try {
                iArr[DialogType.CHALLENGE_PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogType.CHALLENGE_ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BattleDialogStateManager() {
    }

    /* compiled from: BattleDialogStateManager.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J¨\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0005HÖ\u0001J\t\u0010>\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b)\u0010\u0019R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b*\u0010\u0019¨\u0006?"}, d2 = {"Lorg/betup/ui/dialogs/BattleDialogStateManager$DialogState;", "", "dialogType", "Lorg/betup/ui/dialogs/BattleDialogStateManager$DialogType;", "challengeId", "", "matchId", "", "userId", "betId", "betName", "", "groupName", "varietyName", "followerPhoto", "amount", "coefficient", "", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "leagueId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/BattleDialogStateManager$DialogType;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDialogType", "()Lorg/betup/ui/dialogs/BattleDialogStateManager$DialogType;", "getChallengeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMatchId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserId", "getBetId", "getBetName", "()Ljava/lang/String;", "getGroupName", "getVarietyName", "getFollowerPhoto", "getAmount", "getCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSportId", "getLeagueId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lorg/betup/ui/dialogs/BattleDialogStateManager$DialogType;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)Lorg/betup/ui/dialogs/BattleDialogStateManager$DialogState;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DialogState {
        public static final int $stable = 0;
        private final Long amount;
        private final Long betId;
        private final String betName;
        private final Integer challengeId;
        private final Double coefficient;
        private final DialogType dialogType;
        private final String followerPhoto;
        private final String groupName;
        private final Integer leagueId;
        private final Long matchId;
        private final Integer sportId;
        private final Long userId;
        private final String varietyName;

        /* renamed from: component1, reason: from getter */
        public final DialogType getDialogType() {
            return this.dialogType;
        }

        /* renamed from: component10, reason: from getter */
        public final Long getAmount() {
            return this.amount;
        }

        /* renamed from: component11, reason: from getter */
        public final Double getCoefficient() {
            return this.coefficient;
        }

        /* renamed from: component12, reason: from getter */
        public final Integer getSportId() {
            return this.sportId;
        }

        /* renamed from: component13, reason: from getter */
        public final Integer getLeagueId() {
            return this.leagueId;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getMatchId() {
            return this.matchId;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getUserId() {
            return this.userId;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getBetId() {
            return this.betId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBetName() {
            return this.betName;
        }

        /* renamed from: component7, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getVarietyName() {
            return this.varietyName;
        }

        /* renamed from: component9, reason: from getter */
        public final String getFollowerPhoto() {
            return this.followerPhoto;
        }

        public final DialogState copy(DialogType dialogType, Integer challengeId, Long matchId, Long userId, Long betId, String betName, String groupName, String varietyName, String followerPhoto, Long amount, Double coefficient, Integer sportId, Integer leagueId) {
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            return new DialogState(dialogType, challengeId, matchId, userId, betId, betName, groupName, varietyName, followerPhoto, amount, coefficient, sportId, leagueId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogState)) {
                return false;
            }
            DialogState dialogState = (DialogState) other;
            return this.dialogType == dialogState.dialogType && Intrinsics.areEqual(this.challengeId, dialogState.challengeId) && Intrinsics.areEqual(this.matchId, dialogState.matchId) && Intrinsics.areEqual(this.userId, dialogState.userId) && Intrinsics.areEqual(this.betId, dialogState.betId) && Intrinsics.areEqual(this.betName, dialogState.betName) && Intrinsics.areEqual(this.groupName, dialogState.groupName) && Intrinsics.areEqual(this.varietyName, dialogState.varietyName) && Intrinsics.areEqual(this.followerPhoto, dialogState.followerPhoto) && Intrinsics.areEqual(this.amount, dialogState.amount) && Intrinsics.areEqual((Object) this.coefficient, (Object) dialogState.coefficient) && Intrinsics.areEqual(this.sportId, dialogState.sportId) && Intrinsics.areEqual(this.leagueId, dialogState.leagueId);
        }

        public int hashCode() {
            int hashCode = this.dialogType.hashCode() * 31;
            Integer num = this.challengeId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.matchId;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.userId;
            int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.betId;
            int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
            String str = this.betName;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.groupName;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.varietyName;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.followerPhoto;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l4 = this.amount;
            int hashCode10 = (hashCode9 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Double d = this.coefficient;
            int hashCode11 = (hashCode10 + (d == null ? 0 : d.hashCode())) * 31;
            Integer num2 = this.sportId;
            int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.leagueId;
            return hashCode12 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            return "DialogState(dialogType=" + this.dialogType + ", challengeId=" + this.challengeId + ", matchId=" + this.matchId + ", userId=" + this.userId + ", betId=" + this.betId + ", betName=" + this.betName + ", groupName=" + this.groupName + ", varietyName=" + this.varietyName + ", followerPhoto=" + this.followerPhoto + ", amount=" + this.amount + ", coefficient=" + this.coefficient + ", sportId=" + this.sportId + ", leagueId=" + this.leagueId + ")";
        }

        public DialogState(DialogType dialogType, Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, Long l4, Double d, Integer num2, Integer num3) {
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            this.dialogType = dialogType;
            this.challengeId = num;
            this.matchId = l;
            this.userId = l2;
            this.betId = l3;
            this.betName = str;
            this.groupName = str2;
            this.varietyName = str3;
            this.followerPhoto = str4;
            this.amount = l4;
            this.coefficient = d;
            this.sportId = num2;
            this.leagueId = num3;
        }

        public /* synthetic */ DialogState(DialogType dialogType, Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, Long l4, Double d, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(dialogType, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : l4, (i & 1024) != 0 ? null : d, (i & 2048) != 0 ? null : num2, (i & 4096) == 0 ? num3 : null);
        }

        public final DialogType getDialogType() {
            return this.dialogType;
        }

        public final Integer getChallengeId() {
            return this.challengeId;
        }

        public final Long getMatchId() {
            return this.matchId;
        }

        public final Long getUserId() {
            return this.userId;
        }

        public final Long getBetId() {
            return this.betId;
        }

        public final String getBetName() {
            return this.betName;
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public final String getVarietyName() {
            return this.varietyName;
        }

        public final String getFollowerPhoto() {
            return this.followerPhoto;
        }

        public final Long getAmount() {
            return this.amount;
        }

        public final Double getCoefficient() {
            return this.coefficient;
        }

        public final Integer getSportId() {
            return this.sportId;
        }

        public final Integer getLeagueId() {
            return this.leagueId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BattleDialogStateManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/dialogs/BattleDialogStateManager$DialogType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "CHALLENGE_PREVIEW", "CHALLENGE_ACCEPT", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DialogType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DialogType[] $VALUES;
        public static final DialogType CHALLENGE_PREVIEW = new DialogType("CHALLENGE_PREVIEW", 0);
        public static final DialogType CHALLENGE_ACCEPT = new DialogType("CHALLENGE_ACCEPT", 1);

        private static final /* synthetic */ DialogType[] $values() {
            return new DialogType[]{CHALLENGE_PREVIEW, CHALLENGE_ACCEPT};
        }

        public static EnumEntries<DialogType> getEntries() {
            return $ENTRIES;
        }

        private DialogType(String str, int i) {
        }

        static {
            DialogType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static DialogType valueOf(String str) {
            return (DialogType) Enum.valueOf(DialogType.class, str);
        }

        public static DialogType[] values() {
            return (DialogType[]) $VALUES.clone();
        }
    }

    public final void storeDialogState(DialogState state, MainActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        pendingDialogState = state;
        activityReference = activity;
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public final void clearDialogState() {
        pendingDialogState = null;
        activityReference = null;
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    public final boolean hasPendingDialog() {
        return pendingDialogState != null;
    }

    private final void restorePendingDialog() {
        MainActivity mainActivity = activityReference;
        DialogState dialogState = pendingDialogState;
        if (dialogState != null) {
            if (mainActivity != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[dialogState.getDialogType().ordinal()];
                if (i == 1) {
                    Integer challengeId = dialogState.getChallengeId();
                    if (challengeId != null) {
                        ChallengePreviewNewDialogFragment.Companion.newInstance$default(ChallengePreviewNewDialogFragment.INSTANCE, Integer.valueOf(challengeId.intValue()), null, 2, null).show(mainActivity.getSupportFragmentManager(), "challengePreviewDialog");
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChallengeAcceptDialogFragment newInstance = ChallengeAcceptDialogFragment.INSTANCE.newInstance(dialogState.getMatchId(), dialogState.getUserId(), dialogState.getBetId(), dialogState.getBetName(), dialogState.getGroupName(), dialogState.getVarietyName(), dialogState.getFollowerPhoto(), dialogState.getAmount(), dialogState.getCoefficient());
                    Bundle arguments = newInstance.getArguments();
                    if (arguments != null) {
                        Integer sportId = dialogState.getSportId();
                        if (sportId != null) {
                            arguments.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, sportId.intValue());
                        }
                        Integer leagueId = dialogState.getLeagueId();
                        if (leagueId != null) {
                            arguments.putInt("leagueId", leagueId.intValue());
                        }
                    }
                    newInstance.show(mainActivity.getSupportFragmentManager(), "challengeAcceptDialog");
                }
            }
            INSTANCE.clearDialogState();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReturnToLastTab(ReturnToLastTabMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (hasPendingDialog()) {
            restorePendingDialog();
        }
    }
}
