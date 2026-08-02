package org.betup.ui.fragment.matches.details.compose.tabs.battles.items;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleUiItem.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000fHÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/battles/items/BattleUiItem;", "", "id", "", "moneyAccept", "enterFee", "moneyToWin", "state", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", "createdBy", "Lorg/betup/ui/fragment/matches/details/compose/tabs/battles/items/BattleCreator;", "participantState", "isUserCreator", "", "participantCount", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJJJLorg/betup/model/remote/entity/challenges/ChallengeState;Lorg/betup/ui/fragment/matches/details/compose/tabs/battles/items/BattleCreator;Lorg/betup/model/remote/entity/challenges/ChallengeState;ZI)V", "getId", "()J", "getMoneyAccept", "getEnterFee", "getMoneyToWin", "getState", "()Lorg/betup/model/remote/entity/challenges/ChallengeState;", "getCreatedBy", "()Lorg/betup/ui/fragment/matches/details/compose/tabs/battles/items/BattleCreator;", "getParticipantState", "()Z", "getParticipantCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BattleUiItem {
    public static final int $stable = 0;
    private final BattleCreator createdBy;
    private final long enterFee;
    private final long id;
    private final boolean isUserCreator;
    private final long moneyAccept;
    private final long moneyToWin;
    private final int participantCount;
    private final ChallengeState participantState;
    private final ChallengeState state;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
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
    public final ChallengeState getState() {
        return this.state;
    }

    /* renamed from: component6, reason: from getter */
    public final BattleCreator getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component7, reason: from getter */
    public final ChallengeState getParticipantState() {
        return this.participantState;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsUserCreator() {
        return this.isUserCreator;
    }

    /* renamed from: component9, reason: from getter */
    public final int getParticipantCount() {
        return this.participantCount;
    }

    public final BattleUiItem copy(long id, long moneyAccept, long enterFee, long moneyToWin, ChallengeState state, BattleCreator createdBy, ChallengeState participantState, boolean isUserCreator, int participantCount) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(participantState, "participantState");
        return new BattleUiItem(id, moneyAccept, enterFee, moneyToWin, state, createdBy, participantState, isUserCreator, participantCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleUiItem)) {
            return false;
        }
        BattleUiItem battleUiItem = (BattleUiItem) other;
        return this.id == battleUiItem.id && this.moneyAccept == battleUiItem.moneyAccept && this.enterFee == battleUiItem.enterFee && this.moneyToWin == battleUiItem.moneyToWin && Intrinsics.areEqual(this.state, battleUiItem.state) && Intrinsics.areEqual(this.createdBy, battleUiItem.createdBy) && Intrinsics.areEqual(this.participantState, battleUiItem.participantState) && this.isUserCreator == battleUiItem.isUserCreator && this.participantCount == battleUiItem.participantCount;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.moneyAccept)) * 31) + Long.hashCode(this.enterFee)) * 31) + Long.hashCode(this.moneyToWin)) * 31) + this.state.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.participantState.hashCode()) * 31) + Boolean.hashCode(this.isUserCreator)) * 31) + Integer.hashCode(this.participantCount);
    }

    public String toString() {
        return "BattleUiItem(id=" + this.id + ", moneyAccept=" + this.moneyAccept + ", enterFee=" + this.enterFee + ", moneyToWin=" + this.moneyToWin + ", state=" + this.state + ", createdBy=" + this.createdBy + ", participantState=" + this.participantState + ", isUserCreator=" + this.isUserCreator + ", participantCount=" + this.participantCount + ")";
    }

    public BattleUiItem(long j, long j2, long j3, long j4, ChallengeState state, BattleCreator createdBy, ChallengeState participantState, boolean z, int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(participantState, "participantState");
        this.id = j;
        this.moneyAccept = j2;
        this.enterFee = j3;
        this.moneyToWin = j4;
        this.state = state;
        this.createdBy = createdBy;
        this.participantState = participantState;
        this.isUserCreator = z;
        this.participantCount = i;
    }

    public final long getId() {
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

    public final ChallengeState getState() {
        return this.state;
    }

    public final BattleCreator getCreatedBy() {
        return this.createdBy;
    }

    public /* synthetic */ BattleUiItem(long j, long j2, long j3, long j4, ChallengeState challengeState, BattleCreator battleCreator, ChallengeState challengeState2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, challengeState, battleCreator, (i2 & 64) != 0 ? ChallengeState.NONE.INSTANCE : challengeState2, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? 1 : i);
    }

    public final ChallengeState getParticipantState() {
        return this.participantState;
    }

    public final boolean isUserCreator() {
        return this.isUserCreator;
    }

    public final int getParticipantCount() {
        return this.participantCount;
    }
}
