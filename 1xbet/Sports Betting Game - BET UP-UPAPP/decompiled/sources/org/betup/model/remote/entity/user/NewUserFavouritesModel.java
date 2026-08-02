package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.championship.specific.NewTeamModel;
import org.betup.model.remote.entity.sports.NewSport;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserFavouritesModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;", "", "favouriteSports", "", "Lorg/betup/model/remote/entity/sports/NewSport;", "favouriteLeagues", "Lorg/betup/model/remote/entity/user/NewLeagueSimple;", "favouriteTeams", "Lorg/betup/model/remote/entity/matches/championship/specific/NewTeamModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFavouriteSports", "()Ljava/util/List;", "getFavouriteLeagues", "getFavouriteTeams", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserFavouritesModel {
    public static final int $stable = 8;

    @SerializedName("favourite_leagues")
    private final List<NewLeagueSimple> favouriteLeagues;

    @SerializedName("favourite_sports")
    private final List<NewSport> favouriteSports;

    @SerializedName("favourite_teams")
    private final List<NewTeamModel> favouriteTeams;

    public NewUserFavouritesModel() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewUserFavouritesModel copy$default(NewUserFavouritesModel newUserFavouritesModel, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newUserFavouritesModel.favouriteSports;
        }
        if ((i & 2) != 0) {
            list2 = newUserFavouritesModel.favouriteLeagues;
        }
        if ((i & 4) != 0) {
            list3 = newUserFavouritesModel.favouriteTeams;
        }
        return newUserFavouritesModel.copy(list, list2, list3);
    }

    public final List<NewSport> component1() {
        return this.favouriteSports;
    }

    public final List<NewLeagueSimple> component2() {
        return this.favouriteLeagues;
    }

    public final List<NewTeamModel> component3() {
        return this.favouriteTeams;
    }

    public final NewUserFavouritesModel copy(List<NewSport> favouriteSports, List<NewLeagueSimple> favouriteLeagues, List<NewTeamModel> favouriteTeams) {
        Intrinsics.checkNotNullParameter(favouriteSports, "favouriteSports");
        Intrinsics.checkNotNullParameter(favouriteLeagues, "favouriteLeagues");
        Intrinsics.checkNotNullParameter(favouriteTeams, "favouriteTeams");
        return new NewUserFavouritesModel(favouriteSports, favouriteLeagues, favouriteTeams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserFavouritesModel)) {
            return false;
        }
        NewUserFavouritesModel newUserFavouritesModel = (NewUserFavouritesModel) other;
        return Intrinsics.areEqual(this.favouriteSports, newUserFavouritesModel.favouriteSports) && Intrinsics.areEqual(this.favouriteLeagues, newUserFavouritesModel.favouriteLeagues) && Intrinsics.areEqual(this.favouriteTeams, newUserFavouritesModel.favouriteTeams);
    }

    public int hashCode() {
        return (((this.favouriteSports.hashCode() * 31) + this.favouriteLeagues.hashCode()) * 31) + this.favouriteTeams.hashCode();
    }

    public String toString() {
        return "NewUserFavouritesModel(favouriteSports=" + this.favouriteSports + ", favouriteLeagues=" + this.favouriteLeagues + ", favouriteTeams=" + this.favouriteTeams + ")";
    }

    public NewUserFavouritesModel(List<NewSport> favouriteSports, List<NewLeagueSimple> favouriteLeagues, List<NewTeamModel> favouriteTeams) {
        Intrinsics.checkNotNullParameter(favouriteSports, "favouriteSports");
        Intrinsics.checkNotNullParameter(favouriteLeagues, "favouriteLeagues");
        Intrinsics.checkNotNullParameter(favouriteTeams, "favouriteTeams");
        this.favouriteSports = favouriteSports;
        this.favouriteLeagues = favouriteLeagues;
        this.favouriteTeams = favouriteTeams;
    }

    public final List<NewSport> getFavouriteSports() {
        return this.favouriteSports;
    }

    public /* synthetic */ NewUserFavouritesModel(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3);
    }

    public final List<NewLeagueSimple> getFavouriteLeagues() {
        return this.favouriteLeagues;
    }

    public final List<NewTeamModel> getFavouriteTeams() {
        return this.favouriteTeams;
    }
}
