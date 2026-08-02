package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleModel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010!\u001a\u00020\u000bJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jq\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "", "id", "", "moneyAccept", "enterFee", "moneyToWin", "state", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", "participantState", "createdBy", "Lorg/betup/model/remote/entity/challenges/ChallengeCreator;", "participants", "", "Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantModel;", "match", "Lorg/betup/model/remote/entity/challenges/NewUserBattleMatchModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJJJLorg/betup/model/remote/entity/challenges/ChallengeState;Lorg/betup/model/remote/entity/challenges/ChallengeState;Lorg/betup/model/remote/entity/challenges/ChallengeCreator;Ljava/util/List;Lorg/betup/model/remote/entity/challenges/NewUserBattleMatchModel;)V", "getId", "()J", "getMoneyAccept", "getEnterFee", "getMoneyToWin", "getState", "()Lorg/betup/model/remote/entity/challenges/ChallengeState;", "getParticipantState", "getCreatedBy", "()Lorg/betup/model/remote/entity/challenges/ChallengeCreator;", "getParticipants", "()Ljava/util/List;", "getMatch", "()Lorg/betup/model/remote/entity/challenges/NewUserBattleMatchModel;", "getCreatorOrFromParticipants", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserBattleModel {
    public static final int $stable = 8;

    @SerializedName("createdBy")
    private final ChallengeCreator createdBy;

    @SerializedName("enterFee")
    private final long enterFee;

    @SerializedName("id")
    private final long id;

    @SerializedName("match")
    private final NewUserBattleMatchModel match;

    @SerializedName("moneyAccept")
    private final long moneyAccept;

    @SerializedName("moneyToWin")
    private final long moneyToWin;

    @SerializedName("participantState")
    @JsonAdapter(ChallengeStateDeserializer.class)
    private final ChallengeState participantState;

    @SerializedName("participants")
    private final List<NewUserBattleParticipantModel> participants;

    @SerializedName("state")
    @JsonAdapter(GlobalChallengeStateDeserializer.class)
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
    public final ChallengeCreator getCreatedBy() {
        return this.createdBy;
    }

    public final List<NewUserBattleParticipantModel> component8() {
        return this.participants;
    }

    /* renamed from: component9, reason: from getter */
    public final NewUserBattleMatchModel getMatch() {
        return this.match;
    }

    public final NewUserBattleModel copy(long id, long moneyAccept, long enterFee, long moneyToWin, ChallengeState state, ChallengeState participantState, ChallengeCreator createdBy, List<NewUserBattleParticipantModel> participants, NewUserBattleMatchModel match) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new NewUserBattleModel(id, moneyAccept, enterFee, moneyToWin, state, participantState, createdBy, participants, match);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleModel)) {
            return false;
        }
        NewUserBattleModel newUserBattleModel = (NewUserBattleModel) other;
        return this.id == newUserBattleModel.id && this.moneyAccept == newUserBattleModel.moneyAccept && this.enterFee == newUserBattleModel.enterFee && this.moneyToWin == newUserBattleModel.moneyToWin && Intrinsics.areEqual(this.state, newUserBattleModel.state) && Intrinsics.areEqual(this.participantState, newUserBattleModel.participantState) && Intrinsics.areEqual(this.createdBy, newUserBattleModel.createdBy) && Intrinsics.areEqual(this.participants, newUserBattleModel.participants) && Intrinsics.areEqual(this.match, newUserBattleModel.match);
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.moneyAccept)) * 31) + Long.hashCode(this.enterFee)) * 31) + Long.hashCode(this.moneyToWin)) * 31) + this.state.hashCode()) * 31;
        ChallengeState challengeState = this.participantState;
        int hashCode2 = (hashCode + (challengeState == null ? 0 : challengeState.hashCode())) * 31;
        ChallengeCreator challengeCreator = this.createdBy;
        int hashCode3 = (hashCode2 + (challengeCreator == null ? 0 : challengeCreator.hashCode())) * 31;
        List<NewUserBattleParticipantModel> list = this.participants;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        NewUserBattleMatchModel newUserBattleMatchModel = this.match;
        return hashCode4 + (newUserBattleMatchModel != null ? newUserBattleMatchModel.hashCode() : 0);
    }

    public String toString() {
        return "NewUserBattleModel(id=" + this.id + ", moneyAccept=" + this.moneyAccept + ", enterFee=" + this.enterFee + ", moneyToWin=" + this.moneyToWin + ", state=" + this.state + ", participantState=" + this.participantState + ", createdBy=" + this.createdBy + ", participants=" + this.participants + ", match=" + this.match + ")";
    }

    public NewUserBattleModel(long j, long j2, long j3, long j4, ChallengeState state, ChallengeState challengeState, ChallengeCreator challengeCreator, List<NewUserBattleParticipantModel> list, NewUserBattleMatchModel newUserBattleMatchModel) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j;
        this.moneyAccept = j2;
        this.enterFee = j3;
        this.moneyToWin = j4;
        this.state = state;
        this.participantState = challengeState;
        this.createdBy = challengeCreator;
        this.participants = list;
        this.match = newUserBattleMatchModel;
    }

    public /* synthetic */ NewUserBattleModel(long j, long j2, long j3, long j4, ChallengeState challengeState, ChallengeState challengeState2, ChallengeCreator challengeCreator, List list, NewUserBattleMatchModel newUserBattleMatchModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, challengeState, challengeState2, challengeCreator, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : newUserBattleMatchModel);
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

    public final ChallengeCreator getCreatedBy() {
        return this.createdBy;
    }

    public final List<NewUserBattleParticipantModel> getParticipants() {
        return this.participants;
    }

    public final NewUserBattleMatchModel getMatch() {
        return this.match;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ChallengeCreator getCreatorOrFromParticipants() {
        NewUserBattleParticipantUserModel newUserBattleParticipantUserModel;
        ChallengeCreator challengeCreator;
        String name;
        String photoUrl;
        String str;
        String photoUrl2;
        Object obj;
        List<NewUserBattleParticipantModel> list = this.participants;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((NewUserBattleParticipantModel) obj).isCreator(), (Object) true)) {
                    break;
                }
            }
            NewUserBattleParticipantModel newUserBattleParticipantModel = (NewUserBattleParticipantModel) obj;
            if (newUserBattleParticipantModel != null) {
                newUserBattleParticipantUserModel = newUserBattleParticipantModel.getUser();
                challengeCreator = this.createdBy;
                if (challengeCreator == null) {
                    challengeCreator = newUserBattleParticipantUserModel != null ? new ChallengeCreator(newUserBattleParticipantUserModel.getId(), newUserBattleParticipantUserModel.getName(), null, newUserBattleParticipantUserModel.getPhotoUrl()) : null;
                    if (challengeCreator == null) {
                        challengeCreator = new ChallengeCreator(0L, "", null, null);
                    }
                }
                long id = challengeCreator.getId();
                name = challengeCreator.getName();
                if (name != null) {
                    if (StringsKt.isBlank(name)) {
                        name = null;
                    }
                }
                name = newUserBattleParticipantUserModel == null ? newUserBattleParticipantUserModel.getName() : null;
                if (name == null) {
                    name = "";
                }
                String str2 = name;
                String email = challengeCreator.getEmail();
                photoUrl = challengeCreator.getPhotoUrl();
                if (photoUrl != null) {
                    if (StringsKt.isBlank(photoUrl)) {
                        photoUrl = null;
                    }
                    if (photoUrl != null) {
                        str = photoUrl;
                        return new ChallengeCreator(id, str2, email, str);
                    }
                }
                str = (newUserBattleParticipantUserModel != null || (photoUrl2 = newUserBattleParticipantUserModel.getPhotoUrl()) == null || StringsKt.isBlank(photoUrl2)) ? null : photoUrl2;
                return new ChallengeCreator(id, str2, email, str);
            }
        }
        newUserBattleParticipantUserModel = null;
        challengeCreator = this.createdBy;
        if (challengeCreator == null) {
        }
        long id2 = challengeCreator.getId();
        name = challengeCreator.getName();
        if (name != null) {
        }
        if (newUserBattleParticipantUserModel == null) {
        }
        if (name == null) {
        }
        String str22 = name;
        String email2 = challengeCreator.getEmail();
        photoUrl = challengeCreator.getPhotoUrl();
        if (photoUrl != null) {
        }
        if (newUserBattleParticipantUserModel != null) {
        }
        return new ChallengeCreator(id2, str22, email2, str);
    }
}
