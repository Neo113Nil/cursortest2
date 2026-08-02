package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.country.NewCountryModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserRankingStatisticsModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\nHÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "", "id", "", "winningRate", "", "name", "", "photoUrl", "rank", "", "level", "country", "Lorg/betup/model/remote/entity/country/NewCountryModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JDLjava/lang/String;Ljava/lang/String;IJLorg/betup/model/remote/entity/country/NewCountryModel;)V", "getId", "()J", "getWinningRate", "()D", "getName", "()Ljava/lang/String;", "getPhotoUrl", "getRank", "()I", "getLevel", "getCountry", "()Lorg/betup/model/remote/entity/country/NewCountryModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserRankingItemModel {
    public static final int $stable = 0;

    @SerializedName("country")
    private final NewCountryModel country;

    @SerializedName("id")
    private final long id;

    @SerializedName("level")
    private final long level;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    @SerializedName("rank")
    private final int rank;

    @SerializedName("winningRate")
    private final double winningRate;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getWinningRate() {
        return this.winningRate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component6, reason: from getter */
    public final long getLevel() {
        return this.level;
    }

    /* renamed from: component7, reason: from getter */
    public final NewCountryModel getCountry() {
        return this.country;
    }

    public final NewUserRankingItemModel copy(long id, double winningRate, String name, String photoUrl, int rank, long level, NewCountryModel country) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new NewUserRankingItemModel(id, winningRate, name, photoUrl, rank, level, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserRankingItemModel)) {
            return false;
        }
        NewUserRankingItemModel newUserRankingItemModel = (NewUserRankingItemModel) other;
        return this.id == newUserRankingItemModel.id && Double.compare(this.winningRate, newUserRankingItemModel.winningRate) == 0 && Intrinsics.areEqual(this.name, newUserRankingItemModel.name) && Intrinsics.areEqual(this.photoUrl, newUserRankingItemModel.photoUrl) && this.rank == newUserRankingItemModel.rank && this.level == newUserRankingItemModel.level && Intrinsics.areEqual(this.country, newUserRankingItemModel.country);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.id) * 31) + Double.hashCode(this.winningRate)) * 31) + this.name.hashCode()) * 31;
        String str = this.photoUrl;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.rank)) * 31) + Long.hashCode(this.level)) * 31;
        NewCountryModel newCountryModel = this.country;
        return hashCode2 + (newCountryModel != null ? newCountryModel.hashCode() : 0);
    }

    public String toString() {
        return "NewUserRankingItemModel(id=" + this.id + ", winningRate=" + this.winningRate + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", rank=" + this.rank + ", level=" + this.level + ", country=" + this.country + ")";
    }

    public NewUserRankingItemModel(long j, double d, String name, String str, int i, long j2, NewCountryModel newCountryModel) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.winningRate = d;
        this.name = name;
        this.photoUrl = str;
        this.rank = i;
        this.level = j2;
        this.country = newCountryModel;
    }

    public final long getId() {
        return this.id;
    }

    public final double getWinningRate() {
        return this.winningRate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getRank() {
        return this.rank;
    }

    public final long getLevel() {
        return this.level;
    }

    public final NewCountryModel getCountry() {
        return this.country;
    }
}
