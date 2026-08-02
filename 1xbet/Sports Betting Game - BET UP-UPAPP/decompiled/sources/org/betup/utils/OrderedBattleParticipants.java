package org.betup.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.challenges.NewChallengeBetModel;
import org.betup.model.remote.entity.challenges.NewChallengeParticipantModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleParticipantOrder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006$"}, d2 = {"Lorg/betup/utils/OrderedBattleParticipants;", "", "leftUser", "Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;", "rightUser", "leftBet", "Lorg/betup/model/remote/entity/challenges/NewChallengeBetModel;", "rightBet", "leftHighlight", "Lorg/betup/utils/BattleBetHighlightStyle;", "rightHighlight", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;Lorg/betup/model/remote/entity/challenges/NewChallengeBetModel;Lorg/betup/model/remote/entity/challenges/NewChallengeBetModel;Lorg/betup/utils/BattleBetHighlightStyle;Lorg/betup/utils/BattleBetHighlightStyle;)V", "getLeftUser", "()Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;", "getRightUser", "getLeftBet", "()Lorg/betup/model/remote/entity/challenges/NewChallengeBetModel;", "getRightBet", "getLeftHighlight", "()Lorg/betup/utils/BattleBetHighlightStyle;", "getRightHighlight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderedBattleParticipants {
    public static final int $stable = 0;
    private final NewChallengeBetModel leftBet;
    private final BattleBetHighlightStyle leftHighlight;
    private final NewChallengeParticipantModel leftUser;
    private final NewChallengeBetModel rightBet;
    private final BattleBetHighlightStyle rightHighlight;
    private final NewChallengeParticipantModel rightUser;

    public static /* synthetic */ OrderedBattleParticipants copy$default(OrderedBattleParticipants orderedBattleParticipants, NewChallengeParticipantModel newChallengeParticipantModel, NewChallengeParticipantModel newChallengeParticipantModel2, NewChallengeBetModel newChallengeBetModel, NewChallengeBetModel newChallengeBetModel2, BattleBetHighlightStyle battleBetHighlightStyle, BattleBetHighlightStyle battleBetHighlightStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            newChallengeParticipantModel = orderedBattleParticipants.leftUser;
        }
        if ((i & 2) != 0) {
            newChallengeParticipantModel2 = orderedBattleParticipants.rightUser;
        }
        NewChallengeParticipantModel newChallengeParticipantModel3 = newChallengeParticipantModel2;
        if ((i & 4) != 0) {
            newChallengeBetModel = orderedBattleParticipants.leftBet;
        }
        NewChallengeBetModel newChallengeBetModel3 = newChallengeBetModel;
        if ((i & 8) != 0) {
            newChallengeBetModel2 = orderedBattleParticipants.rightBet;
        }
        NewChallengeBetModel newChallengeBetModel4 = newChallengeBetModel2;
        if ((i & 16) != 0) {
            battleBetHighlightStyle = orderedBattleParticipants.leftHighlight;
        }
        BattleBetHighlightStyle battleBetHighlightStyle3 = battleBetHighlightStyle;
        if ((i & 32) != 0) {
            battleBetHighlightStyle2 = orderedBattleParticipants.rightHighlight;
        }
        return orderedBattleParticipants.copy(newChallengeParticipantModel, newChallengeParticipantModel3, newChallengeBetModel3, newChallengeBetModel4, battleBetHighlightStyle3, battleBetHighlightStyle2);
    }

    /* renamed from: component1, reason: from getter */
    public final NewChallengeParticipantModel getLeftUser() {
        return this.leftUser;
    }

    /* renamed from: component2, reason: from getter */
    public final NewChallengeParticipantModel getRightUser() {
        return this.rightUser;
    }

    /* renamed from: component3, reason: from getter */
    public final NewChallengeBetModel getLeftBet() {
        return this.leftBet;
    }

    /* renamed from: component4, reason: from getter */
    public final NewChallengeBetModel getRightBet() {
        return this.rightBet;
    }

    /* renamed from: component5, reason: from getter */
    public final BattleBetHighlightStyle getLeftHighlight() {
        return this.leftHighlight;
    }

    /* renamed from: component6, reason: from getter */
    public final BattleBetHighlightStyle getRightHighlight() {
        return this.rightHighlight;
    }

    public final OrderedBattleParticipants copy(NewChallengeParticipantModel leftUser, NewChallengeParticipantModel rightUser, NewChallengeBetModel leftBet, NewChallengeBetModel rightBet, BattleBetHighlightStyle leftHighlight, BattleBetHighlightStyle rightHighlight) {
        Intrinsics.checkNotNullParameter(leftUser, "leftUser");
        Intrinsics.checkNotNullParameter(rightUser, "rightUser");
        Intrinsics.checkNotNullParameter(leftHighlight, "leftHighlight");
        Intrinsics.checkNotNullParameter(rightHighlight, "rightHighlight");
        return new OrderedBattleParticipants(leftUser, rightUser, leftBet, rightBet, leftHighlight, rightHighlight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderedBattleParticipants)) {
            return false;
        }
        OrderedBattleParticipants orderedBattleParticipants = (OrderedBattleParticipants) other;
        return Intrinsics.areEqual(this.leftUser, orderedBattleParticipants.leftUser) && Intrinsics.areEqual(this.rightUser, orderedBattleParticipants.rightUser) && Intrinsics.areEqual(this.leftBet, orderedBattleParticipants.leftBet) && Intrinsics.areEqual(this.rightBet, orderedBattleParticipants.rightBet) && this.leftHighlight == orderedBattleParticipants.leftHighlight && this.rightHighlight == orderedBattleParticipants.rightHighlight;
    }

    public int hashCode() {
        int hashCode = ((this.leftUser.hashCode() * 31) + this.rightUser.hashCode()) * 31;
        NewChallengeBetModel newChallengeBetModel = this.leftBet;
        int hashCode2 = (hashCode + (newChallengeBetModel == null ? 0 : newChallengeBetModel.hashCode())) * 31;
        NewChallengeBetModel newChallengeBetModel2 = this.rightBet;
        return ((((hashCode2 + (newChallengeBetModel2 != null ? newChallengeBetModel2.hashCode() : 0)) * 31) + this.leftHighlight.hashCode()) * 31) + this.rightHighlight.hashCode();
    }

    public String toString() {
        return "OrderedBattleParticipants(leftUser=" + this.leftUser + ", rightUser=" + this.rightUser + ", leftBet=" + this.leftBet + ", rightBet=" + this.rightBet + ", leftHighlight=" + this.leftHighlight + ", rightHighlight=" + this.rightHighlight + ")";
    }

    public OrderedBattleParticipants(NewChallengeParticipantModel leftUser, NewChallengeParticipantModel rightUser, NewChallengeBetModel newChallengeBetModel, NewChallengeBetModel newChallengeBetModel2, BattleBetHighlightStyle leftHighlight, BattleBetHighlightStyle rightHighlight) {
        Intrinsics.checkNotNullParameter(leftUser, "leftUser");
        Intrinsics.checkNotNullParameter(rightUser, "rightUser");
        Intrinsics.checkNotNullParameter(leftHighlight, "leftHighlight");
        Intrinsics.checkNotNullParameter(rightHighlight, "rightHighlight");
        this.leftUser = leftUser;
        this.rightUser = rightUser;
        this.leftBet = newChallengeBetModel;
        this.rightBet = newChallengeBetModel2;
        this.leftHighlight = leftHighlight;
        this.rightHighlight = rightHighlight;
    }

    public final NewChallengeParticipantModel getLeftUser() {
        return this.leftUser;
    }

    public final NewChallengeParticipantModel getRightUser() {
        return this.rightUser;
    }

    public final NewChallengeBetModel getLeftBet() {
        return this.leftBet;
    }

    public final NewChallengeBetModel getRightBet() {
        return this.rightBet;
    }

    public final BattleBetHighlightStyle getLeftHighlight() {
        return this.leftHighlight;
    }

    public final BattleBetHighlightStyle getRightHighlight() {
        return this.rightHighlight;
    }
}
