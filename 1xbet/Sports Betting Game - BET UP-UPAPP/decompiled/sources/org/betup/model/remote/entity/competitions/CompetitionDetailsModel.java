package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.sports.NewSport;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0013HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010 R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u00068"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionDetailsModel;", "", "id", "", "name", "", "sport", "Lorg/betup/model/remote/entity/sports/NewSport;", "enterFee", "prizePool", "jackPot", "isParticipant", "", "matches", "", "Lorg/betup/model/remote/entity/competitions/CompetitionMatchModel;", "closeDate", "date", "betGroupIds", "", "backgroundUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Lorg/betup/model/remote/entity/sports/NewSport;JJJZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getSport", "()Lorg/betup/model/remote/entity/sports/NewSport;", "getEnterFee", "getPrizePool", "getJackPot", "()Z", "getMatches", "()Ljava/util/List;", "getCloseDate", "getDate", "getBetGroupIds", "getBackgroundUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionDetailsModel {
    public static final int $stable = 8;

    @SerializedName("backgroundUrl")
    private final String backgroundUrl;

    @SerializedName("betGroupIds")
    private final List<Integer> betGroupIds;

    @SerializedName("close_date")
    private final String closeDate;

    @SerializedName("date")
    private final String date;

    @SerializedName("enter_fee")
    private final long enterFee;

    @SerializedName("id")
    private final long id;

    @SerializedName("isParticipant")
    private final boolean isParticipant;

    @SerializedName("jack_pot")
    private final long jackPot;

    @SerializedName("matches")
    private final List<CompetitionMatchModel> matches;

    @SerializedName("name")
    private final String name;

    @SerializedName("prize_pool")
    private final long prizePool;

    @SerializedName("sport")
    private final NewSport sport;

    public CompetitionDetailsModel() {
        this(0L, null, null, 0L, 0L, 0L, false, null, null, null, null, null, 4095, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final List<Integer> component11() {
        return this.betGroupIds;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final NewSport getSport() {
        return this.sport;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEnterFee() {
        return this.enterFee;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPrizePool() {
        return this.prizePool;
    }

    /* renamed from: component6, reason: from getter */
    public final long getJackPot() {
        return this.jackPot;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsParticipant() {
        return this.isParticipant;
    }

    public final List<CompetitionMatchModel> component8() {
        return this.matches;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCloseDate() {
        return this.closeDate;
    }

    public final CompetitionDetailsModel copy(long id, String name, NewSport sport, long enterFee, long prizePool, long jackPot, boolean isParticipant, List<CompetitionMatchModel> matches, String closeDate, String date, List<Integer> betGroupIds, String backgroundUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(closeDate, "closeDate");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(betGroupIds, "betGroupIds");
        return new CompetitionDetailsModel(id, name, sport, enterFee, prizePool, jackPot, isParticipant, matches, closeDate, date, betGroupIds, backgroundUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionDetailsModel)) {
            return false;
        }
        CompetitionDetailsModel competitionDetailsModel = (CompetitionDetailsModel) other;
        return this.id == competitionDetailsModel.id && Intrinsics.areEqual(this.name, competitionDetailsModel.name) && Intrinsics.areEqual(this.sport, competitionDetailsModel.sport) && this.enterFee == competitionDetailsModel.enterFee && this.prizePool == competitionDetailsModel.prizePool && this.jackPot == competitionDetailsModel.jackPot && this.isParticipant == competitionDetailsModel.isParticipant && Intrinsics.areEqual(this.matches, competitionDetailsModel.matches) && Intrinsics.areEqual(this.closeDate, competitionDetailsModel.closeDate) && Intrinsics.areEqual(this.date, competitionDetailsModel.date) && Intrinsics.areEqual(this.betGroupIds, competitionDetailsModel.betGroupIds) && Intrinsics.areEqual(this.backgroundUrl, competitionDetailsModel.backgroundUrl);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31;
        NewSport newSport = this.sport;
        int hashCode2 = (((((((((((((((((hashCode + (newSport == null ? 0 : newSport.hashCode())) * 31) + Long.hashCode(this.enterFee)) * 31) + Long.hashCode(this.prizePool)) * 31) + Long.hashCode(this.jackPot)) * 31) + Boolean.hashCode(this.isParticipant)) * 31) + this.matches.hashCode()) * 31) + this.closeDate.hashCode()) * 31) + this.date.hashCode()) * 31) + this.betGroupIds.hashCode()) * 31;
        String str = this.backgroundUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CompetitionDetailsModel(id=" + this.id + ", name=" + this.name + ", sport=" + this.sport + ", enterFee=" + this.enterFee + ", prizePool=" + this.prizePool + ", jackPot=" + this.jackPot + ", isParticipant=" + this.isParticipant + ", matches=" + this.matches + ", closeDate=" + this.closeDate + ", date=" + this.date + ", betGroupIds=" + this.betGroupIds + ", backgroundUrl=" + this.backgroundUrl + ")";
    }

    public CompetitionDetailsModel(long j, String name, NewSport newSport, long j2, long j3, long j4, boolean z, List<CompetitionMatchModel> matches, String closeDate, String date, List<Integer> betGroupIds, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(closeDate, "closeDate");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(betGroupIds, "betGroupIds");
        this.id = j;
        this.name = name;
        this.sport = newSport;
        this.enterFee = j2;
        this.prizePool = j3;
        this.jackPot = j4;
        this.isParticipant = z;
        this.matches = matches;
        this.closeDate = closeDate;
        this.date = date;
        this.betGroupIds = betGroupIds;
        this.backgroundUrl = str;
    }

    public /* synthetic */ CompetitionDetailsModel(long j, String str, NewSport newSport, long j2, long j3, long j4, boolean z, List list, String str2, String str3, List list2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : newSport, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 0L : j3, (i & 32) == 0 ? j4 : 0L, (i & 64) != 0 ? false : z, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? "" : str2, (i & 512) == 0 ? str3 : "", (i & 1024) != 0 ? CollectionsKt.emptyList() : list2, (i & 2048) != 0 ? null : str4);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final NewSport getSport() {
        return this.sport;
    }

    public final long getEnterFee() {
        return this.enterFee;
    }

    public final long getPrizePool() {
        return this.prizePool;
    }

    public final long getJackPot() {
        return this.jackPot;
    }

    public final boolean isParticipant() {
        return this.isParticipant;
    }

    public final List<CompetitionMatchModel> getMatches() {
        return this.matches;
    }

    public final String getCloseDate() {
        return this.closeDate;
    }

    public final String getDate() {
        return this.date;
    }

    public final List<Integer> getBetGroupIds() {
        return this.betGroupIds;
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }
}
