package org.betup.model.remote.entity.matches.championship.specific;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchesForLeagueModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/matches/championship/specific/NewVarietyModel;", "", "id", "", "scoreAway", "", "scoreHome", "betsGameType", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIILjava/lang/String;)V", "getId", "()J", "getScoreAway", "()I", "getScoreHome", "getBetsGameType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewVarietyModel {
    public static final int $stable = 0;

    @SerializedName("bets_game_type")
    private final String betsGameType;

    @SerializedName("id")
    private final long id;

    @SerializedName("score_away")
    private final int scoreAway;

    @SerializedName("score_home")
    private final int scoreHome;

    public NewVarietyModel() {
        this(0L, 0, 0, null, 15, null);
    }

    public static /* synthetic */ NewVarietyModel copy$default(NewVarietyModel newVarietyModel, long j, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = newVarietyModel.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = newVarietyModel.scoreAway;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = newVarietyModel.scoreHome;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = newVarietyModel.betsGameType;
        }
        return newVarietyModel.copy(j2, i4, i5, str);
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

    public final NewVarietyModel copy(long id, int scoreAway, int scoreHome, String betsGameType) {
        Intrinsics.checkNotNullParameter(betsGameType, "betsGameType");
        return new NewVarietyModel(id, scoreAway, scoreHome, betsGameType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewVarietyModel)) {
            return false;
        }
        NewVarietyModel newVarietyModel = (NewVarietyModel) other;
        return this.id == newVarietyModel.id && this.scoreAway == newVarietyModel.scoreAway && this.scoreHome == newVarietyModel.scoreHome && Intrinsics.areEqual(this.betsGameType, newVarietyModel.betsGameType);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.scoreAway)) * 31) + Integer.hashCode(this.scoreHome)) * 31) + this.betsGameType.hashCode();
    }

    public String toString() {
        return "NewVarietyModel(id=" + this.id + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", betsGameType=" + this.betsGameType + ")";
    }

    public NewVarietyModel(long j, int i, int i2, String betsGameType) {
        Intrinsics.checkNotNullParameter(betsGameType, "betsGameType");
        this.id = j;
        this.scoreAway = i;
        this.scoreHome = i2;
        this.betsGameType = betsGameType;
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

    public /* synthetic */ NewVarietyModel(long j, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str);
    }

    public final String getBetsGameType() {
        return this.betsGameType;
    }
}
