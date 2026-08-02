package org.betup.model.remote.entity.matches;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchBetModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/matches/NewBetVarietyModel;", "", "id", "", "scoreAway", "", "scoreHome", "betsGameType", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIILjava/lang/String;)V", "getId", "()J", "getScoreAway", "()I", "getScoreHome", "getBetsGameType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewBetVarietyModel {
    public static final int $stable = 0;

    @SerializedName("bets_game_type")
    private final String betsGameType;

    @SerializedName("id")
    private final long id;

    @SerializedName("score_away")
    private final int scoreAway;

    @SerializedName("score_home")
    private final int scoreHome;

    public static /* synthetic */ NewBetVarietyModel copy$default(NewBetVarietyModel newBetVarietyModel, long j, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = newBetVarietyModel.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = newBetVarietyModel.scoreAway;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = newBetVarietyModel.scoreHome;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = newBetVarietyModel.betsGameType;
        }
        return newBetVarietyModel.copy(j2, i4, i5, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScoreHome() {
        return this.scoreHome;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBetsGameType() {
        return this.betsGameType;
    }

    public final NewBetVarietyModel copy(long id, int scoreAway, int scoreHome, String betsGameType) {
        return new NewBetVarietyModel(id, scoreAway, scoreHome, betsGameType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewBetVarietyModel)) {
            return false;
        }
        NewBetVarietyModel newBetVarietyModel = (NewBetVarietyModel) other;
        return this.id == newBetVarietyModel.id && this.scoreAway == newBetVarietyModel.scoreAway && this.scoreHome == newBetVarietyModel.scoreHome && Intrinsics.areEqual(this.betsGameType, newBetVarietyModel.betsGameType);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.scoreAway)) * 31) + Integer.hashCode(this.scoreHome)) * 31;
        String str = this.betsGameType;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NewBetVarietyModel(id=" + this.id + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", betsGameType=" + this.betsGameType + ")";
    }

    public NewBetVarietyModel(long j, int i, int i2, String str) {
        this.id = j;
        this.scoreAway = i;
        this.scoreHome = i2;
        this.betsGameType = str;
    }

    public final long getId() {
        return this.id;
    }

    public final int getScoreAway() {
        return this.scoreAway;
    }

    public final int getScoreHome() {
        return this.scoreHome;
    }

    public final String getBetsGameType() {
        return this.betsGameType;
    }
}
