package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengeDataModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeDataModel;", "", "id", "", "moneyAccept", "", "enterFee", "moneyToWin", "state", "participantState", "createdBy", "Lorg/betup/model/remote/entity/challenges/ChallengeUser;", "match", "Lorg/betup/model/remote/entity/challenges/ChallengeMatch;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IJJJIILorg/betup/model/remote/entity/challenges/ChallengeUser;Lorg/betup/model/remote/entity/challenges/ChallengeMatch;)V", "getId", "()I", "getMoneyAccept", "()J", "getEnterFee", "getMoneyToWin", "getState", "getParticipantState", "getCreatedBy", "()Lorg/betup/model/remote/entity/challenges/ChallengeUser;", "getMatch", "()Lorg/betup/model/remote/entity/challenges/ChallengeMatch;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChallengeDataModel {
    public static final int $stable = 8;

    @SerializedName("createdBy")
    private final ChallengeUser createdBy;

    @SerializedName("enterFee")
    private final long enterFee;

    @SerializedName("id")
    private final int id;

    @SerializedName("match")
    private final ChallengeMatch match;

    @SerializedName("moneyAccept")
    private final long moneyAccept;

    @SerializedName("moneyToWin")
    private final long moneyToWin;

    @SerializedName("participantState")
    private final int participantState;

    @SerializedName("state")
    private final int state;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMoneyAccept() {
        return this.moneyAccept;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEnterFee() {
        return this.enterFee;
    }

    /* renamed from: component4, reason: from getter */
    public final long getMoneyToWin() {
        return this.moneyToWin;
    }

    /* renamed from: component5, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component6, reason: from getter */
    public final int getParticipantState() {
        return this.participantState;
    }

    /* renamed from: component7, reason: from getter */
    public final ChallengeUser getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component8, reason: from getter */
    public final ChallengeMatch getMatch() {
        return this.match;
    }

    public final ChallengeDataModel copy(int id, long moneyAccept, long enterFee, long moneyToWin, int state, int participantState, ChallengeUser createdBy, ChallengeMatch match) {
        return new ChallengeDataModel(id, moneyAccept, enterFee, moneyToWin, state, participantState, createdBy, match);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeDataModel)) {
            return false;
        }
        ChallengeDataModel challengeDataModel = (ChallengeDataModel) other;
        return this.id == challengeDataModel.id && this.moneyAccept == challengeDataModel.moneyAccept && this.enterFee == challengeDataModel.enterFee && this.moneyToWin == challengeDataModel.moneyToWin && this.state == challengeDataModel.state && this.participantState == challengeDataModel.participantState && Intrinsics.areEqual(this.createdBy, challengeDataModel.createdBy) && Intrinsics.areEqual(this.match, challengeDataModel.match);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.moneyAccept)) * 31) + Long.hashCode(this.enterFee)) * 31) + Long.hashCode(this.moneyToWin)) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.participantState)) * 31;
        ChallengeUser challengeUser = this.createdBy;
        int hashCode2 = (hashCode + (challengeUser == null ? 0 : challengeUser.hashCode())) * 31;
        ChallengeMatch challengeMatch = this.match;
        return hashCode2 + (challengeMatch != null ? challengeMatch.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeDataModel(id=" + this.id + ", moneyAccept=" + this.moneyAccept + ", enterFee=" + this.enterFee + ", moneyToWin=" + this.moneyToWin + ", state=" + this.state + ", participantState=" + this.participantState + ", createdBy=" + this.createdBy + ", match=" + this.match + ")";
    }

    public ChallengeDataModel(int i, long j, long j2, long j3, int i2, int i3, ChallengeUser challengeUser, ChallengeMatch challengeMatch) {
        this.id = i;
        this.moneyAccept = j;
        this.enterFee = j2;
        this.moneyToWin = j3;
        this.state = i2;
        this.participantState = i3;
        this.createdBy = challengeUser;
        this.match = challengeMatch;
    }

    public final int getId() {
        return this.id;
    }

    public final long getMoneyAccept() {
        return this.moneyAccept;
    }

    public final long getEnterFee() {
        return this.enterFee;
    }

    public final long getMoneyToWin() {
        return this.moneyToWin;
    }

    public final int getState() {
        return this.state;
    }

    public final int getParticipantState() {
        return this.participantState;
    }

    public final ChallengeUser getCreatedBy() {
        return this.createdBy;
    }

    public final ChallengeMatch getMatch() {
        return this.match;
    }
}
