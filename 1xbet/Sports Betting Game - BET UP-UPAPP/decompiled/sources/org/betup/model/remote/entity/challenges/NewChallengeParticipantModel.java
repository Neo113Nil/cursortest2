package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010/J´\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00152\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u000bHÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b+\u0010#R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b-\u0010\u001eR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/¨\u0006E"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;", "", "id", "", "name", "", "photoUrl", "rank", "rankDay", "rankMonth", "referralsCount", "", "country", "Lorg/betup/model/remote/entity/challenges/NewChallengeCountryModel;", "moneyBalance", "", "experience", "level", "expToNextLevel", "levelStartExp", "vip", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lorg/betup/model/remote/entity/challenges/NewChallengeCountryModel;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getPhotoUrl", "getRank", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRankDay", "getRankMonth", "getReferralsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCountry", "()Lorg/betup/model/remote/entity/challenges/NewChallengeCountryModel;", "getMoneyBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getExperience", "getLevel", "getExpToNextLevel", "getLevelStartExp", "getVip", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lorg/betup/model/remote/entity/challenges/NewChallengeCountryModel;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeParticipantModel {
    public static final int $stable = 0;

    @SerializedName("country")
    private final NewChallengeCountryModel country;

    @SerializedName("expToNextLevel")
    private final Long expToNextLevel;

    @SerializedName("experience")
    private final Long experience;

    @SerializedName("id")
    private final long id;

    @SerializedName("level")
    private final Integer level;

    @SerializedName("levelStartExp")
    private final Long levelStartExp;

    @SerializedName("money_balance")
    private final Double moneyBalance;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    @SerializedName("rank")
    private final Long rank;

    @SerializedName("rank_day")
    private final Long rankDay;

    @SerializedName("rank_month")
    private final Long rankMonth;

    @SerializedName("referralsCount")
    private final Integer referralsCount;

    @SerializedName("vip")
    private final Boolean vip;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getExperience() {
        return this.experience;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    /* renamed from: component12, reason: from getter */
    public final Long getExpToNextLevel() {
        return this.expToNextLevel;
    }

    /* renamed from: component13, reason: from getter */
    public final Long getLevelStartExp() {
        return this.levelStartExp;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getVip() {
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
    public final Long getRank() {
        return this.rank;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getRankDay() {
        return this.rankDay;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getRankMonth() {
        return this.rankMonth;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getReferralsCount() {
        return this.referralsCount;
    }

    /* renamed from: component8, reason: from getter */
    public final NewChallengeCountryModel getCountry() {
        return this.country;
    }

    /* renamed from: component9, reason: from getter */
    public final Double getMoneyBalance() {
        return this.moneyBalance;
    }

    public final NewChallengeParticipantModel copy(long id, String name, String photoUrl, Long rank, Long rankDay, Long rankMonth, Integer referralsCount, NewChallengeCountryModel country, Double moneyBalance, Long experience, Integer level, Long expToNextLevel, Long levelStartExp, Boolean vip) {
        return new NewChallengeParticipantModel(id, name, photoUrl, rank, rankDay, rankMonth, referralsCount, country, moneyBalance, experience, level, expToNextLevel, levelStartExp, vip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeParticipantModel)) {
            return false;
        }
        NewChallengeParticipantModel newChallengeParticipantModel = (NewChallengeParticipantModel) other;
        return this.id == newChallengeParticipantModel.id && Intrinsics.areEqual(this.name, newChallengeParticipantModel.name) && Intrinsics.areEqual(this.photoUrl, newChallengeParticipantModel.photoUrl) && Intrinsics.areEqual(this.rank, newChallengeParticipantModel.rank) && Intrinsics.areEqual(this.rankDay, newChallengeParticipantModel.rankDay) && Intrinsics.areEqual(this.rankMonth, newChallengeParticipantModel.rankMonth) && Intrinsics.areEqual(this.referralsCount, newChallengeParticipantModel.referralsCount) && Intrinsics.areEqual(this.country, newChallengeParticipantModel.country) && Intrinsics.areEqual((Object) this.moneyBalance, (Object) newChallengeParticipantModel.moneyBalance) && Intrinsics.areEqual(this.experience, newChallengeParticipantModel.experience) && Intrinsics.areEqual(this.level, newChallengeParticipantModel.level) && Intrinsics.areEqual(this.expToNextLevel, newChallengeParticipantModel.expToNextLevel) && Intrinsics.areEqual(this.levelStartExp, newChallengeParticipantModel.levelStartExp) && Intrinsics.areEqual(this.vip, newChallengeParticipantModel.vip);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.rank;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.rankDay;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.rankMonth;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.referralsCount;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        NewChallengeCountryModel newChallengeCountryModel = this.country;
        int hashCode8 = (hashCode7 + (newChallengeCountryModel == null ? 0 : newChallengeCountryModel.hashCode())) * 31;
        Double d = this.moneyBalance;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        Long l4 = this.experience;
        int hashCode10 = (hashCode9 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num2 = this.level;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.expToNextLevel;
        int hashCode12 = (hashCode11 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.levelStartExp;
        int hashCode13 = (hashCode12 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool = this.vip;
        return hashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeParticipantModel(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", rank=" + this.rank + ", rankDay=" + this.rankDay + ", rankMonth=" + this.rankMonth + ", referralsCount=" + this.referralsCount + ", country=" + this.country + ", moneyBalance=" + this.moneyBalance + ", experience=" + this.experience + ", level=" + this.level + ", expToNextLevel=" + this.expToNextLevel + ", levelStartExp=" + this.levelStartExp + ", vip=" + this.vip + ")";
    }

    public NewChallengeParticipantModel(long j, String str, String str2, Long l, Long l2, Long l3, Integer num, NewChallengeCountryModel newChallengeCountryModel, Double d, Long l4, Integer num2, Long l5, Long l6, Boolean bool) {
        this.id = j;
        this.name = str;
        this.photoUrl = str2;
        this.rank = l;
        this.rankDay = l2;
        this.rankMonth = l3;
        this.referralsCount = num;
        this.country = newChallengeCountryModel;
        this.moneyBalance = d;
        this.experience = l4;
        this.level = num2;
        this.expToNextLevel = l5;
        this.levelStartExp = l6;
        this.vip = bool;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final Long getRank() {
        return this.rank;
    }

    public final Long getRankDay() {
        return this.rankDay;
    }

    public final Long getRankMonth() {
        return this.rankMonth;
    }

    public final Integer getReferralsCount() {
        return this.referralsCount;
    }

    public final NewChallengeCountryModel getCountry() {
        return this.country;
    }

    public final Double getMoneyBalance() {
        return this.moneyBalance;
    }

    public final Long getExperience() {
        return this.experience;
    }

    public final Integer getLevel() {
        return this.level;
    }

    public final Long getExpToNextLevel() {
        return this.expToNextLevel;
    }

    public final Long getLevelStartExp() {
        return this.levelStartExp;
    }

    public final Boolean getVip() {
        return this.vip;
    }
}
