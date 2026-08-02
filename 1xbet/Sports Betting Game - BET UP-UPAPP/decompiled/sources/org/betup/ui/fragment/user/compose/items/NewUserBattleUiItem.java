package org.betup.ui.fragment.user.compose.items;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleUiItem.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lorg/betup/ui/fragment/user/compose/items/NewUserBattleUiItem;", "", "id", "", "moneyAccept", "enterFee", "moneyToWin", "state", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", "participantState", "createdBy", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleCreator;", "match", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleMatch;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJJJLorg/betup/model/remote/entity/challenges/ChallengeState;Lorg/betup/model/remote/entity/challenges/ChallengeState;Lorg/betup/ui/fragment/user/compose/items/NewUserBattleCreator;Lorg/betup/ui/fragment/user/compose/items/NewUserBattleMatch;)V", "getId", "()J", "getMoneyAccept", "getEnterFee", "getMoneyToWin", "getState", "()Lorg/betup/model/remote/entity/challenges/ChallengeState;", "getParticipantState", "getCreatedBy", "()Lorg/betup/ui/fragment/user/compose/items/NewUserBattleCreator;", "getMatch", "()Lorg/betup/ui/fragment/user/compose/items/NewUserBattleMatch;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NewUserBattleUiItem {
    public static final int $stable = 0;
    private final NewUserBattleCreator createdBy;
    private final long enterFee;
    private final long id;
    private final NewUserBattleMatch match;
    private final long moneyAccept;
    private final long moneyToWin;
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
    public final ChallengeState getParticipantState() {
        return this.participantState;
    }

    /* renamed from: component7, reason: from getter */
    public final NewUserBattleCreator getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component8, reason: from getter */
    public final NewUserBattleMatch getMatch() {
        return this.match;
    }

    public final NewUserBattleUiItem copy(long id, long moneyAccept, long enterFee, long moneyToWin, ChallengeState state, ChallengeState participantState, NewUserBattleCreator createdBy, NewUserBattleMatch match) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(participantState, "participantState");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        return new NewUserBattleUiItem(id, moneyAccept, enterFee, moneyToWin, state, participantState, createdBy, match);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleUiItem)) {
            return false;
        }
        NewUserBattleUiItem newUserBattleUiItem = (NewUserBattleUiItem) other;
        return this.id == newUserBattleUiItem.id && this.moneyAccept == newUserBattleUiItem.moneyAccept && this.enterFee == newUserBattleUiItem.enterFee && this.moneyToWin == newUserBattleUiItem.moneyToWin && Intrinsics.areEqual(this.state, newUserBattleUiItem.state) && Intrinsics.areEqual(this.participantState, newUserBattleUiItem.participantState) && Intrinsics.areEqual(this.createdBy, newUserBattleUiItem.createdBy) && Intrinsics.areEqual(this.match, newUserBattleUiItem.match);
    }

    public int hashCode() {
        int hashCode = ((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.moneyAccept)) * 31) + Long.hashCode(this.enterFee)) * 31) + Long.hashCode(this.moneyToWin)) * 31) + this.state.hashCode()) * 31) + this.participantState.hashCode()) * 31) + this.createdBy.hashCode()) * 31;
        NewUserBattleMatch newUserBattleMatch = this.match;
        return hashCode + (newUserBattleMatch == null ? 0 : newUserBattleMatch.hashCode());
    }

    public String toString() {
        return "NewUserBattleUiItem(id=" + this.id + ", moneyAccept=" + this.moneyAccept + ", enterFee=" + this.enterFee + ", moneyToWin=" + this.moneyToWin + ", state=" + this.state + ", participantState=" + this.participantState + ", createdBy=" + this.createdBy + ", match=" + this.match + ")";
    }

    public NewUserBattleUiItem(long j, long j2, long j3, long j4, ChallengeState state, ChallengeState participantState, NewUserBattleCreator createdBy, NewUserBattleMatch newUserBattleMatch) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(participantState, "participantState");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        this.id = j;
        this.moneyAccept = j2;
        this.enterFee = j3;
        this.moneyToWin = j4;
        this.state = state;
        this.participantState = participantState;
        this.createdBy = createdBy;
        this.match = newUserBattleMatch;
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

    public final ChallengeState getParticipantState() {
        return this.participantState;
    }

    public final NewUserBattleCreator getCreatedBy() {
        return this.createdBy;
    }

    public final NewUserBattleMatch getMatch() {
        return this.match;
    }
}
