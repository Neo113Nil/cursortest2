package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0088\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001a¨\u00065"}, d2 = {"Lorg/betup/ui/dialogs/events/OpenChallengeAcceptDialogEvent;", "", "challengeId", "", "matchId", "userId", "betId", "betName", "", "groupName", "varietyName", "coefficient", "", "amount", "prizeText", "buiIn", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;JLjava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getChallengeId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMatchId", "()J", "getUserId", "getBetId", "getBetName", "()Ljava/lang/String;", "getGroupName", "getVarietyName", "getCoefficient", "()D", "getAmount", "getPrizeText", "getBuiIn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Long;JLjava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/ui/dialogs/events/OpenChallengeAcceptDialogEvent;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpenChallengeAcceptDialogEvent {
    public static final int $stable = 0;
    private final Long amount;
    private final long betId;
    private final String betName;
    private final String buiIn;
    private final Long challengeId;
    private final double coefficient;
    private final String groupName;
    private final long matchId;
    private final String prizeText;
    private final Long userId;
    private final String varietyName;

    /* renamed from: component1, reason: from getter */
    public final Long getChallengeId() {
        return this.challengeId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPrizeText() {
        return this.prizeText;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBuiIn() {
        return this.buiIn;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBetName() {
        return this.betName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getVarietyName() {
        return this.varietyName;
    }

    /* renamed from: component8, reason: from getter */
    public final double getCoefficient() {
        return this.coefficient;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    public final OpenChallengeAcceptDialogEvent copy(Long challengeId, long matchId, Long userId, long betId, String betName, String groupName, String varietyName, double coefficient, Long amount, String prizeText, String buiIn) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        return new OpenChallengeAcceptDialogEvent(challengeId, matchId, userId, betId, betName, groupName, varietyName, coefficient, amount, prizeText, buiIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenChallengeAcceptDialogEvent)) {
            return false;
        }
        OpenChallengeAcceptDialogEvent openChallengeAcceptDialogEvent = (OpenChallengeAcceptDialogEvent) other;
        return Intrinsics.areEqual(this.challengeId, openChallengeAcceptDialogEvent.challengeId) && this.matchId == openChallengeAcceptDialogEvent.matchId && Intrinsics.areEqual(this.userId, openChallengeAcceptDialogEvent.userId) && this.betId == openChallengeAcceptDialogEvent.betId && Intrinsics.areEqual(this.betName, openChallengeAcceptDialogEvent.betName) && Intrinsics.areEqual(this.groupName, openChallengeAcceptDialogEvent.groupName) && Intrinsics.areEqual(this.varietyName, openChallengeAcceptDialogEvent.varietyName) && Double.compare(this.coefficient, openChallengeAcceptDialogEvent.coefficient) == 0 && Intrinsics.areEqual(this.amount, openChallengeAcceptDialogEvent.amount) && Intrinsics.areEqual(this.prizeText, openChallengeAcceptDialogEvent.prizeText) && Intrinsics.areEqual(this.buiIn, openChallengeAcceptDialogEvent.buiIn);
    }

    public int hashCode() {
        Long l = this.challengeId;
        int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + Long.hashCode(this.matchId)) * 31;
        Long l2 = this.userId;
        int hashCode2 = (((((((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + Long.hashCode(this.betId)) * 31) + this.betName.hashCode()) * 31) + this.groupName.hashCode()) * 31;
        String str = this.varietyName;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.coefficient)) * 31;
        Long l3 = this.amount;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.prizeText;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buiIn;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "OpenChallengeAcceptDialogEvent(challengeId=" + this.challengeId + ", matchId=" + this.matchId + ", userId=" + this.userId + ", betId=" + this.betId + ", betName=" + this.betName + ", groupName=" + this.groupName + ", varietyName=" + this.varietyName + ", coefficient=" + this.coefficient + ", amount=" + this.amount + ", prizeText=" + this.prizeText + ", buiIn=" + this.buiIn + ")";
    }

    public OpenChallengeAcceptDialogEvent(Long l, long j, Long l2, long j2, String betName, String groupName, String str, double d, Long l3, String str2, String str3) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        this.challengeId = l;
        this.matchId = j;
        this.userId = l2;
        this.betId = j2;
        this.betName = betName;
        this.groupName = groupName;
        this.varietyName = str;
        this.coefficient = d;
        this.amount = l3;
        this.prizeText = str2;
        this.buiIn = str3;
    }

    public /* synthetic */ OpenChallengeAcceptDialogEvent(Long l, long j, Long l2, long j2, String str, String str2, String str3, double d, Long l3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, j, (i & 4) != 0 ? null : l2, j2, str, str2, (i & 64) != 0 ? null : str3, d, (i & 256) != 0 ? null : l3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5);
    }

    public final Long getChallengeId() {
        return this.challengeId;
    }

    public final long getMatchId() {
        return this.matchId;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final long getBetId() {
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

    public final double getCoefficient() {
        return this.coefficient;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getPrizeText() {
        return this.prizeText;
    }

    public final String getBuiIn() {
        return this.buiIn;
    }
}
