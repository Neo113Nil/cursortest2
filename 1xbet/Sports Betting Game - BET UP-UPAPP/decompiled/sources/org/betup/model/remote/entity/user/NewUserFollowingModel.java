package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.country.CountryModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserFollowingModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\u0095\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00109\u001a\u00020\u00142\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006="}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserFollowingModel;", "", "id", "", "name", "", "photoUrl", "rank", "rankDay", "rankMonth", "referralsCount", "country", "Lorg/betup/model/remote/entity/country/CountryModel;", "moneyBalance", "", "experience", "level", "expToNextLevel", "levelStartExp", "vip", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;IIIILorg/betup/model/remote/entity/country/CountryModel;DIIIIZ)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPhotoUrl", "getRank", "getRankDay", "getRankMonth", "getReferralsCount", "getCountry", "()Lorg/betup/model/remote/entity/country/CountryModel;", "getMoneyBalance", "()D", "getExperience", "getLevel", "getExpToNextLevel", "getLevelStartExp", "getVip", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserFollowingModel {
    public static final int $stable = 8;

    @SerializedName("country")
    private final CountryModel country;

    @SerializedName("expToNextLevel")
    private final int expToNextLevel;

    @SerializedName("experience")
    private final int experience;

    @SerializedName("id")
    private final int id;

    @SerializedName("level")
    private final int level;

    @SerializedName("levelStartExp")
    private final int levelStartExp;

    @SerializedName("money_balance")
    private final double moneyBalance;

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
    public final int getExperience() {
        return this.experience;
    }

    /* renamed from: component11, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component12, reason: from getter */
    public final int getExpToNextLevel() {
        return this.expToNextLevel;
    }

    /* renamed from: component13, reason: from getter */
    public final int getLevelStartExp() {
        return this.levelStartExp;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getVip() {
        return this.vip;
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
    public final CountryModel getCountry() {
        return this.country;
    }

    /* renamed from: component9, reason: from getter */
    public final double getMoneyBalance() {
        return this.moneyBalance;
    }

    public final NewUserFollowingModel copy(int id, String name, String photoUrl, int rank, int rankDay, int rankMonth, int referralsCount, CountryModel country, double moneyBalance, int experience, int level, int expToNextLevel, int levelStartExp, boolean vip) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(country, "country");
        return new NewUserFollowingModel(id, name, photoUrl, rank, rankDay, rankMonth, referralsCount, country, moneyBalance, experience, level, expToNextLevel, levelStartExp, vip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserFollowingModel)) {
            return false;
        }
        NewUserFollowingModel newUserFollowingModel = (NewUserFollowingModel) other;
        return this.id == newUserFollowingModel.id && Intrinsics.areEqual(this.name, newUserFollowingModel.name) && Intrinsics.areEqual(this.photoUrl, newUserFollowingModel.photoUrl) && this.rank == newUserFollowingModel.rank && this.rankDay == newUserFollowingModel.rankDay && this.rankMonth == newUserFollowingModel.rankMonth && this.referralsCount == newUserFollowingModel.referralsCount && Intrinsics.areEqual(this.country, newUserFollowingModel.country) && Double.compare(this.moneyBalance, newUserFollowingModel.moneyBalance) == 0 && this.experience == newUserFollowingModel.experience && this.level == newUserFollowingModel.level && this.expToNextLevel == newUserFollowingModel.expToNextLevel && this.levelStartExp == newUserFollowingModel.levelStartExp && this.vip == newUserFollowingModel.vip;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.rankDay)) * 31) + Integer.hashCode(this.rankMonth)) * 31) + Integer.hashCode(this.referralsCount)) * 31) + this.country.hashCode()) * 31) + Double.hashCode(this.moneyBalance)) * 31) + Integer.hashCode(this.experience)) * 31) + Integer.hashCode(this.level)) * 31) + Integer.hashCode(this.expToNextLevel)) * 31) + Integer.hashCode(this.levelStartExp)) * 31) + Boolean.hashCode(this.vip);
    }

    public String toString() {
        return "NewUserFollowingModel(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", rank=" + this.rank + ", rankDay=" + this.rankDay + ", rankMonth=" + this.rankMonth + ", referralsCount=" + this.referralsCount + ", country=" + this.country + ", moneyBalance=" + this.moneyBalance + ", experience=" + this.experience + ", level=" + this.level + ", expToNextLevel=" + this.expToNextLevel + ", levelStartExp=" + this.levelStartExp + ", vip=" + this.vip + ")";
    }

    public NewUserFollowingModel(int i, String name, String photoUrl, int i2, int i3, int i4, int i5, CountryModel country, double d, int i6, int i7, int i8, int i9, boolean z) {
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
        this.moneyBalance = d;
        this.experience = i6;
        this.level = i7;
        this.expToNextLevel = i8;
        this.levelStartExp = i9;
        this.vip = z;
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

    public final CountryModel getCountry() {
        return this.country;
    }

    public final double getMoneyBalance() {
        return this.moneyBalance;
    }

    public final int getExperience() {
        return this.experience;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getExpToNextLevel() {
        return this.expToNextLevel;
    }

    public final int getLevelStartExp() {
        return this.levelStartExp;
    }

    public final boolean getVip() {
        return this.vip;
    }
}
