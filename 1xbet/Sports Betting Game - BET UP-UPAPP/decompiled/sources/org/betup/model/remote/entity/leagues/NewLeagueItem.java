package org.betup.model.remote.entity.leagues;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.sports.NewMatchCount;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewLeagueItem.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/leagues/NewLeagueItem;", "", "league", "Lorg/betup/model/remote/entity/leagues/NewLeague;", "matchCount", "Lorg/betup/model/remote/entity/sports/NewMatchCount;", "isFavorite", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/leagues/NewLeague;Lorg/betup/model/remote/entity/sports/NewMatchCount;Z)V", "getLeague", "()Lorg/betup/model/remote/entity/leagues/NewLeague;", "getMatchCount", "()Lorg/betup/model/remote/entity/sports/NewMatchCount;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewLeagueItem {
    public static final int $stable = 0;

    @SerializedName("isFavourite")
    private final boolean isFavorite;

    @SerializedName("league")
    private final NewLeague league;

    @SerializedName("matchCount")
    private final NewMatchCount matchCount;

    public NewLeagueItem() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ NewLeagueItem copy$default(NewLeagueItem newLeagueItem, NewLeague newLeague, NewMatchCount newMatchCount, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            newLeague = newLeagueItem.league;
        }
        if ((i & 2) != 0) {
            newMatchCount = newLeagueItem.matchCount;
        }
        if ((i & 4) != 0) {
            z = newLeagueItem.isFavorite;
        }
        return newLeagueItem.copy(newLeague, newMatchCount, z);
    }

    /* renamed from: component1, reason: from getter */
    public final NewLeague getLeague() {
        return this.league;
    }

    /* renamed from: component2, reason: from getter */
    public final NewMatchCount getMatchCount() {
        return this.matchCount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final NewLeagueItem copy(NewLeague league, NewMatchCount matchCount, boolean isFavorite) {
        return new NewLeagueItem(league, matchCount, isFavorite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewLeagueItem)) {
            return false;
        }
        NewLeagueItem newLeagueItem = (NewLeagueItem) other;
        return Intrinsics.areEqual(this.league, newLeagueItem.league) && Intrinsics.areEqual(this.matchCount, newLeagueItem.matchCount) && this.isFavorite == newLeagueItem.isFavorite;
    }

    public int hashCode() {
        NewLeague newLeague = this.league;
        int hashCode = (newLeague == null ? 0 : newLeague.hashCode()) * 31;
        NewMatchCount newMatchCount = this.matchCount;
        return ((hashCode + (newMatchCount != null ? newMatchCount.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFavorite);
    }

    public String toString() {
        return "NewLeagueItem(league=" + this.league + ", matchCount=" + this.matchCount + ", isFavorite=" + this.isFavorite + ")";
    }

    public NewLeagueItem(NewLeague newLeague, NewMatchCount newMatchCount, boolean z) {
        this.league = newLeague;
        this.matchCount = newMatchCount;
        this.isFavorite = z;
    }

    public /* synthetic */ NewLeagueItem(NewLeague newLeague, NewMatchCount newMatchCount, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : newLeague, (i & 2) != 0 ? null : newMatchCount, (i & 4) != 0 ? false : z);
    }

    public final NewLeague getLeague() {
        return this.league;
    }

    public final NewMatchCount getMatchCount() {
        return this.matchCount;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }
}
