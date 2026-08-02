package org.betup.model.remote.entity.challenges;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003Jb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006+"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;", "", ClientData.KEY_CHALLENGE, "Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsModel;", "createdBy", "Lorg/betup/model/remote/entity/challenges/NewChallengeCreatorModel;", "match", "Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", "participantState", "", "participantUsers", "", "Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;", "bets", "Lorg/betup/model/remote/entity/challenges/NewChallengeBetModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsModel;Lorg/betup/model/remote/entity/challenges/NewChallengeCreatorModel;Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getChallenge", "()Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsModel;", "getCreatedBy", "()Lorg/betup/model/remote/entity/challenges/NewChallengeCreatorModel;", "getMatch", "()Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", "getParticipantState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParticipantUsers", "()Ljava/util/List;", "getBets", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsModel;Lorg/betup/model/remote/entity/challenges/NewChallengeCreatorModel;Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeDetailsResponseModelP {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<NewChallengeBetModel> bets;

    @SerializedName(ClientData.KEY_CHALLENGE)
    private final NewChallengeDetailsModel challenge;

    @SerializedName("createdBy")
    private final NewChallengeCreatorModel createdBy;

    @SerializedName("match")
    private final NewChallengeMatchModel match;

    @SerializedName("participantState")
    private final Integer participantState;

    @SerializedName("participantUsers")
    private final List<NewChallengeParticipantModel> participantUsers;

    public static /* synthetic */ NewChallengeDetailsResponseModelP copy$default(NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP, NewChallengeDetailsModel newChallengeDetailsModel, NewChallengeCreatorModel newChallengeCreatorModel, NewChallengeMatchModel newChallengeMatchModel, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            newChallengeDetailsModel = newChallengeDetailsResponseModelP.challenge;
        }
        if ((i & 2) != 0) {
            newChallengeCreatorModel = newChallengeDetailsResponseModelP.createdBy;
        }
        NewChallengeCreatorModel newChallengeCreatorModel2 = newChallengeCreatorModel;
        if ((i & 4) != 0) {
            newChallengeMatchModel = newChallengeDetailsResponseModelP.match;
        }
        NewChallengeMatchModel newChallengeMatchModel2 = newChallengeMatchModel;
        if ((i & 8) != 0) {
            num = newChallengeDetailsResponseModelP.participantState;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            list = newChallengeDetailsResponseModelP.participantUsers;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = newChallengeDetailsResponseModelP.bets;
        }
        return newChallengeDetailsResponseModelP.copy(newChallengeDetailsModel, newChallengeCreatorModel2, newChallengeMatchModel2, num2, list3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final NewChallengeDetailsModel getChallenge() {
        return this.challenge;
    }

    /* renamed from: component2, reason: from getter */
    public final NewChallengeCreatorModel getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component3, reason: from getter */
    public final NewChallengeMatchModel getMatch() {
        return this.match;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getParticipantState() {
        return this.participantState;
    }

    public final List<NewChallengeParticipantModel> component5() {
        return this.participantUsers;
    }

    public final List<NewChallengeBetModel> component6() {
        return this.bets;
    }

    public final NewChallengeDetailsResponseModelP copy(NewChallengeDetailsModel challenge, NewChallengeCreatorModel createdBy, NewChallengeMatchModel match, Integer participantState, List<NewChallengeParticipantModel> participantUsers, List<NewChallengeBetModel> bets) {
        return new NewChallengeDetailsResponseModelP(challenge, createdBy, match, participantState, participantUsers, bets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeDetailsResponseModelP)) {
            return false;
        }
        NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP = (NewChallengeDetailsResponseModelP) other;
        return Intrinsics.areEqual(this.challenge, newChallengeDetailsResponseModelP.challenge) && Intrinsics.areEqual(this.createdBy, newChallengeDetailsResponseModelP.createdBy) && Intrinsics.areEqual(this.match, newChallengeDetailsResponseModelP.match) && Intrinsics.areEqual(this.participantState, newChallengeDetailsResponseModelP.participantState) && Intrinsics.areEqual(this.participantUsers, newChallengeDetailsResponseModelP.participantUsers) && Intrinsics.areEqual(this.bets, newChallengeDetailsResponseModelP.bets);
    }

    public int hashCode() {
        NewChallengeDetailsModel newChallengeDetailsModel = this.challenge;
        int hashCode = (newChallengeDetailsModel == null ? 0 : newChallengeDetailsModel.hashCode()) * 31;
        NewChallengeCreatorModel newChallengeCreatorModel = this.createdBy;
        int hashCode2 = (hashCode + (newChallengeCreatorModel == null ? 0 : newChallengeCreatorModel.hashCode())) * 31;
        NewChallengeMatchModel newChallengeMatchModel = this.match;
        int hashCode3 = (hashCode2 + (newChallengeMatchModel == null ? 0 : newChallengeMatchModel.hashCode())) * 31;
        Integer num = this.participantState;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<NewChallengeParticipantModel> list = this.participantUsers;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<NewChallengeBetModel> list2 = this.bets;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeDetailsResponseModelP(challenge=" + this.challenge + ", createdBy=" + this.createdBy + ", match=" + this.match + ", participantState=" + this.participantState + ", participantUsers=" + this.participantUsers + ", bets=" + this.bets + ")";
    }

    public NewChallengeDetailsResponseModelP(NewChallengeDetailsModel newChallengeDetailsModel, NewChallengeCreatorModel newChallengeCreatorModel, NewChallengeMatchModel newChallengeMatchModel, Integer num, List<NewChallengeParticipantModel> list, List<NewChallengeBetModel> list2) {
        this.challenge = newChallengeDetailsModel;
        this.createdBy = newChallengeCreatorModel;
        this.match = newChallengeMatchModel;
        this.participantState = num;
        this.participantUsers = list;
        this.bets = list2;
    }

    public final NewChallengeDetailsModel getChallenge() {
        return this.challenge;
    }

    public final NewChallengeCreatorModel getCreatedBy() {
        return this.createdBy;
    }

    public final NewChallengeMatchModel getMatch() {
        return this.match;
    }

    public final Integer getParticipantState() {
        return this.participantState;
    }

    public final List<NewChallengeParticipantModel> getParticipantUsers() {
        return this.participantUsers;
    }

    public final List<NewChallengeBetModel> getBets() {
        return this.bets;
    }
}
