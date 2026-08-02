package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.sports.NewMatchCount;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewTeamItem.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/teams/NewTeamItem;", "", "team", "Lorg/betup/model/remote/entity/teams/NewTeam;", "matchCount", "Lorg/betup/model/remote/entity/sports/NewMatchCount;", "isFavorite", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/teams/NewTeam;Lorg/betup/model/remote/entity/sports/NewMatchCount;Z)V", "getTeam", "()Lorg/betup/model/remote/entity/teams/NewTeam;", "getMatchCount", "()Lorg/betup/model/remote/entity/sports/NewMatchCount;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewTeamItem {
    public static final int $stable = 0;

    @SerializedName("isFavourite")
    private final boolean isFavorite;

    @SerializedName("matchCount")
    private final NewMatchCount matchCount;

    @SerializedName("team")
    private final NewTeam team;

    public NewTeamItem() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ NewTeamItem copy$default(NewTeamItem newTeamItem, NewTeam newTeam, NewMatchCount newMatchCount, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            newTeam = newTeamItem.team;
        }
        if ((i & 2) != 0) {
            newMatchCount = newTeamItem.matchCount;
        }
        if ((i & 4) != 0) {
            z = newTeamItem.isFavorite;
        }
        return newTeamItem.copy(newTeam, newMatchCount, z);
    }

    /* renamed from: component1, reason: from getter */
    public final NewTeam getTeam() {
        return this.team;
    }

    /* renamed from: component2, reason: from getter */
    public final NewMatchCount getMatchCount() {
        return this.matchCount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final NewTeamItem copy(NewTeam team, NewMatchCount matchCount, boolean isFavorite) {
        return new NewTeamItem(team, matchCount, isFavorite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewTeamItem)) {
            return false;
        }
        NewTeamItem newTeamItem = (NewTeamItem) other;
        return Intrinsics.areEqual(this.team, newTeamItem.team) && Intrinsics.areEqual(this.matchCount, newTeamItem.matchCount) && this.isFavorite == newTeamItem.isFavorite;
    }

    public int hashCode() {
        NewTeam newTeam = this.team;
        int hashCode = (newTeam == null ? 0 : newTeam.hashCode()) * 31;
        NewMatchCount newMatchCount = this.matchCount;
        return ((hashCode + (newMatchCount != null ? newMatchCount.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFavorite);
    }

    public String toString() {
        return "NewTeamItem(team=" + this.team + ", matchCount=" + this.matchCount + ", isFavorite=" + this.isFavorite + ")";
    }

    public NewTeamItem(NewTeam newTeam, NewMatchCount newMatchCount, boolean z) {
        this.team = newTeam;
        this.matchCount = newMatchCount;
        this.isFavorite = z;
    }

    public /* synthetic */ NewTeamItem(NewTeam newTeam, NewMatchCount newMatchCount, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : newTeam, (i & 2) != 0 ? null : newMatchCount, (i & 4) != 0 ? false : z);
    }

    public final NewTeam getTeam() {
        return this.team;
    }

    public final NewMatchCount getMatchCount() {
        return this.matchCount;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }
}
