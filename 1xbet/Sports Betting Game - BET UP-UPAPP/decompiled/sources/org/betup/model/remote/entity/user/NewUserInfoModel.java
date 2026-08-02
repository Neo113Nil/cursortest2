package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.country.NewCountryModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserInfoModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u0014HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J¦\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,¨\u0006C"}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserInfoModel;", "", "id", "", "name", "", "photoUrl", "rank", "rankDay", "rankMonth", "referralsCount", "country", "Lorg/betup/model/remote/entity/country/NewCountryModel;", "moneyBalance", "", "experience", "level", "expToNextLevel", "levelStartExp", "vip", "", "following", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;IIIILorg/betup/model/remote/entity/country/NewCountryModel;JJIJJZLjava/lang/Integer;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPhotoUrl", "getRank", "getRankDay", "getRankMonth", "getReferralsCount", "getCountry", "()Lorg/betup/model/remote/entity/country/NewCountryModel;", "getMoneyBalance", "()J", "getExperience", "getLevel", "getExpToNextLevel", "getLevelStartExp", "getVip", "()Z", "getFollowing", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(ILjava/lang/String;Ljava/lang/String;IIIILorg/betup/model/remote/entity/country/NewCountryModel;JJIJJZLjava/lang/Integer;)Lorg/betup/model/remote/entity/user/NewUserInfoModel;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserInfoModel {
    public static final int $stable = 0;

    @SerializedName("country")
    private final NewCountryModel country;

    @SerializedName("expToNextLevel")
    private final long expToNextLevel;

    @SerializedName("experience")
    private final long experience;

    @SerializedName("following")
    private final Integer following;

    @SerializedName("id")
    private final int id;

    @SerializedName("level")
    private final int level;

    @SerializedName("levelStartExp")
    private final long levelStartExp;

    @SerializedName("money_balance")
    private final long moneyBalance;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    @SerializedName("rank")
    private final int rank;

    @SerializedName("rank_day")
    private final int rankDay;

    @SerializedName("rank_month")
    private final int rankMonth;

    @SerializedName("referralsCount")
    private final int referralsCount;

    @SerializedName("vip")
    private final boolean vip;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getExperience() {
        return this.experience;
    }

    /* renamed from: component11, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component12, reason: from getter */
    public final long getExpToNextLevel() {
        return this.expToNextLevel;
    }

    /* renamed from: component13, reason: from getter */
    public final long getLevelStartExp() {
        return this.levelStartExp;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getVip() {
        return this.vip;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getFollowing() {
        return this.following;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRankDay() {
        return this.rankDay;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRankMonth() {
        return this.rankMonth;
    }

    /* renamed from: component7, reason: from getter */
    public final int getReferralsCount() {
        return this.referralsCount;
    }

    /* renamed from: component8, reason: from getter */
    public final NewCountryModel getCountry() {
        return this.country;
    }

    /* renamed from: component9, reason: from getter */
    public final long getMoneyBalance() {
        return this.moneyBalance;
    }

    public final NewUserInfoModel copy(int id, String name, String photoUrl, int rank, int rankDay, int rankMonth, int referralsCount, NewCountryModel country, long moneyBalance, long experience, int level, long expToNextLevel, long levelStartExp, boolean vip, Integer following) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(country, "country");
        return new NewUserInfoModel(id, name, photoUrl, rank, rankDay, rankMonth, referralsCount, country, moneyBalance, experience, level, expToNextLevel, levelStartExp, vip, following);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserInfoModel)) {
            return false;
        }
        NewUserInfoModel newUserInfoModel = (NewUserInfoModel) other;
        return this.id == newUserInfoModel.id && Intrinsics.areEqual(this.name, newUserInfoModel.name) && Intrinsics.areEqual(this.photoUrl, newUserInfoModel.photoUrl) && this.rank == newUserInfoModel.rank && this.rankDay == newUserInfoModel.rankDay && this.rankMonth == newUserInfoModel.rankMonth && this.referralsCount == newUserInfoModel.referralsCount && Intrinsics.areEqual(this.country, newUserInfoModel.country) && this.moneyBalance == newUserInfoModel.moneyBalance && this.experience == newUserInfoModel.experience && this.level == newUserInfoModel.level && this.expToNextLevel == newUserInfoModel.expToNextLevel && this.levelStartExp == newUserInfoModel.levelStartExp && this.vip == newUserInfoModel.vip && Intrinsics.areEqual(this.following, newUserInfoModel.following);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.rankDay)) * 31) + Integer.hashCode(this.rankMonth)) * 31) + Integer.hashCode(this.referralsCount)) * 31) + this.country.hashCode()) * 31) + Long.hashCode(this.moneyBalance)) * 31) + Long.hashCode(this.experience)) * 31) + Integer.hashCode(this.level)) * 31) + Long.hashCode(this.expToNextLevel)) * 31) + Long.hashCode(this.levelStartExp)) * 31) + Boolean.hashCode(this.vip)) * 31;
        Integer num = this.following;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "NewUserInfoModel(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", rank=" + this.rank + ", rankDay=" + this.rankDay + ", rankMonth=" + this.rankMonth + ", referralsCount=" + this.referralsCount + ", country=" + this.country + ", moneyBalance=" + this.moneyBalance + ", experience=" + this.experience + ", level=" + this.level + ", expToNextLevel=" + this.expToNextLevel + ", levelStartExp=" + this.levelStartExp + ", vip=" + this.vip + ", following=" + this.following + ")";
    }

    public NewUserInfoModel(int i, String name, String photoUrl, int i2, int i3, int i4, int i5, NewCountryModel country, long j, long j2, int i6, long j3, long j4, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(country, "country");
        this.id = i;
        this.name = name;
        this.photoUrl = photoUrl;
        this.rank = i2;
        this.rankDay = i3;
        this.rankMonth = i4;
        this.referralsCount = i5;
        this.country = country;
        this.moneyBalance = j;
        this.experience = j2;
        this.level = i6;
        this.expToNextLevel = j3;
        this.levelStartExp = j4;
        this.vip = z;
        this.following = num;
    }

    public /* synthetic */ NewUserInfoModel(int i, String str, String str2, int i2, int i3, int i4, int i5, NewCountryModel newCountryModel, long j, long j2, int i6, long j3, long j4, boolean z, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, i3, i4, i5, newCountryModel, j, j2, i6, j3, j4, z, (i7 & 16384) != 0 ? null : num);
    }

    public final int getId() {
        return this.id;
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

    public final int getRankDay() {
        return this.rankDay;
    }

    public final int getRankMonth() {
        return this.rankMonth;
    }

    public final int getReferralsCount() {
        return this.referralsCount;
    }

    public final NewCountryModel getCountry() {
        return this.country;
    }

    public final long getMoneyBalance() {
        return this.moneyBalance;
    }

    public final long getExperience() {
        return this.experience;
    }

    public final int getLevel() {
        return this.level;
    }

    public final long getExpToNextLevel() {
        return this.expToNextLevel;
    }

    public final long getLevelStartExp() {
        return this.levelStartExp;
    }

    public final boolean getVip() {
        return this.vip;
    }

    public final Integer getFollowing() {
        return this.following;
    }
}
